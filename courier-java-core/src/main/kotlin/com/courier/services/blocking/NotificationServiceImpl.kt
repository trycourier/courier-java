// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.courier.core.prepare
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
import com.courier.models.notifications.NotificationTemplateMutationResponse
import com.courier.models.notifications.NotificationTemplateVersionListResponse
import com.courier.services.blocking.notifications.CheckService
import com.courier.services.blocking.notifications.CheckServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationService {

    private val withRawResponse: NotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val checks: CheckService by lazy { CheckServiceImpl(clientOptions) }

    override fun withRawResponse(): NotificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService =
        NotificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checks(): CheckService = checks

    override fun create(
        params: NotificationCreateParams,
        requestOptions: RequestOptions,
    ): NotificationTemplateMutationResponse =
        // post /notifications
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): NotificationTemplateGetResponse =
        // get /notifications/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NotificationListParams,
        requestOptions: RequestOptions,
    ): NotificationListResponse =
        // get /notifications
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: NotificationArchiveParams, requestOptions: RequestOptions) {
        // delete /notifications/{id}
        withRawResponse().archive(params, requestOptions)
    }

    override fun listVersions(
        params: NotificationListVersionsParams,
        requestOptions: RequestOptions,
    ): NotificationTemplateVersionListResponse =
        // get /notifications/{id}/versions
        withRawResponse().listVersions(params, requestOptions).parse()

    override fun publish(params: NotificationPublishParams, requestOptions: RequestOptions) {
        // post /notifications/{id}/publish
        withRawResponse().publish(params, requestOptions)
    }

    override fun putContent(
        params: NotificationPutContentParams,
        requestOptions: RequestOptions,
    ): NotificationContentMutationResponse =
        // put /notifications/{id}/content
        withRawResponse().putContent(params, requestOptions).parse()

    override fun putElement(
        params: NotificationPutElementParams,
        requestOptions: RequestOptions,
    ): NotificationContentMutationResponse =
        // put /notifications/{id}/elements/{elementId}
        withRawResponse().putElement(params, requestOptions).parse()

    override fun putLocale(
        params: NotificationPutLocaleParams,
        requestOptions: RequestOptions,
    ): NotificationContentMutationResponse =
        // put /notifications/{id}/locales/{localeId}
        withRawResponse().putLocale(params, requestOptions).parse()

    override fun replace(
        params: NotificationReplaceParams,
        requestOptions: RequestOptions,
    ): NotificationTemplateMutationResponse =
        // put /notifications/{id}
        withRawResponse().replace(params, requestOptions).parse()

    override fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions,
    ): NotificationRetrieveContentResponse =
        // get /notifications/{id}/content
        withRawResponse().retrieveContent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val checks: CheckService.WithRawResponse by lazy {
            CheckServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse =
            NotificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun checks(): CheckService.WithRawResponse = checks

        private val createHandler: Handler<NotificationTemplateMutationResponse> =
            jsonHandler<NotificationTemplateMutationResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationTemplateMutationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications")
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

        private val retrieveHandler: Handler<NotificationTemplateGetResponse> =
            jsonHandler<NotificationTemplateGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationTemplateGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0))
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

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override fun archive(
            params: NotificationArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }

        private val listVersionsHandler: Handler<NotificationTemplateVersionListResponse> =
            jsonHandler<NotificationTemplateVersionListResponse>(clientOptions.jsonMapper)

        override fun listVersions(
            params: NotificationListVersionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationTemplateVersionListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notifications", params._pathParam(0), "versions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listVersionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val publishHandler: Handler<Void?> = emptyHandler()

        override fun publish(
            params: NotificationPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { publishHandler.handle(it) }
            }
        }

        private val putContentHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putContent(
            params: NotificationPutContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentMutationResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { putContentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val putElementHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putElement(
            params: NotificationPutElementParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentMutationResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { putElementHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val putLocaleHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putLocale(
            params: NotificationPutLocaleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentMutationResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { putLocaleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<NotificationTemplateMutationResponse> =
            jsonHandler<NotificationTemplateMutationResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: NotificationReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationTemplateMutationResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveContentHandler: Handler<NotificationRetrieveContentResponse> =
            jsonHandler<NotificationRetrieveContentResponse>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationRetrieveContentResponse> {
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
