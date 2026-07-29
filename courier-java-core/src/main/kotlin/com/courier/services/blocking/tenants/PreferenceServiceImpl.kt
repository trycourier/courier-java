// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants

import com.courier.core.ClientOptions
import com.courier.services.blocking.tenants.preferences.ItemService
import com.courier.services.blocking.tenants.preferences.ItemServiceImpl
import java.util.function.Consumer

class PreferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PreferenceService {

    private val withRawResponse: PreferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptions) }

    override fun withRawResponse(): PreferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceService =
        PreferenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Manage tenants — the organizations, teams, or accounts your users belong to — along with
     * their users and default preferences.
     */
    override fun items(): ItemService = items

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreferenceService.WithRawResponse {

        private val items: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreferenceService.WithRawResponse =
            PreferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Manage tenants — the organizations, teams, or accounts your users belong to — along with
         * their users and default preferences.
         */
        override fun items(): ItemService.WithRawResponse = items
    }
}
