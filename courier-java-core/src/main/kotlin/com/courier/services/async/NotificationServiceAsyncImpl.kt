// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.checkRequired
import com.courier.core.handlers.emptyHandler
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
import com.courier.models.notifications.NotificationArchiveParams
import com.courier.models.notifications.NotificationContentMutationResponse
import com.courier.models.notifications.NotificationCreateParams
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListResponse
import com.courier.models.notifications.NotificationListVersionsParams
import com.courier.models.notifications.NotificationPublishParams
import com.courier.models.notifications.NotificationPutContentParams
import com.courier.models.notifications.NotificationPutElementParams
import com.courier.models.notifications.NotificationPutLocaleParams
import com.courier.models.notifications.NotificationReplaceParams
import com.courier.models.notifications.NotificationRetrieveContentParams
import com.courier.models.notifications.NotificationRetrieveContentResponse
import com.courier.models.notifications.NotificationRetrieveParams
import com.courier.models.notifications.NotificationTemplateGetResponse
import com.courier.models.notifications.NotificationTemplateVersionListResponse
import com.courier.services.async.notifications.CheckServiceAsync
import com.courier.services.async.notifications.CheckServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val checks: CheckServiceAsync by lazy { CheckServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync =
        NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checks(): CheckServiceAsync = checks

    override fun create(
        params: NotificationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateGetResponse> =
        // post /notifications
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateGetResponse> =
        // get /notifications/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationListResponse> =
        // get /notifications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: NotificationArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /notifications/{id}
        withRawResponse().archive(params, requestOptions).thenAccept {}

    override fun listVersions(
        params: NotificationListVersionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        // get /notifications/{id}/versions
        withRawResponse().listVersions(params, requestOptions).thenApply { it.parse() }

    override fun publish(
        params: NotificationPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /notifications/{id}/publish
        withRawResponse().publish(params, requestOptions).thenAccept {}

    override fun putContent(
        params: NotificationPutContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContentMutationResponse> =
        // put /notifications/{id}/content
        withRawResponse().putContent(params, requestOptions).thenApply { it.parse() }

    override fun putElement(
        params: NotificationPutElementParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContentMutationResponse> =
        // put /notifications/{id}/elements/{elementId}
        withRawResponse().putElement(params, requestOptions).thenApply { it.parse() }

    override fun putLocale(
        params: NotificationPutLocaleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContentMutationResponse> =
        // put /notifications/{id}/locales/{localeId}
        withRawResponse().putLocale(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: NotificationReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateGetResponse> =
        // put /notifications/{id}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    override fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationRetrieveContentResponse> =
        // get /notifications/{id}/content
        withRawResponse().retrieveContent(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val checks: CheckServiceAsync.WithRawResponse by lazy {
            CheckServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationServiceAsync.WithRawResponse =
            NotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun checks(): CheckServiceAsync.WithRawResponse = checks

        private val createHandler: Handler<NotificationTemplateGetResponse> =
            jsonHandler<NotificationTemplateGetResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<NotificationTemplateGetResponse> =
            jsonHandler<NotificationTemplateGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

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

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override fun archive(
            params: NotificationArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { archiveHandler.handle(it) }
                    }
                }
        }

        private val listVersionsHandler: Handler<NotificationTemplateVersionListResponse> =
            jsonHandler<NotificationTemplateVersionListResponse>(clientOptions.jsonMapper)

        override fun listVersions(
            params: NotificationListVersionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "versions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listVersionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val publishHandler: Handler<Void?> = emptyHandler()

        override fun publish(
            params: NotificationPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "publish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { publishHandler.handle(it) }
                    }
                }
        }

        private val putContentHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putContent(
            params: NotificationPutContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "content")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { putContentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val putElementHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putElement(
            params: NotificationPutElementParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("elementId", params.elementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "notifications",
                        params._pathParam(0),
                        "elements",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { putElementHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val putLocaleHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putLocale(
            params: NotificationPutLocaleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("localeId", params.localeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "notifications",
                        params._pathParam(0),
                        "locales",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { putLocaleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<NotificationTemplateGetResponse> =
            jsonHandler<NotificationTemplateGetResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: NotificationReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveContentHandler: Handler<NotificationRetrieveContentResponse> =
            jsonHandler<NotificationRetrieveContentResponse>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>> {
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
