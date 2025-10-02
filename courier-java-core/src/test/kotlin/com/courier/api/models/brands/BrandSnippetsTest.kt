// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSnippetsTest {

    @Test
    fun create() {
        val brandSnippets =
            BrandSnippets.builder()
                .addItem(
                    BrandSnippet.builder()
                        .format(BrandSnippet.Format.HANDLEBARS)
                        .name("name")
                        .value("value")
                        .build()
                )
                .build()

        assertThat(brandSnippets.items())
            .containsExactly(
                BrandSnippet.builder()
                    .format(BrandSnippet.Format.HANDLEBARS)
                    .name("name")
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSnippets =
            BrandSnippets.builder()
                .addItem(
                    BrandSnippet.builder()
                        .format(BrandSnippet.Format.HANDLEBARS)
                        .name("name")
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedBrandSnippets =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSnippets),
                jacksonTypeRef<BrandSnippets>(),
            )

        assertThat(roundtrippedBrandSnippets).isEqualTo(brandSnippets)
    }
}
