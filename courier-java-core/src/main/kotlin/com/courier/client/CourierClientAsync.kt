// File generated from our OpenAPI spec by Stainless.

package com.courier.client

import com.courier.core.ClientOptions
import com.courier.services.async.AudienceServiceAsync
import com.courier.services.async.AuditEventServiceAsync
import com.courier.services.async.AuthServiceAsync
import com.courier.services.async.AutomationServiceAsync
import com.courier.services.async.BrandServiceAsync
import com.courier.services.async.BroadcastServiceAsync
import com.courier.services.async.DigestServiceAsync
import com.courier.services.async.InboundServiceAsync
import com.courier.services.async.JourneyServiceAsync
import com.courier.services.async.ListServiceAsync
import com.courier.services.async.MessageServiceAsync
import com.courier.services.async.NotificationServiceAsync
import com.courier.services.async.ProfileServiceAsync
import com.courier.services.async.ProviderServiceAsync
import com.courier.services.async.RequestServiceAsync
import com.courier.services.async.RoutingStrategyServiceAsync
import com.courier.services.async.SendServiceAsync
import com.courier.services.async.TenantServiceAsync
import com.courier.services.async.TranslationServiceAsync
import com.courier.services.async.UserServiceAsync
import com.courier.services.async.WorkspacePreferenceServiceAsync
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

    /**
     * Send a message to one or more recipients — users, lists, audiences, or tenants — across every
     * channel you have configured.
     */
    fun send(): SendServiceAsync

    /** Define filter-based groups whose membership Courier recalculates as user profiles change. */
    fun audiences(): AudienceServiceAsync

    /**
     * Configure the channel providers Courier delivers through, and browse the provider types it
     * supports.
     */
    fun providers(): ProviderServiceAsync

    /** Read the audit trail of configuration and access changes in your workspace. */
    fun auditEvents(): AuditEventServiceAsync

    /**
     * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
     * designer — can call Courier as a single user. Server-side requests authenticate with your
     * workspace API key instead.
     */
    fun auth(): AuthServiceAsync

    /** Invoke a stored automation template or an ad hoc automation defined in the request. */
    fun automations(): AutomationServiceAsync

    /**
     * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
     * templates scoped to them.
     */
    fun journeys(): JourneyServiceAsync

    /**
     * Create a one-off send to a list or audience, author its content, then send it immediately or
     * schedule it for later.
     */
    fun broadcasts(): BroadcastServiceAsync

    /** Manage the logos, colors, and layout that give the templates you send a consistent look. */
    fun brands(): BrandServiceAsync

    fun digests(): DigestServiceAsync

    /** Record an inbound event that triggers the journeys and automations mapped to it. */
    fun inbound(): InboundServiceAsync

    /**
     * Manage static groups of users that you subscribe explicitly, and send to them by list id or
     * list pattern.
     */
    fun lists(): ListServiceAsync

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    fun messages(): MessageServiceAsync

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    fun requests(): RequestServiceAsync

    /** Create, update, version, publish, and localize notification templates and their content. */
    fun notifications(): NotificationServiceAsync

    /**
     * Define reusable channel routing and failover strategies, and see which templates use them.
     */
    fun routingStrategies(): RoutingStrategyServiceAsync

    /**
     * Manage the workspace catalog of subscription topics, the sections that group them, and
     * publishing the preference page.
     */
    fun workspacePreferences(): WorkspacePreferenceServiceAsync

    /**
     * Store the contact information Courier delivers to for each user — email, phone number, push
     * tokens, and any custom data you send to.
     */
    fun profiles(): ProfileServiceAsync

    /**
     * Manage tenants — the organizations, teams, or accounts your users belong to — along with
     * their users and default preferences.
     */
    fun tenants(): TenantServiceAsync

    /**
     * Store and retrieve the translation strings Courier uses to render localized template content.
     */
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

        /**
         * Send a message to one or more recipients — users, lists, audiences, or tenants — across
         * every channel you have configured.
         */
        fun send(): SendServiceAsync.WithRawResponse

        /**
         * Define filter-based groups whose membership Courier recalculates as user profiles change.
         */
        fun audiences(): AudienceServiceAsync.WithRawResponse

        /**
         * Configure the channel providers Courier delivers through, and browse the provider types
         * it supports.
         */
        fun providers(): ProviderServiceAsync.WithRawResponse

        /** Read the audit trail of configuration and access changes in your workspace. */
        fun auditEvents(): AuditEventServiceAsync.WithRawResponse

        /**
         * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
         * designer — can call Courier as a single user. Server-side requests authenticate with your
         * workspace API key instead.
         */
        fun auth(): AuthServiceAsync.WithRawResponse

        /** Invoke a stored automation template or an ad hoc automation defined in the request. */
        fun automations(): AutomationServiceAsync.WithRawResponse

        /**
         * Build, version, publish, invoke, and cancel multi-step notification workflows, along with
         * the templates scoped to them.
         */
        fun journeys(): JourneyServiceAsync.WithRawResponse

        /**
         * Create a one-off send to a list or audience, author its content, then send it immediately
         * or schedule it for later.
         */
        fun broadcasts(): BroadcastServiceAsync.WithRawResponse

        /**
         * Manage the logos, colors, and layout that give the templates you send a consistent look.
         */
        fun brands(): BrandServiceAsync.WithRawResponse

        fun digests(): DigestServiceAsync.WithRawResponse

        /** Record an inbound event that triggers the journeys and automations mapped to it. */
        fun inbound(): InboundServiceAsync.WithRawResponse

        /**
         * Manage static groups of users that you subscribe explicitly, and send to them by list id
         * or list pattern.
         */
        fun lists(): ListServiceAsync.WithRawResponse

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        fun requests(): RequestServiceAsync.WithRawResponse

        /**
         * Create, update, version, publish, and localize notification templates and their content.
         */
        fun notifications(): NotificationServiceAsync.WithRawResponse

        /**
         * Define reusable channel routing and failover strategies, and see which templates use
         * them.
         */
        fun routingStrategies(): RoutingStrategyServiceAsync.WithRawResponse

        /**
         * Manage the workspace catalog of subscription topics, the sections that group them, and
         * publishing the preference page.
         */
        fun workspacePreferences(): WorkspacePreferenceServiceAsync.WithRawResponse

        /**
         * Store the contact information Courier delivers to for each user — email, phone number,
         * push tokens, and any custom data you send to.
         */
        fun profiles(): ProfileServiceAsync.WithRawResponse

        /**
         * Manage tenants — the organizations, teams, or accounts your users belong to — along with
         * their users and default preferences.
         */
        fun tenants(): TenantServiceAsync.WithRawResponse

        /**
         * Store and retrieve the translation strings Courier uses to render localized template
         * content.
         */
        fun translations(): TranslationServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse
    }
}
