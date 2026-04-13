// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.notifications.NotificationContentPutRequest
import com.courier.models.notifications.NotificationElementPutRequest
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListVersionsParams
import com.courier.models.notifications.NotificationLocalePutRequest
import com.courier.models.notifications.NotificationPublishParams
import com.courier.models.notifications.NotificationPutContentParams
import com.courier.models.notifications.NotificationPutElementParams
import com.courier.models.notifications.NotificationPutLocaleParams
import com.courier.models.notifications.NotificationReplaceParams
import com.courier.models.notifications.NotificationRetrieveContentParams
import com.courier.models.notifications.NotificationRetrieveParams
import com.courier.models.notifications.NotificationTemplateCreateRequest
import com.courier.models.notifications.NotificationTemplatePayload
import com.courier.models.notifications.NotificationTemplatePublishRequest
import com.courier.models.notifications.NotificationTemplateState
import com.courier.models.notifications.NotificationTemplateUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NotificationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationTemplateGetResponse =
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

        notificationTemplateGetResponse.validate()
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
    fun listVersions() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationTemplateVersionListResponse =
            notificationService.listVersions(
                NotificationListVersionsParams.builder()
                    .id("id")
                    .cursor("cursor")
                    .limit(10L)
                    .build()
            )

        notificationTemplateVersionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        notificationService.publish(
            NotificationPublishParams.builder()
                .id("id")
                .notificationTemplatePublishRequest(
                    NotificationTemplatePublishRequest.builder().version("v321669910225").build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun putContent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationContentMutationResponse =
            notificationService.putContent(
                NotificationPutContentParams.builder()
                    .id("id")
                    .notificationContentPutRequest(
                        NotificationContentPutRequest.builder()
                            .content(
                                NotificationContentPutRequest.Content.builder()
                                    .addElement(
                                        ElementalChannelNodeWithType.builder()
                                            .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                            .build()
                                    )
                                    .version("2022-01-01")
                                    .build()
                            )
                            .state(NotificationTemplateState.DRAFT)
                            .build()
                    )
                    .build()
            )

        notificationContentMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun putElement() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationContentMutationResponse =
            notificationService.putElement(
                NotificationPutElementParams.builder()
                    .id("id")
                    .elementId("elementId")
                    .notificationElementPutRequest(
                        NotificationElementPutRequest.builder()
                            .type("text")
                            .addChannel("string")
                            .data(
                                NotificationElementPutRequest.Data.builder()
                                    .putAdditionalProperty("content", JsonValue.from("bar"))
                                    .build()
                            )
                            .if_("if")
                            .loop("loop")
                            .ref("ref")
                            .state(NotificationTemplateState.DRAFT)
                            .build()
                    )
                    .build()
            )

        notificationContentMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun putLocale() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationContentMutationResponse =
            notificationService.putLocale(
                NotificationPutLocaleParams.builder()
                    .id("id")
                    .localeId("localeId")
                    .notificationLocalePutRequest(
                        NotificationLocalePutRequest.builder()
                            .addElement(
                                NotificationLocalePutRequest.Element.builder().id("elem_1").build()
                            )
                            .addElement(
                                NotificationLocalePutRequest.Element.builder().id("elem_2").build()
                            )
                            .state(NotificationTemplateState.DRAFT)
                            .build()
                    )
                    .build()
            )

        notificationContentMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val notificationTemplateGetResponse =
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

        notificationTemplateGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val notificationService = client.notifications()

        val response =
            notificationService.retrieveContent(
                NotificationRetrieveContentParams.builder().id("id").version("version").build()
            )

        response.validate()
    }
}
