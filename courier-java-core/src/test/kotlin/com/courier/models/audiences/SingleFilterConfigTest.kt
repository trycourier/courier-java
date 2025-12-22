// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleFilterConfigTest {

    @Test
    fun create() {
        val singleFilterConfig =
            SingleFilterConfig.builder()
                .operator(SingleFilterConfig.Operator.ENDS_WITH)
                .path("path")
                .value("value")
                .build()

        assertThat(singleFilterConfig.operator()).isEqualTo(SingleFilterConfig.Operator.ENDS_WITH)
        assertThat(singleFilterConfig.path()).isEqualTo("path")
        assertThat(singleFilterConfig.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val singleFilterConfig =
            SingleFilterConfig.builder()
                .operator(SingleFilterConfig.Operator.ENDS_WITH)
                .path("path")
                .value("value")
                .build()

        val roundtrippedSingleFilterConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(singleFilterConfig),
                jacksonTypeRef<SingleFilterConfig>(),
            )

        assertThat(roundtrippedSingleFilterConfig).isEqualTo(singleFilterConfig)
    }
}
