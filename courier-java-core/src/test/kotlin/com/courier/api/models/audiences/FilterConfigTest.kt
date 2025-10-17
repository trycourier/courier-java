// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.audiences

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterConfigTest {

    @Test
    fun create() {
        val filterConfig =
            FilterConfig.builder()
                .operator(FilterConfig.Operator.ENDS_WITH)
                .path("path")
                .value("value")
                .build()

        assertThat(filterConfig.operator()).isEqualTo(FilterConfig.Operator.ENDS_WITH)
        assertThat(filterConfig.path()).isEqualTo("path")
        assertThat(filterConfig.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterConfig =
            FilterConfig.builder()
                .operator(FilterConfig.Operator.ENDS_WITH)
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
