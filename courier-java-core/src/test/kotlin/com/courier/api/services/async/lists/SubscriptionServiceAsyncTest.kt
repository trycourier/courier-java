// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.lists

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.RecipientPreferences
import com.courier.api.models.lists.PutSubscriptionsRecipient
import com.courier.api.models.lists.subscriptions.SubscriptionAddParams
import com.courier.api.models.lists.subscriptions.SubscriptionListParams
import com.courier.api.models.lists.subscriptions.SubscriptionSubscribeParams
import com.courier.api.models.lists.subscriptions.SubscriptionSubscribeUserParams
import com.courier.api.models.lists.subscriptions.SubscriptionUnsubscribeUserParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.lists().subscriptions()

        val subscriptionsFuture =
            subscriptionServiceAsync.list(
                SubscriptionListParams.builder().listId("list_id").cursor("cursor").build()
            )

        val subscriptions = subscriptionsFuture.get()
        subscriptions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.lists().subscriptions()

        val future =
            subscriptionServiceAsync.add(
                SubscriptionAddParams.builder()
                    .listId("list_id")
                    .addRecipient(
                        PutSubscriptionsRecipient.builder()
                            .recipientId("recipientId")
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

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun subscribe() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.lists().subscriptions()

        val future =
            subscriptionServiceAsync.subscribe(
                SubscriptionSubscribeParams.builder()
                    .listId("list_id")
                    .addRecipient(
                        PutSubscriptionsRecipient.builder()
                            .recipientId("recipientId")
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

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun subscribeUser() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.lists().subscriptions()

        val future =
            subscriptionServiceAsync.subscribeUser(
                SubscriptionSubscribeUserParams.builder()
                    .listId("list_id")
                    .userId("user_id")
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
    fun unsubscribeUser() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.lists().subscriptions()

        val future =
            subscriptionServiceAsync.unsubscribeUser(
                SubscriptionUnsubscribeUserParams.builder()
                    .listId("list_id")
                    .userId("user_id")
                    .build()
            )

        val response = future.get()
    }
}
