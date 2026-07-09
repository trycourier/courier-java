// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkPreferenceTopicTest {

    @Test
    fun create() {
        val bulkPreferenceTopic =
            BulkPreferenceTopic.builder()
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .status(BulkPreferenceTopic.Status.OPTED_IN)
                .topicId("topic_id")
                .build()

        assertThat(bulkPreferenceTopic.customRouting())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(bulkPreferenceTopic.hasCustomRouting()).isEqualTo(true)
        assertThat(bulkPreferenceTopic.status()).isEqualTo(BulkPreferenceTopic.Status.OPTED_IN)
        assertThat(bulkPreferenceTopic.topicId()).isEqualTo("topic_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkPreferenceTopic =
            BulkPreferenceTopic.builder()
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .status(BulkPreferenceTopic.Status.OPTED_IN)
                .topicId("topic_id")
                .build()

        val roundtrippedBulkPreferenceTopic =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkPreferenceTopic),
                jacksonTypeRef<BulkPreferenceTopic>(),
            )

        assertThat(roundtrippedBulkPreferenceTopic).isEqualTo(bulkPreferenceTopic)
    }
}
