// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTemplateSummaryTest {

    @Test
    fun create() {
        val journeyTemplateSummary =
            JourneyTemplateSummary.builder()
                .id("id")
                .created(0L)
                .creator("creator")
                .name("name")
                .state("state")
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(journeyTemplateSummary.id()).isEqualTo("id")
        assertThat(journeyTemplateSummary.created()).isEqualTo(0L)
        assertThat(journeyTemplateSummary.creator()).isEqualTo("creator")
        assertThat(journeyTemplateSummary.name()).isEqualTo("name")
        assertThat(journeyTemplateSummary.state()).isEqualTo("state")
        assertThat(journeyTemplateSummary.tags()).containsExactly("string")
        assertThat(journeyTemplateSummary.updated()).contains(0L)
        assertThat(journeyTemplateSummary.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyTemplateSummary =
            JourneyTemplateSummary.builder()
                .id("id")
                .created(0L)
                .creator("creator")
                .name("name")
                .state("state")
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedJourneyTemplateSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyTemplateSummary),
                jacksonTypeRef<JourneyTemplateSummary>(),
            )

        assertThat(roundtrippedJourneyTemplateSummary).isEqualTo(journeyTemplateSummary)
    }
}
