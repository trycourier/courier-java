// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

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
import com.courier.api.core.http.json
import com.courier.api.core.http.parseable
import com.courier.api.core.prepare
import com.courier.api.models.automations.AutomationInvokeAdHocParams
import com.courier.api.models.automations.AutomationInvokeByTemplateParams
import com.courier.api.models.automations.invoke.AutomationInvokeResponse
import com.courier.api.services.blocking.automations.InvokeService
import com.courier.api.services.blocking.automations.InvokeServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AutomationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomationService {

    private val withRawResponse: AutomationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invoke: InvokeService by lazy { InvokeServiceImpl(clientOptions) }

    override fun withRawResponse(): AutomationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationService =
        AutomationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invoke(): InvokeService = invoke

    override fun invokeAdHoc(
        params: AutomationInvokeAdHocParams,
        requestOptions: RequestOptions,
    ): AutomationInvokeResponse =
        // post /automations/invoke
        withRawResponse().invokeAdHoc(params, requestOptions).parse()

    override fun invokeByTemplate(
        params: AutomationInvokeByTemplateParams,
        requestOptions: RequestOptions,
    ): AutomationInvokeResponse =
        // post /automations/{templateId}/invoke
        withRawResponse().invokeByTemplate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val invoke: InvokeService.WithRawResponse by lazy {
            InvokeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationService.WithRawResponse =
            AutomationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invoke(): InvokeService.WithRawResponse = invoke

        private val invokeAdHocHandler: Handler<AutomationInvokeResponse> =
            jsonHandler<AutomationInvokeResponse>(clientOptions.jsonMapper)

        override fun invokeAdHoc(
            params: AutomationInvokeAdHocParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomationInvokeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automations", "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { invokeAdHocHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val invokeByTemplateHandler: Handler<AutomationInvokeResponse> =
            jsonHandler<AutomationInvokeResponse>(clientOptions.jsonMapper)

        override fun invokeByTemplate(
            params: AutomationInvokeByTemplateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomationInvokeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automations", params._pathParam(0), "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { invokeByTemplateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
