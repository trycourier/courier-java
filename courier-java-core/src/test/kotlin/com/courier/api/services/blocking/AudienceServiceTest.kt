// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.models.Filter
import com.courier.api.models.audiences.AudienceListMembersParams
import com.courier.api.models.audiences.AudienceListParams
import com.courier.api.models.audiences.AudienceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudienceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceService = client.audiences()

        val audience = audienceService.retrieve("audience_id")

        audience.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceService = client.audiences()

        val audience =
            audienceService.update(
                AudienceUpdateParams.builder()
                    .audienceId("audience_id")
                    .description("description")
                    .filter(
                        Filter.builder()
                            .operator(Filter.Operator.ENDS_WITH)
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .name("name")
                    .build()
            )

        audience.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceService = client.audiences()

        val audiences = audienceService.list(AudienceListParams.builder().cursor("cursor").build())

        audiences.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceService = client.audiences()

        audienceService.delete("audience_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listMembers() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceService = client.audiences()

        val response =
            audienceService.listMembers(
                AudienceListMembersParams.builder()
                    .audienceId("audience_id")
                    .cursor("cursor")
                    .build()
            )

        response.validate()
    }
}
