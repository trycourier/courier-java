// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveParamsTest {

    @Test
    fun create() {
        RunRetrieveParams.builder().runId("x").build()
    }

    @Test
    fun pathParams() {
        val params = RunRetrieveParams.builder().runId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
