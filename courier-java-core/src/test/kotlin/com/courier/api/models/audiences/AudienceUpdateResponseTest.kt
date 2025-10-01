// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.audiences

import com.courier.api.core.jsonMapper
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
                        .filter(
                            Filter.UnionMember0.builder()
                                .operator(Filter.UnionMember0.Operator.ENDS_WITH)
                                .path("path")
                                .value("value")
                                .build()
                        )
                        .name("name")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(audienceUpdateResponse.audience())
            .isEqualTo(
                Audience.builder()
                    .id("id")
                    .createdAt("created_at")
                    .description("description")
                    .filter(
                        Filter.UnionMember0.builder()
                            .operator(Filter.UnionMember0.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .name("name")
                    .updatedAt("updated_at")
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
                        .filter(
                            Filter.UnionMember0.builder()
                                .operator(Filter.UnionMember0.Operator.ENDS_WITH)
                                .path("path")
                                .value("value")
                                .build()
                        )
                        .name("name")
                        .updatedAt("updated_at")
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
