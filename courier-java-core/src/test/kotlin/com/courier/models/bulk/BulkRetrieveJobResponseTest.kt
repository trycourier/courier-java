// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ElementalContentSugar
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
                            InboundBulkMessage.builder()
                                .event("event")
                                .brand("brand")
                                .content(
                                    ElementalContentSugar.builder()
                                        .body("body")
                                        .title("title")
                                        .build()
                                )
                                .data(
                                    InboundBulkMessage.Data.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .locale(
                                    InboundBulkMessage.Locale.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .override(
                                    InboundBulkMessage.Override.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .template("template")
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
                        InboundBulkMessage.builder()
                            .event("event")
                            .brand("brand")
                            .content(
                                ElementalContentSugar.builder().body("body").title("title").build()
                            )
                            .data(
                                InboundBulkMessage.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .locale(
                                InboundBulkMessage.Locale.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .override(
                                InboundBulkMessage.Override.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .template("template")
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
                            InboundBulkMessage.builder()
                                .event("event")
                                .brand("brand")
                                .content(
                                    ElementalContentSugar.builder()
                                        .body("body")
                                        .title("title")
                                        .build()
                                )
                                .data(
                                    InboundBulkMessage.Data.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .locale(
                                    InboundBulkMessage.Locale.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .override(
                                    InboundBulkMessage.Override.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .template("template")
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
