// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

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

/** Every step of a Journey run. Not paginated. */
class JourneyRunStepsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val steps: JsonField<List<JourneyRunStep>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("steps")
        @ExcludeMissing
        steps: JsonField<List<JourneyRunStep>> = JsonMissing.of()
    ) : this(steps, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun steps(): List<JourneyRunStep> = steps.getRequired("steps")

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<JourneyRunStep>> = steps

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
         * Returns a mutable builder for constructing an instance of [JourneyRunStepsResponse].
         *
         * The following fields are required:
         * ```java
         * .steps()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyRunStepsResponse]. */
    class Builder internal constructor() {

        private var steps: JsonField<MutableList<JourneyRunStep>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyRunStepsResponse: JourneyRunStepsResponse) = apply {
            steps = journeyRunStepsResponse.steps.map { it.toMutableList() }
            additionalProperties = journeyRunStepsResponse.additionalProperties.toMutableMap()
        }

        fun steps(steps: List<JourneyRunStep>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed `List<JourneyRunStep>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun steps(steps: JsonField<List<JourneyRunStep>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [JourneyRunStep] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: JourneyRunStep) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
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
         * Returns an immutable instance of [JourneyRunStepsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .steps()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyRunStepsResponse =
            JourneyRunStepsResponse(
                checkRequired("steps", steps).map { it.toImmutable() },
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
    fun validate(): JourneyRunStepsResponse = apply {
        if (validated) {
            return@apply
        }

        steps().forEach { it.validate() }
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
        (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyRunStepsResponse &&
            steps == other.steps &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(steps, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyRunStepsResponse{steps=$steps, additionalProperties=$additionalProperties}"
}
