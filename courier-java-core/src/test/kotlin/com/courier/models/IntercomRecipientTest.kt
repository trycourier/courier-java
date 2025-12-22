// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntercomRecipientTest {

    @Test
    fun create() {
        val intercomRecipient = IntercomRecipient.builder().id("id").build()

        assertThat(intercomRecipient.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intercomRecipient = IntercomRecipient.builder().id("id").build()

        val roundtrippedIntercomRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intercomRecipient),
                jacksonTypeRef<IntercomRecipient>(),
            )

        assertThat(roundtrippedIntercomRecipient).isEqualTo(intercomRecipient)
    }
}
