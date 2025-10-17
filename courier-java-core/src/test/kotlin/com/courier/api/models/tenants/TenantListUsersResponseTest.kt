// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantListUsersResponseTest {

    @Test
    fun create() {
        val tenantListUsersResponse =
            TenantListUsersResponse.builder()
                .hasMore(true)
                .type(TenantListUsersResponse.Type.LIST)
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

        assertThat(tenantListUsersResponse.hasMore()).isEqualTo(true)
        assertThat(tenantListUsersResponse.type()).isEqualTo(TenantListUsersResponse.Type.LIST)
        assertThat(tenantListUsersResponse.url()).isEqualTo("url")
        assertThat(tenantListUsersResponse.cursor()).contains("cursor")
        assertThat(tenantListUsersResponse.items().getOrNull())
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
        assertThat(tenantListUsersResponse.nextUrl()).contains("next_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenantListUsersResponse =
            TenantListUsersResponse.builder()
                .hasMore(true)
                .type(TenantListUsersResponse.Type.LIST)
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

        val roundtrippedTenantListUsersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenantListUsersResponse),
                jacksonTypeRef<TenantListUsersResponse>(),
            )

        assertThat(roundtrippedTenantListUsersResponse).isEqualTo(tenantListUsersResponse)
    }
}
