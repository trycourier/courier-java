// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSnippetTest {

    @Test
    fun create() {
        val brandSnippet = BrandSnippet.builder().name("name").value("value").build()

        assertThat(brandSnippet.name()).isEqualTo("name")
        assertThat(brandSnippet.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSnippet = BrandSnippet.builder().name("name").value("value").build()

        val roundtrippedBrandSnippet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSnippet),
                jacksonTypeRef<BrandSnippet>(),
            )

        assertThat(roundtrippedBrandSnippet).isEqualTo(brandSnippet)
    }
}
