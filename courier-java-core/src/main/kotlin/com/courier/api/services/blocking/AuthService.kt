// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.auth.AuthIssueTokenParams
import com.courier.api.models.auth.AuthIssueTokenResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthService

    /** Returns a new access token. */
    fun issueToken(params: AuthIssueTokenParams): AuthIssueTokenResponse =
        issueToken(params, RequestOptions.none())

    /** @see issueToken */
    fun issueToken(
        params: AuthIssueTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthIssueTokenResponse

    /** A view of [AuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/issue-token`, but is otherwise the same as
         * [AuthService.issueToken].
         */
        @MustBeClosed
        fun issueToken(params: AuthIssueTokenParams): HttpResponseFor<AuthIssueTokenResponse> =
            issueToken(params, RequestOptions.none())

        /** @see issueToken */
        @MustBeClosed
        fun issueToken(
            params: AuthIssueTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthIssueTokenResponse>
    }
}
