// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PreferenceChangeLogValue
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customRouting: JsonField<List<ChannelClassification>>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val status: JsonField<PreferenceStatus>,
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
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PreferenceStatus> = JsonMissing.of(),
    ) : this(customRouting, hasCustomRouting, status, mutableMapOf())

    /**
     * The channels chosen before the change.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customRouting(): List<ChannelClassification> = customRouting.getRequired("custom_routing")

    /**
     * Whether custom routing was in effect before the change.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCustomRouting(): Boolean = hasCustomRouting.getRequired("has_custom_routing")

    /**
     * The subscription status before the change.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PreferenceStatus = status.getRequired("status")

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreferenceStatus> = status

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
         * Returns a mutable builder for constructing an instance of [PreferenceChangeLogValue].
         *
         * The following fields are required:
         * ```java
         * .customRouting()
         * .hasCustomRouting()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceChangeLogValue]. */
    class Builder internal constructor() {

        private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
        private var hasCustomRouting: JsonField<Boolean>? = null
        private var status: JsonField<PreferenceStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceChangeLogValue: PreferenceChangeLogValue) = apply {
            customRouting = preferenceChangeLogValue.customRouting.map { it.toMutableList() }
            hasCustomRouting = preferenceChangeLogValue.hasCustomRouting
            status = preferenceChangeLogValue.status
            additionalProperties = preferenceChangeLogValue.additionalProperties.toMutableMap()
        }

        /** The channels chosen before the change. */
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

        /** Whether custom routing was in effect before the change. */
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

        /** The subscription status before the change. */
        fun status(status: PreferenceStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PreferenceStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PreferenceStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [PreferenceChangeLogValue].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customRouting()
         * .hasCustomRouting()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceChangeLogValue =
            PreferenceChangeLogValue(
                checkRequired("customRouting", customRouting).map { it.toImmutable() },
                checkRequired("hasCustomRouting", hasCustomRouting),
                checkRequired("status", status),
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
    fun validate(): PreferenceChangeLogValue = apply {
        if (validated) {
            return@apply
        }

        customRouting().forEach { it.validate() }
        hasCustomRouting()
        status().validate()
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
            (status.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceChangeLogValue &&
            customRouting == other.customRouting &&
            hasCustomRouting == other.hasCustomRouting &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customRouting, hasCustomRouting, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceChangeLogValue{customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, status=$status, additionalProperties=$additionalProperties}"
}
