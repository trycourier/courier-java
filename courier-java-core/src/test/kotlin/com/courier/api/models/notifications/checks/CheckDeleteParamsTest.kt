// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications.checks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckDeleteParamsTest {

    @Test
    fun create() {
        CheckDeleteParams.builder().id("id").submissionId("submissionId").build()
    }

    @Test
    fun pathParams() {
        val params = CheckDeleteParams.builder().id("id").submissionId("submissionId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("submissionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
