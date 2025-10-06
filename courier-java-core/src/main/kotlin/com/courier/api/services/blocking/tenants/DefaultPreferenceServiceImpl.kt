// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.services.blocking.tenants.defaultpreferences.ItemService
import com.courier.api.services.blocking.tenants.defaultpreferences.ItemServiceImpl
import java.util.function.Consumer

class DefaultPreferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DefaultPreferenceService {

    private val withRawResponse: DefaultPreferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptions) }

    override fun withRawResponse(): DefaultPreferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefaultPreferenceService =
        DefaultPreferenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun items(): ItemService = items

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefaultPreferenceService.WithRawResponse {

        private val items: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefaultPreferenceService.WithRawResponse =
            DefaultPreferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun items(): ItemService.WithRawResponse = items
    }
}
