// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ElementalMetaNodeWithType
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.broadcasts.BroadcastListParams
import com.courier.models.broadcasts.BroadcastPutContentParams
import com.courier.models.broadcasts.BroadcastRetrieveContentParams
import com.courier.models.broadcasts.BroadcastScheduleParams
import com.courier.models.broadcasts.BroadcastSendParams
import com.courier.models.broadcasts.BroadcastUpdateParams
import com.courier.models.broadcasts.CreateBroadcastRequest
import com.courier.models.broadcasts.ScheduleBroadcastRequest
import com.courier.models.broadcasts.SendBroadcastRequest
import com.courier.models.broadcasts.UpdateBroadcastRequest
import com.courier.models.notifications.NotificationContentPutRequest
import com.courier.models.notifications.NotificationTemplateState
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BroadcastServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.create(
                CreateBroadcastRequest.builder()
                    .channel(CreateBroadcastRequest.Channel.EMAIL)
                    .name("Spring Sale Announcement")
                    .build()
            )

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture = broadcastServiceAsync.retrieve("broadcastId")

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.update(
                BroadcastUpdateParams.builder()
                    .broadcastId("broadcastId")
                    .updateBroadcastRequest(
                        UpdateBroadcastRequest.builder()
                            .name("Spring Sale Announcement (v2)")
                            .build()
                    )
                    .build()
            )

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastListResponseFuture =
            broadcastServiceAsync.list(
                BroadcastListParams.builder().cursor("cursor").limit(1L).build()
            )

        val broadcastListResponse = broadcastListResponseFuture.get()
        broadcastListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture = broadcastServiceAsync.archive("broadcastId")

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture = broadcastServiceAsync.cancel("broadcastId")

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun duplicate() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture = broadcastServiceAsync.duplicate("broadcastId")

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun putContent() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val notificationContentMutationResponseFuture =
            broadcastServiceAsync.putContent(
                BroadcastPutContentParams.builder()
                    .broadcastId("broadcastId")
                    .notificationContentPutRequest(
                        NotificationContentPutRequest.builder()
                            .content(
                                NotificationContentPutRequest.Content.builder()
                                    .addElement(
                                        ElementalMetaNodeWithType.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .type(ElementalMetaNodeWithType.Type.META)
                                            .build()
                                    )
                                    .addElement(
                                        ElementalTextNodeWithType.builder()
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .type(ElementalTextNodeWithType.Type.TEXT)
                                            .build()
                                    )
                                    .version("2022-01-01")
                                    .build()
                            )
                            .state(NotificationTemplateState.DRAFT)
                            .build()
                    )
                    .build()
            )

        val notificationContentMutationResponse = notificationContentMutationResponseFuture.get()
        notificationContentMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val notificationContentGetResponseFuture =
            broadcastServiceAsync.retrieveContent(
                BroadcastRetrieveContentParams.builder()
                    .broadcastId("broadcastId")
                    .version("version")
                    .build()
            )

        val notificationContentGetResponse = notificationContentGetResponseFuture.get()
        notificationContentGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.schedule(
                BroadcastScheduleParams.builder()
                    .broadcastId("broadcastId")
                    .scheduleBroadcastRequest(
                        ScheduleBroadcastRequest.builder()
                            .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                            .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                            .scheduledTo("2026-08-01T15:00:00")
                            .timezone("America/New_York")
                            .build()
                    )
                    .build()
            )

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.send(
                BroadcastSendParams.builder()
                    .broadcastId("broadcastId")
                    .sendBroadcastRequest(
                        SendBroadcastRequest.builder()
                            .recipientId("cool-customers")
                            .recipientType(SendBroadcastRequest.RecipientType.LIST)
                            .build()
                    )
                    .build()
            )

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }
}
