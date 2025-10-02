// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class Email
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val footer: JsonValue,
    private val header: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("footer") @ExcludeMissing footer: JsonValue = JsonMissing.of(),
        @JsonProperty("header") @ExcludeMissing header: JsonValue = JsonMissing.of(),
    ) : this(footer, header, mutableMapOf())

    @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonValue = footer

    @JsonProperty("header") @ExcludeMissing fun _header(): JsonValue = header

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
         * Returns a mutable builder for constructing an instance of [Email].
         *
         * The following fields are required:
         * ```java
         * .footer()
         * .header()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Email]. */
    class Builder internal constructor() {

        private var footer: JsonValue? = null
        private var header: JsonValue? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(email: Email) = apply {
            footer = email.footer
            header = email.header
            additionalProperties = email.additionalProperties.toMutableMap()
        }

        fun footer(footer: JsonValue) = apply { this.footer = footer }

        fun header(header: JsonValue) = apply { this.header = header }

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
         * Returns an immutable instance of [Email].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .footer()
         * .header()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Email =
            Email(
                checkRequired("footer", footer),
                checkRequired("header", header),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Email = apply {
        if (validated) {
            return@apply
        }

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
    @JvmSynthetic internal fun validity(): Int = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Email &&
            footer == other.footer &&
            header == other.header &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(footer, header, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Email{footer=$footer, header=$header, additionalProperties=$additionalProperties}"
}
