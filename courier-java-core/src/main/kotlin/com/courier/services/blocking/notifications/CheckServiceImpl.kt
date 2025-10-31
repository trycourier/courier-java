// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

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
import com.courier.models.notifications.checks.CheckDeleteParams
import com.courier.models.notifications.checks.CheckListParams
import com.courier.models.notifications.checks.CheckListResponse
import com.courier.models.notifications.checks.CheckUpdateParams
import com.courier.models.notifications.checks.CheckUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckService {

    private val withRawResponse: CheckService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckService =
        CheckServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: CheckUpdateParams,
        requestOptions: RequestOptions,
    ): CheckUpdateResponse =
        // put /notifications/{id}/{submissionId}/checks
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: CheckListParams, requestOptions: RequestOptions): CheckListResponse =
        // get /notifications/{id}/{submissionId}/checks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CheckDeleteParams, requestOptions: RequestOptions) {
        // delete /notifications/{id}/{submissionId}/checks
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckService.WithRawResponse =
            CheckServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<CheckUpdateResponse> =
            jsonHandler<CheckUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CheckUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("submissionId", params.submissionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "notifications",
                        params._pathParam(0),
                        params._pathParam(1),
                        "checks",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CheckListResponse> =
            jsonHandler<CheckListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CheckListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("submissionId", params.submissionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "notifications",
                        params._pathParam(0),
                        params._pathParam(1),
                        "checks",
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CheckDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("submissionId", params.submissionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "notifications",
                        params._pathParam(0),
                        params._pathParam(1),
                        "checks",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
