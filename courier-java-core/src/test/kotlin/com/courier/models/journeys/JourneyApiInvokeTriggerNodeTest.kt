// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyApiInvokeTriggerNodeTest {

    @Test
    fun create() {
        val journeyApiInvokeTriggerNode =
            JourneyApiInvokeTriggerNode.builder()
                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .schema(
                    JourneyApiInvokeTriggerNode.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(journeyApiInvokeTriggerNode.triggerType())
            .isEqualTo(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
        assertThat(journeyApiInvokeTriggerNode.type())
            .isEqualTo(JourneyApiInvokeTriggerNode.Type.TRIGGER)
        assertThat(journeyApiInvokeTriggerNode.id()).contains("x")
        assertThat(journeyApiInvokeTriggerNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
        assertThat(journeyApiInvokeTriggerNode.schema())
            .contains(
                JourneyApiInvokeTriggerNode.Schema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyApiInvokeTriggerNode =
            JourneyApiInvokeTriggerNode.builder()
                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .schema(
                    JourneyApiInvokeTriggerNode.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedJourneyApiInvokeTriggerNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyApiInvokeTriggerNode),
                jacksonTypeRef<JourneyApiInvokeTriggerNode>(),
            )

        assertThat(roundtrippedJourneyApiInvokeTriggerNode).isEqualTo(journeyApiInvokeTriggerNode)
    }
}
