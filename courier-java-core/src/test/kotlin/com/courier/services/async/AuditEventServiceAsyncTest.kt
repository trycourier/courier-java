// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.auditevents.AuditEventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuditEventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auditEventServiceAsync = client.auditEvents()

        val auditEventFuture = auditEventServiceAsync.retrieve("audit-event-id")

        val auditEvent = auditEventFuture.get()
        auditEvent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auditEventServiceAsync = client.auditEvents()

        val auditEventsFuture =
            auditEventServiceAsync.list(AuditEventListParams.builder().cursor("cursor").build())

        val auditEvents = auditEventsFuture.get()
        auditEvents.validate()
    }
}
