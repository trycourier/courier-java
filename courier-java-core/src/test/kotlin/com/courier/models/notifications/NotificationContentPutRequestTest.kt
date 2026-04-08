// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationContentPutRequestTest {

    @Test
    fun create() {
        val notificationContentPutRequest =
            NotificationContentPutRequest.builder()
                .content(
                    NotificationContentPutRequest.Content.builder()
                        .addElement(
                            ElementalTextNodeWithType.builder()
                                .addChannel("string")
                                .if_("if")
                                .loop("loop")
                                .ref("ref")
                                .type(ElementalTextNodeWithType.Type.TEXT)
                                .build()
                        )
                        .version("version")
                        .build()
                )
                .state(NotificationTemplateState.DRAFT)
                .build()

        assertThat(notificationContentPutRequest.content())
            .isEqualTo(
                NotificationContentPutRequest.Content.builder()
                    .addElement(
                        ElementalTextNodeWithType.builder()
                            .addChannel("string")
                            .if_("if")
                            .loop("loop")
                            .ref("ref")
                            .type(ElementalTextNodeWithType.Type.TEXT)
                            .build()
                    )
                    .version("version")
                    .build()
            )
        assertThat(notificationContentPutRequest.state()).contains(NotificationTemplateState.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationContentPutRequest =
            NotificationContentPutRequest.builder()
                .content(
                    NotificationContentPutRequest.Content.builder()
                        .addElement(
                            ElementalTextNodeWithType.builder()
                                .addChannel("string")
                                .if_("if")
                                .loop("loop")
                                .ref("ref")
                                .type(ElementalTextNodeWithType.Type.TEXT)
                                .build()
                        )
                        .version("version")
                        .build()
                )
                .state(NotificationTemplateState.DRAFT)
                .build()

        val roundtrippedNotificationContentPutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationContentPutRequest),
                jacksonTypeRef<NotificationContentPutRequest>(),
            )

        assertThat(roundtrippedNotificationContentPutRequest)
            .isEqualTo(notificationContentPutRequest)
    }
}
