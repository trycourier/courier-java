// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auditevents

import com.courier.api.core.jsonMapper
import com.courier.api.models.AuditEvent
import com.courier.api.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListResponseTest {

    @Test
    fun create() {
        val auditEventListResponse =
            AuditEventListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    AuditEvent.builder()
                        .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                        .auditEventId("auditEventId")
                        .source("source")
                        .target("target")
                        .timestamp("timestamp")
                        .type("type")
                        .build()
                )
                .build()

        assertThat(auditEventListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(auditEventListResponse.results())
            .containsExactly(
                AuditEvent.builder()
                    .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                    .auditEventId("auditEventId")
                    .source("source")
                    .target("target")
                    .timestamp("timestamp")
                    .type("type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditEventListResponse =
            AuditEventListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    AuditEvent.builder()
                        .actor(AuditEvent.Actor.builder().id("id").email("email").build())
                        .auditEventId("auditEventId")
                        .source("source")
                        .target("target")
                        .timestamp("timestamp")
                        .type("type")
                        .build()
                )
                .build()

        val roundtrippedAuditEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEventListResponse),
                jacksonTypeRef<AuditEventListResponse>(),
            )

        assertThat(roundtrippedAuditEventListResponse).isEqualTo(auditEventListResponse)
    }
}
