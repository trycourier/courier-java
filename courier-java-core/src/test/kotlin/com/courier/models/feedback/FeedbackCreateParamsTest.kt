// File generated from our OpenAPI spec by Stainless.

package com.courier.models.feedback

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackCreateParamsTest {

    @Test
    fun create() {
        FeedbackCreateParams.builder()
            .category(FeedbackCreateParams.Category.POSSIBLE_BUG)
            .description(
                "GET /lists/{list_id}/subscriptions returned items: [] with paging.more set to true, and following the cursor returned the remaining subscribers."
            )
            .surface(FeedbackCreateParams.Surface.API)
            .title("List subscriptions returns an empty page with a next cursor")
            .expectedBehavior("Every page before the last one contains at least one item.")
            .harness("Claude Code")
            .location("GET /lists/{list_id}/subscriptions")
            .model("claude-opus-5-5")
            .requestId("1-67f340b1-58b7b231d9485ef0cda0a38b")
            .build()
    }

    @Test
    fun body() {
        val params =
            FeedbackCreateParams.builder()
                .category(FeedbackCreateParams.Category.POSSIBLE_BUG)
                .description(
                    "GET /lists/{list_id}/subscriptions returned items: [] with paging.more set to true, and following the cursor returned the remaining subscribers."
                )
                .surface(FeedbackCreateParams.Surface.API)
                .title("List subscriptions returns an empty page with a next cursor")
                .expectedBehavior("Every page before the last one contains at least one item.")
                .harness("Claude Code")
                .location("GET /lists/{list_id}/subscriptions")
                .model("claude-opus-5-5")
                .requestId("1-67f340b1-58b7b231d9485ef0cda0a38b")
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(FeedbackCreateParams.Category.POSSIBLE_BUG)
        assertThat(body.description())
            .isEqualTo(
                "GET /lists/{list_id}/subscriptions returned items: [] with paging.more set to true, and following the cursor returned the remaining subscribers."
            )
        assertThat(body.surface()).isEqualTo(FeedbackCreateParams.Surface.API)
        assertThat(body.title())
            .isEqualTo("List subscriptions returns an empty page with a next cursor")
        assertThat(body.expectedBehavior())
            .contains("Every page before the last one contains at least one item.")
        assertThat(body.harness()).contains("Claude Code")
        assertThat(body.location()).contains("GET /lists/{list_id}/subscriptions")
        assertThat(body.model()).contains("claude-opus-5-5")
        assertThat(body.requestId()).contains("1-67f340b1-58b7b231d9485ef0cda0a38b")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FeedbackCreateParams.builder()
                .category(FeedbackCreateParams.Category.POSSIBLE_BUG)
                .description(
                    "GET /lists/{list_id}/subscriptions returned items: [] with paging.more set to true, and following the cursor returned the remaining subscribers."
                )
                .surface(FeedbackCreateParams.Surface.API)
                .title("List subscriptions returns an empty page with a next cursor")
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(FeedbackCreateParams.Category.POSSIBLE_BUG)
        assertThat(body.description())
            .isEqualTo(
                "GET /lists/{list_id}/subscriptions returned items: [] with paging.more set to true, and following the cursor returned the remaining subscribers."
            )
        assertThat(body.surface()).isEqualTo(FeedbackCreateParams.Surface.API)
        assertThat(body.title())
            .isEqualTo("List subscriptions returns an empty page with a next cursor")
    }
}
