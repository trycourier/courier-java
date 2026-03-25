// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateMutationResponseTest {

    @Test
    fun create() {
        val notificationTemplateMutationResponse =
            NotificationTemplateMutationResponse.builder()
                .notification(
                    NotificationTemplateMutationResponse.Notification.builder().id("id").build()
                )
                .state(NotificationTemplateMutationResponse.State.DRAFT)
                .build()

        assertThat(notificationTemplateMutationResponse.notification())
            .isEqualTo(NotificationTemplateMutationResponse.Notification.builder().id("id").build())
        assertThat(notificationTemplateMutationResponse.state())
            .isEqualTo(NotificationTemplateMutationResponse.State.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateMutationResponse =
            NotificationTemplateMutationResponse.builder()
                .notification(
                    NotificationTemplateMutationResponse.Notification.builder().id("id").build()
                )
                .state(NotificationTemplateMutationResponse.State.DRAFT)
                .build()

        val roundtrippedNotificationTemplateMutationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateMutationResponse),
                jacksonTypeRef<NotificationTemplateMutationResponse>(),
            )

        assertThat(roundtrippedNotificationTemplateMutationResponse)
            .isEqualTo(notificationTemplateMutationResponse)
    }
}
