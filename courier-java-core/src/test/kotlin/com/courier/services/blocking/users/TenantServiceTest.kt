// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.tenants.TenantAssociation
import com.courier.models.users.tenants.TenantAddMultipleParams
import com.courier.models.users.tenants.TenantAddSingleParams
import com.courier.models.users.tenants.TenantListParams
import com.courier.models.users.tenants.TenantRemoveSingleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TenantServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.users().tenants()

        val tenants =
            tenantService.list(
                TenantListParams.builder().userId("user_id").cursor("cursor").limit(0L).build()
            )

        tenants.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMultiple() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.users().tenants()

        tenantService.addMultiple(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addSingle() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.users().tenants()

        tenantService.addSingle(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeAll() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.users().tenants()

        tenantService.removeAll("user_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeSingle() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tenantService = client.users().tenants()

        tenantService.removeSingle(
            TenantRemoveSingleParams.builder().userId("user_id").tenantId("tenant_id").build()
        )
    }
}
