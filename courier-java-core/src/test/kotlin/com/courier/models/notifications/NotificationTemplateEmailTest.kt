// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationTemplateEmailTest {

    @Test
    fun create() {
        val notificationTemplateEmail =
            NotificationTemplateEmail.builder()
                .addBcc("string")
                .addCc("string")
                .from("from")
                .replyTo("reply_to")
                .build()

        assertThat(notificationTemplateEmail.bcc().getOrNull()).containsExactly("string")
        assertThat(notificationTemplateEmail.cc().getOrNull()).containsExactly("string")
        assertThat(notificationTemplateEmail.from()).contains("from")
        assertThat(notificationTemplateEmail.replyTo()).contains("reply_to")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateEmail =
            NotificationTemplateEmail.builder()
                .addBcc("string")
                .addCc("string")
                .from("from")
                .replyTo("reply_to")
                .build()

        val roundtrippedNotificationTemplateEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateEmail),
                jacksonTypeRef<NotificationTemplateEmail>(),
            )

        assertThat(roundtrippedNotificationTemplateEmail).isEqualTo(notificationTemplateEmail)
    }
}
