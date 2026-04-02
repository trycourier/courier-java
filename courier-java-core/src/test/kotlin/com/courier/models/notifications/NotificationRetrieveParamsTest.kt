// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationRetrieveParamsTest {

    @Test
    fun create() {
        NotificationRetrieveParams.builder().id("id").version("version").build()
    }

    @Test
    fun pathParams() {
        val params = NotificationRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = NotificationRetrieveParams.builder().id("id").version("version").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("version", "version").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotificationRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
