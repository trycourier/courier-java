// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.journeys

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
import com.courier.core.http.parseable
import com.courier.core.prepare
import com.courier.models.journeys.JourneyRunListResponse
import com.courier.models.journeys.JourneyRunResponse
import com.courier.models.journeys.JourneyRunStepsResponse
import com.courier.models.journeys.runs.RunListParams
import com.courier.models.journeys.runs.RunListStepsParams
import com.courier.models.journeys.runs.RunRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
 * templates scoped to them.
 */
class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions,
    ): JourneyRunResponse =
        // get /journeys/runs/{run_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RunListParams,
        requestOptions: RequestOptions,
    ): JourneyRunListResponse =
        // get /journeys/runs
        withRawResponse().list(params, requestOptions).parse()

    override fun listSteps(
        params: RunListStepsParams,
        requestOptions: RequestOptions,
    ): JourneyRunStepsResponse =
        // get /journeys/runs/{run_id}/steps
        withRawResponse().listSteps(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<JourneyRunResponse> =
            jsonHandler<JourneyRunResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyRunResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", "runs", params._pathParam(0))
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

        private val listHandler: Handler<JourneyRunListResponse> =
            jsonHandler<JourneyRunListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RunListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyRunListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", "runs")
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

        private val listStepsHandler: Handler<JourneyRunStepsResponse> =
            jsonHandler<JourneyRunStepsResponse>(clientOptions.jsonMapper)

        override fun listSteps(
            params: RunListStepsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyRunStepsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", "runs", params._pathParam(0), "steps")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listStepsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
