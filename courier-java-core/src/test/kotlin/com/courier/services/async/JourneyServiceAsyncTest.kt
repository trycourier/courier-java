// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.journeys.CancelJourneyRequest
import com.courier.models.journeys.CreateJourneyRequest
import com.courier.models.journeys.JourneyApiInvokeTriggerNode
import com.courier.models.journeys.JourneyCancelParams
import com.courier.models.journeys.JourneyCreateParams
import com.courier.models.journeys.JourneyExitNode
import com.courier.models.journeys.JourneyExperiment
import com.courier.models.journeys.JourneyExperimentVariant
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneyNode
import com.courier.models.journeys.JourneyPublishParams
import com.courier.models.journeys.JourneyPublishRequest
import com.courier.models.journeys.JourneyReplaceParams
import com.courier.models.journeys.JourneyRetrieveParams
import com.courier.models.journeys.JourneySendNode
import com.courier.models.journeys.JourneySendNodeToMsTeams
import com.courier.models.journeys.JourneySendNodeToSlackChannel
import com.courier.models.journeys.JourneyState
import com.courier.models.journeys.JourneysInvokeRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JourneyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeyResponseFuture =
            journeyServiceAsync.create(
                JourneyCreateParams.builder()
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
                    .createJourneyRequest(
                        CreateJourneyRequest.builder()
                            .name("Welcome Journey")
                            .nodes(
                                listOf(
                                    JourneyNode.ofApiInvokeTrigger(
                                        JourneyApiInvokeTriggerNode.builder()
                                            .triggerType(
                                                JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE
                                            )
                                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                            .id("trigger-1")
                                            .conditionsOfConditionAtom(listOf("string", "string"))
                                            .schema(
                                                JourneyApiInvokeTriggerNode.Schema.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    ),
                                    JourneyNode.ofSend(
                                        JourneySendNode.builder()
                                            .message(
                                                JourneySendNode.Message.builder()
                                                    .context(
                                                        JourneySendNode.Message.Context.builder()
                                                            .tenantId("x")
                                                            .build()
                                                    )
                                                    .data(
                                                        JourneySendNode.Message.Data.builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from("bar"),
                                                            )
                                                            .build()
                                                    )
                                                    .delay(
                                                        JourneySendNode.Message.Delay.builder()
                                                            .until("x")
                                                            .timezone("x")
                                                            .build()
                                                    )
                                                    .template("nt_01kx4h2jdafq8bk9aftxak4b40")
                                                    .to(
                                                        JourneySendNode.Message.To.builder()
                                                            .emailOverride("x")
                                                            .msTeams(
                                                                JourneySendNodeToMsTeams.builder()
                                                                    .channelId("x")
                                                                    .channelName("x")
                                                                    .email("x")
                                                                    .serviceUrl("x")
                                                                    .teamId("x")
                                                                    .tenantId("x")
                                                                    .userId("x")
                                                                    .build()
                                                            )
                                                            .phoneNumberOverride("x")
                                                            .slack(
                                                                JourneySendNodeToSlackChannel
                                                                    .builder()
                                                                    .channel("x")
                                                                    .accessToken("x")
                                                                    .build()
                                                            )
                                                            .userIdOverride("x")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .type(JourneySendNode.Type.SEND)
                                            .id("send-1")
                                            .channel(JourneySendNode.Channel.EMAIL)
                                            .conditionsOfConditionAtom(listOf("string", "string"))
                                            .experiment(
                                                JourneyExperiment.builder()
                                                    .bucketingKey("x")
                                                    .addVariant(
                                                        JourneyExperimentVariant.builder()
                                                            .id("x")
                                                            .templateId("x")
                                                            .weight(0.0)
                                                            .name("name")
                                                            .build()
                                                    )
                                                    .addVariant(
                                                        JourneyExperimentVariant.builder()
                                                            .id("x")
                                                            .templateId("x")
                                                            .weight(0.0)
                                                            .name("name")
                                                            .build()
                                                    )
                                                    .id("x")
                                                    .name("name")
                                                    .build()
                                            )
                                            .build()
                                    ),
                                    JourneyNode.ofExit(
                                        JourneyExitNode.builder()
                                            .type(JourneyExitNode.Type.EXIT)
                                            .id("exit-1")
                                            .build()
                                    ),
                                )
                            )
                            .enabled(true)
                            .state(JourneyState.DRAFT)
                            .build()
                    )
                    .build()
            )

        val journeyResponse = journeyResponseFuture.get()
        journeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeyResponseFuture =
            journeyServiceAsync.retrieve(
                JourneyRetrieveParams.builder().templateId("x").version("published").build()
            )

        val journeyResponse = journeyResponseFuture.get()
        journeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeysListResponseFuture =
            journeyServiceAsync.list(
                JourneyListParams.builder()
                    .cursor("cursor")
                    .version(JourneyListParams.Version.PUBLISHED)
                    .build()
            )

        val journeysListResponse = journeysListResponseFuture.get()
        journeysListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val future = journeyServiceAsync.archive("x")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val cancelJourneyResponseFuture =
            journeyServiceAsync.cancel(
                JourneyCancelParams.builder()
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
                    .cancelJourneyRequest(
                        CancelJourneyRequest.ByCancelationToken.builder()
                            .cancelationToken("order-1234")
                            .build()
                    )
                    .build()
            )

        val cancelJourneyResponse = cancelJourneyResponseFuture.get()
        cancelJourneyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invoke() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeysInvokeResponseFuture =
            journeyServiceAsync.invoke(
                JourneyInvokeParams.builder()
                    .templateId("templateId")
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
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

        val journeysInvokeResponse = journeysInvokeResponseFuture.get()
        journeysInvokeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVersions() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeyVersionsListResponseFuture = journeyServiceAsync.listVersions("x")

        val journeyVersionsListResponse = journeyVersionsListResponseFuture.get()
        journeyVersionsListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeyResponseFuture =
            journeyServiceAsync.publish(
                JourneyPublishParams.builder()
                    .templateId("x")
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
                    .journeyPublishRequest(
                        JourneyPublishRequest.builder().version("v321669910225").build()
                    )
                    .build()
            )

        val journeyResponse = journeyResponseFuture.get()
        journeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeyResponseFuture =
            journeyServiceAsync.replace(
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

        val journeyResponse = journeyResponseFuture.get()
        journeyResponse.validate()
    }
}
