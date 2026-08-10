// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class NotificationTemplateAliasTest {

    @Test
    fun ofString() {
        val string = "string"

        val notificationTemplateAlias = NotificationTemplateAlias.ofString(string)

        assertThat(notificationTemplateAlias.string()).contains(string)
        assertThat(notificationTemplateAlias.strings()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateAlias = NotificationTemplateAlias.ofString("string")

        val roundtrippedNotificationTemplateAlias =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateAlias),
                jacksonTypeRef<NotificationTemplateAlias>(),
            )

        assertThat(roundtrippedNotificationTemplateAlias).isEqualTo(notificationTemplateAlias)
    }

    @Test
    fun ofStrings() {
        val strings = listOf("string")

        val notificationTemplateAlias = NotificationTemplateAlias.ofStrings(strings)

        assertThat(notificationTemplateAlias.string()).isEmpty
        assertThat(notificationTemplateAlias.strings()).contains(strings)
    }

    @Test
    fun ofStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val notificationTemplateAlias = NotificationTemplateAlias.ofStrings(listOf("string"))

        val roundtrippedNotificationTemplateAlias =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationTemplateAlias),
                jacksonTypeRef<NotificationTemplateAlias>(),
            )

        assertThat(roundtrippedNotificationTemplateAlias).isEqualTo(notificationTemplateAlias)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val notificationTemplateAlias =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<NotificationTemplateAlias>())

        val e = assertThrows<CourierInvalidDataException> { notificationTemplateAlias.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
