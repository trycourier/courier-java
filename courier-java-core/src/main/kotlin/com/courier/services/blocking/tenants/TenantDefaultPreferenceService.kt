// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants

import com.courier.core.ClientOptions
import com.courier.services.blocking.tenants.tenantdefaultpreferences.ItemService
import java.util.function.Consumer

interface TenantDefaultPreferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantDefaultPreferenceService

    fun items(): ItemService

    /**
     * A view of [TenantDefaultPreferenceService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantDefaultPreferenceService.WithRawResponse

        fun items(): ItemService.WithRawResponse
    }
}
