// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocalesTest {

    @Test
    fun create() {
        val locales =
            Locales.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locales =
            Locales.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                .build()

        val roundtrippedLocales =
            jsonMapper.readValue(jsonMapper.writeValueAsString(locales), jacksonTypeRef<Locales>())

        assertThat(roundtrippedLocales).isEqualTo(locales)
    }
}
