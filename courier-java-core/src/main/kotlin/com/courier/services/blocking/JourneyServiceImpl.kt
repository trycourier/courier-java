// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneysInvokeResponse
import com.courier.models.journeys.JourneysListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JourneyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    JourneyService {

    private val withRawResponse: JourneyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JourneyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyService =
        JourneyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: JourneyListParams,
        requestOptions: RequestOptions,
    ): JourneysListResponse =
        // get /journeys
        withRawResponse().list(params, requestOptions).parse()

    override fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions,
    ): JourneysInvokeResponse =
        // post /journeys/{templateId}/invoke
        withRawResponse().invoke(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JourneyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JourneyService.WithRawResponse =
            JourneyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<JourneysListResponse> =
            jsonHandler<JourneysListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: JourneyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneysListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys")
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

        private val invokeHandler: Handler<JourneysInvokeResponse> =
            jsonHandler<JourneysInvokeResponse>(clientOptions.jsonMapper)

        override fun invoke(
            params: JourneyInvokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneysInvokeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { invokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
