// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyExperimentVariantTest {

    @Test
    fun create() {
        val journeyExperimentVariant =
            JourneyExperimentVariant.builder()
                .id("x")
                .templateId("x")
                .weight(0.0)
                .name("name")
                .build()

        assertThat(journeyExperimentVariant.id()).isEqualTo("x")
        assertThat(journeyExperimentVariant.templateId()).isEqualTo("x")
        assertThat(journeyExperimentVariant.weight()).isEqualTo(0.0)
        assertThat(journeyExperimentVariant.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyExperimentVariant =
            JourneyExperimentVariant.builder()
                .id("x")
                .templateId("x")
                .weight(0.0)
                .name("name")
                .build()

        val roundtrippedJourneyExperimentVariant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyExperimentVariant),
                jacksonTypeRef<JourneyExperimentVariant>(),
            )

        assertThat(roundtrippedJourneyExperimentVariant).isEqualTo(journeyExperimentVariant)
    }
}
