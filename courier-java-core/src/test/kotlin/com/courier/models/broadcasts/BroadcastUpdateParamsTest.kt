// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastUpdateParamsTest {

    @Test
    fun create() {
        BroadcastUpdateParams.builder()
            .broadcastId("broadcastId")
            .updateBroadcastRequest(
                UpdateBroadcastRequest.builder().name("Spring Sale Announcement (v2)").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BroadcastUpdateParams.builder()
                .broadcastId("broadcastId")
                .updateBroadcastRequest(
                    UpdateBroadcastRequest.builder().name("Spring Sale Announcement (v2)").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BroadcastUpdateParams.builder()
                .broadcastId("broadcastId")
                .updateBroadcastRequest(
                    UpdateBroadcastRequest.builder().name("Spring Sale Announcement (v2)").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateBroadcastRequest.builder().name("Spring Sale Announcement (v2)").build()
            )
    }
}
