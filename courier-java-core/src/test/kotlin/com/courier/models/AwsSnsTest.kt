// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AwsSnsTest {

    @Test
    fun create() {
        val awsSns = AwsSns.builder().targetArn("target_arn").build()

        assertThat(awsSns.targetArn()).isEqualTo("target_arn")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val awsSns = AwsSns.builder().targetArn("target_arn").build()

        val roundtrippedAwsSns =
            jsonMapper.readValue(jsonMapper.writeValueAsString(awsSns), jacksonTypeRef<AwsSns>())

        assertThat(roundtrippedAwsSns).isEqualTo(awsSns)
    }
}
