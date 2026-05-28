// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTemplateGetResponseTest {

    @Test
    fun create() {
        val journeyTemplateGetResponse =
            JourneyTemplateGetResponse.builder()
                .id("id")
                .brand(JourneyTemplateGetResponse.Brand.builder().id("id").build())
                .content(
                    JourneyTemplateGetResponse.Content.builder()
                        .addElement(
                            ElementalTextNodeWithType.builder()
                                .addChannel("string")
                                .if_("if")
                                .loop("loop")
                                .ref("ref")
                                .type(ElementalTextNodeWithType.Type.TEXT)
                                .build()
                        )
                        .version(JourneyTemplateGetResponse.Content.Version._2022_01_01)
                        .scope(JourneyTemplateGetResponse.Content.Scope.DEFAULT)
                        .build()
                )
                .created(0L)
                .creator("creator")
                .name("name")
                .state(JourneyTemplateGetResponse.State.DRAFT)
                .subscription(
                    JourneyTemplateGetResponse.Subscription.builder().topicId("topic_id").build()
                )
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        assertThat(journeyTemplateGetResponse.id()).isEqualTo("id")
        assertThat(journeyTemplateGetResponse.brand())
            .contains(JourneyTemplateGetResponse.Brand.builder().id("id").build())
        assertThat(journeyTemplateGetResponse.content())
            .isEqualTo(
                JourneyTemplateGetResponse.Content.builder()
                    .addElement(
                        ElementalTextNodeWithType.builder()
                            .addChannel("string")
                            .if_("if")
                            .loop("loop")
                            .ref("ref")
                            .type(ElementalTextNodeWithType.Type.TEXT)
                            .build()
                    )
                    .version(JourneyTemplateGetResponse.Content.Version._2022_01_01)
                    .scope(JourneyTemplateGetResponse.Content.Scope.DEFAULT)
                    .build()
            )
        assertThat(journeyTemplateGetResponse.created()).isEqualTo(0L)
        assertThat(journeyTemplateGetResponse.creator()).isEqualTo("creator")
        assertThat(journeyTemplateGetResponse.name()).isEqualTo("name")
        assertThat(journeyTemplateGetResponse.state())
            .isEqualTo(JourneyTemplateGetResponse.State.DRAFT)
        assertThat(journeyTemplateGetResponse.subscription())
            .contains(JourneyTemplateGetResponse.Subscription.builder().topicId("topic_id").build())
        assertThat(journeyTemplateGetResponse.tags()).containsExactly("string")
        assertThat(journeyTemplateGetResponse.updated()).contains(0L)
        assertThat(journeyTemplateGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyTemplateGetResponse =
            JourneyTemplateGetResponse.builder()
                .id("id")
                .brand(JourneyTemplateGetResponse.Brand.builder().id("id").build())
                .content(
                    JourneyTemplateGetResponse.Content.builder()
                        .addElement(
                            ElementalTextNodeWithType.builder()
                                .addChannel("string")
                                .if_("if")
                                .loop("loop")
                                .ref("ref")
                                .type(ElementalTextNodeWithType.Type.TEXT)
                                .build()
                        )
                        .version(JourneyTemplateGetResponse.Content.Version._2022_01_01)
                        .scope(JourneyTemplateGetResponse.Content.Scope.DEFAULT)
                        .build()
                )
                .created(0L)
                .creator("creator")
                .name("name")
                .state(JourneyTemplateGetResponse.State.DRAFT)
                .subscription(
                    JourneyTemplateGetResponse.Subscription.builder().topicId("topic_id").build()
                )
                .addTag("string")
                .updated(0L)
                .updater("updater")
                .build()

        val roundtrippedJourneyTemplateGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyTemplateGetResponse),
                jacksonTypeRef<JourneyTemplateGetResponse>(),
            )

        assertThat(roundtrippedJourneyTemplateGetResponse).isEqualTo(journeyTemplateGetResponse)
    }
}
