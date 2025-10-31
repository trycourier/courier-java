// File generated from our OpenAPI spec by Stainless.

package com.courier.models.messages

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageHistoryResponseTest {

    @Test
    fun create() {
        val messageHistoryResponse =
            MessageHistoryResponse.builder()
                .addResult(
                    MessageHistoryResponse.Result.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(messageHistoryResponse.results())
            .containsExactly(
                MessageHistoryResponse.Result.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageHistoryResponse =
            MessageHistoryResponse.builder()
                .addResult(
                    MessageHistoryResponse.Result.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedMessageHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageHistoryResponse),
                jacksonTypeRef<MessageHistoryResponse>(),
            )

        assertThat(roundtrippedMessageHistoryResponse).isEqualTo(messageHistoryResponse)
    }
}
