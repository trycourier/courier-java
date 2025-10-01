// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantListParamsTest {

    @Test
    fun create() {
        TenantListParams.builder()
            .cursor("cursor")
            .limit(0L)
            .parentTenantId("parent_tenant_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TenantListParams.builder()
                .cursor("cursor")
                .limit(0L)
                .parentTenantId("parent_tenant_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "0")
                    .put("parent_tenant_id", "parent_tenant_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TenantListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
