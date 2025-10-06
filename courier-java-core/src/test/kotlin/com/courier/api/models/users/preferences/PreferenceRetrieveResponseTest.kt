// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.jsonMapper
import com.courier.api.models.audiences.Paging
import com.courier.api.models.tenants.defaultpreferences.items.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceRetrieveResponseTest {

    @Test
    fun create() {
        val preferenceRetrieveResponse =
            PreferenceRetrieveResponse.builder()
                .addItem(
                    TopicPreference.builder()
                        .defaultStatus(PreferenceStatus.OPTED_IN)
                        .status(PreferenceStatus.OPTED_IN)
                        .topicId("topic_id")
                        .topicName("topic_name")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        assertThat(preferenceRetrieveResponse.items())
            .containsExactly(
                TopicPreference.builder()
                    .defaultStatus(PreferenceStatus.OPTED_IN)
                    .status(PreferenceStatus.OPTED_IN)
                    .topicId("topic_id")
                    .topicName("topic_name")
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .build()
            )
        assertThat(preferenceRetrieveResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceRetrieveResponse =
            PreferenceRetrieveResponse.builder()
                .addItem(
                    TopicPreference.builder()
                        .defaultStatus(PreferenceStatus.OPTED_IN)
                        .status(PreferenceStatus.OPTED_IN)
                        .topicId("topic_id")
                        .topicName("topic_name")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        val roundtrippedPreferenceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceRetrieveResponse),
                jacksonTypeRef<PreferenceRetrieveResponse>(),
            )

        assertThat(roundtrippedPreferenceRetrieveResponse).isEqualTo(preferenceRetrieveResponse)
    }
}
