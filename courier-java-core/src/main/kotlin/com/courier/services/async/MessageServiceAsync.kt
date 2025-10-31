// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.messages.MessageCancelParams
import com.courier.models.messages.MessageContentParams
import com.courier.models.messages.MessageContentResponse
import com.courier.models.messages.MessageDetails
import com.courier.models.messages.MessageHistoryParams
import com.courier.models.messages.MessageHistoryResponse
import com.courier.models.messages.MessageListParams
import com.courier.models.messages.MessageListResponse
import com.courier.models.messages.MessageRetrieveParams
import com.courier.models.messages.MessageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /** Fetch the status of a message you've previously sent. */
    fun retrieve(messageId: String): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

    /** Fetch the statuses of messages you've previously sent. */
    fun list(): CompletableFuture<MessageListResponse> = list(MessageListParams.none())

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse>

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none()
    ): CompletableFuture<MessageListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessageListResponse> =
        list(MessageListParams.none(), requestOptions)

    /**
     * Cancel a message that is currently in the process of being delivered. A well-formatted API
     * call to the cancel message API will return either `200` status code for a successful
     * cancellation or `409` status code for an unsuccessful cancellation. Both cases will include
     * the actual message record in the response body (see details below).
     */
    fun cancel(messageId: String): CompletableFuture<MessageDetails> =
        cancel(messageId, MessageCancelParams.none())

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageDetails> =
        cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
    ): CompletableFuture<MessageDetails> = cancel(messageId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: MessageCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageDetails>

    /** @see cancel */
    fun cancel(params: MessageCancelParams): CompletableFuture<MessageDetails> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageDetails> =
        cancel(messageId, MessageCancelParams.none(), requestOptions)

    /** Get message content */
    fun content(messageId: String): CompletableFuture<MessageContentResponse> =
        content(messageId, MessageContentParams.none())

    /** @see content */
    fun content(
        messageId: String,
        params: MessageContentParams = MessageContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageContentResponse> =
        content(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see content */
    fun content(
        messageId: String,
        params: MessageContentParams = MessageContentParams.none(),
    ): CompletableFuture<MessageContentResponse> = content(messageId, params, RequestOptions.none())

    /** @see content */
    fun content(
        params: MessageContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageContentResponse>

    /** @see content */
    fun content(params: MessageContentParams): CompletableFuture<MessageContentResponse> =
        content(params, RequestOptions.none())

    /** @see content */
    fun content(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageContentResponse> =
        content(messageId, MessageContentParams.none(), requestOptions)

    /** Fetch the array of events of a message you've previously sent. */
    fun history(messageId: String): CompletableFuture<MessageHistoryResponse> =
        history(messageId, MessageHistoryParams.none())

    /** @see history */
    fun history(
        messageId: String,
        params: MessageHistoryParams = MessageHistoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageHistoryResponse> =
        history(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see history */
    fun history(
        messageId: String,
        params: MessageHistoryParams = MessageHistoryParams.none(),
    ): CompletableFuture<MessageHistoryResponse> = history(messageId, params, RequestOptions.none())

    /** @see history */
    fun history(
        params: MessageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageHistoryResponse>

    /** @see history */
    fun history(params: MessageHistoryParams): CompletableFuture<MessageHistoryResponse> =
        history(params, RequestOptions.none())

    /** @see history */
    fun history(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageHistoryResponse> =
        history(messageId, MessageHistoryParams.none(), requestOptions)

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messages/{message_id}`, but is otherwise the same
         * as [MessageServiceAsync.retrieve].
         */
        fun retrieve(
            messageId: String
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, MessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages`, but is otherwise the same as
         * [MessageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(MessageListParams.none())

        /** @see list */
        fun list(
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>>

        /** @see list */
        fun list(
            params: MessageListParams = MessageListParams.none()
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /messages/{message_id}/cancel`, but is otherwise
         * the same as [MessageServiceAsync.cancel].
         */
        fun cancel(messageId: String): CompletableFuture<HttpResponseFor<MessageDetails>> =
            cancel(messageId, MessageCancelParams.none())

        /** @see cancel */
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageDetails>> =
            cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageDetails>> =
            cancel(messageId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: MessageCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageDetails>>

        /** @see cancel */
        fun cancel(
            params: MessageCancelParams
        ): CompletableFuture<HttpResponseFor<MessageDetails>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageDetails>> =
            cancel(messageId, MessageCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages/{message_id}/output`, but is otherwise the
         * same as [MessageServiceAsync.content].
         */
        fun content(messageId: String): CompletableFuture<HttpResponseFor<MessageContentResponse>> =
            content(messageId, MessageContentParams.none())

        /** @see content */
        fun content(
            messageId: String,
            params: MessageContentParams = MessageContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageContentResponse>> =
            content(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see content */
        fun content(
            messageId: String,
            params: MessageContentParams = MessageContentParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageContentResponse>> =
            content(messageId, params, RequestOptions.none())

        /** @see content */
        fun content(
            params: MessageContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageContentResponse>>

        /** @see content */
        fun content(
            params: MessageContentParams
        ): CompletableFuture<HttpResponseFor<MessageContentResponse>> =
            content(params, RequestOptions.none())

        /** @see content */
        fun content(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageContentResponse>> =
            content(messageId, MessageContentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages/{message_id}/history`, but is otherwise
         * the same as [MessageServiceAsync.history].
         */
        fun history(messageId: String): CompletableFuture<HttpResponseFor<MessageHistoryResponse>> =
            history(messageId, MessageHistoryParams.none())

        /** @see history */
        fun history(
            messageId: String,
            params: MessageHistoryParams = MessageHistoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageHistoryResponse>> =
            history(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see history */
        fun history(
            messageId: String,
            params: MessageHistoryParams = MessageHistoryParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageHistoryResponse>> =
            history(messageId, params, RequestOptions.none())

        /** @see history */
        fun history(
            params: MessageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageHistoryResponse>>

        /** @see history */
        fun history(
            params: MessageHistoryParams
        ): CompletableFuture<HttpResponseFor<MessageHistoryResponse>> =
            history(params, RequestOptions.none())

        /** @see history */
        fun history(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageHistoryResponse>> =
            history(messageId, MessageHistoryParams.none(), requestOptions)
    }
}
