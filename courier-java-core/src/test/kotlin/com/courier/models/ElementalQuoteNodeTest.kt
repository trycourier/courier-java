// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalQuoteNodeTest {

    @Test
    fun create() {
        val elementalQuoteNode =
            ElementalQuoteNode.builder()
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
                .build()

        assertThat(elementalQuoteNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalQuoteNode.if_()).contains("if")
        assertThat(elementalQuoteNode.loop()).contains("loop")
        assertThat(elementalQuoteNode.ref()).contains("ref")
        assertThat(elementalQuoteNode.content()).isEqualTo("content")
        assertThat(elementalQuoteNode.align()).contains(Alignment.CENTER)
        assertThat(elementalQuoteNode.borderColor()).contains("border_color")
        assertThat(elementalQuoteNode.fontSize()).contains("font_size")
        assertThat(elementalQuoteNode.lineHeight()).contains("line_height")
        assertThat(elementalQuoteNode.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
        assertThat(elementalQuoteNode.textStyle()).contains(TextStyle.TEXT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalQuoteNode =
            ElementalQuoteNode.builder()
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
                .build()

        val roundtrippedElementalQuoteNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalQuoteNode),
                jacksonTypeRef<ElementalQuoteNode>(),
            )

        assertThat(roundtrippedElementalQuoteNode).isEqualTo(elementalQuoteNode)
    }
}
