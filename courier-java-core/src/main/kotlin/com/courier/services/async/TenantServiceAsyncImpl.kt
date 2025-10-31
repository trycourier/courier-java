// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.core.prepareAsync
import com.courier.models.tenants.Tenant
import com.courier.models.tenants.TenantDeleteParams
import com.courier.models.tenants.TenantListParams
import com.courier.models.tenants.TenantListResponse
import com.courier.models.tenants.TenantListUsersParams
import com.courier.models.tenants.TenantListUsersResponse
import com.courier.models.tenants.TenantRetrieveParams
import com.courier.models.tenants.TenantUpdateParams
import com.courier.services.async.tenants.TemplateServiceAsync
import com.courier.services.async.tenants.TemplateServiceAsyncImpl
import com.courier.services.async.tenants.TenantDefaultPreferenceServiceAsync
import com.courier.services.async.tenants.TenantDefaultPreferenceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TenantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TenantServiceAsync {

    private val withRawResponse: TenantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tenantDefaultPreferences: TenantDefaultPreferenceServiceAsync by lazy {
        TenantDefaultPreferenceServiceAsyncImpl(clientOptions)
    }

    private val templates: TemplateServiceAsync by lazy { TemplateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TenantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantServiceAsync =
        TenantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tenantDefaultPreferences(): TenantDefaultPreferenceServiceAsync =
        tenantDefaultPreferences

    override fun templates(): TemplateServiceAsync = templates

    override fun retrieve(
        params: TenantRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Tenant> =
        // get /tenants/{tenant_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TenantUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Tenant> =
        // put /tenants/{tenant_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TenantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TenantListResponse> =
        // get /tenants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TenantDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /tenants/{tenant_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun listUsers(
        params: TenantListUsersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TenantListUsersResponse> =
        // get /tenants/{tenant_id}/users
        withRawResponse().listUsers(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TenantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tenantDefaultPreferences:
            TenantDefaultPreferenceServiceAsync.WithRawResponse by lazy {
            TenantDefaultPreferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantServiceAsync.WithRawResponse =
            TenantServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tenantDefaultPreferences():
            TenantDefaultPreferenceServiceAsync.WithRawResponse = tenantDefaultPreferences

        override fun templates(): TemplateServiceAsync.WithRawResponse = templates

        private val retrieveHandler: Handler<Tenant> = jsonHandler<Tenant>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TenantRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Tenant>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Tenant> = jsonHandler<Tenant>(clientOptions.jsonMapper)

        override fun update(
            params: TenantUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Tenant>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TenantListResponse> =
            jsonHandler<TenantListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TenantListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TenantListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TenantDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val listUsersHandler: Handler<TenantListUsersResponse> =
            jsonHandler<TenantListUsersResponse>(clientOptions.jsonMapper)

        override fun listUsers(
            params: TenantListUsersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0), "users")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
