// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tenants

import com.courier.core.JsonValue
import com.courier.models.tenants.TenantAssociation
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantAddMultipleParamsTest {

    @Test
    fun create() {
        TenantAddMultipleParams.builder()
            .userId("user_id")
            .addTenant(
                TenantAssociation.builder()
                    .tenantId("tenant_id")
                    .profile(
                        TenantAssociation.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(TenantAssociation.Type.USER)
                    .userId("user_id")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TenantAddMultipleParams.builder()
                .userId("user_id")
                .addTenant(TenantAssociation.builder().tenantId("tenant_id").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TenantAddMultipleParams.builder()
                .userId("user_id")
                .addTenant(
                    TenantAssociation.builder()
                        .tenantId("tenant_id")
                        .profile(
                            TenantAssociation.Profile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(TenantAssociation.Type.USER)
                        .userId("user_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.tenants())
            .containsExactly(
                TenantAssociation.builder()
                    .tenantId("tenant_id")
                    .profile(
                        TenantAssociation.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(TenantAssociation.Type.USER)
                    .userId("user_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TenantAddMultipleParams.builder()
                .userId("user_id")
                .addTenant(TenantAssociation.builder().tenantId("tenant_id").build())
                .build()

        val body = params._body()

        assertThat(body.tenants())
            .containsExactly(TenantAssociation.builder().tenantId("tenant_id").build())
    }
}
