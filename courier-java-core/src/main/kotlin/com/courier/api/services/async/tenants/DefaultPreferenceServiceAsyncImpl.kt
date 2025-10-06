// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.services.async.tenants.defaultpreferences.ItemServiceAsync
import com.courier.api.services.async.tenants.defaultpreferences.ItemServiceAsyncImpl
import java.util.function.Consumer

class DefaultPreferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DefaultPreferenceServiceAsync {

    private val withRawResponse: DefaultPreferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DefaultPreferenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DefaultPreferenceServiceAsync =
        DefaultPreferenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun items(): ItemServiceAsync = items

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefaultPreferenceServiceAsync.WithRawResponse {

        private val items: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefaultPreferenceServiceAsync.WithRawResponse =
            DefaultPreferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun items(): ItemServiceAsync.WithRawResponse = items
    }
}
