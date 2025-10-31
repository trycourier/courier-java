// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles.lists

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSubscribeResponseTest {

    @Test
    fun create() {
        val listSubscribeResponse =
            ListSubscribeResponse.builder().status(ListSubscribeResponse.Status.SUCCESS).build()

        assertThat(listSubscribeResponse.status()).isEqualTo(ListSubscribeResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSubscribeResponse =
            ListSubscribeResponse.builder().status(ListSubscribeResponse.Status.SUCCESS).build()

        val roundtrippedListSubscribeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSubscribeResponse),
                jacksonTypeRef<ListSubscribeResponse>(),
            )

        assertThat(roundtrippedListSubscribeResponse).isEqualTo(listSubscribeResponse)
    }
}
