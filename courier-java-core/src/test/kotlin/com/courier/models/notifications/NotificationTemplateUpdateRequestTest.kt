// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateUpdateRequestTest {

    @Test
    fun create() {
        val notificationTemplateUpdateRequest =
            NotificationTemplateUpdateRequest.builder()
                .notification(
                    NotificationTemplatePayload.builder()
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
                        .build()
                )
                .state(NotificationTemplateUpdateRequest.State.DRAFT)
                .build()

        assertThat(notificationTemplateUpdateRequest.notification())
            .isEqualTo(
                NotificationTemplatePayload.builder()
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
                    .build()
            )
        assertThat(notificationTemplateUpdateRequest.state())
            .contains(NotificationTemplateUpdateRequest.State.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateUpdateRequest =
            NotificationTemplateUpdateRequest.builder()
                .notification(
                    NotificationTemplatePayload.builder()
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
                        .build()
                )
                .state(NotificationTemplateUpdateRequest.State.DRAFT)
                .build()

        val roundtrippedNotificationTemplateUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateUpdateRequest),
                jacksonTypeRef<NotificationTemplateUpdateRequest>(),
            )

        assertThat(roundtrippedNotificationTemplateUpdateRequest)
            .isEqualTo(notificationTemplateUpdateRequest)
    }
}
