// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.models.auditevents.AuditEventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuditEventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auditEventService = client.auditEvents()

        val auditEvent = auditEventService.retrieve("audit-event-id")

        auditEvent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auditEventService = client.auditEvents()

        val auditEvents =
            auditEventService.list(AuditEventListParams.builder().cursor("cursor").build())

        auditEvents.validate()
    }
}
