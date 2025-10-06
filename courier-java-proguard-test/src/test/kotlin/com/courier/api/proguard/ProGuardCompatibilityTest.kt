// File generated from our OpenAPI spec by Stainless.

package com.courier.api.proguard

import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.jsonMapper
import com.courier.api.models.send.Alignment
import com.courier.api.models.send.ElementalBaseNode
import com.courier.api.models.send.ElementalNode
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
    }

    @Test
    fun elementalBaseNodeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalBaseNode =
            ElementalBaseNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .build()

        val roundtrippedElementalBaseNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalBaseNode),
                jacksonTypeRef<ElementalBaseNode>(),
            )

        assertThat(roundtrippedElementalBaseNode).isEqualTo(elementalBaseNode)
    }

    @Test
    fun elementalNodeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember0(
                ElementalNode.UnionMember0.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember0.Type.TEXT)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
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
