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

/**
 * Routes a push notification through the AWS SNS provider. The target ARN must be nested under
 * `aws_sns` — a top-level `target_arn` on the profile is ignored by the provider.
 */
class AwsSns
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val targetArn: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("target_arn") @ExcludeMissing targetArn: JsonField<String> = JsonMissing.of()
    ) : this(targetArn, mutableMapOf())

    /**
     * The ARN of the SNS platform endpoint, topic, or application to publish to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetArn(): String = targetArn.getRequired("target_arn")

    /**
     * Returns the raw JSON value of [targetArn].
     *
     * Unlike [targetArn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_arn") @ExcludeMissing fun _targetArn(): JsonField<String> = targetArn

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
         * Returns a mutable builder for constructing an instance of [AwsSns].
         *
         * The following fields are required:
         * ```java
         * .targetArn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AwsSns]. */
    class Builder internal constructor() {

        private var targetArn: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(awsSns: AwsSns) = apply {
            targetArn = awsSns.targetArn
            additionalProperties = awsSns.additionalProperties.toMutableMap()
        }

        /** The ARN of the SNS platform endpoint, topic, or application to publish to. */
        fun targetArn(targetArn: String) = targetArn(JsonField.of(targetArn))

        /**
         * Sets [Builder.targetArn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetArn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetArn(targetArn: JsonField<String>) = apply { this.targetArn = targetArn }

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
         * Returns an immutable instance of [AwsSns].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .targetArn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AwsSns =
            AwsSns(checkRequired("targetArn", targetArn), additionalProperties.toMutableMap())
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
    fun validate(): AwsSns = apply {
        if (validated) {
            return@apply
        }

        targetArn()
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
    @JvmSynthetic internal fun validity(): Int = (if (targetArn.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AwsSns &&
            targetArn == other.targetArn &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(targetArn, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AwsSns{targetArn=$targetArn, additionalProperties=$additionalProperties}"
}
