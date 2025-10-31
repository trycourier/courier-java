// File generated from our OpenAPI spec by Stainless.

package com.courier.models.auditevents

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventTest {

    @Test
    fun create() {
        val auditEvent =
            AuditEvent.builder()
                .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                .auditEventId("auditEventId")
                .source("source")
                .target("target")
                .timestamp("timestamp")
                .type("type")
                .build()

        assertThat(auditEvent.actor())
            .isEqualTo(AuditEvent.Actor.builder().id("id").email("email").build())
        assertThat(auditEvent.auditEventId()).isEqualTo("auditEventId")
        assertThat(auditEvent.source()).isEqualTo("source")
        assertThat(auditEvent.target()).isEqualTo("target")
        assertThat(auditEvent.timestamp()).isEqualTo("timestamp")
        assertThat(auditEvent.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditEvent =
            AuditEvent.builder()
                .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                .auditEventId("auditEventId")
                .source("source")
                .target("target")
                .timestamp("timestamp")
                .type("type")
                .build()

        val roundtrippedAuditEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEvent),
                jacksonTypeRef<AuditEvent>(),
            )

        assertThat(roundtrippedAuditEvent).isEqualTo(auditEvent)
    }
}
