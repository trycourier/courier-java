// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyVersionsListResponseTest {

    @Test
    fun create() {
        val journeyVersionsListResponse =
            JourneyVersionsListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    JourneyVersionItem.builder()
                        .created(0L)
                        .creator("creator")
                        .name("name")
                        .published(0L)
                        .version("version")
                        .build()
                )
                .build()

        assertThat(journeyVersionsListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(journeyVersionsListResponse.results())
            .containsExactly(
                JourneyVersionItem.builder()
                    .created(0L)
                    .creator("creator")
                    .name("name")
                    .published(0L)
                    .version("version")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyVersionsListResponse =
            JourneyVersionsListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    JourneyVersionItem.builder()
                        .created(0L)
                        .creator("creator")
                        .name("name")
                        .published(0L)
                        .version("version")
                        .build()
                )
                .build()

        val roundtrippedJourneyVersionsListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyVersionsListResponse),
                jacksonTypeRef<JourneyVersionsListResponse>(),
            )

        assertThat(roundtrippedJourneyVersionsListResponse).isEqualTo(journeyVersionsListResponse)
    }
}
