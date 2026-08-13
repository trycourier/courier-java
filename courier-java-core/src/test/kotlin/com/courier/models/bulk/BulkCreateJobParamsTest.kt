// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.JsonValue
import com.courier.models.ElementalContentSugar
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkCreateJobParamsTest {

    @Test
    fun create() {
        BulkCreateJobParams.builder()
            .message(
                InboundBulkMessage.builder()
                    .event("welcome-series")
                    .brand("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                    .content(ElementalContentSugar.builder().body("body").title("title").build())
                    .data(
                        InboundBulkMessage.Data.builder()
                            .putAdditionalProperty("campaign", JsonValue.from("bar"))
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BulkCreateJobParams.builder()
                .message(
                    InboundBulkMessage.builder()
                        .event("welcome-series")
                        .brand("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                        .content(
                            ElementalContentSugar.builder().body("body").title("title").build()
                        )
                        .data(
                            InboundBulkMessage.Data.builder()
                                .putAdditionalProperty("campaign", JsonValue.from("bar"))
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
                )
                .build()

        val body = params._body()

        assertThat(body.message())
            .isEqualTo(
                InboundBulkMessage.builder()
                    .event("welcome-series")
                    .brand("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                    .content(ElementalContentSugar.builder().body("body").title("title").build())
                    .data(
                        InboundBulkMessage.Data.builder()
                            .putAdditionalProperty("campaign", JsonValue.from("bar"))
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BulkCreateJobParams.builder()
                .message(InboundBulkMessage.builder().event("welcome-series").build())
                .build()

        val body = params._body()

        assertThat(body.message())
            .isEqualTo(InboundBulkMessage.builder().event("welcome-series").build())
    }
}
