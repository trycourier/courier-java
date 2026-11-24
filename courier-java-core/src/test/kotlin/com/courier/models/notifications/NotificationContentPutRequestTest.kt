// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ElementalTextNode
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.Locales
import com.courier.models.TextStyle
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationContentPutRequestTest {

    @Test
    fun create() {
        val notificationContentPutRequest =
            NotificationContentPutRequest.builder()
                .content(
                    NotificationContentPutRequest.Content.builder()
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
                .state(NotificationTemplateState.DRAFT)
                .build()

        assertThat(notificationContentPutRequest.content())
            .isEqualTo(
                NotificationContentPutRequest.Content.builder()
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
        assertThat(notificationContentPutRequest.state()).contains(NotificationTemplateState.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationContentPutRequest =
            NotificationContentPutRequest.builder()
                .content(
                    NotificationContentPutRequest.Content.builder()
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
                .state(NotificationTemplateState.DRAFT)
                .build()

        val roundtrippedNotificationContentPutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationContentPutRequest),
                jacksonTypeRef<NotificationContentPutRequest>(),
            )

        assertThat(roundtrippedNotificationContentPutRequest)
            .isEqualTo(notificationContentPutRequest)
    }
}
