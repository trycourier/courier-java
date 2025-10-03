// File generated from our OpenAPI spec by Stainless.

package com.courier.api.client

import com.courier.api.core.ClientOptions
import com.courier.api.core.getPackageVersion
import com.courier.api.services.blocking.SendService
import com.courier.api.services.blocking.SendServiceImpl
import java.util.function.Consumer

class CourierClientImpl(private val clientOptions: ClientOptions) : CourierClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: CourierClientAsync by lazy { CourierClientAsyncImpl(clientOptions) }

    private val withRawResponse: CourierClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val send: SendService by lazy { SendServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): CourierClientAsync = async

    override fun withRawResponse(): CourierClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClient =
        CourierClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun send(): SendService = send

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourierClient.WithRawResponse {

        private val send: SendService.WithRawResponse by lazy {
            SendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CourierClient.WithRawResponse =
            CourierClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun send(): SendService.WithRawResponse = send
    }
}
