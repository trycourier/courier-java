// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A single topic override echoed in a bulk preference response. */
class BulkPreferenceTopic
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customRouting: JsonField<List<ChannelClassification>>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val topicId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("custom_routing")
        @ExcludeMissing
        customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("topic_id") @ExcludeMissing topicId: JsonField<String> = JsonMissing.of(),
    ) : this(customRouting, hasCustomRouting, status, topicId, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customRouting(): List<ChannelClassification> = customRouting.getRequired("custom_routing")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCustomRouting(): Boolean = hasCustomRouting.getRequired("has_custom_routing")

    /**
     * The applied subscription status. Echoes the requested value, so it is always OPTED_IN or
     * OPTED_OUT.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topicId(): String = topicId.getRequired("topic_id")

    /**
     * Returns the raw JSON value of [customRouting].
     *
     * Unlike [customRouting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_routing")
    @ExcludeMissing
    fun _customRouting(): JsonField<List<ChannelClassification>> = customRouting

    /**
     * Returns the raw JSON value of [hasCustomRouting].
     *
     * Unlike [hasCustomRouting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("has_custom_routing")
    @ExcludeMissing
    fun _hasCustomRouting(): JsonField<Boolean> = hasCustomRouting

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [topicId].
     *
     * Unlike [topicId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topic_id") @ExcludeMissing fun _topicId(): JsonField<String> = topicId

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
         * Returns a mutable builder for constructing an instance of [BulkPreferenceTopic].
         *
         * The following fields are required:
         * ```java
         * .customRouting()
         * .hasCustomRouting()
         * .status()
         * .topicId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkPreferenceTopic]. */
    class Builder internal constructor() {

        private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
        private var hasCustomRouting: JsonField<Boolean>? = null
        private var status: JsonField<Status>? = null
        private var topicId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkPreferenceTopic: BulkPreferenceTopic) = apply {
            customRouting = bulkPreferenceTopic.customRouting.map { it.toMutableList() }
            hasCustomRouting = bulkPreferenceTopic.hasCustomRouting
            status = bulkPreferenceTopic.status
            topicId = bulkPreferenceTopic.topicId
            additionalProperties = bulkPreferenceTopic.additionalProperties.toMutableMap()
        }

        fun customRouting(customRouting: List<ChannelClassification>) =
            customRouting(JsonField.of(customRouting))

        /**
         * Sets [Builder.customRouting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customRouting] with a well-typed
         * `List<ChannelClassification>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customRouting(customRouting: JsonField<List<ChannelClassification>>) = apply {
            this.customRouting = customRouting.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelClassification] to [Builder.customRouting].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomRouting(customRouting: ChannelClassification) = apply {
            this.customRouting =
                (this.customRouting ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customRouting", it).add(customRouting)
                }
        }

        fun hasCustomRouting(hasCustomRouting: Boolean) =
            hasCustomRouting(JsonField.of(hasCustomRouting))

        /**
         * Sets [Builder.hasCustomRouting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCustomRouting] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasCustomRouting(hasCustomRouting: JsonField<Boolean>) = apply {
            this.hasCustomRouting = hasCustomRouting
        }

        /**
         * The applied subscription status. Echoes the requested value, so it is always OPTED_IN or
         * OPTED_OUT.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun topicId(topicId: String) = topicId(JsonField.of(topicId))

        /**
         * Sets [Builder.topicId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

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
         * Returns an immutable instance of [BulkPreferenceTopic].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customRouting()
         * .hasCustomRouting()
         * .status()
         * .topicId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkPreferenceTopic =
            BulkPreferenceTopic(
                checkRequired("customRouting", customRouting).map { it.toImmutable() },
                checkRequired("hasCustomRouting", hasCustomRouting),
                checkRequired("status", status),
                checkRequired("topicId", topicId),
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
    fun validate(): BulkPreferenceTopic = apply {
        if (validated) {
            return@apply
        }

        customRouting().forEach { it.validate() }
        hasCustomRouting()
        status().validate()
        topicId()
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
        (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasCustomRouting.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (topicId.asKnown().isPresent) 1 else 0)

    /**
     * The applied subscription status. Echoes the requested value, so it is always OPTED_IN or
     * OPTED_OUT.
     */
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

            @JvmField val OPTED_IN = of("OPTED_IN")

            @JvmField val OPTED_OUT = of("OPTED_OUT")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPTED_IN,
            OPTED_OUT,
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
            OPTED_IN,
            OPTED_OUT,
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
                OPTED_IN -> Value.OPTED_IN
                OPTED_OUT -> Value.OPTED_OUT
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
                OPTED_IN -> Known.OPTED_IN
                OPTED_OUT -> Known.OPTED_OUT
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is BulkPreferenceTopic &&
            customRouting == other.customRouting &&
            hasCustomRouting == other.hasCustomRouting &&
            status == other.status &&
            topicId == other.topicId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customRouting, hasCustomRouting, status, topicId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkPreferenceTopic{customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, status=$status, topicId=$topicId, additionalProperties=$additionalProperties}"
}
