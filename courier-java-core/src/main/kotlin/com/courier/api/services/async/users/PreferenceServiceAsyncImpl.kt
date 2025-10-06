// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.users

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.checkRequired
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
import com.courier.api.models.users.preferences.PreferenceRetrieveParams
import com.courier.api.models.users.preferences.PreferenceRetrieveResponse
import com.courier.api.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.api.models.users.preferences.PreferenceRetrieveTopicResponse
import com.courier.api.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import com.courier.api.models.users.preferences.PreferenceUpdateOrCreateTopicResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PreferenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PreferenceServiceAsync {

    private val withRawResponse: PreferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PreferenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceServiceAsync =
        PreferenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PreferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreferenceRetrieveResponse> =
        // get /users/{user_id}/preferences
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTopic(
        params: PreferenceRetrieveTopicParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreferenceRetrieveTopicResponse> =
        // get /users/{user_id}/preferences/{topic_id}
        withRawResponse().retrieveTopic(params, requestOptions).thenApply { it.parse() }

    override fun updateOrCreateTopic(
        params: PreferenceUpdateOrCreateTopicParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreferenceUpdateOrCreateTopicResponse> =
        // put /users/{user_id}/preferences/{topic_id}
        withRawResponse().updateOrCreateTopic(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreferenceServiceAsync.WithRawResponse =
            PreferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PreferenceRetrieveResponse> =
            jsonHandler<PreferenceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PreferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "preferences")
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

        private val retrieveTopicHandler: Handler<PreferenceRetrieveTopicResponse> =
            jsonHandler<PreferenceRetrieveTopicResponse>(clientOptions.jsonMapper)

        override fun retrieveTopic(
            params: PreferenceRetrieveTopicParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveTopicResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topicId", params.topicId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "users",
                        params._pathParam(0),
                        "preferences",
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
                            .use { retrieveTopicHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateOrCreateTopicHandler: Handler<PreferenceUpdateOrCreateTopicResponse> =
            jsonHandler<PreferenceUpdateOrCreateTopicResponse>(clientOptions.jsonMapper)

        override fun updateOrCreateTopic(
            params: PreferenceUpdateOrCreateTopicParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreferenceUpdateOrCreateTopicResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("topicId", params.topicId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "users",
                        params._pathParam(0),
                        "preferences",
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
                            .use { updateOrCreateTopicHandler.handle(it) }
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
