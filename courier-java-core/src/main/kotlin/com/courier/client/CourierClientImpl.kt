// File generated from our OpenAPI spec by Stainless.

package com.courier.client

import com.courier.core.ClientOptions
import com.courier.core.getPackageVersion
import com.courier.services.blocking.AudienceService
import com.courier.services.blocking.AudienceServiceImpl
import com.courier.services.blocking.AuditEventService
import com.courier.services.blocking.AuditEventServiceImpl
import com.courier.services.blocking.AuthService
import com.courier.services.blocking.AuthServiceImpl
import com.courier.services.blocking.AutomationService
import com.courier.services.blocking.AutomationServiceImpl
import com.courier.services.blocking.BrandService
import com.courier.services.blocking.BrandServiceImpl
import com.courier.services.blocking.BroadcastService
import com.courier.services.blocking.BroadcastServiceImpl
import com.courier.services.blocking.DigestService
import com.courier.services.blocking.DigestServiceImpl
import com.courier.services.blocking.InboundService
import com.courier.services.blocking.InboundServiceImpl
import com.courier.services.blocking.InboxService
import com.courier.services.blocking.InboxServiceImpl
import com.courier.services.blocking.JourneyService
import com.courier.services.blocking.JourneyServiceImpl
import com.courier.services.blocking.ListService
import com.courier.services.blocking.ListServiceImpl
import com.courier.services.blocking.MessageService
import com.courier.services.blocking.MessageServiceImpl
import com.courier.services.blocking.NotificationService
import com.courier.services.blocking.NotificationServiceImpl
import com.courier.services.blocking.ProfileService
import com.courier.services.blocking.ProfileServiceImpl
import com.courier.services.blocking.ProviderService
import com.courier.services.blocking.ProviderServiceImpl
import com.courier.services.blocking.RequestService
import com.courier.services.blocking.RequestServiceImpl
import com.courier.services.blocking.RoutingStrategyService
import com.courier.services.blocking.RoutingStrategyServiceImpl
import com.courier.services.blocking.SendService
import com.courier.services.blocking.SendServiceImpl
import com.courier.services.blocking.TenantService
import com.courier.services.blocking.TenantServiceImpl
import com.courier.services.blocking.TranslationService
import com.courier.services.blocking.TranslationServiceImpl
import com.courier.services.blocking.UserService
import com.courier.services.blocking.UserServiceImpl
import com.courier.services.blocking.WorkspacePreferenceService
import com.courier.services.blocking.WorkspacePreferenceServiceImpl
import java.util.function.Consumer

