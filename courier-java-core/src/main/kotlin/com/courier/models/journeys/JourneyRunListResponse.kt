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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A page of Journey runs. */
class JourneyRunListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val runs: JsonField<List<JourneyRunListItem>>,
    private val nextCursor: JsonField<String>,
    private val prevCursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("runs")
        @ExcludeMissing
        runs: JsonField<List<JourneyRunListItem>> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev_cursor")
        @ExcludeMissing
        prevCursor: JsonField<String> = JsonMissing.of(),
    ) : this(runs, nextCursor, prevCursor, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runs(): List<JourneyRunListItem> = runs.getRequired("runs")

    /**
     * Pass back as `cursor` to fetch the next page. Absent on the last page.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Pass back as `cursor` to fetch the previous page. Absent on the first page.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevCursor(): Optional<String> = prevCursor.getOptional("prev_cursor")

    /**
     * Returns the raw JSON value of [runs].
     *
     * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<JourneyRunListItem>> = runs

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

    /**
     * Returns the raw JSON value of [prevCursor].
     *
     * Unlike [prevCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev_cursor") @ExcludeMissing fun _prevCursor(): JsonField<String> = prevCursor

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
         * Returns a mutable builder for constructing an instance of [JourneyRunListResponse].
         *
         * The following fields are required:
         * ```java
         * .runs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyRunListResponse]. */
    class Builder internal constructor() {

        private var runs: JsonField<MutableList<JourneyRunListItem>>? = null
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var prevCursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyRunListResponse: JourneyRunListResponse) = apply {
            runs = journeyRunListResponse.runs.map { it.toMutableList() }
            nextCursor = journeyRunListResponse.nextCursor
            prevCursor = journeyRunListResponse.prevCursor
            additionalProperties = journeyRunListResponse.additionalProperties.toMutableMap()
        }

        fun runs(runs: List<JourneyRunListItem>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<JourneyRunListItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runs(runs: JsonField<List<JourneyRunListItem>>) = apply {
            this.runs = runs.map { it.toMutableList() }
        }

        /**
         * Adds a single [JourneyRunListItem] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: JourneyRunListItem) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
        }

        /** Pass back as `cursor` to fetch the next page. Absent on the last page. */
        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

        /** Pass back as `cursor` to fetch the previous page. Absent on the first page. */
        fun prevCursor(prevCursor: String) = prevCursor(JsonField.of(prevCursor))

        /**
         * Sets [Builder.prevCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prevCursor(prevCursor: JsonField<String>) = apply { this.prevCursor = prevCursor }

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
         * Returns an immutable instance of [JourneyRunListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .runs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyRunListResponse =
            JourneyRunListResponse(
                checkRequired("runs", runs).map { it.toImmutable() },
                nextCursor,
                prevCursor,
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
    fun validate(): JourneyRunListResponse = apply {
        if (validated) {
            return@apply
        }

        runs().forEach { it.validate() }
        nextCursor()
        prevCursor()
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
        (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0) +
            (if (prevCursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyRunListResponse &&
            runs == other.runs &&
            nextCursor == other.nextCursor &&
            prevCursor == other.prevCursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(runs, nextCursor, prevCursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyRunListResponse{runs=$runs, nextCursor=$nextCursor, prevCursor=$prevCursor, additionalProperties=$additionalProperties}"
}
