// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.automations

import com.courier.api.core.ClientOptions
import java.util.function.Consumer

interface InvokeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService

    /** A view of [InvokeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService.WithRawResponse
    }
}
