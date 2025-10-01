// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseMessageSendToTest {

    @Test
    fun create() {
        val baseMessageSendTo =
            BaseMessageSendTo.builder()
                .to(
                    BaseMessageSendTo.To.AudienceRecipient.builder()
                        .audienceId("audience_id")
                        .data(
                            BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addFilter(
                            BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                .operator(
                                    BaseMessageSendTo.To.AudienceRecipient.Filter.Operator.MEMBER_OF
                                )
                                .path(BaseMessageSendTo.To.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(baseMessageSendTo.to())
            .contains(
                BaseMessageSendTo.To.ofAudienceRecipient(
                    BaseMessageSendTo.To.AudienceRecipient.builder()
                        .audienceId("audience_id")
                        .data(
                            BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addFilter(
                            BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                .operator(
                                    BaseMessageSendTo.To.AudienceRecipient.Filter.Operator.MEMBER_OF
                                )
                                .path(BaseMessageSendTo.To.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                                .value("value")
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseMessageSendTo =
            BaseMessageSendTo.builder()
                .to(
                    BaseMessageSendTo.To.AudienceRecipient.builder()
                        .audienceId("audience_id")
                        .data(
                            BaseMessageSendTo.To.AudienceRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addFilter(
                            BaseMessageSendTo.To.AudienceRecipient.Filter.builder()
                                .operator(
                                    BaseMessageSendTo.To.AudienceRecipient.Filter.Operator.MEMBER_OF
                                )
                                .path(BaseMessageSendTo.To.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBaseMessageSendTo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseMessageSendTo),
                jacksonTypeRef<BaseMessageSendTo>(),
            )

        assertThat(roundtrippedBaseMessageSendTo).isEqualTo(baseMessageSendTo)
    }
}
