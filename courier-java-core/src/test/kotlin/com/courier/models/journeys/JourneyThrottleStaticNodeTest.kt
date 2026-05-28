// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyThrottleStaticNodeTest {

    @Test
    fun create() {
        val journeyThrottleStaticNode =
            JourneyThrottleStaticNode.builder()
                .maxAllowed(1L)
                .period("x")
                .scope(JourneyThrottleStaticNode.Scope.USER)
                .type(JourneyThrottleStaticNode.Type.THROTTLE)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        assertThat(journeyThrottleStaticNode.maxAllowed()).isEqualTo(1L)
        assertThat(journeyThrottleStaticNode.period()).isEqualTo("x")
        assertThat(journeyThrottleStaticNode.scope())
            .isEqualTo(JourneyThrottleStaticNode.Scope.USER)
        assertThat(journeyThrottleStaticNode.type())
            .isEqualTo(JourneyThrottleStaticNode.Type.THROTTLE)
        assertThat(journeyThrottleStaticNode.id()).contains("x")
        assertThat(journeyThrottleStaticNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyThrottleStaticNode =
            JourneyThrottleStaticNode.builder()
                .maxAllowed(1L)
                .period("x")
                .scope(JourneyThrottleStaticNode.Scope.USER)
                .type(JourneyThrottleStaticNode.Type.THROTTLE)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val roundtrippedJourneyThrottleStaticNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyThrottleStaticNode),
                jacksonTypeRef<JourneyThrottleStaticNode>(),
            )

        assertThat(roundtrippedJourneyThrottleStaticNode).isEqualTo(journeyThrottleStaticNode)
    }
}
