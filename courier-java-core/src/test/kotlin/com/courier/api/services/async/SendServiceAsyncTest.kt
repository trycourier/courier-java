// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.BaseMessageSendTo
import com.courier.api.models.send.Content
import com.courier.api.models.send.Message
import com.courier.api.models.send.MessageContext
import com.courier.api.models.send.SendMessageParams
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
                                    .putAdditionalProperty("name", JsonValue.from("bar"))
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
                                    .addChannel("email")
                                    .method(BaseMessage.Routing.Method.SINGLE)
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
                                BaseMessageSendTo.To.UnionMember1.builder()
                                    .data(
                                        BaseMessageSendTo.To.UnionMember1.Data.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addFilter(
                                        BaseMessageSendTo.To.UnionMember1.Filter.builder()
                                            .operator(
                                                BaseMessageSendTo.To.UnionMember1.Filter.Operator
                                                    .MEMBER_OF
                                            )
                                            .path(
                                                BaseMessageSendTo.To.UnionMember1.Filter.Path
                                                    .ACCOUNT_ID
                                            )
                                            .value("value")
                                            .build()
                                    )
                                    .listId("list_id")
                                    .build()
                            )
                            .content(
                                Content.ElementalContentSugar.builder()
                                    .body("Thanks for signing up, {{name}}")
                                    .title("Welcome!")
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
