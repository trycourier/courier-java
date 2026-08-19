// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRunStepsResponseTest {

    @Test
    fun create() {
        val journeyRunStepsResponse =
            JourneyRunStepsResponse.builder()
                .addStep(
                    JourneyRunStep.builder()
                        .action("action")
                        .status("status")
                        .createdAt("created_at")
                        .messageId("message_id")
                        .nodeId("node_id")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(journeyRunStepsResponse.steps())
            .containsExactly(
                JourneyRunStep.builder()
                    .action("action")
                    .status("status")
                    .createdAt("created_at")
                    .messageId("message_id")
                    .nodeId("node_id")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyRunStepsResponse =
            JourneyRunStepsResponse.builder()
                .addStep(
                    JourneyRunStep.builder()
                        .action("action")
                        .status("status")
                        .createdAt("created_at")
                        .messageId("message_id")
                        .nodeId("node_id")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedJourneyRunStepsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyRunStepsResponse),
                jacksonTypeRef<JourneyRunStepsResponse>(),
            )

        assertThat(roundtrippedJourneyRunStepsResponse).isEqualTo(journeyRunStepsResponse)
    }
}
