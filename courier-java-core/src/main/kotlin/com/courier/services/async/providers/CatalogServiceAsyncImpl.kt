// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.providers

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
import com.courier.core.prepareAsync
import com.courier.models.providers.catalog.CatalogListParams
import com.courier.models.providers.catalog.CatalogListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CatalogServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CatalogServiceAsync {

    private val withRawResponse: CatalogServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CatalogServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CatalogServiceAsync =
        CatalogServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CatalogListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CatalogListResponse> =
        // get /providers/catalog
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CatalogServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CatalogServiceAsync.WithRawResponse =
            CatalogServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CatalogListResponse> =
            jsonHandler<CatalogListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CatalogListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CatalogListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("providers", "catalog")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
