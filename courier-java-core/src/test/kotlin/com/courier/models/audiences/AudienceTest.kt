// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.jsonMapper
import com.courier.models.AudienceFilterConfig
import com.courier.models.FilterConfig
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceTest {

    @Test
    fun create() {
        val audience =
            Audience.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .name("name")
                .updatedAt("updated_at")
                .filter(
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
                )
                .operator(Audience.Operator.AND)
                .build()

        assertThat(audience.id()).isEqualTo("id")
        assertThat(audience.createdAt()).isEqualTo("created_at")
        assertThat(audience.description()).isEqualTo("description")
        assertThat(audience.name()).isEqualTo("name")
        assertThat(audience.updatedAt()).isEqualTo("updated_at")
        assertThat(audience.filter())
            .contains(
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
            )
        assertThat(audience.operator()).contains(Audience.Operator.AND)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audience =
            Audience.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .name("name")
                .updatedAt("updated_at")
                .filter(
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
                )
                .operator(Audience.Operator.AND)
                .build()

        val roundtrippedAudience =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audience),
                jacksonTypeRef<Audience>(),
            )

        assertThat(roundtrippedAudience).isEqualTo(audience)
    }
}
