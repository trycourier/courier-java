// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseMessageTest {

    @Test
    fun create() {
        val baseMessage =
            BaseMessage.builder()
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
                    BaseMessage.Expiry.builder().expiresIn("string").expiresAt("expires_at").build()
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
                .build()

        assertThat(baseMessage.brandId()).contains("brand_id")
        assertThat(baseMessage.channels())
            .contains(
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
        assertThat(baseMessage.context())
            .contains(MessageContext.builder().tenantId("tenant_id").build())
        assertThat(baseMessage.data())
            .contains(
                BaseMessage.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(baseMessage.delay())
            .contains(BaseMessage.Delay.builder().duration(0L).until("until").build())
        assertThat(baseMessage.expiry())
            .contains(
                BaseMessage.Expiry.builder().expiresIn("string").expiresAt("expires_at").build()
            )
        assertThat(baseMessage.metadata())
            .contains(
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
        assertThat(baseMessage.preferences())
            .contains(
                BaseMessage.Preferences.builder()
                    .subscriptionTopicId("subscription_topic_id")
                    .build()
            )
        assertThat(baseMessage.providers())
            .contains(
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
        assertThat(baseMessage.routing())
            .contains(
                BaseMessage.Routing.builder()
                    .addChannel("string")
                    .method(BaseMessage.Routing.Method.ALL)
                    .build()
            )
        assertThat(baseMessage.timeout())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseMessage =
            BaseMessage.builder()
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
                    BaseMessage.Expiry.builder().expiresIn("string").expiresAt("expires_at").build()
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
                .build()

        val roundtrippedBaseMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseMessage),
                jacksonTypeRef<BaseMessage>(),
            )

        assertThat(roundtrippedBaseMessage).isEqualTo(baseMessage)
    }
}
