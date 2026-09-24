// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveParamsTest {

    @Test
    fun create() {
        RunRetrieveParams.builder().id("id").previewRunId("previewRunId").build()
    }

    @Test
    fun pathParams() {
        val params = RunRetrieveParams.builder().id("id").previewRunId("previewRunId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("previewRunId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
