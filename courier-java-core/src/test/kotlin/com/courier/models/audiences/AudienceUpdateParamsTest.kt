// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.models.AudienceFilterConfig
import com.courier.models.FilterConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceUpdateParamsTest {

    @Test
    fun create() {
        AudienceUpdateParams.builder()
            .audienceId("audience_id")
            .description("Users located in the US")
            .filter(
                AudienceFilterConfig.builder()
                    .addFilter(
                        FilterConfig.builder()
                            .operator("EQ")
                            .filters(listOf())
                            .path("profile.location")
                            .value("US")
                            .build()
                    )
                    .operator(AudienceFilterConfig.Operator.AND)
                    .build()
            )
            .name("Engaged US Users")
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
                .description("Users located in the US")
                .filter(
                    AudienceFilterConfig.builder()
                        .addFilter(
                            FilterConfig.builder()
                                .operator("EQ")
                                .filters(listOf())
                                .path("profile.location")
                                .value("US")
                                .build()
                        )
                        .operator(AudienceFilterConfig.Operator.AND)
                        .build()
                )
                .name("Engaged US Users")
                .operator(AudienceUpdateParams.Operator.AND)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("Users located in the US")
        assertThat(body.filter())
            .contains(
                AudienceFilterConfig.builder()
                    .addFilter(
                        FilterConfig.builder()
                            .operator("EQ")
                            .filters(listOf())
                            .path("profile.location")
                            .value("US")
                            .build()
                    )
                    .operator(AudienceFilterConfig.Operator.AND)
                    .build()
            )
        assertThat(body.name()).contains("Engaged US Users")
        assertThat(body.operator()).contains(AudienceUpdateParams.Operator.AND)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AudienceUpdateParams.builder().audienceId("audience_id").build()

        val body = params._body()
    }
}
