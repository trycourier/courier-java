// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyWebhookTriggerNodeTest {

    @Test
    fun create() {
        val journeyWebhookTriggerNode =
            JourneyWebhookTriggerNode.builder()
                .eventSource("event_source")
                .triggerType(JourneyWebhookTriggerNode.TriggerType.WEBHOOK)
                .type(JourneyWebhookTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .eventId("event_id")
                .build()

        assertThat(journeyWebhookTriggerNode.eventSource()).isEqualTo("event_source")
        assertThat(journeyWebhookTriggerNode.triggerType())
            .isEqualTo(JourneyWebhookTriggerNode.TriggerType.WEBHOOK)
        assertThat(journeyWebhookTriggerNode.type())
            .isEqualTo(JourneyWebhookTriggerNode.Type.TRIGGER)
        assertThat(journeyWebhookTriggerNode.id()).contains("x")
        assertThat(journeyWebhookTriggerNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
        assertThat(journeyWebhookTriggerNode.eventId()).contains("event_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyWebhookTriggerNode =
            JourneyWebhookTriggerNode.builder()
                .eventSource("event_source")
                .triggerType(JourneyWebhookTriggerNode.TriggerType.WEBHOOK)
                .type(JourneyWebhookTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .eventId("event_id")
                .build()

        val roundtrippedJourneyWebhookTriggerNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyWebhookTriggerNode),
                jacksonTypeRef<JourneyWebhookTriggerNode>(),
            )

        assertThat(roundtrippedJourneyWebhookTriggerNode).isEqualTo(journeyWebhookTriggerNode)
    }
}
