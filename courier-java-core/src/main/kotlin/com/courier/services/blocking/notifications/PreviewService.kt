// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.core.ClientOptions
import com.courier.services.blocking.notifications.previews.RunService
import java.util.function.Consumer

interface PreviewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService

    /**
     * Render a template's email content on real email clients and read back the screenshots, so you
     * can check how it looks before you send it.
     */
    fun runs(): RunService

    /** A view of [PreviewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService.WithRawResponse

        /**
         * Render a template's email content on real email clients and read back the screenshots, so
         * you can check how it looks before you send it.
         */
        fun runs(): RunService.WithRawResponse
    }
}
