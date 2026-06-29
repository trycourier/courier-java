// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyExperimentTest {

    @Test
    fun create() {
        val journeyExperiment =
            JourneyExperiment.builder()
                .bucketingKey("x")
                .addVariant(
                    JourneyExperimentVariant.builder()
                        .id("x")
                        .templateId("x")
                        .weight(0.0)
                        .name("name")
                        .build()
                )
                .addVariant(
                    JourneyExperimentVariant.builder()
                        .id("x")
                        .templateId("x")
                        .weight(0.0)
                        .name("name")
                        .build()
                )
                .id("x")
                .name("name")
                .build()

        assertThat(journeyExperiment.bucketingKey()).isEqualTo("x")
        assertThat(journeyExperiment.variants())
            .containsExactly(
                JourneyExperimentVariant.builder()
                    .id("x")
                    .templateId("x")
                    .weight(0.0)
                    .name("name")
                    .build(),
                JourneyExperimentVariant.builder()
                    .id("x")
                    .templateId("x")
                    .weight(0.0)
                    .name("name")
                    .build(),
            )
        assertThat(journeyExperiment.id()).contains("x")
        assertThat(journeyExperiment.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyExperiment =
            JourneyExperiment.builder()
                .bucketingKey("x")
                .addVariant(
                    JourneyExperimentVariant.builder()
                        .id("x")
                        .templateId("x")
                        .weight(0.0)
                        .name("name")
                        .build()
                )
                .addVariant(
                    JourneyExperimentVariant.builder()
                        .id("x")
                        .templateId("x")
                        .weight(0.0)
                        .name("name")
                        .build()
                )
                .id("x")
                .name("name")
                .build()

        val roundtrippedJourneyExperiment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyExperiment),
                jacksonTypeRef<JourneyExperiment>(),
            )

        assertThat(roundtrippedJourneyExperiment).isEqualTo(journeyExperiment)
    }
}
