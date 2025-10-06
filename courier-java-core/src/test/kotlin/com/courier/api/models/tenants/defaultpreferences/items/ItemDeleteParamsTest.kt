// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.defaultpreferences.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemDeleteParamsTest {

    @Test
    fun create() {
        ItemDeleteParams.builder().tenantId("tenant_id").topicId("topic_id").build()
    }

    @Test
    fun pathParams() {
        val params = ItemDeleteParams.builder().tenantId("tenant_id").topicId("topic_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
