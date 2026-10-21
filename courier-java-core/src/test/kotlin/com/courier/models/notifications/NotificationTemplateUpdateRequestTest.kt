// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNode
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.Locales
import com.courier.models.TextStyle
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateUpdateRequestTest {

    @Test
    fun create() {
        val notificationTemplateUpdateRequest =
            NotificationTemplateUpdateRequest.builder()
                .notification(
                    NotificationTemplateWritePayload.builder()
                        .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                        .content(
                            ElementalContent.builder()
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .align(ElementalTextNode.Align.LEFT)
                                        .bold("bold")
                                        .color("color")
                                        .content("content")
                                        .fontSize("font_size")
                                        .format(ElementalTextNode.Format.MARKDOWN)
                                        .italic("italic")
                                        .lineHeight("line_height")
                                        .locales(
                                            Locales.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf("content" to "content")),
                                                )
                                                .build()
                                        )
                                        .strikethrough("strikethrough")
                                        .textStyle(TextStyle.TEXT)
                                        .underline("underline")
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
                        .email(
                            NotificationTemplateEmail.builder()
                                .addBcc("string")
                                .addCc("string")
                                .from("from")
                                .replyTo("reply_to")
                                .build()
                        )
                        .alias("alias")
                        .build()
                )
                .state(NotificationTemplateUpdateRequest.State.DRAFT)
                .build()

        assertThat(notificationTemplateUpdateRequest.notification())
            .isEqualTo(
                NotificationTemplateWritePayload.builder()
                    .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                    .content(
                        ElementalContent.builder()
                            .addElement(
                                ElementalTextNodeWithType.builder()
                                    .addChannel("string")
                                    .if_("if")
                                    .loop("loop")
                                    .ref("ref")
                                    .align(ElementalTextNode.Align.LEFT)
                                    .bold("bold")
                                    .color("color")
                                    .content("content")
                                    .fontSize("font_size")
                                    .format(ElementalTextNode.Format.MARKDOWN)
                                    .italic("italic")
                                    .lineHeight("line_height")
                                    .locales(
                                        Locales.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf("content" to "content")),
                                            )
                                            .build()
                                    )
                                    .strikethrough("strikethrough")
                                    .textStyle(TextStyle.TEXT)
                                    .underline("underline")
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
                    .email(
                        NotificationTemplateEmail.builder()
                            .addBcc("string")
                            .addCc("string")
                            .from("from")
                            .replyTo("reply_to")
                            .build()
                    )
                    .alias("alias")
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
                    NotificationTemplateWritePayload.builder()
                        .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                        .content(
                            ElementalContent.builder()
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .align(ElementalTextNode.Align.LEFT)
                                        .bold("bold")
                                        .color("color")
                                        .content("content")
                                        .fontSize("font_size")
                                        .format(ElementalTextNode.Format.MARKDOWN)
                                        .italic("italic")
                                        .lineHeight("line_height")
                                        .locales(
                                            Locales.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf("content" to "content")),
                                                )
                                                .build()
                                        )
                                        .strikethrough("strikethrough")
                                        .textStyle(TextStyle.TEXT)
                                        .underline("underline")
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
                        .email(
                            NotificationTemplateEmail.builder()
                                .addBcc("string")
                                .addCc("string")
                                .from("from")
                                .replyTo("reply_to")
                                .build()
                        )
                        .alias("alias")
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
