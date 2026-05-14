// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.models.journeys.JourneyTemplatePublishRequest
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatePublishParamsTest {

    @Test
    fun create() {
        TemplatePublishParams.builder()
            .templateId("x")
            .notificationId("x")
            .journeyTemplatePublishRequest(
                JourneyTemplatePublishRequest.builder().version("v321669910225").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = TemplatePublishParams.builder().templateId("x").notificationId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplatePublishParams.builder()
                .templateId("x")
                .notificationId("x")
                .journeyTemplatePublishRequest(
                    JourneyTemplatePublishRequest.builder().version("v321669910225").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(JourneyTemplatePublishRequest.builder().version("v321669910225").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TemplatePublishParams.builder().templateId("x").notificationId("x").build()

        val body = params._body().getOrNull()
    }
}
