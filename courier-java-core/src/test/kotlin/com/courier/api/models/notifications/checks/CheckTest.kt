// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications.checks

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTest {

    @Test
    fun create() {
        val check =
            Check.builder()
                .id("id")
                .status(BaseCheck.Status.RESOLVED)
                .type(BaseCheck.Type.CUSTOM)
                .updated(0L)
                .build()

        assertThat(check.id()).isEqualTo("id")
        assertThat(check.status()).isEqualTo(BaseCheck.Status.RESOLVED)
        assertThat(check.type()).isEqualTo(BaseCheck.Type.CUSTOM)
        assertThat(check.updated()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val check =
            Check.builder()
                .id("id")
                .status(BaseCheck.Status.RESOLVED)
                .type(BaseCheck.Type.CUSTOM)
                .updated(0L)
                .build()

        val roundtrippedCheck =
            jsonMapper.readValue(jsonMapper.writeValueAsString(check), jacksonTypeRef<Check>())

        assertThat(roundtrippedCheck).isEqualTo(check)
    }
}
