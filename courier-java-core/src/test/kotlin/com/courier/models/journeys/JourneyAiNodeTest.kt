// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyAiNodeTest {

    @Test
    fun create() {
        val journeyAiNode =
            JourneyAiNode.builder()
                .outputSchema(
                    JourneyAiNode.OutputSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(JourneyAiNode.Type.AI)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .model("x")
                .userPrompt("user_prompt")
                .webSearch(true)
                .build()

        assertThat(journeyAiNode.outputSchema())
            .isEqualTo(
                JourneyAiNode.OutputSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(journeyAiNode.type()).isEqualTo(JourneyAiNode.Type.AI)
        assertThat(journeyAiNode.id()).contains("x")
        assertThat(journeyAiNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
        assertThat(journeyAiNode.model()).contains("x")
        assertThat(journeyAiNode.userPrompt()).contains("user_prompt")
        assertThat(journeyAiNode.webSearch()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyAiNode =
            JourneyAiNode.builder()
                .outputSchema(
                    JourneyAiNode.OutputSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(JourneyAiNode.Type.AI)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .model("x")
                .userPrompt("user_prompt")
                .webSearch(true)
                .build()

        val roundtrippedJourneyAiNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyAiNode),
                jacksonTypeRef<JourneyAiNode>(),
            )

        assertThat(roundtrippedJourneyAiNode).isEqualTo(journeyAiNode)
    }
}
