// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val address: JsonField<Address>,
    private val airship: JsonField<AirshipProfile>,
    private val apn: JsonField<String>,
    private val birthdate: JsonField<String>,
    private val custom: JsonField<Custom>,
    private val discord: JsonField<Discord>,
    private val email: JsonField<String>,
    private val emailVerified: JsonField<Boolean>,
    private val expo: JsonField<Expo>,
    private val facebookPsid: JsonField<String>,
    private val familyName: JsonField<String>,
    private val firebaseToken: JsonField<UserProfileFirebaseToken>,
    private val gender: JsonField<String>,
    private val givenName: JsonField<String>,
    private val intercom: JsonField<Intercom>,
    private val locale: JsonField<String>,
    private val middleName: JsonField<String>,
    private val msTeams: JsonField<MsTeams>,
    private val name: JsonField<String>,
    private val nickname: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val phoneNumberVerified: JsonField<Boolean>,
    private val picture: JsonField<String>,
    private val preferredName: JsonField<String>,
    private val profile: JsonField<String>,
    private val slack: JsonField<Slack>,
    private val sub: JsonField<String>,
    private val targetArn: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val website: JsonField<String>,
    private val zoneinfo: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("airship")
        @ExcludeMissing
        airship: JsonField<AirshipProfile> = JsonMissing.of(),
        @JsonProperty("apn") @ExcludeMissing apn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("birthdate") @ExcludeMissing birthdate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom") @ExcludeMissing custom: JsonField<Custom> = JsonMissing.of(),
        @JsonProperty("discord") @ExcludeMissing discord: JsonField<Discord> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_verified")
        @ExcludeMissing
        emailVerified: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("expo") @ExcludeMissing expo: JsonField<Expo> = JsonMissing.of(),
        @JsonProperty("facebookPSID")
        @ExcludeMissing
        facebookPsid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("family_name")
        @ExcludeMissing
        familyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firebaseToken")
        @ExcludeMissing
        firebaseToken: JsonField<UserProfileFirebaseToken> = JsonMissing.of(),
        @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
        @JsonProperty("given_name") @ExcludeMissing givenName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intercom") @ExcludeMissing intercom: JsonField<Intercom> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ms_teams") @ExcludeMissing msTeams: JsonField<MsTeams> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_verified")
        @ExcludeMissing
        phoneNumberVerified: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("picture") @ExcludeMissing picture: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferred_name")
        @ExcludeMissing
        preferredName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profile") @ExcludeMissing profile: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slack") @ExcludeMissing slack: JsonField<Slack> = JsonMissing.of(),
        @JsonProperty("sub") @ExcludeMissing sub: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_arn") @ExcludeMissing targetArn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zoneinfo") @ExcludeMissing zoneinfo: JsonField<String> = JsonMissing.of(),
    ) : this(
        address,
        airship,
        apn,
        birthdate,
        custom,
        discord,
        email,
        emailVerified,
        expo,
        facebookPsid,
        familyName,
        firebaseToken,
        gender,
        givenName,
        intercom,
        locale,
        middleName,
        msTeams,
        name,
        nickname,
        phoneNumber,
        phoneNumberVerified,
        picture,
        preferredName,
        profile,
        slack,
        sub,
        targetArn,
        updatedAt,
        website,
        zoneinfo,
        mutableMapOf(),
    )

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<Address> = address.getOptional("address")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun airship(): Optional<AirshipProfile> = airship.getOptional("airship")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apn(): Optional<String> = apn.getOptional("apn")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun birthdate(): Optional<String> = birthdate.getOptional("birthdate")

    /**
     * A free form object. Due to a limitation of the API Explorer, you can only enter string
     * key/values below, but this API accepts more complex object structures.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun custom(): Optional<Custom> = custom.getOptional("custom")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discord(): Optional<Discord> = discord.getOptional("discord")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailVerified(): Optional<Boolean> = emailVerified.getOptional("email_verified")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expo(): Optional<Expo> = expo.getOptional("expo")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun facebookPsid(): Optional<String> = facebookPsid.getOptional("facebookPSID")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun familyName(): Optional<String> = familyName.getOptional("family_name")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firebaseToken(): Optional<UserProfileFirebaseToken> =
        firebaseToken.getOptional("firebaseToken")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gender(): Optional<String> = gender.getOptional("gender")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun givenName(): Optional<String> = givenName.getOptional("given_name")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intercom(): Optional<Intercom> = intercom.getOptional("intercom")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = locale.getOptional("locale")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = middleName.getOptional("middle_name")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun msTeams(): Optional<MsTeams> = msTeams.getOptional("ms_teams")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nickname(): Optional<String> = nickname.getOptional("nickname")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberVerified(): Optional<Boolean> =
        phoneNumberVerified.getOptional("phone_number_verified")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun picture(): Optional<String> = picture.getOptional("picture")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredName(): Optional<String> = preferredName.getOptional("preferred_name")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profile(): Optional<String> = profile.getOptional("profile")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slack(): Optional<Slack> = slack.getOptional("slack")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sub(): Optional<String> = sub.getOptional("sub")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetArn(): Optional<String> = targetArn.getOptional("target_arn")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = website.getOptional("website")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zoneinfo(): Optional<String> = zoneinfo.getOptional("zoneinfo")

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [airship].
     *
     * Unlike [airship], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("airship") @ExcludeMissing fun _airship(): JsonField<AirshipProfile> = airship

    /**
     * Returns the raw JSON value of [apn].
     *
     * Unlike [apn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apn") @ExcludeMissing fun _apn(): JsonField<String> = apn

    /**
     * Returns the raw JSON value of [birthdate].
     *
     * Unlike [birthdate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("birthdate") @ExcludeMissing fun _birthdate(): JsonField<String> = birthdate

    /**
     * Returns the raw JSON value of [custom].
     *
     * Unlike [custom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom") @ExcludeMissing fun _custom(): JsonField<Custom> = custom

    /**
     * Returns the raw JSON value of [discord].
     *
     * Unlike [discord], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discord") @ExcludeMissing fun _discord(): JsonField<Discord> = discord

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [emailVerified].
     *
     * Unlike [emailVerified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_verified")
    @ExcludeMissing
    fun _emailVerified(): JsonField<Boolean> = emailVerified

    /**
     * Returns the raw JSON value of [expo].
     *
     * Unlike [expo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expo") @ExcludeMissing fun _expo(): JsonField<Expo> = expo

    /**
     * Returns the raw JSON value of [facebookPsid].
     *
     * Unlike [facebookPsid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("facebookPSID")
    @ExcludeMissing
    fun _facebookPsid(): JsonField<String> = facebookPsid

    /**
     * Returns the raw JSON value of [familyName].
     *
     * Unlike [familyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family_name") @ExcludeMissing fun _familyName(): JsonField<String> = familyName

    /**
     * Returns the raw JSON value of [firebaseToken].
     *
     * Unlike [firebaseToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firebaseToken")
    @ExcludeMissing
    fun _firebaseToken(): JsonField<UserProfileFirebaseToken> = firebaseToken

    /**
     * Returns the raw JSON value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

    /**
     * Returns the raw JSON value of [givenName].
     *
     * Unlike [givenName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("given_name") @ExcludeMissing fun _givenName(): JsonField<String> = givenName

    /**
     * Returns the raw JSON value of [intercom].
     *
     * Unlike [intercom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intercom") @ExcludeMissing fun _intercom(): JsonField<Intercom> = intercom

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

    /**
     * Returns the raw JSON value of [msTeams].
     *
     * Unlike [msTeams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ms_teams") @ExcludeMissing fun _msTeams(): JsonField<MsTeams> = msTeams

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [phoneNumberVerified].
     *
     * Unlike [phoneNumberVerified], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phone_number_verified")
    @ExcludeMissing
    fun _phoneNumberVerified(): JsonField<Boolean> = phoneNumberVerified

    /**
     * Returns the raw JSON value of [picture].
     *
     * Unlike [picture], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("picture") @ExcludeMissing fun _picture(): JsonField<String> = picture

    /**
     * Returns the raw JSON value of [preferredName].
     *
     * Unlike [preferredName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferred_name")
    @ExcludeMissing
    fun _preferredName(): JsonField<String> = preferredName

    /**
     * Returns the raw JSON value of [profile].
     *
     * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<String> = profile

    /**
     * Returns the raw JSON value of [slack].
     *
     * Unlike [slack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slack") @ExcludeMissing fun _slack(): JsonField<Slack> = slack

    /**
     * Returns the raw JSON value of [sub].
     *
     * Unlike [sub], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub") @ExcludeMissing fun _sub(): JsonField<String> = sub

    /**
     * Returns the raw JSON value of [targetArn].
     *
     * Unlike [targetArn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_arn") @ExcludeMissing fun _targetArn(): JsonField<String> = targetArn

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

    /**
     * Returns the raw JSON value of [zoneinfo].
     *
     * Unlike [zoneinfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneinfo") @ExcludeMissing fun _zoneinfo(): JsonField<String> = zoneinfo

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [UserProfile]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserProfile]. */
    class Builder internal constructor() {

        private var address: JsonField<Address> = JsonMissing.of()
        private var airship: JsonField<AirshipProfile> = JsonMissing.of()
        private var apn: JsonField<String> = JsonMissing.of()
        private var birthdate: JsonField<String> = JsonMissing.of()
        private var custom: JsonField<Custom> = JsonMissing.of()
        private var discord: JsonField<Discord> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var emailVerified: JsonField<Boolean> = JsonMissing.of()
        private var expo: JsonField<Expo> = JsonMissing.of()
        private var facebookPsid: JsonField<String> = JsonMissing.of()
        private var familyName: JsonField<String> = JsonMissing.of()
        private var firebaseToken: JsonField<UserProfileFirebaseToken> = JsonMissing.of()
        private var gender: JsonField<String> = JsonMissing.of()
        private var givenName: JsonField<String> = JsonMissing.of()
        private var intercom: JsonField<Intercom> = JsonMissing.of()
        private var locale: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var msTeams: JsonField<MsTeams> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var phoneNumberVerified: JsonField<Boolean> = JsonMissing.of()
        private var picture: JsonField<String> = JsonMissing.of()
        private var preferredName: JsonField<String> = JsonMissing.of()
        private var profile: JsonField<String> = JsonMissing.of()
        private var slack: JsonField<Slack> = JsonMissing.of()
        private var sub: JsonField<String> = JsonMissing.of()
        private var targetArn: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var zoneinfo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userProfile: UserProfile) = apply {
            address = userProfile.address
            airship = userProfile.airship
            apn = userProfile.apn
            birthdate = userProfile.birthdate
            custom = userProfile.custom
            discord = userProfile.discord
            email = userProfile.email
            emailVerified = userProfile.emailVerified
            expo = userProfile.expo
            facebookPsid = userProfile.facebookPsid
            familyName = userProfile.familyName
            firebaseToken = userProfile.firebaseToken
            gender = userProfile.gender
            givenName = userProfile.givenName
            intercom = userProfile.intercom
            locale = userProfile.locale
            middleName = userProfile.middleName
            msTeams = userProfile.msTeams
            name = userProfile.name
            nickname = userProfile.nickname
            phoneNumber = userProfile.phoneNumber
            phoneNumberVerified = userProfile.phoneNumberVerified
            picture = userProfile.picture
            preferredName = userProfile.preferredName
            profile = userProfile.profile
            slack = userProfile.slack
            sub = userProfile.sub
            targetArn = userProfile.targetArn
            updatedAt = userProfile.updatedAt
            website = userProfile.website
            zoneinfo = userProfile.zoneinfo
            additionalProperties = userProfile.additionalProperties.toMutableMap()
        }

        fun address(address: Address?) = address(JsonField.ofNullable(address))

        /** Alias for calling [Builder.address] with `address.orElse(null)`. */
        fun address(address: Optional<Address>) = address(address.getOrNull())

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        fun airship(airship: AirshipProfile?) = airship(JsonField.ofNullable(airship))

        /** Alias for calling [Builder.airship] with `airship.orElse(null)`. */
        fun airship(airship: Optional<AirshipProfile>) = airship(airship.getOrNull())

        /**
         * Sets [Builder.airship] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airship] with a well-typed [AirshipProfile] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun airship(airship: JsonField<AirshipProfile>) = apply { this.airship = airship }

        fun apn(apn: String?) = apn(JsonField.ofNullable(apn))

        /** Alias for calling [Builder.apn] with `apn.orElse(null)`. */
        fun apn(apn: Optional<String>) = apn(apn.getOrNull())

        /**
         * Sets [Builder.apn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apn(apn: JsonField<String>) = apply { this.apn = apn }

        fun birthdate(birthdate: String?) = birthdate(JsonField.ofNullable(birthdate))

        /** Alias for calling [Builder.birthdate] with `birthdate.orElse(null)`. */
        fun birthdate(birthdate: Optional<String>) = birthdate(birthdate.getOrNull())

        /**
         * Sets [Builder.birthdate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthdate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun birthdate(birthdate: JsonField<String>) = apply { this.birthdate = birthdate }

        /**
         * A free form object. Due to a limitation of the API Explorer, you can only enter string
         * key/values below, but this API accepts more complex object structures.
         */
        fun custom(custom: Custom?) = custom(JsonField.ofNullable(custom))

        /** Alias for calling [Builder.custom] with `custom.orElse(null)`. */
        fun custom(custom: Optional<Custom>) = custom(custom.getOrNull())

        /**
         * Sets [Builder.custom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.custom] with a well-typed [Custom] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun custom(custom: JsonField<Custom>) = apply { this.custom = custom }

        fun discord(discord: Discord?) = discord(JsonField.ofNullable(discord))

        /** Alias for calling [Builder.discord] with `discord.orElse(null)`. */
        fun discord(discord: Optional<Discord>) = discord(discord.getOrNull())

        /**
         * Sets [Builder.discord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discord] with a well-typed [Discord] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun discord(discord: JsonField<Discord>) = apply { this.discord = discord }

        /** Alias for calling [discord] with `Discord.ofSendToChannel(sendToChannel)`. */
        fun discord(sendToChannel: SendToChannel) = discord(Discord.ofSendToChannel(sendToChannel))

        /** Alias for calling [discord] with `Discord.ofSendDirectMessage(sendDirectMessage)`. */
        fun discord(sendDirectMessage: SendDirectMessage) =
            discord(Discord.ofSendDirectMessage(sendDirectMessage))

        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun emailVerified(emailVerified: Boolean?) =
            emailVerified(JsonField.ofNullable(emailVerified))

        /**
         * Alias for [Builder.emailVerified].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun emailVerified(emailVerified: Boolean) = emailVerified(emailVerified as Boolean?)

        /** Alias for calling [Builder.emailVerified] with `emailVerified.orElse(null)`. */
        fun emailVerified(emailVerified: Optional<Boolean>) =
            emailVerified(emailVerified.getOrNull())

        /**
         * Sets [Builder.emailVerified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailVerified] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailVerified(emailVerified: JsonField<Boolean>) = apply {
            this.emailVerified = emailVerified
        }

        fun expo(expo: Expo?) = expo(JsonField.ofNullable(expo))

        /** Alias for calling [Builder.expo] with `expo.orElse(null)`. */
        fun expo(expo: Optional<Expo>) = expo(expo.getOrNull())

        /**
         * Sets [Builder.expo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expo] with a well-typed [Expo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expo(expo: JsonField<Expo>) = apply { this.expo = expo }

        /** Alias for calling [expo] with `Expo.ofToken(token)`. */
        fun expo(token: Token) = expo(Expo.ofToken(token))

        /** Alias for calling [expo] with `Expo.ofMultipleTokens(multipleTokens)`. */
        fun expo(multipleTokens: MultipleTokens) = expo(Expo.ofMultipleTokens(multipleTokens))

        fun facebookPsid(facebookPsid: String?) = facebookPsid(JsonField.ofNullable(facebookPsid))

        /** Alias for calling [Builder.facebookPsid] with `facebookPsid.orElse(null)`. */
        fun facebookPsid(facebookPsid: Optional<String>) = facebookPsid(facebookPsid.getOrNull())

        /**
         * Sets [Builder.facebookPsid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.facebookPsid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun facebookPsid(facebookPsid: JsonField<String>) = apply {
            this.facebookPsid = facebookPsid
        }

        fun familyName(familyName: String?) = familyName(JsonField.ofNullable(familyName))

        /** Alias for calling [Builder.familyName] with `familyName.orElse(null)`. */
        fun familyName(familyName: Optional<String>) = familyName(familyName.getOrNull())

        /**
         * Sets [Builder.familyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.familyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun familyName(familyName: JsonField<String>) = apply { this.familyName = familyName }

        fun firebaseToken(firebaseToken: UserProfileFirebaseToken?) =
            firebaseToken(JsonField.ofNullable(firebaseToken))

        /** Alias for calling [Builder.firebaseToken] with `firebaseToken.orElse(null)`. */
        fun firebaseToken(firebaseToken: Optional<UserProfileFirebaseToken>) =
            firebaseToken(firebaseToken.getOrNull())

        /**
         * Sets [Builder.firebaseToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firebaseToken] with a well-typed
         * [UserProfileFirebaseToken] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun firebaseToken(firebaseToken: JsonField<UserProfileFirebaseToken>) = apply {
            this.firebaseToken = firebaseToken
        }

        /** Alias for calling [firebaseToken] with `UserProfileFirebaseToken.ofString(string)`. */
        fun firebaseToken(string: String) = firebaseToken(UserProfileFirebaseToken.ofString(string))

        /** Alias for calling [firebaseToken] with `UserProfileFirebaseToken.ofStrings(strings)`. */
        fun firebaseTokenOfStrings(strings: List<String>) =
            firebaseToken(UserProfileFirebaseToken.ofStrings(strings))

        fun gender(gender: String?) = gender(JsonField.ofNullable(gender))

        /** Alias for calling [Builder.gender] with `gender.orElse(null)`. */
        fun gender(gender: Optional<String>) = gender(gender.getOrNull())

        /**
         * Sets [Builder.gender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gender] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: JsonField<String>) = apply { this.gender = gender }

        fun givenName(givenName: String?) = givenName(JsonField.ofNullable(givenName))

        /** Alias for calling [Builder.givenName] with `givenName.orElse(null)`. */
        fun givenName(givenName: Optional<String>) = givenName(givenName.getOrNull())

        /**
         * Sets [Builder.givenName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.givenName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun givenName(givenName: JsonField<String>) = apply { this.givenName = givenName }

        fun intercom(intercom: Intercom?) = intercom(JsonField.ofNullable(intercom))

        /** Alias for calling [Builder.intercom] with `intercom.orElse(null)`. */
        fun intercom(intercom: Optional<Intercom>) = intercom(intercom.getOrNull())

        /**
         * Sets [Builder.intercom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intercom] with a well-typed [Intercom] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun intercom(intercom: JsonField<Intercom>) = apply { this.intercom = intercom }

        fun locale(locale: String?) = locale(JsonField.ofNullable(locale))

        /** Alias for calling [Builder.locale] with `locale.orElse(null)`. */
        fun locale(locale: Optional<String>) = locale(locale.getOrNull())

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { this.locale = locale }

        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        fun msTeams(msTeams: MsTeams?) = msTeams(JsonField.ofNullable(msTeams))

        /** Alias for calling [Builder.msTeams] with `msTeams.orElse(null)`. */
        fun msTeams(msTeams: Optional<MsTeams>) = msTeams(msTeams.getOrNull())

        /**
         * Sets [Builder.msTeams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msTeams] with a well-typed [MsTeams] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msTeams(msTeams: JsonField<MsTeams>) = apply { this.msTeams = msTeams }

        /**
         * Alias for calling [msTeams] with `MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId)`.
         */
        fun msTeams(sendToMsTeamsUserId: SendToMsTeamsUserId) =
            msTeams(MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId))

        /** Alias for calling [msTeams] with `MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail)`. */
        fun msTeams(sendToMsTeamsEmail: SendToMsTeamsEmail) =
            msTeams(MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail))

        /**
         * Alias for calling [msTeams] with
         * `MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId)`.
         */
        fun msTeams(sendToMsTeamsChannelId: SendToMsTeamsChannelId) =
            msTeams(MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId))

        /**
         * Alias for calling [msTeams] with
         * `MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId)`.
         */
        fun msTeams(sendToMsTeamsConversationId: SendToMsTeamsConversationId) =
            msTeams(MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId))

        /**
         * Alias for calling [msTeams] with
         * `MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName)`.
         */
        fun msTeams(sendToMsTeamsChannelName: SendToMsTeamsChannelName) =
            msTeams(MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName))

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

        /** Alias for calling [Builder.nickname] with `nickname.orElse(null)`. */
        fun nickname(nickname: Optional<String>) = nickname(nickname.getOrNull())

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun phoneNumberVerified(phoneNumberVerified: Boolean?) =
            phoneNumberVerified(JsonField.ofNullable(phoneNumberVerified))

        /**
         * Alias for [Builder.phoneNumberVerified].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun phoneNumberVerified(phoneNumberVerified: Boolean) =
            phoneNumberVerified(phoneNumberVerified as Boolean?)

        /**
         * Alias for calling [Builder.phoneNumberVerified] with `phoneNumberVerified.orElse(null)`.
         */
        fun phoneNumberVerified(phoneNumberVerified: Optional<Boolean>) =
            phoneNumberVerified(phoneNumberVerified.getOrNull())

        /**
         * Sets [Builder.phoneNumberVerified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberVerified] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumberVerified(phoneNumberVerified: JsonField<Boolean>) = apply {
            this.phoneNumberVerified = phoneNumberVerified
        }

        fun picture(picture: String?) = picture(JsonField.ofNullable(picture))

        /** Alias for calling [Builder.picture] with `picture.orElse(null)`. */
        fun picture(picture: Optional<String>) = picture(picture.getOrNull())

        /**
         * Sets [Builder.picture] to an arbitrary JSON value.
         *
         * You should usually call [Builder.picture] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun picture(picture: JsonField<String>) = apply { this.picture = picture }

        fun preferredName(preferredName: String?) =
            preferredName(JsonField.ofNullable(preferredName))

        /** Alias for calling [Builder.preferredName] with `preferredName.orElse(null)`. */
        fun preferredName(preferredName: Optional<String>) =
            preferredName(preferredName.getOrNull())

        /**
         * Sets [Builder.preferredName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        fun profile(profile: String?) = profile(JsonField.ofNullable(profile))

        /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
        fun profile(profile: Optional<String>) = profile(profile.getOrNull())

        /**
         * Sets [Builder.profile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profile] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun profile(profile: JsonField<String>) = apply { this.profile = profile }

        fun slack(slack: Slack?) = slack(JsonField.ofNullable(slack))

        /** Alias for calling [Builder.slack] with `slack.orElse(null)`. */
        fun slack(slack: Optional<Slack>) = slack(slack.getOrNull())

        /**
         * Sets [Builder.slack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slack] with a well-typed [Slack] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slack(slack: JsonField<Slack>) = apply { this.slack = slack }

        /** Alias for calling [slack] with `Slack.ofSendToSlackChannel(sendToSlackChannel)`. */
        fun slack(sendToSlackChannel: SendToSlackChannel) =
            slack(Slack.ofSendToSlackChannel(sendToSlackChannel))

        /** Alias for calling [slack] with `Slack.ofSendToSlackEmail(sendToSlackEmail)`. */
        fun slack(sendToSlackEmail: SendToSlackEmail) =
            slack(Slack.ofSendToSlackEmail(sendToSlackEmail))

        /** Alias for calling [slack] with `Slack.ofSendToSlackUserId(sendToSlackUserId)`. */
        fun slack(sendToSlackUserId: SendToSlackUserId) =
            slack(Slack.ofSendToSlackUserId(sendToSlackUserId))

        fun sub(sub: String?) = sub(JsonField.ofNullable(sub))

        /** Alias for calling [Builder.sub] with `sub.orElse(null)`. */
        fun sub(sub: Optional<String>) = sub(sub.getOrNull())

        /**
         * Sets [Builder.sub] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sub] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sub(sub: JsonField<String>) = apply { this.sub = sub }

        fun targetArn(targetArn: String?) = targetArn(JsonField.ofNullable(targetArn))

        /** Alias for calling [Builder.targetArn] with `targetArn.orElse(null)`. */
        fun targetArn(targetArn: Optional<String>) = targetArn(targetArn.getOrNull())

        /**
         * Sets [Builder.targetArn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetArn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetArn(targetArn: JsonField<String>) = apply { this.targetArn = targetArn }

        fun updatedAt(updatedAt: String?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<String>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        fun website(website: String?) = website(JsonField.ofNullable(website))

        /** Alias for calling [Builder.website] with `website.orElse(null)`. */
        fun website(website: Optional<String>) = website(website.getOrNull())

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { this.website = website }

        fun zoneinfo(zoneinfo: String?) = zoneinfo(JsonField.ofNullable(zoneinfo))

        /** Alias for calling [Builder.zoneinfo] with `zoneinfo.orElse(null)`. */
        fun zoneinfo(zoneinfo: Optional<String>) = zoneinfo(zoneinfo.getOrNull())

        /**
         * Sets [Builder.zoneinfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneinfo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneinfo(zoneinfo: JsonField<String>) = apply { this.zoneinfo = zoneinfo }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [UserProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserProfile =
            UserProfile(
                address,
                airship,
                apn,
                birthdate,
                custom,
                discord,
                email,
                emailVerified,
                expo,
                facebookPsid,
                familyName,
                firebaseToken,
                gender,
                givenName,
                intercom,
                locale,
                middleName,
                msTeams,
                name,
                nickname,
                phoneNumber,
                phoneNumberVerified,
                picture,
                preferredName,
                profile,
                slack,
                sub,
                targetArn,
                updatedAt,
                website,
                zoneinfo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserProfile = apply {
        if (validated) {
            return@apply
        }

        address().ifPresent { it.validate() }
        airship().ifPresent { it.validate() }
        apn()
        birthdate()
        custom().ifPresent { it.validate() }
        discord().ifPresent { it.validate() }
        email()
        emailVerified()
        expo().ifPresent { it.validate() }
        facebookPsid()
        familyName()
        firebaseToken().ifPresent { it.validate() }
        gender()
        givenName()
        intercom().ifPresent { it.validate() }
        locale()
        middleName()
        msTeams().ifPresent { it.validate() }
        name()
        nickname()
        phoneNumber()
        phoneNumberVerified()
        picture()
        preferredName()
        profile()
        slack().ifPresent { it.validate() }
        sub()
        targetArn()
        updatedAt()
        website()
        zoneinfo()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: CourierInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (address.asKnown().getOrNull()?.validity() ?: 0) +
            (airship.asKnown().getOrNull()?.validity() ?: 0) +
            (if (apn.asKnown().isPresent) 1 else 0) +
            (if (birthdate.asKnown().isPresent) 1 else 0) +
            (custom.asKnown().getOrNull()?.validity() ?: 0) +
            (discord.asKnown().getOrNull()?.validity() ?: 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (emailVerified.asKnown().isPresent) 1 else 0) +
            (expo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (facebookPsid.asKnown().isPresent) 1 else 0) +
            (if (familyName.asKnown().isPresent) 1 else 0) +
            (firebaseToken.asKnown().getOrNull()?.validity() ?: 0) +
            (if (gender.asKnown().isPresent) 1 else 0) +
            (if (givenName.asKnown().isPresent) 1 else 0) +
            (intercom.asKnown().getOrNull()?.validity() ?: 0) +
            (if (locale.asKnown().isPresent) 1 else 0) +
            (if (middleName.asKnown().isPresent) 1 else 0) +
            (msTeams.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (nickname.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (phoneNumberVerified.asKnown().isPresent) 1 else 0) +
            (if (picture.asKnown().isPresent) 1 else 0) +
            (if (preferredName.asKnown().isPresent) 1 else 0) +
            (if (profile.asKnown().isPresent) 1 else 0) +
            (slack.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sub.asKnown().isPresent) 1 else 0) +
            (if (targetArn.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (website.asKnown().isPresent) 1 else 0) +
            (if (zoneinfo.asKnown().isPresent) 1 else 0)

    class Address
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val country: JsonField<String>,
        private val formatted: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val streetAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("formatted")
            @ExcludeMissing
            formatted: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_address")
            @ExcludeMissing
            streetAddress: JsonField<String> = JsonMissing.of(),
        ) : this(country, formatted, locality, postalCode, region, streetAddress, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun formatted(): String = formatted.getRequired("formatted")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun streetAddress(): String = streetAddress.getRequired("street_address")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [formatted].
         *
         * Unlike [formatted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("formatted") @ExcludeMissing fun _formatted(): JsonField<String> = formatted

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [streetAddress].
         *
         * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("street_address")
        @ExcludeMissing
        fun _streetAddress(): JsonField<String> = streetAddress

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Address].
             *
             * The following fields are required:
             * ```java
             * .country()
             * .formatted()
             * .locality()
             * .postalCode()
             * .region()
             * .streetAddress()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var formatted: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var streetAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                country = address.country
                formatted = address.formatted
                locality = address.locality
                postalCode = address.postalCode
                region = address.region
                streetAddress = address.streetAddress
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun formatted(formatted: String) = formatted(JsonField.of(formatted))

            /**
             * Sets [Builder.formatted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formatted] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formatted(formatted: JsonField<String>) = apply { this.formatted = formatted }

            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun streetAddress(streetAddress: String) = streetAddress(JsonField.of(streetAddress))

            /**
             * Sets [Builder.streetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streetAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streetAddress(streetAddress: JsonField<String>) = apply {
                this.streetAddress = streetAddress
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Address].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .country()
             * .formatted()
             * .locality()
             * .postalCode()
             * .region()
             * .streetAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Address =
                Address(
                    checkRequired("country", country),
                    checkRequired("formatted", formatted),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    checkRequired("streetAddress", streetAddress),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            country()
            formatted()
            locality()
            postalCode()
            region()
            streetAddress()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CourierInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (country.asKnown().isPresent) 1 else 0) +
                (if (formatted.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (streetAddress.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                country == other.country &&
                formatted == other.formatted &&
                locality == other.locality &&
                postalCode == other.postalCode &&
                region == other.region &&
                streetAddress == other.streetAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                country,
                formatted,
                locality,
                postalCode,
                region,
                streetAddress,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{country=$country, formatted=$formatted, locality=$locality, postalCode=$postalCode, region=$region, streetAddress=$streetAddress, additionalProperties=$additionalProperties}"
    }

    /**
     * A free form object. Due to a limitation of the API Explorer, you can only enter string
     * key/values below, but this API accepts more complex object structures.
     */
    class Custom
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Custom]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Custom]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(custom: Custom) = apply {
                additionalProperties = custom.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Custom].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Custom = Custom(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Custom = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CourierInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Custom && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Custom{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserProfile &&
            address == other.address &&
            airship == other.airship &&
            apn == other.apn &&
            birthdate == other.birthdate &&
            custom == other.custom &&
            discord == other.discord &&
            email == other.email &&
            emailVerified == other.emailVerified &&
            expo == other.expo &&
            facebookPsid == other.facebookPsid &&
            familyName == other.familyName &&
            firebaseToken == other.firebaseToken &&
            gender == other.gender &&
            givenName == other.givenName &&
            intercom == other.intercom &&
            locale == other.locale &&
            middleName == other.middleName &&
            msTeams == other.msTeams &&
            name == other.name &&
            nickname == other.nickname &&
            phoneNumber == other.phoneNumber &&
            phoneNumberVerified == other.phoneNumberVerified &&
            picture == other.picture &&
            preferredName == other.preferredName &&
            profile == other.profile &&
            slack == other.slack &&
            sub == other.sub &&
            targetArn == other.targetArn &&
            updatedAt == other.updatedAt &&
            website == other.website &&
            zoneinfo == other.zoneinfo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            address,
            airship,
            apn,
            birthdate,
            custom,
            discord,
            email,
            emailVerified,
            expo,
            facebookPsid,
            familyName,
            firebaseToken,
            gender,
            givenName,
            intercom,
            locale,
            middleName,
            msTeams,
            name,
            nickname,
            phoneNumber,
            phoneNumberVerified,
            picture,
            preferredName,
            profile,
            slack,
            sub,
            targetArn,
            updatedAt,
            website,
            zoneinfo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserProfile{address=$address, airship=$airship, apn=$apn, birthdate=$birthdate, custom=$custom, discord=$discord, email=$email, emailVerified=$emailVerified, expo=$expo, facebookPsid=$facebookPsid, familyName=$familyName, firebaseToken=$firebaseToken, gender=$gender, givenName=$givenName, intercom=$intercom, locale=$locale, middleName=$middleName, msTeams=$msTeams, name=$name, nickname=$nickname, phoneNumber=$phoneNumber, phoneNumberVerified=$phoneNumberVerified, picture=$picture, preferredName=$preferredName, profile=$profile, slack=$slack, sub=$sub, targetArn=$targetArn, updatedAt=$updatedAt, website=$website, zoneinfo=$zoneinfo, additionalProperties=$additionalProperties}"
}
