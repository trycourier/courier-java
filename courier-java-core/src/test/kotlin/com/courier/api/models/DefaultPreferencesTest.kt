// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefaultPreferencesTest {

    @Test
    fun create() {
        val defaultPreferences =
            DefaultPreferences.builder()
                .addItem(
                    DefaultPreferences.Item.builder()
                        .status(SubscriptionTopicNew.Status.OPTED_OUT)
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .id("id")
                        .build()
                )
                .build()

        assertThat(defaultPreferences.items().getOrNull())
            .containsExactly(
                DefaultPreferences.Item.builder()
                    .status(SubscriptionTopicNew.Status.OPTED_OUT)
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .id("id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val defaultPreferences =
            DefaultPreferences.builder()
                .addItem(
                    DefaultPreferences.Item.builder()
                        .status(SubscriptionTopicNew.Status.OPTED_OUT)
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .id("id")
                        .build()
                )
                .build()

        val roundtrippedDefaultPreferences =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(defaultPreferences),
                jacksonTypeRef<DefaultPreferences>(),
            )

        assertThat(roundtrippedDefaultPreferences).isEqualTo(defaultPreferences)
    }
}
