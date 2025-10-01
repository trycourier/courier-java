// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.send.SendSendMessageParams
import com.courier.api.models.send.SendSendMessageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync

    /** Use the send API to send a message to one or more recipients. */
    fun sendMessage(params: SendSendMessageParams): CompletableFuture<SendSendMessageResponse> =
        sendMessage(params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(
        params: SendSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SendSendMessageResponse>

    /** A view of [SendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /send`, but is otherwise the same as
         * [SendServiceAsync.sendMessage].
         */
        fun sendMessage(
            params: SendSendMessageParams
        ): CompletableFuture<HttpResponseFor<SendSendMessageResponse>> =
            sendMessage(params, RequestOptions.none())

        /** @see sendMessage */
        fun sendMessage(
            params: SendSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SendSendMessageResponse>>
    }
}
