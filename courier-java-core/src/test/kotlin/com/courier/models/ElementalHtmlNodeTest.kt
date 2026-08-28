// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalHtmlNodeTest {

    @Test
    fun create() {
        val elementalHtmlNode =
            ElementalHtmlNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .build()

        assertThat(elementalHtmlNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalHtmlNode.if_()).contains("if")
        assertThat(elementalHtmlNode.loop()).contains("loop")
        assertThat(elementalHtmlNode.ref()).contains("ref")
        assertThat(elementalHtmlNode.content()).isEqualTo("content")
        assertThat(elementalHtmlNode.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalHtmlNode =
            ElementalHtmlNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .build()

        val roundtrippedElementalHtmlNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalHtmlNode),
                jacksonTypeRef<ElementalHtmlNode>(),
            )

        assertThat(roundtrippedElementalHtmlNode).isEqualTo(elementalHtmlNode)
    }
}
