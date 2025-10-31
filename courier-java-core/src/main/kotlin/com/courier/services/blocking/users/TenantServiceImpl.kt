// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.checkRequired
import com.courier.core.handlers.emptyHandler
import com.courier.core.handlers.errorBodyHandler
import com.courier.core.handlers.errorHandler
import com.courier.core.handlers.jsonHandler
import com.courier.core.http.HttpMethod
import com.courier.core.http.HttpRequest
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponse.Handler
import com.courier.core.http.HttpResponseFor
import com.courier.core.http.json
import com.courier.core.http.parseable
import com.courier.core.prepare
import com.courier.models.users.tenants.TenantAddMultipleParams
import com.courier.models.users.tenants.TenantAddSingleParams
import com.courier.models.users.tenants.TenantListParams
import com.courier.models.users.tenants.TenantListResponse
import com.courier.models.users.tenants.TenantRemoveAllParams
import com.courier.models.users.tenants.TenantRemoveSingleParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TenantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TenantService {

    private val withRawResponse: TenantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TenantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService =
        TenantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: TenantListParams,
        requestOptions: RequestOptions,
    ): TenantListResponse =
        // get /users/{user_id}/tenants
        withRawResponse().list(params, requestOptions).parse()

    override fun addMultiple(params: TenantAddMultipleParams, requestOptions: RequestOptions) {
        // put /users/{user_id}/tenants
        withRawResponse().addMultiple(params, requestOptions)
    }

    override fun addSingle(params: TenantAddSingleParams, requestOptions: RequestOptions) {
        // put /users/{user_id}/tenants/{tenant_id}
        withRawResponse().addSingle(params, requestOptions)
    }

    override fun removeAll(params: TenantRemoveAllParams, requestOptions: RequestOptions) {
        // delete /users/{user_id}/tenants
        withRawResponse().removeAll(params, requestOptions)
    }

    override fun removeSingle(params: TenantRemoveSingleParams, requestOptions: RequestOptions) {
        // delete /users/{user_id}/tenants/{tenant_id}
        withRawResponse().removeSingle(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TenantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantService.WithRawResponse =
            TenantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<TenantListResponse> =
            jsonHandler<TenantListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TenantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TenantListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tenants")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addMultipleHandler: Handler<Void?> = emptyHandler()

        override fun addMultiple(
            params: TenantAddMultipleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tenants")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
            params: TenantAddSingleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tenants", params._pathParam(1))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addSingleHandler.handle(it) }
            }
        }

        private val removeAllHandler: Handler<Void?> = emptyHandler()

        override fun removeAll(
            params: TenantRemoveAllParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tenants")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeAllHandler.handle(it) }
            }
        }

        private val removeSingleHandler: Handler<Void?> = emptyHandler()

        override fun removeSingle(
            params: TenantRemoveSingleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "tenants", params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeSingleHandler.handle(it) }
            }
        }
    }
}
