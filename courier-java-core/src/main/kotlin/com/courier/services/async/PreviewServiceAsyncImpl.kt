// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.core.prepareAsync
import com.courier.models.previews.DeviceSet
import com.courier.models.previews.DeviceSetListResponse
import com.courier.models.previews.PreviewArchiveDeviceSetParams
import com.courier.models.previews.PreviewCreateDeviceSetParams
import com.courier.models.previews.PreviewDeviceListResponse
import com.courier.models.previews.PreviewListDeviceSetsParams
import com.courier.models.previews.PreviewListDevicesParams
import com.courier.models.previews.PreviewRetrieveDeviceSetParams
import com.courier.models.previews.PreviewUpdateDeviceSetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Render a template's email content on real email clients and read back the screenshots, so you can
 * check how it looks before you send it.
 */
class PreviewServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PreviewServiceAsync {

    private val withRawResponse: PreviewServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PreviewServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewServiceAsync =
        PreviewServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun archiveDeviceSet(
        params: PreviewArchiveDeviceSetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeviceSet> =
        // delete /previews/device-sets/{deviceSetId}
        withRawResponse().archiveDeviceSet(params, requestOptions).thenApply { it.parse() }

    override fun createDeviceSet(
        params: PreviewCreateDeviceSetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeviceSet> =
        // post /previews/device-sets
        withRawResponse().createDeviceSet(params, requestOptions).thenApply { it.parse() }

    override fun listDeviceSets(
        params: PreviewListDeviceSetsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeviceSetListResponse> =
        // get /previews/device-sets
        withRawResponse().listDeviceSets(params, requestOptions).thenApply { it.parse() }

    override fun listDevices(
        params: PreviewListDevicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreviewDeviceListResponse> =
        // get /previews/devices
        withRawResponse().listDevices(params, requestOptions).thenApply { it.parse() }

    override fun retrieveDeviceSet(
        params: PreviewRetrieveDeviceSetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeviceSet> =
        // get /previews/device-sets/{deviceSetId}
        withRawResponse().retrieveDeviceSet(params, requestOptions).thenApply { it.parse() }

    override fun updateDeviceSet(
        params: PreviewUpdateDeviceSetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeviceSet> =
        // put /previews/device-sets/{deviceSetId}
        withRawResponse().updateDeviceSet(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreviewServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreviewServiceAsync.WithRawResponse =
            PreviewServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val archiveDeviceSetHandler: Handler<DeviceSet> =
            jsonHandler<DeviceSet>(clientOptions.jsonMapper)

        override fun archiveDeviceSet(
            params: PreviewArchiveDeviceSetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeviceSet>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("deviceSetId", params.deviceSetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("previews", "device-sets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveDeviceSetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createDeviceSetHandler: Handler<DeviceSet> =
            jsonHandler<DeviceSet>(clientOptions.jsonMapper)

        override fun createDeviceSet(
            params: PreviewCreateDeviceSetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeviceSet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("previews", "device-sets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createDeviceSetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listDeviceSetsHandler: Handler<DeviceSetListResponse> =
            jsonHandler<DeviceSetListResponse>(clientOptions.jsonMapper)

        override fun listDeviceSets(
            params: PreviewListDeviceSetsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeviceSetListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("previews", "device-sets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listDeviceSetsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listDevicesHandler: Handler<PreviewDeviceListResponse> =
            jsonHandler<PreviewDeviceListResponse>(clientOptions.jsonMapper)

        override fun listDevices(
            params: PreviewListDevicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreviewDeviceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("previews", "devices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listDevicesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveDeviceSetHandler: Handler<DeviceSet> =
            jsonHandler<DeviceSet>(clientOptions.jsonMapper)

        override fun retrieveDeviceSet(
            params: PreviewRetrieveDeviceSetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeviceSet>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("deviceSetId", params.deviceSetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("previews", "device-sets", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveDeviceSetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateDeviceSetHandler: Handler<DeviceSet> =
            jsonHandler<DeviceSet>(clientOptions.jsonMapper)

        override fun updateDeviceSet(
            params: PreviewUpdateDeviceSetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeviceSet>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("deviceSetId", params.deviceSetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("previews", "device-sets", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateDeviceSetHandler.handle(it) }
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
