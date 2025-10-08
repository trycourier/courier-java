// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveParamsTest {

    @Test
    fun create() {
        TemplateRetrieveParams.builder().tenantId("tenant_id").templateId("template_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateRetrieveParams.builder().tenantId("tenant_id").templateId("template_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        assertThat(params._pathParam(1)).isEqualTo("template_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
