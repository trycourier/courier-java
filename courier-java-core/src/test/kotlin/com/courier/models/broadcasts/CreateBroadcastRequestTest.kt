// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateBroadcastRequestTest {

    @Test
    fun create() {
        val createBroadcastRequest =
            CreateBroadcastRequest.builder()
                .channel(CreateBroadcastRequest.Channel.EMAIL)
                .name("name")
                .build()

        assertThat(createBroadcastRequest.channel()).isEqualTo(CreateBroadcastRequest.Channel.EMAIL)
        assertThat(createBroadcastRequest.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createBroadcastRequest =
            CreateBroadcastRequest.builder()
                .channel(CreateBroadcastRequest.Channel.EMAIL)
                .name("name")
                .build()

        val roundtrippedCreateBroadcastRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createBroadcastRequest),
                jacksonTypeRef<CreateBroadcastRequest>(),
            )

        assertThat(roundtrippedCreateBroadcastRequest).isEqualTo(createBroadcastRequest)
    }
}
