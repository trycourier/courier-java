// File generated from our OpenAPI spec by Stainless.

package com.courier.models.requests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestArchiveParamsTest {

    @Test
    fun create() {
        RequestArchiveParams.builder().requestId("request_id").build()
    }

    @Test
    fun pathParams() {
        val params = RequestArchiveParams.builder().requestId("request_id").build()

        assertThat(params._pathParam(0)).isEqualTo("request_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
