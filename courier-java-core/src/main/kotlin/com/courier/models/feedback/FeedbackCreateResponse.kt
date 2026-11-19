// File generated from our OpenAPI spec by Stainless.

package com.courier.models.feedback

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

class FeedbackCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feedback_id")
        @ExcludeMissing
        feedbackId: JsonField<String> = JsonMissing.of()
    ) : this(feedbackId, mutableMapOf())

    /**
     * The ID of the stored report, `fbk_` followed by a ULID.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackId(): String = feedbackId.getRequired("feedback_id")

    /**
     * Returns the raw JSON value of [feedbackId].
     *
     * Unlike [feedbackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_id") @ExcludeMissing fun _feedbackId(): JsonField<String> = feedbackId

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
         * Returns a mutable builder for constructing an instance of [FeedbackCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .feedbackId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackCreateResponse]. */
    class Builder internal constructor() {

        private var feedbackId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackCreateResponse: FeedbackCreateResponse) = apply {
            feedbackId = feedbackCreateResponse.feedbackId
            additionalProperties = feedbackCreateResponse.additionalProperties.toMutableMap()
        }

        /** The ID of the stored report, `fbk_` followed by a ULID. */
        fun feedbackId(feedbackId: String) = feedbackId(JsonField.of(feedbackId))

        /**
         * Sets [Builder.feedbackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackId(feedbackId: JsonField<String>) = apply { this.feedbackId = feedbackId }

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
         * Returns an immutable instance of [FeedbackCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .feedbackId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackCreateResponse =
            FeedbackCreateResponse(
                checkRequired("feedbackId", feedbackId),
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
    fun validate(): FeedbackCreateResponse = apply {
        if (validated) {
            return@apply
        }

        feedbackId()
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
    @JvmSynthetic internal fun validity(): Int = (if (feedbackId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackCreateResponse &&
            feedbackId == other.feedbackId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(feedbackId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackCreateResponse{feedbackId=$feedbackId, additionalProperties=$additionalProperties}"
}
