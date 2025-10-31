// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantAssociationTest {

    @Test
    fun create() {
        val tenantAssociation =
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

        assertThat(tenantAssociation.tenantId()).isEqualTo("tenant_id")
        assertThat(tenantAssociation.profile())
            .contains(
                TenantAssociation.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(tenantAssociation.type()).contains(TenantAssociation.Type.USER)
        assertThat(tenantAssociation.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenantAssociation =
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

        val roundtrippedTenantAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenantAssociation),
                jacksonTypeRef<TenantAssociation>(),
            )

        assertThat(roundtrippedTenantAssociation).isEqualTo(tenantAssociation)
    }
}
