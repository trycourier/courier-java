// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants.templates

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListParamsTest {

    @Test
    fun create() {
        TemplateListParams.builder().tenantId("tenant_id").cursor("cursor").limit(0L).build()
    }

    @Test
    fun pathParams() {
        val params = TemplateListParams.builder().tenantId("tenant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TemplateListParams.builder().tenantId("tenant_id").cursor("cursor").limit(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TemplateListParams.builder().tenantId("tenant_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
