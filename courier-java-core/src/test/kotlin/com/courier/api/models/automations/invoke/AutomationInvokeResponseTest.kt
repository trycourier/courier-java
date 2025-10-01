// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations.invoke

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationInvokeResponseTest {

    @Test
    fun create() {
        val automationInvokeResponse =
            AutomationInvokeResponse.builder().runId("1-65f240a0-47a6a120c8374de9bcf9f22c").build()

        assertThat(automationInvokeResponse.runId())
            .isEqualTo("1-65f240a0-47a6a120c8374de9bcf9f22c")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationInvokeResponse =
            AutomationInvokeResponse.builder().runId("1-65f240a0-47a6a120c8374de9bcf9f22c").build()

        val roundtrippedAutomationInvokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationInvokeResponse),
                jacksonTypeRef<AutomationInvokeResponse>(),
            )

        assertThat(roundtrippedAutomationInvokeResponse).isEqualTo(automationInvokeResponse)
    }
}
