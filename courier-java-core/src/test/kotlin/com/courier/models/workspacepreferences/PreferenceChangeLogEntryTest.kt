// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceChangeLogEntryTest {

    @Test
    fun create() {
        val preferenceChangeLogEntry =
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

        assertThat(preferenceChangeLogEntry.id()).isEqualTo("id")
        assertThat(preferenceChangeLogEntry.customRouting())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(preferenceChangeLogEntry.hasCustomRouting()).isEqualTo(true)
        assertThat(preferenceChangeLogEntry.status()).isEqualTo(PreferenceStatus.OPTED_IN)
        assertThat(preferenceChangeLogEntry.timestamp()).isEqualTo("timestamp")
        assertThat(preferenceChangeLogEntry.topicId()).isEqualTo("topic_id")
        assertThat(preferenceChangeLogEntry.topicName()).isEqualTo("topic_name")
        assertThat(preferenceChangeLogEntry.userId()).isEqualTo("user_id")
        assertThat(preferenceChangeLogEntry.previous())
            .contains(
                PreferenceChangeLogValue.builder()
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .status(PreferenceStatus.OPTED_IN)
                    .build()
            )
        assertThat(preferenceChangeLogEntry.tenantId()).contains("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceChangeLogEntry =
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

        val roundtrippedPreferenceChangeLogEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceChangeLogEntry),
                jacksonTypeRef<PreferenceChangeLogEntry>(),
            )

        assertThat(roundtrippedPreferenceChangeLogEntry).isEqualTo(preferenceChangeLogEntry)
    }
}
