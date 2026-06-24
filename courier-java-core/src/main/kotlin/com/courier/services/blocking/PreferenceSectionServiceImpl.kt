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
import com.courier.models.preferencesections.PreferenceSectionArchiveParams
import com.courier.models.preferencesections.PreferenceSectionCreateParams
import com.courier.models.preferencesections.PreferenceSectionGetResponse
import com.courier.models.preferencesections.PreferenceSectionListParams
import com.courier.models.preferencesections.PreferenceSectionListResponse
import com.courier.models.preferencesections.PreferenceSectionPublishParams
import com.courier.models.preferencesections.PreferenceSectionReplaceParams
import com.courier.models.preferencesections.PreferenceSectionRetrieveParams
import com.courier.models.preferencesections.PublishPreferencesResponse
import com.courier.services.blocking.preferencesections.TopicService
import com.courier.services.blocking.preferencesections.TopicServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PreferenceSectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PreferenceSectionService {

    private val withRawResponse: PreferenceSectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val topics: TopicService by lazy { TopicServiceImpl(clientOptions) }

    override fun withRawResponse(): PreferenceSectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceSectionService =
        PreferenceSectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun topics(): TopicService = topics

    override fun create(
        params: PreferenceSectionCreateParams,
        requestOptions: RequestOptions,
    ): PreferenceSectionGetResponse =
        // post /preferences/sections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PreferenceSectionRetrieveParams,
        requestOptions: RequestOptions,
    ): PreferenceSectionGetResponse =
        // get /preferences/sections/{section_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PreferenceSectionListParams,
        requestOptions: RequestOptions,
    ): PreferenceSectionListResponse =
        // get /preferences/sections
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: PreferenceSectionArchiveParams, requestOptions: RequestOptions) {
        // delete /preferences/sections/{section_id}
        withRawResponse().archive(params, requestOptions)
    }

    override fun publish(
        params: PreferenceSectionPublishParams,
        requestOptions: RequestOptions,
    ): PublishPreferencesResponse =
        // post /preferences/publish
        withRawResponse().publish(params, requestOptions).parse()

    override fun replace(
        params: PreferenceSectionReplaceParams,
        requestOptions: RequestOptions,
    ): PreferenceSectionGetResponse =
        // put /preferences/sections/{section_id}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreferenceSectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val topics: TopicService.WithRawResponse by lazy {
            TopicServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreferenceSectionService.WithRawResponse =
            PreferenceSectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun topics(): TopicService.WithRawResponse = topics

        private val createHandler: Handler<PreferenceSectionGetResponse> =
            jsonHandler<PreferenceSectionGetResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PreferenceSectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSectionGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections")
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

        private val retrieveHandler: Handler<PreferenceSectionGetResponse> =
            jsonHandler<PreferenceSectionGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PreferenceSectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSectionGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections", params._pathParam(0))
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

        private val listHandler: Handler<PreferenceSectionListResponse> =
            jsonHandler<PreferenceSectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PreferenceSectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections")
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
            params: PreferenceSectionArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }

        private val publishHandler: Handler<PublishPreferencesResponse> =
            jsonHandler<PublishPreferencesResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: PreferenceSectionPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublishPreferencesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "publish")
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

        private val replaceHandler: Handler<PreferenceSectionGetResponse> =
            jsonHandler<PreferenceSectionGetResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: PreferenceSectionReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSectionGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections", params._pathParam(0))
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
