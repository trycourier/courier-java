// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists.subscriptions

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.Paging
import com.courier.api.models.RecipientPreferences
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListResponseTest {

    @Test
    fun create() {
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .addItem(
                    SubscriptionListResponse.Item.builder()
                        .recipientId("recipientId")
                        .created("created")
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
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
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
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
                                                        ),
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        assertThat(subscriptionListResponse.items())
            .containsExactly(
                SubscriptionListResponse.Item.builder()
                    .recipientId("recipientId")
                    .created("created")
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
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
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
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
                                                    ),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(subscriptionListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .addItem(
                    SubscriptionListResponse.Item.builder()
                        .recipientId("recipientId")
                        .created("created")
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
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
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
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
                                                        ),
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        val roundtrippedSubscriptionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListResponse),
                jacksonTypeRef<SubscriptionListResponse>(),
            )

        assertThat(roundtrippedSubscriptionListResponse).isEqualTo(subscriptionListResponse)
    }
}
