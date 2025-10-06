// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

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
import com.courier.api.core.prepare
import com.courier.api.models.auth.AuthIssueTokenParams
import com.courier.api.models.auth.AuthIssueTokenResponse
import java.util.function.Consumer

class AuthServiceImpl internal constructor(private val clientOptions: ClientOptions) : AuthService {

    private val withRawResponse: AuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthService =
        AuthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun issueToken(
        params: AuthIssueTokenParams,
        requestOptions: RequestOptions,
    ): AuthIssueTokenResponse =
        // post /auth/issue-token
        withRawResponse().issueToken(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthService.WithRawResponse =
            AuthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val issueTokenHandler: Handler<AuthIssueTokenResponse> =
            jsonHandler<AuthIssueTokenResponse>(clientOptions.jsonMapper)

        override fun issueToken(
            params: AuthIssueTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthIssueTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "issue-token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
