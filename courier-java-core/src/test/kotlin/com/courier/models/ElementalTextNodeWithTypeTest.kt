// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalTextNodeWithTypeTest {

    @Test
    fun create() {
        val elementalTextNodeWithType =
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
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .strikethrough("strikethrough")
                .textStyle(TextStyle.TEXT)
                .underline("underline")
                .type(ElementalTextNodeWithType.Type.TEXT)
                .build()

        assertThat(elementalTextNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalTextNodeWithType.if_()).contains("if")
        assertThat(elementalTextNodeWithType.loop()).contains("loop")
        assertThat(elementalTextNodeWithType.ref()).contains("ref")
        assertThat(elementalTextNodeWithType.align()).contains(ElementalTextNode.Align.LEFT)
        assertThat(elementalTextNodeWithType.bold()).contains("bold")
        assertThat(elementalTextNodeWithType.color()).contains("color")
        assertThat(elementalTextNodeWithType.content()).contains("content")
        assertThat(elementalTextNodeWithType.fontSize()).contains("font_size")
        assertThat(elementalTextNodeWithType.format()).contains(ElementalTextNode.Format.MARKDOWN)
        assertThat(elementalTextNodeWithType.italic()).contains("italic")
        assertThat(elementalTextNodeWithType.lineHeight()).contains("line_height")
        assertThat(elementalTextNodeWithType.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
        assertThat(elementalTextNodeWithType.strikethrough()).contains("strikethrough")
        assertThat(elementalTextNodeWithType.textStyle()).contains(TextStyle.TEXT)
        assertThat(elementalTextNodeWithType.underline()).contains("underline")
        assertThat(elementalTextNodeWithType.type()).contains(ElementalTextNodeWithType.Type.TEXT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalTextNodeWithType =
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
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .strikethrough("strikethrough")
                .textStyle(TextStyle.TEXT)
                .underline("underline")
                .type(ElementalTextNodeWithType.Type.TEXT)
                .build()

        val roundtrippedElementalTextNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalTextNodeWithType),
                jacksonTypeRef<ElementalTextNodeWithType>(),
            )

        assertThat(roundtrippedElementalTextNodeWithType).isEqualTo(elementalTextNodeWithType)
    }
}
