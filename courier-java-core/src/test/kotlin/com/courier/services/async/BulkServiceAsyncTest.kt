// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.MessageContext
import com.courier.models.ProfilePreferences
import com.courier.models.RecipientPreferences
import com.courier.models.UserRecipient
import com.courier.models.bulk.BulkAddUsersParams
import com.courier.models.bulk.BulkCreateJobParams
import com.courier.models.bulk.BulkListUsersParams
import com.courier.models.bulk.InboundBulkMessage
import com.courier.models.bulk.InboundBulkMessageUser
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun addUsers() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkServiceAsync = client.bulk()

        val future =
            bulkServiceAsync.addUsers(
                BulkAddUsersParams.builder()
                    .jobId("job_id")
                    .addUser(
                        InboundBulkMessageUser.builder()
                            .data(JsonValue.from(mapOf<String, Any>()))
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
                            .profile(JsonValue.from(mapOf<String, Any>()))
                            .recipient("recipient")
                            .to(
                                UserRecipient.builder()
                                    .accountId("account_id")
                                    .context(MessageContext.builder().tenantId("tenant_id").build())
                                    .data(
                                        UserRecipient.Data.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .email("email")
                                    .listId("list_id")
                                    .locale("locale")
                                    .phoneNumber("phone_number")
                                    .preferences(
                                        ProfilePreferences.builder()
                                            .notifications(
                                                ProfilePreferences.Notifications.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(
                                                            mapOf(
                                                                "status" to "OPTED_IN",
                                                                "channel_preferences" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "channel" to
                                                                                "direct_message"
                                                                        )
                                                                    ),
                                                                "rules" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "until" to "until",
                                                                            "start" to "start",
                                                                        )
                                                                    ),
                                                                "source" to "subscription",
                                                            )
                                                        ),
                                                    )
                                                    .build()
                                            )
                                            .categories(
                                                ProfilePreferences.Categories.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(
                                                            mapOf(
                                                                "status" to "OPTED_IN",
                                                                "channel_preferences" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "channel" to
                                                                                "direct_message"
                                                                        )
                                                                    ),
                                                                "rules" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "until" to "until",
                                                                            "start" to "start",
                                                                        )
                                                                    ),
                                                                "source" to "subscription",
                                                            )
                                                        ),
                                                    )
                                                    .build()
                                            )
                                            .templateId("templateId")
                                            .build()
                                    )
                                    .tenantId("tenant_id")
                                    .userId("user_id")
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
    fun createJob() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkServiceAsync = client.bulk()

        val responseFuture =
            bulkServiceAsync.createJob(
                BulkCreateJobParams.builder()
                    .message(
                        InboundBulkMessage.InboundBulkTemplateMessage.builder()
                            .template("template")
                            .brand("brand")
                            .data(
                                InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .event("event")
                            .locale(
                                InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .override(
                                InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listUsers() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkServiceAsync = client.bulk()

        val responseFuture =
            bulkServiceAsync.listUsers(
                BulkListUsersParams.builder().jobId("job_id").cursor("cursor").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveJob() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkServiceAsync = client.bulk()

        val responseFuture = bulkServiceAsync.retrieveJob("job_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun runJob() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkServiceAsync = client.bulk()

        val future = bulkServiceAsync.runJob("job_id")

        val response = future.get()
    }
}
