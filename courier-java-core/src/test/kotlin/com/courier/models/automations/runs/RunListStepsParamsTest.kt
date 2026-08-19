// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListStepsParamsTest {

    @Test
    fun create() {
        RunListStepsParams.builder().id("x").build()
    }

    @Test
    fun pathParams() {
        val params = RunListStepsParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
