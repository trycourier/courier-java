// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications.draft

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftRetrieveContentParamsTest {

    @Test
    fun create() {
        DraftRetrieveContentParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = DraftRetrieveContentParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
