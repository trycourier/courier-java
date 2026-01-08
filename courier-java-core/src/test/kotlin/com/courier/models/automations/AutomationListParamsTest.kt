// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationListParamsTest {

    @Test
    fun create() {
        AutomationListParams.builder()
            .cursor("cursor")
            .version(AutomationListParams.Version.PUBLISHED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AutomationListParams.builder()
                .cursor("cursor")
                .version(AutomationListParams.Version.PUBLISHED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("cursor", "cursor").put("version", "published").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AutomationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
