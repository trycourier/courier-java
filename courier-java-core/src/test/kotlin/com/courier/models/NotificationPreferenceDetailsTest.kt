// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPreferenceDetailsTest {

    @Test
    fun create() {
        val notificationPreferenceDetails =
            NotificationPreferenceDetails.builder()
                .status(PreferenceStatus.OPTED_IN)
                .addChannelPreference(
                    ChannelPreference.builder()
                        .channel(ChannelClassification.DIRECT_MESSAGE)
                        .build()
                )
                .addRule(Rule.builder().until("until").start("start").build())
                .build()

        assertThat(notificationPreferenceDetails.status()).isEqualTo(PreferenceStatus.OPTED_IN)
        assertThat(notificationPreferenceDetails.channelPreferences().getOrNull())
            .containsExactly(
                ChannelPreference.builder().channel(ChannelClassification.DIRECT_MESSAGE).build()
            )
        assertThat(notificationPreferenceDetails.rules().getOrNull())
            .containsExactly(Rule.builder().until("until").start("start").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationPreferenceDetails =
            NotificationPreferenceDetails.builder()
                .status(PreferenceStatus.OPTED_IN)
                .addChannelPreference(
                    ChannelPreference.builder()
                        .channel(ChannelClassification.DIRECT_MESSAGE)
                        .build()
                )
                .addRule(Rule.builder().until("until").start("start").build())
                .build()

        val roundtrippedNotificationPreferenceDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationPreferenceDetails),
                jacksonTypeRef<NotificationPreferenceDetails>(),
            )

        assertThat(roundtrippedNotificationPreferenceDetails)
            .isEqualTo(notificationPreferenceDetails)
    }
}
