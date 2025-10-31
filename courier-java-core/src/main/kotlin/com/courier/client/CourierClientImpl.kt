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
import com.courier.services.blocking.BulkService
import com.courier.services.blocking.BulkServiceImpl
import com.courier.services.blocking.InboundService
import com.courier.services.blocking.InboundServiceImpl
import com.courier.services.blocking.ListService
import com.courier.services.blocking.ListServiceImpl
import com.courier.services.blocking.MessageService
import com.courier.services.blocking.MessageServiceImpl
import com.courier.services.blocking.NotificationService
import com.courier.services.blocking.NotificationServiceImpl
import com.courier.services.blocking.ProfileService
import com.courier.services.blocking.ProfileServiceImpl
import com.courier.services.blocking.RequestService
import com.courier.services.blocking.RequestServiceImpl
import com.courier.services.blocking.SendService
import com.courier.services.blocking.SendServiceImpl
import com.courier.services.blocking.TenantService
import com.courier.services.blocking.TenantServiceImpl
import com.courier.services.blocking.TranslationService
import com.courier.services.blocking.TranslationServiceImpl
import com.courier.services.blocking.UserService
import com.courier.services.blocking.UserServiceImpl
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

    private val auditEvents: AuditEventService by lazy {
        AuditEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val automations: AutomationService by lazy {
        AutomationServiceImpl(clientOptionsWithUserAgent)
    }

    private val brands: BrandService by lazy { BrandServiceImpl(clientOptionsWithUserAgent) }

    private val bulk: BulkService by lazy { BulkServiceImpl(clientOptionsWithUserAgent) }

    private val inbound: InboundService by lazy { InboundServiceImpl(clientOptionsWithUserAgent) }

    private val lists: ListService by lazy { ListServiceImpl(clientOptionsWithUserAgent) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptionsWithUserAgent) }

    private val requests: RequestService by lazy { RequestServiceImpl(clientOptionsWithUserAgent) }

    private val notifications: NotificationService by lazy {
        NotificationServiceImpl(clientOptionsWithUserAgent)
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

    override fun send(): SendService = send

    override fun audiences(): AudienceService = audiences

    override fun auditEvents(): AuditEventService = auditEvents

    override fun auth(): AuthService = auth

    override fun automations(): AutomationService = automations

    override fun brands(): BrandService = brands

    override fun bulk(): BulkService = bulk

    override fun inbound(): InboundService = inbound

    override fun lists(): ListService = lists

    override fun messages(): MessageService = messages

    override fun requests(): RequestService = requests

    override fun notifications(): NotificationService = notifications

    override fun profiles(): ProfileService = profiles

    override fun tenants(): TenantService = tenants

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

        private val auditEvents: AuditEventService.WithRawResponse by lazy {
            AuditEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val auth: AuthService.WithRawResponse by lazy {
            AuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val automations: AutomationService.WithRawResponse by lazy {
            AutomationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val brands: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bulk: BulkService.WithRawResponse by lazy {
            BulkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbound: InboundService.WithRawResponse by lazy {
            InboundServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListService.WithRawResponse by lazy {
            ListServiceImpl.WithRawResponseImpl(clientOptions)
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

        override fun send(): SendService.WithRawResponse = send

        override fun audiences(): AudienceService.WithRawResponse = audiences

        override fun auditEvents(): AuditEventService.WithRawResponse = auditEvents

        override fun auth(): AuthService.WithRawResponse = auth

        override fun automations(): AutomationService.WithRawResponse = automations

        override fun brands(): BrandService.WithRawResponse = brands

        override fun bulk(): BulkService.WithRawResponse = bulk

        override fun inbound(): InboundService.WithRawResponse = inbound

        override fun lists(): ListService.WithRawResponse = lists

        override fun messages(): MessageService.WithRawResponse = messages

        override fun requests(): RequestService.WithRawResponse = requests

        override fun notifications(): NotificationService.WithRawResponse = notifications

        override fun profiles(): ProfileService.WithRawResponse = profiles

        override fun tenants(): TenantService.WithRawResponse = tenants

        override fun translations(): TranslationService.WithRawResponse = translations

        override fun users(): UserService.WithRawResponse = users
    }
}
