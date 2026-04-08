// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationLocalePutRequestTest {

    @Test
    fun create() {
        val notificationLocalePutRequest =
            NotificationLocalePutRequest.builder()
                .addElement(NotificationLocalePutRequest.Element.builder().id("id").build())
                .state(NotificationTemplateState.DRAFT)
                .build()

        assertThat(notificationLocalePutRequest.elements())
            .containsExactly(NotificationLocalePutRequest.Element.builder().id("id").build())
        assertThat(notificationLocalePutRequest.state()).contains(NotificationTemplateState.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationLocalePutRequest =
            NotificationLocalePutRequest.builder()
                .addElement(NotificationLocalePutRequest.Element.builder().id("id").build())
                .state(NotificationTemplateState.DRAFT)
                .build()

        val roundtrippedNotificationLocalePutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationLocalePutRequest),
                jacksonTypeRef<NotificationLocalePutRequest>(),
            )

        assertThat(roundtrippedNotificationLocalePutRequest).isEqualTo(notificationLocalePutRequest)
    }
}
