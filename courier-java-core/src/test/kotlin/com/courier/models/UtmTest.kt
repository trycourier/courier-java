// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtmTest {

    @Test
    fun create() {
        val utm =
            Utm.builder()
                .campaign("campaign")
                .content("content")
                .medium("medium")
                .source("source")
                .term("term")
                .build()

        assertThat(utm.campaign()).contains("campaign")
        assertThat(utm.content()).contains("content")
        assertThat(utm.medium()).contains("medium")
        assertThat(utm.source()).contains("source")
        assertThat(utm.term()).contains("term")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val utm =
            Utm.builder()
                .campaign("campaign")
                .content("content")
                .medium("medium")
                .source("source")
                .term("term")
                .build()

        val roundtrippedUtm =
            jsonMapper.readValue(jsonMapper.writeValueAsString(utm), jacksonTypeRef<Utm>())

        assertThat(roundtrippedUtm).isEqualTo(utm)
    }
}
