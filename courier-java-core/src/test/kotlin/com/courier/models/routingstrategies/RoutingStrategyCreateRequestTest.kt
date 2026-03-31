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

internal class RoutingStrategyCreateRequestTest {

    @Test
    fun create() {
        val routingStrategyCreateRequest =
            RoutingStrategyCreateRequest.builder()
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

        assertThat(routingStrategyCreateRequest.name()).isEqualTo("name")
        assertThat(routingStrategyCreateRequest.routing())
            .isEqualTo(
                MessageRouting.builder()
                    .addChannel("string")
                    .method(MessageRouting.Method.ALL)
                    .build()
            )
        assertThat(routingStrategyCreateRequest.channels())
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
        assertThat(routingStrategyCreateRequest.description()).contains("description")
        assertThat(routingStrategyCreateRequest.providers())
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
        assertThat(routingStrategyCreateRequest.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingStrategyCreateRequest =
            RoutingStrategyCreateRequest.builder()
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

        val roundtrippedRoutingStrategyCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingStrategyCreateRequest),
                jacksonTypeRef<RoutingStrategyCreateRequest>(),
            )

        assertThat(roundtrippedRoutingStrategyCreateRequest).isEqualTo(routingStrategyCreateRequest)
    }
}
