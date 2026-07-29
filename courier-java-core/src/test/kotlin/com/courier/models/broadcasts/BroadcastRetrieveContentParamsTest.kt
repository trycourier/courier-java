// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastRetrieveContentParamsTest {

    @Test
    fun create() {
        BroadcastRetrieveContentParams.builder()
            .broadcastId("broadcastId")
            .version("version")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BroadcastRetrieveContentParams.builder().broadcastId("broadcastId").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BroadcastRetrieveContentParams.builder()
                .broadcastId("broadcastId")
                .version("version")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("version", "version").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BroadcastRetrieveContentParams.builder().broadcastId("broadcastId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
