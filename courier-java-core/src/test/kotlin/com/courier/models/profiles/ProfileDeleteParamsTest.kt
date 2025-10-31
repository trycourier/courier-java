// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileDeleteParamsTest {

    @Test
    fun create() {
        ProfileDeleteParams.builder().userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params = ProfileDeleteParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
