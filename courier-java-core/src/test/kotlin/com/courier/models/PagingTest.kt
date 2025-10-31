// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagingTest {

    @Test
    fun create() {
        val paging = Paging.builder().more(true).cursor("cursor").build()

        assertThat(paging.more()).isEqualTo(true)
        assertThat(paging.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paging = Paging.builder().more(true).cursor("cursor").build()

        val roundtrippedPaging =
            jsonMapper.readValue(jsonMapper.writeValueAsString(paging), jacksonTypeRef<Paging>())

        assertThat(roundtrippedPaging).isEqualTo(paging)
    }
}
