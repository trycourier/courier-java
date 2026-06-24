// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionReplaceRequestTest {

    @Test
    fun create() {
        val preferenceSectionReplaceRequest =
            PreferenceSectionReplaceRequest.builder()
                .name("name")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        assertThat(preferenceSectionReplaceRequest.name()).isEqualTo("name")
        assertThat(preferenceSectionReplaceRequest.hasCustomRouting()).contains(true)
        assertThat(preferenceSectionReplaceRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceSectionReplaceRequest =
            PreferenceSectionReplaceRequest.builder()
                .name("name")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        val roundtrippedPreferenceSectionReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceSectionReplaceRequest),
                jacksonTypeRef<PreferenceSectionReplaceRequest>(),
            )

        assertThat(roundtrippedPreferenceSectionReplaceRequest)
            .isEqualTo(preferenceSectionReplaceRequest)
    }
}
