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
import com.courier.models.journeys.JourneyArchiveParams
import com.courier.models.journeys.JourneyCreateParams
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneyListVersionsParams
import com.courier.models.journeys.JourneyPublishParams
import com.courier.models.journeys.JourneyReplaceParams
import com.courier.models.journeys.JourneyResponse
import com.courier.models.journeys.JourneyRetrieveParams
import com.courier.models.journeys.JourneyVersionsListResponse
import com.courier.models.journeys.JourneysInvokeResponse
import com.courier.models.journeys.JourneysListResponse
import com.courier.services.blocking.journeys.TemplateService
import com.courier.services.blocking.journeys.TemplateServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JourneyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    JourneyService {

    private val withRawResponse: JourneyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val templates: TemplateService by lazy { TemplateServiceImpl(clientOptions) }

    override fun withRawResponse(): JourneyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyService =
        JourneyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun templates(): TemplateService = templates

    override fun create(
        params: JourneyCreateParams,
        requestOptions: RequestOptions,
    ): JourneyResponse =
        // post /journeys
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: JourneyRetrieveParams,
        requestOptions: RequestOptions,
    ): JourneyResponse =
        // get /journeys/{templateId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: JourneyListParams,
        requestOptions: RequestOptions,
    ): JourneysListResponse =
        // get /journeys
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: JourneyArchiveParams, requestOptions: RequestOptions) {
        // delete /journeys/{templateId}
        withRawResponse().archive(params, requestOptions)
    }

    override fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions,
    ): JourneysInvokeResponse =
        // post /journeys/{templateId}/invoke
        withRawResponse().invoke(params, requestOptions).parse()

    override fun listVersions(
        params: JourneyListVersionsParams,
        requestOptions: RequestOptions,
    ): JourneyVersionsListResponse =
        // get /journeys/{templateId}/versions
        withRawResponse().listVersions(params, requestOptions).parse()

    override fun publish(
        params: JourneyPublishParams,
        requestOptions: RequestOptions,
    ): JourneyResponse =
        // post /journeys/{templateId}/publish
        withRawResponse().publish(params, requestOptions).parse()

    override fun replace(
        params: JourneyReplaceParams,
        requestOptions: RequestOptions,
    ): JourneyResponse =
        // put /journeys/{templateId}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JourneyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JourneyService.WithRawResponse =
            JourneyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun templates(): TemplateService.WithRawResponse = templates

        private val createHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun create(
            params: JourneyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys")
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

        private val retrieveHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: JourneyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0))
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

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override fun archive(
            params: JourneyArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
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

        private val listVersionsHandler: Handler<JourneyVersionsListResponse> =
            jsonHandler<JourneyVersionsListResponse>(clientOptions.jsonMapper)

        override fun listVersions(
            params: JourneyListVersionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyVersionsListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "versions")
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

        private val publishHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: JourneyPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0), "publish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { publishHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<JourneyResponse> =
            jsonHandler<JourneyResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: JourneyReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("journeys", params._pathParam(0))
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
    }
}
