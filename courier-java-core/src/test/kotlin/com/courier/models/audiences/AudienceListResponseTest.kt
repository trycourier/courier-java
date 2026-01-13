// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.jsonMapper
import com.courier.models.Paging
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
                        .name("name")
                        .updatedAt("updated_at")
                        .filter(
                            Filter.builder()
                                .addFilter(
                                    SingleFilterConfig.builder()
                                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                                        .path("path")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .operator(Audience.Operator.AND)
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
                    .name("name")
                    .updatedAt("updated_at")
                    .filter(
                        Filter.builder()
                            .addFilter(
                                SingleFilterConfig.builder()
                                    .operator(SingleFilterConfig.Operator.ENDS_WITH)
                                    .path("path")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .operator(Audience.Operator.AND)
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
                        .name("name")
                        .updatedAt("updated_at")
                        .filter(
                            Filter.builder()
                                .addFilter(
                                    SingleFilterConfig.builder()
                                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                                        .path("path")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .operator(Audience.Operator.AND)
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
