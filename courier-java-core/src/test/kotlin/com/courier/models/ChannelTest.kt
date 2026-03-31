// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelTest {

    @Test
    fun create() {
        val channel =
            Channel.builder()
                .brandId("brand_id")
                .if_("if")
                .metadata(
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
                )
                .override(
                    Channel.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addProvider("string")
                .routingMethod(Channel.RoutingMethod.ALL)
                .timeouts(Timeouts.builder().channel(0L).provider(0L).build())
                .build()

        assertThat(channel.brandId()).contains("brand_id")
        assertThat(channel.if_()).contains("if")
        assertThat(channel.metadata())
            .contains(
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
            )
        assertThat(channel.override())
            .contains(
                Channel.Override.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(channel.providers().getOrNull()).containsExactly("string")
        assertThat(channel.routingMethod()).contains(Channel.RoutingMethod.ALL)
        assertThat(channel.timeouts()).contains(Timeouts.builder().channel(0L).provider(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channel =
            Channel.builder()
                .brandId("brand_id")
                .if_("if")
                .metadata(
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
                )
                .override(
                    Channel.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addProvider("string")
                .routingMethod(Channel.RoutingMethod.ALL)
                .timeouts(Timeouts.builder().channel(0L).provider(0L).build())
                .build()

        val roundtrippedChannel =
            jsonMapper.readValue(jsonMapper.writeValueAsString(channel), jacksonTypeRef<Channel>())

        assertThat(roundtrippedChannel).isEqualTo(channel)
    }
}
