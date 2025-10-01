// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TokenRetrieveSingleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val providerKey: JsonField<UserToken.ProviderKey>,
    private val token: JsonField<String>,
    private val device: JsonField<UserToken.Device>,
    private val expiryDate: JsonField<UserToken.ExpiryDate>,
    private val properties: JsonValue,
    private val tracking: JsonField<UserToken.Tracking>,
    private val status: JsonField<Status>,
    private val statusReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("provider_key")
        @ExcludeMissing
        providerKey: JsonField<UserToken.ProviderKey> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device")
        @ExcludeMissing
        device: JsonField<UserToken.Device> = JsonMissing.of(),
        @JsonProperty("expiry_date")
        @ExcludeMissing
        expiryDate: JsonField<UserToken.ExpiryDate> = JsonMissing.of(),
        @JsonProperty("properties") @ExcludeMissing properties: JsonValue = JsonMissing.of(),
        @JsonProperty("tracking")
        @ExcludeMissing
        tracking: JsonField<UserToken.Tracking> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("status_reason")
        @ExcludeMissing
        statusReason: JsonField<String> = JsonMissing.of(),
    ) : this(
        providerKey,
        token,
        device,
        expiryDate,
        properties,
        tracking,
        status,
        statusReason,
        mutableMapOf(),
    )

    fun toUserToken(): UserToken =
        UserToken.builder()
            .providerKey(providerKey)
            .token(token)
            .device(device)
            .expiryDate(expiryDate)
            .properties(properties)
            .tracking(tracking)
            .build()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerKey(): UserToken.ProviderKey = providerKey.getRequired("provider_key")

    /**
     * Full body of the token. Must match token in URL.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * Information about the device the token is associated with.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun device(): Optional<UserToken.Device> = device.getOptional("device")

    /**
     * ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable
     * expiration.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiryDate(): Optional<UserToken.ExpiryDate> = expiryDate.getOptional("expiry_date")

    /** Properties sent to the provider along with the token */
    @JsonProperty("properties") @ExcludeMissing fun _properties(): JsonValue = properties

    /**
     * Information about the device the token is associated with.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tracking(): Optional<UserToken.Tracking> = tracking.getOptional("tracking")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The reason for the token status.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusReason(): Optional<String> = statusReason.getOptional("status_reason")

    /**
     * Returns the raw JSON value of [providerKey].
     *
     * Unlike [providerKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_key")
    @ExcludeMissing
    fun _providerKey(): JsonField<UserToken.ProviderKey> = providerKey

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device") @ExcludeMissing fun _device(): JsonField<UserToken.Device> = device

    /**
     * Returns the raw JSON value of [expiryDate].
     *
     * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate(): JsonField<UserToken.ExpiryDate> = expiryDate

    /**
     * Returns the raw JSON value of [tracking].
     *
     * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking")
    @ExcludeMissing
    fun _tracking(): JsonField<UserToken.Tracking> = tracking

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusReason].
     *
     * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_reason")
    @ExcludeMissing
    fun _statusReason(): JsonField<String> = statusReason

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
         * Returns a mutable builder for constructing an instance of [TokenRetrieveSingleResponse].
         *
         * The following fields are required:
         * ```java
         * .providerKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenRetrieveSingleResponse]. */
    class Builder internal constructor() {

        private var providerKey: JsonField<UserToken.ProviderKey>? = null
        private var token: JsonField<String> = JsonMissing.of()
        private var device: JsonField<UserToken.Device> = JsonMissing.of()
        private var expiryDate: JsonField<UserToken.ExpiryDate> = JsonMissing.of()
        private var properties: JsonValue = JsonMissing.of()
        private var tracking: JsonField<UserToken.Tracking> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenRetrieveSingleResponse: TokenRetrieveSingleResponse) = apply {
            providerKey = tokenRetrieveSingleResponse.providerKey
            token = tokenRetrieveSingleResponse.token
            device = tokenRetrieveSingleResponse.device
            expiryDate = tokenRetrieveSingleResponse.expiryDate
            properties = tokenRetrieveSingleResponse.properties
            tracking = tokenRetrieveSingleResponse.tracking
            status = tokenRetrieveSingleResponse.status
            statusReason = tokenRetrieveSingleResponse.statusReason
            additionalProperties = tokenRetrieveSingleResponse.additionalProperties.toMutableMap()
        }

        fun providerKey(providerKey: UserToken.ProviderKey) = providerKey(JsonField.of(providerKey))

        /**
         * Sets [Builder.providerKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerKey] with a well-typed [UserToken.ProviderKey]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun providerKey(providerKey: JsonField<UserToken.ProviderKey>) = apply {
            this.providerKey = providerKey
        }

        /** Full body of the token. Must match token in URL. */
        fun token(token: String?) = token(JsonField.ofNullable(token))

        /** Alias for calling [Builder.token] with `token.orElse(null)`. */
        fun token(token: Optional<String>) = token(token.getOrNull())

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Information about the device the token is associated with. */
        fun device(device: UserToken.Device?) = device(JsonField.ofNullable(device))

        /** Alias for calling [Builder.device] with `device.orElse(null)`. */
        fun device(device: Optional<UserToken.Device>) = device(device.getOrNull())

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [UserToken.Device] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun device(device: JsonField<UserToken.Device>) = apply { this.device = device }

        /**
         * ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable
         * expiration.
         */
        fun expiryDate(expiryDate: UserToken.ExpiryDate?) =
            expiryDate(JsonField.ofNullable(expiryDate))

        /** Alias for calling [Builder.expiryDate] with `expiryDate.orElse(null)`. */
        fun expiryDate(expiryDate: Optional<UserToken.ExpiryDate>) =
            expiryDate(expiryDate.getOrNull())

        /**
         * Sets [Builder.expiryDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiryDate] with a well-typed [UserToken.ExpiryDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun expiryDate(expiryDate: JsonField<UserToken.ExpiryDate>) = apply {
            this.expiryDate = expiryDate
        }

        /** Alias for calling [expiryDate] with `UserToken.ExpiryDate.ofString(string)`. */
        fun expiryDate(string: String) = expiryDate(UserToken.ExpiryDate.ofString(string))

        /** Alias for calling [expiryDate] with `UserToken.ExpiryDate.ofBool(bool)`. */
        fun expiryDate(bool: Boolean) = expiryDate(UserToken.ExpiryDate.ofBool(bool))

        /** Properties sent to the provider along with the token */
        fun properties(properties: JsonValue) = apply { this.properties = properties }

        /** Information about the device the token is associated with. */
        fun tracking(tracking: UserToken.Tracking?) = tracking(JsonField.ofNullable(tracking))

        /** Alias for calling [Builder.tracking] with `tracking.orElse(null)`. */
        fun tracking(tracking: Optional<UserToken.Tracking>) = tracking(tracking.getOrNull())

        /**
         * Sets [Builder.tracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracking] with a well-typed [UserToken.Tracking] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tracking(tracking: JsonField<UserToken.Tracking>) = apply { this.tracking = tracking }

        fun status(status: Status?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The reason for the token status. */
        fun statusReason(statusReason: String?) = statusReason(JsonField.ofNullable(statusReason))

        /** Alias for calling [Builder.statusReason] with `statusReason.orElse(null)`. */
        fun statusReason(statusReason: Optional<String>) = statusReason(statusReason.getOrNull())

        /**
         * Sets [Builder.statusReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusReason(statusReason: JsonField<String>) = apply {
            this.statusReason = statusReason
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
         * Returns an immutable instance of [TokenRetrieveSingleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .providerKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenRetrieveSingleResponse =
            TokenRetrieveSingleResponse(
                checkRequired("providerKey", providerKey),
                token,
                device,
                expiryDate,
                properties,
                tracking,
                status,
                statusReason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TokenRetrieveSingleResponse = apply {
        if (validated) {
            return@apply
        }

        providerKey().validate()
        token()
        device().ifPresent { it.validate() }
        expiryDate().ifPresent { it.validate() }
        tracking().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        statusReason()
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
        (providerKey.asKnown().getOrNull()?.validity() ?: 0) +
            (if (token.asKnown().isPresent) 1 else 0) +
            (device.asKnown().getOrNull()?.validity() ?: 0) +
            (expiryDate.asKnown().getOrNull()?.validity() ?: 0) +
            (tracking.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (statusReason.asKnown().isPresent) 1 else 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val UNKNOWN = of("unknown")

            @JvmField val FAILED = of("failed")

            @JvmField val REVOKED = of("revoked")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            UNKNOWN,
            FAILED,
            REVOKED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            UNKNOWN,
            FAILED,
            REVOKED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                UNKNOWN -> Value.UNKNOWN
                FAILED -> Value.FAILED
                REVOKED -> Value.REVOKED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                UNKNOWN -> Known.UNKNOWN
                FAILED -> Known.FAILED
                REVOKED -> Known.REVOKED
                else -> throw CourierInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenRetrieveSingleResponse &&
            providerKey == other.providerKey &&
            token == other.token &&
            device == other.device &&
            expiryDate == other.expiryDate &&
            properties == other.properties &&
            tracking == other.tracking &&
            status == other.status &&
            statusReason == other.statusReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            providerKey,
            token,
            device,
            expiryDate,
            properties,
            tracking,
            status,
            statusReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenRetrieveSingleResponse{providerKey=$providerKey, token=$token, device=$device, expiryDate=$expiryDate, properties=$properties, tracking=$tracking, status=$status, statusReason=$statusReason, additionalProperties=$additionalProperties}"
}
