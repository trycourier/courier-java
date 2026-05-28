// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyRetrieveParamsTest {

    @Test
    fun create() {
        JourneyRetrieveParams.builder().templateId("x").version("published").build()
    }

    @Test
    fun pathParams() {
        val params = JourneyRetrieveParams.builder().templateId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = JourneyRetrieveParams.builder().templateId("x").version("published").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("version", "published").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JourneyRetrieveParams.builder().templateId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
