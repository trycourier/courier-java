// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageProvidersTypeTest {

    @Test
    fun create() {
        val messageProvidersType =
            MessageProvidersType.builder()
                .if_("if")
                .metadata(
                    Metadata.builder()
                        .utm(
                            Utm.builder()
                                .campaign("campaign")
                                .content("content")
                                .medium("medium")
                                .source("source")
                                .term("term")
                                .build()
                        )
                        .build()
                )
                .override(
                    MessageProvidersType.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timeouts(0L)
                .build()

        assertThat(messageProvidersType.if_()).contains("if")
        assertThat(messageProvidersType.metadata())
            .contains(
                Metadata.builder()
                    .utm(
                        Utm.builder()
                            .campaign("campaign")
                            .content("content")
                            .medium("medium")
                            .source("source")
                            .term("term")
                            .build()
                    )
                    .build()
            )
        assertThat(messageProvidersType.override())
            .contains(
                MessageProvidersType.Override.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(messageProvidersType.timeouts()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageProvidersType =
            MessageProvidersType.builder()
                .if_("if")
                .metadata(
                    Metadata.builder()
                        .utm(
                            Utm.builder()
                                .campaign("campaign")
                                .content("content")
                                .medium("medium")
                                .source("source")
                                .term("term")
                                .build()
                        )
                        .build()
                )
                .override(
                    MessageProvidersType.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timeouts(0L)
                .build()

        val roundtrippedMessageProvidersType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageProvidersType),
                jacksonTypeRef<MessageProvidersType>(),
            )

        assertThat(roundtrippedMessageProvidersType).isEqualTo(messageProvidersType)
    }
}
