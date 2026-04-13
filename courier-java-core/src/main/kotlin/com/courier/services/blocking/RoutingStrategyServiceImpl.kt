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
import com.courier.models.routingstrategies.AssociatedNotificationListResponse
import com.courier.models.routingstrategies.RoutingStrategyArchiveParams
import com.courier.models.routingstrategies.RoutingStrategyCreateParams
import com.courier.models.routingstrategies.RoutingStrategyGetResponse
import com.courier.models.routingstrategies.RoutingStrategyListNotificationsParams
import com.courier.models.routingstrategies.RoutingStrategyListParams
import com.courier.models.routingstrategies.RoutingStrategyListResponse
import com.courier.models.routingstrategies.RoutingStrategyReplaceParams
import com.courier.models.routingstrategies.RoutingStrategyRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoutingStrategyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RoutingStrategyService {

    private val withRawResponse: RoutingStrategyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoutingStrategyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoutingStrategyService =
        RoutingStrategyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RoutingStrategyCreateParams,
        requestOptions: RequestOptions,
    ): RoutingStrategyGetResponse =
        // post /routing-strategies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RoutingStrategyRetrieveParams,
        requestOptions: RequestOptions,
    ): RoutingStrategyGetResponse =
        // get /routing-strategies/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RoutingStrategyListParams,
        requestOptions: RequestOptions,
    ): RoutingStrategyListResponse =
        // get /routing-strategies
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: RoutingStrategyArchiveParams, requestOptions: RequestOptions) {
        // delete /routing-strategies/{id}
        withRawResponse().archive(params, requestOptions)
    }

    override fun listNotifications(
        params: RoutingStrategyListNotificationsParams,
        requestOptions: RequestOptions,
    ): AssociatedNotificationListResponse =
        // get /routing-strategies/{id}/notifications
        withRawResponse().listNotifications(params, requestOptions).parse()

    override fun replace(
        params: RoutingStrategyReplaceParams,
        requestOptions: RequestOptions,
    ): RoutingStrategyGetResponse =
        // put /routing-strategies/{id}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoutingStrategyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoutingStrategyService.WithRawResponse =
            RoutingStrategyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RoutingStrategyGetResponse> =
            jsonHandler<RoutingStrategyGetResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RoutingStrategyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingStrategyGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies")
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

        private val retrieveHandler: Handler<RoutingStrategyGetResponse> =
            jsonHandler<RoutingStrategyGetResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RoutingStrategyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingStrategyGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0))
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

        private val listHandler: Handler<RoutingStrategyListResponse> =
            jsonHandler<RoutingStrategyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RoutingStrategyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingStrategyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies")
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
            params: RoutingStrategyArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }

        private val listNotificationsHandler: Handler<AssociatedNotificationListResponse> =
            jsonHandler<AssociatedNotificationListResponse>(clientOptions.jsonMapper)

        override fun listNotifications(
            params: RoutingStrategyListNotificationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedNotificationListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0), "notifications")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listNotificationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<RoutingStrategyGetResponse> =
            jsonHandler<RoutingStrategyGetResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: RoutingStrategyReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingStrategyGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing-strategies", params._pathParam(0))
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
