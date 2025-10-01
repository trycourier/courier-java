// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
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

    /** Fetch the status of a message you've previously sent. */
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

    /** Fetch the statuses of messages you've previously sent. */
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
     * Cancel a message that is currently in the process of being delivered. A well-formatted API
     * call to the cancel message API will return either `200` status code for a successful
     * cancellation or `409` status code for an unsuccessful cancellation. Both cases will include
     * the actual message record in the response body (see details below).
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

    /** Get message content */
    fun getContent(messageId: String): MessageGetContentResponse =
        getContent(messageId, MessageGetContentParams.none())

    /** @see getContent */
    fun getContent(
        messageId: String,
        params: MessageGetContentParams = MessageGetContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetContentResponse =
        getContent(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getContent */
    fun getContent(
        messageId: String,
        params: MessageGetContentParams = MessageGetContentParams.none(),
    ): MessageGetContentResponse = getContent(messageId, params, RequestOptions.none())

    /** @see getContent */
    fun getContent(
        params: MessageGetContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetContentResponse

    /** @see getContent */
    fun getContent(params: MessageGetContentParams): MessageGetContentResponse =
        getContent(params, RequestOptions.none())

    /** @see getContent */
    fun getContent(messageId: String, requestOptions: RequestOptions): MessageGetContentResponse =
        getContent(messageId, MessageGetContentParams.none(), requestOptions)

    /** Fetch the array of events of a message you've previously sent. */
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
         * same as [MessageService.getContent].
         */
        @MustBeClosed
        fun getContent(messageId: String): HttpResponseFor<MessageGetContentResponse> =
            getContent(messageId, MessageGetContentParams.none())

        /** @see getContent */
        @MustBeClosed
        fun getContent(
            messageId: String,
            params: MessageGetContentParams = MessageGetContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetContentResponse> =
            getContent(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getContent */
        @MustBeClosed
        fun getContent(
            messageId: String,
            params: MessageGetContentParams = MessageGetContentParams.none(),
        ): HttpResponseFor<MessageGetContentResponse> =
            getContent(messageId, params, RequestOptions.none())

        /** @see getContent */
        @MustBeClosed
        fun getContent(
            params: MessageGetContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetContentResponse>

        /** @see getContent */
        @MustBeClosed
        fun getContent(
            params: MessageGetContentParams
        ): HttpResponseFor<MessageGetContentResponse> = getContent(params, RequestOptions.none())

        /** @see getContent */
        @MustBeClosed
        fun getContent(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageGetContentResponse> =
            getContent(messageId, MessageGetContentParams.none(), requestOptions)

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
    }
}
