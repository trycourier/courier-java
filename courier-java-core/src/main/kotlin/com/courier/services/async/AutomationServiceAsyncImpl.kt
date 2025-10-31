// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.services.async.automations.InvokeServiceAsync
import com.courier.services.async.automations.InvokeServiceAsyncImpl
import java.util.function.Consumer

class AutomationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomationServiceAsync {

    private val withRawResponse: AutomationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invoke: InvokeServiceAsync by lazy { InvokeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AutomationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationServiceAsync =
        AutomationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invoke(): InvokeServiceAsync = invoke

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomationServiceAsync.WithRawResponse {

        private val invoke: InvokeServiceAsync.WithRawResponse by lazy {
            InvokeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationServiceAsync.WithRawResponse =
            AutomationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invoke(): InvokeServiceAsync.WithRawResponse = invoke
    }
}
