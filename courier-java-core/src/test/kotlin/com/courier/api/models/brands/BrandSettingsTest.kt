// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSettingsTest {

    @Test
    fun create() {
        val brandSettings =
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

        assertThat(brandSettings.colors())
            .contains(
                BrandSettings.Colors.builder()
                    .primary("primary")
                    .secondary("secondary")
                    .tertiary("tertiary")
                    .build()
            )
        assertThat(brandSettings.email())
            .contains(
                BrandSettings.Email.builder()
                    .footer(JsonValue.from(mapOf<String, Any>()))
                    .header(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(brandSettings._inapp()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSettings =
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

        val roundtrippedBrandSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSettings),
                jacksonTypeRef<BrandSettings>(),
            )

        assertThat(roundtrippedBrandSettings).isEqualTo(brandSettings)
    }
}
