// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.users

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.checkRequired
import com.courier.api.core.handlers.emptyHandler
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
import com.courier.api.models.UserToken
import com.courier.api.models.users.tokens.TokenAddMultipleParams
import com.courier.api.models.users.tokens.TokenAddSingleParams
import com.courier.api.models.users.tokens.TokenDeleteParams
import com.courier.api.models.users.tokens.TokenListParams
import com.courier.api.models.users.tokens.TokenRetrieveParams
import com.courier.api.models.users.tokens.TokenRetrieveResponse
import com.courier.api.models.users.tokens.TokenUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenService {

    private val withRawResponse: TokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService =
        TokenServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TokenRetrieveParams,
        requestOptions: RequestOptions,
    ): TokenRetrieveResponse =
        // get /users/{user_id}/tokens/{token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TokenUpdateParams, requestOptions: RequestOptions) {
        // patch /users/{user_id}/tokens/{token}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: TokenListParams, requestOptions: RequestOptions): List<UserToken> =
        // get /users/{user_id}/tokens
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TokenDeleteParams, requestOptions: RequestOptions) {
        // delete /users/{user_id}/tokens/{token}
        withRawResponse().delete(params, requestOptions)
    }

    override fun addMultiple(params: TokenAddMultipleParams, requestOptions: RequestOptions) {
        // put /users/{user_id}/tokens
        withRawResponse().addMultiple(params, requestOptions)
    }

    override fun addSingle(params: TokenAddSingleParams, requestOptions: RequestOptions) {
        // put /users/{user_id}/tokens/{token}
        withRawResponse().addSingle(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenService.WithRawResponse =
            TokenServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TokenRetrieveResponse> =
            jsonHandler<TokenRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TokenRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tokens", params._pathParam(1))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tokens", params._pathParam(1))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<UserToken>> =
            jsonHandler<List<UserToken>>(clientOptions.jsonMapper)

        override fun list(
            params: TokenListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<UserToken>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tokens")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tokens", params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val addMultipleHandler: Handler<Void?> = emptyHandler()

        override fun addMultiple(
            params: TokenAddMultipleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tokens")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addMultipleHandler.handle(it) }
            }
        }

        private val addSingleHandler: Handler<Void?> = emptyHandler()

        override fun addSingle(
            params: TokenAddSingleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathToken", params.pathToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tokens", params._pathParam(1))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addSingleHandler.handle(it) }
            }
        }
    }
}
