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

internal class FilterConfigTest {

    @Test
    fun ofSingle() {
        val single =
            SingleFilterConfig.builder()
                .operator(SingleFilterConfig.Operator.ENDS_WITH)
                .path("path")
                .value("value")
                .build()

        val filterConfig = FilterConfig.ofSingle(single)

        assertThat(filterConfig.single()).contains(single)
        assertThat(filterConfig.nested()).isEmpty
    }

    @Test
    fun ofSingleRoundtrip() {
        val jsonMapper = jsonMapper()
        val filterConfig =
            FilterConfig.ofSingle(
                SingleFilterConfig.builder()
                    .operator(SingleFilterConfig.Operator.ENDS_WITH)
                    .path("path")
                    .value("value")
                    .build()
            )

        val roundtrippedFilterConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterConfig),
                jacksonTypeRef<FilterConfig>(),
            )

        assertThat(roundtrippedFilterConfig).isEqualTo(filterConfig)
    }

    @Test
    fun ofNested() {
        val nested =
            NestedFilterConfig.builder()
                .addFilter(
                    SingleFilterConfig.builder()
                        .operator(SingleFilterConfig.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .operator(NestedFilterConfig.Operator.ENDS_WITH)
                .build()

        val filterConfig = FilterConfig.ofNested(nested)

        assertThat(filterConfig.single()).isEmpty
        assertThat(filterConfig.nested()).contains(nested)
    }

    @Test
    fun ofNestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val filterConfig =
            FilterConfig.ofNested(
                NestedFilterConfig.builder()
                    .addFilter(
                        SingleFilterConfig.builder()
                            .operator(SingleFilterConfig.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .operator(NestedFilterConfig.Operator.ENDS_WITH)
                    .build()
            )

        val roundtrippedFilterConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterConfig),
                jacksonTypeRef<FilterConfig>(),
            )

        assertThat(roundtrippedFilterConfig).isEqualTo(filterConfig)
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
        val filterConfig = jsonMapper().convertValue(testCase.value, jacksonTypeRef<FilterConfig>())

        val e = assertThrows<CourierInvalidDataException> { filterConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
