// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications.checks

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckUpdateResponseTest {

    @Test
    fun create() {
        val checkUpdateResponse =
            CheckUpdateResponse.builder()
                .addCheck(
                    Check.builder()
                        .id("id")
                        .status(BaseCheck.Status.RESOLVED)
                        .type(BaseCheck.Type.CUSTOM)
                        .updated(0L)
                        .build()
                )
                .build()

        assertThat(checkUpdateResponse.checks())
            .containsExactly(
                Check.builder()
                    .id("id")
                    .status(BaseCheck.Status.RESOLVED)
                    .type(BaseCheck.Type.CUSTOM)
                    .updated(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkUpdateResponse =
            CheckUpdateResponse.builder()
                .addCheck(
                    Check.builder()
                        .id("id")
                        .status(BaseCheck.Status.RESOLVED)
                        .type(BaseCheck.Type.CUSTOM)
                        .updated(0L)
                        .build()
                )
                .build()

        val roundtrippedCheckUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkUpdateResponse),
                jacksonTypeRef<CheckUpdateResponse>(),
            )

        assertThat(roundtrippedCheckUpdateResponse).isEqualTo(checkUpdateResponse)
    }
}
