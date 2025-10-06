// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendMessageParamsTest {

    @Test
    fun create() {
        SendMessageParams.builder()
            .message(
                SendMessageParams.Message.builder()
                    .brandId("brand_id")
                    .channels(
                        SendMessageParams.Message.Channels.builder()
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
                    .content(
                        SendMessageParams.Message.Content.ElementalContentSugar.builder()
                            .body("body")
                            .title("title")
                            .build()
                    )
                    .context(MessageContext.builder().tenantId("tenant_id").build())
                    .data(
                        SendMessageParams.Message.Data.builder()
                            .putAdditionalProperty("name", JsonValue.from("bar"))
                            .build()
                    )
                    .delay(
                        SendMessageParams.Message.Delay.builder()
                            .duration(0L)
                            .until("until")
                            .build()
                    )
                    .expiry(
                        SendMessageParams.Message.Expiry.builder()
                            .expiresIn("string")
                            .expiresAt("expires_at")
                            .build()
                    )
                    .metadata(
                        SendMessageParams.Message.Metadata.builder()
                            .event("event")
                            .addTag("string")
                            .traceId("trace_id")
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
                    .preferences(
                        SendMessageParams.Message.Preferences.builder()
                            .subscriptionTopicId("subscription_topic_id")
                            .build()
                    )
                    .providers(
                        SendMessageParams.Message.Providers.builder()
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
                        SendMessageParams.Message.Routing.builder()
                            .addChannel("string")
                            .method(SendMessageParams.Message.Routing.Method.ALL)
                            .build()
                    )
                    .timeout(
                        SendMessageParams.Message.Timeout.builder()
                            .channel(
                                SendMessageParams.Message.Timeout.Channel.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .criteria(SendMessageParams.Message.Timeout.Criteria.NO_ESCALATION)
                            .escalation(0L)
                            .message(0L)
                            .provider(
                                SendMessageParams.Message.Timeout.Provider.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .to(
                        SendMessageParams.Message.To.UnionMember0.builder()
                            .accountId("account_id")
                            .context(MessageContext.builder().tenantId("tenant_id").build())
                            .data(
                                SendMessageParams.Message.To.UnionMember0.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .email("email")
                            .locale("locale")
                            .phoneNumber("phone_number")
                            .preferences(
                                SendMessageParams.Message.To.UnionMember0.Preferences.builder()
                                    .notifications(
                                        SendMessageParams.Message.To.UnionMember0.Preferences
                                            .Notifications
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "status" to "OPTED_IN",
                                                        "channel_preferences" to
                                                            listOf(
                                                                mapOf("channel" to "direct_message")
                                                            ),
                                                        "rules" to
                                                            listOf(
                                                                mapOf(
                                                                    "until" to "until",
                                                                    "start" to "start",
                                                                )
                                                            ),
                                                        "source" to "subscription",
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .categories(
                                        SendMessageParams.Message.To.UnionMember0.Preferences
                                            .Categories
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "status" to "OPTED_IN",
                                                        "channel_preferences" to
                                                            listOf(
                                                                mapOf("channel" to "direct_message")
                                                            ),
                                                        "rules" to
                                                            listOf(
                                                                mapOf(
                                                                    "until" to "until",
                                                                    "start" to "start",
                                                                )
                                                            ),
                                                        "source" to "subscription",
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .templateId("templateId")
                                    .build()
                            )
                            .tenantId("tenant_id")
                            .userId("example_user")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SendMessageParams.builder()
                .message(
                    SendMessageParams.Message.builder()
                        .brandId("brand_id")
                        .channels(
                            SendMessageParams.Message.Channels.builder()
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
                        .content(
                            SendMessageParams.Message.Content.ElementalContentSugar.builder()
                                .body("body")
                                .title("title")
                                .build()
                        )
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            SendMessageParams.Message.Data.builder()
                                .putAdditionalProperty("name", JsonValue.from("bar"))
                                .build()
                        )
                        .delay(
                            SendMessageParams.Message.Delay.builder()
                                .duration(0L)
                                .until("until")
                                .build()
                        )
                        .expiry(
                            SendMessageParams.Message.Expiry.builder()
                                .expiresIn("string")
                                .expiresAt("expires_at")
                                .build()
                        )
                        .metadata(
                            SendMessageParams.Message.Metadata.builder()
                                .event("event")
                                .addTag("string")
                                .traceId("trace_id")
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
                        .preferences(
                            SendMessageParams.Message.Preferences.builder()
                                .subscriptionTopicId("subscription_topic_id")
                                .build()
                        )
                        .providers(
                            SendMessageParams.Message.Providers.builder()
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
                            SendMessageParams.Message.Routing.builder()
                                .addChannel("string")
                                .method(SendMessageParams.Message.Routing.Method.ALL)
                                .build()
                        )
                        .timeout(
                            SendMessageParams.Message.Timeout.builder()
                                .channel(
                                    SendMessageParams.Message.Timeout.Channel.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .criteria(SendMessageParams.Message.Timeout.Criteria.NO_ESCALATION)
                                .escalation(0L)
                                .message(0L)
                                .provider(
                                    SendMessageParams.Message.Timeout.Provider.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .to(
                            SendMessageParams.Message.To.UnionMember0.builder()
                                .accountId("account_id")
                                .context(MessageContext.builder().tenantId("tenant_id").build())
                                .data(
                                    SendMessageParams.Message.To.UnionMember0.Data.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .email("email")
                                .locale("locale")
                                .phoneNumber("phone_number")
                                .preferences(
                                    SendMessageParams.Message.To.UnionMember0.Preferences.builder()
                                        .notifications(
                                            SendMessageParams.Message.To.UnionMember0.Preferences
                                                .Notifications
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(
                                                        mapOf(
                                                            "status" to "OPTED_IN",
                                                            "channel_preferences" to
                                                                listOf(
                                                                    mapOf(
                                                                        "channel" to
                                                                            "direct_message"
                                                                    )
                                                                ),
                                                            "rules" to
                                                                listOf(
                                                                    mapOf(
                                                                        "until" to "until",
                                                                        "start" to "start",
                                                                    )
                                                                ),
                                                            "source" to "subscription",
                                                        )
                                                    ),
                                                )
                                                .build()
                                        )
                                        .categories(
                                            SendMessageParams.Message.To.UnionMember0.Preferences
                                                .Categories
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(
                                                        mapOf(
                                                            "status" to "OPTED_IN",
                                                            "channel_preferences" to
                                                                listOf(
                                                                    mapOf(
                                                                        "channel" to
                                                                            "direct_message"
                                                                    )
                                                                ),
                                                            "rules" to
                                                                listOf(
                                                                    mapOf(
                                                                        "until" to "until",
                                                                        "start" to "start",
                                                                    )
                                                                ),
                                                            "source" to "subscription",
                                                        )
                                                    ),
                                                )
                                                .build()
                                        )
                                        .templateId("templateId")
                                        .build()
                                )
                                .tenantId("tenant_id")
                                .userId("example_user")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.message())
            .isEqualTo(
                SendMessageParams.Message.builder()
                    .brandId("brand_id")
                    .channels(
                        SendMessageParams.Message.Channels.builder()
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
                    .content(
                        SendMessageParams.Message.Content.ElementalContentSugar.builder()
                            .body("body")
                            .title("title")
                            .build()
                    )
                    .context(MessageContext.builder().tenantId("tenant_id").build())
                    .data(
                        SendMessageParams.Message.Data.builder()
                            .putAdditionalProperty("name", JsonValue.from("bar"))
                            .build()
                    )
                    .delay(
                        SendMessageParams.Message.Delay.builder()
                            .duration(0L)
                            .until("until")
                            .build()
                    )
                    .expiry(
                        SendMessageParams.Message.Expiry.builder()
                            .expiresIn("string")
                            .expiresAt("expires_at")
                            .build()
                    )
                    .metadata(
                        SendMessageParams.Message.Metadata.builder()
                            .event("event")
                            .addTag("string")
                            .traceId("trace_id")
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
                    .preferences(
                        SendMessageParams.Message.Preferences.builder()
                            .subscriptionTopicId("subscription_topic_id")
                            .build()
                    )
                    .providers(
                        SendMessageParams.Message.Providers.builder()
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
                        SendMessageParams.Message.Routing.builder()
                            .addChannel("string")
                            .method(SendMessageParams.Message.Routing.Method.ALL)
                            .build()
                    )
                    .timeout(
                        SendMessageParams.Message.Timeout.builder()
                            .channel(
                                SendMessageParams.Message.Timeout.Channel.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .criteria(SendMessageParams.Message.Timeout.Criteria.NO_ESCALATION)
                            .escalation(0L)
                            .message(0L)
                            .provider(
                                SendMessageParams.Message.Timeout.Provider.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .to(
                        SendMessageParams.Message.To.UnionMember0.builder()
                            .accountId("account_id")
                            .context(MessageContext.builder().tenantId("tenant_id").build())
                            .data(
                                SendMessageParams.Message.To.UnionMember0.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .email("email")
                            .locale("locale")
                            .phoneNumber("phone_number")
                            .preferences(
                                SendMessageParams.Message.To.UnionMember0.Preferences.builder()
                                    .notifications(
                                        SendMessageParams.Message.To.UnionMember0.Preferences
                                            .Notifications
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "status" to "OPTED_IN",
                                                        "channel_preferences" to
                                                            listOf(
                                                                mapOf("channel" to "direct_message")
                                                            ),
                                                        "rules" to
                                                            listOf(
                                                                mapOf(
                                                                    "until" to "until",
                                                                    "start" to "start",
                                                                )
                                                            ),
                                                        "source" to "subscription",
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .categories(
                                        SendMessageParams.Message.To.UnionMember0.Preferences
                                            .Categories
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "status" to "OPTED_IN",
                                                        "channel_preferences" to
                                                            listOf(
                                                                mapOf("channel" to "direct_message")
                                                            ),
                                                        "rules" to
                                                            listOf(
                                                                mapOf(
                                                                    "until" to "until",
                                                                    "start" to "start",
                                                                )
                                                            ),
                                                        "source" to "subscription",
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .templateId("templateId")
                                    .build()
                            )
                            .tenantId("tenant_id")
                            .userId("example_user")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SendMessageParams.builder().message(SendMessageParams.Message.builder().build()).build()

        val body = params._body()

        assertThat(body.message()).isEqualTo(SendMessageParams.Message.builder().build())
    }
}
