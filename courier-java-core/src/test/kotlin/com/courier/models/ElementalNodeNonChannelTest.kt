// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ElementalNodeNonChannelTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            ElementalNodeNonChannel.UnionMember0.builder()
                .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember0(unionMember0)

        assertThat(elementalNodeNonChannel.unionMember0()).contains(unionMember0)
        assertThat(elementalNodeNonChannel.unionMember1()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember2()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember3()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember4()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember5()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember6()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember0(
                ElementalNodeNonChannel.UnionMember0.builder()
                    .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            ElementalNodeNonChannel.UnionMember1.builder()
                .type(ElementalNodeNonChannel.UnionMember1.Type.META)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember1(unionMember1)

        assertThat(elementalNodeNonChannel.unionMember0()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember1()).contains(unionMember1)
        assertThat(elementalNodeNonChannel.unionMember2()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember3()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember4()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember5()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember6()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember1(
                ElementalNodeNonChannel.UnionMember1.builder()
                    .type(ElementalNodeNonChannel.UnionMember1.Type.META)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            ElementalNodeNonChannel.UnionMember2.builder()
                .type(ElementalNodeNonChannel.UnionMember2.Type.IMAGE)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember2(unionMember2)

        assertThat(elementalNodeNonChannel.unionMember0()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember1()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember2()).contains(unionMember2)
        assertThat(elementalNodeNonChannel.unionMember3()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember4()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember5()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember6()).isEmpty
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember2(
                ElementalNodeNonChannel.UnionMember2.builder()
                    .type(ElementalNodeNonChannel.UnionMember2.Type.IMAGE)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
    }

    @Test
    fun ofUnionMember3() {
        val unionMember3 =
            ElementalNodeNonChannel.UnionMember3.builder()
                .type(ElementalNodeNonChannel.UnionMember3.Type.ACTION)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember3(unionMember3)

        assertThat(elementalNodeNonChannel.unionMember0()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember1()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember2()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember3()).contains(unionMember3)
        assertThat(elementalNodeNonChannel.unionMember4()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember5()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember6()).isEmpty
    }

    @Test
    fun ofUnionMember3Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember3(
                ElementalNodeNonChannel.UnionMember3.builder()
                    .type(ElementalNodeNonChannel.UnionMember3.Type.ACTION)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
    }

    @Test
    fun ofUnionMember4() {
        val unionMember4 =
            ElementalNodeNonChannel.UnionMember4.builder()
                .type(ElementalNodeNonChannel.UnionMember4.Type.DIVIDER)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember4(unionMember4)

        assertThat(elementalNodeNonChannel.unionMember0()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember1()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember2()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember3()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember4()).contains(unionMember4)
        assertThat(elementalNodeNonChannel.unionMember5()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember6()).isEmpty
    }

    @Test
    fun ofUnionMember4Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember4(
                ElementalNodeNonChannel.UnionMember4.builder()
                    .type(ElementalNodeNonChannel.UnionMember4.Type.DIVIDER)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
    }

    @Test
    fun ofUnionMember5() {
        val unionMember5 =
            ElementalNodeNonChannel.UnionMember5.builder()
                .type(ElementalNodeNonChannel.UnionMember5.Type.QUOTE)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember5(unionMember5)

        assertThat(elementalNodeNonChannel.unionMember0()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember1()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember2()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember3()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember4()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember5()).contains(unionMember5)
        assertThat(elementalNodeNonChannel.unionMember6()).isEmpty
    }

    @Test
    fun ofUnionMember5Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember5(
                ElementalNodeNonChannel.UnionMember5.builder()
                    .type(ElementalNodeNonChannel.UnionMember5.Type.QUOTE)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
    }

    @Test
    fun ofUnionMember6() {
        val unionMember6 =
            ElementalNodeNonChannel.UnionMember6.builder()
                .type(ElementalNodeNonChannel.UnionMember6.Type.HTML)
                .build()

        val elementalNodeNonChannel = ElementalNodeNonChannel.ofUnionMember6(unionMember6)

        assertThat(elementalNodeNonChannel.unionMember0()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember1()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember2()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember3()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember4()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember5()).isEmpty
        assertThat(elementalNodeNonChannel.unionMember6()).contains(unionMember6)
    }

    @Test
    fun ofUnionMember6Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNodeNonChannel =
            ElementalNodeNonChannel.ofUnionMember6(
                ElementalNodeNonChannel.UnionMember6.builder()
                    .type(ElementalNodeNonChannel.UnionMember6.Type.HTML)
                    .build()
            )

        val roundtrippedElementalNodeNonChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNodeNonChannel),
                jacksonTypeRef<ElementalNodeNonChannel>(),
            )

        assertThat(roundtrippedElementalNodeNonChannel).isEqualTo(elementalNodeNonChannel)
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
        val elementalNodeNonChannel =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ElementalNodeNonChannel>())

        val e = assertThrows<CourierInvalidDataException> { elementalNodeNonChannel.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
