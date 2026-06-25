// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceRetrieveParamsTest {

    @Test
    fun create() {
        WorkspacePreferenceRetrieveParams.builder().sectionId("section_id").build()
    }

    @Test
    fun pathParams() {
        val params = WorkspacePreferenceRetrieveParams.builder().sectionId("section_id").build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
