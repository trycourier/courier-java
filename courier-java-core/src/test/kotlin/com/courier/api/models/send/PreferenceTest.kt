// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceTest {

    @Test
    fun create() {
        val preference =
            Preference.builder()
                .status(Preference.Status.OPTED_IN)
                .addChannelPreference(
                    Preference.ChannelPreference.builder()
                        .channel(Preference.ChannelPreference.Channel.DIRECT_MESSAGE)
                        .build()
                )
                .addRule(Preference.Rule.builder().until("until").start("start").build())
                .source(Preference.Source.SUBSCRIPTION)
                .build()

        assertThat(preference.status()).isEqualTo(Preference.Status.OPTED_IN)
        assertThat(preference.channelPreferences().getOrNull())
            .containsExactly(
                Preference.ChannelPreference.builder()
                    .channel(Preference.ChannelPreference.Channel.DIRECT_MESSAGE)
                    .build()
            )
        assertThat(preference.rules().getOrNull())
            .containsExactly(Preference.Rule.builder().until("until").start("start").build())
        assertThat(preference.source()).contains(Preference.Source.SUBSCRIPTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preference =
            Preference.builder()
                .status(Preference.Status.OPTED_IN)
                .addChannelPreference(
                    Preference.ChannelPreference.builder()
                        .channel(Preference.ChannelPreference.Channel.DIRECT_MESSAGE)
                        .build()
                )
                .addRule(Preference.Rule.builder().until("until").start("start").build())
                .source(Preference.Source.SUBSCRIPTION)
                .build()

        val roundtrippedPreference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preference),
                jacksonTypeRef<Preference>(),
            )

        assertThat(roundtrippedPreference).isEqualTo(preference)
    }
}
