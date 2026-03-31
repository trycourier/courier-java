// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageProvidersTest {

    @Test
    fun create() {
        val messageProviders =
            MessageProviders.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
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
                            "timeouts" to 0,
                        )
                    ),
                )
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageProviders =
            MessageProviders.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
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
                            "timeouts" to 0,
                        )
                    ),
                )
                .build()

        val roundtrippedMessageProviders =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageProviders),
                jacksonTypeRef<MessageProviders>(),
            )

        assertThat(roundtrippedMessageProviders).isEqualTo(messageProviders)
    }
}
