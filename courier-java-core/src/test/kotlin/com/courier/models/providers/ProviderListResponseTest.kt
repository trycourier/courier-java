// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderListResponseTest {

    @Test
    fun create() {
        val providerListResponse =
            ProviderListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        assertThat(providerListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(providerListResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val providerListResponse =
            ProviderListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        val roundtrippedProviderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providerListResponse),
                jacksonTypeRef<ProviderListResponse>(),
            )

        assertThat(roundtrippedProviderListResponse).isEqualTo(providerListResponse)
    }
}
