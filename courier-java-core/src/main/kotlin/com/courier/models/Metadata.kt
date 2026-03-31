// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Metadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val utm: JsonField<Utm>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("utm") @ExcludeMissing utm: JsonField<Utm> = JsonMissing.of()
    ) : this(utm, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun utm(): Optional<Utm> = utm.getOptional("utm")

    /**
     * Returns the raw JSON value of [utm].
     *
     * Unlike [utm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utm") @ExcludeMissing fun _utm(): JsonField<Utm> = utm

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

        /** Returns a mutable builder for constructing an instance of [Metadata]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Metadata]. */
    class Builder internal constructor() {

        private var utm: JsonField<Utm> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadata: Metadata) = apply {
            utm = metadata.utm
            additionalProperties = metadata.additionalProperties.toMutableMap()
        }

        fun utm(utm: Utm?) = utm(JsonField.ofNullable(utm))

        /** Alias for calling [Builder.utm] with `utm.orElse(null)`. */
        fun utm(utm: Optional<Utm>) = utm(utm.getOrNull())

        /**
         * Sets [Builder.utm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utm] with a well-typed [Utm] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun utm(utm: JsonField<Utm>) = apply { this.utm = utm }

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
         * Returns an immutable instance of [Metadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Metadata = Metadata(utm, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Metadata = apply {
        if (validated) {
            return@apply
        }

        utm().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (utm.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Metadata &&
            utm == other.utm &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(utm, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "Metadata{utm=$utm, additionalProperties=$additionalProperties}"
}
