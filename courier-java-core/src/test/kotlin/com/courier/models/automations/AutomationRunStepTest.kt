// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationRunStepTest {

    @Test
    fun create() {
        val automationRunStep =
            AutomationRunStep.builder()
                .action("action")
                .status("status")
                .createdAt("created_at")
                .messageId("message_id")
                .stepId("step_id")
                .updatedAt("updated_at")
                .build()

        assertThat(automationRunStep.action()).isEqualTo("action")
        assertThat(automationRunStep.status()).isEqualTo("status")
        assertThat(automationRunStep.createdAt()).contains("created_at")
        assertThat(automationRunStep.messageId()).contains("message_id")
        assertThat(automationRunStep.stepId()).contains("step_id")
        assertThat(automationRunStep.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationRunStep =
            AutomationRunStep.builder()
                .action("action")
                .status("status")
                .createdAt("created_at")
                .messageId("message_id")
                .stepId("step_id")
                .updatedAt("updated_at")
                .build()

        val roundtrippedAutomationRunStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationRunStep),
                jacksonTypeRef<AutomationRunStep>(),
            )

        assertThat(roundtrippedAutomationRunStep).isEqualTo(automationRunStep)
    }
}
