// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPutLocaleParamsTest {

    @Test
    fun create() {
        NotificationPutLocaleParams.builder()
            .id("id")
            .localeId("localeId")
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
            NotificationPutLocaleParams.builder()
                .id("id")
                .localeId("localeId")
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

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("localeId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationPutLocaleParams.builder()
                .id("id")
                .localeId("localeId")
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
            NotificationPutLocaleParams.builder()
                .id("id")
                .localeId("localeId")
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
