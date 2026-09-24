// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications

import com.courier.core.ClientOptions
import com.courier.services.async.notifications.previews.RunServiceAsync
import com.courier.services.async.notifications.previews.RunServiceAsyncImpl
import java.util.function.Consumer

class PreviewServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PreviewServiceAsync {

    private val withRawResponse: PreviewServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PreviewServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewServiceAsync =
        PreviewServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Render a template's email content on real email clients and read back the screenshots, so you
     * can check how it looks before you send it.
     */
    override fun runs(): RunServiceAsync = runs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreviewServiceAsync.WithRawResponse {

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreviewServiceAsync.WithRawResponse =
            PreviewServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Render a template's email content on real email clients and read back the screenshots, so
         * you can check how it looks before you send it.
         */
        override fun runs(): RunServiceAsync.WithRawResponse = runs
    }
}
