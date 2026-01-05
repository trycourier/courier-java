// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntercomTest {

    @Test
    fun create() {
        val intercom =
            Intercom.builder().from("from").to(IntercomRecipient.builder().id("id").build()).build()

        assertThat(intercom.from()).isEqualTo("from")
        assertThat(intercom.to()).isEqualTo(IntercomRecipient.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intercom =
            Intercom.builder().from("from").to(IntercomRecipient.builder().id("id").build()).build()

        val roundtrippedIntercom =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intercom),
                jacksonTypeRef<Intercom>(),
            )

        assertThat(roundtrippedIntercom).isEqualTo(intercom)
    }
}
