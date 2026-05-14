// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyResponseTest {

    @Test
    fun create() {
        val journeyResponse =
            JourneyResponse.builder()
                .id("id")
                .created(0L)
                .creator("creator")
                .enabled(true)
                .name("name")
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
                .published(0L)
                .state(JourneyState.DRAFT)
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(journeyResponse.id()).isEqualTo("id")
        assertThat(journeyResponse.created()).contains(0L)
        assertThat(journeyResponse.creator()).contains("creator")
        assertThat(journeyResponse.enabled()).isEqualTo(true)
        assertThat(journeyResponse.name()).isEqualTo("name")
        assertThat(journeyResponse.nodes())
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
        assertThat(journeyResponse.published()).contains(0L)
        assertThat(journeyResponse.state()).isEqualTo(JourneyState.DRAFT)
        assertThat(journeyResponse.updated()).contains(0L)
        assertThat(journeyResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyResponse =
            JourneyResponse.builder()
                .id("id")
                .created(0L)
                .creator("creator")
                .enabled(true)
                .name("name")
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
                .published(0L)
                .state(JourneyState.DRAFT)
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedJourneyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyResponse),
                jacksonTypeRef<JourneyResponse>(),
            )

        assertThat(roundtrippedJourneyResponse).isEqualTo(journeyResponse)
    }
}
