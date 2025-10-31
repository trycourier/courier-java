// File generated from our OpenAPI spec by Stainless.

package com.courier.services

import com.courier.client.CourierClient
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.ElementalContentSugar
import com.courier.models.MessageContext
import com.courier.models.UserRecipient
import com.courier.models.Utm
import com.courier.models.send.SendMessageParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: CourierClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            CourierOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun message() {
        val sendService = client.send()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sendService.message(
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
                            ElementalContentSugar.builder().body("body").title("title").build()
                        )
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            SendMessageParams.Message.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                        .template("template_id")
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
