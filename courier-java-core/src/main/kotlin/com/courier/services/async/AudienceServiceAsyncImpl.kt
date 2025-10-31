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
import com.courier.models.audiences.Audience
import com.courier.models.audiences.AudienceDeleteParams
import com.courier.models.audiences.AudienceListMembersParams
import com.courier.models.audiences.AudienceListMembersResponse
import com.courier.models.audiences.AudienceListParams
import com.courier.models.audiences.AudienceListResponse
import com.courier.models.audiences.AudienceRetrieveParams
import com.courier.models.audiences.AudienceUpdateParams
import com.courier.models.audiences.AudienceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AudienceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudienceServiceAsync {

    private val withRawResponse: AudienceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudienceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudienceServiceAsync =
        AudienceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AudienceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Audience> =
        // get /audiences/{audience_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AudienceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudienceUpdateResponse> =
        // put /audiences/{audience_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AudienceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudienceListResponse> =
        // get /audiences
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AudienceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /audiences/{audience_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun listMembers(
        params: AudienceListMembersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudienceListMembersResponse> =
        // get /audiences/{audience_id}/members
        withRawResponse().listMembers(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudienceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudienceServiceAsync.WithRawResponse =
            AudienceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Audience> =
            jsonHandler<Audience>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AudienceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Audience>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("audienceId", params.audienceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences", params._pathParam(0))
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

        private val updateHandler: Handler<AudienceUpdateResponse> =
            jsonHandler<AudienceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AudienceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("audienceId", params.audienceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AudienceListResponse> =
            jsonHandler<AudienceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AudienceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudienceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AudienceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("audienceId", params.audienceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val listMembersHandler: Handler<AudienceListMembersResponse> =
            jsonHandler<AudienceListMembersResponse>(clientOptions.jsonMapper)

        override fun listMembers(
            params: AudienceListMembersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("audienceId", params.audienceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences", params._pathParam(0), "members")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listMembersHandler.handle(it) }
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
