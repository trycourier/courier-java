// File generated from our OpenAPI spec by Stainless.

package com.courier.models.translations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationUpdateParamsTest {

    @Test
    fun create() {
        TranslationUpdateParams.builder().domain("domain").locale("locale").body("body").build()
    }

    @Test
    fun pathParams() {
        val params =
            TranslationUpdateParams.builder().domain("domain").locale("locale").body("body").build()

        assertThat(params._pathParam(0)).isEqualTo("domain")
        assertThat(params._pathParam(1)).isEqualTo("locale")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TranslationUpdateParams.builder().domain("domain").locale("locale").body("body").build()

        val body = params._body()

        assertThat(body).isEqualTo("body")
    }
}
