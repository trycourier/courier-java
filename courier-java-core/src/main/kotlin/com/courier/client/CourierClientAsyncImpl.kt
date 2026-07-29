// File generated from our OpenAPI spec by Stainless.

package com.courier.client

import com.courier.core.ClientOptions
import com.courier.core.getPackageVersion
import com.courier.services.async.AudienceServiceAsync
import com.courier.services.async.AudienceServiceAsyncImpl
import com.courier.services.async.AuditEventServiceAsync
import com.courier.services.async.AuditEventServiceAsyncImpl
import com.courier.services.async.AuthServiceAsync
import com.courier.services.async.AuthServiceAsyncImpl
import com.courier.services.async.AutomationServiceAsync
import com.courier.services.async.AutomationServiceAsyncImpl
import com.courier.services.async.BrandServiceAsync
import com.courier.services.async.BrandServiceAsyncImpl
import com.courier.services.async.BroadcastServiceAsync
import com.courier.services.async.BroadcastServiceAsyncImpl
import com.courier.services.async.DigestServiceAsync
import com.courier.services.async.DigestServiceAsyncImpl
import com.courier.services.async.InboundServiceAsync
import com.courier.services.async.InboundServiceAsyncImpl
import com.courier.services.async.InboxServiceAsync
import com.courier.services.async.InboxServiceAsyncImpl
import com.courier.services.async.JourneyServiceAsync
import com.courier.services.async.JourneyServiceAsyncImpl
import com.courier.services.async.ListServiceAsync
import com.courier.services.async.ListServiceAsyncImpl
import com.courier.services.async.MessageServiceAsync
import com.courier.services.async.MessageServiceAsyncImpl
import com.courier.services.async.NotificationServiceAsync
import com.courier.services.async.NotificationServiceAsyncImpl
import com.courier.services.async.ProfileServiceAsync
import com.courier.services.async.ProfileServiceAsyncImpl
import com.courier.services.async.ProviderServiceAsync
import com.courier.services.async.ProviderServiceAsyncImpl
import com.courier.services.async.RequestServiceAsync
import com.courier.services.async.RequestServiceAsyncImpl
import com.courier.services.async.RoutingStrategyServiceAsync
import com.courier.services.async.RoutingStrategyServiceAsyncImpl
import com.courier.services.async.SendServiceAsync
import com.courier.services.async.SendServiceAsyncImpl
import com.courier.services.async.TenantServiceAsync
import com.courier.services.async.TenantServiceAsyncImpl
import com.courier.services.async.TranslationServiceAsync
import com.courier.services.async.TranslationServiceAsyncImpl
import com.courier.services.async.UserServiceAsync
import com.courier.services.async.UserServiceAsyncImpl
import com.courier.services.async.WorkspacePreferenceServiceAsync
import com.courier.services.async.WorkspacePreferenceServiceAsyncImpl
import java.util.function.Consumer

