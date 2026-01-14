// File generated from our OpenAPI spec by Stainless.

package com.courier.models

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

/**
 * A filter rule that can be either a single condition (with path/value) or a nested group (with
 * filters array). Use comparison operators (EQ, GT, etc.) for single conditions, and logical
 * operators (AND, OR) for nested groups.
 */
class FilterConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operator: JsonField<String>,
    private val filters: JsonField<List<FilterConfig>>,
    private val path: JsonField<String>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<FilterConfig>> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(operator, filters, path, value, mutableMapOf())

    /**
     * The operator for this filter. Use comparison operators (EQ, GT, LT, GTE, LTE, NEQ, EXISTS,
     * INCLUDES, STARTS_WITH, ENDS_WITH, IS_BEFORE, IS_AFTER, OMIT) for single conditions, or
     * logical operators (AND, OR) for nested filter groups.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * Nested filter rules to combine with AND/OR. Required for nested filter groups, not used for
     * single filter conditions.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<FilterConfig>> = filters.getOptional("filters")

    /**
     * The attribute path from the user profile to filter on. Required for single filter conditions,
     * not used for nested filter groups.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * The value to compare against. Required for single filter conditions, not used for nested
     * filter groups.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<FilterConfig>> = filters

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [FilterConfig].
         *
         * The following fields are required:
         * ```java
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilterConfig]. */
    class Builder internal constructor() {

        private var operator: JsonField<String>? = null
        private var filters: JsonField<MutableList<FilterConfig>>? = null
        private var path: JsonField<String> = JsonMissing.of()
        private var value: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filterConfig: FilterConfig) = apply {
            operator = filterConfig.operator
            filters = filterConfig.filters.map { it.toMutableList() }
            path = filterConfig.path
            value = filterConfig.value
            additionalProperties = filterConfig.additionalProperties.toMutableMap()
        }

        /**
         * The operator for this filter. Use comparison operators (EQ, GT, LT, GTE, LTE, NEQ,
         * EXISTS, INCLUDES, STARTS_WITH, ENDS_WITH, IS_BEFORE, IS_AFTER, OMIT) for single
         * conditions, or logical operators (AND, OR) for nested filter groups.
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /**
         * Nested filter rules to combine with AND/OR. Required for nested filter groups, not used
         * for single filter conditions.
         */
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

        /**
         * The attribute path from the user profile to filter on. Required for single filter
         * conditions, not used for nested filter groups.
         */
        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /**
         * The value to compare against. Required for single filter conditions, not used for nested
         * filter groups.
         */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [FilterConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilterConfig =
            FilterConfig(
                checkRequired("operator", operator),
                (filters ?: JsonMissing.of()).map { it.toImmutable() },
                path,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilterConfig = apply {
        if (validated) {
            return@apply
        }

        operator()
        filters().ifPresent { it.forEach { it.validate() } }
        path()
        value()
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
        (if (operator.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterConfig &&
            operator == other.operator &&
            filters == other.filters &&
            path == other.path &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(operator, filters, path, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilterConfig{operator=$operator, filters=$filters, path=$path, value=$value, additionalProperties=$additionalProperties}"
}
