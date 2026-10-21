// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalQuoteNodeWithTypeTest {

    @Test
    fun create() {
        val elementalQuoteNodeWithType =
            ElementalQuoteNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .align(Alignment.CENTER)
                .borderColor("border_color")
                .fontSize("font_size")
                .lineHeight("line_height")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .textStyle(TextStyle.TEXT)
                .type(ElementalQuoteNodeWithType.Type.QUOTE)
                .build()

        assertThat(elementalQuoteNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalQuoteNodeWithType.if_()).contains("if")
        assertThat(elementalQuoteNodeWithType.loop()).contains("loop")
        assertThat(elementalQuoteNodeWithType.ref()).contains("ref")
        assertThat(elementalQuoteNodeWithType.content()).isEqualTo("content")
        assertThat(elementalQuoteNodeWithType.align()).contains(Alignment.CENTER)
        assertThat(elementalQuoteNodeWithType.borderColor()).contains("border_color")
        assertThat(elementalQuoteNodeWithType.fontSize()).contains("font_size")
        assertThat(elementalQuoteNodeWithType.lineHeight()).contains("line_height")
        assertThat(elementalQuoteNodeWithType.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
        assertThat(elementalQuoteNodeWithType.textStyle()).contains(TextStyle.TEXT)
        assertThat(elementalQuoteNodeWithType.type())
            .contains(ElementalQuoteNodeWithType.Type.QUOTE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalQuoteNodeWithType =
            ElementalQuoteNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .align(Alignment.CENTER)
                .borderColor("border_color")
                .fontSize("font_size")
                .lineHeight("line_height")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .textStyle(TextStyle.TEXT)
                .type(ElementalQuoteNodeWithType.Type.QUOTE)
                .build()

        val roundtrippedElementalQuoteNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalQuoteNodeWithType),
                jacksonTypeRef<ElementalQuoteNodeWithType>(),
            )

        assertThat(roundtrippedElementalQuoteNodeWithType).isEqualTo(elementalQuoteNodeWithType)
    }
}
