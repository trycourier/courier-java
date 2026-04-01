// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.providers

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.handlers.errorBodyHandler
import com.courier.core.handlers.errorHandler
import com.courier.core.handlers.jsonHandler
import com.courier.core.http.HttpMethod
import com.courier.core.http.HttpRequest
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponse.Handler
import com.courier.core.http.HttpResponseFor
import com.courier.core.http.parseable
import com.courier.core.prepare
import com.courier.models.providers.catalog.CatalogListParams
import com.courier.models.providers.catalog.CatalogListResponse
import java.util.function.Consumer

class CatalogServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CatalogService {

    private val withRawResponse: CatalogService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CatalogService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CatalogService =
        CatalogServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CatalogListParams,
        requestOptions: RequestOptions,
    ): CatalogListResponse =
        // get /providers/catalog
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CatalogService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CatalogService.WithRawResponse =
            CatalogServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CatalogListResponse> =
            jsonHandler<CatalogListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CatalogListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CatalogListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("providers", "catalog")
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
