// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseTemplateTenantAssociationTest {

    @Test
    fun create() {
        val baseTemplateTenantAssociation =
            BaseTemplateTenantAssociation.builder()
                .id("id")
                .createdAt("created_at")
                .publishedAt("published_at")
                .updatedAt("updated_at")
                .version("version")
                .build()

        assertThat(baseTemplateTenantAssociation.id()).isEqualTo("id")
        assertThat(baseTemplateTenantAssociation.createdAt()).isEqualTo("created_at")
        assertThat(baseTemplateTenantAssociation.publishedAt()).isEqualTo("published_at")
        assertThat(baseTemplateTenantAssociation.updatedAt()).isEqualTo("updated_at")
        assertThat(baseTemplateTenantAssociation.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseTemplateTenantAssociation =
            BaseTemplateTenantAssociation.builder()
                .id("id")
                .createdAt("created_at")
                .publishedAt("published_at")
                .updatedAt("updated_at")
                .version("version")
                .build()

        val roundtrippedBaseTemplateTenantAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseTemplateTenantAssociation),
                jacksonTypeRef<BaseTemplateTenantAssociation>(),
            )

        assertThat(roundtrippedBaseTemplateTenantAssociation)
            .isEqualTo(baseTemplateTenantAssociation)
    }
}
