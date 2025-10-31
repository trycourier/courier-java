// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSnippetsTest {

    @Test
    fun create() {
        val brandSnippets =
            BrandSnippets.builder()
                .addItem(BrandSnippet.builder().name("name").value("value").build())
                .build()

        assertThat(brandSnippets.items().getOrNull())
            .containsExactly(BrandSnippet.builder().name("name").value("value").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSnippets =
            BrandSnippets.builder()
                .addItem(BrandSnippet.builder().name("name").value("value").build())
                .build()

        val roundtrippedBrandSnippets =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSnippets),
                jacksonTypeRef<BrandSnippets>(),
            )

        assertThat(roundtrippedBrandSnippets).isEqualTo(brandSnippets)
    }
}
