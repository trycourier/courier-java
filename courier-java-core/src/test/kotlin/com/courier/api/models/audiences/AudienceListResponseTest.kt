// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.audiences

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceListResponseTest {

    @Test
    fun create() {
        val audienceListResponse =
            AudienceListResponse.builder()
                .addItem(
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
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        assertThat(audienceListResponse.items())
            .containsExactly(
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
            )
        assertThat(audienceListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audienceListResponse =
            AudienceListResponse.builder()
                .addItem(
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
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        val roundtrippedAudienceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audienceListResponse),
                jacksonTypeRef<AudienceListResponse>(),
            )

        assertThat(roundtrippedAudienceListResponse).isEqualTo(audienceListResponse)
    }
}
