// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalHtmlNodeWithTypeTest {

    @Test
    fun create() {
        val elementalHtmlNodeWithType =
            ElementalHtmlNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalHtmlNodeWithType.Type.HTML)
                .build()

        assertThat(elementalHtmlNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalHtmlNodeWithType.if_()).contains("if")
        assertThat(elementalHtmlNodeWithType.loop()).contains("loop")
        assertThat(elementalHtmlNodeWithType.ref()).contains("ref")
        assertThat(elementalHtmlNodeWithType.type()).contains(ElementalHtmlNodeWithType.Type.HTML)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalHtmlNodeWithType =
            ElementalHtmlNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalHtmlNodeWithType.Type.HTML)
                .build()

        val roundtrippedElementalHtmlNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalHtmlNodeWithType),
                jacksonTypeRef<ElementalHtmlNodeWithType>(),
            )

        assertThat(roundtrippedElementalHtmlNodeWithType).isEqualTo(elementalHtmlNodeWithType)
    }
}
