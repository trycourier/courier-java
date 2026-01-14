// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterConfigTest {

    @Test
    fun create() {
        val filterConfig =
            FilterConfig.builder()
                .operator("operator")
                .filters(listOf())
                .path("path")
                .value("value")
                .build()

        assertThat(filterConfig.operator()).isEqualTo("operator")
        assertThat(filterConfig.filters().getOrNull()).containsExactly()
        assertThat(filterConfig.path()).contains("path")
        assertThat(filterConfig.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterConfig =
            FilterConfig.builder()
                .operator("operator")
                .filters(listOf())
                .path("path")
                .value("value")
                .build()

        val roundtrippedFilterConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterConfig),
                jacksonTypeRef<FilterConfig>(),
            )

        assertThat(roundtrippedFilterConfig).isEqualTo(filterConfig)
    }
}
