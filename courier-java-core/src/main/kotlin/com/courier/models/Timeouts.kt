// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Timeouts
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channel: JsonField<Long>,
    private val provider: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Long> = JsonMissing.of(),
    ) : this(channel, provider, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channel(): Optional<Long> = channel.getOptional("channel")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Long> = provider.getOptional("provider")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Long> = channel

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Long> = provider

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

        /** Returns a mutable builder for constructing an instance of [Timeouts]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Timeouts]. */
    class Builder internal constructor() {

        private var channel: JsonField<Long> = JsonMissing.of()
        private var provider: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timeouts: Timeouts) = apply {
            channel = timeouts.channel
            provider = timeouts.provider
            additionalProperties = timeouts.additionalProperties.toMutableMap()
        }

        fun channel(channel: Long?) = channel(JsonField.ofNullable(channel))

        /**
         * Alias for [Builder.channel].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun channel(channel: Long) = channel(channel as Long?)

        /** Alias for calling [Builder.channel] with `channel.orElse(null)`. */
        fun channel(channel: Optional<Long>) = channel(channel.getOrNull())

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Long>) = apply { this.channel = channel }

        fun provider(provider: Long?) = provider(JsonField.ofNullable(provider))

        /**
         * Alias for [Builder.provider].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun provider(provider: Long) = provider(provider as Long?)

        /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
        fun provider(provider: Optional<Long>) = provider(provider.getOrNull())

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<Long>) = apply { this.provider = provider }

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
         * Returns an immutable instance of [Timeouts].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Timeouts = Timeouts(channel, provider, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Timeouts = apply {
        if (validated) {
            return@apply
        }

        channel()
        provider()
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
        (if (channel.asKnown().isPresent) 1 else 0) + (if (provider.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Timeouts &&
            channel == other.channel &&
            provider == other.provider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(channel, provider, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Timeouts{channel=$channel, provider=$provider, additionalProperties=$additionalProperties}"
}
