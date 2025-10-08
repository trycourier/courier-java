// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceRetrieveParamsTest {

    @Test
    fun create() {
        PreferenceRetrieveParams.builder().userId("user_id").tenantId("tenant_id").build()
    }

    @Test
    fun pathParams() {
        val params = PreferenceRetrieveParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PreferenceRetrieveParams.builder().userId("user_id").tenantId("tenant_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("tenant_id", "tenant_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PreferenceRetrieveParams.builder().userId("user_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
