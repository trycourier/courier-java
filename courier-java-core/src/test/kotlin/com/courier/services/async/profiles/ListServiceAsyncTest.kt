// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.profiles

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.RecipientPreferences
import com.courier.models.profiles.SubscribeToListsRequestItem
import com.courier.models.profiles.lists.ListRetrieveParams
import com.courier.models.profiles.lists.ListSubscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val listServiceAsync = client.profiles().lists()

        val listFuture =
            listServiceAsync.retrieve(
                ListRetrieveParams.builder().userId("user_id").cursor("cursor").build()
            )

        val list = listFuture.get()
        list.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val listServiceAsync = client.profiles().lists()

        val listFuture = listServiceAsync.delete("user_id")

        val list = listFuture.get()
        list.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun subscribe() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val listServiceAsync = client.profiles().lists()

        val responseFuture =
            listServiceAsync.subscribe(
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

        val response = responseFuture.get()
        response.validate()
    }
}
