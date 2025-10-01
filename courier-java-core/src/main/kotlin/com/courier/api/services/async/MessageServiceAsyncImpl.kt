// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

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
import com.courier.api.models.messages.MessageCancelParams
import com.courier.api.models.messages.MessageDetails
import com.courier.api.models.messages.MessageGetContentParams
import com.courier.api.models.messages.MessageGetContentResponse
import com.courier.api.models.messages.MessageHistoryParams
import com.courier.api.models.messages.MessageHistoryResponse
import com.courier.api.models.messages.MessageListParams
import com.courier.api.models.messages.MessageListResponse
import com.courier.api.models.messages.MessageRetrieveParams
import com.courier.api.models.messages.MessageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageServiceAsync {

    private val withRawResponse: MessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync =
        MessageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageRetrieveResponse> =
        // get /messages/{message_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MessageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListResponse> =
        // get /messages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: MessageCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageDetails> =
        // post /messages/{message_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun getContent(
        params: MessageGetContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageGetContentResponse> =
        // get /messages/{message_id}/output
        withRawResponse().getContent(params, requestOptions).thenApply { it.parse() }

    override fun history(
        params: MessageHistoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageHistoryResponse> =
        // get /messages/{message_id}/history
        withRawResponse().history(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse =
            MessageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MessageRetrieveResponse> =
            jsonHandler<MessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", params._pathParam(0))
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

        private val listHandler: Handler<MessageListResponse> =
            jsonHandler<MessageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages")
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

        private val cancelHandler: Handler<MessageDetails> =
            jsonHandler<MessageDetails>(clientOptions.jsonMapper)

        override fun cancel(
            params: MessageCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageDetails>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", params._pathParam(0), "cancel")
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

        private val getContentHandler: Handler<MessageGetContentResponse> =
            jsonHandler<MessageGetContentResponse>(clientOptions.jsonMapper)

        override fun getContent(
            params: MessageGetContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageGetContentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", params._pathParam(0), "output")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getContentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val historyHandler: Handler<MessageHistoryResponse> =
            jsonHandler<MessageHistoryResponse>(clientOptions.jsonMapper)

        override fun history(
            params: MessageHistoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageHistoryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", params._pathParam(0), "history")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { historyHandler.handle(it) }
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
