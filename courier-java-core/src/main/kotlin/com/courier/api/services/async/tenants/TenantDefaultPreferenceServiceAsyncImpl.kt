// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.services.async.tenants.tenantdefaultpreferences.ItemServiceAsync
import com.courier.api.services.async.tenants.tenantdefaultpreferences.ItemServiceAsyncImpl
import java.util.function.Consumer

class TenantDefaultPreferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    TenantDefaultPreferenceServiceAsync {

    private val withRawResponse: TenantDefaultPreferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TenantDefaultPreferenceServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TenantDefaultPreferenceServiceAsync =
        TenantDefaultPreferenceServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun items(): ItemServiceAsync = items

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TenantDefaultPreferenceServiceAsync.WithRawResponse {

        private val items: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantDefaultPreferenceServiceAsync.WithRawResponse =
            TenantDefaultPreferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun items(): ItemServiceAsync.WithRawResponse = items
    }
}
