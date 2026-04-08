// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementWithChecksumsTest {

    @Test
    fun create() {
        val elementWithChecksums =
            ElementWithChecksums.builder()
                .checksum("checksum")
                .type("type")
                .id("id")
                .elements(listOf())
                .locales(
                    ElementWithChecksums.Locales.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("checksum" to "checksum")),
                        )
                        .build()
                )
                .build()

        assertThat(elementWithChecksums.checksum()).isEqualTo("checksum")
        assertThat(elementWithChecksums.type()).isEqualTo("type")
        assertThat(elementWithChecksums.id()).contains("id")
        assertThat(elementWithChecksums.elements().getOrNull()).containsExactly()
        assertThat(elementWithChecksums.locales())
            .contains(
                ElementWithChecksums.Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("checksum" to "checksum")))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementWithChecksums =
            ElementWithChecksums.builder()
                .checksum("checksum")
                .type("type")
                .id("id")
                .elements(listOf())
                .locales(
                    ElementWithChecksums.Locales.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("checksum" to "checksum")),
                        )
                        .build()
                )
                .build()

        val roundtrippedElementWithChecksums =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementWithChecksums),
                jacksonTypeRef<ElementWithChecksums>(),
            )

        assertThat(roundtrippedElementWithChecksums).isEqualTo(elementWithChecksums)
    }
}
