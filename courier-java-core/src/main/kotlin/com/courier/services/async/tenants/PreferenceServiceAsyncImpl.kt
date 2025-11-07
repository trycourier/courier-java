// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants

import com.courier.core.ClientOptions
import com.courier.services.async.tenants.preferences.ItemServiceAsync
import com.courier.services.async.tenants.preferences.ItemServiceAsyncImpl
import java.util.function.Consumer

class PreferenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PreferenceServiceAsync {

    private val withRawResponse: PreferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PreferenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceServiceAsync =
        PreferenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun items(): ItemServiceAsync = items

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreferenceServiceAsync.WithRawResponse {

        private val items: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreferenceServiceAsync.WithRawResponse =
            PreferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun items(): ItemServiceAsync.WithRawResponse = items
    }
}
