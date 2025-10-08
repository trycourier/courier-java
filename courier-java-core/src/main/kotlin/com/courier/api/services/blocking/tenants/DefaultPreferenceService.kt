// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.services.blocking.tenants.defaultpreferences.ItemService
import java.util.function.Consumer

interface DefaultPreferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefaultPreferenceService

    fun items(): ItemService

    /**
     * A view of [DefaultPreferenceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefaultPreferenceService.WithRawResponse

        fun items(): ItemService.WithRawResponse
    }
}
