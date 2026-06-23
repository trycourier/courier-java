// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.models.notifications.NotificationLocalePutRequest
import com.courier.models.notifications.NotificationTemplateState
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatePutLocaleParamsTest {

    @Test
    fun create() {
        TemplatePutLocaleParams.builder()
            .templateId("x")
            .notificationId("x")
            .localeId("x")
            .notificationLocalePutRequest(
                NotificationLocalePutRequest.builder()
                    .addElement(NotificationLocalePutRequest.Element.builder().id("elem_1").build())
                    .addElement(NotificationLocalePutRequest.Element.builder().id("elem_2").build())
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplatePutLocaleParams.builder()
                .templateId("x")
                .notificationId("x")
                .localeId("x")
                .notificationLocalePutRequest(
                    NotificationLocalePutRequest.builder()
                        .addElement(
                            NotificationLocalePutRequest.Element.builder().id("elem_1").build()
                        )
                        .addElement(
                            NotificationLocalePutRequest.Element.builder().id("elem_2").build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        assertThat(params._pathParam(2)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplatePutLocaleParams.builder()
                .templateId("x")
                .notificationId("x")
                .localeId("x")
                .notificationLocalePutRequest(
                    NotificationLocalePutRequest.builder()
                        .addElement(
                            NotificationLocalePutRequest.Element.builder().id("elem_1").build()
                        )
                        .addElement(
                            NotificationLocalePutRequest.Element.builder().id("elem_2").build()
                        )
                        .state(NotificationTemplateState.DRAFT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationLocalePutRequest.builder()
                    .addElement(NotificationLocalePutRequest.Element.builder().id("elem_1").build())
                    .addElement(NotificationLocalePutRequest.Element.builder().id("elem_2").build())
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplatePutLocaleParams.builder()
                .templateId("x")
                .notificationId("x")
                .localeId("x")
                .notificationLocalePutRequest(
                    NotificationLocalePutRequest.builder()
                        .addElement(
                            NotificationLocalePutRequest.Element.builder().id("elem_1").build()
                        )
                        .addElement(
                            NotificationLocalePutRequest.Element.builder().id("elem_2").build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationLocalePutRequest.builder()
                    .addElement(NotificationLocalePutRequest.Element.builder().id("elem_1").build())
                    .addElement(NotificationLocalePutRequest.Element.builder().id("elem_2").build())
                    .build()
            )
    }
}
