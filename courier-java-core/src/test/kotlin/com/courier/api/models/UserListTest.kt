// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListTest {

    @Test
    fun create() {
        val userList =
            UserList.builder().id("id").name("name").created("created").updated("updated").build()

        assertThat(userList.id()).isEqualTo("id")
        assertThat(userList.name()).isEqualTo("name")
        assertThat(userList.created()).contains("created")
        assertThat(userList.updated()).contains("updated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userList =
            UserList.builder().id("id").name("name").created("created").updated("updated").build()

        val roundtrippedUserList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userList),
                jacksonTypeRef<UserList>(),
            )

        assertThat(roundtrippedUserList).isEqualTo(userList)
    }
}
