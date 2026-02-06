// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants.templates

import com.courier.models.tenants.PostTenantTemplatePublishRequest
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatePublishParamsTest {

    @Test
    fun create() {
        TemplatePublishParams.builder()
            .tenantId("tenant_id")
            .templateId("template_id")
            .postTenantTemplatePublishRequest(
                PostTenantTemplatePublishRequest.builder().version("version").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplatePublishParams.builder().tenantId("tenant_id").templateId("template_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        assertThat(params._pathParam(1)).isEqualTo("template_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplatePublishParams.builder()
                .tenantId("tenant_id")
                .templateId("template_id")
                .postTenantTemplatePublishRequest(
                    PostTenantTemplatePublishRequest.builder().version("version").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(PostTenantTemplatePublishRequest.builder().version("version").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplatePublishParams.builder().tenantId("tenant_id").templateId("template_id").build()

        val body = params._body().getOrNull()
    }
}
