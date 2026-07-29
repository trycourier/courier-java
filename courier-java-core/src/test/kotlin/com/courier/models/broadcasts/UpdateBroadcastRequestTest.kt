// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateBroadcastRequestTest {

    @Test
    fun create() {
        val updateBroadcastRequest = UpdateBroadcastRequest.builder().name("name").build()

        assertThat(updateBroadcastRequest.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateBroadcastRequest = UpdateBroadcastRequest.builder().name("name").build()

        val roundtrippedUpdateBroadcastRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateBroadcastRequest),
                jacksonTypeRef<UpdateBroadcastRequest>(),
            )

        assertThat(roundtrippedUpdateBroadcastRequest).isEqualTo(updateBroadcastRequest)
    }
}
