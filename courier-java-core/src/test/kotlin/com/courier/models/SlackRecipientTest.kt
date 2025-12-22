// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlackRecipientTest {

    @Test
    fun create() {
        val slackRecipient =
            SlackRecipient.builder()
                .slack(
                    SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
                .build()

        assertThat(slackRecipient.slack())
            .isEqualTo(
                Slack.ofSendToSlackChannel(
                    SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slackRecipient =
            SlackRecipient.builder()
                .slack(
                    SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
                .build()

        val roundtrippedSlackRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slackRecipient),
                jacksonTypeRef<SlackRecipient>(),
            )

        assertThat(roundtrippedSlackRecipient).isEqualTo(slackRecipient)
    }
}
