// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.services.blocking.automations.InvokeService
import com.courier.services.blocking.automations.InvokeServiceImpl
import java.util.function.Consumer

class AutomationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomationService {

    private val withRawResponse: AutomationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invoke: InvokeService by lazy { InvokeServiceImpl(clientOptions) }

    override fun withRawResponse(): AutomationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationService =
        AutomationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invoke(): InvokeService = invoke

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomationService.WithRawResponse {

        private val invoke: InvokeService.WithRawResponse by lazy {
            InvokeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationService.WithRawResponse =
            AutomationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invoke(): InvokeService.WithRawResponse = invoke
    }
}
