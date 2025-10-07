// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists.subscriptions

import com.courier.api.core.jsonMapper
import com.courier.api.models.ChannelPreference
import com.courier.api.models.Rule
import com.courier.api.models.tenants.defaultpreferences.items.ChannelClassification
import com.courier.api.models.users.preferences.PreferenceStatus
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
