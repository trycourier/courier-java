// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalTextNodeTest {

    @Test
    fun create() {
        val elementalTextNode =
            ElementalTextNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .align(ElementalTextNode.Align.LEFT)
                .bold("bold")
                .color("color")
                .fontSize("font_size")
                .format(ElementalTextNode.Format.MARKDOWN)
                .italic("italic")
                .lineHeight("line_height")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .strikethrough("strikethrough")
                .textStyle(TextStyle.TEXT)
                .underline("underline")
                .build()

        assertThat(elementalTextNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalTextNode.if_()).contains("if")
        assertThat(elementalTextNode.loop()).contains("loop")
        assertThat(elementalTextNode.ref()).contains("ref")
        assertThat(elementalTextNode.content()).isEqualTo("content")
        assertThat(elementalTextNode.align()).contains(ElementalTextNode.Align.LEFT)
        assertThat(elementalTextNode.bold()).contains("bold")
        assertThat(elementalTextNode.color()).contains("color")
        assertThat(elementalTextNode.fontSize()).contains("font_size")
        assertThat(elementalTextNode.format()).contains(ElementalTextNode.Format.MARKDOWN)
        assertThat(elementalTextNode.italic()).contains("italic")
        assertThat(elementalTextNode.lineHeight()).contains("line_height")
        assertThat(elementalTextNode.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
        assertThat(elementalTextNode.strikethrough()).contains("strikethrough")
        assertThat(elementalTextNode.textStyle()).contains(TextStyle.TEXT)
        assertThat(elementalTextNode.underline()).contains("underline")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalTextNode =
            ElementalTextNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .align(ElementalTextNode.Align.LEFT)
                .bold("bold")
                .color("color")
                .fontSize("font_size")
                .format(ElementalTextNode.Format.MARKDOWN)
                .italic("italic")
                .lineHeight("line_height")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .strikethrough("strikethrough")
                .textStyle(TextStyle.TEXT)
                .underline("underline")
                .build()

        val roundtrippedElementalTextNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalTextNode),
                jacksonTypeRef<ElementalTextNode>(),
            )

        assertThat(roundtrippedElementalTextNode).isEqualTo(elementalTextNode)
    }
}
