// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.models.broadcasts.Broadcast
import com.courier.models.broadcasts.BroadcastArchiveParams
import com.courier.models.broadcasts.BroadcastCancelParams
import com.courier.models.broadcasts.BroadcastCreateParams
import com.courier.models.broadcasts.BroadcastDuplicateParams
import com.courier.models.broadcasts.BroadcastListParams
import com.courier.models.broadcasts.BroadcastListResponse
import com.courier.models.broadcasts.BroadcastPutContentParams
import com.courier.models.broadcasts.BroadcastRetrieveContentParams
import com.courier.models.broadcasts.BroadcastRetrieveParams
import com.courier.models.broadcasts.BroadcastScheduleParams
import com.courier.models.broadcasts.BroadcastSendParams
import com.courier.models.broadcasts.BroadcastUpdateParams
import com.courier.models.notifications.NotificationContentGetResponse
import com.courier.models.notifications.NotificationContentMutationResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BroadcastServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BroadcastServiceAsync {

    private val withRawResponse: BroadcastServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BroadcastServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastServiceAsync =
        BroadcastServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // post /broadcasts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // get /broadcasts/{broadcastId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // put /broadcasts/{broadcastId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastListResponse> =
        // get /broadcasts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: BroadcastArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // delete /broadcasts/{broadcastId}
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // post /broadcasts/{broadcastId}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun duplicate(
        params: BroadcastDuplicateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // post /broadcasts/{broadcastId}/duplicate
        withRawResponse().duplicate(params, requestOptions).thenApply { it.parse() }

    override fun putContent(
        params: BroadcastPutContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContentMutationResponse> =
        // put /broadcasts/{broadcastId}/content
        withRawResponse().putContent(params, requestOptions).thenApply { it.parse() }

    override fun retrieveContent(
        params: BroadcastRetrieveContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContentGetResponse> =
        // get /broadcasts/{broadcastId}/content
        withRawResponse().retrieveContent(params, requestOptions).thenApply { it.parse() }

    override fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // post /broadcasts/{broadcastId}/schedule
        withRawResponse().schedule(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        // post /broadcasts/{broadcastId}/send
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BroadcastServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastServiceAsync.WithRawResponse =
            BroadcastServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts")
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

        private val retrieveHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0))
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

        private val updateHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BroadcastListResponse> =
            jsonHandler<BroadcastListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts")
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

        private val archiveHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun archive(
            params: BroadcastArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val duplicateHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun duplicate(
            params: BroadcastDuplicateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "duplicate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { duplicateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val putContentHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putContent(
            params: BroadcastPutContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "content")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { putContentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveContentHandler: Handler<NotificationContentGetResponse> =
            jsonHandler<NotificationContentGetResponse>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: BroadcastRetrieveContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "content")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveContentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val scheduleHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { scheduleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendHandler.handle(it) }
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
