// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRunListResponseTest {

    @Test
    fun create() {
        val journeyRunListResponse =
            JourneyRunListResponse.builder()
                .addRun(
                    JourneyRunListItem.builder()
                        .runId("run_id")
                        .addSource("string")
                        .createdAt("created_at")
                        .status("status")
                        .templateId("template_id")
                        .build()
                )
                .nextCursor("next_cursor")
                .prevCursor("prev_cursor")
                .build()

        assertThat(journeyRunListResponse.runs())
            .containsExactly(
                JourneyRunListItem.builder()
                    .runId("run_id")
                    .addSource("string")
                    .createdAt("created_at")
                    .status("status")
                    .templateId("template_id")
                    .build()
            )
        assertThat(journeyRunListResponse.nextCursor()).contains("next_cursor")
        assertThat(journeyRunListResponse.prevCursor()).contains("prev_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyRunListResponse =
            JourneyRunListResponse.builder()
                .addRun(
                    JourneyRunListItem.builder()
                        .runId("run_id")
                        .addSource("string")
                        .createdAt("created_at")
                        .status("status")
                        .templateId("template_id")
                        .build()
                )
                .nextCursor("next_cursor")
                .prevCursor("prev_cursor")
                .build()

        val roundtrippedJourneyRunListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyRunListResponse),
                jacksonTypeRef<JourneyRunListResponse>(),
            )

        assertThat(roundtrippedJourneyRunListResponse).isEqualTo(journeyRunListResponse)
    }
}
