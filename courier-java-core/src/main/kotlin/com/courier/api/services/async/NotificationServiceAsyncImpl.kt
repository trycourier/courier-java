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
import com.courier.api.core.http.parseable
import com.courier.api.core.prepareAsync
import com.courier.api.models.notifications.NotificationContent
import com.courier.api.models.notifications.NotificationListParams
import com.courier.api.models.notifications.NotificationListResponse
import com.courier.api.models.notifications.NotificationRetrieveContentParams
import com.courier.api.services.async.notifications.CheckServiceAsync
import com.courier.api.services.async.notifications.CheckServiceAsyncImpl
import com.courier.api.services.async.notifications.DraftServiceAsync
import com.courier.api.services.async.notifications.DraftServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val checks: CheckServiceAsync by lazy { CheckServiceAsyncImpl(clientOptions) }

    private val draft: DraftServiceAsync by lazy { DraftServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync =
        NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checks(): CheckServiceAsync = checks

    override fun draft(): DraftServiceAsync = draft

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationListResponse> =
        // get /notifications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContent> =
        // get /notifications/{id}/content
        withRawResponse().retrieveContent(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val checks: CheckServiceAsync.WithRawResponse by lazy {
            CheckServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val draft: DraftServiceAsync.WithRawResponse by lazy {
            DraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationServiceAsync.WithRawResponse =
            NotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun checks(): CheckServiceAsync.WithRawResponse = checks

        override fun draft(): DraftServiceAsync.WithRawResponse = draft

        private val listHandler: Handler<NotificationListResponse> =
            jsonHandler<NotificationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications")
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

        private val retrieveContentHandler: Handler<NotificationContent> =
            jsonHandler<NotificationContent>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContent>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "content")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
