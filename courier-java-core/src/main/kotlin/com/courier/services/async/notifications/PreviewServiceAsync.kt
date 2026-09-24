// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications

import com.courier.core.ClientOptions
import com.courier.services.async.notifications.previews.RunServiceAsync
import java.util.function.Consumer

interface PreviewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewServiceAsync

    /**
     * Render a template's email content on real email clients and read back the screenshots, so you
     * can check how it looks before you send it.
     */
    fun runs(): RunServiceAsync

    /**
     * A view of [PreviewServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreviewServiceAsync.WithRawResponse

        /**
         * Render a template's email content on real email clients and read back the screenshots, so
         * you can check how it looks before you send it.
         */
        fun runs(): RunServiceAsync.WithRawResponse
    }
}
