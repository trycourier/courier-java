// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastCreateParamsTest {

    @Test
    fun create() {
        BroadcastCreateParams.builder()
            .createBroadcastRequest(
                CreateBroadcastRequest.builder()
                    .channel(CreateBroadcastRequest.Channel.EMAIL)
                    .name("Spring Sale Announcement")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BroadcastCreateParams.builder()
                .createBroadcastRequest(
                    CreateBroadcastRequest.builder()
                        .channel(CreateBroadcastRequest.Channel.EMAIL)
                        .name("Spring Sale Announcement")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateBroadcastRequest.builder()
                    .channel(CreateBroadcastRequest.Channel.EMAIL)
                    .name("Spring Sale Announcement")
                    .build()
            )
    }
}
