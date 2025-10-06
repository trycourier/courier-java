// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.tenants.defaultpreferences.items.ChannelClassification
import com.courier.api.models.tenants.defaultpreferences.items.SubscriptionTopicNew
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantListResponseTest {

    @Test
    fun create() {
        val tenantListResponse =
            TenantListResponse.builder()
                .hasMore(true)
                .addItem(
                    Tenant.builder()
                        .id("id")
                        .name("name")
                        .brandId("brand_id")
                        .defaultPreferences(
                            DefaultPreferences.builder()
                                .addItem(
                                    DefaultPreferences.Item.builder()
                                        .status(SubscriptionTopicNew.Status.OPTED_OUT)
                                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                                        .hasCustomRouting(true)
                                        .id("id")
                                        .build()
                                )
                                .build()
                        )
                        .parentTenantId("parent_tenant_id")
                        .properties(
                            Tenant.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .userProfile(
                            Tenant.UserProfile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .type(TenantListResponse.Type.LIST)
                .url("url")
                .cursor("cursor")
                .nextUrl("next_url")
                .build()

        assertThat(tenantListResponse.hasMore()).isEqualTo(true)
        assertThat(tenantListResponse.items())
            .containsExactly(
                Tenant.builder()
                    .id("id")
                    .name("name")
                    .brandId("brand_id")
                    .defaultPreferences(
                        DefaultPreferences.builder()
                            .addItem(
                                DefaultPreferences.Item.builder()
                                    .status(SubscriptionTopicNew.Status.OPTED_OUT)
                                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                                    .hasCustomRouting(true)
                                    .id("id")
                                    .build()
                            )
                            .build()
                    )
                    .parentTenantId("parent_tenant_id")
                    .properties(
                        Tenant.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .userProfile(
                        Tenant.UserProfile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(tenantListResponse.type()).isEqualTo(TenantListResponse.Type.LIST)
        assertThat(tenantListResponse.url()).isEqualTo("url")
        assertThat(tenantListResponse.cursor()).contains("cursor")
        assertThat(tenantListResponse.nextUrl()).contains("next_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenantListResponse =
            TenantListResponse.builder()
                .hasMore(true)
                .addItem(
                    Tenant.builder()
                        .id("id")
                        .name("name")
                        .brandId("brand_id")
                        .defaultPreferences(
                            DefaultPreferences.builder()
                                .addItem(
                                    DefaultPreferences.Item.builder()
                                        .status(SubscriptionTopicNew.Status.OPTED_OUT)
                                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                                        .hasCustomRouting(true)
                                        .id("id")
                                        .build()
                                )
                                .build()
                        )
                        .parentTenantId("parent_tenant_id")
                        .properties(
                            Tenant.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .userProfile(
                            Tenant.UserProfile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .type(TenantListResponse.Type.LIST)
                .url("url")
                .cursor("cursor")
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
