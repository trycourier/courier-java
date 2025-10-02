// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services

import com.courier.api.client.CourierClient
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.JsonValue
import com.courier.api.core.http.Headers
import com.courier.api.core.jsonMapper
import com.courier.api.errors.BadRequestException
import com.courier.api.errors.CourierException
import com.courier.api.errors.InternalServerException
import com.courier.api.errors.NotFoundException
import com.courier.api.errors.PermissionDeniedException
import com.courier.api.errors.RateLimitException
import com.courier.api.errors.UnauthorizedException
import com.courier.api.errors.UnexpectedStatusCodeException
import com.courier.api.errors.UnprocessableEntityException
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.BaseMessageSendTo
import com.courier.api.models.send.Content
import com.courier.api.models.send.ElementalNode
import com.courier.api.models.send.Message
import com.courier.api.models.send.MessageContext
import com.courier.api.models.send.RoutingMethod
import com.courier.api.models.send.SendMessageParams
import com.courier.api.models.send.Utm
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: CourierClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            CourierOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun sendMessage400() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage400WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage401() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage401WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage403() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage403WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage404() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage404WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage422() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage422WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage429() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage429WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage500() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage500WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage999() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessage999WithRawResponse() {
        val sendService = client.send().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sendMessageInvalidJsonBody() {
        val sendService = client.send()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<CourierException> {
                sendService.message(
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
                                                    "timeouts" to
                                                        mapOf("channel" to 0, "provider" to 0),
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
                                .delay(
                                    BaseMessage.Delay.builder().duration(0L).until("until").build()
                                )
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
                                            BaseMessage.Routing.Channel.RoutingStrategyChannel
                                                .builder()
                                                .channel("channel")
                                                .config(
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                    BaseMessage.Routing.Channel
                                                        .RoutingStrategyChannel
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
                                                                    "override" to
                                                                        mapOf("foo" to "bar"),
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
                                                    BaseMessageSendTo.To.AudienceRecipient.Filter
                                                        .Path
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
