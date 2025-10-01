// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations.invoke

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationInvokeParamsTest {

    @Test
    fun create() {
        val automationInvokeParams =
            AutomationInvokeParams.builder()
                .brand("brand")
                .data(
                    AutomationInvokeParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .profile(JsonValue.from(mapOf<String, Any>()))
                .recipient("recipient")
                .template("template")
                .build()

        assertThat(automationInvokeParams.brand()).contains("brand")
        assertThat(automationInvokeParams.data())
            .contains(
                AutomationInvokeParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(automationInvokeParams._profile())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(automationInvokeParams.recipient()).contains("recipient")
        assertThat(automationInvokeParams.template()).contains("template")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationInvokeParams =
            AutomationInvokeParams.builder()
                .brand("brand")
                .data(
                    AutomationInvokeParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .profile(JsonValue.from(mapOf<String, Any>()))
                .recipient("recipient")
                .template("template")
                .build()

        val roundtrippedAutomationInvokeParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationInvokeParams),
                jacksonTypeRef<AutomationInvokeParams>(),
            )

        assertThat(roundtrippedAutomationInvokeParams).isEqualTo(automationInvokeParams)
    }
}
