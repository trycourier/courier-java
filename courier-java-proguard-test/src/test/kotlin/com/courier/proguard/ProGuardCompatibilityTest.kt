// File generated from our OpenAPI spec by Stainless.

package com.courier.proguard

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.jsonMapper
import com.courier.models.Alignment
import com.courier.models.Discord
import com.courier.models.SendToChannel
import com.courier.models.send.SendMessageResponse
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
    fun sendMessageResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val sendMessageResponse =
            SendMessageResponse.builder().requestId("1-65f240a0-47a6a120c8374de9bcf9f22c").build()

        val roundtrippedSendMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendMessageResponse),
                jacksonTypeRef<SendMessageResponse>(),
            )

        assertThat(roundtrippedSendMessageResponse).isEqualTo(sendMessageResponse)
    }

    @Test
    fun discordRoundtrip() {
        val jsonMapper = jsonMapper()
        val discord =
            Discord.ofSendToChannel(SendToChannel.builder().channelId("channel_id").build())

        val roundtrippedDiscord =
            jsonMapper.readValue(jsonMapper.writeValueAsString(discord), jacksonTypeRef<Discord>())

        assertThat(roundtrippedDiscord).isEqualTo(discord)
    }

    @Test
    fun alignmentRoundtrip() {
        val jsonMapper = jsonMapper()
        val alignment = Alignment.CENTER

        val roundtrippedAlignment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alignment),
                jacksonTypeRef<Alignment>(),
            )

        assertThat(roundtrippedAlignment).isEqualTo(alignment)
    }
}
