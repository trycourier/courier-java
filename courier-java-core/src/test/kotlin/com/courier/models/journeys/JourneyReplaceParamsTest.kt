// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyReplaceParamsTest {

    @Test
    fun create() {
        JourneyReplaceParams.builder()
            .templateId("x")
            .createJourneyRequest(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey v2")
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            JourneyReplaceParams.builder()
                .templateId("x")
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey v2")
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            JourneyReplaceParams.builder()
                .templateId("x")
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey v2")
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey v2")
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JourneyReplaceParams.builder()
                .templateId("x")
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey v2")
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey v2")
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .build()
                    )
                    .build()
            )
    }
}
