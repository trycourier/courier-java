// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.tenants.DefaultPreferences
import com.courier.models.tenants.SubscriptionTopicNew
import com.courier.models.tenants.TenantListParams
import com.courier.models.tenants.TenantListUsersParams
import com.courier.models.tenants.TenantUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TenantServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tenantServiceAsync = client.tenants()

        val tenantFuture = tenantServiceAsync.retrieve("tenant_id")

        val tenant = tenantFuture.get()
        tenant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tenantServiceAsync = client.tenants()

        val tenantFuture =
            tenantServiceAsync.update(
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

        val tenant = tenantFuture.get()
        tenant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tenantServiceAsync = client.tenants()

        val tenantsFuture =
            tenantServiceAsync.list(
                TenantListParams.builder()
                    .cursor("cursor")
                    .limit(0L)
                    .parentTenantId("parent_tenant_id")
                    .build()
            )

        val tenants = tenantsFuture.get()
        tenants.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tenantServiceAsync = client.tenants()

        val future = tenantServiceAsync.delete("tenant_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUsers() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tenantServiceAsync = client.tenants()

        val responseFuture =
            tenantServiceAsync.listUsers(
                TenantListUsersParams.builder()
                    .tenantId("tenant_id")
                    .cursor("cursor")
                    .limit(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
