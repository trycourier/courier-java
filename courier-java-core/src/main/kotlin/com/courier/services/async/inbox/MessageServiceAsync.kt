// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.inbox

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.models.inbox.messages.MessageDeleteParams
import com.courier.models.inbox.messages.MessageRestoreParams
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

    /**
     * Delete a user's inbox message. The message is removed from every inbox read (it stops
     * appearing in the recipient's Inbox); it can be restored.
     */
    fun delete(messageId: String): CompletableFuture<Void?> =
        delete(messageId, MessageDeleteParams.none())

    /** @see delete */
    fun delete(
        messageId: String,
        params: MessageDeleteParams = MessageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see delete */
    fun delete(
        messageId: String,
        params: MessageDeleteParams = MessageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(messageId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MessageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(messageId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(messageId, MessageDeleteParams.none(), requestOptions)

    /** Restore a previously deleted inbox message. */
    fun restore(messageId: String, params: MessageRestoreParams): CompletableFuture<Void?> =
        restore(messageId, params, RequestOptions.none())

    /** @see restore */
    fun restore(
        messageId: String,
        params: MessageRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        restore(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see restore */
    fun restore(params: MessageRestoreParams): CompletableFuture<Void?> =
        restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(
        params: MessageRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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
         * Returns a raw HTTP response for `delete /inbox/messages/{message_id}`, but is otherwise
         * the same as [MessageServiceAsync.delete].
         */
        fun delete(messageId: String): CompletableFuture<HttpResponse> =
            delete(messageId, MessageDeleteParams.none())

        /** @see delete */
        fun delete(
            messageId: String,
            params: MessageDeleteParams = MessageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see delete */
        fun delete(
            messageId: String,
            params: MessageDeleteParams = MessageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(messageId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MessageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(messageId, MessageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /inbox/messages/{message_id}/restore`, but is
         * otherwise the same as [MessageServiceAsync.restore].
         */
        fun restore(
            messageId: String,
            params: MessageRestoreParams,
        ): CompletableFuture<HttpResponse> = restore(messageId, params, RequestOptions.none())

        /** @see restore */
        fun restore(
            messageId: String,
            params: MessageRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restore(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see restore */
        fun restore(params: MessageRestoreParams): CompletableFuture<HttpResponse> =
            restore(params, RequestOptions.none())

        /** @see restore */
        fun restore(
            params: MessageRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
