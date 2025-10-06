// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.tenants.defaultpreferences.items.ChannelClassification
import com.courier.api.models.tenants.defaultpreferences.items.SubscriptionTopicNew
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantTest {

    @Test
    fun create() {
        val tenant =
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

        assertThat(tenant.id()).isEqualTo("id")
        assertThat(tenant.name()).isEqualTo("name")
        assertThat(tenant.brandId()).contains("brand_id")
        assertThat(tenant.defaultPreferences())
            .contains(
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
        assertThat(tenant.parentTenantId()).contains("parent_tenant_id")
        assertThat(tenant.properties())
            .contains(
                Tenant.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(tenant.userProfile())
            .contains(
                Tenant.UserProfile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenant =
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

        val roundtrippedTenant =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tenant), jacksonTypeRef<Tenant>())

        assertThat(roundtrippedTenant).isEqualTo(tenant)
    }
}
