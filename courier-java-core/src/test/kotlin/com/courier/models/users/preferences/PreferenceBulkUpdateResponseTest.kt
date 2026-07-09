// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceBulkUpdateResponseTest {

    @Test
    fun create() {
        val preferenceBulkUpdateResponse =
            PreferenceBulkUpdateResponse.builder()
                .addError(
                    PreferenceBulkUpdateResponse.Error.builder()
                        .reason("reason")
                        .topicId("topic_id")
                        .build()
                )
                .addItem(
                    BulkPreferenceTopic.builder()
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .status(BulkPreferenceTopic.Status.OPTED_IN)
                        .topicId("topic_id")
                        .build()
                )
                .build()

        assertThat(preferenceBulkUpdateResponse.errors())
            .containsExactly(
                PreferenceBulkUpdateResponse.Error.builder()
                    .reason("reason")
                    .topicId("topic_id")
                    .build()
            )
        assertThat(preferenceBulkUpdateResponse.items())
            .containsExactly(
                BulkPreferenceTopic.builder()
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .status(BulkPreferenceTopic.Status.OPTED_IN)
                    .topicId("topic_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceBulkUpdateResponse =
            PreferenceBulkUpdateResponse.builder()
                .addError(
                    PreferenceBulkUpdateResponse.Error.builder()
                        .reason("reason")
                        .topicId("topic_id")
                        .build()
                )
                .addItem(
                    BulkPreferenceTopic.builder()
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .status(BulkPreferenceTopic.Status.OPTED_IN)
                        .topicId("topic_id")
                        .build()
                )
                .build()

        val roundtrippedPreferenceBulkUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceBulkUpdateResponse),
                jacksonTypeRef<PreferenceBulkUpdateResponse>(),
            )

        assertThat(roundtrippedPreferenceBulkUpdateResponse).isEqualTo(preferenceBulkUpdateResponse)
    }
}
