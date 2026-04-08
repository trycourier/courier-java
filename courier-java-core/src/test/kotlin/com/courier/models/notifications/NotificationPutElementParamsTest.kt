// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPutElementParamsTest {

    @Test
    fun create() {
        NotificationPutElementParams.builder()
            .id("id")
            .elementId("elementId")
            .notificationElementPutRequest(
                NotificationElementPutRequest.builder()
                    .type("text")
                    .addChannel("string")
                    .data(
                        NotificationElementPutRequest.Data.builder()
                            .putAdditionalProperty("content", JsonValue.from("bar"))
                            .build()
                    )
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NotificationPutElementParams.builder()
                .id("id")
                .elementId("elementId")
                .notificationElementPutRequest(
                    NotificationElementPutRequest.builder().type("text").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("elementId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationPutElementParams.builder()
                .id("id")
                .elementId("elementId")
                .notificationElementPutRequest(
                    NotificationElementPutRequest.builder()
                        .type("text")
                        .addChannel("string")
                        .data(
                            NotificationElementPutRequest.Data.builder()
                                .putAdditionalProperty("content", JsonValue.from("bar"))
                                .build()
                        )
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .state(NotificationTemplateState.DRAFT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationElementPutRequest.builder()
                    .type("text")
                    .addChannel("string")
                    .data(
                        NotificationElementPutRequest.Data.builder()
                            .putAdditionalProperty("content", JsonValue.from("bar"))
                            .build()
                    )
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationPutElementParams.builder()
                .id("id")
                .elementId("elementId")
                .notificationElementPutRequest(
                    NotificationElementPutRequest.builder().type("text").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NotificationElementPutRequest.builder().type("text").build())
    }
}
