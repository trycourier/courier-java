// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.send.SendMessageParams
import com.courier.models.send.SendMessageResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Send a message to one or more recipients — users, lists, audiences, or tenants — across every
 * channel you have configured.
 */
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

    /**
     * Sends a message to one or more recipients and returns a requestId. Courier routes it to
     * email, SMS, push, chat, or in-app based on your rules. Use the returned requestId to look up
     * delivery status via the Messages API.
     */
    fun message(params: SendMessageParams): SendMessageResponse =
        message(params, RequestOptions.none())

    /** @see message */
    fun message(
        params: SendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SendMessageResponse

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
         * [SendService.message].
         */
        @MustBeClosed
        fun message(params: SendMessageParams): HttpResponseFor<SendMessageResponse> =
            message(params, RequestOptions.none())

        /** @see message */
        @MustBeClosed
        fun message(
            params: SendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SendMessageResponse>
    }
}
