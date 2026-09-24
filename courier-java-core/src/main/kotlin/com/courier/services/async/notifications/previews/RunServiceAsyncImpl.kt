// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications.previews

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.checkRequired
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
import com.courier.models.notifications.previews.runs.PreviewRun
import com.courier.models.notifications.previews.runs.PreviewRunDetail
import com.courier.models.notifications.previews.runs.PreviewRunListResponse
import com.courier.models.notifications.previews.runs.RunCreateParams
import com.courier.models.notifications.previews.runs.RunListParams
import com.courier.models.notifications.previews.runs.RunRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Render a template's email content on real email clients and read back the screenshots, so you can
 * check how it looks before you send it.
 */
class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreviewRun> =
        // post /notifications/{id}/previews/runs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreviewRunDetail> =
        // get /notifications/{id}/previews/runs/{previewRunId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RunListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreviewRunListResponse> =
        // get /notifications/{id}/previews/runs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PreviewRun> =
            jsonHandler<PreviewRun>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreviewRun>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "previews", "runs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<PreviewRunDetail> =
            jsonHandler<PreviewRunDetail>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreviewRunDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("previewRunId", params.previewRunId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "notifications",
                        params._pathParam(0),
                        "previews",
                        "runs",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PreviewRunListResponse> =
            jsonHandler<PreviewRunListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RunListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreviewRunListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "previews", "runs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
