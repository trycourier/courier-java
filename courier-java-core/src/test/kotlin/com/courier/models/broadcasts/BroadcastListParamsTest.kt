// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastListParamsTest {

    @Test
    fun create() {
        BroadcastListParams.builder().cursor("cursor").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params = BroadcastListParams.builder().cursor("cursor").limit(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BroadcastListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
