// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

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
import com.courier.api.models.automations.AutomationInvokeAdHocParams
import com.courier.api.models.automations.AutomationInvokeByTemplateParams
import com.courier.api.models.automations.invoke.AutomationInvokeResponse
import com.courier.api.services.async.automations.InvokeServiceAsync
import com.courier.api.services.async.automations.InvokeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AutomationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomationServiceAsync {

    private val withRawResponse: AutomationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invoke: InvokeServiceAsync by lazy { InvokeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AutomationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationServiceAsync =
        AutomationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invoke(): InvokeServiceAsync = invoke

    override fun invokeAdHoc(
        params: AutomationInvokeAdHocParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomationInvokeResponse> =
        // post /automations/invoke
        withRawResponse().invokeAdHoc(params, requestOptions).thenApply { it.parse() }

    override fun invokeByTemplate(
        params: AutomationInvokeByTemplateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomationInvokeResponse> =
        // post /automations/{templateId}/invoke
        withRawResponse().invokeByTemplate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val invoke: InvokeServiceAsync.WithRawResponse by lazy {
            InvokeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationServiceAsync.WithRawResponse =
            AutomationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invoke(): InvokeServiceAsync.WithRawResponse = invoke

        private val invokeAdHocHandler: Handler<AutomationInvokeResponse> =
            jsonHandler<AutomationInvokeResponse>(clientOptions.jsonMapper)

        override fun invokeAdHoc(
            params: AutomationInvokeAdHocParams,
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
            params: AutomationInvokeByTemplateParams,
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
