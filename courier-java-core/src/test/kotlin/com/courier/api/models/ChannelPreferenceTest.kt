// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelPreferenceTest {

    @Test
    fun create() {
        val channelPreference =
            ChannelPreference.builder().channel(ChannelClassification.DIRECT_MESSAGE).build()

        assertThat(channelPreference.channel()).isEqualTo(ChannelClassification.DIRECT_MESSAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelPreference =
            ChannelPreference.builder().channel(ChannelClassification.DIRECT_MESSAGE).build()

        val roundtrippedChannelPreference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelPreference),
                jacksonTypeRef<ChannelPreference>(),
            )

        assertThat(roundtrippedChannelPreference).isEqualTo(channelPreference)
    }
}
