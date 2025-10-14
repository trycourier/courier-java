// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.services.blocking.tenants.tenantdefaultpreferences.ItemService
import com.courier.api.services.blocking.tenants.tenantdefaultpreferences.ItemServiceImpl
import java.util.function.Consumer

class TenantDefaultPreferenceServiceImpl
internal constructor(private val clientOptions: ClientOptions) : TenantDefaultPreferenceService {

    private val withRawResponse: TenantDefaultPreferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptions) }

    override fun withRawResponse(): TenantDefaultPreferenceService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TenantDefaultPreferenceService =
        TenantDefaultPreferenceServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun items(): ItemService = items

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TenantDefaultPreferenceService.WithRawResponse {

        private val items: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantDefaultPreferenceService.WithRawResponse =
            TenantDefaultPreferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun items(): ItemService.WithRawResponse = items
    }
}
