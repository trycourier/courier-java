// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateJourneyRequestTest {

    @Test
    fun create() {
        val createJourneyRequest =
            CreateJourneyRequest.builder()
                .name("x")
                .addNode(
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
                )
                .enabled(true)
                .state(JourneyState.DRAFT)
                .build()

        assertThat(createJourneyRequest.name()).isEqualTo("x")
        assertThat(createJourneyRequest.nodes())
            .containsExactly(
                JourneyNode.ofApiInvokeTrigger(
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
                )
            )
        assertThat(createJourneyRequest.enabled()).contains(true)
        assertThat(createJourneyRequest.state()).contains(JourneyState.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createJourneyRequest =
            CreateJourneyRequest.builder()
                .name("x")
                .addNode(
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
                )
                .enabled(true)
                .state(JourneyState.DRAFT)
                .build()

        val roundtrippedCreateJourneyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createJourneyRequest),
                jacksonTypeRef<CreateJourneyRequest>(),
            )

        assertThat(roundtrippedCreateJourneyRequest).isEqualTo(createJourneyRequest)
    }
}
