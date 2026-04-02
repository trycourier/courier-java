// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers.catalog

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.courier.models.providers.ProvidersCatalogEntry
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CatalogListResponseTest {

    @Test
    fun create() {
        val catalogListResponse =
            CatalogListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        assertThat(catalogListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(catalogListResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val catalogListResponse =
            CatalogListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        val roundtrippedCatalogListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(catalogListResponse),
                jacksonTypeRef<CatalogListResponse>(),
            )

        assertThat(roundtrippedCatalogListResponse).isEqualTo(catalogListResponse)
    }
}
