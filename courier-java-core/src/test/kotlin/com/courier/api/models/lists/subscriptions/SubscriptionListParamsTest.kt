// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists.subscriptions

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListParamsTest {

    @Test
    fun create() {
        SubscriptionListParams.builder().listId("list_id").cursor("cursor").build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionListParams.builder().listId("list_id").build()

        assertThat(params._pathParam(0)).isEqualTo("list_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = SubscriptionListParams.builder().listId("list_id").cursor("cursor").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("cursor", "cursor").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SubscriptionListParams.builder().listId("list_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
