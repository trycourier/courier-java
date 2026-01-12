// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NestedFilterConfigTest {

    @Test
    fun create() {
        val nestedFilterConfig =
            NestedFilterConfig.builder()
                .operator(NestedFilterConfig.Operator.ENDS_WITH)
                .addRule(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        assertThat(nestedFilterConfig.operator()).isEqualTo(NestedFilterConfig.Operator.ENDS_WITH)
        assertThat(nestedFilterConfig.rules())
            .containsExactly(
                Filter.ofSingleFilterConfig(
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
        val nestedFilterConfig =
            NestedFilterConfig.builder()
                .operator(NestedFilterConfig.Operator.ENDS_WITH)
                .addRule(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedNestedFilterConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nestedFilterConfig),
                jacksonTypeRef<NestedFilterConfig>(),
            )

        assertThat(roundtrippedNestedFilterConfig).isEqualTo(nestedFilterConfig)
    }
}
