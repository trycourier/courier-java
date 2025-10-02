// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandCreateParamsTest {

    @Test
    fun create() {
        BrandCreateParams.builder()
            .name("name")
            .settings(
                BrandSettings.builder()
                    .colors(
                        BrandColors.builder()
                            .primary("primary")
                            .secondary("secondary")
                            .tertiary("tertiary")
                            .build()
                    )
                    .email(
                        Email.builder()
                            .footer(JsonValue.from(mapOf<String, Any>()))
                            .header(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .inapp(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .id("id")
            .snippets(
                BrandSnippets.builder()
                    .addItem(
                        BrandSnippet.builder()
                            .format(BrandSnippet.Format.HANDLEBARS)
                            .name("name")
                            .value("value")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BrandCreateParams.builder()
                .name("name")
                .settings(
                    BrandSettings.builder()
                        .colors(
                            BrandColors.builder()
                                .primary("primary")
                                .secondary("secondary")
                                .tertiary("tertiary")
                                .build()
                        )
                        .email(
                            Email.builder()
                                .footer(JsonValue.from(mapOf<String, Any>()))
                                .header(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .inapp(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .id("id")
                .snippets(
                    BrandSnippets.builder()
                        .addItem(
                            BrandSnippet.builder()
                                .format(BrandSnippet.Format.HANDLEBARS)
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.settings())
            .isEqualTo(
                BrandSettings.builder()
                    .colors(
                        BrandColors.builder()
                            .primary("primary")
                            .secondary("secondary")
                            .tertiary("tertiary")
                            .build()
                    )
                    .email(
                        Email.builder()
                            .footer(JsonValue.from(mapOf<String, Any>()))
                            .header(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .inapp(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(body.id()).contains("id")
        assertThat(body.snippets())
            .contains(
                BrandSnippets.builder()
                    .addItem(
                        BrandSnippet.builder()
                            .format(BrandSnippet.Format.HANDLEBARS)
                            .name("name")
                            .value("value")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BrandCreateParams.builder()
                .name("name")
                .settings(BrandSettings.builder().build())
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.settings()).isEqualTo(BrandSettings.builder().build())
    }
}
