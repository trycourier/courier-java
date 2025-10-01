// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auditevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventRetrieveParamsTest {

    @Test
    fun create() {
        AuditEventRetrieveParams.builder().auditEventId("audit-event-id").build()
    }

    @Test
    fun pathParams() {
        val params = AuditEventRetrieveParams.builder().auditEventId("audit-event-id").build()

        assertThat(params._pathParam(0)).isEqualTo("audit-event-id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