class CourierClientImpl(private val clientOptions: ClientOptions) : CourierClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: CourierClientAsync by lazy { CourierClientAsyncImpl(clientOptions) }

    private val withRawResponse: CourierClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val send: SendService by lazy { SendServiceImpl(clientOptionsWithUserAgent) }

    private val audiences: AudienceService by lazy {
        AudienceServiceImpl(clientOptionsWithUserAgent)
    }

    private val providers: ProviderService by lazy {
        ProviderServiceImpl(clientOptionsWithUserAgent)
    }

    private val auditEvents: AuditEventService by lazy {
        AuditEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val automations: AutomationService by lazy {
        AutomationServiceImpl(clientOptionsWithUserAgent)
    }

    private val journeys: JourneyService by lazy { JourneyServiceImpl(clientOptionsWithUserAgent) }

    private val broadcasts: BroadcastService by lazy {
        BroadcastServiceImpl(clientOptionsWithUserAgent)
    }

    private val brands: BrandService by lazy { BrandServiceImpl(clientOptionsWithUserAgent) }

    private val digests: DigestService by lazy { DigestServiceImpl(clientOptionsWithUserAgent) }

    private val inbound: InboundService by lazy { InboundServiceImpl(clientOptionsWithUserAgent) }

    private val lists: ListService by lazy { ListServiceImpl(clientOptionsWithUserAgent) }

    private val inbox: InboxService by lazy { InboxServiceImpl(clientOptionsWithUserAgent) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptionsWithUserAgent) }

    private val requests: RequestService by lazy { RequestServiceImpl(clientOptionsWithUserAgent) }

    private val notifications: NotificationService by lazy {
        NotificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val routingStrategies: RoutingStrategyService by lazy {
        RoutingStrategyServiceImpl(clientOptionsWithUserAgent)
    }

    private val workspacePreferences: WorkspacePreferenceService by lazy {
        WorkspacePreferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val profiles: ProfileService by lazy { ProfileServiceImpl(clientOptionsWithUserAgent) }

    private val tenants: TenantService by lazy { TenantServiceImpl(clientOptionsWithUserAgent) }

    private val translations: TranslationService by lazy {
        TranslationServiceImpl(clientOptionsWithUserAgent)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): CourierClientAsync = async

    override fun withRawResponse(): CourierClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourierClient =
        CourierClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Send a message to one or more recipients — users, lists, audiences, or tenants — across every
     * channel you have configured.
     */
    override fun send(): SendService = send

    /** Define filter-based groups whose membership Courier recalculates as user profiles change. */
    override fun audiences(): AudienceService = audiences

    /**
     * Configure the channel providers Courier delivers through, and browse the provider types it
     * supports.
     */
    override fun providers(): ProviderService = providers

    /** Read the audit trail of configuration and access changes in your workspace. */
    override fun auditEvents(): AuditEventService = auditEvents

    /**
     * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
     * designer — can call Courier as a single user. Server-side requests authenticate with your
     * workspace API key instead.
     */
    override fun auth(): AuthService = auth

    /** Invoke a stored automation template or an ad hoc automation defined in the request. */
    override fun automations(): AutomationService = automations

    /**
     * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
     * templates scoped to them.
     */
    override fun journeys(): JourneyService = journeys

    override fun broadcasts(): BroadcastService = broadcasts

    /** Manage the logos, colors, and layout that give the templates you send a consistent look. */
    override fun brands(): BrandService = brands

    override fun digests(): DigestService = digests

    /** Record an inbound event that triggers the journeys and automations mapped to it. */
    override fun inbound(): InboundService = inbound

    /**
     * Manage static groups of users that you subscribe explicitly, and send to them by list id or
     * list pattern.
     */
    override fun lists(): ListService = lists

    override fun inbox(): InboxService = inbox

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    override fun messages(): MessageService = messages

    /**
     * Look up the messages Courier has accepted, inspect their delivery history and rendered
     * output, and cancel, resend, or archive them.
     */
    override fun requests(): RequestService = requests

    /** Create, update, version, publish, and localize notification templates and their content. */
    override fun notifications(): NotificationService = notifications

    /**
     * Define reusable channel routing and failover strategies, and see which templates use them.
     */
    override fun routingStrategies(): RoutingStrategyService = routingStrategies

    /**
     * Manage the workspace catalog of subscription topics, the sections that group them, and
     * publishing the preference page.
     */
    override fun workspacePreferences(): WorkspacePreferenceService = workspacePreferences

    /**
     * Store the contact information Courier delivers to for each user — email, phone number, push
     * tokens, and any custom data you send to.
     */
    override fun profiles(): ProfileService = profiles

    /**
     * Manage tenants — the organizations, teams, or accounts your users belong to — along with
     * their users and default preferences.
     */
    override fun tenants(): TenantService = tenants

    /**
     * Store and retrieve the translation strings Courier uses to render localized template content.
     */
    override fun translations(): TranslationService = translations

    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CourierClient.WithRawResponse {

        private val send: SendService.WithRawResponse by lazy {
            SendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audiences: AudienceService.WithRawResponse by lazy {
            AudienceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderService.WithRawResponse by lazy {
            ProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val auditEvents: AuditEventService.WithRawResponse by lazy {
            AuditEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val auth: AuthService.WithRawResponse by lazy {
            AuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val automations: AutomationService.WithRawResponse by lazy {
            AutomationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val journeys: JourneyService.WithRawResponse by lazy {
            JourneyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val broadcasts: BroadcastService.WithRawResponse by lazy {
            BroadcastServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val brands: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val digests: DigestService.WithRawResponse by lazy {
            DigestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbound: InboundService.WithRawResponse by lazy {
            InboundServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListService.WithRawResponse by lazy {
            ListServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbox: InboxService.WithRawResponse by lazy {
            InboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val requests: RequestService.WithRawResponse by lazy {
            RequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notifications: NotificationService.WithRawResponse by lazy {
            NotificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routingStrategies: RoutingStrategyService.WithRawResponse by lazy {
            RoutingStrategyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val workspacePreferences: WorkspacePreferenceService.WithRawResponse by lazy {
            WorkspacePreferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val profiles: ProfileService.WithRawResponse by lazy {
            ProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tenants: TenantService.WithRawResponse by lazy {
            TenantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val translations: TranslationService.WithRawResponse by lazy {
            TranslationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CourierClient.WithRawResponse =
            CourierClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Send a message to one or more recipients — users, lists, audiences, or tenants — across
         * every channel you have configured.
         */
        override fun send(): SendService.WithRawResponse = send

        /**
         * Define filter-based groups whose membership Courier recalculates as user profiles change.
         */
        override fun audiences(): AudienceService.WithRawResponse = audiences

        /**
         * Configure the channel providers Courier delivers through, and browse the provider types
         * it supports.
         */
        override fun providers(): ProviderService.WithRawResponse = providers

        /** Read the audit trail of configuration and access changes in your workspace. */
        override fun auditEvents(): AuditEventService.WithRawResponse = auditEvents

        /**
         * Issue scoped, short-lived JWTs so client-side SDKs — Inbox, Preferences, and the embedded
         * designer — can call Courier as a single user. Server-side requests authenticate with your
         * workspace API key instead.
         */
        override fun auth(): AuthService.WithRawResponse = auth

        /** Invoke a stored automation template or an ad hoc automation defined in the request. */
        override fun automations(): AutomationService.WithRawResponse = automations

        /**
         * Build, version, publish, invoke, and cancel multi-step notification workflows, along with
         * the templates scoped to them.
         */
        override fun journeys(): JourneyService.WithRawResponse = journeys

        override fun broadcasts(): BroadcastService.WithRawResponse = broadcasts

        /**
         * Manage the logos, colors, and layout that give the templates you send a consistent look.
         */
        override fun brands(): BrandService.WithRawResponse = brands

        override fun digests(): DigestService.WithRawResponse = digests

        /** Record an inbound event that triggers the journeys and automations mapped to it. */
        override fun inbound(): InboundService.WithRawResponse = inbound

        /**
         * Manage static groups of users that you subscribe explicitly, and send to them by list id
         * or list pattern.
         */
        override fun lists(): ListService.WithRawResponse = lists

        override fun inbox(): InboxService.WithRawResponse = inbox

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        override fun messages(): MessageService.WithRawResponse = messages

        /**
         * Look up the messages Courier has accepted, inspect their delivery history and rendered
         * output, and cancel, resend, or archive them.
         */
        override fun requests(): RequestService.WithRawResponse = requests

        /**
         * Create, update, version, publish, and localize notification templates and their content.
         */
        override fun notifications(): NotificationService.WithRawResponse = notifications

        /**
         * Define reusable channel routing and failover strategies, and see which templates use
         * them.
         */
        override fun routingStrategies(): RoutingStrategyService.WithRawResponse = routingStrategies

        /**
         * Manage the workspace catalog of subscription topics, the sections that group them, and
         * publishing the preference page.
         */
        override fun workspacePreferences(): WorkspacePreferenceService.WithRawResponse =
            workspacePreferences

        /**
         * Store the contact information Courier delivers to for each user — email, phone number,
         * push tokens, and any custom data you send to.
         */
        override fun profiles(): ProfileService.WithRawResponse = profiles

        /**
         * Manage tenants — the organizations, teams, or accounts your users belong to — along with
         * their users and default preferences.
         */
        override fun tenants(): TenantService.WithRawResponse = tenants

        /**
         * Store and retrieve the translation strings Courier uses to render localized template
         * content.
         */
        override fun translations(): TranslationService.WithRawResponse = translations

        override fun users(): UserService.WithRawResponse = users
    }
}
