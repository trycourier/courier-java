// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.automations

import com.courier.api.core.ClientOptions
import java.util.function.Consumer

class InvokeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvokeService {

    private val withRawResponse: InvokeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvokeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService =
        InvokeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvokeService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeService.WithRawResponse =
            InvokeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
