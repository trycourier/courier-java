// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalChannelNodeTest {

    @Test
    fun create() {
        val elementalChannelNode =
            ElementalChannelNode.builder()
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
                .build()

        assertThat(elementalChannelNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalChannelNode.if_()).contains("if")
        assertThat(elementalChannelNode.loop()).contains("loop")
        assertThat(elementalChannelNode.ref()).contains("ref")
        assertThat(elementalChannelNode.channel()).contains("email")
        assertThat(elementalChannelNode.elements().getOrNull())
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
        assertThat(elementalChannelNode.fontSize()).contains("font_size")
        assertThat(elementalChannelNode.lineHeight()).contains("line_height")
        assertThat(elementalChannelNode.padding()).contains("padding")
        assertThat(elementalChannelNode.raw())
            .contains(
                ElementalChannelNode.Raw.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalChannelNode =
            ElementalChannelNode.builder()
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
                .build()

        val roundtrippedElementalChannelNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalChannelNode),
                jacksonTypeRef<ElementalChannelNode>(),
            )

        assertThat(roundtrippedElementalChannelNode).isEqualTo(elementalChannelNode)
    }
}
