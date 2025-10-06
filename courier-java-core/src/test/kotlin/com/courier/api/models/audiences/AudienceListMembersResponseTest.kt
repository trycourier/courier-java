// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.audiences

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudienceListMembersResponseTest {

    @Test
    fun create() {
        val audienceListMembersResponse =
            AudienceListMembersResponse.builder()
                .addItem(
                    AudienceListMembersResponse.Item.builder()
                        .addedAt("added_at")
                        .audienceId("audience_id")
                        .audienceVersion(0L)
                        .memberId("member_id")
                        .reason("reason")
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        assertThat(audienceListMembersResponse.items())
            .containsExactly(
                AudienceListMembersResponse.Item.builder()
                    .addedAt("added_at")
                    .audienceId("audience_id")
                    .audienceVersion(0L)
                    .memberId("member_id")
                    .reason("reason")
                    .build()
            )
        assertThat(audienceListMembersResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audienceListMembersResponse =
            AudienceListMembersResponse.builder()
                .addItem(
                    AudienceListMembersResponse.Item.builder()
                        .addedAt("added_at")
                        .audienceId("audience_id")
                        .audienceVersion(0L)
                        .memberId("member_id")
                        .reason("reason")
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        val roundtrippedAudienceListMembersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audienceListMembersResponse),
                jacksonTypeRef<AudienceListMembersResponse>(),
            )

        assertThat(roundtrippedAudienceListMembersResponse).isEqualTo(audienceListMembersResponse)
    }
}
