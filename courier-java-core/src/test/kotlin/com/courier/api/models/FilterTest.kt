// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterTest {

    @Test
    fun create() {
        val filter =
            Filter.builder().operator(Filter.Operator.ENDS_WITH).path("path").value("value").build()

        assertThat(filter.operator()).isEqualTo(Filter.Operator.ENDS_WITH)
        assertThat(filter.path()).isEqualTo("path")
        assertThat(filter.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.builder().operator(Filter.Operator.ENDS_WITH).path("path").value("value").build()

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }
}
