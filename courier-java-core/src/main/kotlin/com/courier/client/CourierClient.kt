// File generated from our OpenAPI spec by Stainless.

package com.courier.client

import com.courier.core.ClientOptions
import com.courier.services.blocking.AudienceService
import com.courier.services.blocking.AuditEventService
import com.courier.services.blocking.AuthService
import com.courier.services.blocking.AutomationService
import com.courier.services.blocking.BrandService
import com.courier.services.blocking.BroadcastService
import com.courier.services.blocking.BulkService
import com.courier.services.blocking.DigestService
import com.courier.services.blocking.InboundService
import com.courier.services.blocking.JourneyService
import com.courier.services.blocking.ListService
import com.courier.services.blocking.MessageService
import com.courier.services.blocking.NotificationService
import com.courier.services.blocking.ProfileService
import com.courier.services.blocking.ProviderService
import com.courier.services.blocking.RequestService
import com.courier.services.blocking.RoutingStrategyService
import com.courier.services.blocking.SendService
import com.courier.services.blocking.TenantService
import com.courier.services.blocking.TranslationService
import com.courier.services.blocking.UserService
import com.courier.services.blocking.WorkspacePreferenceService
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

    /**
     * Send a message to one or more recipients — users, lists, audiences, or tenants — across every
     * channel you have configured.
     */
    fun send(): SendService

    /** Define filter-based groups whose membership Courier recalculates as user profiles change. */
    fun audiences(): AudienceService

    /**
     * Configure the channel providers Courier delivers through, and browse the provider types it
     * supports.
     */
    fun providers(): ProviderService

    /** Read the audit trail of configuration and access changes in your workspace. */
    fun auditEvents(): AuditEventService

    /**
     * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
     * designer — can call Courier as a single user. Server-side requests authenticate with your
     * workspace API key instead.
     */
    fun auth(): AuthService

    /** Invoke a stored automation template or an ad hoc automation defined in the request. */
    fun automations(): AutomationService

    /**
     * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
     * templates scoped to them.
     */
    fun journeys(): JourneyService

    /**
     * Create a one-off send to a list or audience, author its content, then send it immediately or
     * schedule it for later.
     */
    fun broadcasts(): BroadcastService

    fun bulk(): BulkService

    /** Manage the logos, colors, and layout that give the templates you send a consistent look. */
    fun brands(): BrandService

    fun digests(): DigestService

    /** Record an inbound event that triggers the journeys and automations mapped to it. */
    fun inbound(): InboundService

    /**
     * Manage static groups of users that you subscribe explicitly, and send to them by list id or
     * list pattern.
     */
    fun lists(): ListService

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    fun messages(): MessageService

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    fun requests(): RequestService

    /** Create, update, version, publish, and localize notification templates and their content. */
    fun notifications(): NotificationService

    /**
     * Define reusable channel routing and failover strategies, and see which templates use them.
     */
    fun routingStrategies(): RoutingStrategyService

    /**
     * Manage the workspace catalog of subscription topics, the sections that group them, and
     * publishing the preference page.
     */
    fun workspacePreferences(): WorkspacePreferenceService

    /**
     * Store the contact information Courier delivers to for each user — email, phone number, push
     * tokens, and any custom data you send to.
     */
    fun profiles(): ProfileService

    /**
     * Manage tenants — the organizations, teams, or accounts your users belong to — along with
     * their users and default preferences.
     */
    fun tenants(): TenantService

    /**
     * Store and retrieve the translation strings Courier uses to render localized template content.
     */
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

        /**
         * Send a message to one or more recipients — users, lists, audiences, or tenants — across
         * every channel you have configured.
         */
        fun send(): SendService.WithRawResponse

        /**
         * Define filter-based groups whose membership Courier recalculates as user profiles change.
         */
        fun audiences(): AudienceService.WithRawResponse

        /**
         * Configure the channel providers Courier delivers through, and browse the provider types
         * it supports.
         */
        fun providers(): ProviderService.WithRawResponse

        /** Read the audit trail of configuration and access changes in your workspace. */
        fun auditEvents(): AuditEventService.WithRawResponse

        /**
         * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
         * designer — can call Courier as a single user. Server-side requests authenticate with your
         * workspace API key instead.
         */
        fun auth(): AuthService.WithRawResponse

        /** Invoke a stored automation template or an ad hoc automation defined in the request. */
        fun automations(): AutomationService.WithRawResponse

        /**
         * Build, version, publish, invoke, and cancel multi-step notification workflows, along with
         * the templates scoped to them.
         */
        fun journeys(): JourneyService.WithRawResponse

        /**
         * Create a one-off send to a list or audience, author its content, then send it immediately
         * or schedule it for later.
         */
        fun broadcasts(): BroadcastService.WithRawResponse

        fun bulk(): BulkService.WithRawResponse

        /**
         * Manage the logos, colors, and layout that give the templates you send a consistent look.
         */
        fun brands(): BrandService.WithRawResponse

        fun digests(): DigestService.WithRawResponse

        /** Record an inbound event that triggers the journeys and automations mapped to it. */
        fun inbound(): InboundService.WithRawResponse

        /**
         * Manage static groups of users that you subscribe explicitly, and send to them by list id
         * or list pattern.
         */
        fun lists(): ListService.WithRawResponse

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        fun messages(): MessageService.WithRawResponse

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        fun requests(): RequestService.WithRawResponse

        /**
         * Create, update, version, publish, and localize notification templates and their content.
         */
        fun notifications(): NotificationService.WithRawResponse

        /**
         * Define reusable channel routing and failover strategies, and see which templates use
         * them.
         */
        fun routingStrategies(): RoutingStrategyService.WithRawResponse

        /**
         * Manage the workspace catalog of subscription topics, the sections that group them, and
         * publishing the preference page.
         */
        fun workspacePreferences(): WorkspacePreferenceService.WithRawResponse

        /**
         * Store the contact information Courier delivers to for each user — email, phone number,
         * push tokens, and any custom data you send to.
         */
        fun profiles(): ProfileService.WithRawResponse

        /**
         * Manage tenants — the organizations, teams, or accounts your users belong to — along with
         * their users and default preferences.
         */
        fun tenants(): TenantService.WithRawResponse

        /**
         * Store and retrieve the translation strings Courier uses to render localized template
         * content.
         */
        fun translations(): TranslationService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
