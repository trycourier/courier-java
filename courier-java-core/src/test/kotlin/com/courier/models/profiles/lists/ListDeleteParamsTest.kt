// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListDeleteParamsTest {

    @Test
    fun create() {
        ListDeleteParams.builder().userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params = ListDeleteParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
