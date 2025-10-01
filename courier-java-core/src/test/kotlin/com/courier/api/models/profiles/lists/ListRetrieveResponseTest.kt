// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles.lists

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.audiences.Paging
import com.courier.api.models.lists.subscriptions.RecipientPreferences
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRetrieveResponseTest {

    @Test
    fun create() {
        val listRetrieveResponse =
            ListRetrieveResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    ListRetrieveResponse.Result.builder()
                        .id("id")
                        .created("created")
                        .name("name")
                        .updated("updated")
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
                .build()

        assertThat(listRetrieveResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(listRetrieveResponse.results())
            .containsExactly(
                ListRetrieveResponse.Result.builder()
                    .id("id")
                    .created("created")
                    .name("name")
                    .updated("updated")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listRetrieveResponse =
            ListRetrieveResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    ListRetrieveResponse.Result.builder()
                        .id("id")
                        .created("created")
                        .name("name")
                        .updated("updated")
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
                .build()

        val roundtrippedListRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listRetrieveResponse),
                jacksonTypeRef<ListRetrieveResponse>(),
            )

        assertThat(roundtrippedListRetrieveResponse).isEqualTo(listRetrieveResponse)
    }
}
