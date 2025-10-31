// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseCheckTest {

    @Test
    fun create() {
        val baseCheck =
            BaseCheck.builder()
                .id("id")
                .status(BaseCheck.Status.RESOLVED)
                .type(BaseCheck.Type.CUSTOM)
                .build()

        assertThat(baseCheck.id()).isEqualTo("id")
        assertThat(baseCheck.status()).isEqualTo(BaseCheck.Status.RESOLVED)
        assertThat(baseCheck.type()).isEqualTo(BaseCheck.Type.CUSTOM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseCheck =
            BaseCheck.builder()
                .id("id")
                .status(BaseCheck.Status.RESOLVED)
                .type(BaseCheck.Type.CUSTOM)
                .build()

        val roundtrippedBaseCheck =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseCheck),
                jacksonTypeRef<BaseCheck>(),
            )

        assertThat(roundtrippedBaseCheck).isEqualTo(baseCheck)
    }
}
