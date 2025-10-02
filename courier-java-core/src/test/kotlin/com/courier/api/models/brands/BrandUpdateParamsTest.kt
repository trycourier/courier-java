// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateParamsTest {

    @Test
    fun create() {
        BrandUpdateParams.builder()
            .brandId("brand_id")
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
    fun pathParams() {
        val params = BrandUpdateParams.builder().brandId("brand_id").name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("brand_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BrandUpdateParams.builder()
                .brandId("brand_id")
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
            .contains(
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
        val params = BrandUpdateParams.builder().brandId("brand_id").name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
