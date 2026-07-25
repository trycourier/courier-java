// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /**
     * Returns a sent message's status, recipient, event, and per-provider delivery detail, with
     * timestamps for enqueued, sent, delivered, opened, and clicked.
     */
    fun retrieve(messageId: String): MessageRetrieveResponse =
        retrieve(messageId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): MessageRetrieveResponse = retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): MessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(messageId: String, requestOptions: RequestOptions): MessageRetrieveResponse =
        retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

    /**
     * Returns previously sent messages, most recent first, each carrying its status, recipient,
     * channel, and provider. Paged by cursor.
     */
    fun list(): MessageListResponse = list(MessageListParams.none())

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    fun list(params: MessageListParams = MessageListParams.none()): MessageListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessageListResponse =
        list(MessageListParams.none(), requestOptions)

    /**
     * Cancels a message that is still in the delivery pipeline and returns the message record with
     * its resulting canceled or failed status.
     */
    fun cancel(messageId: String): MessageDetails = cancel(messageId, MessageCancelParams.none())

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageDetails = cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
    ): MessageDetails = cancel(messageId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: MessageCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageDetails

    /** @see cancel */
    fun cancel(params: MessageCancelParams): MessageDetails = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(messageId: String, requestOptions: RequestOptions): MessageDetails =
        cancel(messageId, MessageCancelParams.none(), requestOptions)

    /**
     * Returns the rendered content Courier delivered for a message, broken out per channel, to
     * confirm what the recipient received.
     */
    fun content(messageId: String): MessageContentResponse =
        content(messageId, MessageContentParams.none())

    /** @see content */
    fun content(
        messageId: String,
        params: MessageContentParams = MessageContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageContentResponse =
        content(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see content */
    fun content(
        messageId: String,
        params: MessageContentParams = MessageContentParams.none(),
    ): MessageContentResponse = content(messageId, params, RequestOptions.none())

    /** @see content */
    fun content(
        params: MessageContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageContentResponse

    /** @see content */
    fun content(params: MessageContentParams): MessageContentResponse =
        content(params, RequestOptions.none())

    /** @see content */
    fun content(messageId: String, requestOptions: RequestOptions): MessageContentResponse =
        content(messageId, MessageContentParams.none(), requestOptions)

    /**
     * Returns the ordered event history for a sent message, one entry per status transition with
     * its timestamp.
     */
    fun history(messageId: String): MessageHistoryResponse =
        history(messageId, MessageHistoryParams.none())

    /** @see history */
    fun history(
        messageId: String,
        params: MessageHistoryParams = MessageHistoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageHistoryResponse =
        history(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see history */
    fun history(
        messageId: String,
        params: MessageHistoryParams = MessageHistoryParams.none(),
    ): MessageHistoryResponse = history(messageId, params, RequestOptions.none())

    /** @see history */
    fun history(
        params: MessageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageHistoryResponse

    /** @see history */
    fun history(params: MessageHistoryParams): MessageHistoryResponse =
        history(params, RequestOptions.none())

    /** @see history */
    fun history(messageId: String, requestOptions: RequestOptions): MessageHistoryResponse =
        history(messageId, MessageHistoryParams.none(), requestOptions)

    /**
     * Resends a previously sent message to the same recipient and content, returning a new
     * messageId. The original send request is not modified.
     */
    fun resend(messageId: String): MessageResendResponse =
        resend(messageId, MessageResendParams.none())

    /** @see resend */
    fun resend(
        messageId: String,
        params: MessageResendParams = MessageResendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResendResponse =
        resend(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see resend */
    fun resend(
        messageId: String,
        params: MessageResendParams = MessageResendParams.none(),
    ): MessageResendResponse = resend(messageId, params, RequestOptions.none())

    /** @see resend */
    fun resend(
        params: MessageResendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResendResponse

    /** @see resend */
    fun resend(params: MessageResendParams): MessageResendResponse =
        resend(params, RequestOptions.none())

    /** @see resend */
    fun resend(messageId: String, requestOptions: RequestOptions): MessageResendResponse =
        resend(messageId, MessageResendParams.none(), requestOptions)

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messages/{message_id}`, but is otherwise the same
         * as [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(messageId: String): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, MessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessageRetrieveParams): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages`, but is otherwise the same as
         * [MessageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessageListResponse> = list(MessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams = MessageListParams.none()
        ): HttpResponseFor<MessageListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessageListResponse> =
            list(MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /messages/{message_id}/cancel`, but is otherwise
         * the same as [MessageService.cancel].
         */
        @MustBeClosed
        fun cancel(messageId: String): HttpResponseFor<MessageDetails> =
            cancel(messageId, MessageCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageDetails> =
            cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
        ): HttpResponseFor<MessageDetails> = cancel(messageId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: MessageCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageDetails>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: MessageCancelParams): HttpResponseFor<MessageDetails> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageDetails> =
            cancel(messageId, MessageCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages/{message_id}/output`, but is otherwise the
         * same as [MessageService.content].
         */
        @MustBeClosed
        fun content(messageId: String): HttpResponseFor<MessageContentResponse> =
            content(messageId, MessageContentParams.none())

        /** @see content */
        @MustBeClosed
        fun content(
            messageId: String,
            params: MessageContentParams = MessageContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageContentResponse> =
            content(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see content */
        @MustBeClosed
        fun content(
            messageId: String,
            params: MessageContentParams = MessageContentParams.none(),
        ): HttpResponseFor<MessageContentResponse> =
            content(messageId, params, RequestOptions.none())

        /** @see content */
        @MustBeClosed
        fun content(
            params: MessageContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageContentResponse>

        /** @see content */
        @MustBeClosed
        fun content(params: MessageContentParams): HttpResponseFor<MessageContentResponse> =
            content(params, RequestOptions.none())

        /** @see content */
        @MustBeClosed
        fun content(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageContentResponse> =
            content(messageId, MessageContentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messages/{message_id}/history`, but is otherwise
         * the same as [MessageService.history].
         */
        @MustBeClosed
        fun history(messageId: String): HttpResponseFor<MessageHistoryResponse> =
            history(messageId, MessageHistoryParams.none())

        /** @see history */
        @MustBeClosed
        fun history(
            messageId: String,
            params: MessageHistoryParams = MessageHistoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageHistoryResponse> =
            history(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see history */
        @MustBeClosed
        fun history(
            messageId: String,
            params: MessageHistoryParams = MessageHistoryParams.none(),
        ): HttpResponseFor<MessageHistoryResponse> =
            history(messageId, params, RequestOptions.none())

        /** @see history */
        @MustBeClosed
        fun history(
            params: MessageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageHistoryResponse>

        /** @see history */
        @MustBeClosed
        fun history(params: MessageHistoryParams): HttpResponseFor<MessageHistoryResponse> =
            history(params, RequestOptions.none())

        /** @see history */
        @MustBeClosed
        fun history(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageHistoryResponse> =
            history(messageId, MessageHistoryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /messages/{message_id}/resend`, but is otherwise
         * the same as [MessageService.resend].
         */
        @MustBeClosed
        fun resend(messageId: String): HttpResponseFor<MessageResendResponse> =
            resend(messageId, MessageResendParams.none())

        /** @see resend */
        @MustBeClosed
        fun resend(
            messageId: String,
            params: MessageResendParams = MessageResendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResendResponse> =
            resend(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see resend */
        @MustBeClosed
        fun resend(
            messageId: String,
            params: MessageResendParams = MessageResendParams.none(),
        ): HttpResponseFor<MessageResendResponse> = resend(messageId, params, RequestOptions.none())

        /** @see resend */
        @MustBeClosed
        fun resend(
            params: MessageResendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResendResponse>

        /** @see resend */
        @MustBeClosed
        fun resend(params: MessageResendParams): HttpResponseFor<MessageResendResponse> =
            resend(params, RequestOptions.none())

        /** @see resend */
        @MustBeClosed
        fun resend(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageResendResponse> =
            resend(messageId, MessageResendParams.none(), requestOptions)
    }
}
