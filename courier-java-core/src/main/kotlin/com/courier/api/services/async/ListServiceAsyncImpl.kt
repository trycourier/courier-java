// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

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
import com.courier.api.models.UserList
import com.courier.api.models.lists.ListDeleteParams
import com.courier.api.models.lists.ListListParams
import com.courier.api.models.lists.ListListResponse
import com.courier.api.models.lists.ListRestoreParams
import com.courier.api.models.lists.ListRetrieveParams
import com.courier.api.models.lists.ListUpdateParams
import com.courier.api.services.async.lists.SubscriptionServiceAsync
import com.courier.api.services.async.lists.SubscriptionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ListServiceAsync {

    private val withRawResponse: ListServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ListServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync =
        ListServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserList> =
        // get /lists/{list_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ListUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /lists/{list_id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: ListListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListListResponse> =
        // get /lists
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /lists/{list_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun restore(
        params: ListRestoreParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /lists/{list_id}/restore
        withRawResponse().restore(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListServiceAsync.WithRawResponse =
            ListServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        private val retrieveHandler: Handler<UserList> =
            jsonHandler<UserList>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: ListUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<ListListResponse> =
            jsonHandler<ListListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ListListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val restoreHandler: Handler<Void?> = emptyHandler()

        override fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lists", params._pathParam(0), "restore")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { restoreHandler.handle(it) }
                    }
                }
        }
    }
}
