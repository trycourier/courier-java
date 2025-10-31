// File generated from our OpenAPI spec by Stainless.

package com.courier.client

import com.courier.core.ClientOptions
import com.courier.services.async.AudienceServiceAsync
import com.courier.services.async.AuditEventServiceAsync
import com.courier.services.async.AuthServiceAsync
import com.courier.services.async.AutomationServiceAsync
import com.courier.services.async.BrandServiceAsync
import com.courier.services.async.BulkServiceAsync
import com.courier.services.async.InboundServiceAsync
import com.courier.services.async.ListServiceAsync
import com.courier.services.async.MessageServiceAsync
import com.courier.services.async.NotificationServiceAsync
import com.courier.services.async.ProfileServiceAsync
import com.courier.services.async.RequestServiceAsync
import com.courier.services.async.SendServiceAsync
import com.courier.services.async.TenantServiceAsync
import com.courier.services.async.TranslationServiceAsync
import com.courier.services.async.UserServiceAsync
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

    fun audiences(): AudienceServiceAsync

    fun auditEvents(): AuditEventServiceAsync

    fun auth(): AuthServiceAsync

    fun automations(): AutomationServiceAsync

    fun brands(): BrandServiceAsync

    fun bulk(): BulkServiceAsync

    fun inbound(): InboundServiceAsync

    fun lists(): ListServiceAsync

    fun messages(): MessageServiceAsync

    fun requests(): RequestServiceAsync

    fun notifications(): NotificationServiceAsync

    fun profiles(): ProfileServiceAsync

    fun tenants(): TenantServiceAsync

    fun translations(): TranslationServiceAsync

    fun users(): UserServiceAsync

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

        fun audiences(): AudienceServiceAsync.WithRawResponse

        fun auditEvents(): AuditEventServiceAsync.WithRawResponse

        fun auth(): AuthServiceAsync.WithRawResponse

        fun automations(): AutomationServiceAsync.WithRawResponse

        fun brands(): BrandServiceAsync.WithRawResponse

        fun bulk(): BulkServiceAsync.WithRawResponse

        fun inbound(): InboundServiceAsync.WithRawResponse

        fun lists(): ListServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun requests(): RequestServiceAsync.WithRawResponse

        fun notifications(): NotificationServiceAsync.WithRawResponse

        fun profiles(): ProfileServiceAsync.WithRawResponse

        fun tenants(): TenantServiceAsync.WithRawResponse

        fun translations(): TranslationServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse
    }
}
