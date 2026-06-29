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

internal class CancelJourneyResponseTest {

    @Test
    fun ofTokenBranch() {
        val tokenBranch =
            CancelJourneyResponse.TokenBranch.builder()
                .cancelationToken("cancelation_token")
                .build()

        val cancelJourneyResponse = CancelJourneyResponse.ofTokenBranch(tokenBranch)

        assertThat(cancelJourneyResponse.tokenBranch()).contains(tokenBranch)
        assertThat(cancelJourneyResponse.runIdBranch()).isEmpty
    }

    @Test
    fun ofTokenBranchRoundtrip() {
        val jsonMapper = jsonMapper()
        val cancelJourneyResponse =
            CancelJourneyResponse.ofTokenBranch(
                CancelJourneyResponse.TokenBranch.builder()
                    .cancelationToken("cancelation_token")
                    .build()
            )

        val roundtrippedCancelJourneyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelJourneyResponse),
                jacksonTypeRef<CancelJourneyResponse>(),
            )

        assertThat(roundtrippedCancelJourneyResponse).isEqualTo(cancelJourneyResponse)
    }

    @Test
    fun ofRunIdBranch() {
        val runIdBranch =
            CancelJourneyResponse.RunIdBranch.builder().runId("run_id").status("status").build()

        val cancelJourneyResponse = CancelJourneyResponse.ofRunIdBranch(runIdBranch)

        assertThat(cancelJourneyResponse.tokenBranch()).isEmpty
        assertThat(cancelJourneyResponse.runIdBranch()).contains(runIdBranch)
    }

    @Test
    fun ofRunIdBranchRoundtrip() {
        val jsonMapper = jsonMapper()
        val cancelJourneyResponse =
            CancelJourneyResponse.ofRunIdBranch(
                CancelJourneyResponse.RunIdBranch.builder().runId("run_id").status("status").build()
            )

        val roundtrippedCancelJourneyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelJourneyResponse),
                jacksonTypeRef<CancelJourneyResponse>(),
            )

        assertThat(roundtrippedCancelJourneyResponse).isEqualTo(cancelJourneyResponse)
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
        val cancelJourneyResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CancelJourneyResponse>())

        val e = assertThrows<CourierInvalidDataException> { cancelJourneyResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
