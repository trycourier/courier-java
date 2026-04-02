// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.MessageChannels
import com.courier.models.MessageProviders
import com.courier.models.MessageRouting
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingStrategyReplaceRequestTest {

    @Test
    fun create() {
        val routingStrategyReplaceRequest =
            RoutingStrategyReplaceRequest.builder()
                .name("name")
                .routing(
                    MessageRouting.builder()
                        .addChannel("string")
                        .method(MessageRouting.Method.ALL)
                        .build()
                )
                .channels(
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
                )
                .description("description")
                .providers(
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
                )
                .addTag("string")
                .build()

        assertThat(routingStrategyReplaceRequest.name()).isEqualTo("name")
        assertThat(routingStrategyReplaceRequest.routing())
            .isEqualTo(
                MessageRouting.builder()
                    .addChannel("string")
                    .method(MessageRouting.Method.ALL)
                    .build()
            )
        assertThat(routingStrategyReplaceRequest.channels())
            .contains(
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
            )
        assertThat(routingStrategyReplaceRequest.description()).contains("description")
        assertThat(routingStrategyReplaceRequest.providers())
            .contains(
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
            )
        assertThat(routingStrategyReplaceRequest.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingStrategyReplaceRequest =
            RoutingStrategyReplaceRequest.builder()
                .name("name")
                .routing(
                    MessageRouting.builder()
                        .addChannel("string")
                        .method(MessageRouting.Method.ALL)
                        .build()
                )
                .channels(
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
                )
                .description("description")
                .providers(
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
                )
                .addTag("string")
                .build()

        val roundtrippedRoutingStrategyReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingStrategyReplaceRequest),
                jacksonTypeRef<RoutingStrategyReplaceRequest>(),
            )

        assertThat(roundtrippedRoutingStrategyReplaceRequest)
            .isEqualTo(routingStrategyReplaceRequest)
    }
}
