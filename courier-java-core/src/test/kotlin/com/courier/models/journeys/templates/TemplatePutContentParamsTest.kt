// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.notifications.NotificationContentPutRequest
import com.courier.models.notifications.NotificationTemplateState
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatePutContentParamsTest {

    @Test
    fun create() {
        TemplatePutContentParams.builder()
            .templateId("x")
            .notificationId("x")
            .notificationContentPutRequest(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(
                                ElementalChannelNodeWithType.builder()
                                    .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                    .build()
                            )
                            .version("2022-01-01")
                            .build()
                    )
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplatePutContentParams.builder()
                .templateId("x")
                .notificationId("x")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(ElementalTextNodeWithType.builder().build())
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplatePutContentParams.builder()
                .templateId("x")
                .notificationId("x")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(
                                    ElementalChannelNodeWithType.builder()
                                        .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                        .build()
                                )
                                .version("2022-01-01")
                                .build()
                        )
                        .state(NotificationTemplateState.DRAFT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(
                                ElementalChannelNodeWithType.builder()
                                    .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                    .build()
                            )
                            .version("2022-01-01")
                            .build()
                    )
                    .state(NotificationTemplateState.DRAFT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplatePutContentParams.builder()
                .templateId("x")
                .notificationId("x")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(ElementalTextNodeWithType.builder().build())
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(ElementalTextNodeWithType.builder().build())
                            .build()
                    )
                    .build()
            )
    }
}
