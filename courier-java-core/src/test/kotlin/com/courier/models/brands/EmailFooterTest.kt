// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailFooterTest {

    @Test
    fun create() {
        val emailFooter =
            EmailFooter.builder()
                .inheritDefault(true)
                .markdown("markdown")
                .social(
                    EmailFooter.Social.builder()
                        .facebook(EmailFooter.Social.Facebook.builder().url("url").build())
                        .instagram(EmailFooter.Social.Instagram.builder().url("url").build())
                        .linkedin(EmailFooter.Social.Linkedin.builder().url("url").build())
                        .medium(EmailFooter.Social.Medium.builder().url("url").build())
                        .twitter(EmailFooter.Social.Twitter.builder().url("url").build())
                        .build()
                )
                .build()

        assertThat(emailFooter.inheritDefault()).contains(true)
        assertThat(emailFooter.markdown()).contains("markdown")
        assertThat(emailFooter.social())
            .contains(
                EmailFooter.Social.builder()
                    .facebook(EmailFooter.Social.Facebook.builder().url("url").build())
                    .instagram(EmailFooter.Social.Instagram.builder().url("url").build())
                    .linkedin(EmailFooter.Social.Linkedin.builder().url("url").build())
                    .medium(EmailFooter.Social.Medium.builder().url("url").build())
                    .twitter(EmailFooter.Social.Twitter.builder().url("url").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailFooter =
            EmailFooter.builder()
                .inheritDefault(true)
                .markdown("markdown")
                .social(
                    EmailFooter.Social.builder()
                        .facebook(EmailFooter.Social.Facebook.builder().url("url").build())
                        .instagram(EmailFooter.Social.Instagram.builder().url("url").build())
                        .linkedin(EmailFooter.Social.Linkedin.builder().url("url").build())
                        .medium(EmailFooter.Social.Medium.builder().url("url").build())
                        .twitter(EmailFooter.Social.Twitter.builder().url("url").build())
                        .build()
                )
                .build()

        val roundtrippedEmailFooter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailFooter),
                jacksonTypeRef<EmailFooter>(),
            )

        assertThat(roundtrippedEmailFooter).isEqualTo(emailFooter)
    }
}
