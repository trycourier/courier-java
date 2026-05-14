// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyConditionGroupTest {

    @Test
    fun create() {
        val journeyConditionGroup =
            JourneyConditionGroup.builder()
                .addAnd(listOf("string", "string"))
                .addAnd(listOf("string", "string"))
                .addOr(listOf("string", "string"))
                .addOr(listOf("string", "string"))
                .build()

        assertThat(journeyConditionGroup.and().getOrNull())
            .containsExactly(listOf("string", "string"), listOf("string", "string"))
        assertThat(journeyConditionGroup.or().getOrNull())
            .containsExactly(listOf("string", "string"), listOf("string", "string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyConditionGroup =
            JourneyConditionGroup.builder()
                .addAnd(listOf("string", "string"))
                .addAnd(listOf("string", "string"))
                .addOr(listOf("string", "string"))
                .addOr(listOf("string", "string"))
                .build()

        val roundtrippedJourneyConditionGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyConditionGroup),
                jacksonTypeRef<JourneyConditionGroup>(),
            )

        assertThat(roundtrippedJourneyConditionGroup).isEqualTo(journeyConditionGroup)
    }
}
