// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.checks

import com.courier.models.notifications.BaseCheck
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckUpdateParamsTest {

    @Test
    fun create() {
        CheckUpdateParams.builder()
            .id("id")
            .submissionId("submissionId")
            .addCheck(
                BaseCheck.builder()
                    .id("id")
                    .status(BaseCheck.Status.RESOLVED)
                    .type(BaseCheck.Type.CUSTOM)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckUpdateParams.builder()
                .id("id")
                .submissionId("submissionId")
                .addCheck(
                    BaseCheck.builder()
                        .id("id")
                        .status(BaseCheck.Status.RESOLVED)
                        .type(BaseCheck.Type.CUSTOM)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("submissionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CheckUpdateParams.builder()
                .id("id")
                .submissionId("submissionId")
                .addCheck(
                    BaseCheck.builder()
                        .id("id")
                        .status(BaseCheck.Status.RESOLVED)
                        .type(BaseCheck.Type.CUSTOM)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.checks())
            .containsExactly(
                BaseCheck.builder()
                    .id("id")
                    .status(BaseCheck.Status.RESOLVED)
                    .type(BaseCheck.Type.CUSTOM)
                    .build()
            )
    }
}
