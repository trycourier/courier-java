// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListParamsTest {

    @Test
    fun create() {
        RunListParams.builder().id("id").cursor("cursor").limit(1L).build()
    }

    @Test
    fun pathParams() {
        val params = RunListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = RunListParams.builder().id("id").cursor("cursor").limit(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RunListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
