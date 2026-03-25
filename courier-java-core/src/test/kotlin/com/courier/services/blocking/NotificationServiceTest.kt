// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationReplaceParams
import com.courier.models.notifications.NotificationRetrieveParams
import com.courier.models.notifications.NotificationTemplateCreateRequest
import com.courier.models.notifications.NotificationTemplatePayload
import com.courier.models.notifications.NotificationTemplateUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NotificationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationTemplateMutationResponse =
            notificationService.create(
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

        notificationTemplateMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationTemplateGetResponse =
            notificationService.retrieve(
                NotificationRetrieveParams.builder().id("id").version("version").build()
            )

        notificationTemplateGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notifications =
            notificationService.list(
                NotificationListParams.builder()
                    .cursor("cursor")
                    .eventId("event_id")
                    .notes(true)
                    .build()
            )

        notifications.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        notificationService.archive("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        notificationService.publish("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationTemplateMutationResponse =
            notificationService.replace(
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

        notificationTemplateMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationGetContent = notificationService.retrieveContent("id")

        notificationGetContent.validate()
    }
}
