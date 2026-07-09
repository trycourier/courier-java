// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.http.QueryParams
import com.courier.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceBulkUpdateParamsTest {

    @Test
    fun create() {
        PreferenceBulkUpdateParams.builder()
            .userId("user_id")
            .tenantId("tenant_id")
            .addTopic(
                PreferenceBulkUpdateParams.Topic.builder()
                    .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                    .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                    .addCustomRouting(ChannelClassification.INBOX)
                    .addCustomRouting(ChannelClassification.EMAIL)
                    .hasCustomRouting(true)
                    .build()
            )
            .addTopic(
                PreferenceBulkUpdateParams.Topic.builder()
                    .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                    .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PreferenceBulkUpdateParams.builder()
                .userId("user_id")
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                        .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                        .build()
                )
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                        .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PreferenceBulkUpdateParams.builder()
                .userId("user_id")
                .tenantId("tenant_id")
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                        .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                        .addCustomRouting(ChannelClassification.INBOX)
                        .addCustomRouting(ChannelClassification.EMAIL)
                        .hasCustomRouting(true)
                        .build()
                )
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                        .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("tenant_id", "tenant_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PreferenceBulkUpdateParams.builder()
                .userId("user_id")
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                        .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                        .build()
                )
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                        .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PreferenceBulkUpdateParams.builder()
                .userId("user_id")
                .tenantId("tenant_id")
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                        .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                        .addCustomRouting(ChannelClassification.INBOX)
                        .addCustomRouting(ChannelClassification.EMAIL)
                        .hasCustomRouting(true)
                        .build()
                )
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                        .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.topics())
            .containsExactly(
                PreferenceBulkUpdateParams.Topic.builder()
                    .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                    .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                    .addCustomRouting(ChannelClassification.INBOX)
                    .addCustomRouting(ChannelClassification.EMAIL)
                    .hasCustomRouting(true)
                    .build(),
                PreferenceBulkUpdateParams.Topic.builder()
                    .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                    .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PreferenceBulkUpdateParams.builder()
                .userId("user_id")
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                        .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                        .build()
                )
                .addTopic(
                    PreferenceBulkUpdateParams.Topic.builder()
                        .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                        .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.topics())
            .containsExactly(
                PreferenceBulkUpdateParams.Topic.builder()
                    .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_IN)
                    .topicId("74Q4QGFBEX481DP6JRPMV751H4XT")
                    .build(),
                PreferenceBulkUpdateParams.Topic.builder()
                    .status(PreferenceBulkUpdateParams.Topic.Status.OPTED_OUT)
                    .topicId("5Q4QGFBEX481DP6JRPMV751H4YU")
                    .build(),
            )
    }
}
