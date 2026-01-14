// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceFilterConfigTest {

    @Test
    fun create() {
        val audienceFilterConfig =
            AudienceFilterConfig.builder()
                .addFilter(
                    FilterConfig.builder()
                        .operator("operator")
                        .filters(listOf())
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        assertThat(audienceFilterConfig.filters())
            .containsExactly(
                FilterConfig.builder()
                    .operator("operator")
                    .filters(listOf())
                    .path("path")
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audienceFilterConfig =
            AudienceFilterConfig.builder()
                .addFilter(
                    FilterConfig.builder()
                        .operator("operator")
                        .filters(listOf())
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedAudienceFilterConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audienceFilterConfig),
                jacksonTypeRef<AudienceFilterConfig>(),
            )

        assertThat(roundtrippedAudienceFilterConfig).isEqualTo(audienceFilterConfig)
    }
}
