// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.automations

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
import com.courier.api.core.prepareAsync
import com.courier.api.models.automations.invoke.AutomationInvokeResponse
import com.courier.api.models.automations.invoke.InvokeInvokeAdHocParams
import com.courier.api.models.automations.invoke.InvokeInvokeByTemplateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvokeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvokeServiceAsync {

    private val withRawResponse: InvokeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvokeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeServiceAsync =
        InvokeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invokeAdHoc(
        params: InvokeInvokeAdHocParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomationInvokeResponse> =
        // post /automations/invoke
        withRawResponse().invokeAdHoc(params, requestOptions).thenApply { it.parse() }

    override fun invokeByTemplate(
        params: InvokeInvokeByTemplateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomationInvokeResponse> =
        // post /automations/{templateId}/invoke
        withRawResponse().invokeByTemplate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvokeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeServiceAsync.WithRawResponse =
            InvokeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val invokeAdHocHandler: Handler<AutomationInvokeResponse> =
            jsonHandler<AutomationInvokeResponse>(clientOptions.jsonMapper)

        override fun invokeAdHoc(
            params: InvokeInvokeAdHocParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automations", "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { invokeAdHocHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val invokeByTemplateHandler: Handler<AutomationInvokeResponse> =
            jsonHandler<AutomationInvokeResponse>(clientOptions.jsonMapper)

        override fun invokeByTemplate(
            params: InvokeInvokeByTemplateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
