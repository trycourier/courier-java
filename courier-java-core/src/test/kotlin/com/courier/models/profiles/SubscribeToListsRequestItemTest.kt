// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.RecipientPreferences
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscribeToListsRequestItemTest {

    @Test
    fun create() {
        val subscribeToListsRequestItem =
            SubscribeToListsRequestItem.builder()
                .listId("listId")
                .preferences(
                    RecipientPreferences.builder()
                        .categories(
                            RecipientPreferences.Categories.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .notifications(
                            RecipientPreferences.Notifications.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(subscribeToListsRequestItem.listId()).isEqualTo("listId")
        assertThat(subscribeToListsRequestItem.preferences())
            .contains(
                RecipientPreferences.builder()
                    .categories(
                        RecipientPreferences.Categories.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "status" to "OPTED_IN",
                                        "channel_preferences" to
                                            listOf(mapOf("channel" to "direct_message")),
                                        "rules" to
                                            listOf(mapOf("until" to "until", "start" to "start")),
                                    )
                                ),
                            )
                            .build()
                    )
                    .notifications(
                        RecipientPreferences.Notifications.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "status" to "OPTED_IN",
                                        "channel_preferences" to
                                            listOf(mapOf("channel" to "direct_message")),
                                        "rules" to
                                            listOf(mapOf("until" to "until", "start" to "start")),
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscribeToListsRequestItem =
            SubscribeToListsRequestItem.builder()
                .listId("listId")
                .preferences(
                    RecipientPreferences.builder()
                        .categories(
                            RecipientPreferences.Categories.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .notifications(
                            RecipientPreferences.Notifications.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSubscribeToListsRequestItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscribeToListsRequestItem),
                jacksonTypeRef<SubscribeToListsRequestItem>(),
            )

        assertThat(roundtrippedSubscribeToListsRequestItem).isEqualTo(subscribeToListsRequestItem)
    }
}
