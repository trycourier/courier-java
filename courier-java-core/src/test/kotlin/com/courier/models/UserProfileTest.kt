// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserProfileTest {

    @Test
    fun create() {
        val userProfile =
            UserProfile.builder()
                .address(
                    UserProfile.Address.builder()
                        .country("country")
                        .formatted("formatted")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .streetAddress("street_address")
                        .build()
                )
                .airship(
                    AirshipProfile.builder()
                        .audience(AirshipProfileAudience.builder().namedUser("named_user").build())
                        .addDeviceType("string")
                        .build()
                )
                .apn("apn")
                .birthdate("birthdate")
                .custom(
                    UserProfile.Custom.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .discord(SendToChannel.builder().channelId("channel_id").build())
                .email("email")
                .emailVerified(true)
                .expo(Token.builder().token("token").build())
                .facebookPsid("facebookPSID")
                .familyName("family_name")
                .firebaseToken("string")
                .gender("gender")
                .givenName("given_name")
                .intercom(
                    Intercom.builder()
                        .from("from")
                        .to(IntercomRecipient.builder().id("id").build())
                        .build()
                )
                .locale("locale")
                .middleName("middle_name")
                .msTeams(
                    SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .name("name")
                .nickname("nickname")
                .phoneNumber("phone_number")
                .phoneNumberVerified(true)
                .picture("picture")
                .preferredName("preferred_name")
                .profile("profile")
                .slack(
                    SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
                .sub("sub")
                .targetArn("target_arn")
                .updatedAt("updated_at")
                .website("website")
                .zoneinfo("zoneinfo")
                .build()

        assertThat(userProfile.address())
            .contains(
                UserProfile.Address.builder()
                    .country("country")
                    .formatted("formatted")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .streetAddress("street_address")
                    .build()
            )
        assertThat(userProfile.airship())
            .contains(
                AirshipProfile.builder()
                    .audience(AirshipProfileAudience.builder().namedUser("named_user").build())
                    .addDeviceType("string")
                    .build()
            )
        assertThat(userProfile.apn()).contains("apn")
        assertThat(userProfile.birthdate()).contains("birthdate")
        assertThat(userProfile.custom())
            .contains(
                UserProfile.Custom.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(userProfile.discord())
            .contains(
                Discord.ofSendToChannel(SendToChannel.builder().channelId("channel_id").build())
            )
        assertThat(userProfile.email()).contains("email")
        assertThat(userProfile.emailVerified()).contains(true)
        assertThat(userProfile.expo())
            .contains(Expo.ofToken(Token.builder().token("token").build()))
        assertThat(userProfile.facebookPsid()).contains("facebookPSID")
        assertThat(userProfile.familyName()).contains("family_name")
        assertThat(userProfile.firebaseToken())
            .contains(UserProfileFirebaseToken.ofString("string"))
        assertThat(userProfile.gender()).contains("gender")
        assertThat(userProfile.givenName()).contains("given_name")
        assertThat(userProfile.intercom())
            .contains(
                Intercom.builder()
                    .from("from")
                    .to(IntercomRecipient.builder().id("id").build())
                    .build()
            )
        assertThat(userProfile.locale()).contains("locale")
        assertThat(userProfile.middleName()).contains("middle_name")
        assertThat(userProfile.msTeams())
            .contains(
                MsTeams.ofSendToMsTeamsUserId(
                    SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
            )
        assertThat(userProfile.name()).contains("name")
        assertThat(userProfile.nickname()).contains("nickname")
        assertThat(userProfile.phoneNumber()).contains("phone_number")
        assertThat(userProfile.phoneNumberVerified()).contains(true)
        assertThat(userProfile.picture()).contains("picture")
        assertThat(userProfile.preferredName()).contains("preferred_name")
        assertThat(userProfile.profile()).contains("profile")
        assertThat(userProfile.slack())
            .contains(
                Slack.ofSendToSlackChannel(
                    SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
            )
        assertThat(userProfile.sub()).contains("sub")
        assertThat(userProfile.targetArn()).contains("target_arn")
        assertThat(userProfile.updatedAt()).contains("updated_at")
        assertThat(userProfile.website()).contains("website")
        assertThat(userProfile.zoneinfo()).contains("zoneinfo")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userProfile =
            UserProfile.builder()
                .address(
                    UserProfile.Address.builder()
                        .country("country")
                        .formatted("formatted")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .streetAddress("street_address")
                        .build()
                )
                .airship(
                    AirshipProfile.builder()
                        .audience(AirshipProfileAudience.builder().namedUser("named_user").build())
                        .addDeviceType("string")
                        .build()
                )
                .apn("apn")
                .birthdate("birthdate")
                .custom(
                    UserProfile.Custom.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .discord(SendToChannel.builder().channelId("channel_id").build())
                .email("email")
                .emailVerified(true)
                .expo(Token.builder().token("token").build())
                .facebookPsid("facebookPSID")
                .familyName("family_name")
                .firebaseToken("string")
                .gender("gender")
                .givenName("given_name")
                .intercom(
                    Intercom.builder()
                        .from("from")
                        .to(IntercomRecipient.builder().id("id").build())
                        .build()
                )
                .locale("locale")
                .middleName("middle_name")
                .msTeams(
                    SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .name("name")
                .nickname("nickname")
                .phoneNumber("phone_number")
                .phoneNumberVerified(true)
                .picture("picture")
                .preferredName("preferred_name")
                .profile("profile")
                .slack(
                    SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
                .sub("sub")
                .targetArn("target_arn")
                .updatedAt("updated_at")
                .website("website")
                .zoneinfo("zoneinfo")
                .build()

        val roundtrippedUserProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProfile),
                jacksonTypeRef<UserProfile>(),
            )

        assertThat(roundtrippedUserProfile).isEqualTo(userProfile)
    }
}
