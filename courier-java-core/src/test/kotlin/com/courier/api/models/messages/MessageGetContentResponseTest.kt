// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetContentResponseTest {

    @Test
    fun create() {
        val messageGetContentResponse =
            MessageGetContentResponse.builder()
                .addResult(
                    MessageGetContentResponse.Result.builder()
                        .channel("channel")
                        .channelId("channel_id")
                        .content(
                            MessageGetContentResponse.Result.Content.builder()
                                .addBlock(
                                    MessageGetContentResponse.Result.Content.Block.builder()
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

        assertThat(messageGetContentResponse.results())
            .containsExactly(
                MessageGetContentResponse.Result.builder()
                    .channel("channel")
                    .channelId("channel_id")
                    .content(
                        MessageGetContentResponse.Result.Content.builder()
                            .addBlock(
                                MessageGetContentResponse.Result.Content.Block.builder()
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
        val messageGetContentResponse =
            MessageGetContentResponse.builder()
                .addResult(
                    MessageGetContentResponse.Result.builder()
                        .channel("channel")
                        .channelId("channel_id")
                        .content(
                            MessageGetContentResponse.Result.Content.builder()
                                .addBlock(
                                    MessageGetContentResponse.Result.Content.Block.builder()
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

        val roundtrippedMessageGetContentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageGetContentResponse),
                jacksonTypeRef<MessageGetContentResponse>(),
            )

        assertThat(roundtrippedMessageGetContentResponse).isEqualTo(messageGetContentResponse)
    }
}
