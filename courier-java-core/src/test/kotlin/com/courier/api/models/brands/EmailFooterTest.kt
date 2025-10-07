// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailFooterTest {

    @Test
    fun create() {
        val emailFooter = EmailFooter.builder().content("content").inheritDefault(true).build()

        assertThat(emailFooter.content()).contains("content")
        assertThat(emailFooter.inheritDefault()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailFooter = EmailFooter.builder().content("content").inheritDefault(true).build()

        val roundtrippedEmailFooter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailFooter),
                jacksonTypeRef<EmailFooter>(),
            )

        assertThat(roundtrippedEmailFooter).isEqualTo(emailFooter)
    }
}
