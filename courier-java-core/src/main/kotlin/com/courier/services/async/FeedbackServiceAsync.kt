// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.feedback.FeedbackCreateParams
import com.courier.models.feedback.FeedbackCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Report suspected bugs, confusing behavior and missing features in Courier, from an AI agent, a
 * developer tool or by hand.
 */
interface FeedbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync

    /**
     * Reports a suspected bug, confusing behavior or a missing feature in Courier. It is built for
     * AI agents and developer tools to call when Courier does something unexpected, and people can
     * call it too.
     *
     * A report is not a support ticket. A `201` means Courier stored the report; it does not
     * promise a reply or a fix. For help with your account, contact Courier support.
     *
     * Never include secrets, API keys or customer data such as recipient names, email addresses or
     * message content.
     *
     * Requires an API key with no scope restrictions; a JWT or a scoped API key is refused. Each
     * workspace can submit 200 reports per UTC day, and requests that fail validation count toward
     * that limit.
     */
    fun create(params: FeedbackCreateParams): CompletableFuture<FeedbackCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackCreateResponse>

    /**
     * A view of [FeedbackServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /feedback`, but is otherwise the same as
         * [FeedbackServiceAsync.create].
         */
        fun create(
            params: FeedbackCreateParams
        ): CompletableFuture<HttpResponseFor<FeedbackCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FeedbackCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackCreateResponse>>
    }
}
