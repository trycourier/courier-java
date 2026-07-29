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
import com.courier.models.messages.MessageResendParams
import com.courier.models.messages.MessageResendResponse
import com.courier.models.messages.MessageRetrieveParams
import com.courier.models.messages.MessageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Look up the messages Courier has accepted, inspect their delivery history and rendered output,
 * and cancel, resend, or archive them.
 */
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

    /**
     * Returns a sent message's status, recipient, event, and per-provider delivery detail, with
     * timestamps for enqueued, sent, delivered, opened, and clicked.
     */
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

    /**
     * Returns previously sent messages, most recent first, each carrying its status, recipient,
     * channel, and provider. Paged by cursor.
     */
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
     * Cancels a message that is still in the delivery pipeline and returns the message record with
     * its resulting canceled or failed status.
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

    /**
     * Returns the rendered content Courier delivered for a message, broken out per channel, to
     * confirm what the recipient received.
     */
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

    /**
     * Returns the ordered event history for a sent message, one entry per status transition with
     * its timestamp.
     */
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
     * Resends a previously sent message to the same recipient and content, returning a new
     * messageId. The original send request is not modified.
     */
    fun resend(messageId: String): CompletableFuture<MessageResendResponse> =
        resend(messageId, MessageResendParams.none())

    /** @see resend */
    fun resend(
        messageId: String,
        params: MessageResendParams = MessageResendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResendResponse> =
        resend(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see resend */
    fun resend(
        messageId: String,
        params: MessageResendParams = MessageResendParams.none(),
    ): CompletableFuture<MessageResendResponse> = resend(messageId, params, RequestOptions.none())

    /** @see resend */
    fun resend(
        params: MessageResendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResendResponse>

    /** @see resend */
    fun resend(params: MessageResendParams): CompletableFuture<MessageResendResponse> =
        resend(params, RequestOptions.none())

    /** @see resend */
    fun resend(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageResendResponse> =
        resend(messageId, MessageResendParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /messages/{message_id}/resend`, but is otherwise
         * the same as [MessageServiceAsync.resend].
         */
        fun resend(messageId: String): CompletableFuture<HttpResponseFor<MessageResendResponse>> =
            resend(messageId, MessageResendParams.none())

        /** @see resend */
        fun resend(
            messageId: String,
            params: MessageResendParams = MessageResendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResendResponse>> =
            resend(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see resend */
        fun resend(
            messageId: String,
            params: MessageResendParams = MessageResendParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageResendResponse>> =
            resend(messageId, params, RequestOptions.none())

        /** @see resend */
        fun resend(
            params: MessageResendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResendResponse>>

        /** @see resend */
        fun resend(
            params: MessageResendParams
        ): CompletableFuture<HttpResponseFor<MessageResendResponse>> =
            resend(params, RequestOptions.none())

        /** @see resend */
        fun resend(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageResendResponse>> =
            resend(messageId, MessageResendParams.none(), requestOptions)
    }
}
