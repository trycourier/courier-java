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
import com.courier.models.audiences.Audience
import com.courier.models.audiences.AudienceDeleteParams
import com.courier.models.audiences.AudienceListMembersParams
import com.courier.models.audiences.AudienceListMembersResponse
import com.courier.models.audiences.AudienceListParams
import com.courier.models.audiences.AudienceListResponse
import com.courier.models.audiences.AudienceRetrieveParams
import com.courier.models.audiences.AudienceUpdateParams
import com.courier.models.audiences.AudienceUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AudienceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudienceService {

    private val withRawResponse: AudienceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudienceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudienceService =
        AudienceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AudienceRetrieveParams,
        requestOptions: RequestOptions,
    ): Audience =
        // get /audiences/{audience_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AudienceUpdateParams,
        requestOptions: RequestOptions,
    ): AudienceUpdateResponse =
        // put /audiences/{audience_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AudienceListParams,
        requestOptions: RequestOptions,
    ): AudienceListResponse =
        // get /audiences
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AudienceDeleteParams, requestOptions: RequestOptions) {
        // delete /audiences/{audience_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listMembers(
        params: AudienceListMembersParams,
        requestOptions: RequestOptions,
    ): AudienceListMembersResponse =
        // get /audiences/{audience_id}/members
        withRawResponse().listMembers(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudienceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudienceService.WithRawResponse =
            AudienceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Audience> =
            jsonHandler<Audience>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AudienceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Audience> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("audienceId", params.audienceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences", params._pathParam(0))
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

        private val updateHandler: Handler<AudienceUpdateResponse> =
            jsonHandler<AudienceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AudienceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudienceUpdateResponse> {
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

        private val listHandler: Handler<AudienceListResponse> =
            jsonHandler<AudienceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AudienceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudienceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences")
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
            params: AudienceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listMembersHandler: Handler<AudienceListMembersResponse> =
            jsonHandler<AudienceListMembersResponse>(clientOptions.jsonMapper)

        override fun listMembers(
            params: AudienceListMembersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudienceListMembersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("audienceId", params.audienceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiences", params._pathParam(0), "members")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
