// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.courier.models.users.preferences.PreferenceBulkReplaceParams
import com.courier.models.users.preferences.PreferenceBulkUpdateParams
import com.courier.models.users.preferences.PreferenceDeleteTopicParams
import com.courier.models.users.preferences.PreferenceRetrieveParams
import com.courier.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceService = client.users().preferences()

        val preference =
            preferenceService.retrieve(
                PreferenceRetrieveParams.builder().userId("user_id").tenantId("tenant_id").build()
            )

        preference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkReplace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceService = client.users().preferences()

        val response =
            preferenceService.bulkReplace(
                PreferenceBulkReplaceParams.builder()
                    .userId("user_id")
                    .tenantId("tenant_id")
                    .addTopic(
                        PreferenceBulkReplaceParams.Topic.builder()
                            .status(PreferenceBulkReplaceParams.Topic.Status.OPTED_IN)
                            .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                            .addCustomRouting(ChannelClassification.INBOX)
                            .addCustomRouting(ChannelClassification.EMAIL)
                            .hasCustomRouting(true)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkUpdate() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceService = client.users().preferences()

        val response =
            preferenceService.bulkUpdate(
                PreferenceBulkUpdateParams.builder()
                    .userId("user_id")
                    .tenantId("tenant_id")
                    .addTopic(
                        PreferenceBulkUpdateParams.Topic.builder()
                            .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                            .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                            .addCustomRouting(ChannelClassification.INBOX)
                            .addCustomRouting(ChannelClassification.EMAIL)
                            .hasCustomRouting(true)
                            .build()
                    )
                    .addTopic(
                        PreferenceBulkUpdateParams.Topic.builder()
                            .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                            .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                            .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                            .hasCustomRouting(true)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteTopic() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceService = client.users().preferences()

        preferenceService.deleteTopic(
            PreferenceDeleteTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .tenantId("tenant_id")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveTopic() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceService = client.users().preferences()

        val response =
            preferenceService.retrieveTopic(
                PreferenceRetrieveTopicParams.builder()
                    .userId("user_id")
                    .topicId("topic_id")
                    .tenantId("tenant_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateOrCreateTopic() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceService = client.users().preferences()

        val response =
            preferenceService.updateOrCreateTopic(
                PreferenceUpdateOrCreateTopicParams.builder()
                    .userId("user_id")
                    .topicId("topic_id")
                    .tenantId("tenant_id")
                    .topic(
                        PreferenceUpdateOrCreateTopicParams.Topic.builder()
                            .status(PreferenceStatus.OPTED_IN)
                            .addCustomRouting(ChannelClassification.INBOX)
                            .addCustomRouting(ChannelClassification.EMAIL)
                            .hasCustomRouting(true)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
