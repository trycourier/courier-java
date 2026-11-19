// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.courier.core.prepare
import com.courier.models.feedback.FeedbackCreateParams
import com.courier.models.feedback.FeedbackCreateResponse
import java.util.function.Consumer

/**
 * Report suspected bugs, confusing behavior and missing features in Courier, from an AI agent, a
 * developer tool or by hand.
 */
class FeedbackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackService {

    private val withRawResponse: FeedbackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeedbackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService =
        FeedbackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions,
    ): FeedbackCreateResponse =
        // post /feedback
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackService.WithRawResponse =
            FeedbackServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FeedbackCreateResponse> =
            jsonHandler<FeedbackCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FeedbackCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
