// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceRecipientTest {

    @Test
    fun create() {
        val audienceRecipient =
            AudienceRecipient.builder()
                .audienceId("audience_id")
                .data(
                    AudienceRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addFilter(
                    AudienceFilter.builder()
                        .operator(AudienceFilter.Operator.MEMBER_OF)
                        .path(AudienceFilter.Path.ACCOUNT_ID)
                        .value("value")
                        .build()
                )
                .build()

        assertThat(audienceRecipient.audienceId()).isEqualTo("audience_id")
        assertThat(audienceRecipient.data())
            .contains(
                AudienceRecipient.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(audienceRecipient.filters().getOrNull())
            .containsExactly(
                AudienceFilter.builder()
                    .operator(AudienceFilter.Operator.MEMBER_OF)
                    .path(AudienceFilter.Path.ACCOUNT_ID)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audienceRecipient =
            AudienceRecipient.builder()
                .audienceId("audience_id")
                .data(
                    AudienceRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addFilter(
                    AudienceFilter.builder()
                        .operator(AudienceFilter.Operator.MEMBER_OF)
                        .path(AudienceFilter.Path.ACCOUNT_ID)
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedAudienceRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audienceRecipient),
                jacksonTypeRef<AudienceRecipient>(),
            )

        assertThat(roundtrippedAudienceRecipient).isEqualTo(audienceRecipient)
    }
}
