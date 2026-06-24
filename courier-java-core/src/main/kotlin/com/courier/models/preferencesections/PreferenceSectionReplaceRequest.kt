// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Request body for replacing a preference section. Full document replacement; missing optional
 * fields are cleared.
 */
class PreferenceSectionReplaceRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val routingOptions: JsonField<List<ChannelClassification>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("routing_options")
        @ExcludeMissing
        routingOptions: JsonField<List<ChannelClassification>> = JsonMissing.of(),
    ) : this(name, hasCustomRouting, routingOptions, mutableMapOf())

    /**
     * Human-readable name for the section.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Whether the section defines custom routing for its topics.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasCustomRouting(): Optional<Boolean> = hasCustomRouting.getOptional("has_custom_routing")

    /**
     * Default channels for the section. Omit to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingOptions(): Optional<List<ChannelClassification>> =
        routingOptions.getOptional("routing_options")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [routingOptions].
     *
     * Unlike [routingOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_options")
    @ExcludeMissing
    fun _routingOptions(): JsonField<List<ChannelClassification>> = routingOptions

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
         * Returns a mutable builder for constructing an instance of
         * [PreferenceSectionReplaceRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceSectionReplaceRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var hasCustomRouting: JsonField<Boolean> = JsonMissing.of()
        private var routingOptions: JsonField<MutableList<ChannelClassification>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceSectionReplaceRequest: PreferenceSectionReplaceRequest) =
            apply {
                name = preferenceSectionReplaceRequest.name
                hasCustomRouting = preferenceSectionReplaceRequest.hasCustomRouting
                routingOptions =
                    preferenceSectionReplaceRequest.routingOptions.map { it.toMutableList() }
                additionalProperties =
                    preferenceSectionReplaceRequest.additionalProperties.toMutableMap()
            }

        /** Human-readable name for the section. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Whether the section defines custom routing for its topics. */
        fun hasCustomRouting(hasCustomRouting: Boolean?) =
            hasCustomRouting(JsonField.ofNullable(hasCustomRouting))

        /**
         * Alias for [Builder.hasCustomRouting].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasCustomRouting(hasCustomRouting: Boolean) =
            hasCustomRouting(hasCustomRouting as Boolean?)

        /** Alias for calling [Builder.hasCustomRouting] with `hasCustomRouting.orElse(null)`. */
        fun hasCustomRouting(hasCustomRouting: Optional<Boolean>) =
            hasCustomRouting(hasCustomRouting.getOrNull())

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

        /** Default channels for the section. Omit to clear. */
        fun routingOptions(routingOptions: List<ChannelClassification>?) =
            routingOptions(JsonField.ofNullable(routingOptions))

        /** Alias for calling [Builder.routingOptions] with `routingOptions.orElse(null)`. */
        fun routingOptions(routingOptions: Optional<List<ChannelClassification>>) =
            routingOptions(routingOptions.getOrNull())

        /**
         * Sets [Builder.routingOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingOptions] with a well-typed
         * `List<ChannelClassification>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun routingOptions(routingOptions: JsonField<List<ChannelClassification>>) = apply {
            this.routingOptions = routingOptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelClassification] to [routingOptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingOption(routingOption: ChannelClassification) = apply {
            routingOptions =
                (routingOptions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routingOptions", it).add(routingOption)
                }
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
         * Returns an immutable instance of [PreferenceSectionReplaceRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceSectionReplaceRequest =
            PreferenceSectionReplaceRequest(
                checkRequired("name", name),
                hasCustomRouting,
                (routingOptions ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): PreferenceSectionReplaceRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        hasCustomRouting()
        routingOptions().ifPresent { it.forEach { it.validate() } }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (hasCustomRouting.asKnown().isPresent) 1 else 0) +
            (routingOptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceSectionReplaceRequest &&
            name == other.name &&
            hasCustomRouting == other.hasCustomRouting &&
            routingOptions == other.routingOptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, hasCustomRouting, routingOptions, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceSectionReplaceRequest{name=$name, hasCustomRouting=$hasCustomRouting, routingOptions=$routingOptions, additionalProperties=$additionalProperties}"
}
