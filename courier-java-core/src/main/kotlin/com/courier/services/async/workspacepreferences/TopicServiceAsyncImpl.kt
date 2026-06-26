// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.workspacepreferences

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
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicGetResponse
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicListResponse
import com.courier.models.workspacepreferences.topics.TopicArchiveParams
import com.courier.models.workspacepreferences.topics.TopicCreateParams
import com.courier.models.workspacepreferences.topics.TopicListParams
import com.courier.models.workspacepreferences.topics.TopicReplaceParams
import com.courier.models.workspacepreferences.topics.TopicRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TopicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TopicServiceAsync {

    private val withRawResponse: TopicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TopicServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopicServiceAsync =
        TopicServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TopicCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        // post /preferences/sections/{section_id}/topics
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TopicRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        // get /preferences/sections/{section_id}/topics/{topic_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TopicListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceTopicListResponse> =
        // get /preferences/sections/{section_id}/topics
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: TopicArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /preferences/sections/{section_id}/topics/{topic_id}
        withRawResponse().archive(params, requestOptions).thenAccept {}

    override fun replace(
        params: TopicReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        // put /preferences/sections/{section_id}/topics/{topic_id}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TopicServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TopicServiceAsync.WithRawResponse =
            TopicServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WorkspacePreferenceTopicGetResponse> =
            jsonHandler<WorkspacePreferenceTopicGetResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TopicCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections", params._pathParam(0), "topics")
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

        private val retrieveHandler: Handler<WorkspacePreferenceTopicGetResponse> =
            jsonHandler<WorkspacePreferenceTopicGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TopicRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topicId", params.topicId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "preferences",
                        "sections",
                        params._pathParam(0),
                        "topics",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<WorkspacePreferenceTopicListResponse> =
            jsonHandler<WorkspacePreferenceTopicListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TopicListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections", params._pathParam(0), "topics")
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
            params: TopicArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topicId", params.topicId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "preferences",
                        "sections",
                        params._pathParam(0),
                        "topics",
                        params._pathParam(1),
                    )
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

        private val replaceHandler: Handler<WorkspacePreferenceTopicGetResponse> =
            jsonHandler<WorkspacePreferenceTopicGetResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: TopicReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topicId", params.topicId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "preferences",
                        "sections",
                        params._pathParam(0),
                        "topics",
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
}
