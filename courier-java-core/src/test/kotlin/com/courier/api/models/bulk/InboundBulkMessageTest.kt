// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.MessageContext
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundBulkMessageTest {

    @Test
    fun create() {
        val inboundBulkMessage =
            InboundBulkMessage.builder()
                .brand("brand")
                .data(
                    InboundBulkMessage.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .event("event")
                .locale(
                    InboundBulkMessage.Locale.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message(
                    InboundBulkMessage.Message.InboundBulkTemplateMessage.builder()
                        .brandId("brand_id")
                        .channels(
                            BaseMessage.Channels.builder()
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
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            BaseMessage.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .delay(BaseMessage.Delay.builder().duration(0L).until("until").build())
                        .expiry(
                            BaseMessage.Expiry.builder()
                                .expiresIn("string")
                                .expiresAt("expires_at")
                                .build()
                        )
                        .metadata(
                            BaseMessage.Metadata.builder()
                                .event("event")
                                .addTag("string")
                                .traceId("trace_id")
                                .utm(
                                    BaseMessage.Metadata.Utm.builder()
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
                            BaseMessage.Preferences.builder()
                                .subscriptionTopicId("subscription_topic_id")
                                .build()
                        )
                        .providers(
                            BaseMessage.Providers.builder()
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
                            BaseMessage.Routing.builder()
                                .addChannel("string")
                                .method(BaseMessage.Routing.Method.ALL)
                                .build()
                        )
                        .timeout(
                            BaseMessage.Timeout.builder()
                                .channel(
                                    BaseMessage.Timeout.Channel.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .criteria(BaseMessage.Timeout.Criteria.NO_ESCALATION)
                                .escalation(0L)
                                .message(0L)
                                .provider(
                                    BaseMessage.Timeout.Provider.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .template("template")
                        .build()
                )
                .override(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(inboundBulkMessage.brand()).contains("brand")
        assertThat(inboundBulkMessage.data())
            .contains(
                InboundBulkMessage.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundBulkMessage.event()).contains("event")
        assertThat(inboundBulkMessage.locale())
            .contains(
                InboundBulkMessage.Locale.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundBulkMessage.message())
            .contains(
                InboundBulkMessage.Message.ofInboundBulkTemplate(
                    InboundBulkMessage.Message.InboundBulkTemplateMessage.builder()
                        .brandId("brand_id")
                        .channels(
                            BaseMessage.Channels.builder()
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
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            BaseMessage.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .delay(BaseMessage.Delay.builder().duration(0L).until("until").build())
                        .expiry(
                            BaseMessage.Expiry.builder()
                                .expiresIn("string")
                                .expiresAt("expires_at")
                                .build()
                        )
                        .metadata(
                            BaseMessage.Metadata.builder()
                                .event("event")
                                .addTag("string")
                                .traceId("trace_id")
                                .utm(
                                    BaseMessage.Metadata.Utm.builder()
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
                            BaseMessage.Preferences.builder()
                                .subscriptionTopicId("subscription_topic_id")
                                .build()
                        )
                        .providers(
                            BaseMessage.Providers.builder()
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
                            BaseMessage.Routing.builder()
                                .addChannel("string")
                                .method(BaseMessage.Routing.Method.ALL)
                                .build()
                        )
                        .timeout(
                            BaseMessage.Timeout.builder()
                                .channel(
                                    BaseMessage.Timeout.Channel.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .criteria(BaseMessage.Timeout.Criteria.NO_ESCALATION)
                                .escalation(0L)
                                .message(0L)
                                .provider(
                                    BaseMessage.Timeout.Provider.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .template("template")
                        .build()
                )
            )
        assertThat(inboundBulkMessage._override()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundBulkMessage =
            InboundBulkMessage.builder()
                .brand("brand")
                .data(
                    InboundBulkMessage.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .event("event")
                .locale(
                    InboundBulkMessage.Locale.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message(
                    InboundBulkMessage.Message.InboundBulkTemplateMessage.builder()
                        .brandId("brand_id")
                        .channels(
                            BaseMessage.Channels.builder()
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
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            BaseMessage.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .delay(BaseMessage.Delay.builder().duration(0L).until("until").build())
                        .expiry(
                            BaseMessage.Expiry.builder()
                                .expiresIn("string")
                                .expiresAt("expires_at")
                                .build()
                        )
                        .metadata(
                            BaseMessage.Metadata.builder()
                                .event("event")
                                .addTag("string")
                                .traceId("trace_id")
                                .utm(
                                    BaseMessage.Metadata.Utm.builder()
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
                            BaseMessage.Preferences.builder()
                                .subscriptionTopicId("subscription_topic_id")
                                .build()
                        )
                        .providers(
                            BaseMessage.Providers.builder()
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
                            BaseMessage.Routing.builder()
                                .addChannel("string")
                                .method(BaseMessage.Routing.Method.ALL)
                                .build()
                        )
                        .timeout(
                            BaseMessage.Timeout.builder()
                                .channel(
                                    BaseMessage.Timeout.Channel.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .criteria(BaseMessage.Timeout.Criteria.NO_ESCALATION)
                                .escalation(0L)
                                .message(0L)
                                .provider(
                                    BaseMessage.Timeout.Provider.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .template("template")
                        .build()
                )
                .override(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedInboundBulkMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundBulkMessage),
                jacksonTypeRef<InboundBulkMessage>(),
            )

        assertThat(roundtrippedInboundBulkMessage).isEqualTo(inboundBulkMessage)
    }
}
