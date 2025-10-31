// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.core.prepareAsync
import com.courier.models.notifications.NotificationGetContent
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListResponse
import com.courier.models.notifications.NotificationRetrieveContentParams
import com.courier.services.async.notifications.CheckServiceAsync
import com.courier.services.async.notifications.CheckServiceAsyncImpl
import com.courier.services.async.notifications.DraftServiceAsync
import com.courier.services.async.notifications.DraftServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val draft: DraftServiceAsync by lazy { DraftServiceAsyncImpl(clientOptions) }

    private val checks: CheckServiceAsync by lazy { CheckServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync =
        NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun draft(): DraftServiceAsync = draft

    override fun checks(): CheckServiceAsync = checks

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationListResponse> =
        // get /notifications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationGetContent> =
        // get /notifications/{id}/content
        withRawResponse().retrieveContent(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val draft: DraftServiceAsync.WithRawResponse by lazy {
            DraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val checks: CheckServiceAsync.WithRawResponse by lazy {
            CheckServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationServiceAsync.WithRawResponse =
            NotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun draft(): DraftServiceAsync.WithRawResponse = draft

        override fun checks(): CheckServiceAsync.WithRawResponse = checks

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

        private val retrieveContentHandler: Handler<NotificationGetContent> =
            jsonHandler<NotificationGetContent>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> {
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
