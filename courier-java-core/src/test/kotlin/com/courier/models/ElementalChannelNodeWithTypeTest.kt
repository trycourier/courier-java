// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalChannelNodeWithTypeTest {

    @Test
    fun create() {
        val elementalChannelNodeWithType =
            ElementalChannelNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .channel("email")
                .addElement(
                    ElementalNodeNonChannel.UnionMember0.builder()
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

        assertThat(elementalChannelNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalChannelNodeWithType.if_()).contains("if")
        assertThat(elementalChannelNodeWithType.loop()).contains("loop")
        assertThat(elementalChannelNodeWithType.ref()).contains("ref")
        assertThat(elementalChannelNodeWithType.channel()).contains("email")
        assertThat(elementalChannelNodeWithType.elements().getOrNull())
            .containsExactly(
                ElementalNodeNonChannel.ofUnionMember0(
                    ElementalNodeNonChannel.UnionMember0.builder()
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
                        .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                        .build()
                )
            )
        assertThat(elementalChannelNodeWithType.fontSize()).contains("font_size")
        assertThat(elementalChannelNodeWithType.lineHeight()).contains("line_height")
        assertThat(elementalChannelNodeWithType.padding()).contains("padding")
        assertThat(elementalChannelNodeWithType.raw())
            .contains(
                ElementalChannelNode.Raw.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(elementalChannelNodeWithType.type())
            .contains(ElementalChannelNodeWithType.Type.CHANNEL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalChannelNodeWithType =
            ElementalChannelNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .channel("email")
                .addElement(
                    ElementalNodeNonChannel.UnionMember0.builder()
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

        val roundtrippedElementalChannelNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalChannelNodeWithType),
                jacksonTypeRef<ElementalChannelNodeWithType>(),
            )

        assertThat(roundtrippedElementalChannelNodeWithType).isEqualTo(elementalChannelNodeWithType)
    }
}
