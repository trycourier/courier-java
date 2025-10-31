// File generated from our OpenAPI spec by Stainless.

package com.courier.models

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
import kotlin.jvm.optionals.getOrNull

class Rule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val until: JsonField<String>,
    private val start: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("until") @ExcludeMissing until: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<String> = JsonMissing.of(),
    ) : this(until, start, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun until(): String = until.getRequired("until")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun start(): Optional<String> = start.getOptional("start")

    /**
     * Returns the raw JSON value of [until].
     *
     * Unlike [until], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("until") @ExcludeMissing fun _until(): JsonField<String> = until

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<String> = start

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
         * Returns a mutable builder for constructing an instance of [Rule].
         *
         * The following fields are required:
         * ```java
         * .until()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Rule]. */
    class Builder internal constructor() {

        private var until: JsonField<String>? = null
        private var start: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rule: Rule) = apply {
            until = rule.until
            start = rule.start
            additionalProperties = rule.additionalProperties.toMutableMap()
        }

        fun until(until: String) = until(JsonField.of(until))

        /**
         * Sets [Builder.until] to an arbitrary JSON value.
         *
         * You should usually call [Builder.until] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun until(until: JsonField<String>) = apply { this.until = until }

        fun start(start: String?) = start(JsonField.ofNullable(start))

        /** Alias for calling [Builder.start] with `start.orElse(null)`. */
        fun start(start: Optional<String>) = start(start.getOrNull())

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun start(start: JsonField<String>) = apply { this.start = start }

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
         * Returns an immutable instance of [Rule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .until()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Rule =
            Rule(checkRequired("until", until), start, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Rule = apply {
        if (validated) {
            return@apply
        }

        until()
        start()
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
        (if (until.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Rule &&
            until == other.until &&
            start == other.start &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(until, start, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Rule{until=$until, start=$start, additionalProperties=$additionalProperties}"
}
