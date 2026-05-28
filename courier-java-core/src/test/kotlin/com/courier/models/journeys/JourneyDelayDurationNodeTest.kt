// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyDelayDurationNodeTest {

    @Test
    fun create() {
        val journeyDelayDurationNode =
            JourneyDelayDurationNode.builder()
                .duration("x")
                .mode(JourneyDelayDurationNode.Mode.DURATION)
                .type(JourneyDelayDurationNode.Type.DELAY)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        assertThat(journeyDelayDurationNode.duration()).isEqualTo("x")
        assertThat(journeyDelayDurationNode.mode())
            .isEqualTo(JourneyDelayDurationNode.Mode.DURATION)
        assertThat(journeyDelayDurationNode.type()).isEqualTo(JourneyDelayDurationNode.Type.DELAY)
        assertThat(journeyDelayDurationNode.id()).contains("x")
        assertThat(journeyDelayDurationNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyDelayDurationNode =
            JourneyDelayDurationNode.builder()
                .duration("x")
                .mode(JourneyDelayDurationNode.Mode.DURATION)
                .type(JourneyDelayDurationNode.Type.DELAY)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val roundtrippedJourneyDelayDurationNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyDelayDurationNode),
                jacksonTypeRef<JourneyDelayDurationNode>(),
            )

        assertThat(roundtrippedJourneyDelayDurationNode).isEqualTo(journeyDelayDurationNode)
    }
}
