// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceBulkReplaceResponseTest {

    @Test
    fun create() {
        val preferenceBulkReplaceResponse =
            PreferenceBulkReplaceResponse.builder()
                .addDeleted("string")
                .addItem(
                    BulkPreferenceTopic.builder()
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .status(BulkPreferenceTopic.Status.OPTED_IN)
                        .topicId("topic_id")
                        .build()
                )
                .build()

        assertThat(preferenceBulkReplaceResponse.deleted()).containsExactly("string")
        assertThat(preferenceBulkReplaceResponse.items())
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
        val preferenceBulkReplaceResponse =
            PreferenceBulkReplaceResponse.builder()
                .addDeleted("string")
                .addItem(
                    BulkPreferenceTopic.builder()
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .status(BulkPreferenceTopic.Status.OPTED_IN)
                        .topicId("topic_id")
                        .build()
                )
                .build()

        val roundtrippedPreferenceBulkReplaceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceBulkReplaceResponse),
                jacksonTypeRef<PreferenceBulkReplaceResponse>(),
            )

        assertThat(roundtrippedPreferenceBulkReplaceResponse)
            .isEqualTo(preferenceBulkReplaceResponse)
    }
}
