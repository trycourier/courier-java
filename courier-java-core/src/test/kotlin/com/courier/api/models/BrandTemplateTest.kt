// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandTemplateTest {

    @Test
    fun create() {
        val brandTemplate =
            BrandTemplate.builder()
                .enabled(true)
                .backgroundColor("backgroundColor")
                .blocksBackgroundColor("blocksBackgroundColor")
                .footer("footer")
                .head("head")
                .header("header")
                .width("width")
                .build()

        assertThat(brandTemplate.enabled()).isEqualTo(true)
        assertThat(brandTemplate.backgroundColor()).contains("backgroundColor")
        assertThat(brandTemplate.blocksBackgroundColor()).contains("blocksBackgroundColor")
        assertThat(brandTemplate.footer()).contains("footer")
        assertThat(brandTemplate.head()).contains("head")
        assertThat(brandTemplate.header()).contains("header")
        assertThat(brandTemplate.width()).contains("width")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandTemplate =
            BrandTemplate.builder()
                .enabled(true)
                .backgroundColor("backgroundColor")
                .blocksBackgroundColor("blocksBackgroundColor")
                .footer("footer")
                .head("head")
                .header("header")
                .width("width")
                .build()

        val roundtrippedBrandTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandTemplate),
                jacksonTypeRef<BrandTemplate>(),
            )

        assertThat(roundtrippedBrandTemplate).isEqualTo(brandTemplate)
    }
}
