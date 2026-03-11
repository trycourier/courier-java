// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyListParamsTest {

    @Test
    fun create() {
        JourneyListParams.builder()
            .cursor("cursor")
            .version(JourneyListParams.Version.PUBLISHED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            JourneyListParams.builder()
                .cursor("cursor")
                .version(JourneyListParams.Version.PUBLISHED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("cursor", "cursor").put("version", "published").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JourneyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
