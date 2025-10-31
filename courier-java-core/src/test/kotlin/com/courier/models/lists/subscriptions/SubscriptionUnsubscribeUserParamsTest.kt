// File generated from our OpenAPI spec by Stainless.

package com.courier.models.lists.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUnsubscribeUserParamsTest {

    @Test
    fun create() {
        SubscriptionUnsubscribeUserParams.builder().listId("list_id").userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUnsubscribeUserParams.builder().listId("list_id").userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("list_id")
        assertThat(params._pathParam(1)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
