// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tenants

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.tenants.TenantAssociation
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantListResponseTest {

    @Test
    fun create() {
        val tenantListResponse =
            TenantListResponse.builder()
                .hasMore(true)
                .type(TenantListResponse.Type.LIST)
                .url("url")
                .cursor("cursor")
                .addItem(
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
                .nextUrl("next_url")
                .build()

        assertThat(tenantListResponse.hasMore()).isEqualTo(true)
        assertThat(tenantListResponse.type()).isEqualTo(TenantListResponse.Type.LIST)
        assertThat(tenantListResponse.url()).isEqualTo("url")
        assertThat(tenantListResponse.cursor()).contains("cursor")
        assertThat(tenantListResponse.items().getOrNull())
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
        assertThat(tenantListResponse.nextUrl()).contains("next_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenantListResponse =
            TenantListResponse.builder()
                .hasMore(true)
                .type(TenantListResponse.Type.LIST)
                .url("url")
                .cursor("cursor")
                .addItem(
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
                .nextUrl("next_url")
                .build()

        val roundtrippedTenantListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenantListResponse),
                jacksonTypeRef<TenantListResponse>(),
            )

        assertThat(roundtrippedTenantListResponse).isEqualTo(tenantListResponse)
    }
}
