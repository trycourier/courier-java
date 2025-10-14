// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.checkRequired
import com.courier.api.core.handlers.errorBodyHandler
import com.courier.api.core.handlers.errorHandler
import com.courier.api.core.handlers.jsonHandler
import com.courier.api.core.http.HttpMethod
import com.courier.api.core.http.HttpRequest
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponse.Handler
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.core.http.parseable
import com.courier.api.core.prepare
import com.courier.api.models.BaseTemplateTenantAssociation
import com.courier.api.models.tenants.templates.TemplateListParams
import com.courier.api.models.tenants.templates.TemplateListResponse
import com.courier.api.models.tenants.templates.TemplateRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplateService {

    private val withRawResponse: TemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService =
        TemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateService.WithRawResponse =
            TemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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
    }
}
