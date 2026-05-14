// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyPublishParamsTest {

    @Test
    fun create() {
        JourneyPublishParams.builder()
            .templateId("x")
            .journeyPublishRequest(JourneyPublishRequest.builder().version("v321669910225").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = JourneyPublishParams.builder().templateId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            JourneyPublishParams.builder()
                .templateId("x")
                .journeyPublishRequest(
                    JourneyPublishRequest.builder().version("v321669910225").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo(JourneyPublishRequest.builder().version("v321669910225").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = JourneyPublishParams.builder().templateId("x").build()

        val body = params._body().getOrNull()
    }
}
