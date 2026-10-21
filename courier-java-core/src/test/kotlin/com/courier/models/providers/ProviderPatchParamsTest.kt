// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderPatchParamsTest {

    @Test
    fun create() {
        ProviderPatchParams.builder()
            .id("id")
            .alias("alias")
            .provider("provider")
            .settings(
                ProviderPatchParams.Settings.builder()
                    .putAdditionalProperty("api_key", JsonValue.from("bar"))
                    .build()
            )
            .title("Production SendGrid")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProviderPatchParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProviderPatchParams.builder()
                .id("id")
                .alias("alias")
                .provider("provider")
                .settings(
                    ProviderPatchParams.Settings.builder()
                        .putAdditionalProperty("api_key", JsonValue.from("bar"))
                        .build()
                )
                .title("Production SendGrid")
                .build()

        val body = params._body()

        assertThat(body.alias()).contains("alias")
        assertThat(body.provider()).contains("provider")
        assertThat(body.settings())
            .contains(
                ProviderPatchParams.Settings.builder()
                    .putAdditionalProperty("api_key", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.title()).contains("Production SendGrid")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProviderPatchParams.builder().id("id").build()

        val body = params._body()
    }
}
