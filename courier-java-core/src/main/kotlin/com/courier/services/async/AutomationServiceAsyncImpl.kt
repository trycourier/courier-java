// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.handlers.errorBodyHandler
import com.courier.core.handlers.errorHandler
import com.courier.core.handlers.jsonHandler
import com.courier.core.http.HttpMethod
import com.courier.core.http.HttpRequest
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponse.Handler
import com.courier.core.http.HttpResponseFor
import com.courier.core.http.parseable
import com.courier.core.prepareAsync
import com.courier.models.automations.AutomationListParams
import com.courier.models.automations.AutomationTemplateListResponse
import com.courier.services.async.automations.InvokeServiceAsync
import com.courier.services.async.automations.InvokeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    override fun list(
        params: AutomationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomationTemplateListResponse> =
        // get /automations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

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

        private val listHandler: Handler<AutomationTemplateListResponse> =
            jsonHandler<AutomationTemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AutomationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutomationTemplateListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automations")
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
    }
}
