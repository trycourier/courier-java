// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Request body for sending a broadcast immediately. */
class SendBroadcastRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val recipientId: JsonField<String>,
    private val recipientType: JsonField<RecipientType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("recipient_id")
        @ExcludeMissing
        recipientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_type")
        @ExcludeMissing
        recipientType: JsonField<RecipientType> = JsonMissing.of(),
    ) : this(recipientId, recipientType, mutableMapOf())

    /**
     * ID of the target list or audience.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientId(): String = recipientId.getRequired("recipient_id")

    /**
     * Whether the broadcast targets a list or an audience.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientType(): RecipientType = recipientType.getRequired("recipient_type")

    /**
     * Returns the raw JSON value of [recipientId].
     *
     * Unlike [recipientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_id")
    @ExcludeMissing
    fun _recipientId(): JsonField<String> = recipientId

    /**
     * Returns the raw JSON value of [recipientType].
     *
     * Unlike [recipientType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_type")
    @ExcludeMissing
    fun _recipientType(): JsonField<RecipientType> = recipientType

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
         * Returns a mutable builder for constructing an instance of [SendBroadcastRequest].
         *
         * The following fields are required:
         * ```java
         * .recipientId()
         * .recipientType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SendBroadcastRequest]. */
    class Builder internal constructor() {

        private var recipientId: JsonField<String>? = null
        private var recipientType: JsonField<RecipientType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sendBroadcastRequest: SendBroadcastRequest) = apply {
            recipientId = sendBroadcastRequest.recipientId
            recipientType = sendBroadcastRequest.recipientType
            additionalProperties = sendBroadcastRequest.additionalProperties.toMutableMap()
        }

        /** ID of the target list or audience. */
        fun recipientId(recipientId: String) = recipientId(JsonField.of(recipientId))

        /**
         * Sets [Builder.recipientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientId(recipientId: JsonField<String>) = apply { this.recipientId = recipientId }

        /** Whether the broadcast targets a list or an audience. */
        fun recipientType(recipientType: RecipientType) = recipientType(JsonField.of(recipientType))

        /**
         * Sets [Builder.recipientType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientType] with a well-typed [RecipientType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientType(recipientType: JsonField<RecipientType>) = apply {
            this.recipientType = recipientType
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
         * Returns an immutable instance of [SendBroadcastRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .recipientId()
         * .recipientType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SendBroadcastRequest =
            SendBroadcastRequest(
                checkRequired("recipientId", recipientId),
                checkRequired("recipientType", recipientType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourierInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SendBroadcastRequest = apply {
        if (validated) {
            return@apply
        }

        recipientId()
        recipientType().validate()
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
        (if (recipientId.asKnown().isPresent) 1 else 0) +
            (recipientType.asKnown().getOrNull()?.validity() ?: 0)

    /** Whether the broadcast targets a list or an audience. */
    class RecipientType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LIST = of("list")

            @JvmField val AUDIENCE = of("audience")

            @JvmStatic fun of(value: String) = RecipientType(JsonField.of(value))
        }

        /** An enum containing [RecipientType]'s known values. */
        enum class Known {
            LIST,
            AUDIENCE,
        }

        /**
         * An enum containing [RecipientType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecipientType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIST,
            AUDIENCE,
            /**
             * An enum member indicating that [RecipientType] was instantiated with an unknown
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
                LIST -> Value.LIST
                AUDIENCE -> Value.AUDIENCE
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
                LIST -> Known.LIST
                AUDIENCE -> Known.AUDIENCE
                else -> throw CourierInvalidDataException("Unknown RecipientType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RecipientType = apply {
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

            return other is RecipientType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SendBroadcastRequest &&
            recipientId == other.recipientId &&
            recipientType == other.recipientType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(recipientId, recipientType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SendBroadcastRequest{recipientId=$recipientId, recipientType=$recipientType, additionalProperties=$additionalProperties}"
}
