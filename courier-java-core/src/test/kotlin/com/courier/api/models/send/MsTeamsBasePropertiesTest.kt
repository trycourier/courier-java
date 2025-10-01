// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MsTeamsBasePropertiesTest {

    @Test
    fun create() {
        val msTeamsBaseProperties =
            MsTeamsBaseProperties.builder().serviceUrl("service_url").tenantId("tenant_id").build()

        assertThat(msTeamsBaseProperties.serviceUrl()).isEqualTo("service_url")
        assertThat(msTeamsBaseProperties.tenantId()).isEqualTo("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val msTeamsBaseProperties =
            MsTeamsBaseProperties.builder().serviceUrl("service_url").tenantId("tenant_id").build()

        val roundtrippedMsTeamsBaseProperties =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(msTeamsBaseProperties),
                jacksonTypeRef<MsTeamsBaseProperties>(),
            )

        assertThat(roundtrippedMsTeamsBaseProperties).isEqualTo(msTeamsBaseProperties)
    }
}
