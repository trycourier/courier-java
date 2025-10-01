// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenDeleteParamsTest {

    @Test
    fun create() {
        TokenDeleteParams.builder().userId("user_id").token("token").build()
    }

    @Test
    fun pathParams() {
        val params = TokenDeleteParams.builder().userId("user_id").token("token").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("token")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
