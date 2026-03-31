// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataTest {

    @Test
    fun create() {
        val metadata =
            Metadata.builder()
                .utm(
                    Utm.builder()
                        .campaign("campaign")
                        .content("content")
                        .medium("medium")
                        .source("source")
                        .term("term")
                        .build()
                )
                .build()

        assertThat(metadata.utm())
            .contains(
                Utm.builder()
                    .campaign("campaign")
                    .content("content")
                    .medium("medium")
                    .source("source")
                    .term("term")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadata =
            Metadata.builder()
                .utm(
                    Utm.builder()
                        .campaign("campaign")
                        .content("content")
                        .medium("medium")
                        .source("source")
                        .term("term")
                        .build()
                )
                .build()

        val roundtrippedMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadata),
                jacksonTypeRef<Metadata>(),
            )

        assertThat(roundtrippedMetadata).isEqualTo(metadata)
    }
}
