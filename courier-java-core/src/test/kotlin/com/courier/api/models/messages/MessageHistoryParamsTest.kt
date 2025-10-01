// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageHistoryParamsTest {

    @Test
    fun create() {
        MessageHistoryParams.builder().messageId("message_id").type("type").build()
    }

    @Test
    fun pathParams() {
        val params = MessageHistoryParams.builder().messageId("message_id").build()

        assertThat(params._pathParam(0)).isEqualTo("message_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = MessageHistoryParams.builder().messageId("message_id").type("type").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("type", "type").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageHistoryParams.builder().messageId("message_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
