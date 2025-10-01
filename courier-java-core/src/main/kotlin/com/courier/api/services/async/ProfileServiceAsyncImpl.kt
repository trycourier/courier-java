// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.checkRequired
import com.courier.api.core.handlers.emptyHandler
import com.courier.api.core.handlers.errorBodyHandler
import com.courier.api.core.handlers.errorHandler
import com.courier.api.core.handlers.jsonHandler
import com.courier.api.core.http.HttpMethod
import com.courier.api.core.http.HttpRequest
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponse.Handler
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.core.http.json
import com.courier.api.core.http.parseable
import com.courier.api.core.prepareAsync
import com.courier.api.models.profiles.ProfileCreateParams
import com.courier.api.models.profiles.ProfileCreateResponse
import com.courier.api.models.profiles.ProfileDeleteParams
import com.courier.api.models.profiles.ProfileReplaceParams
import com.courier.api.models.profiles.ProfileReplaceResponse
import com.courier.api.models.profiles.ProfileRetrieveParams
import com.courier.api.models.profiles.ProfileRetrieveResponse
import com.courier.api.models.profiles.ProfileUpdateParams
import com.courier.api.services.async.profiles.ListServiceAsync
import com.courier.api.services.async.profiles.ListServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileServiceAsync {

    private val withRawResponse: ProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lists: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync =
        ProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lists(): ListServiceAsync = lists

    override fun create(
        params: ProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileCreateResponse> =
        // post /profiles/{user_id}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRetrieveResponse> =
        // get /profiles/{user_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // patch /profiles/{user_id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun delete(
        params: ProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /profiles/{user_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun replace(
        params: ProfileReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileReplaceResponse> =
        // put /profiles/{user_id}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lists: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse =
            ProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lists(): ListServiceAsync.WithRawResponse = lists

        private val createHandler: Handler<ProfileCreateResponse> =
            jsonHandler<ProfileCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0))
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

        private val retrieveHandler: Handler<ProfileRetrieveResponse> =
            jsonHandler<ProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0))
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

        private val replaceHandler: Handler<ProfileReplaceResponse> =
            jsonHandler<ProfileReplaceResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: ProfileReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileReplaceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("profiles", params._pathParam(0))
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
