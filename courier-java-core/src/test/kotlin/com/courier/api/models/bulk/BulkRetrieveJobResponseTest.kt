// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.InboundBulkMessage
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkRetrieveJobResponseTest {

    @Test
    fun create() {
        val bulkRetrieveJobResponse =
            BulkRetrieveJobResponse.builder()
                .job(
                    BulkRetrieveJobResponse.Job.builder()
                        .definition(
                            InboundBulkMessage.InboundBulkTemplateMessage.builder()
                                .template("template")
                                .brand("brand")
                                .data(
                                    InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .event("event")
                                .locale(
                                    InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .override(
                                    InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .enqueued(0L)
                        .failures(0L)
                        .received(0L)
                        .status(BulkRetrieveJobResponse.Job.Status.CREATED)
                        .build()
                )
                .build()

        assertThat(bulkRetrieveJobResponse.job())
            .isEqualTo(
                BulkRetrieveJobResponse.Job.builder()
                    .definition(
                        InboundBulkMessage.InboundBulkTemplateMessage.builder()
                            .template("template")
                            .brand("brand")
                            .data(
                                InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .event("event")
                            .locale(
                                InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .override(
                                InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .enqueued(0L)
                    .failures(0L)
                    .received(0L)
                    .status(BulkRetrieveJobResponse.Job.Status.CREATED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkRetrieveJobResponse =
            BulkRetrieveJobResponse.builder()
                .job(
                    BulkRetrieveJobResponse.Job.builder()
                        .definition(
                            InboundBulkMessage.InboundBulkTemplateMessage.builder()
                                .template("template")
                                .brand("brand")
                                .data(
                                    InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .event("event")
                                .locale(
                                    InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .override(
                                    InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .enqueued(0L)
                        .failures(0L)
                        .received(0L)
                        .status(BulkRetrieveJobResponse.Job.Status.CREATED)
                        .build()
                )
                .build()

        val roundtrippedBulkRetrieveJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkRetrieveJobResponse),
                jacksonTypeRef<BulkRetrieveJobResponse>(),
            )

        assertThat(roundtrippedBulkRetrieveJobResponse).isEqualTo(bulkRetrieveJobResponse)
    }
}
