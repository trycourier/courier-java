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
            .addPatch(
                ProviderPatchParams.Patch.builder()
                    .op(ProviderPatchParams.Patch.Op.REPLACE)
                    .path("/title")
                    .from("from")
                    .value(JsonValue.from("Production SendGrid"))
                    .build()
            )
            .addPatch(
                ProviderPatchParams.Patch.builder()
                    .op(ProviderPatchParams.Patch.Op.REPLACE)
                    .path("/settings/api_key")
                    .from("from")
                    .value(JsonValue.from("SG.xxxxxxxx"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProviderPatchParams.builder()
                .id("id")
                .addPatch(
                    ProviderPatchParams.Patch.builder()
                        .op(ProviderPatchParams.Patch.Op.REPLACE)
                        .path("/title")
                        .build()
                )
                .addPatch(
                    ProviderPatchParams.Patch.builder()
                        .op(ProviderPatchParams.Patch.Op.REPLACE)
                        .path("/settings/api_key")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProviderPatchParams.builder()
                .id("id")
                .addPatch(
                    ProviderPatchParams.Patch.builder()
                        .op(ProviderPatchParams.Patch.Op.REPLACE)
                        .path("/title")
                        .from("from")
                        .value(JsonValue.from("Production SendGrid"))
                        .build()
                )
                .addPatch(
                    ProviderPatchParams.Patch.builder()
                        .op(ProviderPatchParams.Patch.Op.REPLACE)
                        .path("/settings/api_key")
                        .from("from")
                        .value(JsonValue.from("SG.xxxxxxxx"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(
                ProviderPatchParams.Patch.builder()
                    .op(ProviderPatchParams.Patch.Op.REPLACE)
                    .path("/title")
                    .from("from")
                    .value(JsonValue.from("Production SendGrid"))
                    .build(),
                ProviderPatchParams.Patch.builder()
                    .op(ProviderPatchParams.Patch.Op.REPLACE)
                    .path("/settings/api_key")
                    .from("from")
                    .value(JsonValue.from("SG.xxxxxxxx"))
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProviderPatchParams.builder()
                .id("id")
                .addPatch(
                    ProviderPatchParams.Patch.builder()
                        .op(ProviderPatchParams.Patch.Op.REPLACE)
                        .path("/title")
                        .build()
                )
                .addPatch(
                    ProviderPatchParams.Patch.builder()
                        .op(ProviderPatchParams.Patch.Op.REPLACE)
                        .path("/settings/api_key")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(
                ProviderPatchParams.Patch.builder()
                    .op(ProviderPatchParams.Patch.Op.REPLACE)
                    .path("/title")
                    .build(),
                ProviderPatchParams.Patch.builder()
                    .op(ProviderPatchParams.Patch.Op.REPLACE)
                    .path("/settings/api_key")
                    .build(),
            )
    }
}
