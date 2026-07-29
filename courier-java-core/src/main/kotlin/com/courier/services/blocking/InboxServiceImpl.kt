// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.services.blocking.inbox.MessageService
import com.courier.services.blocking.inbox.MessageServiceImpl
import java.util.function.Consumer

class InboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxService {

    private val withRawResponse: InboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    override fun withRawResponse(): InboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService =
        InboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage the messages in a user's in-app inbox. */
    override fun messages(): MessageService = messages

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxService.WithRawResponse {

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxService.WithRawResponse =
            InboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage the messages in a user's in-app inbox. */
        override fun messages(): MessageService.WithRawResponse = messages
    }
}
