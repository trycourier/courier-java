// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRunResponseTest {

    @Test
    fun create() {
        val journeyRunResponse =
            JourneyRunResponse.builder()
                .run(
                    JourneyRun.builder()
                        .runId("run_id")
                        .addSource("string")
                        .createdAt("created_at")
                        .status("status")
                        .templateId("template_id")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(journeyRunResponse.run())
            .isEqualTo(
                JourneyRun.builder()
                    .runId("run_id")
                    .addSource("string")
                    .createdAt("created_at")
                    .status("status")
                    .templateId("template_id")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyRunResponse =
            JourneyRunResponse.builder()
                .run(
                    JourneyRun.builder()
                        .runId("run_id")
                        .addSource("string")
                        .createdAt("created_at")
                        .status("status")
                        .templateId("template_id")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedJourneyRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyRunResponse),
                jacksonTypeRef<JourneyRunResponse>(),
            )

        assertThat(roundtrippedJourneyRunResponse).isEqualTo(journeyRunResponse)
    }
}
