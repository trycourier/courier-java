// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyThrottleDynamicNodeTest {

    @Test
    fun create() {
        val journeyThrottleDynamicNode =
            JourneyThrottleDynamicNode.builder()
                .maxAllowed(1L)
                .period("x")
                .scope(JourneyThrottleDynamicNode.Scope.DYNAMIC)
                .throttleKey("x")
                .type(JourneyThrottleDynamicNode.Type.THROTTLE)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        assertThat(journeyThrottleDynamicNode.maxAllowed()).isEqualTo(1L)
        assertThat(journeyThrottleDynamicNode.period()).isEqualTo("x")
        assertThat(journeyThrottleDynamicNode.scope())
            .isEqualTo(JourneyThrottleDynamicNode.Scope.DYNAMIC)
        assertThat(journeyThrottleDynamicNode.throttleKey()).isEqualTo("x")
        assertThat(journeyThrottleDynamicNode.type())
            .isEqualTo(JourneyThrottleDynamicNode.Type.THROTTLE)
        assertThat(journeyThrottleDynamicNode.id()).contains("x")
        assertThat(journeyThrottleDynamicNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyThrottleDynamicNode =
            JourneyThrottleDynamicNode.builder()
                .maxAllowed(1L)
                .period("x")
                .scope(JourneyThrottleDynamicNode.Scope.DYNAMIC)
                .throttleKey("x")
                .type(JourneyThrottleDynamicNode.Type.THROTTLE)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val roundtrippedJourneyThrottleDynamicNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyThrottleDynamicNode),
                jacksonTypeRef<JourneyThrottleDynamicNode>(),
            )

        assertThat(roundtrippedJourneyThrottleDynamicNode).isEqualTo(journeyThrottleDynamicNode)
    }
}
