// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationRunListItemTest {

    @Test
    fun create() {
        val automationRunListItem =
            AutomationRunListItem.builder()
                .runId("run_id")
                .addSource("string")
                .createdAt("created_at")
                .status("status")
                .templateId("template_id")
                .build()

        assertThat(automationRunListItem.runId()).isEqualTo("run_id")
        assertThat(automationRunListItem.source()).containsExactly("string")
        assertThat(automationRunListItem.createdAt()).contains("created_at")
        assertThat(automationRunListItem.status()).contains("status")
        assertThat(automationRunListItem.templateId()).contains("template_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationRunListItem =
            AutomationRunListItem.builder()
                .runId("run_id")
                .addSource("string")
                .createdAt("created_at")
                .status("status")
                .templateId("template_id")
                .build()

        val roundtrippedAutomationRunListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationRunListItem),
                jacksonTypeRef<AutomationRunListItem>(),
            )

        assertThat(roundtrippedAutomationRunListItem).isEqualTo(automationRunListItem)
    }
}
