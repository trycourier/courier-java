// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigestInstanceTest {

    @Test
    fun create() {
        val digestInstance =
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

        assertThat(digestInstance.digestInstanceId()).isEqualTo("digest_instance_id")
        assertThat(digestInstance.eventCount()).isEqualTo(0L)
        assertThat(digestInstance.status()).isEqualTo(DigestInstance.Status.IN_PROGRESS)
        assertThat(digestInstance.userId()).isEqualTo("user_id")
        assertThat(digestInstance.categories().getOrNull())
            .containsExactly(
                DigestCategory.builder()
                    .categoryKey("category_key")
                    .retain(DigestCategory.Retain.FIRST)
                    .sortKey("sort_key")
                    .build()
            )
        assertThat(digestInstance.categoryKeyCounts())
            .contains(
                DigestInstance.CategoryKeyCounts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(digestInstance.createdAt()).contains("created_at")
        assertThat(digestInstance.disabled()).contains(true)
        assertThat(digestInstance.tenantId()).contains("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digestInstance =
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

        val roundtrippedDigestInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digestInstance),
                jacksonTypeRef<DigestInstance>(),
            )

        assertThat(roundtrippedDigestInstance).isEqualTo(digestInstance)
    }
}
