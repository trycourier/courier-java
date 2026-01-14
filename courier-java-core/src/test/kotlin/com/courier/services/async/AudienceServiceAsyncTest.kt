// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.AudienceFilterConfig
import com.courier.models.FilterConfig
import com.courier.models.audiences.AudienceListMembersParams
import com.courier.models.audiences.AudienceListParams
import com.courier.models.audiences.AudienceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudienceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceServiceAsync = client.audiences()

        val audienceFuture = audienceServiceAsync.retrieve("audience_id")

        val audience = audienceFuture.get()
        audience.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceServiceAsync = client.audiences()

        val audienceFuture =
            audienceServiceAsync.update(
                AudienceUpdateParams.builder()
                    .audienceId("audience_id")
                    .description("description")
                    .filter(
                        AudienceFilterConfig.builder()
                            .addFilter(
                                FilterConfig.builder()
                                    .operator("operator")
                                    .filters(listOf())
                                    .path("path")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .name("name")
                    .operator(AudienceUpdateParams.Operator.AND)
                    .build()
            )

        val audience = audienceFuture.get()
        audience.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceServiceAsync = client.audiences()

        val audiencesFuture =
            audienceServiceAsync.list(AudienceListParams.builder().cursor("cursor").build())

        val audiences = audiencesFuture.get()
        audiences.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceServiceAsync = client.audiences()

        val future = audienceServiceAsync.delete("audience_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listMembers() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audienceServiceAsync = client.audiences()

        val responseFuture =
            audienceServiceAsync.listMembers(
                AudienceListMembersParams.builder()
                    .audienceId("audience_id")
                    .cursor("cursor")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
