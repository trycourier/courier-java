// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.tenants.templates.ElementalContent
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ContentTest {

    @Test
    fun ofElementalContentSugar() {
        val elementalContentSugar =
            Content.ElementalContentSugar.builder().body("body").title("title").build()

        val content = Content.ofElementalContentSugar(elementalContentSugar)

        assertThat(content.elementalContentSugar()).contains(elementalContentSugar)
        assertThat(content.elemental()).isEmpty
    }

    @Test
    fun ofElementalContentSugarRoundtrip() {
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
    fun ofElemental() {
        val elemental =
            ElementalContent.builder()
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
                .brand("brand")
                .build()

        val content = Content.ofElemental(elemental)

        assertThat(content.elementalContentSugar()).isEmpty
        assertThat(content.elemental()).contains(elemental)
    }

    @Test
    fun ofElementalRoundtrip() {
        val jsonMapper = jsonMapper()
        val content =
            Content.ofElemental(
                ElementalContent.builder()
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
                    .brand("brand")
                    .build()
            )

        val roundtrippedContent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(content), jacksonTypeRef<Content>())

        assertThat(roundtrippedContent).isEqualTo(content)
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
        val content = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Content>())

        val e = assertThrows<CourierInvalidDataException> { content.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
