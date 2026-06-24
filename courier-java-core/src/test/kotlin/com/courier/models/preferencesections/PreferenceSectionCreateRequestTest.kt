// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionCreateRequestTest {

    @Test
    fun create() {
        val preferenceSectionCreateRequest =
            PreferenceSectionCreateRequest.builder()
                .name("name")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        assertThat(preferenceSectionCreateRequest.name()).isEqualTo("name")
        assertThat(preferenceSectionCreateRequest.hasCustomRouting()).contains(true)
        assertThat(preferenceSectionCreateRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceSectionCreateRequest =
            PreferenceSectionCreateRequest.builder()
                .name("name")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        val roundtrippedPreferenceSectionCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceSectionCreateRequest),
                jacksonTypeRef<PreferenceSectionCreateRequest>(),
            )

        assertThat(roundtrippedPreferenceSectionCreateRequest)
            .isEqualTo(preferenceSectionCreateRequest)
    }
}
