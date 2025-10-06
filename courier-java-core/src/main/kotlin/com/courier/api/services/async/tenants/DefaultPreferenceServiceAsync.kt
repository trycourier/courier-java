// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.services.async.tenants.defaultpreferences.ItemServiceAsync
import java.util.function.Consumer

interface DefaultPreferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefaultPreferenceServiceAsync

    fun items(): ItemServiceAsync

    /**
     * A view of [DefaultPreferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): DefaultPreferenceServiceAsync.WithRawResponse

        fun items(): ItemServiceAsync.WithRawResponse
    }
}
