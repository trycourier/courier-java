// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.models.ElementalChannelNode
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalNodeNonChannel
import com.courier.models.ElementalTextNode
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.Locales
import com.courier.models.TextStyle
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPutContentParamsTest {

    @Test
    fun create() {
        NotificationPutContentParams.builder()
            .id("id")
            .notificationContentPutRequest(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(
                                ElementalChannelNodeWithType.builder()
                                    .addChannel("string")
                                    .if_("if")
                                    .loop("loop")
                                    .ref("ref")
                                    .channel("email")
                                    .addElement(
                                        ElementalNodeNonChannel.UnionMember1.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .title("Welcome!")
                                            .type(ElementalNodeNonChannel.UnionMember1.Type.META)
                                            .build()
                                    )
                                    .addElement(
                                        ElementalNodeNonChannel.UnionMember0.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .align(ElementalTextNode.Align.LEFT)
                                            .bold("bold")
                                            .color("color")
                                            .content("Hello {{data.name}}.")
                                            .fontSize("font_size")
                                            .format(ElementalTextNode.Format.MARKDOWN)
                                            .italic("italic")
                                            .lineHeight("line_height")
                                            .locales(
                                                Locales.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(
                                                            mapOf("content" to "content")
                                                        ),
                                                    )
                                                    .build()
                                            )
                                            .strikethrough("strikethrough")
                                            .textStyle(TextStyle.TEXT)
                                            .underline("underline")
                                            .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                                            .build()
                                    )
                                    .fontSize("font_size")
                                    .lineHeight("line_height")
                                    .padding("padding")
                                    .raw(
                                        ElementalChannelNode.Raw.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
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
    }

    @Test
    fun pathParams() {
        val params =
            NotificationPutContentParams.builder()
                .id("id")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(ElementalTextNodeWithType.builder().build())
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationPutContentParams.builder()
                .id("id")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(
                                    ElementalChannelNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .channel("email")
                                        .addElement(
                                            ElementalNodeNonChannel.UnionMember1.builder()
                                                .addChannel("string")
                                                .if_("if")
                                                .loop("loop")
                                                .ref("ref")
                                                .title("Welcome!")
                                                .type(
                                                    ElementalNodeNonChannel.UnionMember1.Type.META
                                                )
                                                .build()
                                        )
                                        .addElement(
                                            ElementalNodeNonChannel.UnionMember0.builder()
                                                .addChannel("string")
                                                .if_("if")
                                                .loop("loop")
                                                .ref("ref")
                                                .align(ElementalTextNode.Align.LEFT)
                                                .bold("bold")
                                                .color("color")
                                                .content("Hello {{data.name}}.")
                                                .fontSize("font_size")
                                                .format(ElementalTextNode.Format.MARKDOWN)
                                                .italic("italic")
                                                .lineHeight("line_height")
                                                .locales(
                                                    Locales.builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from(
                                                                mapOf("content" to "content")
                                                            ),
                                                        )
                                                        .build()
                                                )
                                                .strikethrough("strikethrough")
                                                .textStyle(TextStyle.TEXT)
                                                .underline("underline")
                                                .type(
                                                    ElementalNodeNonChannel.UnionMember0.Type.TEXT
                                                )
                                                .build()
                                        )
                                        .fontSize("font_size")
                                        .lineHeight("line_height")
                                        .padding("padding")
                                        .raw(
                                            ElementalChannelNode.Raw.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(
                                ElementalChannelNodeWithType.builder()
                                    .addChannel("string")
                                    .if_("if")
                                    .loop("loop")
                                    .ref("ref")
                                    .channel("email")
                                    .addElement(
                                        ElementalNodeNonChannel.UnionMember1.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .title("Welcome!")
                                            .type(ElementalNodeNonChannel.UnionMember1.Type.META)
                                            .build()
                                    )
                                    .addElement(
                                        ElementalNodeNonChannel.UnionMember0.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .align(ElementalTextNode.Align.LEFT)
                                            .bold("bold")
                                            .color("color")
                                            .content("Hello {{data.name}}.")
                                            .fontSize("font_size")
                                            .format(ElementalTextNode.Format.MARKDOWN)
                                            .italic("italic")
                                            .lineHeight("line_height")
                                            .locales(
                                                Locales.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(
                                                            mapOf("content" to "content")
                                                        ),
                                                    )
                                                    .build()
                                            )
                                            .strikethrough("strikethrough")
                                            .textStyle(TextStyle.TEXT)
                                            .underline("underline")
                                            .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                                            .build()
                                    )
                                    .fontSize("font_size")
                                    .lineHeight("line_height")
                                    .padding("padding")
                                    .raw(
                                        ElementalChannelNode.Raw.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                    .build()
                            )
                            .version("2022-01-01")
                            .build()
                    )
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationPutContentParams.builder()
                .id("id")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(ElementalTextNodeWithType.builder().build())
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(ElementalTextNodeWithType.builder().build())
                            .build()
                    )
                    .build()
            )
    }
}
