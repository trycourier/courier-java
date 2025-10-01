// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.handlers.errorBodyHandler
import com.courier.api.core.handlers.errorHandler
import com.courier.api.core.handlers.jsonHandler
import com.courier.api.core.http.HttpMethod
import com.courier.api.core.http.HttpRequest
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponse.Handler
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.core.http.json
import com.courier.api.core.http.parseable
import com.courier.api.core.prepareAsync
import com.courier.api.models.auth.AuthIssueTokenParams
import com.courier.api.models.auth.AuthIssueTokenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val withRawResponse: AuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync =
        AuthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun issueToken(
        params: AuthIssueTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthIssueTokenResponse> =
        // post /auth/issue-token
        withRawResponse().issueToken(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthServiceAsync.WithRawResponse =
            AuthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val issueTokenHandler: Handler<AuthIssueTokenResponse> =
            jsonHandler<AuthIssueTokenResponse>(clientOptions.jsonMapper)

        override fun issueToken(
            params: AuthIssueTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthIssueTokenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "issue-token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { issueTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
