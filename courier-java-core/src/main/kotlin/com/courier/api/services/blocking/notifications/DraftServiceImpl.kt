// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.notifications

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
import com.courier.api.models.NotificationGetContent
import com.courier.api.models.notifications.draft.DraftRetrieveContentParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DraftServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DraftService {

    private val withRawResponse: DraftService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DraftService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService =
        DraftServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveContent(
        params: DraftRetrieveContentParams,
        requestOptions: RequestOptions,
    ): NotificationGetContent =
        // get /notifications/{id}/draft/content
        withRawResponse().retrieveContent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DraftService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftService.WithRawResponse =
            DraftServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveContentHandler: Handler<NotificationGetContent> =
            jsonHandler<NotificationGetContent>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: DraftRetrieveContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationGetContent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "draft", "content")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveContentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
