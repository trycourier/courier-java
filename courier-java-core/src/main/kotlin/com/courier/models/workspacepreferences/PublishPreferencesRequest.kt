// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

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

/**
 * Optional page metadata to apply when publishing the workspace's preferences page. All fields are
 * optional; omitted fields fall back to the page defaults (and the workspace default brand).
 */
class PublishPreferencesRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val description: JsonField<String>,
    private val heading: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("heading") @ExcludeMissing heading: JsonField<String> = JsonMissing.of(),
    ) : this(brandId, description, heading, mutableMapOf())

    /**
     * Brand for the hosted page - "default" (workspace default brand), "none" (no brand), or a
     * specific brand id. Defaults to "default".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = brandId.getOptional("brand_id")

    /**
     * Description shown under the heading on the hosted preferences page.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Heading shown at the top of the hosted preferences page.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun heading(): Optional<String> = heading.getOptional("heading")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [heading].
     *
     * Unlike [heading], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("heading") @ExcludeMissing fun _heading(): JsonField<String> = heading

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
         * Returns a mutable builder for constructing an instance of [PublishPreferencesRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublishPreferencesRequest]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var heading: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publishPreferencesRequest: PublishPreferencesRequest) = apply {
            brandId = publishPreferencesRequest.brandId
            description = publishPreferencesRequest.description
            heading = publishPreferencesRequest.heading
            additionalProperties = publishPreferencesRequest.additionalProperties.toMutableMap()
        }

        /**
         * Brand for the hosted page - "default" (workspace default brand), "none" (no brand), or a
         * specific brand id. Defaults to "default".
         */
        fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /** Description shown under the heading on the hosted preferences page. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Heading shown at the top of the hosted preferences page. */
        fun heading(heading: String?) = heading(JsonField.ofNullable(heading))

        /** Alias for calling [Builder.heading] with `heading.orElse(null)`. */
        fun heading(heading: Optional<String>) = heading(heading.getOrNull())

        /**
         * Sets [Builder.heading] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heading] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun heading(heading: JsonField<String>) = apply { this.heading = heading }

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
         * Returns an immutable instance of [PublishPreferencesRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublishPreferencesRequest =
            PublishPreferencesRequest(
                brandId,
                description,
                heading,
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
    fun validate(): PublishPreferencesRequest = apply {
        if (validated) {
            return@apply
        }

        brandId()
        description()
        heading()
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
        (if (brandId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (heading.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublishPreferencesRequest &&
            brandId == other.brandId &&
            description == other.description &&
            heading == other.heading &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(brandId, description, heading, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublishPreferencesRequest{brandId=$brandId, description=$description, heading=$heading, additionalProperties=$additionalProperties}"
}