class CourierClientAsyncImpl(private val clientOptions: ClientOptions) : CourierClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: CourierClient by lazy { CourierClientImpl(clientOptions) }

    private val withRawResponse: CourierClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val send: SendServiceAsync by lazy { SendServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val audiences: AudienceServiceAsync by lazy {
        AudienceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val providers: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val auditEvents: AuditEventServiceAsync by lazy {
        AuditEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val automations: AutomationServiceAsync by lazy {
        AutomationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val journeys: JourneyServiceAsync by lazy {
        JourneyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val broadcasts: BroadcastServiceAsync by lazy {
        BroadcastServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val brands: BrandServiceAsync by lazy {
        BrandServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val digests: DigestServiceAsync by lazy {
        DigestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inbound: InboundServiceAsync by lazy {
        InboundServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val lists: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val inbox: InboxServiceAsync by lazy {
        InboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messages: MessageServiceAsync by lazy {
        MessageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requests: RequestServiceAsync by lazy {
        RequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notifications: NotificationServiceAsync by lazy {
        NotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routingStrategies: RoutingStrategyServiceAsync by lazy {
        RoutingStrategyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val workspacePreferences: WorkspacePreferenceServiceAsync by lazy {
        WorkspacePreferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val profiles: ProfileServiceAsync by lazy {
        ProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tenants: TenantServiceAsync by lazy {
        TenantServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val translations: TranslationServiceAsync by lazy {
        TranslationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): CourierClient = sync

    override fun withRawResponse(): CourierClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClientAsync =
        CourierClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Send a message to one or more recipients — users, lists, audiences, or tenants — across every
     * channel you have configured.
     */
    override fun send(): SendServiceAsync = send

    /** Define filter-based groups whose membership Courier recalculates as user profiles change. */
    override fun audiences(): AudienceServiceAsync = audiences

    /**
     * Configure the channel providers Courier delivers through, and browse the provider types it
     * supports.
     */
    override fun providers(): ProviderServiceAsync = providers

    /** Read the audit trail of configuration and access changes in your workspace. */
    override fun auditEvents(): AuditEventServiceAsync = auditEvents

    /**
     * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
     * designer — can call Courier as a single user. Server-side requests authenticate with your
     * workspace API key instead.
     */
    override fun auth(): AuthServiceAsync = auth

    /** Invoke a stored automation template or an ad hoc automation defined in the request. */
    override fun automations(): AutomationServiceAsync = automations

    /**
     * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
     * templates scoped to them.
     */
    override fun journeys(): JourneyServiceAsync = journeys

    /**
     * Create a one-off send to a list or audience, author its content, then send it immediately or
     * schedule it for later.
     */
    override fun broadcasts(): BroadcastServiceAsync = broadcasts

    /** Manage the logos, colors, and layout that give the templates you send a consistent look. */
    override fun brands(): BrandServiceAsync = brands

    override fun digests(): DigestServiceAsync = digests

    /** Record an inbound event that triggers the journeys and automations mapped to it. */
    override fun inbound(): InboundServiceAsync = inbound

    /**
     * Manage static groups of users that you subscribe explicitly, and send to them by list id or
     * list pattern.
     */
    override fun lists(): ListServiceAsync = lists

    override fun inbox(): InboxServiceAsync = inbox

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    override fun messages(): MessageServiceAsync = messages

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    override fun requests(): RequestServiceAsync = requests

    /** Create, update, version, publish, and localize notification templates and their content. */
    override fun notifications(): NotificationServiceAsync = notifications

    /**
     * Define reusable channel routing and failover strategies, and see which templates use them.
     */
    override fun routingStrategies(): RoutingStrategyServiceAsync = routingStrategies

    /**
     * Manage the workspace catalog of subscription topics, the sections that group them, and
     * publishing the preference page.
     */
    override fun workspacePreferences(): WorkspacePreferenceServiceAsync = workspacePreferences

    /**
     * Store the contact information Courier delivers to for each user — email, phone number, push
     * tokens, and any custom data you send to.
     */
    override fun profiles(): ProfileServiceAsync = profiles

    /**
     * Manage tenants — the organizations, teams, or accounts your users belong to — along with
     * their users and default preferences.
     */
    override fun tenants(): TenantServiceAsync = tenants

    /**
     * Store and retrieve the translation strings Courier uses to render localized template content.
     */
    override fun translations(): TranslationServiceAsync = translations

    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourierClientAsync.WithRawResponse {

        private val send: SendServiceAsync.WithRawResponse by lazy {
            SendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audiences: AudienceServiceAsync.WithRawResponse by lazy {
            AudienceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderServiceAsync.WithRawResponse by lazy {
            ProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val auditEvents: AuditEventServiceAsync.WithRawResponse by lazy {
            AuditEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val auth: AuthServiceAsync.WithRawResponse by lazy {
            AuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val automations: AutomationServiceAsync.WithRawResponse by lazy {
            AutomationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val journeys: JourneyServiceAsync.WithRawResponse by lazy {
            JourneyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val broadcasts: BroadcastServiceAsync.WithRawResponse by lazy {
            BroadcastServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val brands: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val digests: DigestServiceAsync.WithRawResponse by lazy {
            DigestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbound: InboundServiceAsync.WithRawResponse by lazy {
            InboundServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbox: InboxServiceAsync.WithRawResponse by lazy {
            InboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val requests: RequestServiceAsync.WithRawResponse by lazy {
            RequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notifications: NotificationServiceAsync.WithRawResponse by lazy {
            NotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routingStrategies: RoutingStrategyServiceAsync.WithRawResponse by lazy {
            RoutingStrategyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val workspacePreferences: WorkspacePreferenceServiceAsync.WithRawResponse by lazy {
            WorkspacePreferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val profiles: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tenants: TenantServiceAsync.WithRawResponse by lazy {
            TenantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val translations: TranslationServiceAsync.WithRawResponse by lazy {
            TranslationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CourierClientAsync.WithRawResponse =
            CourierClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Send a message to one or more recipients — users, lists, audiences, or tenants — across
         * every channel you have configured.
         */
        override fun send(): SendServiceAsync.WithRawResponse = send

        /**
         * Define filter-based groups whose membership Courier recalculates as user profiles change.
         */
        override fun audiences(): AudienceServiceAsync.WithRawResponse = audiences

        /**
         * Configure the channel providers Courier delivers through, and browse the provider types
         * it supports.
         */
        override fun providers(): ProviderServiceAsync.WithRawResponse = providers

        /** Read the audit trail of configuration and access changes in your workspace. */
        override fun auditEvents(): AuditEventServiceAsync.WithRawResponse = auditEvents

        /**
         * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
         * designer — can call Courier as a single user. Server-side requests authenticate with your
         * workspace API key instead.
         */
        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        /** Invoke a stored automation template or an ad hoc automation defined in the request. */
        override fun automations(): AutomationServiceAsync.WithRawResponse = automations

        /**
         * Build, version, publish, invoke, and cancel multi-step notification workflows, along with
         * the templates scoped to them.
         */
        override fun journeys(): JourneyServiceAsync.WithRawResponse = journeys

        /**
         * Create a one-off send to a list or audience, author its content, then send it immediately
         * or schedule it for later.
         */
        override fun broadcasts(): BroadcastServiceAsync.WithRawResponse = broadcasts

        /**
         * Manage the logos, colors, and layout that give the templates you send a consistent look.
         */
        override fun brands(): BrandServiceAsync.WithRawResponse = brands

        override fun digests(): DigestServiceAsync.WithRawResponse = digests

        /** Record an inbound event that triggers the journeys and automations mapped to it. */
        override fun inbound(): InboundServiceAsync.WithRawResponse = inbound

        /**
         * Manage static groups of users that you subscribe explicitly, and send to them by list id
         * or list pattern.
         */
        override fun lists(): ListServiceAsync.WithRawResponse = lists

        override fun inbox(): InboxServiceAsync.WithRawResponse = inbox

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        override fun requests(): RequestServiceAsync.WithRawResponse = requests

        /**
         * Create, update, version, publish, and localize notification templates and their content.
         */
        override fun notifications(): NotificationServiceAsync.WithRawResponse = notifications

        /**
         * Define reusable channel routing and failover strategies, and see which templates use
         * them.
         */
        override fun routingStrategies(): RoutingStrategyServiceAsync.WithRawResponse =
            routingStrategies

        /**
         * Manage the workspace catalog of subscription topics, the sections that group them, and
         * publishing the preference page.
         */
        override fun workspacePreferences(): WorkspacePreferenceServiceAsync.WithRawResponse =
            workspacePreferences

        /**
         * Store the contact information Courier delivers to for each user — email, phone number,
         * push tokens, and any custom data you send to.
         */
        override fun profiles(): ProfileServiceAsync.WithRawResponse = profiles

        /**
         * Manage tenants — the organizations, teams, or accounts your users belong to — along with
         * their users and default preferences.
         */
        override fun tenants(): TenantServiceAsync.WithRawResponse = tenants

        /**
         * Store and retrieve the translation strings Courier uses to render localized template
         * content.
         */
        override fun translations(): TranslationServiceAsync.WithRawResponse = translations

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
