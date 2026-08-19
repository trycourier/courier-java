// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationRunListResponseTest {

    @Test
    fun create() {
        val automationRunListResponse =
            AutomationRunListResponse.builder()
                .addRun(
                    AutomationRunListItem.builder()
                        .runId("run_id")
                        .addSource("string")
                        .createdAt("created_at")
                        .status("status")
                        .templateId("template_id")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(automationRunListResponse.runs())
            .containsExactly(
                AutomationRunListItem.builder()
                    .runId("run_id")
                    .addSource("string")
                    .createdAt("created_at")
                    .status("status")
                    .templateId("template_id")
                    .build()
            )
        assertThat(automationRunListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationRunListResponse =
            AutomationRunListResponse.builder()
                .addRun(
                    AutomationRunListItem.builder()
                        .runId("run_id")
                        .addSource("string")
                        .createdAt("created_at")
                        .status("status")
                        .templateId("template_id")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedAutomationRunListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationRunListResponse),
                jacksonTypeRef<AutomationRunListResponse>(),
            )

        assertThat(roundtrippedAutomationRunListResponse).isEqualTo(automationRunListResponse)
    }
}
