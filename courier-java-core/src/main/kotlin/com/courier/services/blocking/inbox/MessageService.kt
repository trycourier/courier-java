// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.inbox

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.models.inbox.messages.MessageDeleteParams
import com.courier.models.inbox.messages.MessageRestoreParams
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
     * Delete a user's inbox message. The message is removed from every inbox read (it stops
     * appearing in the recipient's Inbox); it can be restored.
     */
    fun delete(messageId: String) = delete(messageId, MessageDeleteParams.none())

    /** @see delete */
    fun delete(
        messageId: String,
        params: MessageDeleteParams = MessageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see delete */
    fun delete(messageId: String, params: MessageDeleteParams = MessageDeleteParams.none()) =
        delete(messageId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MessageDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: MessageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(messageId: String, requestOptions: RequestOptions) =
        delete(messageId, MessageDeleteParams.none(), requestOptions)

    /** Restore a previously deleted inbox message. */
    fun restore(messageId: String, params: MessageRestoreParams) =
        restore(messageId, params, RequestOptions.none())

    /** @see restore */
    fun restore(
        messageId: String,
        params: MessageRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = restore(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see restore */
    fun restore(params: MessageRestoreParams) = restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(
        params: MessageRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /inbox/messages/{message_id}`, but is otherwise
         * the same as [MessageService.delete].
         */
        @MustBeClosed
        fun delete(messageId: String): HttpResponse = delete(messageId, MessageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            messageId: String,
            params: MessageDeleteParams = MessageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            messageId: String,
            params: MessageDeleteParams = MessageDeleteParams.none(),
        ): HttpResponse = delete(messageId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MessageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(messageId: String, requestOptions: RequestOptions): HttpResponse =
            delete(messageId, MessageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /inbox/messages/{message_id}/restore`, but is
         * otherwise the same as [MessageService.restore].
         */
        @MustBeClosed
        fun restore(messageId: String, params: MessageRestoreParams): HttpResponse =
            restore(messageId, params, RequestOptions.none())

        /** @see restore */
        @MustBeClosed
        fun restore(
            messageId: String,
            params: MessageRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = restore(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see restore */
        @MustBeClosed
        fun restore(params: MessageRestoreParams): HttpResponse =
            restore(params, RequestOptions.none())

        /** @see restore */
        @MustBeClosed
        fun restore(
            params: MessageRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
