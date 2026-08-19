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
import kotlin.jvm.optionals.getOrNull

/** A single Journey run. */
class JourneyRunResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val run: JsonField<JourneyRun>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("run") @ExcludeMissing run: JsonField<JourneyRun> = JsonMissing.of()
    ) : this(run, mutableMapOf())

    /**
     * One run of a Journey. `status` and `created_at` are absent on a small number of legacy runs
     * stored without them.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun run(): JourneyRun = run.getRequired("run")

    /**
     * Returns the raw JSON value of [run].
     *
     * Unlike [run], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run") @ExcludeMissing fun _run(): JsonField<JourneyRun> = run

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
         * Returns a mutable builder for constructing an instance of [JourneyRunResponse].
         *
         * The following fields are required:
         * ```java
         * .run()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyRunResponse]. */
    class Builder internal constructor() {

        private var run: JsonField<JourneyRun>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyRunResponse: JourneyRunResponse) = apply {
            run = journeyRunResponse.run
            additionalProperties = journeyRunResponse.additionalProperties.toMutableMap()
        }

        /**
         * One run of a Journey. `status` and `created_at` are absent on a small number of legacy
         * runs stored without them.
         */
        fun run(run: JourneyRun) = run(JsonField.of(run))

        /**
         * Sets [Builder.run] to an arbitrary JSON value.
         *
         * You should usually call [Builder.run] with a well-typed [JourneyRun] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun run(run: JsonField<JourneyRun>) = apply { this.run = run }

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
         * Returns an immutable instance of [JourneyRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .run()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyRunResponse =
            JourneyRunResponse(checkRequired("run", run), additionalProperties.toMutableMap())
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
    fun validate(): JourneyRunResponse = apply {
        if (validated) {
            return@apply
        }

        run().validate()
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
    @JvmSynthetic internal fun validity(): Int = (run.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyRunResponse &&
            run == other.run &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(run, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyRunResponse{run=$run, additionalProperties=$additionalProperties}"
}
