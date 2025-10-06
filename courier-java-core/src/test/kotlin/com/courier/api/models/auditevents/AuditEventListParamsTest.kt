// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auditevents

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListParamsTest {

    @Test
    fun create() {
        AuditEventListParams.builder().cursor("cursor").build()
    }

    @Test
    fun queryParams() {
        val params = AuditEventListParams.builder().cursor("cursor").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("cursor", "cursor").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuditEventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
