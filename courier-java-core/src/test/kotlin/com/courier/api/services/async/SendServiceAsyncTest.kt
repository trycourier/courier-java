// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.bulk.UserRecipient
import com.courier.api.models.send.Content
import com.courier.api.models.send.MessageContext
import com.courier.api.models.send.SendSendMessageParams
import com.courier.api.models.send.Utm
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SendServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun sendMessage() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sendServiceAsync = client.send()

        val responseFuture =
            sendServiceAsync.sendMessage(
                SendSendMessageParams.builder()
                    .message(
                        SendSendMessageParams.Message.builder()
                            .brandId("brand_id")
                            .channels(
                                SendSendMessageParams.Message.Channels.builder()
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
                                Content.ElementalContentSugar.builder()
                                    .body("body")
                                    .title("title")
                                    .build()
                            )
                            .context(MessageContext.builder().tenantId("tenant_id").build())
                            .data(
                                SendSendMessageParams.Message.Data.builder()
                                    .putAdditionalProperty("name", JsonValue.from("bar"))
                                    .build()
                            )
                            .delay(
                                SendSendMessageParams.Message.Delay.builder()
                                    .duration(0L)
                                    .until("until")
                                    .build()
                            )
                            .expiry(
                                SendSendMessageParams.Message.Expiry.builder()
                                    .expiresIn("string")
                                    .expiresAt("expires_at")
                                    .build()
                            )
                            .metadata(
                                SendSendMessageParams.Message.Metadata.builder()
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
                                SendSendMessageParams.Message.Preferences.builder()
                                    .subscriptionTopicId("subscription_topic_id")
                                    .build()
                            )
                            .providers(
                                SendSendMessageParams.Message.Providers.builder()
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
                                SendSendMessageParams.Message.Routing.builder()
                                    .addChannel("string")
                                    .method(SendSendMessageParams.Message.Routing.Method.ALL)
                                    .build()
                            )
                            .timeout(
                                SendSendMessageParams.Message.Timeout.builder()
                                    .channel(
                                        SendSendMessageParams.Message.Timeout.Channel.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .criteria(
                                        SendSendMessageParams.Message.Timeout.Criteria.NO_ESCALATION
                                    )
                                    .escalation(0L)
                                    .message(0L)
                                    .provider(
                                        SendSendMessageParams.Message.Timeout.Provider.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .build()
                            )
                            .to(
                                UserRecipient.builder()
                                    .accountId("account_id")
                                    .context(MessageContext.builder().tenantId("tenant_id").build())
                                    .data(
                                        UserRecipient.Data.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .email("email")
                                    .locale("locale")
                                    .phoneNumber("phone_number")
                                    .preferences(
                                        UserRecipient.Preferences.builder()
                                            .notifications(
                                                UserRecipient.Preferences.Notifications.builder()
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
                                                UserRecipient.Preferences.Categories.builder()
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
