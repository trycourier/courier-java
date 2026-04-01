// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderUpdateParamsTest {

    @Test
    fun create() {
        ProviderUpdateParams.builder()
            .id("id")
            .provider("provider")
            .alias("alias")
            .settings(
                ProviderUpdateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .title("title")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProviderUpdateParams.builder().id("id").provider("provider").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProviderUpdateParams.builder()
                .id("id")
                .provider("provider")
                .alias("alias")
                .settings(
                    ProviderUpdateParams.Settings.builder()
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
                ProviderUpdateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProviderUpdateParams.builder().id("id").provider("provider").build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("provider")
    }
}
