// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationInvokeResponseTest {

    @Test
    fun create() {
        val automationInvokeResponse = AutomationInvokeResponse.builder().runId("runId").build()

        assertThat(automationInvokeResponse.runId()).isEqualTo("runId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationInvokeResponse = AutomationInvokeResponse.builder().runId("runId").build()

        val roundtrippedAutomationInvokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationInvokeResponse),
                jacksonTypeRef<AutomationInvokeResponse>(),
            )

        assertThat(roundtrippedAutomationInvokeResponse).isEqualTo(automationInvokeResponse)
    }
}
