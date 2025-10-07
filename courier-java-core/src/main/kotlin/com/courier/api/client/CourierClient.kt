// File generated from our OpenAPI spec by Stainless.

package com.courier.api.client

import com.courier.api.core.ClientOptions
import com.courier.api.services.blocking.AudienceService
import com.courier.api.services.blocking.AuditEventService
import com.courier.api.services.blocking.AuthService
import com.courier.api.services.blocking.AutomationService
import com.courier.api.services.blocking.BrandService
import com.courier.api.services.blocking.BulkService
import com.courier.api.services.blocking.InboundService
import com.courier.api.services.blocking.ListService
import com.courier.api.services.blocking.MessageService
import com.courier.api.services.blocking.NotificationService
import com.courier.api.services.blocking.ProfileService
import com.courier.api.services.blocking.RequestService
import com.courier.api.services.blocking.SendService
import com.courier.api.services.blocking.TenantService
import com.courier.api.services.blocking.TranslationService
import com.courier.api.services.blocking.UserService
import java.util.function.Consumer

/**
 * A client for interacting with the Courier REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface CourierClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): CourierClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClient

    fun send(): SendService

    fun audiences(): AudienceService

    fun auditEvents(): AuditEventService

    fun auth(): AuthService

    fun automations(): AutomationService

    fun brands(): BrandService

    fun bulk(): BulkService

    fun inbound(): InboundService

    fun lists(): ListService

    fun messages(): MessageService

    fun requests(): RequestService

    fun notifications(): NotificationService

    fun profiles(): ProfileService

    fun tenants(): TenantService

    fun translations(): TranslationService

    fun users(): UserService

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

    /** A view of [CourierClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClient.WithRawResponse

        fun send(): SendService.WithRawResponse

        fun audiences(): AudienceService.WithRawResponse

        fun auditEvents(): AuditEventService.WithRawResponse

        fun auth(): AuthService.WithRawResponse

        fun automations(): AutomationService.WithRawResponse

        fun brands(): BrandService.WithRawResponse

        fun bulk(): BulkService.WithRawResponse

        fun inbound(): InboundService.WithRawResponse

        fun lists(): ListService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        fun requests(): RequestService.WithRawResponse

        fun notifications(): NotificationService.WithRawResponse

        fun profiles(): ProfileService.WithRawResponse

        fun tenants(): TenantService.WithRawResponse

        fun translations(): TranslationService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
