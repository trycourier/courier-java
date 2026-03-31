// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
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

class Channel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val if_: JsonField<String>,
    private val metadata: JsonField<ChannelMetadata>,
    private val override: JsonField<Override>,
    private val providers: JsonField<List<String>>,
    private val routingMethod: JsonField<RoutingMethod>,
    private val timeouts: JsonField<Timeouts>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        metadata: JsonField<ChannelMetadata> = JsonMissing.of(),
        @JsonProperty("override") @ExcludeMissing override: JsonField<Override> = JsonMissing.of(),
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("routing_method")
        @ExcludeMissing
        routingMethod: JsonField<RoutingMethod> = JsonMissing.of(),
        @JsonProperty("timeouts") @ExcludeMissing timeouts: JsonField<Timeouts> = JsonMissing.of(),
    ) : this(brandId, if_, metadata, override, providers, routingMethod, timeouts, mutableMapOf())

    /**
     * Brand id used for rendering.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = brandId.getOptional("brand_id")

    /**
     * JS conditional with access to data/profile.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun if_(): Optional<String> = if_.getOptional("if")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<ChannelMetadata> = metadata.getOptional("metadata")

    /**
     * Channel specific overrides.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun override(): Optional<Override> = override.getOptional("override")

    /**
     * Providers enabled for this channel.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providers(): Optional<List<String>> = providers.getOptional("providers")

    /**
     * Defaults to `single`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingMethod(): Optional<RoutingMethod> = routingMethod.getOptional("routing_method")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeouts(): Optional<Timeouts> = timeouts.getOptional("timeouts")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [if_].
     *
     * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<ChannelMetadata> = metadata

    /**
     * Returns the raw JSON value of [override].
     *
     * Unlike [override], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("override") @ExcludeMissing fun _override(): JsonField<Override> = override

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonField<List<String>> = providers

    /**
     * Returns the raw JSON value of [routingMethod].
     *
     * Unlike [routingMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_method")
    @ExcludeMissing
    fun _routingMethod(): JsonField<RoutingMethod> = routingMethod

    /**
     * Returns the raw JSON value of [timeouts].
     *
     * Unlike [timeouts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeouts") @ExcludeMissing fun _timeouts(): JsonField<Timeouts> = timeouts

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

        /** Returns a mutable builder for constructing an instance of [Channel]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Channel]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String> = JsonMissing.of()
        private var if_: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<ChannelMetadata> = JsonMissing.of()
        private var override: JsonField<Override> = JsonMissing.of()
        private var providers: JsonField<MutableList<String>>? = null
        private var routingMethod: JsonField<RoutingMethod> = JsonMissing.of()
        private var timeouts: JsonField<Timeouts> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(channel: Channel) = apply {
            brandId = channel.brandId
            if_ = channel.if_
            metadata = channel.metadata
            override = channel.override
            providers = channel.providers.map { it.toMutableList() }
            routingMethod = channel.routingMethod
            timeouts = channel.timeouts
            additionalProperties = channel.additionalProperties.toMutableMap()
        }

        /** Brand id used for rendering. */
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

        /** JS conditional with access to data/profile. */
        fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

        /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
        fun if_(if_: Optional<String>) = if_(if_.getOrNull())

        /**
         * Sets [Builder.if_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.if_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

        fun metadata(metadata: ChannelMetadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<ChannelMetadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [ChannelMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadata(metadata: JsonField<ChannelMetadata>) = apply { this.metadata = metadata }

        /** Channel specific overrides. */
        fun override(override: Override?) = override(JsonField.ofNullable(override))

        /** Alias for calling [Builder.override] with `override.orElse(null)`. */
        fun override(override: Optional<Override>) = override(override.getOrNull())

        /**
         * Sets [Builder.override] to an arbitrary JSON value.
         *
         * You should usually call [Builder.override] with a well-typed [Override] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun override(override: JsonField<Override>) = apply { this.override = override }

        /** Providers enabled for this channel. */
        fun providers(providers: List<String>?) = providers(JsonField.ofNullable(providers))

        /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
        fun providers(providers: Optional<List<String>>) = providers(providers.getOrNull())

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providers(providers: JsonField<List<String>>) = apply {
            this.providers = providers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [providers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProvider(provider: String) = apply {
            providers =
                (providers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("providers", it).add(provider)
                }
        }

        /** Defaults to `single`. */
        fun routingMethod(routingMethod: RoutingMethod?) =
            routingMethod(JsonField.ofNullable(routingMethod))

        /** Alias for calling [Builder.routingMethod] with `routingMethod.orElse(null)`. */
        fun routingMethod(routingMethod: Optional<RoutingMethod>) =
            routingMethod(routingMethod.getOrNull())

        /**
         * Sets [Builder.routingMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingMethod] with a well-typed [RoutingMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routingMethod(routingMethod: JsonField<RoutingMethod>) = apply {
            this.routingMethod = routingMethod
        }

        fun timeouts(timeouts: Timeouts?) = timeouts(JsonField.ofNullable(timeouts))

        /** Alias for calling [Builder.timeouts] with `timeouts.orElse(null)`. */
        fun timeouts(timeouts: Optional<Timeouts>) = timeouts(timeouts.getOrNull())

        /**
         * Sets [Builder.timeouts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeouts] with a well-typed [Timeouts] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeouts(timeouts: JsonField<Timeouts>) = apply { this.timeouts = timeouts }

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
         * Returns an immutable instance of [Channel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Channel =
            Channel(
                brandId,
                if_,
                metadata,
                override,
                (providers ?: JsonMissing.of()).map { it.toImmutable() },
                routingMethod,
                timeouts,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Channel = apply {
        if (validated) {
            return@apply
        }

        brandId()
        if_()
        metadata().ifPresent { it.validate() }
        override().ifPresent { it.validate() }
        providers()
        routingMethod().ifPresent { it.validate() }
        timeouts().ifPresent { it.validate() }
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
            (if (if_.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (override.asKnown().getOrNull()?.validity() ?: 0) +
            (providers.asKnown().getOrNull()?.size ?: 0) +
            (routingMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (timeouts.asKnown().getOrNull()?.validity() ?: 0)

    /** Channel specific overrides. */
    class Override
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

            /** Returns a mutable builder for constructing an instance of [Override]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Override]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                additionalProperties = override.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Override].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Override = Override(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Override = apply {
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

            return other is Override && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Override{additionalProperties=$additionalProperties}"
    }

    /** Defaults to `single`. */
    class RoutingMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALL = of("all")

            @JvmField val SINGLE = of("single")

            @JvmStatic fun of(value: String) = RoutingMethod(JsonField.of(value))
        }

        /** An enum containing [RoutingMethod]'s known values. */
        enum class Known {
            ALL,
            SINGLE,
        }

        /**
         * An enum containing [RoutingMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RoutingMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            SINGLE,
            /**
             * An enum member indicating that [RoutingMethod] was instantiated with an unknown
             * value.
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
                ALL -> Value.ALL
                SINGLE -> Value.SINGLE
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
                ALL -> Known.ALL
                SINGLE -> Known.SINGLE
                else -> throw CourierInvalidDataException("Unknown RoutingMethod: $value")
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

        fun validate(): RoutingMethod = apply {
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

            return other is RoutingMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Channel &&
            brandId == other.brandId &&
            if_ == other.if_ &&
            metadata == other.metadata &&
            override == other.override &&
            providers == other.providers &&
            routingMethod == other.routingMethod &&
            timeouts == other.timeouts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            if_,
            metadata,
            override,
            providers,
            routingMethod,
            timeouts,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Channel{brandId=$brandId, if_=$if_, metadata=$metadata, override=$override, providers=$providers, routingMethod=$routingMethod, timeouts=$timeouts, additionalProperties=$additionalProperties}"
}
