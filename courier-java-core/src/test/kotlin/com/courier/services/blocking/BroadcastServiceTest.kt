// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
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

internal class BroadcastServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast =
            broadcastService.create(
                CreateBroadcastRequest.builder()
                    .channel(CreateBroadcastRequest.Channel.EMAIL)
                    .name("Spring Sale Announcement")
                    .build()
            )

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast = broadcastService.retrieve("broadcastId")

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast =
            broadcastService.update(
                BroadcastUpdateParams.builder()
                    .broadcastId("broadcastId")
                    .updateBroadcastRequest(
                        UpdateBroadcastRequest.builder()
                            .name("Spring Sale Announcement (v2)")
                            .build()
                    )
                    .build()
            )

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcastListResponse =
            broadcastService.list(BroadcastListParams.builder().cursor("cursor").limit(1L).build())

        broadcastListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast = broadcastService.archive("broadcastId")

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast = broadcastService.cancel("broadcastId")

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun duplicate() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast = broadcastService.duplicate("broadcastId")

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun putContent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val notificationContentMutationResponse =
            broadcastService.putContent(
                BroadcastPutContentParams.builder()
                    .broadcastId("broadcastId")
                    .notificationContentPutRequest(
                        NotificationContentPutRequest.builder()
                            .content(
                                NotificationContentPutRequest.Content.builder()
                                    .addElement(
                                        ElementalMetaNodeWithType.builder()
                                            .type(ElementalMetaNodeWithType.Type.META)
                                            .build()
                                    )
                                    .addElement(
                                        ElementalTextNodeWithType.builder()
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

        notificationContentMutationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val notificationContentGetResponse =
            broadcastService.retrieveContent(
                BroadcastRetrieveContentParams.builder()
                    .broadcastId("broadcastId")
                    .version("version")
                    .build()
            )

        notificationContentGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast =
            broadcastService.schedule(
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

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast =
            broadcastService.send(
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

        broadcast.validate()
    }
}
