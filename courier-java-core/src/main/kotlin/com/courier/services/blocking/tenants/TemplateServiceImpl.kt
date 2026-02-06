// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.checkRequired
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
import com.courier.models.tenants.BaseTemplateTenantAssociation
import com.courier.models.tenants.PostTenantTemplatePublishResponse
import com.courier.models.tenants.PutTenantTemplateResponse
import com.courier.models.tenants.templates.TemplateListParams
import com.courier.models.tenants.templates.TemplateListResponse
import com.courier.models.tenants.templates.TemplatePublishParams
import com.courier.models.tenants.templates.TemplateReplaceParams
import com.courier.models.tenants.templates.TemplateRetrieveParams
import com.courier.services.blocking.tenants.templates.VersionService
import com.courier.services.blocking.tenants.templates.VersionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplateService {

    private val withRawResponse: TemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val versions: VersionService by lazy { VersionServiceImpl(clientOptions) }

    override fun withRawResponse(): TemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService =
        TemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun versions(): VersionService = versions

    override fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): BaseTemplateTenantAssociation =
        // get /tenants/{tenant_id}/templates/{template_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions,
    ): TemplateListResponse =
        // get /tenants/{tenant_id}/templates
        withRawResponse().list(params, requestOptions).parse()

    override fun publish(
        params: TemplatePublishParams,
        requestOptions: RequestOptions,
    ): PostTenantTemplatePublishResponse =
        // post /tenants/{tenant_id}/templates/{template_id}/publish
        withRawResponse().publish(params, requestOptions).parse()

    override fun replace(
        params: TemplateReplaceParams,
        requestOptions: RequestOptions,
    ): PutTenantTemplateResponse =
        // put /tenants/{tenant_id}/templates/{template_id}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val versions: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateService.WithRawResponse =
            TemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun versions(): VersionService.WithRawResponse = versions

        private val retrieveHandler: Handler<BaseTemplateTenantAssociation> =
            jsonHandler<BaseTemplateTenantAssociation>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BaseTemplateTenantAssociation> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "tenants",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<TemplateListResponse> =
            jsonHandler<TemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TemplateListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tenantId", params.tenantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tenants", params._pathParam(0), "templates")
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

        private val publishHandler: Handler<PostTenantTemplatePublishResponse> =
            jsonHandler<PostTenantTemplatePublishResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: TemplatePublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostTenantTemplatePublishResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "tenants",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                        "publish",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { publishHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<PutTenantTemplateResponse> =
            jsonHandler<PutTenantTemplateResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: TemplateReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PutTenantTemplateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "tenants",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
