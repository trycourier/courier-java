// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListParamsTest {

    @Test
    fun create() {
        BrandListParams.builder().cursor("cursor").build()
    }

    @Test
    fun queryParams() {
        val params = BrandListParams.builder().cursor("cursor").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("cursor", "cursor").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
