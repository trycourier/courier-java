// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.audiences

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class FilterConfigTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            FilterConfig.UnionMember0.builder()
                .operator(FilterConfig.UnionMember0.Operator.ENDS_WITH)
                .path("path")
                .value("value")
                .build()

        val filterConfig = FilterConfig.ofUnionMember0(unionMember0)

        assertThat(filterConfig.unionMember0()).contains(unionMember0)
        assertThat(filterConfig.nested()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val filterConfig =
            FilterConfig.ofUnionMember0(
                FilterConfig.UnionMember0.builder()
                    .operator(FilterConfig.UnionMember0.Operator.ENDS_WITH)
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
                .operator(NestedFilterConfig.Operator.ENDS_WITH)
                .addRule(
                    FilterConfig.UnionMember0.builder()
                        .operator(FilterConfig.UnionMember0.Operator.ENDS_WITH)
                        .path("path")
                        .value("value")
                        .build()
                )
                .build()

        val filterConfig = FilterConfig.ofNested(nested)

        assertThat(filterConfig.unionMember0()).isEmpty
        assertThat(filterConfig.nested()).contains(nested)
    }

    @Test
    fun ofNestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val filterConfig =
            FilterConfig.ofNested(
                NestedFilterConfig.builder()
                    .operator(NestedFilterConfig.Operator.ENDS_WITH)
                    .addRule(
                        FilterConfig.UnionMember0.builder()
                            .operator(FilterConfig.UnionMember0.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
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
