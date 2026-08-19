// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyAudienceTriggerNodeTest {

    @Test
    fun create() {
        val journeyAudienceTriggerNode =
            JourneyAudienceTriggerNode.builder()
                .audienceId("x")
                .triggerType(JourneyAudienceTriggerNode.TriggerType.AUDIENCE)
                .type(JourneyAudienceTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        assertThat(journeyAudienceTriggerNode.audienceId()).isEqualTo("x")
        assertThat(journeyAudienceTriggerNode.triggerType())
            .isEqualTo(JourneyAudienceTriggerNode.TriggerType.AUDIENCE)
        assertThat(journeyAudienceTriggerNode.type())
            .isEqualTo(JourneyAudienceTriggerNode.Type.TRIGGER)
        assertThat(journeyAudienceTriggerNode.id()).contains("x")
        assertThat(journeyAudienceTriggerNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyAudienceTriggerNode =
            JourneyAudienceTriggerNode.builder()
                .audienceId("x")
                .triggerType(JourneyAudienceTriggerNode.TriggerType.AUDIENCE)
                .type(JourneyAudienceTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val roundtrippedJourneyAudienceTriggerNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyAudienceTriggerNode),
                jacksonTypeRef<JourneyAudienceTriggerNode>(),
            )

        assertThat(roundtrippedJourneyAudienceTriggerNode).isEqualTo(journeyAudienceTriggerNode)
    }
}
