// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandSettingsInApp
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val colors: JsonField<BrandColors>,
    private val icons: JsonField<Icons>,
    private val widgetBackground: JsonField<WidgetBackground>,
    private val borderRadius: JsonField<String>,
    private val disableMessageIcon: JsonField<Boolean>,
    private val fontFamily: JsonField<String>,
    private val placement: JsonField<Placement>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("colors") @ExcludeMissing colors: JsonField<BrandColors> = JsonMissing.of(),
        @JsonProperty("icons") @ExcludeMissing icons: JsonField<Icons> = JsonMissing.of(),
        @JsonProperty("widgetBackground")
        @ExcludeMissing
        widgetBackground: JsonField<WidgetBackground> = JsonMissing.of(),
        @JsonProperty("borderRadius")
        @ExcludeMissing
        borderRadius: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disableMessageIcon")
        @ExcludeMissing
        disableMessageIcon: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("fontFamily")
        @ExcludeMissing
        fontFamily: JsonField<String> = JsonMissing.of(),
        @JsonProperty("placement")
        @ExcludeMissing
        placement: JsonField<Placement> = JsonMissing.of(),
    ) : this(
        colors,
        icons,
        widgetBackground,
        borderRadius,
        disableMessageIcon,
        fontFamily,
        placement,
        mutableMapOf(),
    )

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun colors(): BrandColors = colors.getRequired("colors")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun icons(): Icons = icons.getRequired("icons")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun widgetBackground(): WidgetBackground = widgetBackground.getRequired("widgetBackground")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borderRadius(): Optional<String> = borderRadius.getOptional("borderRadius")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disableMessageIcon(): Optional<Boolean> =
        disableMessageIcon.getOptional("disableMessageIcon")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun placement(): Optional<Placement> = placement.getOptional("placement")

    /**
     * Returns the raw JSON value of [colors].
     *
     * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<BrandColors> = colors

    /**
     * Returns the raw JSON value of [icons].
     *
     * Unlike [icons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icons") @ExcludeMissing fun _icons(): JsonField<Icons> = icons

    /**
     * Returns the raw JSON value of [widgetBackground].
     *
     * Unlike [widgetBackground], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("widgetBackground")
    @ExcludeMissing
    fun _widgetBackground(): JsonField<WidgetBackground> = widgetBackground

    /**
     * Returns the raw JSON value of [borderRadius].
     *
     * Unlike [borderRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("borderRadius")
    @ExcludeMissing
    fun _borderRadius(): JsonField<String> = borderRadius

    /**
     * Returns the raw JSON value of [disableMessageIcon].
     *
     * Unlike [disableMessageIcon], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("disableMessageIcon")
    @ExcludeMissing
    fun _disableMessageIcon(): JsonField<Boolean> = disableMessageIcon

    /**
     * Returns the raw JSON value of [fontFamily].
     *
     * Unlike [fontFamily], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fontFamily") @ExcludeMissing fun _fontFamily(): JsonField<String> = fontFamily

    /**
     * Returns the raw JSON value of [placement].
     *
     * Unlike [placement], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("placement") @ExcludeMissing fun _placement(): JsonField<Placement> = placement

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
         * Returns a mutable builder for constructing an instance of [BrandSettingsInApp].
         *
         * The following fields are required:
         * ```java
         * .colors()
         * .icons()
         * .widgetBackground()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandSettingsInApp]. */
    class Builder internal constructor() {

        private var colors: JsonField<BrandColors>? = null
        private var icons: JsonField<Icons>? = null
        private var widgetBackground: JsonField<WidgetBackground>? = null
        private var borderRadius: JsonField<String> = JsonMissing.of()
        private var disableMessageIcon: JsonField<Boolean> = JsonMissing.of()
        private var fontFamily: JsonField<String> = JsonMissing.of()
        private var placement: JsonField<Placement> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandSettingsInApp: BrandSettingsInApp) = apply {
            colors = brandSettingsInApp.colors
            icons = brandSettingsInApp.icons
            widgetBackground = brandSettingsInApp.widgetBackground
            borderRadius = brandSettingsInApp.borderRadius
            disableMessageIcon = brandSettingsInApp.disableMessageIcon
            fontFamily = brandSettingsInApp.fontFamily
            placement = brandSettingsInApp.placement
            additionalProperties = brandSettingsInApp.additionalProperties.toMutableMap()
        }

        fun colors(colors: BrandColors) = colors(JsonField.of(colors))

        /**
         * Sets [Builder.colors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colors] with a well-typed [BrandColors] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun colors(colors: JsonField<BrandColors>) = apply { this.colors = colors }

        fun icons(icons: Icons) = icons(JsonField.of(icons))

        /**
         * Sets [Builder.icons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icons] with a well-typed [Icons] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun icons(icons: JsonField<Icons>) = apply { this.icons = icons }

        fun widgetBackground(widgetBackground: WidgetBackground) =
            widgetBackground(JsonField.of(widgetBackground))

        /**
         * Sets [Builder.widgetBackground] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widgetBackground] with a well-typed [WidgetBackground]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun widgetBackground(widgetBackground: JsonField<WidgetBackground>) = apply {
            this.widgetBackground = widgetBackground
        }

        fun borderRadius(borderRadius: String?) = borderRadius(JsonField.ofNullable(borderRadius))

        /** Alias for calling [Builder.borderRadius] with `borderRadius.orElse(null)`. */
        fun borderRadius(borderRadius: Optional<String>) = borderRadius(borderRadius.getOrNull())

        /**
         * Sets [Builder.borderRadius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borderRadius] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borderRadius(borderRadius: JsonField<String>) = apply {
            this.borderRadius = borderRadius
        }

        fun disableMessageIcon(disableMessageIcon: Boolean?) =
            disableMessageIcon(JsonField.ofNullable(disableMessageIcon))

        /**
         * Alias for [Builder.disableMessageIcon].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun disableMessageIcon(disableMessageIcon: Boolean) =
            disableMessageIcon(disableMessageIcon as Boolean?)

        /**
         * Alias for calling [Builder.disableMessageIcon] with `disableMessageIcon.orElse(null)`.
         */
        fun disableMessageIcon(disableMessageIcon: Optional<Boolean>) =
            disableMessageIcon(disableMessageIcon.getOrNull())

        /**
         * Sets [Builder.disableMessageIcon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableMessageIcon] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disableMessageIcon(disableMessageIcon: JsonField<Boolean>) = apply {
            this.disableMessageIcon = disableMessageIcon
        }

        fun fontFamily(fontFamily: String?) = fontFamily(JsonField.ofNullable(fontFamily))

        /** Alias for calling [Builder.fontFamily] with `fontFamily.orElse(null)`. */
        fun fontFamily(fontFamily: Optional<String>) = fontFamily(fontFamily.getOrNull())

        /**
         * Sets [Builder.fontFamily] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontFamily] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fontFamily(fontFamily: JsonField<String>) = apply { this.fontFamily = fontFamily }

        fun placement(placement: Placement?) = placement(JsonField.ofNullable(placement))

        /** Alias for calling [Builder.placement] with `placement.orElse(null)`. */
        fun placement(placement: Optional<Placement>) = placement(placement.getOrNull())

        /**
         * Sets [Builder.placement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.placement] with a well-typed [Placement] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun placement(placement: JsonField<Placement>) = apply { this.placement = placement }

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
         * Returns an immutable instance of [BrandSettingsInApp].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .colors()
         * .icons()
         * .widgetBackground()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandSettingsInApp =
            BrandSettingsInApp(
                checkRequired("colors", colors),
                checkRequired("icons", icons),
                checkRequired("widgetBackground", widgetBackground),
                borderRadius,
                disableMessageIcon,
                fontFamily,
                placement,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandSettingsInApp = apply {
        if (validated) {
            return@apply
        }

        colors().validate()
        icons().validate()
        widgetBackground().validate()
        borderRadius()
        disableMessageIcon()
        fontFamily()
        placement().ifPresent { it.validate() }
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
        (colors.asKnown().getOrNull()?.validity() ?: 0) +
            (icons.asKnown().getOrNull()?.validity() ?: 0) +
            (widgetBackground.asKnown().getOrNull()?.validity() ?: 0) +
            (if (borderRadius.asKnown().isPresent) 1 else 0) +
            (if (disableMessageIcon.asKnown().isPresent) 1 else 0) +
            (if (fontFamily.asKnown().isPresent) 1 else 0) +
            (placement.asKnown().getOrNull()?.validity() ?: 0)

    class Placement @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TOP = of("top")

            @JvmField val BOTTOM = of("bottom")

            @JvmField val LEFT = of("left")

            @JvmField val RIGHT = of("right")

            @JvmStatic fun of(value: String) = Placement(JsonField.of(value))
        }

        /** An enum containing [Placement]'s known values. */
        enum class Known {
            TOP,
            BOTTOM,
            LEFT,
            RIGHT,
        }

        /**
         * An enum containing [Placement]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Placement] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOP,
            BOTTOM,
            LEFT,
            RIGHT,
            /**
             * An enum member indicating that [Placement] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TOP -> Value.TOP
                BOTTOM -> Value.BOTTOM
                LEFT -> Value.LEFT
                RIGHT -> Value.RIGHT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TOP -> Known.TOP
                BOTTOM -> Known.BOTTOM
                LEFT -> Known.LEFT
                RIGHT -> Known.RIGHT
                else -> throw CourierInvalidDataException("Unknown Placement: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Placement = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Placement && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandSettingsInApp &&
            colors == other.colors &&
            icons == other.icons &&
            widgetBackground == other.widgetBackground &&
            borderRadius == other.borderRadius &&
            disableMessageIcon == other.disableMessageIcon &&
            fontFamily == other.fontFamily &&
            placement == other.placement &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            colors,
            icons,
            widgetBackground,
            borderRadius,
            disableMessageIcon,
            fontFamily,
            placement,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandSettingsInApp{colors=$colors, icons=$icons, widgetBackground=$widgetBackground, borderRadius=$borderRadius, disableMessageIcon=$disableMessageIcon, fontFamily=$fontFamily, placement=$placement, additionalProperties=$additionalProperties}"
}
