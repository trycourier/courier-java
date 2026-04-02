// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateSummaryTest {

    @Test
    fun create() {
        val notificationTemplateSummary =
            NotificationTemplateSummary.builder()
                .id("id")
                .created(0L)
                .creator("creator")
                .name("name")
                .state(NotificationTemplateSummary.State.DRAFT)
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(notificationTemplateSummary.id()).isEqualTo("id")
        assertThat(notificationTemplateSummary.created()).isEqualTo(0L)
        assertThat(notificationTemplateSummary.creator()).isEqualTo("creator")
        assertThat(notificationTemplateSummary.name()).isEqualTo("name")
        assertThat(notificationTemplateSummary.state())
            .isEqualTo(NotificationTemplateSummary.State.DRAFT)
        assertThat(notificationTemplateSummary.tags()).containsExactly("string")
        assertThat(notificationTemplateSummary.updated()).contains(0L)
        assertThat(notificationTemplateSummary.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateSummary =
            NotificationTemplateSummary.builder()
                .id("id")
                .created(0L)
                .creator("creator")
                .name("name")
                .state(NotificationTemplateSummary.State.DRAFT)
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedNotificationTemplateSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateSummary),
                jacksonTypeRef<NotificationTemplateSummary>(),
            )

        assertThat(roundtrippedNotificationTemplateSummary).isEqualTo(notificationTemplateSummary)
    }
}
