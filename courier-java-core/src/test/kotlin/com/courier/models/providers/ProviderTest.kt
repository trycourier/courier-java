// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderTest {

    @Test
    fun create() {
        val provider =
            Provider.builder()
                .id("id")
                .created(0L)
                .provider("provider")
                .settings(
                    Provider.Settings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .title("title")
                .alias("alias")
                .updated(0L)
                .build()

        assertThat(provider.id()).isEqualTo("id")
        assertThat(provider.created()).isEqualTo(0L)
        assertThat(provider.provider()).isEqualTo("provider")
        assertThat(provider.settings())
            .isEqualTo(
                Provider.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(provider.title()).isEqualTo("title")
        assertThat(provider.alias()).contains("alias")
        assertThat(provider.updated()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val provider =
            Provider.builder()
                .id("id")
                .created(0L)
                .provider("provider")
                .settings(
                    Provider.Settings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .title("title")
                .alias("alias")
                .updated(0L)
                .build()

        val roundtrippedProvider =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(provider),
                jacksonTypeRef<Provider>(),
            )

        assertThat(roundtrippedProvider).isEqualTo(provider)
    }
}
