// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles.lists

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRetrieveParamsTest {

    @Test
    fun create() {
        ListRetrieveParams.builder().userId("user_id").cursor("cursor").build()
    }

    @Test
    fun pathParams() {
        val params = ListRetrieveParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ListRetrieveParams.builder().userId("user_id").cursor("cursor").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("cursor", "cursor").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListRetrieveParams.builder().userId("user_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
