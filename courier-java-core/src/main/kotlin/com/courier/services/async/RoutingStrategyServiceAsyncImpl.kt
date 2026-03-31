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
import com.courier.models.routingstrategies.RoutingStrategyArchiveParams
import com.courier.models.routingstrategies.RoutingStrategyCreateParams
import com.courier.models.routingstrategies.RoutingStrategyGetResponse
import com.courier.models.routingstrategies.RoutingStrategyListParams
import com.courier.models.routingstrategies.RoutingStrategyListResponse
import com.courier.models.routingstrategies.RoutingStrategyMutationResponse
import com.courier.models.routingstrategies.RoutingStrategyReplaceParams
import com.courier.models.routingstrategies.RoutingStrategyRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoutingStrategyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RoutingStrategyServiceAsync {

    private val withRawResponse: RoutingStrategyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoutingStrategyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RoutingStrategyServiceAsync =
        RoutingStrategyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RoutingStrategyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingStrategyMutationResponse> =
        // post /routing-strategies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RoutingStrategyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingStrategyGetResponse> =
        // get /routing-strategies/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RoutingStrategyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingStrategyListResponse> =
        // get /routing-strategies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: RoutingStrategyArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /routing-strategies/{id}
        withRawResponse().archive(params, requestOptions).thenAccept {}

    override fun replace(
        params: RoutingStrategyReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingStrategyMutationResponse> =
        // put /routing-strategies/{id}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoutingStrategyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoutingStrategyServiceAsync.WithRawResponse =
            RoutingStrategyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RoutingStrategyMutationResponse> =
            jsonHandler<RoutingStrategyMutationResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RoutingStrategyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingStrategyMutationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies")
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

        private val retrieveHandler: Handler<RoutingStrategyGetResponse> =
            jsonHandler<RoutingStrategyGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RoutingStrategyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0))
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

        private val listHandler: Handler<RoutingStrategyListResponse> =
            jsonHandler<RoutingStrategyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RoutingStrategyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingStrategyListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies")
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
            params: RoutingStrategyArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0))
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

        private val replaceHandler: Handler<RoutingStrategyMutationResponse> =
            jsonHandler<RoutingStrategyMutationResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: RoutingStrategyReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingStrategyMutationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0))
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
