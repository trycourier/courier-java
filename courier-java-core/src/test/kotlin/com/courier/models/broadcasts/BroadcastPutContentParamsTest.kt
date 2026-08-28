// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.models.ElementalMetaNodeWithType
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.notifications.NotificationContentPutRequest
import com.courier.models.notifications.NotificationTemplateState
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastPutContentParamsTest {

    @Test
    fun create() {
        BroadcastPutContentParams.builder()
            .broadcastId("broadcastId")
            .notificationContentPutRequest(
                NotificationContentPutRequest.builder()
                    .content(
                        NotificationContentPutRequest.Content.builder()
                            .addElement(
                                ElementalMetaNodeWithType.builder()
                                    .type(ElementalMetaNodeWithType.Type.META)
                                    .build()
                            )
                            .addElement(
                                ElementalTextNodeWithType.builder()
                                    .type(ElementalTextNodeWithType.Type.TEXT)
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
            BroadcastPutContentParams.builder()
                .broadcastId("broadcastId")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(ElementalMetaNodeWithType.builder().build())
                                .addElement(ElementalTextNodeWithType.builder().build())
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BroadcastPutContentParams.builder()
                .broadcastId("broadcastId")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(
                                    ElementalMetaNodeWithType.builder()
                                        .type(ElementalMetaNodeWithType.Type.META)
                                        .build()
                                )
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .type(ElementalTextNodeWithType.Type.TEXT)
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
                                ElementalMetaNodeWithType.builder()
                                    .type(ElementalMetaNodeWithType.Type.META)
                                    .build()
                            )
                            .addElement(
                                ElementalTextNodeWithType.builder()
                                    .type(ElementalTextNodeWithType.Type.TEXT)
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
            BroadcastPutContentParams.builder()
                .broadcastId("broadcastId")
                .notificationContentPutRequest(
                    NotificationContentPutRequest.builder()
                        .content(
                            NotificationContentPutRequest.Content.builder()
                                .addElement(ElementalMetaNodeWithType.builder().build())
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
                            .addElement(ElementalMetaNodeWithType.builder().build())
                            .addElement(ElementalTextNodeWithType.builder().build())
                            .build()
                    )
                    .build()
            )
    }
}
