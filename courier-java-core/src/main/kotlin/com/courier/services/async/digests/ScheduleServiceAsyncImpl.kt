// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.digests

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.checkRequired
import com.courier.core.handlers.emptyHandler
import com.courier.core.handlers.errorBodyHandler
import com.courier.core.handlers.errorHandler
import com.courier.core.handlers.jsonHandler
import com.courier.core.http.HttpMethod
import com.courier.core.http.HttpRequest
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponse.Handler
import com.courier.core.http.HttpResponseFor
import com.courier.core.http.json
import com.courier.core.http.parseable
import com.courier.core.prepareAsync
import com.courier.models.digests.DigestInstanceListResponse
import com.courier.models.digests.schedules.ScheduleListInstancesParams
import com.courier.models.digests.schedules.ScheduleReleaseParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScheduleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduleServiceAsync {

    private val withRawResponse: ScheduleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleServiceAsync =
        ScheduleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listInstances(
        params: ScheduleListInstancesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigestInstanceListResponse> =
        // get /digests/schedules/{schedule_id}/instances
        withRawResponse().listInstances(params, requestOptions).thenApply { it.parse() }

    override fun release(
        params: ScheduleReleaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /digests/schedules/{schedule_id}/trigger
        withRawResponse().release(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduleServiceAsync.WithRawResponse =
            ScheduleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listInstancesHandler: Handler<DigestInstanceListResponse> =
            jsonHandler<DigestInstanceListResponse>(clientOptions.jsonMapper)

        override fun listInstances(
            params: ScheduleListInstancesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scheduleId", params.scheduleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digests", "schedules", params._pathParam(0), "instances")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listInstancesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val releaseHandler: Handler<Void?> = emptyHandler()

        override fun release(
            params: ScheduleReleaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scheduleId", params.scheduleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digests", "schedules", params._pathParam(0), "trigger")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { releaseHandler.handle(it) }
                    }
                }
        }
    }
}
