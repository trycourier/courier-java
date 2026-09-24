// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewRetrieveDeviceSetParamsTest {

    @Test
    fun create() {
        PreviewRetrieveDeviceSetParams.builder().deviceSetId("deviceSetId").build()
    }

    @Test
    fun pathParams() {
        val params = PreviewRetrieveDeviceSetParams.builder().deviceSetId("deviceSetId").build()

        assertThat(params._pathParam(0)).isEqualTo("deviceSetId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
