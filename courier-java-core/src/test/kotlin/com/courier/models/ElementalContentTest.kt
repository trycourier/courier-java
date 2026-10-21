// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalContentTest {

    @Test
    fun create() {
        val elementalContent =
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

        assertThat(elementalContent.elements())
            .containsExactly(
                ElementalNode.ofTextNodeWithType(
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
            )
        assertThat(elementalContent.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalContent =
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

        val roundtrippedElementalContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalContent),
                jacksonTypeRef<ElementalContent>(),
            )

        assertThat(roundtrippedElementalContent).isEqualTo(elementalContent)
    }
}
