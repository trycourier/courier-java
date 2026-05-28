// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveParamsTest {

    @Test
    fun create() {
        TemplateRetrieveParams.builder().templateId("x").notificationId("x").build()
    }

    @Test
    fun pathParams() {
        val params = TemplateRetrieveParams.builder().templateId("x").notificationId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
