// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationTemplateListResponseTest {

    @Test
    fun create() {
        val automationTemplateListResponse =
            AutomationTemplateListResponse.builder()
                .cursor("cursor")
                .addTemplate(
                    AutomationTemplate.builder()
                        .id("id")
                        .name("name")
                        .version(AutomationTemplate.Version.PUBLISHED)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(automationTemplateListResponse.cursor()).contains("cursor")
        assertThat(automationTemplateListResponse.templates().getOrNull())
            .containsExactly(
                AutomationTemplate.builder()
                    .id("id")
                    .name("name")
                    .version(AutomationTemplate.Version.PUBLISHED)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationTemplateListResponse =
            AutomationTemplateListResponse.builder()
                .cursor("cursor")
                .addTemplate(
                    AutomationTemplate.builder()
                        .id("id")
                        .name("name")
                        .version(AutomationTemplate.Version.PUBLISHED)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedAutomationTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationTemplateListResponse),
                jacksonTypeRef<AutomationTemplateListResponse>(),
            )

        assertThat(roundtrippedAutomationTemplateListResponse)
            .isEqualTo(automationTemplateListResponse)
    }
}
