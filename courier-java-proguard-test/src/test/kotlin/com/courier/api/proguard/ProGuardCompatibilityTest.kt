// File generated from our OpenAPI spec by Stainless.

package com.courier.api.proguard

import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.jsonMapper
import com.courier.api.models.send.Content
import com.courier.api.models.send.MessageContext
import com.courier.api.models.tenants.defaultpreferences.items.ChannelClassification
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
    fun messageContextRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContext = MessageContext.builder().tenantId("tenant_id").build()

        val roundtrippedMessageContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContext),
                jacksonTypeRef<MessageContext>(),
            )

        assertThat(roundtrippedMessageContext).isEqualTo(messageContext)
    }

    @Test
    fun contentRoundtrip() {
        val jsonMapper = jsonMapper()
        val content =
            Content.ofElementalContentSugar(
                Content.ElementalContentSugar.builder().body("body").title("title").build()
            )

        val roundtrippedContent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(content), jacksonTypeRef<Content>())

        assertThat(roundtrippedContent).isEqualTo(content)
    }

    @Test
    fun channelClassificationRoundtrip() {
        val jsonMapper = jsonMapper()
        val channelClassification = ChannelClassification.DIRECT_MESSAGE

        val roundtrippedChannelClassification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelClassification),
                jacksonTypeRef<ChannelClassification>(),
            )

        assertThat(roundtrippedChannelClassification).isEqualTo(channelClassification)
    }
}
