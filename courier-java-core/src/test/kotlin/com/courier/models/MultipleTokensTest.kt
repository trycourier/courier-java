// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipleTokensTest {

    @Test
    fun create() {
        val multipleTokens = MultipleTokens.builder().tokens("string").build()

        assertThat(multipleTokens.tokens()).isEqualTo(MultipleTokens.Tokens.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipleTokens = MultipleTokens.builder().tokens("string").build()

        val roundtrippedMultipleTokens =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipleTokens),
                jacksonTypeRef<MultipleTokens>(),
            )

        assertThat(roundtrippedMultipleTokens).isEqualTo(multipleTokens)
    }
}
