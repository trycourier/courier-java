// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigestInstanceListResponseTest {

    @Test
    fun create() {
        val digestInstanceListResponse =
            DigestInstanceListResponse.builder()
                .hasMore(true)
                .addItem(
                    DigestInstance.builder()
                        .digestInstanceId("digest_instance_id")
                        .eventCount(0L)
                        .status(DigestInstance.Status.IN_PROGRESS)
                        .userId("user_id")
                        .addCategory(
                            DigestCategory.builder()
                                .categoryKey("category_key")
                                .retain(DigestCategory.Retain.FIRST)
                                .sortKey("sort_key")
                                .build()
                        )
                        .categoryKeyCounts(
                            DigestInstance.CategoryKeyCounts.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .createdAt("created_at")
                        .disabled(true)
                        .tenantId("tenant_id")
                        .build()
                )
                .type(DigestInstanceListResponse.Type.LIST)
                .cursor("cursor")
                .nextUrl("next_url")
                .url("url")
                .build()

        assertThat(digestInstanceListResponse.hasMore()).isEqualTo(true)
        assertThat(digestInstanceListResponse.items())
            .containsExactly(
                DigestInstance.builder()
                    .digestInstanceId("digest_instance_id")
                    .eventCount(0L)
                    .status(DigestInstance.Status.IN_PROGRESS)
                    .userId("user_id")
                    .addCategory(
                        DigestCategory.builder()
                            .categoryKey("category_key")
                            .retain(DigestCategory.Retain.FIRST)
                            .sortKey("sort_key")
                            .build()
                    )
                    .categoryKeyCounts(
                        DigestInstance.CategoryKeyCounts.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .createdAt("created_at")
                    .disabled(true)
                    .tenantId("tenant_id")
                    .build()
            )
        assertThat(digestInstanceListResponse.type())
            .isEqualTo(DigestInstanceListResponse.Type.LIST)
        assertThat(digestInstanceListResponse.cursor()).contains("cursor")
        assertThat(digestInstanceListResponse.nextUrl()).contains("next_url")
        assertThat(digestInstanceListResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digestInstanceListResponse =
            DigestInstanceListResponse.builder()
                .hasMore(true)
                .addItem(
                    DigestInstance.builder()
                        .digestInstanceId("digest_instance_id")
                        .eventCount(0L)
                        .status(DigestInstance.Status.IN_PROGRESS)
                        .userId("user_id")
                        .addCategory(
                            DigestCategory.builder()
                                .categoryKey("category_key")
                                .retain(DigestCategory.Retain.FIRST)
                                .sortKey("sort_key")
                                .build()
                        )
                        .categoryKeyCounts(
                            DigestInstance.CategoryKeyCounts.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .createdAt("created_at")
                        .disabled(true)
                        .tenantId("tenant_id")
                        .build()
                )
                .type(DigestInstanceListResponse.Type.LIST)
                .cursor("cursor")
                .nextUrl("next_url")
                .url("url")
                .build()

        val roundtrippedDigestInstanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digestInstanceListResponse),
                jacksonTypeRef<DigestInstanceListResponse>(),
            )

        assertThat(roundtrippedDigestInstanceListResponse).isEqualTo(digestInstanceListResponse)
    }
}
