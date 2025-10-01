// File generated from our OpenAPI spec by Stainless.

package com.courier.api.proguard

import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.Content
import com.courier.api.models.send.ElementalNode
import com.courier.api.models.send.MessageContext
import com.courier.api.models.send.RoutingMethod
import com.courier.api.models.send.Utm
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/courier-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.send()).isNotNull()
        assertThat(client.audiences()).isNotNull()
        assertThat(client.auditEvents()).isNotNull()
        assertThat(client.auth()).isNotNull()
        assertThat(client.automations()).isNotNull()
        assertThat(client.brands()).isNotNull()
        assertThat(client.bulk()).isNotNull()
        assertThat(client.inbound()).isNotNull()
        assertThat(client.lists()).isNotNull()
        assertThat(client.messages()).isNotNull()
        assertThat(client.requests()).isNotNull()
        assertThat(client.notifications()).isNotNull()
        assertThat(client.profiles()).isNotNull()
        assertThat(client.tenants()).isNotNull()
        assertThat(client.translations()).isNotNull()
        assertThat(client.users()).isNotNull()
    }

    @Test
    fun baseMessageRoundtrip() {
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
                .build()

        val roundtrippedBaseMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseMessage),
                jacksonTypeRef<BaseMessage>(),
            )

        assertThat(roundtrippedBaseMessage).isEqualTo(baseMessage)
    }

    @Test
    fun contentRoundtrip() {
        val jsonMapper = jsonMapper()
        val content =
            Content.ofElemental(
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

        val roundtrippedContent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(content), jacksonTypeRef<Content>())

        assertThat(roundtrippedContent).isEqualTo(content)
    }

    @Test
    fun routingMethodRoundtrip() {
        val jsonMapper = jsonMapper()
        val routingMethod = RoutingMethod.ALL

        val roundtrippedRoutingMethod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingMethod),
                jacksonTypeRef<RoutingMethod>(),
            )

        assertThat(roundtrippedRoutingMethod).isEqualTo(routingMethod)
    }
}
