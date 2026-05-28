// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyExitNodeTest {

    @Test
    fun create() {
        val journeyExitNode =
            JourneyExitNode.builder().type(JourneyExitNode.Type.EXIT).id("x").build()

        assertThat(journeyExitNode.type()).isEqualTo(JourneyExitNode.Type.EXIT)
        assertThat(journeyExitNode.id()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyExitNode =
            JourneyExitNode.builder().type(JourneyExitNode.Type.EXIT).id("x").build()

        val roundtrippedJourneyExitNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyExitNode),
                jacksonTypeRef<JourneyExitNode>(),
            )

        assertThat(roundtrippedJourneyExitNode).isEqualTo(journeyExitNode)
    }
}
