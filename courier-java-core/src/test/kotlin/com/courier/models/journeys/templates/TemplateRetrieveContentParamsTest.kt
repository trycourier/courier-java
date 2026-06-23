// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveContentParamsTest {

    @Test
    fun create() {
        TemplateRetrieveContentParams.builder()
            .templateId("x")
            .notificationId("x")
            .version("version")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateRetrieveContentParams.builder().templateId("x").notificationId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TemplateRetrieveContentParams.builder()
                .templateId("x")
                .notificationId("x")
                .version("version")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("version", "version").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TemplateRetrieveContentParams.builder().templateId("x").notificationId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
