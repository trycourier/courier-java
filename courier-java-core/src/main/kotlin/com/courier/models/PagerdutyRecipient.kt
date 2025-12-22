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
import kotlin.jvm.optionals.getOrNull

/** Send via PagerDuty */
class PagerdutyRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pagerduty: JsonField<Pagerduty>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pagerduty")
        @ExcludeMissing
        pagerduty: JsonField<Pagerduty> = JsonMissing.of()
    ) : this(pagerduty, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pagerduty(): Pagerduty = pagerduty.getRequired("pagerduty")

    /**
     * Returns the raw JSON value of [pagerduty].
     *
     * Unlike [pagerduty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagerduty") @ExcludeMissing fun _pagerduty(): JsonField<Pagerduty> = pagerduty

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
         * Returns a mutable builder for constructing an instance of [PagerdutyRecipient].
         *
         * The following fields are required:
         * ```java
         * .pagerduty()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PagerdutyRecipient]. */
    class Builder internal constructor() {

        private var pagerduty: JsonField<Pagerduty>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pagerdutyRecipient: PagerdutyRecipient) = apply {
            pagerduty = pagerdutyRecipient.pagerduty
            additionalProperties = pagerdutyRecipient.additionalProperties.toMutableMap()
        }

        fun pagerduty(pagerduty: Pagerduty) = pagerduty(JsonField.of(pagerduty))

        /**
         * Sets [Builder.pagerduty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagerduty] with a well-typed [Pagerduty] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pagerduty(pagerduty: JsonField<Pagerduty>) = apply { this.pagerduty = pagerduty }

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
         * Returns an immutable instance of [PagerdutyRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pagerduty()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PagerdutyRecipient =
            PagerdutyRecipient(
                checkRequired("pagerduty", pagerduty),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PagerdutyRecipient = apply {
        if (validated) {
            return@apply
        }

        pagerduty().validate()
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
    @JvmSynthetic internal fun validity(): Int = (pagerduty.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PagerdutyRecipient &&
            pagerduty == other.pagerduty &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(pagerduty, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PagerdutyRecipient{pagerduty=$pagerduty, additionalProperties=$additionalProperties}"
}
