// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceFilterTest {

    @Test
    fun create() {
        val audienceFilter =
            AudienceFilter.builder()
                .operator(AudienceFilter.Operator.MEMBER_OF)
                .path(AudienceFilter.Path.ACCOUNT_ID)
                .value("value")
                .build()

        assertThat(audienceFilter.operator()).isEqualTo(AudienceFilter.Operator.MEMBER_OF)
        assertThat(audienceFilter.path()).isEqualTo(AudienceFilter.Path.ACCOUNT_ID)
        assertThat(audienceFilter.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audienceFilter =
            AudienceFilter.builder()
                .operator(AudienceFilter.Operator.MEMBER_OF)
                .path(AudienceFilter.Path.ACCOUNT_ID)
                .value("value")
                .build()

        val roundtrippedAudienceFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audienceFilter),
                jacksonTypeRef<AudienceFilter>(),
            )

        assertThat(roundtrippedAudienceFilter).isEqualTo(audienceFilter)
    }
}
