// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.core.ClientOptions
import com.courier.services.blocking.notifications.previews.RunService
import com.courier.services.blocking.notifications.previews.RunServiceImpl
import java.util.function.Consumer

class PreviewServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PreviewService {

    private val withRawResponse: PreviewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun withRawResponse(): PreviewService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService =
        PreviewServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Render a template's email content on real email clients and read back the screenshots, so you
     * can check how it looks before you send it.
     */
    override fun runs(): RunService = runs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreviewService.WithRawResponse {

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreviewService.WithRawResponse =
            PreviewServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Render a template's email content on real email clients and read back the screenshots, so
         * you can check how it looks before you send it.
         */
        override fun runs(): RunService.WithRawResponse = runs
    }
}
