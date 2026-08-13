// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ElementalContentSugar
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundBulkMessageTest {

    @Test
    fun create() {
        val inboundBulkMessage =
            InboundBulkMessage.builder()
                .event("event")
                .brand("brand")
                .content(ElementalContentSugar.builder().body("body").title("title").build())
                .data(
                    InboundBulkMessage.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .locale(
                    InboundBulkMessage.Locale.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .override(
                    InboundBulkMessage.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .template("template")
                .build()

        assertThat(inboundBulkMessage.event()).isEqualTo("event")
        assertThat(inboundBulkMessage.brand()).contains("brand")
        assertThat(inboundBulkMessage.content())
            .contains(
                InboundBulkMessage.Content.ofElementalContentSugar(
                    ElementalContentSugar.builder().body("body").title("title").build()
                )
            )
        assertThat(inboundBulkMessage.data())
            .contains(
                InboundBulkMessage.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundBulkMessage.locale())
            .contains(
                InboundBulkMessage.Locale.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(inboundBulkMessage.override())
            .contains(
                InboundBulkMessage.Override.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundBulkMessage.template()).contains("template")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundBulkMessage =
            InboundBulkMessage.builder()
                .event("event")
                .brand("brand")
                .content(ElementalContentSugar.builder().body("body").title("title").build())
                .data(
                    InboundBulkMessage.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .locale(
                    InboundBulkMessage.Locale.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .override(
                    InboundBulkMessage.Override.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .template("template")
                .build()

        val roundtrippedInboundBulkMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundBulkMessage),
                jacksonTypeRef<InboundBulkMessage>(),
            )

        assertThat(roundtrippedInboundBulkMessage).isEqualTo(inboundBulkMessage)
    }
}
