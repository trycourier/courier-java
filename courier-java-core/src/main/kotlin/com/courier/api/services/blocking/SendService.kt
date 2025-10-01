// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.send.SendSendMessageParams
import com.courier.api.models.send.SendSendMessageResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface SendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService

    /** Use the send API to send a message to one or more recipients. */
    fun sendMessage(params: SendSendMessageParams): SendSendMessageResponse =
        sendMessage(params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(
        params: SendSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SendSendMessageResponse

    /** A view of [SendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /send`, but is otherwise the same as
         * [SendService.sendMessage].
         */
        @MustBeClosed
        fun sendMessage(params: SendSendMessageParams): HttpResponseFor<SendSendMessageResponse> =
            sendMessage(params, RequestOptions.none())

        /** @see sendMessage */
        @MustBeClosed
        fun sendMessage(
            params: SendSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SendSendMessageResponse>
    }
}
