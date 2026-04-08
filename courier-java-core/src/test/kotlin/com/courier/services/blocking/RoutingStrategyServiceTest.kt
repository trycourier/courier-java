// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.MessageChannels
import com.courier.models.MessageProviders
import com.courier.models.MessageRouting
import com.courier.models.routingstrategies.RoutingStrategyCreateRequest
import com.courier.models.routingstrategies.RoutingStrategyListNotificationsParams
import com.courier.models.routingstrategies.RoutingStrategyListParams
import com.courier.models.routingstrategies.RoutingStrategyReplaceParams
import com.courier.models.routingstrategies.RoutingStrategyReplaceRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoutingStrategyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val routingStrategyService = client.routingStrategies()

        val routingStrategyMutationResponse =
            routingStrategyService.create(
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

        routingStrategyMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val routingStrategyService = client.routingStrategies()

        val routingStrategyGetResponse = routingStrategyService.retrieve("id")

        routingStrategyGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val routingStrategyService = client.routingStrategies()

        val routingStrategyListResponse =
            routingStrategyService.list(
                RoutingStrategyListParams.builder().cursor("cursor").limit(1L).build()
            )

        routingStrategyListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val routingStrategyService = client.routingStrategies()

        routingStrategyService.archive("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listNotifications() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val routingStrategyService = client.routingStrategies()

        val associatedNotificationListResponse =
            routingStrategyService.listNotifications(
                RoutingStrategyListNotificationsParams.builder()
                    .id("id")
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        associatedNotificationListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val routingStrategyService = client.routingStrategies()

        val routingStrategyMutationResponse =
            routingStrategyService.replace(
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
            )

        routingStrategyMutationResponse.validate()
    }
}
