// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelMetadataTest {

    @Test
    fun create() {
        val channelMetadata =
            ChannelMetadata.builder()
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

        assertThat(channelMetadata.utm())
            .contains(
                Utm.builder()
                    .campaign("campaign")
                    .content("content")
                    .medium("medium")
                    .source("source")
                    .term("term")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelMetadata =
            ChannelMetadata.builder()
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

        val roundtrippedChannelMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelMetadata),
                jacksonTypeRef<ChannelMetadata>(),
            )

        assertThat(roundtrippedChannelMetadata).isEqualTo(channelMetadata)
    }
}
