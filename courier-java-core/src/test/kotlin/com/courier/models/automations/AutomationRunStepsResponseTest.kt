// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationRunStepsResponseTest {

    @Test
    fun create() {
        val automationRunStepsResponse =
            AutomationRunStepsResponse.builder()
                .addStep(
                    AutomationRunStep.builder()
                        .action("action")
                        .status("status")
                        .createdAt("created_at")
                        .messageId("message_id")
                        .stepId("step_id")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(automationRunStepsResponse.steps())
            .containsExactly(
                AutomationRunStep.builder()
                    .action("action")
                    .status("status")
                    .createdAt("created_at")
                    .messageId("message_id")
                    .stepId("step_id")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationRunStepsResponse =
            AutomationRunStepsResponse.builder()
                .addStep(
                    AutomationRunStep.builder()
                        .action("action")
                        .status("status")
                        .createdAt("created_at")
                        .messageId("message_id")
                        .stepId("step_id")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedAutomationRunStepsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationRunStepsResponse),
                jacksonTypeRef<AutomationRunStepsResponse>(),
            )

        assertThat(roundtrippedAutomationRunStepsResponse).isEqualTo(automationRunStepsResponse)
    }
}
