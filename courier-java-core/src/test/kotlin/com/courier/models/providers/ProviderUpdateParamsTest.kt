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
            .provider("sendgrid")
            .alias("alias")
            .settings(
                ProviderUpdateParams.Settings.builder()
                    .putAdditionalProperty("api_key", JsonValue.from("bar"))
                    .build()
            )
            .title("Production SendGrid")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProviderUpdateParams.builder().id("id").provider("sendgrid").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProviderUpdateParams.builder()
                .id("id")
                .provider("sendgrid")
                .alias("alias")
                .settings(
                    ProviderUpdateParams.Settings.builder()
                        .putAdditionalProperty("api_key", JsonValue.from("bar"))
                        .build()
                )
                .title("Production SendGrid")
                .build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("sendgrid")
        assertThat(body.alias()).contains("alias")
        assertThat(body.settings())
            .contains(
                ProviderUpdateParams.Settings.builder()
                    .putAdditionalProperty("api_key", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.title()).contains("Production SendGrid")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProviderUpdateParams.builder().id("id").provider("sendgrid").build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("sendgrid")
    }
}
