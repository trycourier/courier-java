// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.lists.subscriptions.RecipientPreferences
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProfileRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val profile: JsonField<Profile>,
    private val preferences: JsonField<RecipientPreferences>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("profile") @ExcludeMissing profile: JsonField<Profile> = JsonMissing.of(),
        @JsonProperty("preferences")
        @ExcludeMissing
        preferences: JsonField<RecipientPreferences> = JsonMissing.of(),
    ) : this(profile, preferences, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun profile(): Profile = profile.getRequired("profile")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferences(): Optional<RecipientPreferences> = preferences.getOptional("preferences")

    /**
     * Returns the raw JSON value of [profile].
     *
     * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<Profile> = profile

    /**
     * Returns the raw JSON value of [preferences].
     *
     * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferences")
    @ExcludeMissing
    fun _preferences(): JsonField<RecipientPreferences> = preferences

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
         * Returns a mutable builder for constructing an instance of [ProfileRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .profile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProfileRetrieveResponse]. */
    class Builder internal constructor() {

        private var profile: JsonField<Profile>? = null
        private var preferences: JsonField<RecipientPreferences> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(profileRetrieveResponse: ProfileRetrieveResponse) = apply {
            profile = profileRetrieveResponse.profile
            preferences = profileRetrieveResponse.preferences
            additionalProperties = profileRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun profile(profile: Profile) = profile(JsonField.of(profile))

        /**
         * Sets [Builder.profile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profile] with a well-typed [Profile] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

        fun preferences(preferences: RecipientPreferences?) =
            preferences(JsonField.ofNullable(preferences))

        /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
        fun preferences(preferences: Optional<RecipientPreferences>) =
            preferences(preferences.getOrNull())

        /**
         * Sets [Builder.preferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferences] with a well-typed [RecipientPreferences]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun preferences(preferences: JsonField<RecipientPreferences>) = apply {
            this.preferences = preferences
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
         * Returns an immutable instance of [ProfileRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .profile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProfileRetrieveResponse =
            ProfileRetrieveResponse(
                checkRequired("profile", profile),
                preferences,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProfileRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        profile().validate()
        preferences().ifPresent { it.validate() }
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
        (profile.asKnown().getOrNull()?.validity() ?: 0) +
            (preferences.asKnown().getOrNull()?.validity() ?: 0)

    class Profile
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

            /** Returns a mutable builder for constructing an instance of [Profile]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Profile]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(profile: Profile) = apply {
                additionalProperties = profile.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Profile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Profile = Profile(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Profile = apply {
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

            return other is Profile && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Profile{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileRetrieveResponse &&
            profile == other.profile &&
            preferences == other.preferences &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(profile, preferences, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProfileRetrieveResponse{profile=$profile, preferences=$preferences, additionalProperties=$additionalProperties}"
}
