// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.checkRequired
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
import com.courier.models.broadcasts.Broadcast
import com.courier.models.broadcasts.BroadcastArchiveParams
import com.courier.models.broadcasts.BroadcastCancelParams
import com.courier.models.broadcasts.BroadcastCreateParams
import com.courier.models.broadcasts.BroadcastDuplicateParams
import com.courier.models.broadcasts.BroadcastListParams
import com.courier.models.broadcasts.BroadcastListResponse
import com.courier.models.broadcasts.BroadcastPutContentParams
import com.courier.models.broadcasts.BroadcastRetrieveContentParams
import com.courier.models.broadcasts.BroadcastRetrieveParams
import com.courier.models.broadcasts.BroadcastScheduleParams
import com.courier.models.broadcasts.BroadcastSendParams
import com.courier.models.broadcasts.BroadcastUpdateParams
import com.courier.models.notifications.NotificationContentGetResponse
import com.courier.models.notifications.NotificationContentMutationResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create a one-off send to a list or audience, author its content, then send it immediately or
 * schedule it for later.
 */
class BroadcastServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BroadcastService {

    private val withRawResponse: BroadcastService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BroadcastService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService =
        BroadcastServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BroadcastCreateParams, requestOptions: RequestOptions): Broadcast =
        // post /broadcasts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions,
    ): Broadcast =
        // get /broadcasts/{broadcastId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BroadcastUpdateParams, requestOptions: RequestOptions): Broadcast =
        // put /broadcasts/{broadcastId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions,
    ): BroadcastListResponse =
        // get /broadcasts
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: BroadcastArchiveParams,
        requestOptions: RequestOptions,
    ): Broadcast =
        // delete /broadcasts/{broadcastId}
        withRawResponse().archive(params, requestOptions).parse()

    override fun cancel(params: BroadcastCancelParams, requestOptions: RequestOptions): Broadcast =
        // post /broadcasts/{broadcastId}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun duplicate(
        params: BroadcastDuplicateParams,
        requestOptions: RequestOptions,
    ): Broadcast =
        // post /broadcasts/{broadcastId}/duplicate
        withRawResponse().duplicate(params, requestOptions).parse()

    override fun putContent(
        params: BroadcastPutContentParams,
        requestOptions: RequestOptions,
    ): NotificationContentMutationResponse =
        // put /broadcasts/{broadcastId}/content
        withRawResponse().putContent(params, requestOptions).parse()

    override fun retrieveContent(
        params: BroadcastRetrieveContentParams,
        requestOptions: RequestOptions,
    ): NotificationContentGetResponse =
        // get /broadcasts/{broadcastId}/content
        withRawResponse().retrieveContent(params, requestOptions).parse()

    override fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions,
    ): Broadcast =
        // post /broadcasts/{broadcastId}/schedule
        withRawResponse().schedule(params, requestOptions).parse()

    override fun send(params: BroadcastSendParams, requestOptions: RequestOptions): Broadcast =
        // post /broadcasts/{broadcastId}/send
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BroadcastService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastService.WithRawResponse =
            BroadcastServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts")
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

        private val retrieveHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0))
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

        private val updateHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0))
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

        private val listHandler: Handler<BroadcastListResponse> =
            jsonHandler<BroadcastListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts")
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

        private val archiveHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun archive(
            params: BroadcastArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val duplicateHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun duplicate(
            params: BroadcastDuplicateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "duplicate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { duplicateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val putContentHandler: Handler<NotificationContentMutationResponse> =
            jsonHandler<NotificationContentMutationResponse>(clientOptions.jsonMapper)

        override fun putContent(
            params: BroadcastPutContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentMutationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "content")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { putContentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveContentHandler: Handler<NotificationContentGetResponse> =
            jsonHandler<NotificationContentGetResponse>(clientOptions.jsonMapper)

        override fun retrieveContent(
            params: BroadcastRetrieveContentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "content")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveContentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val scheduleHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { scheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<Broadcast> =
            jsonHandler<Broadcast>(clientOptions.jsonMapper)

        override fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("broadcasts", params._pathParam(0), "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
