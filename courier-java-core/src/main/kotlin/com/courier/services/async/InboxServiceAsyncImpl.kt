// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.services.async.inbox.MessageServiceAsync
import com.courier.services.async.inbox.MessageServiceAsyncImpl
import java.util.function.Consumer

class InboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxServiceAsync {

    private val withRawResponse: InboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxServiceAsync =
        InboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messages(): MessageServiceAsync = messages

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxServiceAsync.WithRawResponse {

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxServiceAsync.WithRawResponse =
            InboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messages(): MessageServiceAsync.WithRawResponse = messages
    }
}
