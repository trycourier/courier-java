// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplatePublishRequestTest {

    @Test
    fun create() {
        val notificationTemplatePublishRequest =
            NotificationTemplatePublishRequest.builder().version("v321669910225").build()

        assertThat(notificationTemplatePublishRequest.version()).contains("v321669910225")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplatePublishRequest =
            NotificationTemplatePublishRequest.builder().version("v321669910225").build()

        val roundtrippedNotificationTemplatePublishRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplatePublishRequest),
                jacksonTypeRef<NotificationTemplatePublishRequest>(),
            )

        assertThat(roundtrippedNotificationTemplatePublishRequest)
            .isEqualTo(notificationTemplatePublishRequest)
    }
}
