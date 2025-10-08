// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.auth.AuthIssueTokenParams
import com.courier.api.models.auth.AuthIssueTokenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync

    /** Returns a new access token. */
    fun issueToken(params: AuthIssueTokenParams): CompletableFuture<AuthIssueTokenResponse> =
        issueToken(params, RequestOptions.none())

    /** @see issueToken */
    fun issueToken(
        params: AuthIssueTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthIssueTokenResponse>

    /** A view of [AuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/issue-token`, but is otherwise the same as
         * [AuthServiceAsync.issueToken].
         */
        fun issueToken(
            params: AuthIssueTokenParams
        ): CompletableFuture<HttpResponseFor<AuthIssueTokenResponse>> =
            issueToken(params, RequestOptions.none())

        /** @see issueToken */
        fun issueToken(
            params: AuthIssueTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthIssueTokenResponse>>
    }
}
