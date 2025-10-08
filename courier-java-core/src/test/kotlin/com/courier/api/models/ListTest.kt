// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListTest {

    @Test
    fun create() {
        val list =
            List.builder().id("id").name("name").created("created").updated("updated").build()

        assertThat(list.id()).isEqualTo("id")
        assertThat(list.name()).isEqualTo("name")
        assertThat(list.created()).contains("created")
        assertThat(list.updated()).contains("updated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val list =
            List.builder().id("id").name("name").created("created").updated("updated").build()

        val roundtrippedList =
            jsonMapper.readValue(jsonMapper.writeValueAsString(list), jacksonTypeRef<List>())

        assertThat(roundtrippedList).isEqualTo(list)
    }
}
