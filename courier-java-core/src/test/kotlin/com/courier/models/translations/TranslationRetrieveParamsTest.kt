// File generated from our OpenAPI spec by Stainless.

package com.courier.models.translations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationRetrieveParamsTest {

    @Test
    fun create() {
        TranslationRetrieveParams.builder().domain("domain").locale("locale").build()
    }

    @Test
    fun pathParams() {
        val params = TranslationRetrieveParams.builder().domain("domain").locale("locale").build()

        assertThat(params._pathParam(0)).isEqualTo("domain")
        assertThat(params._pathParam(1)).isEqualTo("locale")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
