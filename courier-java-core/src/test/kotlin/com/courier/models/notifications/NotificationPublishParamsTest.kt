// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPublishParamsTest {

    @Test
    fun create() {
        NotificationPublishParams.builder()
            .id("id")
            .notificationTemplatePublishRequest(
                NotificationTemplatePublishRequest.builder().version("v321669910225").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = NotificationPublishParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationPublishParams.builder()
                .id("id")
                .notificationTemplatePublishRequest(
                    NotificationTemplatePublishRequest.builder().version("v321669910225").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
                NotificationTemplatePublishRequest.builder().version("v321669910225").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = NotificationPublishParams.builder().id("id").build()

        val body = params._body().getOrNull()
    }
}
