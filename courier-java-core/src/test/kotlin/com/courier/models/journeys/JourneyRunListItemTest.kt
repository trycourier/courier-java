// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRunListItemTest {

    @Test
    fun create() {
        val journeyRunListItem =
            JourneyRunListItem.builder()
                .runId("run_id")
                .addSource("string")
                .createdAt("created_at")
                .status("status")
                .templateId("template_id")
                .build()

        assertThat(journeyRunListItem.runId()).isEqualTo("run_id")
        assertThat(journeyRunListItem.source()).containsExactly("string")
        assertThat(journeyRunListItem.createdAt()).contains("created_at")
        assertThat(journeyRunListItem.status()).contains("status")
        assertThat(journeyRunListItem.templateId()).contains("template_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyRunListItem =
            JourneyRunListItem.builder()
                .runId("run_id")
                .addSource("string")
                .createdAt("created_at")
                .status("status")
                .templateId("template_id")
                .build()

        val roundtrippedJourneyRunListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyRunListItem),
                jacksonTypeRef<JourneyRunListItem>(),
            )

        assertThat(roundtrippedJourneyRunListItem).isEqualTo(journeyRunListItem)
    }
}
