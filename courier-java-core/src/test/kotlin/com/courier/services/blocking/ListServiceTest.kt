// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.RecipientPreferences
import com.courier.models.lists.ListListParams
import com.courier.models.lists.ListRestoreParams
import com.courier.models.lists.ListUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.lists()

        val subscriptionList = listService.retrieve("list_id")

        subscriptionList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.lists()

        listService.update(
            ListUpdateParams.builder()
                .listId("list_id")
                .name("name")
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
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.lists()

        val lists =
            listService.list(ListListParams.builder().cursor("cursor").pattern("pattern").build())

        lists.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.lists()

        listService.delete("list_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restore() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.lists()

        listService.restore(
            ListRestoreParams.builder()
                .listId("list_id")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }
}
