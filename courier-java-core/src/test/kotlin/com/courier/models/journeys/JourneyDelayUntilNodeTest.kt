// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyDelayUntilNodeTest {

    @Test
    fun create() {
        val journeyDelayUntilNode =
            JourneyDelayUntilNode.builder()
                .mode(JourneyDelayUntilNode.Mode.UNTIL)
                .type(JourneyDelayUntilNode.Type.DELAY)
                .until("x")
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        assertThat(journeyDelayUntilNode.mode()).isEqualTo(JourneyDelayUntilNode.Mode.UNTIL)
        assertThat(journeyDelayUntilNode.type()).isEqualTo(JourneyDelayUntilNode.Type.DELAY)
        assertThat(journeyDelayUntilNode.until()).isEqualTo("x")
        assertThat(journeyDelayUntilNode.id()).contains("x")
        assertThat(journeyDelayUntilNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyDelayUntilNode =
            JourneyDelayUntilNode.builder()
                .mode(JourneyDelayUntilNode.Mode.UNTIL)
                .type(JourneyDelayUntilNode.Type.DELAY)
                .until("x")
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val roundtrippedJourneyDelayUntilNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyDelayUntilNode),
                jacksonTypeRef<JourneyDelayUntilNode>(),
            )

        assertThat(roundtrippedJourneyDelayUntilNode).isEqualTo(journeyDelayUntilNode)
    }
}
