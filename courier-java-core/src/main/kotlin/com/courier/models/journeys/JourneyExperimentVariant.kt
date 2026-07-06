// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

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
import java.util.Optional

/**
 * A single weighted variant of an experiment. Variant ids must be unique within the experiment and
 * the sum of all variant weights must be greater than 0. Weights are relative (no sum-to-100
 * requirement) — routing normalizes them proportionally.
 */
class JourneyExperimentVariant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val templateId: JsonField<String>,
    private val weight: JsonField<Double>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templateId")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(id, templateId, weight, name, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The notification template sent for this variant.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateId(): String = templateId.getRequired("templateId")

    /**
     * Relative routing weight. Must be non-negative.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun weight(): Double = weight.getRequired("weight")

    /**
     * Optional display name for the variant.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templateId") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Double> = weight

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [JourneyExperimentVariant].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .templateId()
         * .weight()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyExperimentVariant]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var templateId: JsonField<String>? = null
        private var weight: JsonField<Double>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyExperimentVariant: JourneyExperimentVariant) = apply {
            id = journeyExperimentVariant.id
            templateId = journeyExperimentVariant.templateId
            weight = journeyExperimentVariant.weight
            name = journeyExperimentVariant.name
            additionalProperties = journeyExperimentVariant.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The notification template sent for this variant. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /** Relative routing weight. Must be non-negative. */
        fun weight(weight: Double) = weight(JsonField.of(weight))

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Double>) = apply { this.weight = weight }

        /** Optional display name for the variant. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [JourneyExperimentVariant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .templateId()
         * .weight()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyExperimentVariant =
            JourneyExperimentVariant(
                checkRequired("id", id),
                checkRequired("templateId", templateId),
                checkRequired("weight", weight),
                name,
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
    fun validate(): JourneyExperimentVariant = apply {
        if (validated) {
            return@apply
        }

        id()
        templateId()
        weight()
        name()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (if (weight.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyExperimentVariant &&
            id == other.id &&
            templateId == other.templateId &&
            weight == other.weight &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, templateId, weight, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyExperimentVariant{id=$id, templateId=$templateId, weight=$weight, name=$name, additionalProperties=$additionalProperties}"
}
