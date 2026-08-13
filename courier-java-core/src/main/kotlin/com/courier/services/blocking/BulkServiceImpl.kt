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
import com.courier.models.bulk.BulkAddUsersParams
import com.courier.models.bulk.BulkCreateJobParams
import com.courier.models.bulk.BulkCreateJobResponse
import com.courier.models.bulk.BulkListUsersParams
import com.courier.models.bulk.BulkListUsersResponse
import com.courier.models.bulk.BulkRetrieveJobParams
import com.courier.models.bulk.BulkRetrieveJobResponse
import com.courier.models.bulk.BulkRunJobParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BulkServiceImpl internal constructor(private val clientOptions: ClientOptions) : BulkService {

    private val withRawResponse: BulkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkService =
        BulkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addUsers(params: BulkAddUsersParams, requestOptions: RequestOptions) {
        // post /bulk/{job_id}
        withRawResponse().addUsers(params, requestOptions)
    }

    override fun createJob(
        params: BulkCreateJobParams,
        requestOptions: RequestOptions,
    ): BulkCreateJobResponse =
        // post /bulk
        withRawResponse().createJob(params, requestOptions).parse()

    override fun listUsers(
        params: BulkListUsersParams,
        requestOptions: RequestOptions,
    ): BulkListUsersResponse =
        // get /bulk/{job_id}/users
        withRawResponse().listUsers(params, requestOptions).parse()

    override fun retrieveJob(
        params: BulkRetrieveJobParams,
        requestOptions: RequestOptions,
    ): BulkRetrieveJobResponse =
        // get /bulk/{job_id}
        withRawResponse().retrieveJob(params, requestOptions).parse()

    override fun runJob(params: BulkRunJobParams, requestOptions: RequestOptions) {
        // post /bulk/{job_id}/run
        withRawResponse().runJob(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkService.WithRawResponse =
            BulkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addUsersHandler: Handler<Void?> = emptyHandler()

        override fun addUsers(
            params: BulkAddUsersParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addUsersHandler.handle(it) }
            }
        }

        private val createJobHandler: Handler<BulkCreateJobResponse> =
            jsonHandler<BulkCreateJobResponse>(clientOptions.jsonMapper)

        override fun createJob(
            params: BulkCreateJobParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkCreateJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createJobHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listUsersHandler: Handler<BulkListUsersResponse> =
            jsonHandler<BulkListUsersResponse>(clientOptions.jsonMapper)

        override fun listUsers(
            params: BulkListUsersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkListUsersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk", params._pathParam(0), "users")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listUsersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveJobHandler: Handler<BulkRetrieveJobResponse> =
            jsonHandler<BulkRetrieveJobResponse>(clientOptions.jsonMapper)

        override fun retrieveJob(
            params: BulkRetrieveJobParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkRetrieveJobResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveJobHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val runJobHandler: Handler<Void?> = emptyHandler()

        override fun runJob(
            params: BulkRunJobParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { runJobHandler.handle(it) }
            }
        }
    }
}
