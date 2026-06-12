// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.digests

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
import com.courier.core.prepare
import com.courier.models.digests.DigestInstanceListResponse
import com.courier.models.digests.schedules.ScheduleListInstancesParams
import com.courier.models.digests.schedules.ScheduleReleaseParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScheduleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduleService {

    private val withRawResponse: ScheduleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleService =
        ScheduleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listInstances(
        params: ScheduleListInstancesParams,
        requestOptions: RequestOptions,
    ): DigestInstanceListResponse =
        // get /digests/schedules/{schedule_id}/instances
        withRawResponse().listInstances(params, requestOptions).parse()

    override fun release(params: ScheduleReleaseParams, requestOptions: RequestOptions) {
        // post /digests/schedules/{schedule_id}/trigger
        withRawResponse().release(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduleService.WithRawResponse =
            ScheduleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listInstancesHandler: Handler<DigestInstanceListResponse> =
            jsonHandler<DigestInstanceListResponse>(clientOptions.jsonMapper)

        override fun listInstances(
            params: ScheduleListInstancesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigestInstanceListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scheduleId", params.scheduleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digests", "schedules", params._pathParam(0), "instances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInstancesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val releaseHandler: Handler<Void?> = emptyHandler()

        override fun release(
            params: ScheduleReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { releaseHandler.handle(it) }
            }
        }
    }
}
