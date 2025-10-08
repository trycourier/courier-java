// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

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

class WidgetBackground
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bottomColor: JsonField<String>,
    private val topColor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bottomColor")
        @ExcludeMissing
        bottomColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("topColor") @ExcludeMissing topColor: JsonField<String> = JsonMissing.of(),
    ) : this(bottomColor, topColor, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bottomColor(): Optional<String> = bottomColor.getOptional("bottomColor")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topColor(): Optional<String> = topColor.getOptional("topColor")

    /**
     * Returns the raw JSON value of [bottomColor].
     *
     * Unlike [bottomColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bottomColor") @ExcludeMissing fun _bottomColor(): JsonField<String> = bottomColor

    /**
     * Returns the raw JSON value of [topColor].
     *
     * Unlike [topColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topColor") @ExcludeMissing fun _topColor(): JsonField<String> = topColor

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

        /** Returns a mutable builder for constructing an instance of [WidgetBackground]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WidgetBackground]. */
    class Builder internal constructor() {

        private var bottomColor: JsonField<String> = JsonMissing.of()
        private var topColor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(widgetBackground: WidgetBackground) = apply {
            bottomColor = widgetBackground.bottomColor
            topColor = widgetBackground.topColor
            additionalProperties = widgetBackground.additionalProperties.toMutableMap()
        }

        fun bottomColor(bottomColor: String?) = bottomColor(JsonField.ofNullable(bottomColor))

        /** Alias for calling [Builder.bottomColor] with `bottomColor.orElse(null)`. */
        fun bottomColor(bottomColor: Optional<String>) = bottomColor(bottomColor.getOrNull())

        /**
         * Sets [Builder.bottomColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bottomColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bottomColor(bottomColor: JsonField<String>) = apply { this.bottomColor = bottomColor }

        fun topColor(topColor: String?) = topColor(JsonField.ofNullable(topColor))

        /** Alias for calling [Builder.topColor] with `topColor.orElse(null)`. */
        fun topColor(topColor: Optional<String>) = topColor(topColor.getOrNull())

        /**
         * Sets [Builder.topColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topColor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topColor(topColor: JsonField<String>) = apply { this.topColor = topColor }

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
         * Returns an immutable instance of [WidgetBackground].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WidgetBackground =
            WidgetBackground(bottomColor, topColor, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): WidgetBackground = apply {
        if (validated) {
            return@apply
        }

        bottomColor()
        topColor()
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
        (if (bottomColor.asKnown().isPresent) 1 else 0) +
            (if (topColor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WidgetBackground &&
            bottomColor == other.bottomColor &&
            topColor == other.topColor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bottomColor, topColor, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WidgetBackground{bottomColor=$bottomColor, topColor=$topColor, additionalProperties=$additionalProperties}"
}
