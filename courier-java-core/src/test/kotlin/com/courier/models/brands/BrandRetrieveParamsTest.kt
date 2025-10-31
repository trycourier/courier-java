// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveParamsTest {

    @Test
    fun create() {
        BrandRetrieveParams.builder().brandId("brand_id").build()
    }

    @Test
    fun pathParams() {
        val params = BrandRetrieveParams.builder().brandId("brand_id").build()

        assertThat(params._pathParam(0)).isEqualTo("brand_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
