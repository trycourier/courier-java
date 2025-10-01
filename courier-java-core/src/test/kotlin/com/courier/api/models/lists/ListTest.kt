// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListTest {

    @Test
    fun create() {
        val list = List.builder().id("id").name("name").created(0L).updated(0L).build()

        assertThat(list.id()).isEqualTo("id")
        assertThat(list.name()).isEqualTo("name")
        assertThat(list.created()).contains(0L)
        assertThat(list.updated()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val list = List.builder().id("id").name("name").created(0L).updated(0L).build()

        val roundtrippedList =
            jsonMapper.readValue(jsonMapper.writeValueAsString(list), jacksonTypeRef<List>())

        assertThat(roundtrippedList).isEqualTo(list)
    }
}
