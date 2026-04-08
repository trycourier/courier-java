// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.courier.models.notifications.NotificationTemplateSummary
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedNotificationListResponseTest {

    @Test
    fun create() {
        val associatedNotificationListResponse =
            AssociatedNotificationListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        assertThat(associatedNotificationListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(associatedNotificationListResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associatedNotificationListResponse =
            AssociatedNotificationListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        val roundtrippedAssociatedNotificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associatedNotificationListResponse),
                jacksonTypeRef<AssociatedNotificationListResponse>(),
            )

        assertThat(roundtrippedAssociatedNotificationListResponse)
            .isEqualTo(associatedNotificationListResponse)
    }
}
