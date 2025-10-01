// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles.lists

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListDeleteResponseTest {

    @Test
    fun create() {
        val listDeleteResponse =
            ListDeleteResponse.builder().status(ListDeleteResponse.Status.SUCCESS).build()

        assertThat(listDeleteResponse.status()).isEqualTo(ListDeleteResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listDeleteResponse =
            ListDeleteResponse.builder().status(ListDeleteResponse.Status.SUCCESS).build()

        val roundtrippedListDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listDeleteResponse),
                jacksonTypeRef<ListDeleteResponse>(),
            )

        assertThat(roundtrippedListDeleteResponse).isEqualTo(listDeleteResponse)
    }
}
