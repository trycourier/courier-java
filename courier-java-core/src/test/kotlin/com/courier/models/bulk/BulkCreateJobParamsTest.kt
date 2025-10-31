// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkCreateJobParamsTest {

    @Test
    fun create() {
        BulkCreateJobParams.builder()
            .message(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            BulkCreateJobParams.builder()
                .message(
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
                .build()

        val body = params._body()

        assertThat(body.message())
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BulkCreateJobParams.builder()
                .message(
                    InboundBulkMessage.InboundBulkTemplateMessage.builder()
                        .template("template")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.message())
            .isEqualTo(
                InboundBulkMessage.ofTemplate(
                    InboundBulkMessage.InboundBulkTemplateMessage.builder()
                        .template("template")
                        .build()
                )
            )
    }
}
