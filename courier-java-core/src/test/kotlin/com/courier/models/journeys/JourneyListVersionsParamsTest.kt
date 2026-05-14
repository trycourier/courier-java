// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyListVersionsParamsTest {

    @Test
    fun create() {
        JourneyListVersionsParams.builder().templateId("x").build()
    }

    @Test
    fun pathParams() {
        val params = JourneyListVersionsParams.builder().templateId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
