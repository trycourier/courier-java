// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleTest {

    @Test
    fun create() {
        val rule = Rule.builder().until("until").start("start").build()

        assertThat(rule.until()).isEqualTo("until")
        assertThat(rule.start()).contains("start")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rule = Rule.builder().until("until").start("start").build()

        val roundtrippedRule =
            jsonMapper.readValue(jsonMapper.writeValueAsString(rule), jacksonTypeRef<Rule>())

        assertThat(roundtrippedRule).isEqualTo(rule)
    }
}
