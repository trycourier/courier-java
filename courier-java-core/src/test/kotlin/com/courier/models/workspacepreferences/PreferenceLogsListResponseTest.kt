// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.courier.models.Paging
import com.courier.models.PreferenceStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceLogsListResponseTest {

    @Test
    fun create() {
        val preferenceLogsListResponse =
            PreferenceLogsListResponse.builder()
                .addItem(
                    PreferenceChangeLogEntry.builder()
                        .id("id")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .status(PreferenceStatus.OPTED_IN)
                        .timestamp("timestamp")
                        .topicId("topic_id")
                        .topicName("topic_name")
                        .userId("user_id")
                        .previous(
                            PreferenceChangeLogValue.builder()
                                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                                .hasCustomRouting(true)
                                .status(PreferenceStatus.OPTED_IN)
                                .build()
                        )
                        .tenantId("tenant_id")
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        assertThat(preferenceLogsListResponse.items())
            .containsExactly(
                PreferenceChangeLogEntry.builder()
                    .id("id")
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .status(PreferenceStatus.OPTED_IN)
                    .timestamp("timestamp")
                    .topicId("topic_id")
                    .topicName("topic_name")
                    .userId("user_id")
                    .previous(
                        PreferenceChangeLogValue.builder()
                            .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                            .hasCustomRouting(true)
                            .status(PreferenceStatus.OPTED_IN)
                            .build()
                    )
                    .tenantId("tenant_id")
                    .build()
            )
        assertThat(preferenceLogsListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceLogsListResponse =
            PreferenceLogsListResponse.builder()
                .addItem(
                    PreferenceChangeLogEntry.builder()
                        .id("id")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .status(PreferenceStatus.OPTED_IN)
                        .timestamp("timestamp")
                        .topicId("topic_id")
                        .topicName("topic_name")
                        .userId("user_id")
                        .previous(
                            PreferenceChangeLogValue.builder()
                                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                                .hasCustomRouting(true)
                                .status(PreferenceStatus.OPTED_IN)
                                .build()
                        )
                        .tenantId("tenant_id")
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        val roundtrippedPreferenceLogsListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceLogsListResponse),
                jacksonTypeRef<PreferenceLogsListResponse>(),
            )

        assertThat(roundtrippedPreferenceLogsListResponse).isEqualTo(preferenceLogsListResponse)
    }
}
