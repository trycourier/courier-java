// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailFooter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<String>,
    private val inheritDefault: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inheritDefault")
        @ExcludeMissing
        inheritDefault: JsonField<Boolean> = JsonMissing.of(),
    ) : this(content, inheritDefault, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = content.getOptional("content")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inheritDefault(): Optional<Boolean> = inheritDefault.getOptional("inheritDefault")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [inheritDefault].
     *
     * Unlike [inheritDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inheritDefault")
    @ExcludeMissing
    fun _inheritDefault(): JsonField<Boolean> = inheritDefault

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

        /** Returns a mutable builder for constructing an instance of [EmailFooter]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailFooter]. */
    class Builder internal constructor() {

        private var content: JsonField<String> = JsonMissing.of()
        private var inheritDefault: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailFooter: EmailFooter) = apply {
            content = emailFooter.content
            inheritDefault = emailFooter.inheritDefault
            additionalProperties = emailFooter.additionalProperties.toMutableMap()
        }

        fun content(content: String?) = content(JsonField.ofNullable(content))

        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
        fun content(content: Optional<String>) = content(content.getOrNull())

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        fun inheritDefault(inheritDefault: Boolean?) =
            inheritDefault(JsonField.ofNullable(inheritDefault))

        /**
         * Alias for [Builder.inheritDefault].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inheritDefault(inheritDefault: Boolean) = inheritDefault(inheritDefault as Boolean?)

        /** Alias for calling [Builder.inheritDefault] with `inheritDefault.orElse(null)`. */
        fun inheritDefault(inheritDefault: Optional<Boolean>) =
            inheritDefault(inheritDefault.getOrNull())

        /**
         * Sets [Builder.inheritDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inheritDefault] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inheritDefault(inheritDefault: JsonField<Boolean>) = apply {
            this.inheritDefault = inheritDefault
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
         * Returns an immutable instance of [EmailFooter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailFooter =
            EmailFooter(content, inheritDefault, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EmailFooter = apply {
        if (validated) {
            return@apply
        }

        content()
        inheritDefault()
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
        (if (content.asKnown().isPresent) 1 else 0) +
            (if (inheritDefault.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailFooter &&
            content == other.content &&
            inheritDefault == other.inheritDefault &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(content, inheritDefault, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailFooter{content=$content, inheritDefault=$inheritDefault, additionalProperties=$additionalProperties}"
}
