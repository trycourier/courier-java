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
import com.courier.core.http.json
import com.courier.core.http.parseable
import com.courier.core.prepareAsync
import com.courier.models.inbound.InboundTrackEventParams
import com.courier.models.inbound.InboundTrackEventResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InboundServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InboundServiceAsync {

    private val withRawResponse: InboundServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundServiceAsync =
        InboundServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun trackEvent(
        params: InboundTrackEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundTrackEventResponse> =
        // post /inbound/courier
        withRawResponse().trackEvent(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundServiceAsync.WithRawResponse =
            InboundServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val trackEventHandler: Handler<InboundTrackEventResponse> =
            jsonHandler<InboundTrackEventResponse>(clientOptions.jsonMapper)

        override fun trackEvent(
            params: InboundTrackEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundTrackEventResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound", "courier")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { trackEventHandler.handle(it) }
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
