// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProvidersCatalogEntryTest {

    @Test
    fun create() {
        val providersCatalogEntry =
            ProvidersCatalogEntry.builder()
                .channel("channel")
                .description("description")
                .name("name")
                .provider("provider")
                .settings(
                    ProvidersCatalogEntry.Settings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "required" to true,
                                    "type" to "type",
                                    "values" to listOf("string"),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(providersCatalogEntry.channel()).isEqualTo("channel")
        assertThat(providersCatalogEntry.description()).isEqualTo("description")
        assertThat(providersCatalogEntry.name()).isEqualTo("name")
        assertThat(providersCatalogEntry.provider()).isEqualTo("provider")
        assertThat(providersCatalogEntry.settings())
            .isEqualTo(
                ProvidersCatalogEntry.Settings.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "required" to true,
                                "type" to "type",
                                "values" to listOf("string"),
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val providersCatalogEntry =
            ProvidersCatalogEntry.builder()
                .channel("channel")
                .description("description")
                .name("name")
                .provider("provider")
                .settings(
                    ProvidersCatalogEntry.Settings.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "required" to true,
                                    "type" to "type",
                                    "values" to listOf("string"),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedProvidersCatalogEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providersCatalogEntry),
                jacksonTypeRef<ProvidersCatalogEntry>(),
            )

        assertThat(roundtrippedProvidersCatalogEntry).isEqualTo(providersCatalogEntry)
    }
}
