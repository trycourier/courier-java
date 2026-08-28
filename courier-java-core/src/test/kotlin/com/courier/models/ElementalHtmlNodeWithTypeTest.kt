// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalHtmlNodeWithTypeTest {

    @Test
    fun create() {
        val elementalHtmlNodeWithType =
            ElementalHtmlNodeWithType.builder().type(ElementalHtmlNodeWithType.Type.HTML).build()

        assertThat(elementalHtmlNodeWithType.type()).contains(ElementalHtmlNodeWithType.Type.HTML)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalHtmlNodeWithType =
            ElementalHtmlNodeWithType.builder().type(ElementalHtmlNodeWithType.Type.HTML).build()

        val roundtrippedElementalHtmlNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalHtmlNodeWithType),
                jacksonTypeRef<ElementalHtmlNodeWithType>(),
            )

        assertThat(roundtrippedElementalHtmlNodeWithType).isEqualTo(elementalHtmlNodeWithType)
    }
}
