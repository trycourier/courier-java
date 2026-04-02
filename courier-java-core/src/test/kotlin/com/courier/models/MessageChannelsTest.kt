// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageChannelsTest {

    @Test
    fun create() {
        val messageChannels =
            MessageChannels.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "brand_id" to "brand_id",
                            "if" to "if",
                            "metadata" to
                                mapOf(
                                    "utm" to
                                        mapOf(
                                            "campaign" to "campaign",
                                            "content" to "content",
                                            "medium" to "medium",
                                            "source" to "source",
                                            "term" to "term",
                                        )
                                ),
                            "override" to mapOf("foo" to "bar"),
                            "providers" to listOf("string"),
                            "routing_method" to "all",
                            "timeouts" to mapOf("channel" to 0, "provider" to 0),
                        )
                    ),
                )
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageChannels =
            MessageChannels.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "brand_id" to "brand_id",
                            "if" to "if",
                            "metadata" to
                                mapOf(
                                    "utm" to
                                        mapOf(
                                            "campaign" to "campaign",
                                            "content" to "content",
                                            "medium" to "medium",
                                            "source" to "source",
                                            "term" to "term",
                                        )
                                ),
                            "override" to mapOf("foo" to "bar"),
                            "providers" to listOf("string"),
                            "routing_method" to "all",
                            "timeouts" to mapOf("channel" to 0, "provider" to 0),
                        )
                    ),
                )
                .build()

        val roundtrippedMessageChannels =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageChannels),
                jacksonTypeRef<MessageChannels>(),
            )

        assertThat(roundtrippedMessageChannels).isEqualTo(messageChannels)
    }
}
