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
 * A leaf condition group. Exactly one of `AND` or `OR` must be present at runtime; each is a list
 * of `JourneyConditionAtom` tuples.
 */
class JourneyConditionGroup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val and: JsonField<List<List<String>>>,
    private val or: JsonField<List<List<String>>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("AND") @ExcludeMissing and: JsonField<List<List<String>>> = JsonMissing.of(),
        @JsonProperty("OR") @ExcludeMissing or: JsonField<List<List<String>>> = JsonMissing.of(),
    ) : this(and, or, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun and(): Optional<List<List<String>>> = and.getOptional("AND")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun or(): Optional<List<List<String>>> = or.getOptional("OR")

    /**
     * Returns the raw JSON value of [and].
     *
     * Unlike [and], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("AND") @ExcludeMissing fun _and(): JsonField<List<List<String>>> = and

    /**
     * Returns the raw JSON value of [or].
     *
     * Unlike [or], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("OR") @ExcludeMissing fun _or(): JsonField<List<List<String>>> = or

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

        /** Returns a mutable builder for constructing an instance of [JourneyConditionGroup]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyConditionGroup]. */
    class Builder internal constructor() {

        private var and: JsonField<MutableList<List<String>>>? = null
        private var or: JsonField<MutableList<List<String>>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyConditionGroup: JourneyConditionGroup) = apply {
            and = journeyConditionGroup.and.map { it.toMutableList() }
            or = journeyConditionGroup.or.map { it.toMutableList() }
            additionalProperties = journeyConditionGroup.additionalProperties.toMutableMap()
        }

        fun and(and: List<List<String>>) = and(JsonField.of(and))

        /**
         * Sets [Builder.and] to an arbitrary JSON value.
         *
         * You should usually call [Builder.and] with a well-typed `List<List<String>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun and(and: JsonField<List<List<String>>>) = apply {
            this.and = and.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<String>] to [Builder.and].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnd(and: List<String>) = apply {
            this.and =
                (this.and ?: JsonField.of(mutableListOf())).also { checkKnown("and", it).add(and) }
        }

        fun or(or: List<List<String>>) = or(JsonField.of(or))

        /**
         * Sets [Builder.or] to an arbitrary JSON value.
         *
         * You should usually call [Builder.or] with a well-typed `List<List<String>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun or(or: JsonField<List<List<String>>>) = apply {
            this.or = or.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<String>] to [Builder.or].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOr(or: List<String>) = apply {
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
         * Returns an immutable instance of [JourneyConditionGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JourneyConditionGroup =
            JourneyConditionGroup(
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
    fun validate(): JourneyConditionGroup = apply {
        if (validated) {
            return@apply
        }

        and()
        or()
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
        (and.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (or.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyConditionGroup &&
            and == other.and &&
            or == other.or &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(and, or, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyConditionGroup{and=$and, or=$or, additionalProperties=$additionalProperties}"
}
