// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.feedback.FeedbackCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeedbackServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val feedbackServiceAsync = client.feedback()

        val feedbackFuture =
            feedbackServiceAsync.create(
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
            )

        val feedback = feedbackFuture.get()
        feedback.validate()
    }
}
