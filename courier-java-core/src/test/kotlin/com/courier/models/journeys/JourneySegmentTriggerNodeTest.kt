// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneySegmentTriggerNodeTest {

    @Test
    fun create() {
        val journeySegmentTriggerNode =
            JourneySegmentTriggerNode.builder()
                .requestType(JourneySegmentTriggerNode.RequestType.IDENTIFY)
                .triggerType(JourneySegmentTriggerNode.TriggerType.SEGMENT)
                .type(JourneySegmentTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .eventId("x")
                .build()

        assertThat(journeySegmentTriggerNode.requestType())
            .isEqualTo(JourneySegmentTriggerNode.RequestType.IDENTIFY)
        assertThat(journeySegmentTriggerNode.triggerType())
            .isEqualTo(JourneySegmentTriggerNode.TriggerType.SEGMENT)
        assertThat(journeySegmentTriggerNode.type())
            .isEqualTo(JourneySegmentTriggerNode.Type.TRIGGER)
        assertThat(journeySegmentTriggerNode.id()).contains("x")
        assertThat(journeySegmentTriggerNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
        assertThat(journeySegmentTriggerNode.eventId()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeySegmentTriggerNode =
            JourneySegmentTriggerNode.builder()
                .requestType(JourneySegmentTriggerNode.RequestType.IDENTIFY)
                .triggerType(JourneySegmentTriggerNode.TriggerType.SEGMENT)
                .type(JourneySegmentTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .eventId("x")
                .build()

        val roundtrippedJourneySegmentTriggerNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySegmentTriggerNode),
                jacksonTypeRef<JourneySegmentTriggerNode>(),
            )

        assertThat(roundtrippedJourneySegmentTriggerNode).isEqualTo(journeySegmentTriggerNode)
    }
}
