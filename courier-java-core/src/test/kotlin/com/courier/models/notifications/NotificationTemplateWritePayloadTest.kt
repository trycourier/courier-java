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

internal class NotificationTemplateWritePayloadTest {

    @Test
    fun create() {
        val notificationTemplateWritePayload =
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
                    NotificationTemplatePayload.Routing.builder().strategyId("strategy_id").build()
                )
                .subscription(
                    NotificationTemplatePayload.Subscription.builder().topicId("topic_id").build()
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

        assertThat(notificationTemplateWritePayload.brand())
            .contains(NotificationTemplatePayload.Brand.builder().id("id").build())
        assertThat(notificationTemplateWritePayload.content())
            .isEqualTo(
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
        assertThat(notificationTemplateWritePayload.name()).isEqualTo("name")
        assertThat(notificationTemplateWritePayload.routing())
            .contains(
                NotificationTemplatePayload.Routing.builder().strategyId("strategy_id").build()
            )
        assertThat(notificationTemplateWritePayload.subscription())
            .contains(
                NotificationTemplatePayload.Subscription.builder().topicId("topic_id").build()
            )
        assertThat(notificationTemplateWritePayload.tags()).containsExactly("string")
        assertThat(notificationTemplateWritePayload.email())
            .contains(
                NotificationTemplateEmail.builder()
                    .addBcc("string")
                    .addCc("string")
                    .from("from")
                    .replyTo("reply_to")
                    .build()
            )
        assertThat(notificationTemplateWritePayload.alias()).contains("alias")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateWritePayload =
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
                    NotificationTemplatePayload.Routing.builder().strategyId("strategy_id").build()
                )
                .subscription(
                    NotificationTemplatePayload.Subscription.builder().topicId("topic_id").build()
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

        val roundtrippedNotificationTemplateWritePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateWritePayload),
                jacksonTypeRef<NotificationTemplateWritePayload>(),
            )

        assertThat(roundtrippedNotificationTemplateWritePayload)
            .isEqualTo(notificationTemplateWritePayload)
    }
}
