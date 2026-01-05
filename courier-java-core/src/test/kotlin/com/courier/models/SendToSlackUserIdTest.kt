// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToSlackUserIdTest {

    @Test
    fun create() {
        val sendToSlackUserId =
            SendToSlackUserId.builder().accessToken("access_token").userId("user_id").build()

        assertThat(sendToSlackUserId.accessToken()).isEqualTo("access_token")
        assertThat(sendToSlackUserId.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToSlackUserId =
            SendToSlackUserId.builder().accessToken("access_token").userId("user_id").build()

        val roundtrippedSendToSlackUserId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToSlackUserId),
                jacksonTypeRef<SendToSlackUserId>(),
            )

        assertThat(roundtrippedSendToSlackUserId).isEqualTo(sendToSlackUserId)
    }
}
