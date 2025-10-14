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
import com.courier.api.core.http.parseable
import com.courier.api.core.prepare
import com.courier.api.models.NotificationGetContent
import com.courier.api.models.notifications.NotificationListParams
import com.courier.api.models.notifications.NotificationListResponse
import com.courier.api.models.notifications.NotificationRetrieveContentParams
import com.courier.api.services.blocking.notifications.CheckService
import com.courier.api.services.blocking.notifications.CheckServiceImpl
import com.courier.api.services.blocking.notifications.DraftService
import com.courier.api.services.blocking.notifications.DraftServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationService {

    private val withRawResponse: NotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val draft: DraftService by lazy { DraftServiceImpl(clientOptions) }

    private val checks: CheckService by lazy { CheckServiceImpl(clientOptions) }

    override fun withRawResponse(): NotificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService =
        NotificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun draft(): DraftService = draft

    override fun checks(): CheckService = checks

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): NotificationListResponse =
        // get /notifications
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions,
    ): NotificationGetContent =
        // get /notifications/{id}/content
        withRawResponse().retrieveContent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val draft: DraftService.WithRawResponse by lazy {
            DraftServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val checks: CheckService.WithRawResponse by lazy {
            CheckServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse =
            NotificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun draft(): DraftService.WithRawResponse = draft

        override fun checks(): CheckService.WithRawResponse = checks

        private val listHandler: Handler<NotificationListResponse> =
            jsonHandler<NotificationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications")
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

        private val retrieveContentHandler: Handler<NotificationGetContent> =
            jsonHandler<NotificationGetContent>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationGetContent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "content")
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
