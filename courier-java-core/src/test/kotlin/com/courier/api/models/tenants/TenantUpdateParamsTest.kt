// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants

import com.courier.api.core.JsonValue
import com.courier.api.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantUpdateParamsTest {

    @Test
    fun create() {
        TenantUpdateParams.builder()
            .tenantId("tenant_id")
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
                TenantUpdateParams.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .userProfile(
                TenantUpdateParams.UserProfile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = TenantUpdateParams.builder().tenantId("tenant_id").name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TenantUpdateParams.builder()
                .tenantId("tenant_id")
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
                    TenantUpdateParams.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .userProfile(
                    TenantUpdateParams.UserProfile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.brandId()).contains("brand_id")
        assertThat(body.defaultPreferences())
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
        assertThat(body.parentTenantId()).contains("parent_tenant_id")
        assertThat(body.properties())
            .contains(
                TenantUpdateParams.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.userProfile())
            .contains(
                TenantUpdateParams.UserProfile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TenantUpdateParams.builder().tenantId("tenant_id").name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
