// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.profiles.ProfileCreateParams
import com.courier.models.profiles.ProfileReplaceParams
import com.courier.models.profiles.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val profile =
            profileService.create(
                ProfileCreateParams.builder()
                    .userId("user_id")
                    .profile(
                        ProfileCreateParams.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val profile = profileService.retrieve("user_id")

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        profileService.update(
            ProfileUpdateParams.builder()
                .userId("user_id")
                .addPatch(
                    ProfileUpdateParams.Patch.builder().op("op").path("path").value("value").build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        profileService.delete("user_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val response =
            profileService.replace(
                ProfileReplaceParams.builder()
                    .userId("user_id")
                    .profile(
                        ProfileReplaceParams.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
