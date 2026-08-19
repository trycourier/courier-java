// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRunTest {

    @Test
    fun create() {
        val journeyRun =
            JourneyRun.builder()
                .runId("run_id")
                .addSource("string")
                .createdAt("created_at")
                .status("status")
                .templateId("template_id")
                .updatedAt("updated_at")
                .build()

        assertThat(journeyRun.runId()).isEqualTo("run_id")
        assertThat(journeyRun.source()).containsExactly("string")
        assertThat(journeyRun.createdAt()).contains("created_at")
        assertThat(journeyRun.status()).contains("status")
        assertThat(journeyRun.templateId()).contains("template_id")
        assertThat(journeyRun.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyRun =
            JourneyRun.builder()
                .runId("run_id")
                .addSource("string")
                .createdAt("created_at")
                .status("status")
                .templateId("template_id")
                .updatedAt("updated_at")
                .build()

        val roundtrippedJourneyRun =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyRun),
                jacksonTypeRef<JourneyRun>(),
            )

        assertThat(roundtrippedJourneyRun).isEqualTo(journeyRun)
    }
}
