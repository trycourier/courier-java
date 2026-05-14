// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class JourneyConditionsFieldTest {

    @Test
    fun ofConditionAtom() {
        val conditionAtom = listOf("string", "string")

        val journeyConditionsField = JourneyConditionsField.ofConditionAtom(conditionAtom)

        assertThat(journeyConditionsField.conditionAtom()).contains(conditionAtom)
        assertThat(journeyConditionsField.conditionGroup()).isEmpty
        assertThat(journeyConditionsField.conditionNestedGroup()).isEmpty
    }

    @Test
    fun ofConditionAtomRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyConditionsField =
            JourneyConditionsField.ofConditionAtom(listOf("string", "string"))

        val roundtrippedJourneyConditionsField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyConditionsField),
                jacksonTypeRef<JourneyConditionsField>(),
            )

        assertThat(roundtrippedJourneyConditionsField).isEqualTo(journeyConditionsField)
    }

    @Test
    fun ofConditionGroup() {
        val conditionGroup =
            JourneyConditionGroup.builder()
                .addAnd(listOf("string", "string"))
                .addAnd(listOf("string", "string"))
                .addOr(listOf("string", "string"))
                .addOr(listOf("string", "string"))
                .build()

        val journeyConditionsField = JourneyConditionsField.ofConditionGroup(conditionGroup)

        assertThat(journeyConditionsField.conditionAtom()).isEmpty
        assertThat(journeyConditionsField.conditionGroup()).contains(conditionGroup)
        assertThat(journeyConditionsField.conditionNestedGroup()).isEmpty
    }

    @Test
    fun ofConditionGroupRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyConditionsField =
            JourneyConditionsField.ofConditionGroup(
                JourneyConditionGroup.builder()
                    .addAnd(listOf("string", "string"))
                    .addAnd(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .addOr(listOf("string", "string"))
                    .build()
            )

        val roundtrippedJourneyConditionsField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyConditionsField),
                jacksonTypeRef<JourneyConditionsField>(),
            )

        assertThat(roundtrippedJourneyConditionsField).isEqualTo(journeyConditionsField)
    }

    @Test
    fun ofConditionNestedGroup() {
        val conditionNestedGroup =
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

        val journeyConditionsField =
            JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup)

        assertThat(journeyConditionsField.conditionAtom()).isEmpty
        assertThat(journeyConditionsField.conditionGroup()).isEmpty
        assertThat(journeyConditionsField.conditionNestedGroup()).contains(conditionNestedGroup)
    }

    @Test
    fun ofConditionNestedGroupRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyConditionsField =
            JourneyConditionsField.ofConditionNestedGroup(
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
            )

        val roundtrippedJourneyConditionsField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyConditionsField),
                jacksonTypeRef<JourneyConditionsField>(),
            )

        assertThat(roundtrippedJourneyConditionsField).isEqualTo(journeyConditionsField)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val journeyConditionsField =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<JourneyConditionsField>())

        val e = assertThrows<CourierInvalidDataException> { journeyConditionsField.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
