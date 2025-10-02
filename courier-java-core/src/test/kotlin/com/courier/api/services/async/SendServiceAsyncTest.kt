// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.BaseMessageSendTo
import com.courier.api.models.send.Content
import com.courier.api.models.send.ElementalNode
import com.courier.api.models.send.Message
import com.courier.api.models.send.MessageContext
import com.courier.api.models.send.RoutingMethod
import com.courier.api.models.send.SendMessageParams
import com.courier.api.models.send.Utm
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SendServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun message() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sendServiceAsync = client.send()

        val responseFuture =
            sendServiceAsync.message(
                SendMessageParams.builder()
                    .message(
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
                                                BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                    .Config
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .if_("if")
                                            .method(RoutingMethod.ALL)
                                            .providers(
                                                BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                    .Providers
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
                                                                                "campaign" to
                                                                                    "campaign",
                                                                                "content" to
                                                                                    "content",
                                                                                "medium" to
                                                                                    "medium",
                                                                                "source" to
                                                                                    "source",
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
                                                BaseMessageSendTo.To.AudienceRecipient.Filter
                                                    .Operator
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
                                        ElementalNode.UnionMember0.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .type(ElementalNode.UnionMember0.Type.TEXT)
                                            .build()
                                    )
                                    .version("version")
                                    .brand(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
