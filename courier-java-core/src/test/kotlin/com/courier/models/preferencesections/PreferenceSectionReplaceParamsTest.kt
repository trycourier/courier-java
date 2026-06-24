// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionReplaceParamsTest {

    @Test
    fun create() {
        PreferenceSectionReplaceParams.builder()
            .sectionId("section_id")
            .preferenceSectionReplaceRequest(
                PreferenceSectionReplaceRequest.builder()
                    .name("name")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PreferenceSectionReplaceParams.builder()
                .sectionId("section_id")
                .preferenceSectionReplaceRequest(
                    PreferenceSectionReplaceRequest.builder().name("name").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PreferenceSectionReplaceParams.builder()
                .sectionId("section_id")
                .preferenceSectionReplaceRequest(
                    PreferenceSectionReplaceRequest.builder()
                        .name("name")
                        .hasCustomRouting(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreferenceSectionReplaceRequest.builder()
                    .name("name")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PreferenceSectionReplaceParams.builder()
                .sectionId("section_id")
                .preferenceSectionReplaceRequest(
                    PreferenceSectionReplaceRequest.builder().name("name").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PreferenceSectionReplaceRequest.builder().name("name").build())
    }
}
