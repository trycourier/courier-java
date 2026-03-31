// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.JsonValue
import com.courier.models.MessageChannels
import com.courier.models.MessageProviders
import com.courier.models.MessageRouting
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingStrategyCreateParamsTest {

    @Test
    fun create() {
        RoutingStrategyCreateParams.builder()
            .routingStrategyCreateRequest(
                RoutingStrategyCreateRequest.builder()
                    .name("Email via SendGrid")
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
                                        "providers" to listOf("sendgrid", "ses"),
                                        "routing_method" to "all",
                                        "timeouts" to mapOf("channel" to 0, "provider" to 0),
                                    )
                                ),
                            )
                            .build()
                    )
                    .description("Routes email through sendgrid with SES failover")
                    .providers(
                        MessageProviders.builder()
                            .putAdditionalProperty(
                                "sendgrid",
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
                    .addTag("production")
                    .addTag("email")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RoutingStrategyCreateParams.builder()
                .routingStrategyCreateRequest(
                    RoutingStrategyCreateRequest.builder()
                        .name("Email via SendGrid")
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
                                            "providers" to listOf("sendgrid", "ses"),
                                            "routing_method" to "all",
                                            "timeouts" to mapOf("channel" to 0, "provider" to 0),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .description("Routes email through sendgrid with SES failover")
                        .providers(
                            MessageProviders.builder()
                                .putAdditionalProperty(
                                    "sendgrid",
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
                        .addTag("production")
                        .addTag("email")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RoutingStrategyCreateRequest.builder()
                    .name("Email via SendGrid")
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
                                        "providers" to listOf("sendgrid", "ses"),
                                        "routing_method" to "all",
                                        "timeouts" to mapOf("channel" to 0, "provider" to 0),
                                    )
                                ),
                            )
                            .build()
                    )
                    .description("Routes email through sendgrid with SES failover")
                    .providers(
                        MessageProviders.builder()
                            .putAdditionalProperty(
                                "sendgrid",
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
                    .addTag("production")
                    .addTag("email")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RoutingStrategyCreateParams.builder()
                .routingStrategyCreateRequest(
                    RoutingStrategyCreateRequest.builder()
                        .name("Email via SendGrid")
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
                RoutingStrategyCreateRequest.builder()
                    .name("Email via SendGrid")
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
