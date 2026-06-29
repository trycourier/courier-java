// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CancelJourneyRequestTest {

    @Test
    fun ofByCancelationToken() {
        val byCancelationToken =
            CancelJourneyRequest.ByCancelationToken.builder().cancelationToken("x").build()

        val cancelJourneyRequest = CancelJourneyRequest.ofByCancelationToken(byCancelationToken)

        assertThat(cancelJourneyRequest.byCancelationToken()).contains(byCancelationToken)
        assertThat(cancelJourneyRequest.byRunId()).isEmpty
    }

    @Test
    fun ofByCancelationTokenRoundtrip() {
        val jsonMapper = jsonMapper()
        val cancelJourneyRequest =
            CancelJourneyRequest.ofByCancelationToken(
                CancelJourneyRequest.ByCancelationToken.builder().cancelationToken("x").build()
            )

        val roundtrippedCancelJourneyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelJourneyRequest),
                jacksonTypeRef<CancelJourneyRequest>(),
            )

        assertThat(roundtrippedCancelJourneyRequest).isEqualTo(cancelJourneyRequest)
    }

    @Test
    fun ofByRunId() {
        val byRunId = CancelJourneyRequest.ByRunId.builder().runId("x").build()

        val cancelJourneyRequest = CancelJourneyRequest.ofByRunId(byRunId)

        assertThat(cancelJourneyRequest.byCancelationToken()).isEmpty
        assertThat(cancelJourneyRequest.byRunId()).contains(byRunId)
    }

    @Test
    fun ofByRunIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val cancelJourneyRequest =
            CancelJourneyRequest.ofByRunId(
                CancelJourneyRequest.ByRunId.builder().runId("x").build()
            )

        val roundtrippedCancelJourneyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelJourneyRequest),
                jacksonTypeRef<CancelJourneyRequest>(),
            )

        assertThat(roundtrippedCancelJourneyRequest).isEqualTo(cancelJourneyRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val cancelJourneyRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CancelJourneyRequest>())

        val e = assertThrows<CourierInvalidDataException> { cancelJourneyRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
