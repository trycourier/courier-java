// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tenants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantRemoveSingleParamsTest {

    @Test
    fun create() {
        TenantRemoveSingleParams.builder().userId("user_id").tenantId("tenant_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            TenantRemoveSingleParams.builder().userId("user_id").tenantId("tenant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("tenant_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
