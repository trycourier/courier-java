// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.users

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.courier.models.users.preferences.PreferenceRetrieveParams
import com.courier.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PreferenceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val preferenceServiceAsync = client.users().preferences()

        val preferenceFuture =
            preferenceServiceAsync.retrieve(
                PreferenceRetrieveParams.builder().userId("user_id").tenantId("tenant_id").build()
            )

        val preference = preferenceFuture.get()
        preference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTopic() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val preferenceServiceAsync = client.users().preferences()

        val responseFuture =
            preferenceServiceAsync.retrieveTopic(
                PreferenceRetrieveTopicParams.builder()
                    .userId("user_id")
                    .topicId("topic_id")
                    .tenantId("tenant_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateOrCreateTopic() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val preferenceServiceAsync = client.users().preferences()

        val responseFuture =
            preferenceServiceAsync.updateOrCreateTopic(
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

        val response = responseFuture.get()
        response.validate()
    }
}
