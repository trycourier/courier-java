// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

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

/**
 * A nested condition group. Exactly one of `AND` or `OR` must be present at runtime; each is a list
 * of `JourneyConditionGroup` items.
 */
class JourneyConditionNestedGroup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val and: JsonField<List<JourneyConditionGroup>>,
    private val or: JsonField<List<JourneyConditionGroup>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("AND")
        @ExcludeMissing
        and: JsonField<List<JourneyConditionGroup>> = JsonMissing.of(),
        @JsonProperty("OR")
        @ExcludeMissing
        or: JsonField<List<JourneyConditionGroup>> = JsonMissing.of(),
    ) : this(and, or, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun and(): Optional<List<JourneyConditionGroup>> = and.getOptional("AND")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun or(): Optional<List<JourneyConditionGroup>> = or.getOptional("OR")

    /**
     * Returns the raw JSON value of [and].
     *
     * Unlike [and], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("AND") @ExcludeMissing fun _and(): JsonField<List<JourneyConditionGroup>> = and

    /**
     * Returns the raw JSON value of [or].
     *
     * Unlike [or], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("OR") @ExcludeMissing fun _or(): JsonField<List<JourneyConditionGroup>> = or

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
         * Returns a mutable builder for constructing an instance of [JourneyConditionNestedGroup].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyConditionNestedGroup]. */
    class Builder internal constructor() {

        private var and: JsonField<MutableList<JourneyConditionGroup>>? = null
        private var or: JsonField<MutableList<JourneyConditionGroup>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyConditionNestedGroup: JourneyConditionNestedGroup) = apply {
            and = journeyConditionNestedGroup.and.map { it.toMutableList() }
            or = journeyConditionNestedGroup.or.map { it.toMutableList() }
            additionalProperties = journeyConditionNestedGroup.additionalProperties.toMutableMap()
        }

        fun and(and: List<JourneyConditionGroup>) = and(JsonField.of(and))

        /**
         * Sets [Builder.and] to an arbitrary JSON value.
         *
         * You should usually call [Builder.and] with a well-typed `List<JourneyConditionGroup>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun and(and: JsonField<List<JourneyConditionGroup>>) = apply {
            this.and = and.map { it.toMutableList() }
        }

        /**
         * Adds a single [JourneyConditionGroup] to [Builder.and].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnd(and: JourneyConditionGroup) = apply {
            this.and =
                (this.and ?: JsonField.of(mutableListOf())).also { checkKnown("and", it).add(and) }
        }

        fun or(or: List<JourneyConditionGroup>) = or(JsonField.of(or))

        /**
         * Sets [Builder.or] to an arbitrary JSON value.
         *
         * You should usually call [Builder.or] with a well-typed `List<JourneyConditionGroup>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun or(or: JsonField<List<JourneyConditionGroup>>) = apply {
            this.or = or.map { it.toMutableList() }
        }

        /**
         * Adds a single [JourneyConditionGroup] to [Builder.or].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOr(or: JourneyConditionGroup) = apply {
            this.or =
                (this.or ?: JsonField.of(mutableListOf())).also { checkKnown("or", it).add(or) }
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
         * Returns an immutable instance of [JourneyConditionNestedGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JourneyConditionNestedGroup =
            JourneyConditionNestedGroup(
                (and ?: JsonMissing.of()).map { it.toImmutable() },
                (or ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): JourneyConditionNestedGroup = apply {
        if (validated) {
            return@apply
        }

        and().ifPresent { it.forEach { it.validate() } }
        or().ifPresent { it.forEach { it.validate() } }
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
        (and.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (or.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyConditionNestedGroup &&
            and == other.and &&
            or == other.or &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(and, or, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyConditionNestedGroup{and=$and, or=$or, additionalProperties=$additionalProperties}"
}
