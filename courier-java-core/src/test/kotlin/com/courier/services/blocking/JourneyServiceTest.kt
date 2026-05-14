// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.journeys.CreateJourneyRequest
import com.courier.models.journeys.JourneyApiInvokeTriggerNode
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneyPublishParams
import com.courier.models.journeys.JourneyPublishRequest
import com.courier.models.journeys.JourneyReplaceParams
import com.courier.models.journeys.JourneyRetrieveParams
import com.courier.models.journeys.JourneyState
import com.courier.models.journeys.JourneysInvokeRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JourneyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeyResponse =
            journeyService.create(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey")
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .id("trigger-1")
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .schema(
                                JourneyApiInvokeTriggerNode.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .id("send-1")
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .schema(
                                JourneyApiInvokeTriggerNode.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .enabled(true)
                    .state(JourneyState.DRAFT)
                    .build()
            )

        journeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeyResponse =
            journeyService.retrieve(
                JourneyRetrieveParams.builder().templateId("x").version("published").build()
            )

        journeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeysListResponse =
            journeyService.list(
                JourneyListParams.builder()
                    .cursor("cursor")
                    .version(JourneyListParams.Version.PUBLISHED)
                    .build()
            )

        journeysListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        journeyService.archive("x")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invoke() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeysInvokeResponse =
            journeyService.invoke(
                JourneyInvokeParams.builder()
                    .templateId("templateId")
                    .journeysInvokeRequest(
                        JourneysInvokeRequest.builder()
                            .data(
                                JourneysInvokeRequest.Data.builder()
                                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                                    .putAdditionalProperty("amount", JsonValue.from("bar"))
                                    .build()
                            )
                            .profile(
                                JourneysInvokeRequest.Profile.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .userId("user-123")
                            .build()
                    )
                    .build()
            )

        journeysInvokeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVersions() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeyVersionsListResponse = journeyService.listVersions("x")

        journeyVersionsListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeyResponse =
            journeyService.publish(
                JourneyPublishParams.builder()
                    .templateId("x")
                    .journeyPublishRequest(
                        JourneyPublishRequest.builder().version("v321669910225").build()
                    )
                    .build()
            )

        journeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeyResponse =
            journeyService.replace(
                JourneyReplaceParams.builder()
                    .templateId("x")
                    .createJourneyRequest(
                        CreateJourneyRequest.builder()
                            .name("Welcome Journey v2")
                            .addNode(
                                JourneyApiInvokeTriggerNode.builder()
                                    .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                    .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                    .id("x")
                                    .conditionsOfConditionAtom(listOf("string", "string"))
                                    .schema(
                                        JourneyApiInvokeTriggerNode.Schema.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .enabled(true)
                            .state(JourneyState.DRAFT)
                            .build()
                    )
                    .build()
            )

        journeyResponse.validate()
    }
}
