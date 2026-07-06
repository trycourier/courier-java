// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.models.journeys.CancelJourneyResponse
import com.courier.models.journeys.JourneyArchiveParams
import com.courier.models.journeys.JourneyCancelParams
import com.courier.models.journeys.JourneyCreateParams
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneyListVersionsParams
import com.courier.models.journeys.JourneyPublishParams
import com.courier.models.journeys.JourneyReplaceParams
import com.courier.models.journeys.JourneyResponse
import com.courier.models.journeys.JourneyRetrieveParams
import com.courier.models.journeys.JourneyVersionsListResponse
import com.courier.models.journeys.JourneysInvokeResponse
import com.courier.models.journeys.JourneysListResponse
import com.courier.services.async.journeys.TemplateServiceAsync
import com.courier.services.async.journeys.TemplateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JourneyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JourneyServiceAsync {

    private val withRawResponse: JourneyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val templates: TemplateServiceAsync by lazy { TemplateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): JourneyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyServiceAsync =
        JourneyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun templates(): TemplateServiceAsync = templates

    override fun create(
        params: JourneyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyResponse> =
        // post /journeys
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: JourneyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyResponse> =
        // get /journeys/{templateId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: JourneyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneysListResponse> =
        // get /journeys
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: JourneyArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /journeys/{templateId}
        withRawResponse().archive(params, requestOptions).thenAccept {}

    override fun cancel(
        params: JourneyCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CancelJourneyResponse> =
        // post /journeys/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneysInvokeResponse> =
        // post /journeys/{templateId}/invoke
        withRawResponse().invoke(params, requestOptions).thenApply { it.parse() }

    override fun listVersions(
        params: JourneyListVersionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyVersionsListResponse> =
        // get /journeys/{templateId}/versions
        withRawResponse().listVersions(params, requestOptions).thenApply { it.parse() }

    override fun publish(
        params: JourneyPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyResponse> =
        // post /journeys/{templateId}/publish
        withRawResponse().publish(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: JourneyReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyResponse> =
        // put /journeys/{templateId}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JourneyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val templates: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JourneyServiceAsync.WithRawResponse =
            JourneyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun templates(): TemplateServiceAsync.WithRawResponse = templates

        private val createHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun create(
            params: JourneyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys")
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

        private val retrieveHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: JourneyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0))
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

        private val listHandler: Handler<JourneysListResponse> =
            jsonHandler<JourneysListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: JourneyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys")
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

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override fun archive(
            params: JourneyArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { archiveHandler.handle(it) }
                    }
                }
        }

        private val cancelHandler: Handler<CancelJourneyResponse> =
            jsonHandler<CancelJourneyResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: JourneyCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val invokeHandler: Handler<JourneysInvokeResponse> =
            jsonHandler<JourneysInvokeResponse>(clientOptions.jsonMapper)

        override fun invoke(
            params: JourneyInvokeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { invokeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listVersionsHandler: Handler<JourneyVersionsListResponse> =
            jsonHandler<JourneyVersionsListResponse>(clientOptions.jsonMapper)

        override fun listVersions(
            params: JourneyListVersionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "versions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listVersionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val publishHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: JourneyPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "publish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { publishHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: JourneyReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceHandler.handle(it) }
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
