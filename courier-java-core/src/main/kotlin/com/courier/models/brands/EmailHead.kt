// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailHead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inheritDefault: JsonField<Boolean>,
    private val content: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inheritDefault")
        @ExcludeMissing
        inheritDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
    ) : this(inheritDefault, content, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inheritDefault(): Boolean = inheritDefault.getRequired("inheritDefault")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = content.getOptional("content")

    /**
     * Returns the raw JSON value of [inheritDefault].
     *
     * Unlike [inheritDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inheritDefault")
    @ExcludeMissing
    fun _inheritDefault(): JsonField<Boolean> = inheritDefault

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

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
         * Returns a mutable builder for constructing an instance of [EmailHead].
         *
         * The following fields are required:
         * ```java
         * .inheritDefault()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailHead]. */
    class Builder internal constructor() {

        private var inheritDefault: JsonField<Boolean>? = null
        private var content: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailHead: EmailHead) = apply {
            inheritDefault = emailHead.inheritDefault
            content = emailHead.content
            additionalProperties = emailHead.additionalProperties.toMutableMap()
        }

        fun inheritDefault(inheritDefault: Boolean) = inheritDefault(JsonField.of(inheritDefault))

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
         * Returns an immutable instance of [EmailHead].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inheritDefault()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailHead =
            EmailHead(
                checkRequired("inheritDefault", inheritDefault),
                content,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmailHead = apply {
        if (validated) {
            return@apply
        }

        inheritDefault()
        content()
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
        (if (inheritDefault.asKnown().isPresent) 1 else 0) +
            (if (content.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailHead &&
            inheritDefault == other.inheritDefault &&
            content == other.content &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inheritDefault, content, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailHead{inheritDefault=$inheritDefault, content=$content, additionalProperties=$additionalProperties}"
}
