// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterTest {

    @Test
    fun create() {
        val filter =
            Filter.builder()
                .addFilter(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        assertThat(filter.filters())
            .containsExactly(
                FilterConfig.ofSingle(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.builder()
                .addFilter(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }
}
