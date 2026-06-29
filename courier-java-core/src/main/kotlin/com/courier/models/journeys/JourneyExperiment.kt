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

/**
 * A/B experiment config for a send node. The recipient is deterministically bucketed by
 * `bucketingKey` and routed to one of the `variants` in proportion to its `weight`. Present on a
 * send node INSTEAD OF `message.template`.
 */
class JourneyExperiment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucketingKey: JsonField<String>,
    private val variants: JsonField<List<JourneyExperimentVariant>>,
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucketingKey")
        @ExcludeMissing
        bucketingKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variants")
        @ExcludeMissing
        variants: JsonField<List<JourneyExperimentVariant>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(bucketingKey, variants, id, name, mutableMapOf())

    /**
     * The value used to deterministically assign a recipient to a variant. Must be non-empty with
     * no leading or trailing whitespace.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketingKey(): String = bucketingKey.getRequired("bucketingKey")

    /**
     * Between 2 and 10 weighted template variants.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variants(): List<JourneyExperimentVariant> = variants.getRequired("variants")

    /**
     * Server-authoritative experiment id (prefixed `exp_`). Omit to have the server mint one; when
     * supplied it must be a valid `exp_` id.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Optional, cosmetic display name for the experiment.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [bucketingKey].
     *
     * Unlike [bucketingKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucketingKey")
    @ExcludeMissing
    fun _bucketingKey(): JsonField<String> = bucketingKey

    /**
     * Returns the raw JSON value of [variants].
     *
     * Unlike [variants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variants")
    @ExcludeMissing
    fun _variants(): JsonField<List<JourneyExperimentVariant>> = variants

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [JourneyExperiment].
         *
         * The following fields are required:
         * ```java
         * .bucketingKey()
         * .variants()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyExperiment]. */
    class Builder internal constructor() {

        private var bucketingKey: JsonField<String>? = null
        private var variants: JsonField<MutableList<JourneyExperimentVariant>>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyExperiment: JourneyExperiment) = apply {
            bucketingKey = journeyExperiment.bucketingKey
            variants = journeyExperiment.variants.map { it.toMutableList() }
            id = journeyExperiment.id
            name = journeyExperiment.name
            additionalProperties = journeyExperiment.additionalProperties.toMutableMap()
        }

        /**
         * The value used to deterministically assign a recipient to a variant. Must be non-empty
         * with no leading or trailing whitespace.
         */
        fun bucketingKey(bucketingKey: String) = bucketingKey(JsonField.of(bucketingKey))

        /**
         * Sets [Builder.bucketingKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketingKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bucketingKey(bucketingKey: JsonField<String>) = apply {
            this.bucketingKey = bucketingKey
        }

        /** Between 2 and 10 weighted template variants. */
        fun variants(variants: List<JourneyExperimentVariant>) = variants(JsonField.of(variants))

        /**
         * Sets [Builder.variants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variants] with a well-typed
         * `List<JourneyExperimentVariant>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun variants(variants: JsonField<List<JourneyExperimentVariant>>) = apply {
            this.variants = variants.map { it.toMutableList() }
        }

        /**
         * Adds a single [JourneyExperimentVariant] to [variants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVariant(variant: JourneyExperimentVariant) = apply {
            variants =
                (variants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("variants", it).add(variant)
                }
        }

        /**
         * Server-authoritative experiment id (prefixed `exp_`). Omit to have the server mint one;
         * when supplied it must be a valid `exp_` id.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Optional, cosmetic display name for the experiment. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [JourneyExperiment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketingKey()
         * .variants()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyExperiment =
            JourneyExperiment(
                checkRequired("bucketingKey", bucketingKey),
                checkRequired("variants", variants).map { it.toImmutable() },
                id,
                name,
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
    fun validate(): JourneyExperiment = apply {
        if (validated) {
            return@apply
        }

        bucketingKey()
        variants().forEach { it.validate() }
        id()
        name()
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
        (if (bucketingKey.asKnown().isPresent) 1 else 0) +
            (variants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyExperiment &&
            bucketingKey == other.bucketingKey &&
            variants == other.variants &&
            id == other.id &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bucketingKey, variants, id, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyExperiment{bucketingKey=$bucketingKey, variants=$variants, id=$id, name=$name, additionalProperties=$additionalProperties}"
}
