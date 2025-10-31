// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageContextTest {

    @Test
    fun create() {
        val messageContext = MessageContext.builder().tenantId("tenant_id").build()

        assertThat(messageContext.tenantId()).contains("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContext = MessageContext.builder().tenantId("tenant_id").build()

        val roundtrippedMessageContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContext),
                jacksonTypeRef<MessageContext>(),
            )

        assertThat(roundtrippedMessageContext).isEqualTo(messageContext)
    }
}
