// File generated from our OpenAPI spec by Stainless.

package com.courier.api.client

import com.courier.api.core.ClientOptions
import com.courier.api.services.async.AudienceServiceAsync
import com.courier.api.services.async.AuditEventServiceAsync
import com.courier.api.services.async.AuthServiceAsync
import com.courier.api.services.async.AutomationServiceAsync
import com.courier.api.services.async.BrandServiceAsync
import com.courier.api.services.async.BulkServiceAsync
import com.courier.api.services.async.InboundServiceAsync
import com.courier.api.services.async.ListServiceAsync
import com.courier.api.services.async.MessageServiceAsync
import com.courier.api.services.async.NotificationServiceAsync
import com.courier.api.services.async.ProfileServiceAsync
import com.courier.api.services.async.RequestServiceAsync
import com.courier.api.services.async.SendServiceAsync
import com.courier.api.services.async.TenantServiceAsync
import com.courier.api.services.async.TranslationServiceAsync
import com.courier.api.services.async.UserServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Courier REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface CourierClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): CourierClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClientAsync

    fun send(): SendServiceAsync

    fun tenants(): TenantServiceAsync

    fun audiences(): AudienceServiceAsync

    fun bulk(): BulkServiceAsync

    fun users(): UserServiceAsync

    fun auditEvents(): AuditEventServiceAsync

    fun automations(): AutomationServiceAsync

    fun brands(): BrandServiceAsync

    fun lists(): ListServiceAsync

    fun messages(): MessageServiceAsync

    fun notifications(): NotificationServiceAsync

    fun auth(): AuthServiceAsync

    fun inbound(): InboundServiceAsync

    fun requests(): RequestServiceAsync

    fun profiles(): ProfileServiceAsync

    fun translations(): TranslationServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [CourierClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CourierClientAsync.WithRawResponse

        fun send(): SendServiceAsync.WithRawResponse

        fun tenants(): TenantServiceAsync.WithRawResponse

        fun audiences(): AudienceServiceAsync.WithRawResponse

        fun bulk(): BulkServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun auditEvents(): AuditEventServiceAsync.WithRawResponse

        fun automations(): AutomationServiceAsync.WithRawResponse

        fun brands(): BrandServiceAsync.WithRawResponse

        fun lists(): ListServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun notifications(): NotificationServiceAsync.WithRawResponse

        fun auth(): AuthServiceAsync.WithRawResponse

        fun inbound(): InboundServiceAsync.WithRawResponse

        fun requests(): RequestServiceAsync.WithRawResponse

        fun profiles(): ProfileServiceAsync.WithRawResponse

        fun translations(): TranslationServiceAsync.WithRawResponse
    }
}
