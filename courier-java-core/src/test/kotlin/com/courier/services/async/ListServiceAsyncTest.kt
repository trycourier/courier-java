// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.RecipientPreferences
import com.courier.models.lists.ListListParams
import com.courier.models.lists.ListRestoreParams
import com.courier.models.lists.ListUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ListServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.lists()

        val subscriptionListFuture = listServiceAsync.retrieve("list_id")

        val subscriptionList = subscriptionListFuture.get()
        subscriptionList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.lists()

        val future =
            listServiceAsync.update(
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

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.lists()

        val listsFuture =
            listServiceAsync.list(
                ListListParams.builder().cursor("cursor").pattern("pattern").build()
            )

        val lists = listsFuture.get()
        lists.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.lists()

        val future = listServiceAsync.delete("list_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun restore() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.lists()

        val future =
            listServiceAsync.restore(
                ListRestoreParams.builder()
                    .listId("list_id")
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = future.get()
    }
}
