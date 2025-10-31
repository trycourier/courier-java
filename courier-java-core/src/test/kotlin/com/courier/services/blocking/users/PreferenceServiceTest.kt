// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.courier.models.users.preferences.PreferenceRetrieveParams
import com.courier.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PreferenceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val preferenceService = client.users().preferences()

        val preference =
            preferenceService.retrieve(
                PreferenceRetrieveParams.builder().userId("user_id").tenantId("tenant_id").build()
            )

        preference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTopic() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun updateOrCreateTopic() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
