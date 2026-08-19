// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRunStepTest {

    @Test
    fun create() {
        val journeyRunStep =
            JourneyRunStep.builder()
                .action("action")
                .status("status")
                .createdAt("created_at")
                .messageId("message_id")
                .nodeId("node_id")
                .updatedAt("updated_at")
                .build()

        assertThat(journeyRunStep.action()).isEqualTo("action")
        assertThat(journeyRunStep.status()).isEqualTo("status")
        assertThat(journeyRunStep.createdAt()).contains("created_at")
        assertThat(journeyRunStep.messageId()).contains("message_id")
        assertThat(journeyRunStep.nodeId()).contains("node_id")
        assertThat(journeyRunStep.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyRunStep =
            JourneyRunStep.builder()
                .action("action")
                .status("status")
                .createdAt("created_at")
                .messageId("message_id")
                .nodeId("node_id")
                .updatedAt("updated_at")
                .build()

        val roundtrippedJourneyRunStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyRunStep),
                jacksonTypeRef<JourneyRunStep>(),
            )

        assertThat(roundtrippedJourneyRunStep).isEqualTo(journeyRunStep)
    }
}
