// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers.catalog

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CatalogListParamsTest {

    @Test
    fun create() {
        CatalogListParams.builder().channel("channel").keys("keys").name("name").build()
    }

    @Test
    fun queryParams() {
        val params =
            CatalogListParams.builder().channel("channel").keys("keys").name("name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("channel", "channel")
                    .put("keys", "keys")
                    .put("name", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CatalogListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
