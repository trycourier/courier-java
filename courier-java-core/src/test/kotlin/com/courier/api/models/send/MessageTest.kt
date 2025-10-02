// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class MessageTest {

    @Test
    fun ofContent() {
        val content =
            Message.ContentMessage.builder()
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
                        .addChannel(
                            BaseMessage.Routing.Channel.RoutingStrategyChannel.builder()
                                .channel("channel")
                                .config(
                                    BaseMessage.Routing.Channel.RoutingStrategyChannel.Config
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .if_("if")
                                .method(RoutingMethod.ALL)
                                .providers(
                                    BaseMessage.Routing.Channel.RoutingStrategyChannel.Providers
                                        .builder()
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
                                .build()
                        )
                        .method(RoutingMethod.ALL)
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
                .to(
                    BaseMessageSendTo.To.AudienceRecipient.builder()
                        .audienceId("audience_id")
                        .data(
                            BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addFilter(
                            BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                .operator(
                                    BaseMessageSendTo.To.AudienceRecipient.Filter.Operator.MEMBER_OF
                                )
                                .path(BaseMessageSendTo.To.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .content(
                    Content.ElementalContent.builder()
                        .addElement(
                            Content.ElementalContent.Element.UnionMember0.builder()
                                .addChannel("string")
                                .if_("if")
                                .loop("loop")
                                .ref("ref")
                                .type(Content.ElementalContent.Element.UnionMember0.Type.TEXT)
                                .build()
                        )
                        .version("version")
                        .brand(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val message = Message.ofContent(content)

        assertThat(message.content()).contains(content)
        assertThat(message.template()).isEmpty
    }

    @Test
    fun ofContentRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofContent(
                Message.ContentMessage.builder()
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
                            .addChannel(
                                BaseMessage.Routing.Channel.RoutingStrategyChannel.builder()
                                    .channel("channel")
                                    .config(
                                        BaseMessage.Routing.Channel.RoutingStrategyChannel.Config
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .if_("if")
                                    .method(RoutingMethod.ALL)
                                    .providers(
                                        BaseMessage.Routing.Channel.RoutingStrategyChannel.Providers
                                            .builder()
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
                                    .build()
                            )
                            .method(RoutingMethod.ALL)
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
                    .to(
                        BaseMessageSendTo.To.AudienceRecipient.builder()
                            .audienceId("audience_id")
                            .data(
                                BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addFilter(
                                BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                    .operator(
                                        BaseMessageSendTo.To.AudienceRecipient.Filter.Operator
                                            .MEMBER_OF
                                    )
                                    .path(
                                        BaseMessageSendTo.To.AudienceRecipient.Filter.Path
                                            .ACCOUNT_ID
                                    )
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .content(
                        Content.ElementalContent.builder()
                            .addElement(
                                Content.ElementalContent.Element.UnionMember0.builder()
                                    .addChannel("string")
                                    .if_("if")
                                    .loop("loop")
                                    .ref("ref")
                                    .type(Content.ElementalContent.Element.UnionMember0.Type.TEXT)
                                    .build()
                            )
                            .version("version")
                            .brand(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    @Test
    fun ofTemplate() {
        val template =
            Message.TemplateMessage.builder()
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
                        .addChannel(
                            BaseMessage.Routing.Channel.RoutingStrategyChannel.builder()
                                .channel("channel")
                                .config(
                                    BaseMessage.Routing.Channel.RoutingStrategyChannel.Config
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .if_("if")
                                .method(RoutingMethod.ALL)
                                .providers(
                                    BaseMessage.Routing.Channel.RoutingStrategyChannel.Providers
                                        .builder()
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
                                .build()
                        )
                        .method(RoutingMethod.ALL)
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
                .to(
                    BaseMessageSendTo.To.AudienceRecipient.builder()
                        .audienceId("audience_id")
                        .data(
                            BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addFilter(
                            BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                .operator(
                                    BaseMessageSendTo.To.AudienceRecipient.Filter.Operator.MEMBER_OF
                                )
                                .path(BaseMessageSendTo.To.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .template("template")
                .build()

        val message = Message.ofTemplate(template)

        assertThat(message.content()).isEmpty
        assertThat(message.template()).contains(template)
    }

    @Test
    fun ofTemplateRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofTemplate(
                Message.TemplateMessage.builder()
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
                            .addChannel(
                                BaseMessage.Routing.Channel.RoutingStrategyChannel.builder()
                                    .channel("channel")
                                    .config(
                                        BaseMessage.Routing.Channel.RoutingStrategyChannel.Config
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .if_("if")
                                    .method(RoutingMethod.ALL)
                                    .providers(
                                        BaseMessage.Routing.Channel.RoutingStrategyChannel.Providers
                                            .builder()
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
                                    .build()
                            )
                            .method(RoutingMethod.ALL)
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
                    .to(
                        BaseMessageSendTo.To.AudienceRecipient.builder()
                            .audienceId("audience_id")
                            .data(
                                BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addFilter(
                                BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                    .operator(
                                        BaseMessageSendTo.To.AudienceRecipient.Filter.Operator
                                            .MEMBER_OF
                                    )
                                    .path(
                                        BaseMessageSendTo.To.AudienceRecipient.Filter.Path
                                            .ACCOUNT_ID
                                    )
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .template("template")
                    .build()
            )

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val message = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Message>())

        val e = assertThrows<CourierInvalidDataException> { message.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
