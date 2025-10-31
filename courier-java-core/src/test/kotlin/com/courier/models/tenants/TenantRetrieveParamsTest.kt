// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantRetrieveParamsTest {

    @Test
    fun create() {
        TenantRetrieveParams.builder().tenantId("tenant_id").build()
    }

    @Test
    fun pathParams() {
        val params = TenantRetrieveParams.builder().tenantId("tenant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
