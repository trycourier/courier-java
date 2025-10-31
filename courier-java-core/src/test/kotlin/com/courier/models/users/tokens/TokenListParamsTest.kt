// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenListParamsTest {

    @Test
    fun create() {
        TokenListParams.builder().userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params = TokenListParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
