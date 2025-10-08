// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.profiles

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.checkRequired
import com.courier.api.core.handlers.errorBodyHandler
import com.courier.api.core.handlers.errorHandler
import com.courier.api.core.handlers.jsonHandler
import com.courier.api.core.http.HttpMethod
import com.courier.api.core.http.HttpRequest
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponse.Handler
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.core.http.json
import com.courier.api.core.http.parseable
import com.courier.api.core.prepareAsync
import com.courier.api.models.profiles.lists.ListDeleteParams
import com.courier.api.models.profiles.lists.ListDeleteResponse
import com.courier.api.models.profiles.lists.ListRetrieveParams
import com.courier.api.models.profiles.lists.ListRetrieveResponse
import com.courier.api.models.profiles.lists.ListSubscribeParams
import com.courier.api.models.profiles.lists.ListSubscribeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ListServiceAsync {

    private val withRawResponse: ListServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync =
        ListServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListRetrieveResponse> =
        // get /profiles/{user_id}/lists
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListDeleteResponse> =
        // delete /profiles/{user_id}/lists
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun subscribe(
        params: ListSubscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListSubscribeResponse> =
        // post /profiles/{user_id}/lists
        withRawResponse().subscribe(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListServiceAsync.WithRawResponse =
            ListServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ListRetrieveResponse> =
            jsonHandler<ListRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0), "lists")
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

        private val deleteHandler: Handler<ListDeleteResponse> =
            jsonHandler<ListDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0), "lists")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val subscribeHandler: Handler<ListSubscribeResponse> =
            jsonHandler<ListSubscribeResponse>(clientOptions.jsonMapper)

        override fun subscribe(
            params: ListSubscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListSubscribeResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0), "lists")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { subscribeHandler.handle(it) }
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
