// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.courier.models.tenants.Tenant
import com.courier.models.tenants.TenantDeleteParams
import com.courier.models.tenants.TenantListParams
import com.courier.models.tenants.TenantListResponse
import com.courier.models.tenants.TenantListUsersParams
import com.courier.models.tenants.TenantListUsersResponse
import com.courier.models.tenants.TenantRetrieveParams
import com.courier.models.tenants.TenantUpdateParams
import com.courier.services.blocking.tenants.PreferenceService
import com.courier.services.blocking.tenants.PreferenceServiceImpl
import com.courier.services.blocking.tenants.TemplateService
import com.courier.services.blocking.tenants.TemplateServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TenantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TenantService {

    private val withRawResponse: TenantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val preferences: PreferenceService by lazy { PreferenceServiceImpl(clientOptions) }

    private val templates: TemplateService by lazy { TemplateServiceImpl(clientOptions) }

    override fun withRawResponse(): TenantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService =
        TenantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preferences(): PreferenceService = preferences

    override fun templates(): TemplateService = templates

    override fun retrieve(params: TenantRetrieveParams, requestOptions: RequestOptions): Tenant =
        // get /tenants/{tenant_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TenantUpdateParams, requestOptions: RequestOptions): Tenant =
        // put /tenants/{tenant_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TenantListParams,
        requestOptions: RequestOptions,
    ): TenantListResponse =
        // get /tenants
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TenantDeleteParams, requestOptions: RequestOptions) {
        // delete /tenants/{tenant_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listUsers(
        params: TenantListUsersParams,
        requestOptions: RequestOptions,
    ): TenantListUsersResponse =
        // get /tenants/{tenant_id}/users
        withRawResponse().listUsers(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TenantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val preferences: PreferenceService.WithRawResponse by lazy {
            PreferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantService.WithRawResponse =
            TenantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun preferences(): PreferenceService.WithRawResponse = preferences

        override fun templates(): TemplateService.WithRawResponse = templates

        private val retrieveHandler: Handler<Tenant> = jsonHandler<Tenant>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TenantRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tenant> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0))
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

        private val updateHandler: Handler<Tenant> = jsonHandler<Tenant>(clientOptions.jsonMapper)

        override fun update(
            params: TenantUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tenant> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TenantListResponse> =
            jsonHandler<TenantListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TenantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TenantListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TenantDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listUsersHandler: Handler<TenantListUsersResponse> =
            jsonHandler<TenantListUsersResponse>(clientOptions.jsonMapper)

        override fun listUsers(
            params: TenantListUsersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TenantListUsersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0), "users")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listUsersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
