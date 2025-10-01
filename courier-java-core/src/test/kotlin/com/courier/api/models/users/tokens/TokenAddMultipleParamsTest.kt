// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenAddMultipleParamsTest {

    @Test
    fun create() {
        TokenAddMultipleParams.builder().userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params = TokenAddMultipleParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
