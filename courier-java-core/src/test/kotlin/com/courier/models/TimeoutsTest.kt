// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeoutsTest {

    @Test
    fun create() {
        val timeouts = Timeouts.builder().channel(0L).provider(0L).build()

        assertThat(timeouts.channel()).contains(0L)
        assertThat(timeouts.provider()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeouts = Timeouts.builder().channel(0L).provider(0L).build()

        val roundtrippedTimeouts =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeouts),
                jacksonTypeRef<Timeouts>(),
            )

        assertThat(roundtrippedTimeouts).isEqualTo(timeouts)
    }
}
