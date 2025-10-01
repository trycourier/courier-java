// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations.invoke

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationStepTest {

    @Test
    fun create() {
        val automationStep = AutomationStep.builder().if_("if").ref("ref").build()

        assertThat(automationStep.if_()).contains("if")
        assertThat(automationStep.ref()).contains("ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationStep = AutomationStep.builder().if_("if").ref("ref").build()

        val roundtrippedAutomationStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationStep),
                jacksonTypeRef<AutomationStep>(),
            )

        assertThat(roundtrippedAutomationStep).isEqualTo(automationStep)
    }
}
