// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderCreateParamsTest {

    @Test
    fun create() {
        ProviderCreateParams.builder()
            .provider("provider")
            .alias("alias")
            .settings(
                ProviderCreateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .title("title")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProviderCreateParams.builder()
                .provider("provider")
                .alias("alias")
                .settings(
                    ProviderCreateParams.Settings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("provider")
        assertThat(body.alias()).contains("alias")
        assertThat(body.settings())
            .contains(
                ProviderCreateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProviderCreateParams.builder().provider("provider").build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("provider")
    }
}
