// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlackBasePropertiesTest {

    @Test
    fun create() {
        val slackBaseProperties = SlackBaseProperties.builder().accessToken("access_token").build()

        assertThat(slackBaseProperties.accessToken()).isEqualTo("access_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slackBaseProperties = SlackBaseProperties.builder().accessToken("access_token").build()

        val roundtrippedSlackBaseProperties =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slackBaseProperties),
                jacksonTypeRef<SlackBaseProperties>(),
            )

        assertThat(roundtrippedSlackBaseProperties).isEqualTo(slackBaseProperties)
    }
}
