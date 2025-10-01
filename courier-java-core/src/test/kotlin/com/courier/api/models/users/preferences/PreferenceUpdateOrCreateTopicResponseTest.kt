// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceUpdateOrCreateTopicResponseTest {

    @Test
    fun create() {
        val preferenceUpdateOrCreateTopicResponse =
            PreferenceUpdateOrCreateTopicResponse.builder().message("success").build()

        assertThat(preferenceUpdateOrCreateTopicResponse.message()).isEqualTo("success")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceUpdateOrCreateTopicResponse =
            PreferenceUpdateOrCreateTopicResponse.builder().message("success").build()

        val roundtrippedPreferenceUpdateOrCreateTopicResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceUpdateOrCreateTopicResponse),
                jacksonTypeRef<PreferenceUpdateOrCreateTopicResponse>(),
            )

        assertThat(roundtrippedPreferenceUpdateOrCreateTopicResponse)
            .isEqualTo(preferenceUpdateOrCreateTopicResponse)
    }
}
