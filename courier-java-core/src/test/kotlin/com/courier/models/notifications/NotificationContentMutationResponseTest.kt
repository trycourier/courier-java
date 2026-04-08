// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationContentMutationResponseTest {

    @Test
    fun create() {
        val notificationContentMutationResponse =
            NotificationContentMutationResponse.builder()
                .id("id")
                .addElement(
                    NotificationContentMutationResponse.Element.builder()
                        .id("id")
                        .checksum("checksum")
                        .build()
                )
                .state(NotificationTemplateState.DRAFT)
                .version("version")
                .build()

        assertThat(notificationContentMutationResponse.id()).isEqualTo("id")
        assertThat(notificationContentMutationResponse.elements())
            .containsExactly(
                NotificationContentMutationResponse.Element.builder()
                    .id("id")
                    .checksum("checksum")
                    .build()
            )
        assertThat(notificationContentMutationResponse.state())
            .isEqualTo(NotificationTemplateState.DRAFT)
        assertThat(notificationContentMutationResponse.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationContentMutationResponse =
            NotificationContentMutationResponse.builder()
                .id("id")
                .addElement(
                    NotificationContentMutationResponse.Element.builder()
                        .id("id")
                        .checksum("checksum")
                        .build()
                )
                .state(NotificationTemplateState.DRAFT)
                .version("version")
                .build()

        val roundtrippedNotificationContentMutationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationContentMutationResponse),
                jacksonTypeRef<NotificationContentMutationResponse>(),
            )

        assertThat(roundtrippedNotificationContentMutationResponse)
            .isEqualTo(notificationContentMutationResponse)
    }
}
