// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MessageRouting
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channels: JsonField<List<MessageRoutingChannel>>,
    private val method: JsonField<Method>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<MessageRoutingChannel>> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
    ) : this(channels, method, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channels(): List<MessageRoutingChannel> = channels.getRequired("channels")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): Method = method.getRequired("method")

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels")
    @ExcludeMissing
    fun _channels(): JsonField<List<MessageRoutingChannel>> = channels

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

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
         * Returns a mutable builder for constructing an instance of [MessageRouting].
         *
         * The following fields are required:
         * ```java
         * .channels()
         * .method()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageRouting]. */
    class Builder internal constructor() {

        private var channels: JsonField<MutableList<MessageRoutingChannel>>? = null
        private var method: JsonField<Method>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageRouting: MessageRouting) = apply {
            channels = messageRouting.channels.map { it.toMutableList() }
            method = messageRouting.method
            additionalProperties = messageRouting.additionalProperties.toMutableMap()
        }

        fun channels(channels: List<MessageRoutingChannel>) = channels(JsonField.of(channels))

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed
         * `List<MessageRoutingChannel>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun channels(channels: JsonField<List<MessageRoutingChannel>>) = apply {
            this.channels = channels.map { it.toMutableList() }
        }

        /**
         * Adds a single [MessageRoutingChannel] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: MessageRoutingChannel) = apply {
            channels =
                (channels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channels", it).add(channel)
                }
        }

        /** Alias for calling [addChannel] with `MessageRoutingChannel.ofString(string)`. */
        fun addChannel(string: String) = addChannel(MessageRoutingChannel.ofString(string))

        /**
         * Alias for calling [addChannel] with
         * `MessageRoutingChannel.ofMessageRouting(messageRouting)`.
         */
        fun addChannel(messageRouting: MessageRouting) =
            addChannel(MessageRoutingChannel.ofMessageRouting(messageRouting))

        fun method(method: Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { this.method = method }

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
         * Returns an immutable instance of [MessageRouting].
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
        fun build(): MessageRouting =
            MessageRouting(
                checkRequired("channels", channels).map { it.toImmutable() },
                checkRequired("method", method),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageRouting = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (channels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (method.asKnown().getOrNull()?.validity() ?: 0)

    class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
        enum class Known {
            ALL,
            SINGLE,
        }

        /**
         * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Method] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            SINGLE,
            /** An enum member indicating that [Method] was instantiated with an unknown value. */
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
                else -> throw CourierInvalidDataException("Unknown Method: $value")
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

        fun validate(): Method = apply {
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

            return other is Method && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageRouting &&
            channels == other.channels &&
            method == other.method &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(channels, method, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageRouting{channels=$channels, method=$method, additionalProperties=$additionalProperties}"
}
