// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.JsonValue
import com.courier.models.MessageChannels
import com.courier.models.MessageProviders
import com.courier.models.MessageRouting
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingStrategyReplaceParamsTest {

    @Test
    fun create() {
        RoutingStrategyReplaceParams.builder()
            .id("id")
            .routingStrategyReplaceRequest(
                RoutingStrategyReplaceRequest.builder()
                    .name("Email via SendGrid v2")
                    .routing(
                        MessageRouting.builder()
                            .addChannel("email")
                            .method(MessageRouting.Method.SINGLE)
                            .build()
                    )
                    .channels(
                        MessageChannels.builder()
                            .putAdditionalProperty(
                                "email",
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
                                        "providers" to listOf("ses", "sendgrid"),
                                        "routing_method" to "all",
                                        "timeouts" to mapOf("channel" to 0, "provider" to 0),
                                    )
                                ),
                            )
                            .build()
                    )
                    .description("Updated routing with SES primary")
                    .providers(
                        MessageProviders.builder()
                            .putAdditionalProperty(
                                "ses",
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
                                        "override" to mapOf<String, Any>(),
                                        "timeouts" to 0,
                                    )
                                ),
                            )
                            .build()
                    )
                    .tags(listOf("production", "email", "v2"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoutingStrategyReplaceParams.builder()
                .id("id")
                .routingStrategyReplaceRequest(
                    RoutingStrategyReplaceRequest.builder()
                        .name("Email via SendGrid v2")
                        .routing(
                            MessageRouting.builder()
                                .addChannel("email")
                                .method(MessageRouting.Method.SINGLE)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RoutingStrategyReplaceParams.builder()
                .id("id")
                .routingStrategyReplaceRequest(
                    RoutingStrategyReplaceRequest.builder()
                        .name("Email via SendGrid v2")
                        .routing(
                            MessageRouting.builder()
                                .addChannel("email")
                                .method(MessageRouting.Method.SINGLE)
                                .build()
                        )
                        .channels(
                            MessageChannels.builder()
                                .putAdditionalProperty(
                                    "email",
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
                                            "providers" to listOf("ses", "sendgrid"),
                                            "routing_method" to "all",
                                            "timeouts" to mapOf("channel" to 0, "provider" to 0),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .description("Updated routing with SES primary")
                        .providers(
                            MessageProviders.builder()
                                .putAdditionalProperty(
                                    "ses",
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
                                            "override" to mapOf<String, Any>(),
                                            "timeouts" to 0,
                                        )
                                    ),
                                )
                                .build()
                        )
                        .tags(listOf("production", "email", "v2"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RoutingStrategyReplaceRequest.builder()
                    .name("Email via SendGrid v2")
                    .routing(
                        MessageRouting.builder()
                            .addChannel("email")
                            .method(MessageRouting.Method.SINGLE)
                            .build()
                    )
                    .channels(
                        MessageChannels.builder()
                            .putAdditionalProperty(
                                "email",
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
                                        "providers" to listOf("ses", "sendgrid"),
                                        "routing_method" to "all",
                                        "timeouts" to mapOf("channel" to 0, "provider" to 0),
                                    )
                                ),
                            )
                            .build()
                    )
                    .description("Updated routing with SES primary")
                    .providers(
                        MessageProviders.builder()
                            .putAdditionalProperty(
                                "ses",
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
                                        "override" to mapOf<String, Any>(),
                                        "timeouts" to 0,
                                    )
                                ),
                            )
                            .build()
                    )
                    .tags(listOf("production", "email", "v2"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RoutingStrategyReplaceParams.builder()
                .id("id")
                .routingStrategyReplaceRequest(
                    RoutingStrategyReplaceRequest.builder()
                        .name("Email via SendGrid v2")
                        .routing(
                            MessageRouting.builder()
                                .addChannel("email")
                                .method(MessageRouting.Method.SINGLE)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RoutingStrategyReplaceRequest.builder()
                    .name("Email via SendGrid v2")
                    .routing(
                        MessageRouting.builder()
                            .addChannel("email")
                            .method(MessageRouting.Method.SINGLE)
                            .build()
                    )
                    .build()
            )
    }
}
