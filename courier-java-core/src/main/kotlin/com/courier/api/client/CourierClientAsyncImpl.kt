// File generated from our OpenAPI spec by Stainless.

package com.courier.api.client

import com.courier.api.core.ClientOptions
import com.courier.api.core.getPackageVersion
import com.courier.api.services.async.SendServiceAsync
import com.courier.api.services.async.SendServiceAsyncImpl
import java.util.function.Consumer

class CourierClientAsyncImpl(private val clientOptions: ClientOptions) : CourierClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: CourierClient by lazy { CourierClientImpl(clientOptions) }

    private val withRawResponse: CourierClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val send: SendServiceAsync by lazy { SendServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): CourierClient = sync

    override fun withRawResponse(): CourierClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClientAsync =
        CourierClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun send(): SendServiceAsync = send

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourierClientAsync.WithRawResponse {

        private val send: SendServiceAsync.WithRawResponse by lazy {
            SendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CourierClientAsync.WithRawResponse =
            CourierClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun send(): SendServiceAsync.WithRawResponse = send
    }
}
