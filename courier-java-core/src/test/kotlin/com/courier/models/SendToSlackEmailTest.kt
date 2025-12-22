// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToSlackEmailTest {

    @Test
    fun create() {
        val sendToSlackEmail =
            SendToSlackEmail.builder().accessToken("access_token").email("email").build()

        assertThat(sendToSlackEmail.accessToken()).isEqualTo("access_token")
        assertThat(sendToSlackEmail.email()).isEqualTo("email")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToSlackEmail =
            SendToSlackEmail.builder().accessToken("access_token").email("email").build()

        val roundtrippedSendToSlackEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToSlackEmail),
                jacksonTypeRef<SendToSlackEmail>(),
            )

        assertThat(roundtrippedSendToSlackEmail).isEqualTo(sendToSlackEmail)
    }
}
