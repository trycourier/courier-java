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

internal class RoutingStrategyGetResponseTest {

    @Test
    fun create() {
        val routingStrategyGetResponse =
            RoutingStrategyGetResponse.builder()
                .id("id")
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
                .created(0L)
                .creator("creator")
                .name("name")
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
                .routing(
                    MessageRouting.builder()
                        .addChannel("string")
                        .method(MessageRouting.Method.ALL)
                        .build()
                )
                .description("description")
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(routingStrategyGetResponse.id()).isEqualTo("id")
        assertThat(routingStrategyGetResponse.channels())
            .isEqualTo(
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
        assertThat(routingStrategyGetResponse.created()).isEqualTo(0L)
        assertThat(routingStrategyGetResponse.creator()).isEqualTo("creator")
        assertThat(routingStrategyGetResponse.name()).isEqualTo("name")
        assertThat(routingStrategyGetResponse.providers())
            .isEqualTo(
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
        assertThat(routingStrategyGetResponse.routing())
            .isEqualTo(
                MessageRouting.builder()
                    .addChannel("string")
                    .method(MessageRouting.Method.ALL)
                    .build()
            )
        assertThat(routingStrategyGetResponse.description()).contains("description")
        assertThat(routingStrategyGetResponse.tags().getOrNull()).containsExactly("string")
        assertThat(routingStrategyGetResponse.updated()).contains(0L)
        assertThat(routingStrategyGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingStrategyGetResponse =
            RoutingStrategyGetResponse.builder()
                .id("id")
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
                .created(0L)
                .creator("creator")
                .name("name")
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
                .routing(
                    MessageRouting.builder()
                        .addChannel("string")
                        .method(MessageRouting.Method.ALL)
                        .build()
                )
                .description("description")
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedRoutingStrategyGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingStrategyGetResponse),
                jacksonTypeRef<RoutingStrategyGetResponse>(),
            )

        assertThat(roundtrippedRoutingStrategyGetResponse).isEqualTo(routingStrategyGetResponse)
    }
}
