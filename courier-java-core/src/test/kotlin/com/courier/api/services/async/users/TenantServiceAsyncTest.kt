// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.users

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.TenantAssociation
import com.courier.api.models.users.tenants.TenantAddMultipleParams
import com.courier.api.models.users.tenants.TenantAddSingleParams
import com.courier.api.models.users.tenants.TenantListParams
import com.courier.api.models.users.tenants.TenantRemoveSingleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TenantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantServiceAsync = client.users().tenants()

        val tenantsFuture =
            tenantServiceAsync.list(
                TenantListParams.builder().userId("user_id").cursor("cursor").limit(0L).build()
            )

        val tenants = tenantsFuture.get()
        tenants.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMultiple() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantServiceAsync = client.users().tenants()

        val future =
            tenantServiceAsync.addMultiple(
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
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addSingle() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantServiceAsync = client.users().tenants()

        val future =
            tenantServiceAsync.addSingle(
                TenantAddSingleParams.builder()
                    .userId("user_id")
                    .tenantId("tenant_id")
                    .profile(
                        TenantAddSingleParams.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeAll() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantServiceAsync = client.users().tenants()

        val future = tenantServiceAsync.removeAll("user_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeSingle() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantServiceAsync = client.users().tenants()

        val future =
            tenantServiceAsync.removeSingle(
                TenantRemoveSingleParams.builder().userId("user_id").tenantId("tenant_id").build()
            )

        val response = future.get()
    }
}
