// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.lists

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.checkRequired
import com.courier.api.core.handlers.emptyHandler
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
import com.courier.api.models.lists.subscriptions.SubscriptionAddParams
import com.courier.api.models.lists.subscriptions.SubscriptionListParams
import com.courier.api.models.lists.subscriptions.SubscriptionListResponse
import com.courier.api.models.lists.subscriptions.SubscriptionSubscribeParams
import com.courier.api.models.lists.subscriptions.SubscriptionSubscribeUserParams
import com.courier.api.models.lists.subscriptions.SubscriptionUnsubscribeUserParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync =
        SubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        // get /lists/{list_id}/subscriptions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: SubscriptionAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /lists/{list_id}/subscriptions
        withRawResponse().add(params, requestOptions).thenAccept {}

    override fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /lists/{list_id}/subscriptions
        withRawResponse().subscribe(params, requestOptions).thenAccept {}

    override fun subscribeUser(
        params: SubscriptionSubscribeUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /lists/{list_id}/subscriptions/{user_id}
        withRawResponse().subscribeUser(params, requestOptions).thenAccept {}

    override fun unsubscribeUser(
        params: SubscriptionUnsubscribeUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /lists/{list_id}/subscriptions/{user_id}
        withRawResponse().unsubscribeUser(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse =
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0), "subscriptions")
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

        private val addHandler: Handler<Void?> = emptyHandler()

        override fun add(
            params: SubscriptionAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0), "subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { addHandler.handle(it) }
                    }
                }
        }

        private val subscribeHandler: Handler<Void?> = emptyHandler()

        override fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0), "subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { subscribeHandler.handle(it) }
                    }
                }
        }

        private val subscribeUserHandler: Handler<Void?> = emptyHandler()

        override fun subscribeUser(
            params: SubscriptionSubscribeUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "lists",
                        params._pathParam(0),
                        "subscriptions",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { subscribeUserHandler.handle(it) }
                    }
                }
        }

        private val unsubscribeUserHandler: Handler<Void?> = emptyHandler()

        override fun unsubscribeUser(
            params: SubscriptionUnsubscribeUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "lists",
                        params._pathParam(0),
                        "subscriptions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unsubscribeUserHandler.handle(it) }
                    }
                }
        }
    }
}
