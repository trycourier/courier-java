// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
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
                .type(ElementalQuoteNodeWithType.Type.QUOTE)
                .build()

        assertThat(elementalQuoteNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalQuoteNodeWithType.if_()).contains("if")
        assertThat(elementalQuoteNodeWithType.loop()).contains("loop")
        assertThat(elementalQuoteNodeWithType.ref()).contains("ref")
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
