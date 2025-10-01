// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.getOrThrow
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
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

class BaseMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val channels: JsonField<Channels>,
    private val context: JsonField<MessageContext>,
    private val data: JsonField<Data>,
    private val delay: JsonField<Delay>,
    private val expiry: JsonField<Expiry>,
    private val metadata: JsonField<Metadata>,
    private val preferences: JsonField<Preferences>,
    private val providers: JsonField<Providers>,
    private val routing: JsonField<Routing>,
    private val timeout: JsonField<Timeout>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channels") @ExcludeMissing channels: JsonField<Channels> = JsonMissing.of(),
        @JsonProperty("context")
        @ExcludeMissing
        context: JsonField<MessageContext> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("delay") @ExcludeMissing delay: JsonField<Delay> = JsonMissing.of(),
        @JsonProperty("expiry") @ExcludeMissing expiry: JsonField<Expiry> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("preferences")
        @ExcludeMissing
        preferences: JsonField<Preferences> = JsonMissing.of(),
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<Providers> = JsonMissing.of(),
        @JsonProperty("routing") @ExcludeMissing routing: JsonField<Routing> = JsonMissing.of(),
        @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Timeout> = JsonMissing.of(),
    ) : this(
        brandId,
        channels,
        context,
        data,
        delay,
        expiry,
        metadata,
        preferences,
        providers,
        routing,
        timeout,
        mutableMapOf(),
    )

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = brandId.getOptional("brand_id")

    /**
     * "Define run-time configuration for one or more channels. If you don't specify channels, the
     * default configuration for each channel will be used. Valid ChannelId's are: email, sms, push,
     * inbox, direct_message, banner, and webhook."
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<Channels> = channels.getOptional("channels")

    /**
     * Context to load with this recipient. Will override any context set on message.context.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<MessageContext> = context.getOptional("context")

    /**
     * An arbitrary object that includes any data you want to pass to the message. The data will
     * populate the corresponding template or elements variables.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Defines the time to wait before delivering the message. You can specify one of the following
     * options. Duration with the number of milliseconds to delay. Until with an ISO 8601 timestamp
     * that specifies when it should be delivered. Until with an OpenStreetMap opening_hours-like
     * format that specifies the
     * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
     * (e.g., 'Mo-Fr 08:00-18:00pm')
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun delay(): Optional<Delay> = delay.getOptional("delay")

    /**
     * "Expiry allows you to set an absolute or relative time in which a message expires. Note: This
     * is only valid for the Courier Inbox channel as of 12-08-2022."
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiry(): Optional<Expiry> = expiry.getOptional("expiry")

    /**
     * Metadata such as utm tracking attached with the notification through this channel.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferences(): Optional<Preferences> = preferences.getOptional("preferences")

    /**
     * An object whose keys are valid provider identifiers which map to an object.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providers(): Optional<Providers> = providers.getOptional("providers")

    /**
     * Allows you to customize which channel(s) Courier will potentially deliver the message. If no
     * routing key is specified, Courier will use the default routing configuration or routing
     * defined by the template.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routing(): Optional<Routing> = routing.getOptional("routing")

    /**
     * Time in ms to attempt the channel before failing over to the next available channel.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<Timeout> = timeout.getOptional("timeout")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Channels> = channels

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<MessageContext> = context

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [delay].
     *
     * Unlike [delay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delay") @ExcludeMissing fun _delay(): JsonField<Delay> = delay

    /**
     * Returns the raw JSON value of [expiry].
     *
     * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry") @ExcludeMissing fun _expiry(): JsonField<Expiry> = expiry

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [preferences].
     *
     * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferences")
    @ExcludeMissing
    fun _preferences(): JsonField<Preferences> = preferences

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonField<Providers> = providers

    /**
     * Returns the raw JSON value of [routing].
     *
     * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing") @ExcludeMissing fun _routing(): JsonField<Routing> = routing

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Timeout> = timeout

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

        /** Returns a mutable builder for constructing an instance of [BaseMessage]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BaseMessage]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String> = JsonMissing.of()
        private var channels: JsonField<Channels> = JsonMissing.of()
        private var context: JsonField<MessageContext> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var delay: JsonField<Delay> = JsonMissing.of()
        private var expiry: JsonField<Expiry> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var preferences: JsonField<Preferences> = JsonMissing.of()
        private var providers: JsonField<Providers> = JsonMissing.of()
        private var routing: JsonField<Routing> = JsonMissing.of()
        private var timeout: JsonField<Timeout> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(baseMessage: BaseMessage) = apply {
            brandId = baseMessage.brandId
            channels = baseMessage.channels
            context = baseMessage.context
            data = baseMessage.data
            delay = baseMessage.delay
            expiry = baseMessage.expiry
            metadata = baseMessage.metadata
            preferences = baseMessage.preferences
            providers = baseMessage.providers
            routing = baseMessage.routing
            timeout = baseMessage.timeout
            additionalProperties = baseMessage.additionalProperties.toMutableMap()
        }

        fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /**
         * "Define run-time configuration for one or more channels. If you don't specify channels,
         * the default configuration for each channel will be used. Valid ChannelId's are: email,
         * sms, push, inbox, direct_message, banner, and webhook."
         */
        fun channels(channels: Channels?) = channels(JsonField.ofNullable(channels))

        /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
        fun channels(channels: Optional<Channels>) = channels(channels.getOrNull())

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed [Channels] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

        /**
         * Context to load with this recipient. Will override any context set on message.context.
         */
        fun context(context: MessageContext?) = context(JsonField.ofNullable(context))

        /** Alias for calling [Builder.context] with `context.orElse(null)`. */
        fun context(context: Optional<MessageContext>) = context(context.getOrNull())

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [MessageContext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun context(context: JsonField<MessageContext>) = apply { this.context = context }

        /**
         * An arbitrary object that includes any data you want to pass to the message. The data will
         * populate the corresponding template or elements variables.
         */
        fun data(data: Data?) = data(JsonField.ofNullable(data))

        /** Alias for calling [Builder.data] with `data.orElse(null)`. */
        fun data(data: Optional<Data>) = data(data.getOrNull())

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Defines the time to wait before delivering the message. You can specify one of the
         * following options. Duration with the number of milliseconds to delay. Until with an ISO
         * 8601 timestamp that specifies when it should be delivered. Until with an OpenStreetMap
         * opening_hours-like format that specifies the
         * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
         * (e.g., 'Mo-Fr 08:00-18:00pm')
         */
        fun delay(delay: Delay?) = delay(JsonField.ofNullable(delay))

        /** Alias for calling [Builder.delay] with `delay.orElse(null)`. */
        fun delay(delay: Optional<Delay>) = delay(delay.getOrNull())

        /**
         * Sets [Builder.delay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delay] with a well-typed [Delay] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun delay(delay: JsonField<Delay>) = apply { this.delay = delay }

        /**
         * "Expiry allows you to set an absolute or relative time in which a message expires. Note:
         * This is only valid for the Courier Inbox channel as of 12-08-2022."
         */
        fun expiry(expiry: Expiry?) = expiry(JsonField.ofNullable(expiry))

        /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
        fun expiry(expiry: Optional<Expiry>) = expiry(expiry.getOrNull())

        /**
         * Sets [Builder.expiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiry] with a well-typed [Expiry] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiry(expiry: JsonField<Expiry>) = apply { this.expiry = expiry }

        /** Metadata such as utm tracking attached with the notification through this channel. */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun preferences(preferences: Preferences?) = preferences(JsonField.ofNullable(preferences))

        /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
        fun preferences(preferences: Optional<Preferences>) = preferences(preferences.getOrNull())

        /**
         * Sets [Builder.preferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferences] with a well-typed [Preferences] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferences(preferences: JsonField<Preferences>) = apply {
            this.preferences = preferences
        }

        /** An object whose keys are valid provider identifiers which map to an object. */
        fun providers(providers: Providers?) = providers(JsonField.ofNullable(providers))

        /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
        fun providers(providers: Optional<Providers>) = providers(providers.getOrNull())

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed [Providers] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providers(providers: JsonField<Providers>) = apply { this.providers = providers }

        /**
         * Allows you to customize which channel(s) Courier will potentially deliver the message. If
         * no routing key is specified, Courier will use the default routing configuration or
         * routing defined by the template.
         */
        fun routing(routing: Routing?) = routing(JsonField.ofNullable(routing))

        /** Alias for calling [Builder.routing] with `routing.orElse(null)`. */
        fun routing(routing: Optional<Routing>) = routing(routing.getOrNull())

        /**
         * Sets [Builder.routing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routing] with a well-typed [Routing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun routing(routing: JsonField<Routing>) = apply { this.routing = routing }

        /** Time in ms to attempt the channel before failing over to the next available channel. */
        fun timeout(timeout: Timeout?) = timeout(JsonField.ofNullable(timeout))

        /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
        fun timeout(timeout: Optional<Timeout>) = timeout(timeout.getOrNull())

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Timeout] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Timeout>) = apply { this.timeout = timeout }

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
         * Returns an immutable instance of [BaseMessage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BaseMessage =
            BaseMessage(
                brandId,
                channels,
                context,
                data,
                delay,
                expiry,
                metadata,
                preferences,
                providers,
                routing,
                timeout,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BaseMessage = apply {
        if (validated) {
            return@apply
        }

        brandId()
        channels().ifPresent { it.validate() }
        context().ifPresent { it.validate() }
        data().ifPresent { it.validate() }
        delay().ifPresent { it.validate() }
        expiry().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        preferences().ifPresent { it.validate() }
        providers().ifPresent { it.validate() }
        routing().ifPresent { it.validate() }
        timeout().ifPresent { it.validate() }
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
        (if (brandId.asKnown().isPresent) 1 else 0) +
            (channels.asKnown().getOrNull()?.validity() ?: 0) +
            (context.asKnown().getOrNull()?.validity() ?: 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (delay.asKnown().getOrNull()?.validity() ?: 0) +
            (expiry.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (preferences.asKnown().getOrNull()?.validity() ?: 0) +
            (providers.asKnown().getOrNull()?.validity() ?: 0) +
            (routing.asKnown().getOrNull()?.validity() ?: 0) +
            (timeout.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * "Define run-time configuration for one or more channels. If you don't specify channels, the
     * default configuration for each channel will be used. Valid ChannelId's are: email, sms, push,
     * inbox, direct_message, banner, and webhook."
     */
    class Channels
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

            /** Returns a mutable builder for constructing an instance of [Channels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Channels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(channels: Channels) = apply {
                additionalProperties = channels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Channels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Channels = Channels(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Channels = apply {
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

            return other is Channels && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Channels{additionalProperties=$additionalProperties}"
    }

    /**
     * An arbitrary object that includes any data you want to pass to the message. The data will
     * populate the corresponding template or elements variables.
     */
    class Data
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
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

            return other is Data && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    /**
     * Defines the time to wait before delivering the message. You can specify one of the following
     * options. Duration with the number of milliseconds to delay. Until with an ISO 8601 timestamp
     * that specifies when it should be delivered. Until with an OpenStreetMap opening_hours-like
     * format that specifies the
     * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
     * (e.g., 'Mo-Fr 08:00-18:00pm')
     */
    class Delay
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duration: JsonField<Long>,
        private val until: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("until") @ExcludeMissing until: JsonField<String> = JsonMissing.of(),
        ) : this(duration, until, mutableMapOf())

        /**
         * The duration of the delay in milliseconds.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * An ISO 8601 timestamp that specifies when it should be delivered or an OpenStreetMap
         * opening_hours-like format that specifies the
         * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
         * (e.g., 'Mo-Fr 08:00-18:00pm')
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun until(): Optional<String> = until.getOptional("until")

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        /**
         * Returns the raw JSON value of [until].
         *
         * Unlike [until], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("until") @ExcludeMissing fun _until(): JsonField<String> = until

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

            /** Returns a mutable builder for constructing an instance of [Delay]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Delay]. */
        class Builder internal constructor() {

            private var duration: JsonField<Long> = JsonMissing.of()
            private var until: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(delay: Delay) = apply {
                duration = delay.duration
                until = delay.until
                additionalProperties = delay.additionalProperties.toMutableMap()
            }

            /** The duration of the delay in milliseconds. */
            fun duration(duration: Long?) = duration(JsonField.ofNullable(duration))

            /**
             * Alias for [Builder.duration].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun duration(duration: Long) = duration(duration as Long?)

            /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
            fun duration(duration: Optional<Long>) = duration(duration.getOrNull())

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            /**
             * An ISO 8601 timestamp that specifies when it should be delivered or an OpenStreetMap
             * opening_hours-like format that specifies the
             * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
             * (e.g., 'Mo-Fr 08:00-18:00pm')
             */
            fun until(until: String?) = until(JsonField.ofNullable(until))

            /** Alias for calling [Builder.until] with `until.orElse(null)`. */
            fun until(until: Optional<String>) = until(until.getOrNull())

            /**
             * Sets [Builder.until] to an arbitrary JSON value.
             *
             * You should usually call [Builder.until] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun until(until: JsonField<String>) = apply { this.until = until }

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
             * Returns an immutable instance of [Delay].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Delay = Delay(duration, until, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Delay = apply {
            if (validated) {
                return@apply
            }

            duration()
            until()
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
            (if (duration.asKnown().isPresent) 1 else 0) + (if (until.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Delay &&
                duration == other.duration &&
                until == other.until &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(duration, until, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Delay{duration=$duration, until=$until, additionalProperties=$additionalProperties}"
    }

    /**
     * "Expiry allows you to set an absolute or relative time in which a message expires. Note: This
     * is only valid for the Courier Inbox channel as of 12-08-2022."
     */
    class Expiry
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresIn: JsonField<ExpiresIn>,
        private val expiresAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expires_in")
            @ExcludeMissing
            expiresIn: JsonField<ExpiresIn> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<String> = JsonMissing.of(),
        ) : this(expiresIn, expiresAt, mutableMapOf())

        /**
         * A duration in the form of milliseconds or an ISO8601 Duration format (i.e. P1DT4H).
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresIn(): ExpiresIn = expiresIn.getRequired("expires_in")

        /**
         * An epoch timestamp or ISO8601 timestamp with timezone `(YYYY-MM-DDThh:mm:ss.sTZD)` that
         * describes the time in which a message expires.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

        /**
         * Returns the raw JSON value of [expiresIn].
         *
         * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_in")
        @ExcludeMissing
        fun _expiresIn(): JsonField<ExpiresIn> = expiresIn

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

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
             * Returns a mutable builder for constructing an instance of [Expiry].
             *
             * The following fields are required:
             * ```java
             * .expiresIn()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Expiry]. */
        class Builder internal constructor() {

            private var expiresIn: JsonField<ExpiresIn>? = null
            private var expiresAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(expiry: Expiry) = apply {
                expiresIn = expiry.expiresIn
                expiresAt = expiry.expiresAt
                additionalProperties = expiry.additionalProperties.toMutableMap()
            }

            /**
             * A duration in the form of milliseconds or an ISO8601 Duration format (i.e. P1DT4H).
             */
            fun expiresIn(expiresIn: ExpiresIn) = expiresIn(JsonField.of(expiresIn))

            /**
             * Sets [Builder.expiresIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresIn] with a well-typed [ExpiresIn] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresIn(expiresIn: JsonField<ExpiresIn>) = apply { this.expiresIn = expiresIn }

            /** Alias for calling [expiresIn] with `ExpiresIn.ofString(string)`. */
            fun expiresIn(string: String) = expiresIn(ExpiresIn.ofString(string))

            /** Alias for calling [expiresIn] with `ExpiresIn.ofInteger(integer)`. */
            fun expiresIn(integer: Long) = expiresIn(ExpiresIn.ofInteger(integer))

            /**
             * An epoch timestamp or ISO8601 timestamp with timezone `(YYYY-MM-DDThh:mm:ss.sTZD)`
             * that describes the time in which a message expires.
             */
            fun expiresAt(expiresAt: String?) = expiresAt(JsonField.ofNullable(expiresAt))

            /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
            fun expiresAt(expiresAt: Optional<String>) = expiresAt(expiresAt.getOrNull())

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

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
             * Returns an immutable instance of [Expiry].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .expiresIn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Expiry =
                Expiry(
                    checkRequired("expiresIn", expiresIn),
                    expiresAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Expiry = apply {
            if (validated) {
                return@apply
            }

            expiresIn().validate()
            expiresAt()
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
            (expiresIn.asKnown().getOrNull()?.validity() ?: 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0)

        /** A duration in the form of milliseconds or an ISO8601 Duration format (i.e. P1DT4H). */
        @JsonDeserialize(using = ExpiresIn.Deserializer::class)
        @JsonSerialize(using = ExpiresIn.Serializer::class)
        class ExpiresIn
        private constructor(
            private val string: String? = null,
            private val integer: Long? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun isString(): Boolean = string != null

            fun isInteger(): Boolean = integer != null

            fun asString(): String = string.getOrThrow("string")

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    integer != null -> visitor.visitInteger(integer)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): ExpiresIn = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitInteger(integer: Long) {}
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

                        override fun visitInteger(integer: Long) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExpiresIn && string == other.string && integer == other.integer
            }

            override fun hashCode(): Int = Objects.hash(string, integer)

            override fun toString(): String =
                when {
                    string != null -> "ExpiresIn{string=$string}"
                    integer != null -> "ExpiresIn{integer=$integer}"
                    _json != null -> "ExpiresIn{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ExpiresIn")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = ExpiresIn(string = string)

                @JvmStatic fun ofInteger(integer: Long) = ExpiresIn(integer = integer)
            }

            /**
             * An interface that defines how to map each variant of [ExpiresIn] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitInteger(integer: Long): T

                /**
                 * Maps an unknown variant of [ExpiresIn] to a value of type [T].
                 *
                 * An instance of [ExpiresIn] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws CourierInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw CourierInvalidDataException("Unknown ExpiresIn: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<ExpiresIn>(ExpiresIn::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ExpiresIn {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    ExpiresIn(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    ExpiresIn(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> ExpiresIn(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<ExpiresIn>(ExpiresIn::class) {

                override fun serialize(
                    value: ExpiresIn,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.integer != null -> generator.writeObject(value.integer)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ExpiresIn")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Expiry &&
                expiresIn == other.expiresIn &&
                expiresAt == other.expiresAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresIn, expiresAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Expiry{expiresIn=$expiresIn, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
    }

    /** Metadata such as utm tracking attached with the notification through this channel. */
    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val event: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val traceId: JsonField<String>,
        private val utm: JsonField<Utm>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("utm") @ExcludeMissing utm: JsonField<Utm> = JsonMissing.of(),
        ) : this(event, tags, traceId, utm, mutableMapOf())

        /**
         * An arbitrary string to tracks the event that generated this request (e.g. 'signup').
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun event(): Optional<String> = event.getOptional("event")

        /**
         * An array of up to 9 tags you wish to associate with this request (and corresponding
         * messages) for later analysis. Individual tags cannot be more than 30 characters in
         * length.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * A unique ID used to correlate this request to processing on your servers. Note: Courier
         * does not verify the uniqueness of this ID.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun traceId(): Optional<String> = traceId.getOptional("trace_id")

        /**
         * Identify the campaign that refers traffic to a specific website, and attributes the
         * browser's website session.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun utm(): Optional<Utm> = utm.getOptional("utm")

        /**
         * Returns the raw JSON value of [event].
         *
         * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [traceId].
         *
         * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        /**
         * Returns the raw JSON value of [utm].
         *
         * Unlike [utm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("utm") @ExcludeMissing fun _utm(): JsonField<Utm> = utm

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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var event: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var traceId: JsonField<String> = JsonMissing.of()
            private var utm: JsonField<Utm> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                event = metadata.event
                tags = metadata.tags.map { it.toMutableList() }
                traceId = metadata.traceId
                utm = metadata.utm
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /**
             * An arbitrary string to tracks the event that generated this request (e.g. 'signup').
             */
            fun event(event: String?) = event(JsonField.ofNullable(event))

            /** Alias for calling [Builder.event] with `event.orElse(null)`. */
            fun event(event: Optional<String>) = event(event.getOrNull())

            /**
             * Sets [Builder.event] to an arbitrary JSON value.
             *
             * You should usually call [Builder.event] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun event(event: JsonField<String>) = apply { this.event = event }

            /**
             * An array of up to 9 tags you wish to associate with this request (and corresponding
             * messages) for later analysis. Individual tags cannot be more than 30 characters in
             * length.
             */
            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /**
             * A unique ID used to correlate this request to processing on your servers. Note:
             * Courier does not verify the uniqueness of this ID.
             */
            fun traceId(traceId: String?) = traceId(JsonField.ofNullable(traceId))

            /** Alias for calling [Builder.traceId] with `traceId.orElse(null)`. */
            fun traceId(traceId: Optional<String>) = traceId(traceId.getOrNull())

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            /**
             * Identify the campaign that refers traffic to a specific website, and attributes the
             * browser's website session.
             */
            fun utm(utm: Utm?) = utm(JsonField.ofNullable(utm))

            /** Alias for calling [Builder.utm] with `utm.orElse(null)`. */
            fun utm(utm: Optional<Utm>) = utm(utm.getOrNull())

            /**
             * Sets [Builder.utm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.utm] with a well-typed [Utm] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun utm(utm: JsonField<Utm>) = apply { this.utm = utm }

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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata =
                Metadata(
                    event,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    traceId,
                    utm,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            event()
            tags()
            traceId()
            utm().ifPresent { it.validate() }
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
            (if (event.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (traceId.asKnown().isPresent) 1 else 0) +
                (utm.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                event == other.event &&
                tags == other.tags &&
                traceId == other.traceId &&
                utm == other.utm &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(event, tags, traceId, utm, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{event=$event, tags=$tags, traceId=$traceId, utm=$utm, additionalProperties=$additionalProperties}"
    }

    class Preferences
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val subscriptionTopicId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subscription_topic_id")
            @ExcludeMissing
            subscriptionTopicId: JsonField<String> = JsonMissing.of()
        ) : this(subscriptionTopicId, mutableMapOf())

        /**
         * The ID of the subscription topic you want to apply to the message. If this is a templated
         * message, it will override the subscription topic if already associated
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionTopicId(): String = subscriptionTopicId.getRequired("subscription_topic_id")

        /**
         * Returns the raw JSON value of [subscriptionTopicId].
         *
         * Unlike [subscriptionTopicId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_topic_id")
        @ExcludeMissing
        fun _subscriptionTopicId(): JsonField<String> = subscriptionTopicId

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
             * Returns a mutable builder for constructing an instance of [Preferences].
             *
             * The following fields are required:
             * ```java
             * .subscriptionTopicId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Preferences]. */
        class Builder internal constructor() {

            private var subscriptionTopicId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(preferences: Preferences) = apply {
                subscriptionTopicId = preferences.subscriptionTopicId
                additionalProperties = preferences.additionalProperties.toMutableMap()
            }

            /**
             * The ID of the subscription topic you want to apply to the message. If this is a
             * templated message, it will override the subscription topic if already associated
             */
            fun subscriptionTopicId(subscriptionTopicId: String) =
                subscriptionTopicId(JsonField.of(subscriptionTopicId))

            /**
             * Sets [Builder.subscriptionTopicId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionTopicId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionTopicId(subscriptionTopicId: JsonField<String>) = apply {
                this.subscriptionTopicId = subscriptionTopicId
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
             * Returns an immutable instance of [Preferences].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .subscriptionTopicId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Preferences =
                Preferences(
                    checkRequired("subscriptionTopicId", subscriptionTopicId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Preferences = apply {
            if (validated) {
                return@apply
            }

            subscriptionTopicId()
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
        internal fun validity(): Int = (if (subscriptionTopicId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Preferences &&
                subscriptionTopicId == other.subscriptionTopicId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(subscriptionTopicId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Preferences{subscriptionTopicId=$subscriptionTopicId, additionalProperties=$additionalProperties}"
    }

    /** An object whose keys are valid provider identifiers which map to an object. */
    class Providers
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

            /** Returns a mutable builder for constructing an instance of [Providers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Providers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(providers: Providers) = apply {
                additionalProperties = providers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Providers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Providers = Providers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Providers = apply {
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

            return other is Providers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Providers{additionalProperties=$additionalProperties}"
    }

    /**
     * Allows you to customize which channel(s) Courier will potentially deliver the message. If no
     * routing key is specified, Courier will use the default routing configuration or routing
     * defined by the template.
     */
    class Routing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<Channel>>,
        private val method: JsonField<RoutingMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channels")
            @ExcludeMissing
            channels: JsonField<List<Channel>> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            method: JsonField<RoutingMethod> = JsonMissing.of(),
        ) : this(channels, method, mutableMapOf())

        /**
         * A list of channels or providers to send the message through. Can also recursively define
         * sub-routing methods, which can be useful for defining advanced push notification delivery
         * strategies.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channels(): List<Channel> = channels.getRequired("channels")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun method(): RoutingMethod = method.getRequired("method")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<Channel>> = channels

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<RoutingMethod> = method

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
             * Returns a mutable builder for constructing an instance of [Routing].
             *
             * The following fields are required:
             * ```java
             * .channels()
             * .method()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Routing]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<Channel>>? = null
            private var method: JsonField<RoutingMethod>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(routing: Routing) = apply {
                channels = routing.channels.map { it.toMutableList() }
                method = routing.method
                additionalProperties = routing.additionalProperties.toMutableMap()
            }

            /**
             * A list of channels or providers to send the message through. Can also recursively
             * define sub-routing methods, which can be useful for defining advanced push
             * notification delivery strategies.
             */
            fun channels(channels: List<Channel>) = channels(JsonField.of(channels))

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed `List<Channel>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channels(channels: JsonField<List<Channel>>) = apply {
                this.channels = channels.map { it.toMutableList() }
            }

            /**
             * Adds a single [Channel] to [channels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChannel(channel: Channel) = apply {
                channels =
                    (channels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("channels", it).add(channel)
                    }
            }

            /** Alias for calling [addChannel] with `Channel.ofRoutingStrategy(routingStrategy)`. */
            fun addChannel(routingStrategy: Channel.RoutingStrategyChannel) =
                addChannel(Channel.ofRoutingStrategy(routingStrategy))

            /**
             * Alias for calling [addChannel] with
             * `Channel.ofRoutingStrategyProvider(routingStrategyProvider)`.
             */
            fun addChannel(routingStrategyProvider: Channel.RoutingStrategyProvider) =
                addChannel(Channel.ofRoutingStrategyProvider(routingStrategyProvider))

            /** Alias for calling [addChannel] with `Channel.ofString(string)`. */
            fun addChannel(string: String) = addChannel(Channel.ofString(string))

            fun method(method: RoutingMethod) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [RoutingMethod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<RoutingMethod>) = apply { this.method = method }

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
             * Returns an immutable instance of [Routing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .channels()
             * .method()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Routing =
                Routing(
                    checkRequired("channels", channels).map { it.toImmutable() },
                    checkRequired("method", method),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Routing = apply {
            if (validated) {
                return@apply
            }

            channels().forEach { it.validate() }
            method().validate()
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
            (channels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (method.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = Channel.Deserializer::class)
        @JsonSerialize(using = Channel.Serializer::class)
        class Channel
        private constructor(
            private val routingStrategy: RoutingStrategyChannel? = null,
            private val routingStrategyProvider: RoutingStrategyProvider? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun routingStrategy(): Optional<RoutingStrategyChannel> =
                Optional.ofNullable(routingStrategy)

            fun routingStrategyProvider(): Optional<RoutingStrategyProvider> =
                Optional.ofNullable(routingStrategyProvider)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isRoutingStrategy(): Boolean = routingStrategy != null

            fun isRoutingStrategyProvider(): Boolean = routingStrategyProvider != null

            fun isString(): Boolean = string != null

            fun asRoutingStrategy(): RoutingStrategyChannel =
                routingStrategy.getOrThrow("routingStrategy")

            fun asRoutingStrategyProvider(): RoutingStrategyProvider =
                routingStrategyProvider.getOrThrow("routingStrategyProvider")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    routingStrategy != null -> visitor.visitRoutingStrategy(routingStrategy)
                    routingStrategyProvider != null ->
                        visitor.visitRoutingStrategyProvider(routingStrategyProvider)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Channel = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitRoutingStrategy(routingStrategy: RoutingStrategyChannel) {
                            routingStrategy.validate()
                        }

                        override fun visitRoutingStrategyProvider(
                            routingStrategyProvider: RoutingStrategyProvider
                        ) {
                            routingStrategyProvider.validate()
                        }

                        override fun visitString(string: String) {}
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
                        override fun visitRoutingStrategy(routingStrategy: RoutingStrategyChannel) =
                            routingStrategy.validity()

                        override fun visitRoutingStrategyProvider(
                            routingStrategyProvider: RoutingStrategyProvider
                        ) = routingStrategyProvider.validity()

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Channel &&
                    routingStrategy == other.routingStrategy &&
                    routingStrategyProvider == other.routingStrategyProvider &&
                    string == other.string
            }

            override fun hashCode(): Int =
                Objects.hash(routingStrategy, routingStrategyProvider, string)

            override fun toString(): String =
                when {
                    routingStrategy != null -> "Channel{routingStrategy=$routingStrategy}"
                    routingStrategyProvider != null ->
                        "Channel{routingStrategyProvider=$routingStrategyProvider}"
                    string != null -> "Channel{string=$string}"
                    _json != null -> "Channel{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Channel")
                }

            companion object {

                @JvmStatic
                fun ofRoutingStrategy(routingStrategy: RoutingStrategyChannel) =
                    Channel(routingStrategy = routingStrategy)

                @JvmStatic
                fun ofRoutingStrategyProvider(routingStrategyProvider: RoutingStrategyProvider) =
                    Channel(routingStrategyProvider = routingStrategyProvider)

                @JvmStatic fun ofString(string: String) = Channel(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Channel] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitRoutingStrategy(routingStrategy: RoutingStrategyChannel): T

                fun visitRoutingStrategyProvider(
                    routingStrategyProvider: RoutingStrategyProvider
                ): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Channel] to a value of type [T].
                 *
                 * An instance of [Channel] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws CourierInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw CourierInvalidDataException("Unknown Channel: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Channel>(Channel::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Channel {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<RoutingStrategyChannel>())
                                    ?.let { Channel(routingStrategy = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<RoutingStrategyProvider>())
                                    ?.let { Channel(routingStrategyProvider = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Channel(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from array).
                        0 -> Channel(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Channel>(Channel::class) {

                override fun serialize(
                    value: Channel,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.routingStrategy != null ->
                            generator.writeObject(value.routingStrategy)
                        value.routingStrategyProvider != null ->
                            generator.writeObject(value.routingStrategyProvider)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Channel")
                    }
                }
            }

            class RoutingStrategyChannel
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val channel: JsonField<String>,
                private val config: JsonField<Config>,
                private val if_: JsonField<String>,
                private val method: JsonField<RoutingMethod>,
                private val providers: JsonField<Providers>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("channel")
                    @ExcludeMissing
                    channel: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("config")
                    @ExcludeMissing
                    config: JsonField<Config> = JsonMissing.of(),
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<RoutingMethod> = JsonMissing.of(),
                    @JsonProperty("providers")
                    @ExcludeMissing
                    providers: JsonField<Providers> = JsonMissing.of(),
                ) : this(channel, config, if_, method, providers, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun channel(): String = channel.getRequired("channel")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun config(): Optional<Config> = config.getOptional("config")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun method(): Optional<RoutingMethod> = method.getOptional("method")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun providers(): Optional<Providers> = providers.getOptional("providers")

                /**
                 * Returns the raw JSON value of [channel].
                 *
                 * Unlike [channel], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

                /**
                 * Returns the raw JSON value of [config].
                 *
                 * Unlike [config], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method")
                @ExcludeMissing
                fun _method(): JsonField<RoutingMethod> = method

                /**
                 * Returns the raw JSON value of [providers].
                 *
                 * Unlike [providers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("providers")
                @ExcludeMissing
                fun _providers(): JsonField<Providers> = providers

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
                     * Returns a mutable builder for constructing an instance of
                     * [RoutingStrategyChannel].
                     *
                     * The following fields are required:
                     * ```java
                     * .channel()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RoutingStrategyChannel]. */
                class Builder internal constructor() {

                    private var channel: JsonField<String>? = null
                    private var config: JsonField<Config> = JsonMissing.of()
                    private var if_: JsonField<String> = JsonMissing.of()
                    private var method: JsonField<RoutingMethod> = JsonMissing.of()
                    private var providers: JsonField<Providers> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(routingStrategyChannel: RoutingStrategyChannel) = apply {
                        channel = routingStrategyChannel.channel
                        config = routingStrategyChannel.config
                        if_ = routingStrategyChannel.if_
                        method = routingStrategyChannel.method
                        providers = routingStrategyChannel.providers
                        additionalProperties =
                            routingStrategyChannel.additionalProperties.toMutableMap()
                    }

                    fun channel(channel: String) = channel(JsonField.of(channel))

                    /**
                     * Sets [Builder.channel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channel] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channel(channel: JsonField<String>) = apply { this.channel = channel }

                    fun config(config: Config?) = config(JsonField.ofNullable(config))

                    /** Alias for calling [Builder.config] with `config.orElse(null)`. */
                    fun config(config: Optional<Config>) = config(config.getOrNull())

                    /**
                     * Sets [Builder.config] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.config] with a well-typed [Config] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun config(config: JsonField<Config>) = apply { this.config = config }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun method(method: RoutingMethod?) = method(JsonField.ofNullable(method))

                    /** Alias for calling [Builder.method] with `method.orElse(null)`. */
                    fun method(method: Optional<RoutingMethod>) = method(method.getOrNull())

                    /**
                     * Sets [Builder.method] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.method] with a well-typed [RoutingMethod]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun method(method: JsonField<RoutingMethod>) = apply { this.method = method }

                    fun providers(providers: Providers?) =
                        providers(JsonField.ofNullable(providers))

                    /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
                    fun providers(providers: Optional<Providers>) = providers(providers.getOrNull())

                    /**
                     * Sets [Builder.providers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.providers] with a well-typed [Providers]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun providers(providers: JsonField<Providers>) = apply {
                        this.providers = providers
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RoutingStrategyChannel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .channel()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RoutingStrategyChannel =
                        RoutingStrategyChannel(
                            checkRequired("channel", channel),
                            config,
                            if_,
                            method,
                            providers,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RoutingStrategyChannel = apply {
                    if (validated) {
                        return@apply
                    }

                    channel()
                    config().ifPresent { it.validate() }
                    if_()
                    method().ifPresent { it.validate() }
                    providers().ifPresent { it.validate() }
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
                    (if (channel.asKnown().isPresent) 1 else 0) +
                        (config.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (if_.asKnown().isPresent) 1 else 0) +
                        (method.asKnown().getOrNull()?.validity() ?: 0) +
                        (providers.asKnown().getOrNull()?.validity() ?: 0)

                class Config
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

                        /** Returns a mutable builder for constructing an instance of [Config]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Config]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(config: Config) = apply {
                            additionalProperties = config.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Config].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Config = Config(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Config = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Config && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Config{additionalProperties=$additionalProperties}"
                }

                class Providers
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Providers].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Providers]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(providers: Providers) = apply {
                            additionalProperties = providers.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Providers].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Providers = Providers(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Providers = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Providers &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Providers{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RoutingStrategyChannel &&
                        channel == other.channel &&
                        config == other.config &&
                        if_ == other.if_ &&
                        method == other.method &&
                        providers == other.providers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(channel, config, if_, method, providers, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RoutingStrategyChannel{channel=$channel, config=$config, if_=$if_, method=$method, providers=$providers, additionalProperties=$additionalProperties}"
            }

            class RoutingStrategyProvider
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val metadata: JsonField<Metadata>,
                private val name: JsonField<String>,
                private val config: JsonField<Config>,
                private val if_: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("config")
                    @ExcludeMissing
                    config: JsonField<Config> = JsonMissing.of(),
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                ) : this(metadata, name, config, if_, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun metadata(): Metadata = metadata.getRequired("metadata")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun config(): Optional<Config> = config.getOptional("config")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [config].
                 *
                 * Unlike [config], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

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
                     * Returns a mutable builder for constructing an instance of
                     * [RoutingStrategyProvider].
                     *
                     * The following fields are required:
                     * ```java
                     * .metadata()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RoutingStrategyProvider]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<Metadata>? = null
                    private var name: JsonField<String>? = null
                    private var config: JsonField<Config> = JsonMissing.of()
                    private var if_: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(routingStrategyProvider: RoutingStrategyProvider) = apply {
                        metadata = routingStrategyProvider.metadata
                        name = routingStrategyProvider.name
                        config = routingStrategyProvider.config
                        if_ = routingStrategyProvider.if_
                        additionalProperties =
                            routingStrategyProvider.additionalProperties.toMutableMap()
                    }

                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun config(config: Config?) = config(JsonField.ofNullable(config))

                    /** Alias for calling [Builder.config] with `config.orElse(null)`. */
                    fun config(config: Optional<Config>) = config(config.getOrNull())

                    /**
                     * Sets [Builder.config] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.config] with a well-typed [Config] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun config(config: JsonField<Config>) = apply { this.config = config }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RoutingStrategyProvider].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .metadata()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RoutingStrategyProvider =
                        RoutingStrategyProvider(
                            checkRequired("metadata", metadata),
                            checkRequired("name", name),
                            config,
                            if_,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RoutingStrategyProvider = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata().validate()
                    name()
                    config().ifPresent { it.validate() }
                    if_()
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
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (config.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (if_.asKnown().isPresent) 1 else 0)

                class Metadata
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val utm: JsonField<Utm>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("utm") @ExcludeMissing utm: JsonField<Utm> = JsonMissing.of()
                    ) : this(utm, mutableMapOf())

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun utm(): Optional<Utm> = utm.getOptional("utm")

                    /**
                     * Returns the raw JSON value of [utm].
                     *
                     * Unlike [utm], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("utm") @ExcludeMissing fun _utm(): JsonField<Utm> = utm

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

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var utm: JsonField<Utm> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            utm = metadata.utm
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun utm(utm: Utm?) = utm(JsonField.ofNullable(utm))

                        /** Alias for calling [Builder.utm] with `utm.orElse(null)`. */
                        fun utm(utm: Optional<Utm>) = utm(utm.getOrNull())

                        /**
                         * Sets [Builder.utm] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.utm] with a well-typed [Utm] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun utm(utm: JsonField<Utm>) = apply { this.utm = utm }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(utm, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

                        utm().ifPresent { it.validate() }
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
                    internal fun validity(): Int = (utm.asKnown().getOrNull()?.validity() ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            utm == other.utm &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(utm, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Metadata{utm=$utm, additionalProperties=$additionalProperties}"
                }

                class Config
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

                        /** Returns a mutable builder for constructing an instance of [Config]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Config]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(config: Config) = apply {
                            additionalProperties = config.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Config].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Config = Config(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Config = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Config && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Config{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RoutingStrategyProvider &&
                        metadata == other.metadata &&
                        name == other.name &&
                        config == other.config &&
                        if_ == other.if_ &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(metadata, name, config, if_, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RoutingStrategyProvider{metadata=$metadata, name=$name, config=$config, if_=$if_, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Routing &&
                channels == other.channels &&
                method == other.method &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(channels, method, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Routing{channels=$channels, method=$method, additionalProperties=$additionalProperties}"
    }

    /** Time in ms to attempt the channel before failing over to the next available channel. */
    class Timeout
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channel: JsonField<Channel>,
        private val criteria: JsonField<Criteria>,
        private val escalation: JsonField<Long>,
        private val message: JsonField<Long>,
        private val provider: JsonField<Provider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
            @JsonProperty("criteria")
            @ExcludeMissing
            criteria: JsonField<Criteria> = JsonMissing.of(),
            @JsonProperty("escalation")
            @ExcludeMissing
            escalation: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
        ) : this(channel, criteria, escalation, message, provider, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channel(): Optional<Channel> = channel.getOptional("channel")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun criteria(): Optional<Criteria> = criteria.getOptional("criteria")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun escalation(): Optional<Long> = escalation.getOptional("escalation")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<Long> = message.getOptional("message")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

        /**
         * Returns the raw JSON value of [criteria].
         *
         * Unlike [criteria], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("criteria") @ExcludeMissing fun _criteria(): JsonField<Criteria> = criteria

        /**
         * Returns the raw JSON value of [escalation].
         *
         * Unlike [escalation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("escalation") @ExcludeMissing fun _escalation(): JsonField<Long> = escalation

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Long> = message

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

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

            /** Returns a mutable builder for constructing an instance of [Timeout]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Timeout]. */
        class Builder internal constructor() {

            private var channel: JsonField<Channel> = JsonMissing.of()
            private var criteria: JsonField<Criteria> = JsonMissing.of()
            private var escalation: JsonField<Long> = JsonMissing.of()
            private var message: JsonField<Long> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(timeout: Timeout) = apply {
                channel = timeout.channel
                criteria = timeout.criteria
                escalation = timeout.escalation
                message = timeout.message
                provider = timeout.provider
                additionalProperties = timeout.additionalProperties.toMutableMap()
            }

            fun channel(channel: Channel?) = channel(JsonField.ofNullable(channel))

            /** Alias for calling [Builder.channel] with `channel.orElse(null)`. */
            fun channel(channel: Optional<Channel>) = channel(channel.getOrNull())

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [Channel] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            fun criteria(criteria: Criteria?) = criteria(JsonField.ofNullable(criteria))

            /** Alias for calling [Builder.criteria] with `criteria.orElse(null)`. */
            fun criteria(criteria: Optional<Criteria>) = criteria(criteria.getOrNull())

            /**
             * Sets [Builder.criteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.criteria] with a well-typed [Criteria] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun criteria(criteria: JsonField<Criteria>) = apply { this.criteria = criteria }

            fun escalation(escalation: Long?) = escalation(JsonField.ofNullable(escalation))

            /**
             * Alias for [Builder.escalation].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun escalation(escalation: Long) = escalation(escalation as Long?)

            /** Alias for calling [Builder.escalation] with `escalation.orElse(null)`. */
            fun escalation(escalation: Optional<Long>) = escalation(escalation.getOrNull())

            /**
             * Sets [Builder.escalation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.escalation] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun escalation(escalation: JsonField<Long>) = apply { this.escalation = escalation }

            fun message(message: Long?) = message(JsonField.ofNullable(message))

            /**
             * Alias for [Builder.message].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun message(message: Long) = message(message as Long?)

            /** Alias for calling [Builder.message] with `message.orElse(null)`. */
            fun message(message: Optional<Long>) = message(message.getOrNull())

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<Long>) = apply { this.message = message }

            fun provider(provider: Provider?) = provider(JsonField.ofNullable(provider))

            /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
            fun provider(provider: Optional<Provider>) = provider(provider.getOrNull())

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [Timeout].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Timeout =
                Timeout(
                    channel,
                    criteria,
                    escalation,
                    message,
                    provider,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Timeout = apply {
            if (validated) {
                return@apply
            }

            channel().ifPresent { it.validate() }
            criteria().ifPresent { it.validate() }
            escalation()
            message()
            provider().ifPresent { it.validate() }
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
            (channel.asKnown().getOrNull()?.validity() ?: 0) +
                (criteria.asKnown().getOrNull()?.validity() ?: 0) +
                (if (escalation.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0)

        class Channel
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

                /** Returns a mutable builder for constructing an instance of [Channel]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Channel]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(channel: Channel) = apply {
                    additionalProperties = channel.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Channel].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Channel = Channel(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Channel = apply {
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

                return other is Channel && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Channel{additionalProperties=$additionalProperties}"
        }

        class Criteria @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NO_ESCALATION = of("no-escalation")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val VIEWED = of("viewed")

                @JvmField val ENGAGED = of("engaged")

                @JvmStatic fun of(value: String) = Criteria(JsonField.of(value))
            }

            /** An enum containing [Criteria]'s known values. */
            enum class Known {
                NO_ESCALATION,
                DELIVERED,
                VIEWED,
                ENGAGED,
            }

            /**
             * An enum containing [Criteria]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Criteria] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NO_ESCALATION,
                DELIVERED,
                VIEWED,
                ENGAGED,
                /**
                 * An enum member indicating that [Criteria] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NO_ESCALATION -> Value.NO_ESCALATION
                    DELIVERED -> Value.DELIVERED
                    VIEWED -> Value.VIEWED
                    ENGAGED -> Value.ENGAGED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NO_ESCALATION -> Known.NO_ESCALATION
                    DELIVERED -> Known.DELIVERED
                    VIEWED -> Known.VIEWED
                    ENGAGED -> Known.ENGAGED
                    else -> throw CourierInvalidDataException("Unknown Criteria: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Criteria = apply {
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

                return other is Criteria && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Provider
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

                /** Returns a mutable builder for constructing an instance of [Provider]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Provider]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(provider: Provider) = apply {
                    additionalProperties = provider.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Provider].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Provider = Provider(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Provider = apply {
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

                return other is Provider && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Provider{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Timeout &&
                channel == other.channel &&
                criteria == other.criteria &&
                escalation == other.escalation &&
                message == other.message &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channel, criteria, escalation, message, provider, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Timeout{channel=$channel, criteria=$criteria, escalation=$escalation, message=$message, provider=$provider, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BaseMessage &&
            brandId == other.brandId &&
            channels == other.channels &&
            context == other.context &&
            data == other.data &&
            delay == other.delay &&
            expiry == other.expiry &&
            metadata == other.metadata &&
            preferences == other.preferences &&
            providers == other.providers &&
            routing == other.routing &&
            timeout == other.timeout &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            channels,
            context,
            data,
            delay,
            expiry,
            metadata,
            preferences,
            providers,
            routing,
            timeout,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BaseMessage{brandId=$brandId, channels=$channels, context=$context, data=$data, delay=$delay, expiry=$expiry, metadata=$metadata, preferences=$preferences, providers=$providers, routing=$routing, timeout=$timeout, additionalProperties=$additionalProperties}"
}
