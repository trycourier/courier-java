// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceListLogsParamsTest {

    @Test
    fun create() {
        WorkspacePreferenceListLogsParams.builder()
            .cursor("cursor")
            .limit(1L)
            .since("since")
            .tenantId("tenant_id")
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WorkspacePreferenceListLogsParams.builder()
                .cursor("cursor")
                .limit(1L)
                .since("since")
                .tenantId("tenant_id")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("since", "since")
                    .put("tenant_id", "tenant_id")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkspacePreferenceListLogsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
