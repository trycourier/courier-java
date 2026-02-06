// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants.templates.versions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionRetrieveParamsTest {

    @Test
    fun create() {
        VersionRetrieveParams.builder()
            .tenantId("tenant_id")
            .templateId("template_id")
            .version("version")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VersionRetrieveParams.builder()
                .tenantId("tenant_id")
                .templateId("template_id")
                .version("version")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        assertThat(params._pathParam(1)).isEqualTo("template_id")
        assertThat(params._pathParam(2)).isEqualTo("version")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
