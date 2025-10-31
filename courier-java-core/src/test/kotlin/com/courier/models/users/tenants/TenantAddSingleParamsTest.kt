// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tenants

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantAddSingleParamsTest {

    @Test
    fun create() {
        TenantAddSingleParams.builder()
            .userId("user_id")
            .tenantId("tenant_id")
            .profile(
                TenantAddSingleParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = TenantAddSingleParams.builder().userId("user_id").tenantId("tenant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("tenant_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TenantAddSingleParams.builder()
                .userId("user_id")
                .tenantId("tenant_id")
                .profile(
                    TenantAddSingleParams.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.profile())
            .contains(
                TenantAddSingleParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TenantAddSingleParams.builder().userId("user_id").tenantId("tenant_id").build()

        val body = params._body()
    }
}
