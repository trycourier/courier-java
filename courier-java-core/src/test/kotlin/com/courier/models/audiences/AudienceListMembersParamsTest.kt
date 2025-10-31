// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceListMembersParamsTest {

    @Test
    fun create() {
        AudienceListMembersParams.builder().audienceId("audience_id").cursor("cursor").build()
    }

    @Test
    fun pathParams() {
        val params = AudienceListMembersParams.builder().audienceId("audience_id").build()

        assertThat(params._pathParam(0)).isEqualTo("audience_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AudienceListMembersParams.builder().audienceId("audience_id").cursor("cursor").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("cursor", "cursor").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AudienceListMembersParams.builder().audienceId("audience_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
