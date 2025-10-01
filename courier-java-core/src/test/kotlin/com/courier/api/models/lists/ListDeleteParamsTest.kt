// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListDeleteParamsTest {

    @Test
    fun create() {
        ListDeleteParams.builder().listId("list_id").build()
    }

    @Test
    fun pathParams() {
        val params = ListDeleteParams.builder().listId("list_id").build()

        assertThat(params._pathParam(0)).isEqualTo("list_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
