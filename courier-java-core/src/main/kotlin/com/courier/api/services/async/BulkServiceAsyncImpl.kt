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
import com.courier.api.models.bulk.BulkAddUsersParams
import com.courier.api.models.bulk.BulkCreateJobParams
import com.courier.api.models.bulk.BulkCreateJobResponse
import com.courier.api.models.bulk.BulkListUsersParams
import com.courier.api.models.bulk.BulkListUsersResponse
import com.courier.api.models.bulk.BulkRetrieveJobParams
import com.courier.api.models.bulk.BulkRetrieveJobResponse
import com.courier.api.models.bulk.BulkRunJobParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BulkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkServiceAsync {

    private val withRawResponse: BulkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkServiceAsync =
        BulkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addUsers(
        params: BulkAddUsersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /bulk/{job_id}
        withRawResponse().addUsers(params, requestOptions).thenAccept {}

    override fun createJob(
        params: BulkCreateJobParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkCreateJobResponse> =
        // post /bulk
        withRawResponse().createJob(params, requestOptions).thenApply { it.parse() }

    override fun listUsers(
        params: BulkListUsersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkListUsersResponse> =
        // get /bulk/{job_id}/users
        withRawResponse().listUsers(params, requestOptions).thenApply { it.parse() }

    override fun retrieveJob(
        params: BulkRetrieveJobParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkRetrieveJobResponse> =
        // get /bulk/{job_id}
        withRawResponse().retrieveJob(params, requestOptions).thenApply { it.parse() }

    override fun runJob(
        params: BulkRunJobParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /bulk/{job_id}/run
        withRawResponse().runJob(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkServiceAsync.WithRawResponse =
            BulkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addUsersHandler: Handler<Void?> = emptyHandler()

        override fun addUsers(
            params: BulkAddUsersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { addUsersHandler.handle(it) }
                    }
                }
        }

        private val createJobHandler: Handler<BulkCreateJobResponse> =
            jsonHandler<BulkCreateJobResponse>(clientOptions.jsonMapper)

        override fun createJob(
            params: BulkCreateJobParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkCreateJobResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createJobHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listUsersHandler: Handler<BulkListUsersResponse> =
            jsonHandler<BulkListUsersResponse>(clientOptions.jsonMapper)

        override fun listUsers(
            params: BulkListUsersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkListUsersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk", params._pathParam(0), "users")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listUsersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveJobHandler: Handler<BulkRetrieveJobResponse> =
            jsonHandler<BulkRetrieveJobResponse>(clientOptions.jsonMapper)

        override fun retrieveJob(
            params: BulkRetrieveJobParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveJobHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val runJobHandler: Handler<Void?> = emptyHandler()

        override fun runJob(
            params: BulkRunJobParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk", params._pathParam(0), "run")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { runJobHandler.handle(it) }
                    }
                }
        }
    }
}
