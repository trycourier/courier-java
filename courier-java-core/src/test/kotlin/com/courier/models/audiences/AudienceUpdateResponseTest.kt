// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.jsonMapper
import com.courier.models.AudienceFilterConfig
import com.courier.models.FilterConfig
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceUpdateResponseTest {

    @Test
    fun create() {
        val audienceUpdateResponse =
            AudienceUpdateResponse.builder()
                .audience(
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
                )
                .build()

        assertThat(audienceUpdateResponse.audience())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audienceUpdateResponse =
            AudienceUpdateResponse.builder()
                .audience(
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
                )
                .build()

        val roundtrippedAudienceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audienceUpdateResponse),
                jacksonTypeRef<AudienceUpdateResponse>(),
            )

        assertThat(roundtrippedAudienceUpdateResponse).isEqualTo(audienceUpdateResponse)
    }
}
