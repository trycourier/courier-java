// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListListParamsTest {

    @Test
    fun create() {
        ListListParams.builder().cursor("cursor").pattern("pattern").build()
    }

    @Test
    fun queryParams() {
        val params = ListListParams.builder().cursor("cursor").pattern("pattern").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("cursor", "cursor").put("pattern", "pattern").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
