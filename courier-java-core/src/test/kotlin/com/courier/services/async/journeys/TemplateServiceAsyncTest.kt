// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.journeys

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.journeys.JourneyTemplateCreateRequest
import com.courier.models.journeys.JourneyTemplatePublishRequest
import com.courier.models.journeys.JourneyTemplateReplaceRequest
import com.courier.models.journeys.templates.TemplateArchiveParams
import com.courier.models.journeys.templates.TemplateCreateParams
import com.courier.models.journeys.templates.TemplateListParams
import com.courier.models.journeys.templates.TemplateListVersionsParams
import com.courier.models.journeys.templates.TemplatePublishParams
import com.courier.models.journeys.templates.TemplateReplaceParams
import com.courier.models.journeys.templates.TemplateRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val journeyTemplateGetResponseFuture =
            templateServiceAsync.create(
                TemplateCreateParams.builder()
                    .templateId("x")
                    .journeyTemplateCreateRequest(
                        JourneyTemplateCreateRequest.builder()
                            .channel("email")
                            .notification(
                                JourneyTemplateCreateRequest.Notification.builder()
                                    .brand(
                                        JourneyTemplateCreateRequest.Notification.Brand.builder()
                                            .id("id")
                                            .build()
                                    )
                                    .content(
                                        JourneyTemplateCreateRequest.Notification.Content.builder()
                                            .addElement(
                                                ElementalTextNodeWithType.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .type(ElementalTextNodeWithType.Type.TEXT)
                                                    .build()
                                            )
                                            .version(
                                                JourneyTemplateCreateRequest.Notification.Content
                                                    .Version
                                                    ._2022_01_01
                                            )
                                            .scope(
                                                JourneyTemplateCreateRequest.Notification.Content
                                                    .Scope
                                                    .DEFAULT
                                            )
                                            .build()
                                    )
                                    .name("Welcome email")
                                    .subscription(
                                        JourneyTemplateCreateRequest.Notification.Subscription
                                            .builder()
                                            .topicId("topic_id")
                                            .build()
                                    )
                                    .addTag("string")
                                    .build()
                            )
                            .providerKey("x")
                            .state("state")
                            .build()
                    )
                    .build()
            )

        val journeyTemplateGetResponse = journeyTemplateGetResponseFuture.get()
        journeyTemplateGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val journeyTemplateGetResponseFuture =
            templateServiceAsync.retrieve(
                TemplateRetrieveParams.builder().templateId("x").notificationId("x").build()
            )

        val journeyTemplateGetResponse = journeyTemplateGetResponseFuture.get()
        journeyTemplateGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val journeyTemplateListResponseFuture =
            templateServiceAsync.list(
                TemplateListParams.builder().templateId("x").cursor("cursor").limit(1L).build()
            )

        val journeyTemplateListResponse = journeyTemplateListResponseFuture.get()
        journeyTemplateListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val future =
            templateServiceAsync.archive(
                TemplateArchiveParams.builder().templateId("x").notificationId("x").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVersions() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val notificationTemplateVersionListResponseFuture =
            templateServiceAsync.listVersions(
                TemplateListVersionsParams.builder().templateId("x").notificationId("x").build()
            )

        val notificationTemplateVersionListResponse =
            notificationTemplateVersionListResponseFuture.get()
        notificationTemplateVersionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val future =
            templateServiceAsync.publish(
                TemplatePublishParams.builder()
                    .templateId("x")
                    .notificationId("x")
                    .journeyTemplatePublishRequest(
                        JourneyTemplatePublishRequest.builder().version("v321669910225").build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.journeys().templates()

        val journeyTemplateGetResponseFuture =
            templateServiceAsync.replace(
                TemplateReplaceParams.builder()
                    .templateId("x")
                    .notificationId("x")
                    .journeyTemplateReplaceRequest(
                        JourneyTemplateReplaceRequest.builder()
                            .notification(
                                JourneyTemplateReplaceRequest.Notification.builder()
                                    .brand(
                                        JourneyTemplateReplaceRequest.Notification.Brand.builder()
                                            .id("id")
                                            .build()
                                    )
                                    .content(
                                        JourneyTemplateReplaceRequest.Notification.Content.builder()
                                            .addElement(
                                                ElementalTextNodeWithType.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .type(ElementalTextNodeWithType.Type.TEXT)
                                                    .build()
                                            )
                                            .version(
                                                JourneyTemplateReplaceRequest.Notification.Content
                                                    .Version
                                                    ._2022_01_01
                                            )
                                            .scope(
                                                JourneyTemplateReplaceRequest.Notification.Content
                                                    .Scope
                                                    .DEFAULT
                                            )
                                            .build()
                                    )
                                    .name("name")
                                    .subscription(
                                        JourneyTemplateReplaceRequest.Notification.Subscription
                                            .builder()
                                            .topicId("topic_id")
                                            .build()
                                    )
                                    .addTag("string")
                                    .build()
                            )
                            .state("state")
                            .build()
                    )
                    .build()
            )

        val journeyTemplateGetResponse = journeyTemplateGetResponseFuture.get()
        journeyTemplateGetResponse.validate()
    }
}
