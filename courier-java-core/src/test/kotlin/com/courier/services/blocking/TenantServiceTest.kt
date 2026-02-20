// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.tenants.DefaultPreferences
import com.courier.models.tenants.SubscriptionTopicNew
import com.courier.models.tenants.TenantListParams
import com.courier.models.tenants.TenantListUsersParams
import com.courier.models.tenants.TenantUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TenantServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val tenantService = client.tenants()

        val tenant = tenantService.retrieve("tenant_id")

        tenant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val tenantService = client.tenants()

        val tenant =
            tenantService.update(
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
            )

        tenant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val tenantService = client.tenants()

        val tenants =
            tenantService.list(
                TenantListParams.builder()
                    .cursor("cursor")
                    .limit(0L)
                    .parentTenantId("parent_tenant_id")
                    .build()
            )

        tenants.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val tenantService = client.tenants()

        tenantService.delete("tenant_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUsers() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val tenantService = client.tenants()

        val response =
            tenantService.listUsers(
                TenantListUsersParams.builder()
                    .tenantId("tenant_id")
                    .cursor("cursor")
                    .limit(0L)
                    .build()
            )

        response.validate()
    }
}
