// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandTest {

    @Test
    fun create() {
        val brand =
            Brand.builder()
                .created(0L)
                .name("name")
                .published(0L)
                .settings(
                    BrandSettings.builder()
                        .colors(
                            BrandSettings.Colors.builder()
                                .primary("primary")
                                .secondary("secondary")
                                .tertiary("tertiary")
                                .build()
                        )
                        .email(
                            BrandSettings.Email.builder()
                                .footer(JsonValue.from(mapOf<String, Any>()))
                                .header(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .inapp(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .updated(0L)
                .version("version")
                .id("id")
                .snippets(
                    BrandSnippets.builder()
                        .addItem(
                            BrandSnippets.Item.builder()
                                .format(BrandSnippets.Item.Format.HANDLEBARS)
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(brand.created()).isEqualTo(0L)
        assertThat(brand.name()).isEqualTo("name")
        assertThat(brand.published()).isEqualTo(0L)
        assertThat(brand.settings())
            .isEqualTo(
                BrandSettings.builder()
                    .colors(
                        BrandSettings.Colors.builder()
                            .primary("primary")
                            .secondary("secondary")
                            .tertiary("tertiary")
                            .build()
                    )
                    .email(
                        BrandSettings.Email.builder()
                            .footer(JsonValue.from(mapOf<String, Any>()))
                            .header(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .inapp(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(brand.updated()).isEqualTo(0L)
        assertThat(brand.version()).isEqualTo("version")
        assertThat(brand.id()).contains("id")
        assertThat(brand.snippets())
            .contains(
                BrandSnippets.builder()
                    .addItem(
                        BrandSnippets.Item.builder()
                            .format(BrandSnippets.Item.Format.HANDLEBARS)
                            .name("name")
                            .value("value")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brand =
            Brand.builder()
                .created(0L)
                .name("name")
                .published(0L)
                .settings(
                    BrandSettings.builder()
                        .colors(
                            BrandSettings.Colors.builder()
                                .primary("primary")
                                .secondary("secondary")
                                .tertiary("tertiary")
                                .build()
                        )
                        .email(
                            BrandSettings.Email.builder()
                                .footer(JsonValue.from(mapOf<String, Any>()))
                                .header(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .inapp(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .updated(0L)
                .version("version")
                .id("id")
                .snippets(
                    BrandSnippets.builder()
                        .addItem(
                            BrandSnippets.Item.builder()
                                .format(BrandSnippets.Item.Format.HANDLEBARS)
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBrand =
            jsonMapper.readValue(jsonMapper.writeValueAsString(brand), jacksonTypeRef<Brand>())

        assertThat(roundtrippedBrand).isEqualTo(brand)
    }
}
