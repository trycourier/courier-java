// File generated from our OpenAPI spec by Stainless.

package com.courier.models.messages

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageContentResponseTest {

    @Test
    fun create() {
        val messageContentResponse =
            MessageContentResponse.builder()
                .addResult(
                    MessageContentResponse.Result.builder()
                        .channel("channel")
                        .channelId("channel_id")
                        .content(
                            MessageContentResponse.Result.Content.builder()
                                .addBlock(
                                    MessageContentResponse.Result.Content.Block.builder()
                                        .text("text")
                                        .type("type")
                                        .build()
                                )
                                .body("body")
                                .html("html")
                                .subject("subject")
                                .text("text")
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(messageContentResponse.results())
            .containsExactly(
                MessageContentResponse.Result.builder()
                    .channel("channel")
                    .channelId("channel_id")
                    .content(
                        MessageContentResponse.Result.Content.builder()
                            .addBlock(
                                MessageContentResponse.Result.Content.Block.builder()
                                    .text("text")
                                    .type("type")
                                    .build()
                            )
                            .body("body")
                            .html("html")
                            .subject("subject")
                            .text("text")
                            .title("title")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentResponse =
            MessageContentResponse.builder()
                .addResult(
                    MessageContentResponse.Result.builder()
                        .channel("channel")
                        .channelId("channel_id")
                        .content(
                            MessageContentResponse.Result.Content.builder()
                                .addBlock(
                                    MessageContentResponse.Result.Content.Block.builder()
                                        .text("text")
                                        .type("type")
                                        .build()
                                )
                                .body("body")
                                .html("html")
                                .subject("subject")
                                .text("text")
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedMessageContentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentResponse),
                jacksonTypeRef<MessageContentResponse>(),
            )

        assertThat(roundtrippedMessageContentResponse).isEqualTo(messageContentResponse)
    }
}
