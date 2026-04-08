// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationElementPutRequestTest {

    @Test
    fun create() {
        val notificationElementPutRequest =
            NotificationElementPutRequest.builder()
                .type("type")
                .addChannel("string")
                .data(
                    NotificationElementPutRequest.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .if_("if")
                .loop("loop")
                .ref("ref")
                .state(NotificationTemplateState.DRAFT)
                .build()

        assertThat(notificationElementPutRequest.type()).isEqualTo("type")
        assertThat(notificationElementPutRequest.channels().getOrNull()).containsExactly("string")
        assertThat(notificationElementPutRequest.data())
            .contains(
                NotificationElementPutRequest.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(notificationElementPutRequest.if_()).contains("if")
        assertThat(notificationElementPutRequest.loop()).contains("loop")
        assertThat(notificationElementPutRequest.ref()).contains("ref")
        assertThat(notificationElementPutRequest.state()).contains(NotificationTemplateState.DRAFT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationElementPutRequest =
            NotificationElementPutRequest.builder()
                .type("type")
                .addChannel("string")
                .data(
                    NotificationElementPutRequest.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .if_("if")
                .loop("loop")
                .ref("ref")
                .state(NotificationTemplateState.DRAFT)
                .build()

        val roundtrippedNotificationElementPutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationElementPutRequest),
                jacksonTypeRef<NotificationElementPutRequest>(),
            )

        assertThat(roundtrippedNotificationElementPutRequest)
            .isEqualTo(notificationElementPutRequest)
    }
}
