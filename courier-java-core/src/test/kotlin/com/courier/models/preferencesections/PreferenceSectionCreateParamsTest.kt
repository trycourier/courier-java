// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionCreateParamsTest {

    @Test
    fun create() {
        PreferenceSectionCreateParams.builder()
            .preferenceSectionCreateRequest(
                PreferenceSectionCreateRequest.builder()
                    .name("Account Notifications")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PreferenceSectionCreateParams.builder()
                .preferenceSectionCreateRequest(
                    PreferenceSectionCreateRequest.builder()
                        .name("Account Notifications")
                        .hasCustomRouting(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreferenceSectionCreateRequest.builder()
                    .name("Account Notifications")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PreferenceSectionCreateParams.builder()
                .preferenceSectionCreateRequest(
                    PreferenceSectionCreateRequest.builder().name("Account Notifications").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreferenceSectionCreateRequest.builder().name("Account Notifications").build()
            )
    }
}
