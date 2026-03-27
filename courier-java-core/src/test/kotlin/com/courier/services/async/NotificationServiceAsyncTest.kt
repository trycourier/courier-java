// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListVersionsParams
import com.courier.models.notifications.NotificationPublishParams
import com.courier.models.notifications.NotificationReplaceParams
import com.courier.models.notifications.NotificationRetrieveParams
import com.courier.models.notifications.NotificationTemplateCreateRequest
import com.courier.models.notifications.NotificationTemplatePayload
import com.courier.models.notifications.NotificationTemplatePublishRequest
import com.courier.models.notifications.NotificationTemplateUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NotificationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationTemplateMutationResponseFuture =
            notificationServiceAsync.create(
                NotificationTemplateCreateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder().id("brand_abc").build()
                            )
                            .content(
                                ElementalContent.builder()
                                    .addElement(
                                        ElementalChannelNodeWithType.builder()
                                            .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                            .build()
                                    )
                                    .version("2022-01-01")
                                    .build()
                            )
                            .name("Welcome Email")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("rs_123")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("marketing")
                                    .build()
                            )
                            .addTag("onboarding")
                            .addTag("welcome")
                            .build()
                    )
                    .state(NotificationTemplateCreateRequest.State.DRAFT)
                    .build()
            )

        val notificationTemplateMutationResponse = notificationTemplateMutationResponseFuture.get()
        notificationTemplateMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationTemplateGetResponseFuture =
            notificationServiceAsync.retrieve(
                NotificationRetrieveParams.builder().id("id").version("version").build()
            )

        val notificationTemplateGetResponse = notificationTemplateGetResponseFuture.get()
        notificationTemplateGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationsFuture =
            notificationServiceAsync.list(
                NotificationListParams.builder()
                    .cursor("cursor")
                    .eventId("event_id")
                    .notes(true)
                    .build()
            )

        val notifications = notificationsFuture.get()
        notifications.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val future = notificationServiceAsync.archive("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVersions() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationTemplateVersionListResponseFuture =
            notificationServiceAsync.listVersions(
                NotificationListVersionsParams.builder()
                    .id("id")
                    .cursor("cursor")
                    .limit(10L)
                    .build()
            )

        val notificationTemplateVersionListResponse =
            notificationTemplateVersionListResponseFuture.get()
        notificationTemplateVersionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val future =
            notificationServiceAsync.publish(
                NotificationPublishParams.builder()
                    .id("id")
                    .notificationTemplatePublishRequest(
                        NotificationTemplatePublishRequest.builder()
                            .version("v321669910225")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationTemplateMutationResponseFuture =
            notificationServiceAsync.replace(
                NotificationReplaceParams.builder()
                    .id("id")
                    .notificationTemplateUpdateRequest(
                        NotificationTemplateUpdateRequest.builder()
                            .notification(
                                NotificationTemplatePayload.builder()
                                    .brand(
                                        NotificationTemplatePayload.Brand.builder().id("id").build()
                                    )
                                    .content(
                                        ElementalContent.builder()
                                            .addElement(
                                                ElementalChannelNodeWithType.builder()
                                                    .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                                    .build()
                                            )
                                            .version("2022-01-01")
                                            .build()
                                    )
                                    .name("Updated Name")
                                    .routing(
                                        NotificationTemplatePayload.Routing.builder()
                                            .strategyId("strategy_id")
                                            .build()
                                    )
                                    .subscription(
                                        NotificationTemplatePayload.Subscription.builder()
                                            .topicId("topic_id")
                                            .build()
                                    )
                                    .addTag("updated")
                                    .build()
                            )
                            .state(NotificationTemplateUpdateRequest.State.PUBLISHED)
                            .build()
                    )
                    .build()
            )

        val notificationTemplateMutationResponse = notificationTemplateMutationResponseFuture.get()
        notificationTemplateMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationGetContentFuture = notificationServiceAsync.retrieveContent("id")

        val notificationGetContent = notificationGetContentFuture.get()
        notificationGetContent.validate()
    }
}
