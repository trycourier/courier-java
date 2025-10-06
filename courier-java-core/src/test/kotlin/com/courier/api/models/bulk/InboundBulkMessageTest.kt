// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.send.Content
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class InboundBulkMessageTest {

    @Test
    fun ofTemplate() {
        val template =
            InboundBulkMessage.InboundBulkTemplateMessage.builder()
                .template("template")
                .brand("brand")
                .data(
                    InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .event("event")
                .locale(
                    InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .override(
                    InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val inboundBulkMessage = InboundBulkMessage.ofTemplate(template)

        assertThat(inboundBulkMessage.template()).contains(template)
        assertThat(inboundBulkMessage.content()).isEmpty
    }

    @Test
    fun ofTemplateRoundtrip() {
        val jsonMapper = jsonMapper()
        val inboundBulkMessage =
            InboundBulkMessage.ofTemplate(
                InboundBulkMessage.InboundBulkTemplateMessage.builder()
                    .template("template")
                    .brand("brand")
                    .data(
                        InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .event("event")
                    .locale(
                        InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .override(
                        InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedInboundBulkMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundBulkMessage),
                jacksonTypeRef<InboundBulkMessage>(),
            )

        assertThat(roundtrippedInboundBulkMessage).isEqualTo(inboundBulkMessage)
    }

    @Test
    fun ofContent() {
        val content =
            InboundBulkMessage.InboundBulkContentMessage.builder()
                .content(
                    Content.ElementalContentSugar.builder().body("body").title("title").build()
                )
                .brand("brand")
                .data(
                    InboundBulkMessage.InboundBulkContentMessage.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .event("event")
                .locale(
                    InboundBulkMessage.InboundBulkContentMessage.Locale.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .override(
                    InboundBulkMessage.InboundBulkContentMessage.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val inboundBulkMessage = InboundBulkMessage.ofContent(content)

        assertThat(inboundBulkMessage.template()).isEmpty
        assertThat(inboundBulkMessage.content()).contains(content)
    }

    @Test
    fun ofContentRoundtrip() {
        val jsonMapper = jsonMapper()
        val inboundBulkMessage =
            InboundBulkMessage.ofContent(
                InboundBulkMessage.InboundBulkContentMessage.builder()
                    .content(
                        Content.ElementalContentSugar.builder().body("body").title("title").build()
                    )
                    .brand("brand")
                    .data(
                        InboundBulkMessage.InboundBulkContentMessage.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .event("event")
                    .locale(
                        InboundBulkMessage.InboundBulkContentMessage.Locale.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .override(
                        InboundBulkMessage.InboundBulkContentMessage.Override.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedInboundBulkMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundBulkMessage),
                jacksonTypeRef<InboundBulkMessage>(),
            )

        assertThat(roundtrippedInboundBulkMessage).isEqualTo(inboundBulkMessage)
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
        val inboundBulkMessage =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<InboundBulkMessage>())

        val e = assertThrows<CourierInvalidDataException> { inboundBulkMessage.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
