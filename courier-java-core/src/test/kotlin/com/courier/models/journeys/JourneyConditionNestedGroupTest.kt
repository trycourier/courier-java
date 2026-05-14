// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyConditionNestedGroupTest {

    @Test
    fun create() {
        val journeyConditionNestedGroup =
            JourneyConditionNestedGroup.builder()
                .addAnd(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .addAnd(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .addOr(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .addOr(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .build()

        assertThat(journeyConditionNestedGroup.and().getOrNull())
            .containsExactly(
                JourneyConditionGroup.builder()
                    .addAnd(listOf("string", "string"))
                    .addAnd(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .build(),
                JourneyConditionGroup.builder()
                    .addAnd(listOf("string", "string"))
                    .addAnd(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .build(),
            )
        assertThat(journeyConditionNestedGroup.or().getOrNull())
            .containsExactly(
                JourneyConditionGroup.builder()
                    .addAnd(listOf("string", "string"))
                    .addAnd(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .build(),
                JourneyConditionGroup.builder()
                    .addAnd(listOf("string", "string"))
                    .addAnd(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyConditionNestedGroup =
            JourneyConditionNestedGroup.builder()
                .addAnd(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .addAnd(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .addOr(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .addOr(
                    JourneyConditionGroup.builder()
                        .addAnd(listOf("string", "string"))
                        .addAnd(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .addOr(listOf("string", "string"))
                        .build()
                )
                .build()

        val roundtrippedJourneyConditionNestedGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyConditionNestedGroup),
                jacksonTypeRef<JourneyConditionNestedGroup>(),
            )

        assertThat(roundtrippedJourneyConditionNestedGroup).isEqualTo(journeyConditionNestedGroup)
    }
}
