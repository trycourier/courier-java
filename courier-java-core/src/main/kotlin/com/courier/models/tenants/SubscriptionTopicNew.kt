// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionTopicNew
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<Status>,
    private val customRouting: JsonField<List<ChannelClassification>>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("custom_routing")
        @ExcludeMissing
        customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
    ) : this(status, customRouting, hasCustomRouting, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The default channels to send to this tenant when has_custom_routing is enabled
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customRouting(): Optional<List<ChannelClassification>> =
        customRouting.getOptional("custom_routing")

    /**
     * Override channel routing with custom preferences. This will override any template prefernces
     * that are set, but a user can still customize their preferences
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasCustomRouting(): Optional<Boolean> = hasCustomRouting.getOptional("has_custom_routing")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [SubscriptionTopicNew].
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionTopicNew]. */
    class Builder internal constructor() {

        private var status: JsonField<Status>? = null
        private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
        private var hasCustomRouting: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionTopicNew: SubscriptionTopicNew) = apply {
            status = subscriptionTopicNew.status
            customRouting = subscriptionTopicNew.customRouting.map { it.toMutableList() }
            hasCustomRouting = subscriptionTopicNew.hasCustomRouting
            additionalProperties = subscriptionTopicNew.additionalProperties.toMutableMap()
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The default channels to send to this tenant when has_custom_routing is enabled */
        fun customRouting(customRouting: List<ChannelClassification>?) =
            customRouting(JsonField.ofNullable(customRouting))

        /** Alias for calling [Builder.customRouting] with `customRouting.orElse(null)`. */
        fun customRouting(customRouting: Optional<List<ChannelClassification>>) =
            customRouting(customRouting.getOrNull())

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

        /**
         * Override channel routing with custom preferences. This will override any template
         * prefernces that are set, but a user can still customize their preferences
         */
        fun hasCustomRouting(hasCustomRouting: Boolean?) =
            hasCustomRouting(JsonField.ofNullable(hasCustomRouting))

        /**
         * Alias for [Builder.hasCustomRouting].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasCustomRouting(hasCustomRouting: Boolean) =
            hasCustomRouting(hasCustomRouting as Boolean?)

        /** Alias for calling [Builder.hasCustomRouting] with `hasCustomRouting.orElse(null)`. */
        fun hasCustomRouting(hasCustomRouting: Optional<Boolean>) =
            hasCustomRouting(hasCustomRouting.getOrNull())

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
         * Returns an immutable instance of [SubscriptionTopicNew].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionTopicNew =
            SubscriptionTopicNew(
                checkRequired("status", status),
                (customRouting ?: JsonMissing.of()).map { it.toImmutable() },
                hasCustomRouting,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionTopicNew = apply {
        if (validated) {
            return@apply
        }

        status().validate()
        customRouting().ifPresent { it.forEach { it.validate() } }
        hasCustomRouting()
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
        (status.asKnown().getOrNull()?.validity() ?: 0) +
            (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasCustomRouting.asKnown().isPresent) 1 else 0)

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

            @JvmField val OPTED_OUT = of("OPTED_OUT")

            @JvmField val OPTED_IN = of("OPTED_IN")

            @JvmField val REQUIRED = of("REQUIRED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPTED_OUT,
            OPTED_IN,
            REQUIRED,
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
            OPTED_OUT,
            OPTED_IN,
            REQUIRED,
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
                OPTED_OUT -> Value.OPTED_OUT
                OPTED_IN -> Value.OPTED_IN
                REQUIRED -> Value.REQUIRED
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
                OPTED_OUT -> Known.OPTED_OUT
                OPTED_IN -> Known.OPTED_IN
                REQUIRED -> Known.REQUIRED
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

        return other is SubscriptionTopicNew &&
            status == other.status &&
            customRouting == other.customRouting &&
            hasCustomRouting == other.hasCustomRouting &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(status, customRouting, hasCustomRouting, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionTopicNew{status=$status, customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, additionalProperties=$additionalProperties}"
}
