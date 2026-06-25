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
import com.courier.models.workspacepreferences.PublishPreferencesResponse
import com.courier.models.workspacepreferences.WorkspacePreferenceArchiveParams
import com.courier.models.workspacepreferences.WorkspacePreferenceCreateParams
import com.courier.models.workspacepreferences.WorkspacePreferenceGetResponse
import com.courier.models.workspacepreferences.WorkspacePreferenceListParams
import com.courier.models.workspacepreferences.WorkspacePreferenceListResponse
import com.courier.models.workspacepreferences.WorkspacePreferencePublishParams
import com.courier.models.workspacepreferences.WorkspacePreferenceReplaceParams
import com.courier.models.workspacepreferences.WorkspacePreferenceRetrieveParams
import com.courier.services.async.workspacepreferences.TopicServiceAsync
import com.courier.services.async.workspacepreferences.TopicServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkspacePreferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WorkspacePreferenceServiceAsync {

    private val withRawResponse: WorkspacePreferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val topics: TopicServiceAsync by lazy { TopicServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WorkspacePreferenceServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WorkspacePreferenceServiceAsync =
        WorkspacePreferenceServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun topics(): TopicServiceAsync = topics

    override fun create(
        params: WorkspacePreferenceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        // post /preferences/sections
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: WorkspacePreferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        // get /preferences/sections/{section_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WorkspacePreferenceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceListResponse> =
        // get /preferences/sections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: WorkspacePreferenceArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /preferences/sections/{section_id}
        withRawResponse().archive(params, requestOptions).thenAccept {}

    override fun publish(
        params: WorkspacePreferencePublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublishPreferencesResponse> =
        // post /preferences/publish
        withRawResponse().publish(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: WorkspacePreferenceReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        // put /preferences/sections/{section_id}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspacePreferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val topics: TopicServiceAsync.WithRawResponse by lazy {
            TopicServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspacePreferenceServiceAsync.WithRawResponse =
            WorkspacePreferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun topics(): TopicServiceAsync.WithRawResponse = topics

        private val createHandler: Handler<WorkspacePreferenceGetResponse> =
            jsonHandler<WorkspacePreferenceGetResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WorkspacePreferenceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections")
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

        private val retrieveHandler: Handler<WorkspacePreferenceGetResponse> =
            jsonHandler<WorkspacePreferenceGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WorkspacePreferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections", params._pathParam(0))
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

        private val listHandler: Handler<WorkspacePreferenceListResponse> =
            jsonHandler<WorkspacePreferenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WorkspacePreferenceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "sections")
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
            params: WorkspacePreferenceArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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

        private val publishHandler: Handler<PublishPreferencesResponse> =
            jsonHandler<PublishPreferencesResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: WorkspacePreferencePublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("preferences", "publish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { publishHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<WorkspacePreferenceGetResponse> =
            jsonHandler<WorkspacePreferenceGetResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: WorkspacePreferenceReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> {
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
