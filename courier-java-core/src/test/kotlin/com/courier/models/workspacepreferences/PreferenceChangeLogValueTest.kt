// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceChangeLogValueTest {

    @Test
    fun create() {
        val preferenceChangeLogValue =
            PreferenceChangeLogValue.builder()
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .status(PreferenceStatus.OPTED_IN)
                .build()

        assertThat(preferenceChangeLogValue.customRouting())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(preferenceChangeLogValue.hasCustomRouting()).isEqualTo(true)
        assertThat(preferenceChangeLogValue.status()).isEqualTo(PreferenceStatus.OPTED_IN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceChangeLogValue =
            PreferenceChangeLogValue.builder()
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .status(PreferenceStatus.OPTED_IN)
                .build()

        val roundtrippedPreferenceChangeLogValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceChangeLogValue),
                jacksonTypeRef<PreferenceChangeLogValue>(),
            )

        assertThat(roundtrippedPreferenceChangeLogValue).isEqualTo(preferenceChangeLogValue)
    }
}
