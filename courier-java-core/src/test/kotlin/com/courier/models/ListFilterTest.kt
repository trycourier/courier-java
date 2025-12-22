// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListFilterTest {

    @Test
    fun create() {
        val listFilter =
            ListFilter.builder()
                .operator(ListFilter.Operator.MEMBER_OF)
                .path(ListFilter.Path.ACCOUNT_ID)
                .value("value")
                .build()

        assertThat(listFilter.operator()).isEqualTo(ListFilter.Operator.MEMBER_OF)
        assertThat(listFilter.path()).isEqualTo(ListFilter.Path.ACCOUNT_ID)
        assertThat(listFilter.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listFilter =
            ListFilter.builder()
                .operator(ListFilter.Operator.MEMBER_OF)
                .path(ListFilter.Path.ACCOUNT_ID)
                .value("value")
                .build()

        val roundtrippedListFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listFilter),
                jacksonTypeRef<ListFilter>(),
            )

        assertThat(roundtrippedListFilter).isEqualTo(listFilter)
    }
}
