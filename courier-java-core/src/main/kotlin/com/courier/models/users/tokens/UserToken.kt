// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tokens

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.checkRequired
import com.courier.core.getOrThrow
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserToken
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val providerKey: JsonField<ProviderKey>,
    private val device: JsonField<Device>,
    private val expiryDate: JsonField<ExpiryDate>,
    private val properties: JsonValue,
    private val tracking: JsonField<Tracking>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_key")
        @ExcludeMissing
        providerKey: JsonField<ProviderKey> = JsonMissing.of(),
        @JsonProperty("device") @ExcludeMissing device: JsonField<Device> = JsonMissing.of(),
        @JsonProperty("expiry_date")
        @ExcludeMissing
        expiryDate: JsonField<ExpiryDate> = JsonMissing.of(),
        @JsonProperty("properties") @ExcludeMissing properties: JsonValue = JsonMissing.of(),
        @JsonProperty("tracking") @ExcludeMissing tracking: JsonField<Tracking> = JsonMissing.of(),
    ) : this(token, providerKey, device, expiryDate, properties, tracking, mutableMapOf())

    /**
     * Full body of the token. Must match token in URL path parameter.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerKey(): ProviderKey = providerKey.getRequired("provider_key")

    /**
     * Information about the device the token came from.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun device(): Optional<Device> = device.getOptional("device")

    /**
     * ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable
     * expiration.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiryDate(): Optional<ExpiryDate> = expiryDate.getOptional("expiry_date")

    /** Properties about the token. */
    @JsonProperty("properties") @ExcludeMissing fun _properties(): JsonValue = properties

    /**
     * Tracking information about the device the token came from.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tracking(): Optional<Tracking> = tracking.getOptional("tracking")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [providerKey].
     *
     * Unlike [providerKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_key")
    @ExcludeMissing
    fun _providerKey(): JsonField<ProviderKey> = providerKey

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device") @ExcludeMissing fun _device(): JsonField<Device> = device

    /**
     * Returns the raw JSON value of [expiryDate].
     *
     * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate(): JsonField<ExpiryDate> = expiryDate

    /**
     * Returns the raw JSON value of [tracking].
     *
     * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking") @ExcludeMissing fun _tracking(): JsonField<Tracking> = tracking

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
         * Returns a mutable builder for constructing an instance of [UserToken].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .providerKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserToken]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var providerKey: JsonField<ProviderKey>? = null
        private var device: JsonField<Device> = JsonMissing.of()
        private var expiryDate: JsonField<ExpiryDate> = JsonMissing.of()
        private var properties: JsonValue = JsonMissing.of()
        private var tracking: JsonField<Tracking> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userToken: UserToken) = apply {
            token = userToken.token
            providerKey = userToken.providerKey
            device = userToken.device
            expiryDate = userToken.expiryDate
            properties = userToken.properties
            tracking = userToken.tracking
            additionalProperties = userToken.additionalProperties.toMutableMap()
        }

        /** Full body of the token. Must match token in URL path parameter. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun providerKey(providerKey: ProviderKey) = providerKey(JsonField.of(providerKey))

        /**
         * Sets [Builder.providerKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerKey] with a well-typed [ProviderKey] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerKey(providerKey: JsonField<ProviderKey>) = apply {
            this.providerKey = providerKey
        }

        /** Information about the device the token came from. */
        fun device(device: Device?) = device(JsonField.ofNullable(device))

        /** Alias for calling [Builder.device] with `device.orElse(null)`. */
        fun device(device: Optional<Device>) = device(device.getOrNull())

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [Device] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun device(device: JsonField<Device>) = apply { this.device = device }

        /**
         * ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable
         * expiration.
         */
        fun expiryDate(expiryDate: ExpiryDate?) = expiryDate(JsonField.ofNullable(expiryDate))

        /** Alias for calling [Builder.expiryDate] with `expiryDate.orElse(null)`. */
        fun expiryDate(expiryDate: Optional<ExpiryDate>) = expiryDate(expiryDate.getOrNull())

        /**
         * Sets [Builder.expiryDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiryDate] with a well-typed [ExpiryDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiryDate(expiryDate: JsonField<ExpiryDate>) = apply { this.expiryDate = expiryDate }

        /** Alias for calling [expiryDate] with `ExpiryDate.ofString(string)`. */
        fun expiryDate(string: String) = expiryDate(ExpiryDate.ofString(string))

        /** Alias for calling [expiryDate] with `ExpiryDate.ofBool(bool)`. */
        fun expiryDate(bool: Boolean) = expiryDate(ExpiryDate.ofBool(bool))

        /** Properties about the token. */
        fun properties(properties: JsonValue) = apply { this.properties = properties }

        /** Tracking information about the device the token came from. */
        fun tracking(tracking: Tracking?) = tracking(JsonField.ofNullable(tracking))

        /** Alias for calling [Builder.tracking] with `tracking.orElse(null)`. */
        fun tracking(tracking: Optional<Tracking>) = tracking(tracking.getOrNull())

        /**
         * Sets [Builder.tracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracking] with a well-typed [Tracking] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

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
         * Returns an immutable instance of [UserToken].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .providerKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserToken =
            UserToken(
                checkRequired("token", token),
                checkRequired("providerKey", providerKey),
                device,
                expiryDate,
                properties,
                tracking,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserToken = apply {
        if (validated) {
            return@apply
        }

        token()
        providerKey().validate()
        device().ifPresent { it.validate() }
        expiryDate().ifPresent { it.validate() }
        tracking().ifPresent { it.validate() }
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (providerKey.asKnown().getOrNull()?.validity() ?: 0) +
            (device.asKnown().getOrNull()?.validity() ?: 0) +
            (expiryDate.asKnown().getOrNull()?.validity() ?: 0) +
            (tracking.asKnown().getOrNull()?.validity() ?: 0)

    class ProviderKey @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val FIREBASE_FCM = of("firebase-fcm")

            @JvmField val APN = of("apn")

            @JvmField val EXPO = of("expo")

            @JvmField val ONESIGNAL = of("onesignal")

            @JvmStatic fun of(value: String) = ProviderKey(JsonField.of(value))
        }

        /** An enum containing [ProviderKey]'s known values. */
        enum class Known {
            FIREBASE_FCM,
            APN,
            EXPO,
            ONESIGNAL,
        }

        /**
         * An enum containing [ProviderKey]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProviderKey] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIREBASE_FCM,
            APN,
            EXPO,
            ONESIGNAL,
            /**
             * An enum member indicating that [ProviderKey] was instantiated with an unknown value.
             */
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
                FIREBASE_FCM -> Value.FIREBASE_FCM
                APN -> Value.APN
                EXPO -> Value.EXPO
                ONESIGNAL -> Value.ONESIGNAL
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
                FIREBASE_FCM -> Known.FIREBASE_FCM
                APN -> Known.APN
                EXPO -> Known.EXPO
                ONESIGNAL -> Known.ONESIGNAL
                else -> throw CourierInvalidDataException("Unknown ProviderKey: $value")
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

        fun validate(): ProviderKey = apply {
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

            return other is ProviderKey && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Information about the device the token came from. */
    class Device
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val adId: JsonField<String>,
        private val appId: JsonField<String>,
        private val deviceId: JsonField<String>,
        private val manufacturer: JsonField<String>,
        private val model: JsonField<String>,
        private val platform: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ad_id") @ExcludeMissing adId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("app_id") @ExcludeMissing appId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_id")
            @ExcludeMissing
            deviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manufacturer")
            @ExcludeMissing
            manufacturer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        ) : this(adId, appId, deviceId, manufacturer, model, platform, mutableMapOf())

        /**
         * Id of the advertising identifier
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun adId(): Optional<String> = adId.getOptional("ad_id")

        /**
         * Id of the application the token is used for
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appId(): Optional<String> = appId.getOptional("app_id")

        /**
         * Id of the device the token is associated with
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceId(): Optional<String> = deviceId.getOptional("device_id")

        /**
         * The device manufacturer
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun manufacturer(): Optional<String> = manufacturer.getOptional("manufacturer")

        /**
         * The device model
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * The device platform i.e. android, ios, web
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun platform(): Optional<String> = platform.getOptional("platform")

        /**
         * Returns the raw JSON value of [adId].
         *
         * Unlike [adId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ad_id") @ExcludeMissing fun _adId(): JsonField<String> = adId

        /**
         * Returns the raw JSON value of [appId].
         *
         * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_id") @ExcludeMissing fun _appId(): JsonField<String> = appId

        /**
         * Returns the raw JSON value of [deviceId].
         *
         * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

        /**
         * Returns the raw JSON value of [manufacturer].
         *
         * Unlike [manufacturer], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("manufacturer")
        @ExcludeMissing
        fun _manufacturer(): JsonField<String> = manufacturer

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

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

            /** Returns a mutable builder for constructing an instance of [Device]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Device]. */
        class Builder internal constructor() {

            private var adId: JsonField<String> = JsonMissing.of()
            private var appId: JsonField<String> = JsonMissing.of()
            private var deviceId: JsonField<String> = JsonMissing.of()
            private var manufacturer: JsonField<String> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var platform: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(device: Device) = apply {
                adId = device.adId
                appId = device.appId
                deviceId = device.deviceId
                manufacturer = device.manufacturer
                model = device.model
                platform = device.platform
                additionalProperties = device.additionalProperties.toMutableMap()
            }

            /** Id of the advertising identifier */
            fun adId(adId: String?) = adId(JsonField.ofNullable(adId))

            /** Alias for calling [Builder.adId] with `adId.orElse(null)`. */
            fun adId(adId: Optional<String>) = adId(adId.getOrNull())

            /**
             * Sets [Builder.adId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adId] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun adId(adId: JsonField<String>) = apply { this.adId = adId }

            /** Id of the application the token is used for */
            fun appId(appId: String?) = appId(JsonField.ofNullable(appId))

            /** Alias for calling [Builder.appId] with `appId.orElse(null)`. */
            fun appId(appId: Optional<String>) = appId(appId.getOrNull())

            /**
             * Sets [Builder.appId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appId(appId: JsonField<String>) = apply { this.appId = appId }

            /** Id of the device the token is associated with */
            fun deviceId(deviceId: String?) = deviceId(JsonField.ofNullable(deviceId))

            /** Alias for calling [Builder.deviceId] with `deviceId.orElse(null)`. */
            fun deviceId(deviceId: Optional<String>) = deviceId(deviceId.getOrNull())

            /**
             * Sets [Builder.deviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

            /** The device manufacturer */
            fun manufacturer(manufacturer: String?) =
                manufacturer(JsonField.ofNullable(manufacturer))

            /** Alias for calling [Builder.manufacturer] with `manufacturer.orElse(null)`. */
            fun manufacturer(manufacturer: Optional<String>) =
                manufacturer(manufacturer.getOrNull())

            /**
             * Sets [Builder.manufacturer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manufacturer] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manufacturer(manufacturer: JsonField<String>) = apply {
                this.manufacturer = manufacturer
            }

            /** The device model */
            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** The device platform i.e. android, ios, web */
            fun platform(platform: String?) = platform(JsonField.ofNullable(platform))

            /** Alias for calling [Builder.platform] with `platform.orElse(null)`. */
            fun platform(platform: Optional<String>) = platform(platform.getOrNull())

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<String>) = apply { this.platform = platform }

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
             * Returns an immutable instance of [Device].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Device =
                Device(
                    adId,
                    appId,
                    deviceId,
                    manufacturer,
                    model,
                    platform,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Device = apply {
            if (validated) {
                return@apply
            }

            adId()
            appId()
            deviceId()
            manufacturer()
            model()
            platform()
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
            (if (adId.asKnown().isPresent) 1 else 0) +
                (if (appId.asKnown().isPresent) 1 else 0) +
                (if (deviceId.asKnown().isPresent) 1 else 0) +
                (if (manufacturer.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (platform.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Device &&
                adId == other.adId &&
                appId == other.appId &&
                deviceId == other.deviceId &&
                manufacturer == other.manufacturer &&
                model == other.model &&
                platform == other.platform &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adId, appId, deviceId, manufacturer, model, platform, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Device{adId=$adId, appId=$appId, deviceId=$deviceId, manufacturer=$manufacturer, model=$model, platform=$platform, additionalProperties=$additionalProperties}"
    }

    /**
     * ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable
     * expiration.
     */
    @JsonDeserialize(using = ExpiryDate.Deserializer::class)
    @JsonSerialize(using = ExpiryDate.Serializer::class)
    class ExpiryDate
    private constructor(
        private val string: String? = null,
        private val bool: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isString(): Boolean = string != null

        fun isBool(): Boolean = bool != null

        fun asString(): String = string.getOrThrow("string")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                bool != null -> visitor.visitBool(bool)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ExpiryDate = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitBool(bool: Boolean) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitBool(bool: Boolean) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExpiryDate && string == other.string && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(string, bool)

        override fun toString(): String =
            when {
                string != null -> "ExpiryDate{string=$string}"
                bool != null -> "ExpiryDate{bool=$bool}"
                _json != null -> "ExpiryDate{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ExpiryDate")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = ExpiryDate(string = string)

            @JvmStatic fun ofBool(bool: Boolean) = ExpiryDate(bool = bool)
        }

        /**
         * An interface that defines how to map each variant of [ExpiryDate] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitBool(bool: Boolean): T

            /**
             * Maps an unknown variant of [ExpiryDate] to a value of type [T].
             *
             * An instance of [ExpiryDate] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws CourierInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CourierInvalidDataException("Unknown ExpiryDate: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ExpiryDate>(ExpiryDate::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ExpiryDate {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ExpiryDate(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                ExpiryDate(bool = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from integer).
                    0 -> ExpiryDate(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ExpiryDate>(ExpiryDate::class) {

            override fun serialize(
                value: ExpiryDate,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.bool != null -> generator.writeObject(value.bool)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ExpiryDate")
                }
            }
        }
    }

    /** Tracking information about the device the token came from. */
    class Tracking
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ip: JsonField<String>,
        private val lat: JsonField<String>,
        private val long_: JsonField<String>,
        private val osVersion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("long") @ExcludeMissing long_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("os_version")
            @ExcludeMissing
            osVersion: JsonField<String> = JsonMissing.of(),
        ) : this(ip, lat, long_, osVersion, mutableMapOf())

        /**
         * The IP address of the device
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ip(): Optional<String> = ip.getOptional("ip")

        /**
         * The latitude of the device
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lat(): Optional<String> = lat.getOptional("lat")

        /**
         * The longitude of the device
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun long_(): Optional<String> = long_.getOptional("long")

        /**
         * The operating system version
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun osVersion(): Optional<String> = osVersion.getOptional("os_version")

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<String> = lat

        /**
         * Returns the raw JSON value of [long_].
         *
         * Unlike [long_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("long") @ExcludeMissing fun _long_(): JsonField<String> = long_

        /**
         * Returns the raw JSON value of [osVersion].
         *
         * Unlike [osVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("os_version") @ExcludeMissing fun _osVersion(): JsonField<String> = osVersion

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

            /** Returns a mutable builder for constructing an instance of [Tracking]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tracking]. */
        class Builder internal constructor() {

            private var ip: JsonField<String> = JsonMissing.of()
            private var lat: JsonField<String> = JsonMissing.of()
            private var long_: JsonField<String> = JsonMissing.of()
            private var osVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tracking: Tracking) = apply {
                ip = tracking.ip
                lat = tracking.lat
                long_ = tracking.long_
                osVersion = tracking.osVersion
                additionalProperties = tracking.additionalProperties.toMutableMap()
            }

            /** The IP address of the device */
            fun ip(ip: String?) = ip(JsonField.ofNullable(ip))

            /** Alias for calling [Builder.ip] with `ip.orElse(null)`. */
            fun ip(ip: Optional<String>) = ip(ip.getOrNull())

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /** The latitude of the device */
            fun lat(lat: String?) = lat(JsonField.ofNullable(lat))

            /** Alias for calling [Builder.lat] with `lat.orElse(null)`. */
            fun lat(lat: Optional<String>) = lat(lat.getOrNull())

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<String>) = apply { this.lat = lat }

            /** The longitude of the device */
            fun long_(long_: String?) = long_(JsonField.ofNullable(long_))

            /** Alias for calling [Builder.long_] with `long_.orElse(null)`. */
            fun long_(long_: Optional<String>) = long_(long_.getOrNull())

            /**
             * Sets [Builder.long_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.long_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun long_(long_: JsonField<String>) = apply { this.long_ = long_ }

            /** The operating system version */
            fun osVersion(osVersion: String?) = osVersion(JsonField.ofNullable(osVersion))

            /** Alias for calling [Builder.osVersion] with `osVersion.orElse(null)`. */
            fun osVersion(osVersion: Optional<String>) = osVersion(osVersion.getOrNull())

            /**
             * Sets [Builder.osVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.osVersion] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun osVersion(osVersion: JsonField<String>) = apply { this.osVersion = osVersion }

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
             * Returns an immutable instance of [Tracking].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tracking =
                Tracking(ip, lat, long_, osVersion, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Tracking = apply {
            if (validated) {
                return@apply
            }

            ip()
            lat()
            long_()
            osVersion()
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
            (if (ip.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (long_.asKnown().isPresent) 1 else 0) +
                (if (osVersion.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tracking &&
                ip == other.ip &&
                lat == other.lat &&
                long_ == other.long_ &&
                osVersion == other.osVersion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ip, lat, long_, osVersion, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tracking{ip=$ip, lat=$lat, long_=$long_, osVersion=$osVersion, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserToken &&
            token == other.token &&
            providerKey == other.providerKey &&
            device == other.device &&
            expiryDate == other.expiryDate &&
            properties == other.properties &&
            tracking == other.tracking &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            providerKey,
            device,
            expiryDate,
            properties,
            tracking,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserToken{token=$token, providerKey=$providerKey, device=$device, expiryDate=$expiryDate, properties=$properties, tracking=$tracking, additionalProperties=$additionalProperties}"
}
