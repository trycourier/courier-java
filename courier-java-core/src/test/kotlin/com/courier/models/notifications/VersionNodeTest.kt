// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionNodeTest {

    @Test
    fun create() {
        val versionNode =
            VersionNode.builder()
                .created(0L)
                .creator("creator")
                .version("version")
                .hasChanges(true)
                .build()

        assertThat(versionNode.created()).isEqualTo(0L)
        assertThat(versionNode.creator()).isEqualTo("creator")
        assertThat(versionNode.version()).isEqualTo("version")
        assertThat(versionNode.hasChanges()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionNode =
            VersionNode.builder()
                .created(0L)
                .creator("creator")
                .version("version")
                .hasChanges(true)
                .build()

        val roundtrippedVersionNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionNode),
                jacksonTypeRef<VersionNode>(),
            )

        assertThat(roundtrippedVersionNode).isEqualTo(versionNode)
    }
}
