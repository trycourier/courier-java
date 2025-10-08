// File generated from our OpenAPI spec by Stainless.

package com.courier.api.client

import com.courier.api.core.ClientOptions
import com.courier.api.core.getPackageVersion
import com.courier.api.services.async.AudienceServiceAsync
import com.courier.api.services.async.AudienceServiceAsyncImpl
import com.courier.api.services.async.AuditEventServiceAsync
import com.courier.api.services.async.AuditEventServiceAsyncImpl
import com.courier.api.services.async.AuthServiceAsync
import com.courier.api.services.async.AuthServiceAsyncImpl
import com.courier.api.services.async.AutomationServiceAsync
import com.courier.api.services.async.AutomationServiceAsyncImpl
import com.courier.api.services.async.BrandServiceAsync
import com.courier.api.services.async.BrandServiceAsyncImpl
import com.courier.api.services.async.BulkServiceAsync
import com.courier.api.services.async.BulkServiceAsyncImpl
import com.courier.api.services.async.InboundServiceAsync
import com.courier.api.services.async.InboundServiceAsyncImpl
import com.courier.api.services.async.ListServiceAsync
import com.courier.api.services.async.ListServiceAsyncImpl
import com.courier.api.services.async.MessageServiceAsync
import com.courier.api.services.async.MessageServiceAsyncImpl
import com.courier.api.services.async.NotificationServiceAsync
import com.courier.api.services.async.NotificationServiceAsyncImpl
import com.courier.api.services.async.ProfileServiceAsync
import com.courier.api.services.async.ProfileServiceAsyncImpl
import com.courier.api.services.async.RequestServiceAsync
import com.courier.api.services.async.RequestServiceAsyncImpl
import com.courier.api.services.async.SendServiceAsync
import com.courier.api.services.async.SendServiceAsyncImpl
import com.courier.api.services.async.TenantServiceAsync
import com.courier.api.services.async.TenantServiceAsyncImpl
import com.courier.api.services.async.TranslationServiceAsync
import com.courier.api.services.async.TranslationServiceAsyncImpl
import com.courier.api.services.async.UserServiceAsync
import com.courier.api.services.async.UserServiceAsyncImpl
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

    private val auditEvents: AuditEventServiceAsync by lazy {
        AuditEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val automations: AutomationServiceAsync by lazy {
        AutomationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val brands: BrandServiceAsync by lazy {
        BrandServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bulk: BulkServiceAsync by lazy { BulkServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val inbound: InboundServiceAsync by lazy {
        InboundServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val lists: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val messages: MessageServiceAsync by lazy {
        MessageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requests: RequestServiceAsync by lazy {
        RequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notifications: NotificationServiceAsync by lazy {
        NotificationServiceAsyncImpl(clientOptionsWithUserAgent)
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

    override fun send(): SendServiceAsync = send

    override fun audiences(): AudienceServiceAsync = audiences

    override fun auditEvents(): AuditEventServiceAsync = auditEvents

    override fun auth(): AuthServiceAsync = auth

    override fun automations(): AutomationServiceAsync = automations

    override fun brands(): BrandServiceAsync = brands

    override fun bulk(): BulkServiceAsync = bulk

    override fun inbound(): InboundServiceAsync = inbound

    override fun lists(): ListServiceAsync = lists

    override fun messages(): MessageServiceAsync = messages

    override fun requests(): RequestServiceAsync = requests

    override fun notifications(): NotificationServiceAsync = notifications

    override fun profiles(): ProfileServiceAsync = profiles

    override fun tenants(): TenantServiceAsync = tenants

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

        private val auditEvents: AuditEventServiceAsync.WithRawResponse by lazy {
            AuditEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val auth: AuthServiceAsync.WithRawResponse by lazy {
            AuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val automations: AutomationServiceAsync.WithRawResponse by lazy {
            AutomationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val brands: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bulk: BulkServiceAsync.WithRawResponse by lazy {
            BulkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbound: InboundServiceAsync.WithRawResponse by lazy {
            InboundServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun send(): SendServiceAsync.WithRawResponse = send

        override fun audiences(): AudienceServiceAsync.WithRawResponse = audiences

        override fun auditEvents(): AuditEventServiceAsync.WithRawResponse = auditEvents

        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        override fun automations(): AutomationServiceAsync.WithRawResponse = automations

        override fun brands(): BrandServiceAsync.WithRawResponse = brands

        override fun bulk(): BulkServiceAsync.WithRawResponse = bulk

        override fun inbound(): InboundServiceAsync.WithRawResponse = inbound

        override fun lists(): ListServiceAsync.WithRawResponse = lists

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun requests(): RequestServiceAsync.WithRawResponse = requests

        override fun notifications(): NotificationServiceAsync.WithRawResponse = notifications

        override fun profiles(): ProfileServiceAsync.WithRawResponse = profiles

        override fun tenants(): TenantServiceAsync.WithRawResponse = tenants

        override fun translations(): TranslationServiceAsync.WithRawResponse = translations

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
