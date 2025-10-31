// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.automations

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
import com.courier.models.automations.AutomationInvokeResponse
import com.courier.models.automations.invoke.InvokeInvokeAdHocParams
import com.courier.models.automations.invoke.InvokeInvokeByTemplateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvokeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvokeService {

    private val withRawResponse: InvokeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvokeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService =
        InvokeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invokeAdHoc(
        params: InvokeInvokeAdHocParams,
        requestOptions: RequestOptions,
    ): AutomationInvokeResponse =
        // post /automations/invoke
        withRawResponse().invokeAdHoc(params, requestOptions).parse()

    override fun invokeByTemplate(
        params: InvokeInvokeByTemplateParams,
        requestOptions: RequestOptions,
    ): AutomationInvokeResponse =
        // post /automations/{templateId}/invoke
        withRawResponse().invokeByTemplate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvokeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeService.WithRawResponse =
            InvokeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val invokeAdHocHandler: Handler<AutomationInvokeResponse> =
            jsonHandler<AutomationInvokeResponse>(clientOptions.jsonMapper)

        override fun invokeAdHoc(
            params: InvokeInvokeAdHocParams,
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
            params: InvokeInvokeByTemplateParams,
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
