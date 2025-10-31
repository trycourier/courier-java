// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalContentSugarTest {

    @Test
    fun create() {
        val elementalContentSugar =
            ElementalContentSugar.builder().body("body").title("title").build()

        assertThat(elementalContentSugar.body()).isEqualTo("body")
        assertThat(elementalContentSugar.title()).isEqualTo("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalContentSugar =
            ElementalContentSugar.builder().body("body").title("title").build()

        val roundtrippedElementalContentSugar =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalContentSugar),
                jacksonTypeRef<ElementalContentSugar>(),
            )

        assertThat(roundtrippedElementalContentSugar).isEqualTo(elementalContentSugar)
    }
}
