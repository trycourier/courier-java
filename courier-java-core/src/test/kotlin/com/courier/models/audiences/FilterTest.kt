// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class FilterTest {

    @Test
    fun ofSingleFilterConfig() {
        val singleFilterConfig =
            SingleFilterConfig.builder()
                .operator(SingleFilterConfig.Operator.ENDS_WITH)
                .path("path")
                .value("value")
                .build()

        val filter = Filter.ofSingleFilterConfig(singleFilterConfig)

        assertThat(filter.singleFilterConfig()).contains(singleFilterConfig)
        assertThat(filter.nestedFilterConfig()).isEmpty
    }

    @Test
    fun ofSingleFilterConfigRoundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.ofSingleFilterConfig(
                SingleFilterConfig.builder()
                    .operator(SingleFilterConfig.Operator.ENDS_WITH)
                    .path("path")
                    .value("value")
                    .build()
            )

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }

    @Test
    fun ofNestedFilterConfig() {
        val nestedFilterConfig =
            NestedFilterConfig.builder()
                .operator(NestedFilterConfig.Operator.ENDS_WITH)
                .addRule(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        val filter = Filter.ofNestedFilterConfig(nestedFilterConfig)

        assertThat(filter.singleFilterConfig()).isEmpty
        assertThat(filter.nestedFilterConfig()).contains(nestedFilterConfig)
    }

    @Test
    fun ofNestedFilterConfigRoundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.ofNestedFilterConfig(
                NestedFilterConfig.builder()
                    .operator(NestedFilterConfig.Operator.ENDS_WITH)
                    .addRule(
                        SingleFilterConfig.builder()
                            .operator(SingleFilterConfig.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .build()
            )

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val filter = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Filter>())

        val e = assertThrows<CourierInvalidDataException> { filter.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
