// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.profiles.ProfileCreateParams
import com.courier.models.profiles.ProfileReplaceParams
import com.courier.models.profiles.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProfileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.profiles()

        val profileFuture =
            profileServiceAsync.create(
                ProfileCreateParams.builder()
                    .userId("user_id")
                    .profile(
                        ProfileCreateParams.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val profile = profileFuture.get()
        profile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.profiles()

        val profileFuture = profileServiceAsync.retrieve("user_id")

        val profile = profileFuture.get()
        profile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.profiles()

        val future =
            profileServiceAsync.update(
                ProfileUpdateParams.builder()
                    .userId("user_id")
                    .addPatch(
                        ProfileUpdateParams.Patch.builder()
                            .op("op")
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.profiles()

        val future = profileServiceAsync.delete("user_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.profiles()

        val responseFuture =
            profileServiceAsync.replace(
                ProfileReplaceParams.builder()
                    .userId("user_id")
                    .profile(
                        ProfileReplaceParams.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
