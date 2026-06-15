// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigestCategoryTest {

    @Test
    fun create() {
        val digestCategory =
            DigestCategory.builder()
                .categoryKey("category_key")
                .retain(DigestCategory.Retain.FIRST)
                .sortKey("sort_key")
                .build()

        assertThat(digestCategory.categoryKey()).isEqualTo("category_key")
        assertThat(digestCategory.retain()).isEqualTo(DigestCategory.Retain.FIRST)
        assertThat(digestCategory.sortKey()).contains("sort_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digestCategory =
            DigestCategory.builder()
                .categoryKey("category_key")
                .retain(DigestCategory.Retain.FIRST)
                .sortKey("sort_key")
                .build()

        val roundtrippedDigestCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digestCategory),
                jacksonTypeRef<DigestCategory>(),
            )

        assertThat(roundtrippedDigestCategory).isEqualTo(digestCategory)
    }
}
