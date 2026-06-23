// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.journeys

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
import com.courier.models.journeys.JourneyTemplateGetResponse
import com.courier.models.journeys.JourneyTemplateListResponse
import com.courier.models.journeys.templates.TemplateArchiveParams
import com.courier.models.journeys.templates.TemplateCreateParams
import com.courier.models.journeys.templates.TemplateListParams
import com.courier.models.journeys.templates.TemplateListVersionsParams
import com.courier.models.journeys.templates.TemplatePublishParams
import com.courier.models.journeys.templates.TemplatePutContentParams
import com.courier.models.journeys.templates.TemplatePutLocaleParams
import com.courier.models.journeys.templates.TemplateReplaceParams
import com.courier.models.journeys.templates.TemplateRetrieveContentParams
import com.courier.models.journeys.templates.TemplateRetrieveParams
import com.courier.models.notifications.NotificationContentGetResponse
import com.courier.models.notifications.NotificationContentMutationResponse
import com.courier.models.notifications.NotificationTemplateVersionListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplateService {

    private val withRawResponse: TemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService =
        TemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions,
    ): JourneyTemplateGetResponse =
        // post /journeys/{templateId}/templates
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): JourneyTemplateGetResponse =
        // get /journeys/{templateId}/templates/{notificationId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions,
    ): JourneyTemplateListResponse =
        // get /journeys/{templateId}/templates
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: TemplateArchiveParams, requestOptions: RequestOptions) {
        // delete /journeys/{templateId}/templates/{notificationId}
        withRawResponse().archive(params, requestOptions)
    }

    override fun listVersions(
        params: TemplateListVersionsParams,
        requestOptions: RequestOptions,
    ): NotificationTemplateVersionListResponse =
        // get /journeys/{templateId}/templates/{notificationId}/versions
        withRawResponse().listVersions(params, requestOptions).parse()

    override fun publish(params: TemplatePublishParams, requestOptions: RequestOptions) {
        // post /journeys/{templateId}/templates/{notificationId}/publish
        withRawResponse().publish(params, requestOptions)
    }

    override fun putContent(
        params: TemplatePutContentParams,
        requestOptions: RequestOptions,
    ): NotificationContentMutationResponse =
        // put /journeys/{templateId}/templates/{notificationId}/content
        withRawResponse().putContent(params, requestOptions).parse()

    override fun putLocale(
        params: TemplatePutLocaleParams,
        requestOptions: RequestOptions,
    ): NotificationContentMutationResponse =
        // put /journeys/{templateId}/templates/{notificationId}/locales/{localeId}
        withRawResponse().putLocale(params, requestOptions).parse()

    override fun replace(
        params: TemplateReplaceParams,
        requestOptions: RequestOptions,
    ): JourneyTemplateGetResponse =
        // put /journeys/{templateId}/templates/{notificationId}
        withRawResponse().replace(params, requestOptions).parse()

    override fun retrieveContent(
        params: TemplateRetrieveContentParams,
        requestOptions: RequestOptions,
    ): NotificationContentGetResponse =
        // get /journeys/{templateId}/templates/{notificationId}/content
        withRawResponse().retrieveContent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateService.WithRawResponse =
            TemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<JourneyTemplateGetResponse> =
            jsonHandler<JourneyTemplateGetResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyTemplateGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "templates")
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

        private val retrieveHandler: Handler<JourneyTemplateGetResponse> =
            jsonHandler<JourneyTemplateGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyTemplateGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<JourneyTemplateListResponse> =
            jsonHandler<JourneyTemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyTemplateListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "templates")
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
            params: TemplateArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                    )
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
            params: TemplateListVersionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationTemplateVersionListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                        "versions",
                    )
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
            params: TemplatePublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                        "publish",
                    )
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
            params: TemplatePutContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentMutationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                        "content",
                    )
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

        private val putLocaleHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putLocale(
            params: TemplatePutLocaleParams,
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
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                        "locales",
                        params._pathParam(2),
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

        private val replaceHandler: Handler<JourneyTemplateGetResponse> =
            jsonHandler<JourneyTemplateGetResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: TemplateReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyTemplateGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                    )
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

        private val retrieveContentHandler: Handler<NotificationContentGetResponse> =
            jsonHandler<NotificationContentGetResponse>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: TemplateRetrieveContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("notificationId", params.notificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "journeys",
                        params._pathParam(0),
                        "templates",
                        params._pathParam(1),
                        "content",
                    )
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
