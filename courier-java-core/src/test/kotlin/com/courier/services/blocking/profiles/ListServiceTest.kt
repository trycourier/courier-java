// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.profiles

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.RecipientPreferences
import com.courier.models.profiles.SubscribeToListsRequestItem
import com.courier.models.profiles.lists.ListRetrieveParams
import com.courier.models.profiles.lists.ListSubscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.profiles().lists()

        val list =
            listService.retrieve(
                ListRetrieveParams.builder().userId("user_id").cursor("cursor").build()
            )

        list.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.profiles().lists()

        val list = listService.delete("user_id")

        list.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun subscribe() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.profiles().lists()

        val response =
            listService.subscribe(
                ListSubscribeParams.builder()
                    .userId("user_id")
                    .addList(
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
            )

        response.validate()
    }
}
