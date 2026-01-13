// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

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

/** Filter that contains an array of FilterConfig items */
class Filter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filters: JsonField<List<FilterConfig>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<FilterConfig>> = JsonMissing.of()
    ) : this(filters, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<FilterConfig> = filters.getRequired("filters")

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<FilterConfig>> = filters

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
         * Returns a mutable builder for constructing an instance of [Filter].
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Filter]. */
    class Builder internal constructor() {

        private var filters: JsonField<MutableList<FilterConfig>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filter: Filter) = apply {
            filters = filter.filters.map { it.toMutableList() }
            additionalProperties = filter.additionalProperties.toMutableMap()
        }

        fun filters(filters: List<FilterConfig>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<FilterConfig>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filters(filters: JsonField<List<FilterConfig>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [FilterConfig] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: FilterConfig) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** Alias for calling [addFilter] with `FilterConfig.ofSingle(single)`. */
        fun addFilter(single: SingleFilterConfig) = addFilter(FilterConfig.ofSingle(single))

        /** Alias for calling [addFilter] with `FilterConfig.ofNested(nested)`. */
        fun addFilter(nested: NestedFilterConfig) = addFilter(FilterConfig.ofNested(nested))

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
         * Returns an immutable instance of [Filter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Filter =
            Filter(
                checkRequired("filters", filters).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Filter = apply {
        if (validated) {
            return@apply
        }

        filters().forEach { it.validate() }
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
        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Filter &&
            filters == other.filters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filters, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "Filter{filters=$filters, additionalProperties=$additionalProperties}"
}
