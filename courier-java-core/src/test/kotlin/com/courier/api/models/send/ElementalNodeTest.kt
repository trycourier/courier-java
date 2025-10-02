// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ElementalNodeTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            ElementalNode.UnionMember0.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember0.Type.TEXT)
                .build()

        val elementalNode = ElementalNode.ofUnionMember0(unionMember0)

        assertThat(elementalNode.unionMember0()).contains(unionMember0)
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
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
    fun ofUnionMember1() {
        val unionMember1 =
            ElementalNode.UnionMember1.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember1.Type.META)
                .build()

        val elementalNode = ElementalNode.ofUnionMember1(unionMember1)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).contains(unionMember1)
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember1(
                ElementalNode.UnionMember1.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember1.Type.META)
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
    fun ofType() {
        val type = ElementalNode.Type.builder().type(ElementalNode.Type.InnerType.CHANNEL).build()

        val elementalNode = ElementalNode.ofType(type)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).contains(type)
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofType(
                ElementalNode.Type.builder().type(ElementalNode.Type.InnerType.CHANNEL).build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofUnionMember3() {
        val unionMember3 =
            ElementalNode.UnionMember3.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember3.Type.IMAGE)
                .build()

        val elementalNode = ElementalNode.ofUnionMember3(unionMember3)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).contains(unionMember3)
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofUnionMember3Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember3(
                ElementalNode.UnionMember3.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember3.Type.IMAGE)
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
    fun ofUnionMember4() {
        val unionMember4 =
            ElementalNode.UnionMember4.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember4.Type.ACTION)
                .build()

        val elementalNode = ElementalNode.ofUnionMember4(unionMember4)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).contains(unionMember4)
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofUnionMember4Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember4(
                ElementalNode.UnionMember4.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember4.Type.ACTION)
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
    fun ofUnionMember5() {
        val unionMember5 =
            ElementalNode.UnionMember5.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember5.Type.DIVIDER)
                .build()

        val elementalNode = ElementalNode.ofUnionMember5(unionMember5)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).contains(unionMember5)
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofUnionMember5Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember5(
                ElementalNode.UnionMember5.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember5.Type.DIVIDER)
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
    fun ofUnionMember6() {
        val unionMember6 =
            ElementalNode.UnionMember6.builder()
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember6.Type.GROUP)
                .build()

        val elementalNode = ElementalNode.ofUnionMember6(unionMember6)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).contains(unionMember6)
        assertThat(elementalNode.unionMember7()).isEmpty
    }

    @Test
    fun ofUnionMember6Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember6(
                ElementalNode.UnionMember6.builder()
                    .addElement(
                        ElementalNode.UnionMember0.builder()
                            .addChannel("string")
                            .if_("if")
                            .loop("loop")
                            .ref("ref")
                            .type(ElementalNode.UnionMember0.Type.TEXT)
                            .build()
                    )
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember6.Type.GROUP)
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
    fun ofUnionMember7() {
        val unionMember7 =
            ElementalNode.UnionMember7.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalNode.UnionMember7.Type.QUOTE)
                .build()

        val elementalNode = ElementalNode.ofUnionMember7(unionMember7)

        assertThat(elementalNode.unionMember0()).isEmpty
        assertThat(elementalNode.unionMember1()).isEmpty
        assertThat(elementalNode.type()).isEmpty
        assertThat(elementalNode.unionMember3()).isEmpty
        assertThat(elementalNode.unionMember4()).isEmpty
        assertThat(elementalNode.unionMember5()).isEmpty
        assertThat(elementalNode.unionMember6()).isEmpty
        assertThat(elementalNode.unionMember7()).contains(unionMember7)
    }

    @Test
    fun ofUnionMember7Roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofUnionMember7(
                ElementalNode.UnionMember7.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .type(ElementalNode.UnionMember7.Type.QUOTE)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
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
        val elementalNode =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ElementalNode>())

        val e = assertThrows<CourierInvalidDataException> { elementalNode.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
