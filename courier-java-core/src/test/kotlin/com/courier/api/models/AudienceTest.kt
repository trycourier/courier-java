// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
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
                .filter(
                    Filter.builder()
                        .operator(Filter.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .name("name")
                .updatedAt("updated_at")
                .build()

        assertThat(audience.id()).isEqualTo("id")
        assertThat(audience.createdAt()).isEqualTo("created_at")
        assertThat(audience.description()).isEqualTo("description")
        assertThat(audience.filter())
            .isEqualTo(
                Filter.builder()
                    .operator(Filter.Operator.ENDS_WITH)
                    .path("path")
                    .value("value")
                    .build()
            )
        assertThat(audience.name()).isEqualTo("name")
        assertThat(audience.updatedAt()).isEqualTo("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audience =
            Audience.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .filter(
                    Filter.builder()
                        .operator(Filter.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .name("name")
                .updatedAt("updated_at")
                .build()

        val roundtrippedAudience =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audience),
                jacksonTypeRef<Audience>(),
            )

        assertThat(roundtrippedAudience).isEqualTo(audience)
    }
}
