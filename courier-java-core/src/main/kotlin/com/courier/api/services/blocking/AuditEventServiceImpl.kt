// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

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
import com.courier.api.core.http.parseable
import com.courier.api.core.prepare
import com.courier.api.models.AuditEvent
import com.courier.api.models.auditevents.AuditEventListParams
import com.courier.api.models.auditevents.AuditEventListResponse
import com.courier.api.models.auditevents.AuditEventRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AuditEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuditEventService {

    private val withRawResponse: AuditEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuditEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventService =
        AuditEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AuditEventRetrieveParams,
        requestOptions: RequestOptions,
    ): AuditEvent =
        // get /audit-events/{audit-event-id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AuditEventListParams,
        requestOptions: RequestOptions,
    ): AuditEventListResponse =
        // get /audit-events
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuditEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventService.WithRawResponse =
            AuditEventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AuditEvent> =
            jsonHandler<AuditEvent>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AuditEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuditEvent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("auditEventId", params.auditEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audit-events", params._pathParam(0))
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

        private val listHandler: Handler<AuditEventListResponse> =
            jsonHandler<AuditEventListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuditEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuditEventListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audit-events")
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
    }
}
