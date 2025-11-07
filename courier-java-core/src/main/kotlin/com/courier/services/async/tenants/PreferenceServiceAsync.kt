// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants

import com.courier.core.ClientOptions
import com.courier.services.async.tenants.preferences.ItemServiceAsync
import java.util.function.Consumer

interface PreferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceServiceAsync

    fun items(): ItemServiceAsync

    /**
     * A view of [PreferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): PreferenceServiceAsync.WithRawResponse

        fun items(): ItemServiceAsync.WithRawResponse
    }
}
