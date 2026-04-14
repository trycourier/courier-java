// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateResponseTest {

    @Test
    fun create() {
        val notificationTemplateResponse =
            NotificationTemplateResponse.builder()
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
                    NotificationTemplatePayload.Routing.builder().strategyId("strategy_id").build()
                )
                .subscription(
                    NotificationTemplatePayload.Subscription.builder().topicId("topic_id").build()
                )
                .addTag("string")
                .id("id")
                .created(0L)
                .creator("creator")
                .state(NotificationTemplateResponse.State.DRAFT)
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(notificationTemplateResponse.brand())
            .contains(NotificationTemplatePayload.Brand.builder().id("id").build())
        assertThat(notificationTemplateResponse.content())
            .isEqualTo(
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
        assertThat(notificationTemplateResponse.name()).isEqualTo("name")
        assertThat(notificationTemplateResponse.routing())
            .contains(
                NotificationTemplatePayload.Routing.builder().strategyId("strategy_id").build()
            )
        assertThat(notificationTemplateResponse.subscription())
            .contains(
                NotificationTemplatePayload.Subscription.builder().topicId("topic_id").build()
            )
        assertThat(notificationTemplateResponse.tags()).containsExactly("string")
        assertThat(notificationTemplateResponse.id()).isEqualTo("id")
        assertThat(notificationTemplateResponse.created()).isEqualTo(0L)
        assertThat(notificationTemplateResponse.creator()).isEqualTo("creator")
        assertThat(notificationTemplateResponse.state())
            .isEqualTo(NotificationTemplateResponse.State.DRAFT)
        assertThat(notificationTemplateResponse.updated()).contains(0L)
        assertThat(notificationTemplateResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateResponse =
            NotificationTemplateResponse.builder()
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
                    NotificationTemplatePayload.Routing.builder().strategyId("strategy_id").build()
                )
                .subscription(
                    NotificationTemplatePayload.Subscription.builder().topicId("topic_id").build()
                )
                .addTag("string")
                .id("id")
                .created(0L)
                .creator("creator")
                .state(NotificationTemplateResponse.State.DRAFT)
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedNotificationTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateResponse),
                jacksonTypeRef<NotificationTemplateResponse>(),
            )

        assertThat(roundtrippedNotificationTemplateResponse).isEqualTo(notificationTemplateResponse)
    }
}
