// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.auditevents.AuditEventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuditEventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val auditEventService = client.auditEvents()

        val auditEvent = auditEventService.retrieve("audit-event-id")

        auditEvent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val auditEventService = client.auditEvents()

        val auditEvents =
            auditEventService.list(AuditEventListParams.builder().cursor("cursor").build())

        auditEvents.validate()
    }
}
