// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateVersionListResponseTest {

    @Test
    fun create() {
        val notificationTemplateVersionListResponse =
            NotificationTemplateVersionListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addVersion(
                    VersionNode.builder()
                        .created(0L)
                        .creator("creator")
                        .version("version")
                        .hasChanges(true)
                        .build()
                )
                .build()

        assertThat(notificationTemplateVersionListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(notificationTemplateVersionListResponse.versions())
            .containsExactly(
                VersionNode.builder()
                    .created(0L)
                    .creator("creator")
                    .version("version")
                    .hasChanges(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateVersionListResponse =
            NotificationTemplateVersionListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addVersion(
                    VersionNode.builder()
                        .created(0L)
                        .creator("creator")
                        .version("version")
                        .hasChanges(true)
                        .build()
                )
                .build()

        val roundtrippedNotificationTemplateVersionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateVersionListResponse),
                jacksonTypeRef<NotificationTemplateVersionListResponse>(),
            )

        assertThat(roundtrippedNotificationTemplateVersionListResponse)
            .isEqualTo(notificationTemplateVersionListResponse)
    }
}
