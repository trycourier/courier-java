// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auditevents

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventTest {

    @Test
    fun create() {
        val auditEvent =
            AuditEvent.builder()
                .auditEventId("auditEventId")
                .source("source")
                .timestamp("timestamp")
                .type("type")
                .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                .target(AuditEvent.Target.builder().id("id").email("email").build())
                .build()

        assertThat(auditEvent.auditEventId()).isEqualTo("auditEventId")
        assertThat(auditEvent.source()).isEqualTo("source")
        assertThat(auditEvent.timestamp()).isEqualTo("timestamp")
        assertThat(auditEvent.type()).isEqualTo("type")
        assertThat(auditEvent.actor())
            .contains(AuditEvent.Actor.builder().id("id").email("email").build())
        assertThat(auditEvent.target())
            .contains(AuditEvent.Target.builder().id("id").email("email").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditEvent =
            AuditEvent.builder()
                .auditEventId("auditEventId")
                .source("source")
                .timestamp("timestamp")
                .type("type")
                .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                .target(AuditEvent.Target.builder().id("id").email("email").build())
                .build()

        val roundtrippedAuditEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEvent),
                jacksonTypeRef<AuditEvent>(),
            )

        assertThat(roundtrippedAuditEvent).isEqualTo(auditEvent)
    }
}
