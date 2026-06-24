// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionArchiveParamsTest {

    @Test
    fun create() {
        PreferenceSectionArchiveParams.builder().sectionId("section_id").build()
    }

    @Test
    fun pathParams() {
        val params = PreferenceSectionArchiveParams.builder().sectionId("section_id").build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
