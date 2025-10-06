// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications.checks

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckListResponseTest {

    @Test
    fun create() {
        val checkListResponse =
            CheckListResponse.builder()
                .addCheck(
                    Check.builder()
                        .id("id")
                        .status(BaseCheck.Status.RESOLVED)
                        .type(BaseCheck.Type.CUSTOM)
                        .updated(0L)
                        .build()
                )
                .build()

        assertThat(checkListResponse.checks())
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
        val checkListResponse =
            CheckListResponse.builder()
                .addCheck(
                    Check.builder()
                        .id("id")
                        .status(BaseCheck.Status.RESOLVED)
                        .type(BaseCheck.Type.CUSTOM)
                        .updated(0L)
                        .build()
                )
                .build()

        val roundtrippedCheckListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkListResponse),
                jacksonTypeRef<CheckListResponse>(),
            )

        assertThat(roundtrippedCheckListResponse).isEqualTo(checkListResponse)
    }
}
