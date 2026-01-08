// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationTemplateTest {

    @Test
    fun create() {
        val automationTemplate =
            AutomationTemplate.builder()
                .id("id")
                .name("name")
                .version(AutomationTemplate.Version.PUBLISHED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(automationTemplate.id()).isEqualTo("id")
        assertThat(automationTemplate.name()).isEqualTo("name")
        assertThat(automationTemplate.version()).isEqualTo(AutomationTemplate.Version.PUBLISHED)
        assertThat(automationTemplate.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(automationTemplate.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationTemplate =
            AutomationTemplate.builder()
                .id("id")
                .name("name")
                .version(AutomationTemplate.Version.PUBLISHED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAutomationTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationTemplate),
                jacksonTypeRef<AutomationTemplate>(),
            )

        assertThat(roundtrippedAutomationTemplate).isEqualTo(automationTemplate)
    }
}
