// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceUpdateParamsTest {

    @Test
    fun create() {
        AudienceUpdateParams.builder()
            .audienceId("audience_id")
            .description("description")
            .filter(
                Filter.builder()
                    .addFilter(
                        SingleFilterConfig.builder()
                            .operator(SingleFilterConfig.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .build()
            )
            .name("name")
            .operator(AudienceUpdateParams.Operator.AND)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AudienceUpdateParams.builder().audienceId("audience_id").build()

        assertThat(params._pathParam(0)).isEqualTo("audience_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AudienceUpdateParams.builder()
                .audienceId("audience_id")
                .description("description")
                .filter(
                    Filter.builder()
                        .addFilter(
                            SingleFilterConfig.builder()
                                .operator(SingleFilterConfig.Operator.ENDS_WITH)
                                .path("path")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .name("name")
                .operator(AudienceUpdateParams.Operator.AND)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.filter())
            .contains(
                Filter.builder()
                    .addFilter(
                        SingleFilterConfig.builder()
                            .operator(SingleFilterConfig.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.operator()).contains(AudienceUpdateParams.Operator.AND)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AudienceUpdateParams.builder().audienceId("audience_id").build()

        val body = params._body()
    }
}
