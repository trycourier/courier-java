// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalTextNodeWithType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPutContentParamsTest {

    @Test
    fun create() {
        NotificationPutContentParams.builder()
            .id("id")
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
            NotificationPutContentParams.builder()
                .id("id")
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

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationPutContentParams.builder()
                .id("id")
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
            NotificationPutContentParams.builder()
                .id("id")
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
