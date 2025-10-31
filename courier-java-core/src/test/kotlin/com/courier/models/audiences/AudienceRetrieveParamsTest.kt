// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceRetrieveParamsTest {

    @Test
    fun create() {
        AudienceRetrieveParams.builder().audienceId("audience_id").build()
    }

    @Test
    fun pathParams() {
        val params = AudienceRetrieveParams.builder().audienceId("audience_id").build()

        assertThat(params._pathParam(0)).isEqualTo("audience_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
