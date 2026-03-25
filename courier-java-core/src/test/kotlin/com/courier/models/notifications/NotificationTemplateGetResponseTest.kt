// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateGetResponseTest {

    @Test
    fun create() {
        val notificationTemplateGetResponse =
            NotificationTemplateGetResponse.builder()
                .created(0L)
                .creator("creator")
                .notification(
                    NotificationTemplateGetResponse.Notification.builder()
                        .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                        .content(
                            ElementalContent.builder()
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .type(ElementalTextNodeWithType.Type.TEXT)
                                        .build()
                                )
                                .version("version")
                                .build()
                        )
                        .name("name")
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
                        .addTag("string")
                        .id("id")
                        .build()
                )
                .state(NotificationTemplateGetResponse.State.DRAFT)
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(notificationTemplateGetResponse.created()).isEqualTo(0L)
        assertThat(notificationTemplateGetResponse.creator()).isEqualTo("creator")
        assertThat(notificationTemplateGetResponse.notification())
            .isEqualTo(
                NotificationTemplateGetResponse.Notification.builder()
                    .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                    .content(
                        ElementalContent.builder()
                            .addElement(
                                ElementalTextNodeWithType.builder()
                                    .addChannel("string")
                                    .if_("if")
                                    .loop("loop")
                                    .ref("ref")
                                    .type(ElementalTextNodeWithType.Type.TEXT)
                                    .build()
                            )
                            .version("version")
                            .build()
                    )
                    .name("name")
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
                    .addTag("string")
                    .id("id")
                    .build()
            )
        assertThat(notificationTemplateGetResponse.state())
            .isEqualTo(NotificationTemplateGetResponse.State.DRAFT)
        assertThat(notificationTemplateGetResponse.updated()).contains(0L)
        assertThat(notificationTemplateGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateGetResponse =
            NotificationTemplateGetResponse.builder()
                .created(0L)
                .creator("creator")
                .notification(
                    NotificationTemplateGetResponse.Notification.builder()
                        .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                        .content(
                            ElementalContent.builder()
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .type(ElementalTextNodeWithType.Type.TEXT)
                                        .build()
                                )
                                .version("version")
                                .build()
                        )
                        .name("name")
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
                        .addTag("string")
                        .id("id")
                        .build()
                )
                .state(NotificationTemplateGetResponse.State.DRAFT)
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedNotificationTemplateGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateGetResponse),
                jacksonTypeRef<NotificationTemplateGetResponse>(),
            )

        assertThat(roundtrippedNotificationTemplateGetResponse)
            .isEqualTo(notificationTemplateGetResponse)
    }
}
