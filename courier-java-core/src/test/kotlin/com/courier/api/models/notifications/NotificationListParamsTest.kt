// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationListParamsTest {

    @Test
    fun create() {
        NotificationListParams.builder().cursor("cursor").notes(true).build()
    }

    @Test
    fun queryParams() {
        val params = NotificationListParams.builder().cursor("cursor").notes(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("notes", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotificationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
