// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.errors.CourierInvalidDataException
import com.courier.models.RecipientPreferences
import com.courier.models.UserRecipient
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InboundBulkMessageUser
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonValue,
    private val preferences: JsonField<RecipientPreferences>,
    private val profile: JsonValue,
    private val recipient: JsonField<String>,
    private val to: JsonField<UserRecipient>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonValue = JsonMissing.of(),
        @JsonProperty("preferences")
        @ExcludeMissing
        preferences: JsonField<RecipientPreferences> = JsonMissing.of(),
        @JsonProperty("profile") @ExcludeMissing profile: JsonValue = JsonMissing.of(),
        @JsonProperty("recipient") @ExcludeMissing recipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<UserRecipient> = JsonMissing.of(),
    ) : this(data, preferences, profile, recipient, to, mutableMapOf())

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonValue = data

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferences(): Optional<RecipientPreferences> = preferences.getOptional("preferences")

    @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonValue = profile

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipient(): Optional<String> = recipient.getOptional("recipient")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<UserRecipient> = to.getOptional("to")

    /**
     * Returns the raw JSON value of [preferences].
     *
     * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferences")
    @ExcludeMissing
    fun _preferences(): JsonField<RecipientPreferences> = preferences

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<UserRecipient> = to

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

        /** Returns a mutable builder for constructing an instance of [InboundBulkMessageUser]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundBulkMessageUser]. */
    class Builder internal constructor() {

        private var data: JsonValue = JsonMissing.of()
        private var preferences: JsonField<RecipientPreferences> = JsonMissing.of()
        private var profile: JsonValue = JsonMissing.of()
        private var recipient: JsonField<String> = JsonMissing.of()
        private var to: JsonField<UserRecipient> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundBulkMessageUser: InboundBulkMessageUser) = apply {
            data = inboundBulkMessageUser.data
            preferences = inboundBulkMessageUser.preferences
            profile = inboundBulkMessageUser.profile
            recipient = inboundBulkMessageUser.recipient
            to = inboundBulkMessageUser.to
            additionalProperties = inboundBulkMessageUser.additionalProperties.toMutableMap()
        }

        fun data(data: JsonValue) = apply { this.data = data }

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

        fun profile(profile: JsonValue) = apply { this.profile = profile }

        fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

        /** Alias for calling [Builder.recipient] with `recipient.orElse(null)`. */
        fun recipient(recipient: Optional<String>) = recipient(recipient.getOrNull())

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

        fun to(to: UserRecipient?) = to(JsonField.ofNullable(to))

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<UserRecipient>) = to(to.getOrNull())

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [UserRecipient] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun to(to: JsonField<UserRecipient>) = apply { this.to = to }

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
         * Returns an immutable instance of [InboundBulkMessageUser].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboundBulkMessageUser =
            InboundBulkMessageUser(
                data,
                preferences,
                profile,
                recipient,
                to,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundBulkMessageUser = apply {
        if (validated) {
            return@apply
        }

        preferences().ifPresent { it.validate() }
        recipient()
        to().ifPresent { it.validate() }
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
        (preferences.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recipient.asKnown().isPresent) 1 else 0) +
            (to.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundBulkMessageUser &&
            data == other.data &&
            preferences == other.preferences &&
            profile == other.profile &&
            recipient == other.recipient &&
            to == other.to &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, preferences, profile, recipient, to, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundBulkMessageUser{data=$data, preferences=$preferences, profile=$profile, recipient=$recipient, to=$to, additionalProperties=$additionalProperties}"
}
