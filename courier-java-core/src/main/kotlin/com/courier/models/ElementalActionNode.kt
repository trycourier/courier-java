// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.Enum
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

/** Allows the user to execute an action. Can be a button or a link. */
class ElementalActionNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channels: JsonField<List<String>>,
    private val if_: JsonField<String>,
    private val loop: JsonField<String>,
    private val ref: JsonField<String>,
    private val content: JsonField<String>,
    private val href: JsonField<String>,
    private val actionId: JsonField<String>,
    private val align: JsonField<Alignment>,
    private val backgroundColor: JsonField<String>,
    private val borderRadius: JsonField<String>,
    private val borderSize: JsonField<String>,
    private val disableTracking: JsonField<Boolean>,
    private val fontSize: JsonField<String>,
    private val locales: JsonField<Locales>,
    private val padding: JsonField<String>,
    private val style: JsonField<Style>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loop") @ExcludeMissing loop: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action_id") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("align") @ExcludeMissing align: JsonField<Alignment> = JsonMissing.of(),
        @JsonProperty("background_color")
        @ExcludeMissing
        backgroundColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("border_radius")
        @ExcludeMissing
        borderRadius: JsonField<String> = JsonMissing.of(),
        @JsonProperty("border_size")
        @ExcludeMissing
        borderSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disable_tracking")
        @ExcludeMissing
        disableTracking: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("font_size") @ExcludeMissing fontSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
        @JsonProperty("padding") @ExcludeMissing padding: JsonField<String> = JsonMissing.of(),
        @JsonProperty("style") @ExcludeMissing style: JsonField<Style> = JsonMissing.of(),
    ) : this(
        channels,
        if_,
        loop,
        ref,
        content,
        href,
        actionId,
        align,
        backgroundColor,
        borderRadius,
        borderSize,
        disableTracking,
        fontSize,
        locales,
        padding,
        style,
        mutableMapOf(),
    )

    fun toElementalBaseNode(): ElementalBaseNode =
        ElementalBaseNode.builder().channels(channels).if_(if_).loop(loop).ref(ref).build()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<List<String>> = channels.getOptional("channels")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun if_(): Optional<String> = if_.getOptional("if")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loop(): Optional<String> = loop.getOptional("loop")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ref(): Optional<String> = ref.getOptional("ref")

    /**
     * The text content of the action shown to the user.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): String = content.getRequired("content")

    /**
     * The target URL of the action.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun href(): String = href.getRequired("href")

    /**
     * A unique id used to identify the action when it is executed.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionId(): Optional<String> = actionId.getOptional("action_id")

    /**
     * The alignment of the action button. Defaults to "center".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun align(): Optional<Alignment> = align.getOptional("align")

    /**
     * The background color of the action button.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundColor(): Optional<String> = backgroundColor.getOptional("background_color")

    /**
     * CSS border-radius applied to the action button. For example, `4px`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borderRadius(): Optional<String> = borderRadius.getOptional("border_radius")

    /**
     * CSS border width applied to the action button. For example, `1px`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borderSize(): Optional<String> = borderSize.getOptional("border_size")

    /**
     * When true, the action's href is not rewritten for click-through tracking, even when
     * click-through tracking is enabled for the workspace.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disableTracking(): Optional<Boolean> = disableTracking.getOptional("disable_tracking")

    /**
     * CSS font-size applied to the action button label. For example, `14px`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fontSize(): Optional<String> = fontSize.getOptional("font_size")

    /**
     * Region specific content. See
     * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for more
     * details.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locales(): Optional<Locales> = locales.getOptional("locales")

    /**
     * CSS padding applied to the action button. For example, `8px 16px`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun padding(): Optional<String> = padding.getOptional("padding")

    /**
     * Defaults to `button`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun style(): Optional<Style> = style.getOptional("style")

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<List<String>> = channels

    /**
     * Returns the raw JSON value of [if_].
     *
     * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

    /**
     * Returns the raw JSON value of [loop].
     *
     * Unlike [loop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loop") @ExcludeMissing fun _loop(): JsonField<String> = loop

    /**
     * Returns the raw JSON value of [ref].
     *
     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [href].
     *
     * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action_id") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [align].
     *
     * Unlike [align], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("align") @ExcludeMissing fun _align(): JsonField<Alignment> = align

    /**
     * Returns the raw JSON value of [backgroundColor].
     *
     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background_color")
    @ExcludeMissing
    fun _backgroundColor(): JsonField<String> = backgroundColor

    /**
     * Returns the raw JSON value of [borderRadius].
     *
     * Unlike [borderRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_radius")
    @ExcludeMissing
    fun _borderRadius(): JsonField<String> = borderRadius

    /**
     * Returns the raw JSON value of [borderSize].
     *
     * Unlike [borderSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_size") @ExcludeMissing fun _borderSize(): JsonField<String> = borderSize

    /**
     * Returns the raw JSON value of [disableTracking].
     *
     * Unlike [disableTracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disable_tracking")
    @ExcludeMissing
    fun _disableTracking(): JsonField<Boolean> = disableTracking

    /**
     * Returns the raw JSON value of [fontSize].
     *
     * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<String> = fontSize

    /**
     * Returns the raw JSON value of [locales].
     *
     * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

    /**
     * Returns the raw JSON value of [padding].
     *
     * Unlike [padding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("padding") @ExcludeMissing fun _padding(): JsonField<String> = padding

    /**
     * Returns the raw JSON value of [style].
     *
     * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("style") @ExcludeMissing fun _style(): JsonField<Style> = style

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
         * Returns a mutable builder for constructing an instance of [ElementalActionNode].
         *
         * The following fields are required:
         * ```java
         * .content()
         * .href()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElementalActionNode]. */
    class Builder internal constructor() {

        private var channels: JsonField<MutableList<String>>? = null
        private var if_: JsonField<String> = JsonMissing.of()
        private var loop: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var content: JsonField<String>? = null
        private var href: JsonField<String>? = null
        private var actionId: JsonField<String> = JsonMissing.of()
        private var align: JsonField<Alignment> = JsonMissing.of()
        private var backgroundColor: JsonField<String> = JsonMissing.of()
        private var borderRadius: JsonField<String> = JsonMissing.of()
        private var borderSize: JsonField<String> = JsonMissing.of()
        private var disableTracking: JsonField<Boolean> = JsonMissing.of()
        private var fontSize: JsonField<String> = JsonMissing.of()
        private var locales: JsonField<Locales> = JsonMissing.of()
        private var padding: JsonField<String> = JsonMissing.of()
        private var style: JsonField<Style> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalActionNode: ElementalActionNode) = apply {
            channels = elementalActionNode.channels.map { it.toMutableList() }
            if_ = elementalActionNode.if_
            loop = elementalActionNode.loop
            ref = elementalActionNode.ref
            content = elementalActionNode.content
            href = elementalActionNode.href
            actionId = elementalActionNode.actionId
            align = elementalActionNode.align
            backgroundColor = elementalActionNode.backgroundColor
            borderRadius = elementalActionNode.borderRadius
            borderSize = elementalActionNode.borderSize
            disableTracking = elementalActionNode.disableTracking
            fontSize = elementalActionNode.fontSize
            locales = elementalActionNode.locales
            padding = elementalActionNode.padding
            style = elementalActionNode.style
            additionalProperties = elementalActionNode.additionalProperties.toMutableMap()
        }

        fun channels(channels: List<String>?) = channels(JsonField.ofNullable(channels))

        /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
        fun channels(channels: Optional<List<String>>) = channels(channels.getOrNull())

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channels(channels: JsonField<List<String>>) = apply {
            this.channels = channels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: String) = apply {
            channels =
                (channels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channels", it).add(channel)
                }
        }

        fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

        /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
        fun if_(if_: Optional<String>) = if_(if_.getOrNull())

        /**
         * Sets [Builder.if_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.if_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

        fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

        /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
        fun loop(loop: Optional<String>) = loop(loop.getOrNull())

        /**
         * Sets [Builder.loop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loop] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loop(loop: JsonField<String>) = apply { this.loop = loop }

        fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

        /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
        fun ref(ref: Optional<String>) = ref(ref.getOrNull())

        /**
         * Sets [Builder.ref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ref] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ref(ref: JsonField<String>) = apply { this.ref = ref }

        /** The text content of the action shown to the user. */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** The target URL of the action. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** A unique id used to identify the action when it is executed. */
        fun actionId(actionId: String?) = actionId(JsonField.ofNullable(actionId))

        /** Alias for calling [Builder.actionId] with `actionId.orElse(null)`. */
        fun actionId(actionId: Optional<String>) = actionId(actionId.getOrNull())

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        /** The alignment of the action button. Defaults to "center". */
        fun align(align: Alignment?) = align(JsonField.ofNullable(align))

        /** Alias for calling [Builder.align] with `align.orElse(null)`. */
        fun align(align: Optional<Alignment>) = align(align.getOrNull())

        /**
         * Sets [Builder.align] to an arbitrary JSON value.
         *
         * You should usually call [Builder.align] with a well-typed [Alignment] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun align(align: JsonField<Alignment>) = apply { this.align = align }

        /** The background color of the action button. */
        fun backgroundColor(backgroundColor: String?) =
            backgroundColor(JsonField.ofNullable(backgroundColor))

        /** Alias for calling [Builder.backgroundColor] with `backgroundColor.orElse(null)`. */
        fun backgroundColor(backgroundColor: Optional<String>) =
            backgroundColor(backgroundColor.getOrNull())

        /**
         * Sets [Builder.backgroundColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundColor(backgroundColor: JsonField<String>) = apply {
            this.backgroundColor = backgroundColor
        }

        /** CSS border-radius applied to the action button. For example, `4px` */
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

        /** CSS border width applied to the action button. For example, `1px` */
        fun borderSize(borderSize: String?) = borderSize(JsonField.ofNullable(borderSize))

        /** Alias for calling [Builder.borderSize] with `borderSize.orElse(null)`. */
        fun borderSize(borderSize: Optional<String>) = borderSize(borderSize.getOrNull())

        /**
         * Sets [Builder.borderSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borderSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borderSize(borderSize: JsonField<String>) = apply { this.borderSize = borderSize }

        /**
         * When true, the action's href is not rewritten for click-through tracking, even when
         * click-through tracking is enabled for the workspace.
         */
        fun disableTracking(disableTracking: Boolean?) =
            disableTracking(JsonField.ofNullable(disableTracking))

        /**
         * Alias for [Builder.disableTracking].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun disableTracking(disableTracking: Boolean) = disableTracking(disableTracking as Boolean?)

        /** Alias for calling [Builder.disableTracking] with `disableTracking.orElse(null)`. */
        fun disableTracking(disableTracking: Optional<Boolean>) =
            disableTracking(disableTracking.getOrNull())

        /**
         * Sets [Builder.disableTracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableTracking] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disableTracking(disableTracking: JsonField<Boolean>) = apply {
            this.disableTracking = disableTracking
        }

        /** CSS font-size applied to the action button label. For example, `14px` */
        fun fontSize(fontSize: String?) = fontSize(JsonField.ofNullable(fontSize))

        /** Alias for calling [Builder.fontSize] with `fontSize.orElse(null)`. */
        fun fontSize(fontSize: Optional<String>) = fontSize(fontSize.getOrNull())

        /**
         * Sets [Builder.fontSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontSize] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fontSize(fontSize: JsonField<String>) = apply { this.fontSize = fontSize }

        /**
         * Region specific content. See
         * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for more
         * details.
         */
        fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

        /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
        fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

        /**
         * Sets [Builder.locales] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locales] with a well-typed [Locales] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

        /** CSS padding applied to the action button. For example, `8px 16px` */
        fun padding(padding: String?) = padding(JsonField.ofNullable(padding))

        /** Alias for calling [Builder.padding] with `padding.orElse(null)`. */
        fun padding(padding: Optional<String>) = padding(padding.getOrNull())

        /**
         * Sets [Builder.padding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.padding] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun padding(padding: JsonField<String>) = apply { this.padding = padding }

        /** Defaults to `button`. */
        fun style(style: Style?) = style(JsonField.ofNullable(style))

        /** Alias for calling [Builder.style] with `style.orElse(null)`. */
        fun style(style: Optional<Style>) = style(style.getOrNull())

        /**
         * Sets [Builder.style] to an arbitrary JSON value.
         *
         * You should usually call [Builder.style] with a well-typed [Style] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun style(style: JsonField<Style>) = apply { this.style = style }

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
         * Returns an immutable instance of [ElementalActionNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * .href()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ElementalActionNode =
            ElementalActionNode(
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                if_,
                loop,
                ref,
                checkRequired("content", content),
                checkRequired("href", href),
                actionId,
                align,
                backgroundColor,
                borderRadius,
                borderSize,
                disableTracking,
                fontSize,
                locales,
                padding,
                style,
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
    fun validate(): ElementalActionNode = apply {
        if (validated) {
            return@apply
        }

        channels()
        if_()
        loop()
        ref()
        content()
        href()
        actionId()
        align().ifPresent { it.validate() }
        backgroundColor()
        borderRadius()
        borderSize()
        disableTracking()
        fontSize()
        locales().ifPresent { it.validate() }
        padding()
        style().ifPresent { it.validate() }
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
        (channels.asKnown().getOrNull()?.size ?: 0) +
            (if (if_.asKnown().isPresent) 1 else 0) +
            (if (loop.asKnown().isPresent) 1 else 0) +
            (if (ref.asKnown().isPresent) 1 else 0) +
            (if (content.asKnown().isPresent) 1 else 0) +
            (if (href.asKnown().isPresent) 1 else 0) +
            (if (actionId.asKnown().isPresent) 1 else 0) +
            (align.asKnown().getOrNull()?.validity() ?: 0) +
            (if (backgroundColor.asKnown().isPresent) 1 else 0) +
            (if (borderRadius.asKnown().isPresent) 1 else 0) +
            (if (borderSize.asKnown().isPresent) 1 else 0) +
            (if (disableTracking.asKnown().isPresent) 1 else 0) +
            (if (fontSize.asKnown().isPresent) 1 else 0) +
            (locales.asKnown().getOrNull()?.validity() ?: 0) +
            (if (padding.asKnown().isPresent) 1 else 0) +
            (style.asKnown().getOrNull()?.validity() ?: 0)

    /** Defaults to `button`. */
    class Style @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BUTTON = of("button")

            @JvmField val LINK = of("link")

            @JvmStatic fun of(value: String) = Style(JsonField.of(value))
        }

        /** An enum containing [Style]'s known values. */
        enum class Known {
            BUTTON,
            LINK,
        }

        /**
         * An enum containing [Style]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Style] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUTTON,
            LINK,
            /** An enum member indicating that [Style] was instantiated with an unknown value. */
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
                BUTTON -> Value.BUTTON
                LINK -> Value.LINK
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
                BUTTON -> Known.BUTTON
                LINK -> Known.LINK
                else -> throw CourierInvalidDataException("Unknown Style: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Style = apply {
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

            return other is Style && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalActionNode &&
            channels == other.channels &&
            if_ == other.if_ &&
            loop == other.loop &&
            ref == other.ref &&
            content == other.content &&
            href == other.href &&
            actionId == other.actionId &&
            align == other.align &&
            backgroundColor == other.backgroundColor &&
            borderRadius == other.borderRadius &&
            borderSize == other.borderSize &&
            disableTracking == other.disableTracking &&
            fontSize == other.fontSize &&
            locales == other.locales &&
            padding == other.padding &&
            style == other.style &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channels,
            if_,
            loop,
            ref,
            content,
            href,
            actionId,
            align,
            backgroundColor,
            borderRadius,
            borderSize,
            disableTracking,
            fontSize,
            locales,
            padding,
            style,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalActionNode{channels=$channels, if_=$if_, loop=$loop, ref=$ref, content=$content, href=$href, actionId=$actionId, align=$align, backgroundColor=$backgroundColor, borderRadius=$borderRadius, borderSize=$borderSize, disableTracking=$disableTracking, fontSize=$fontSize, locales=$locales, padding=$padding, style=$style, additionalProperties=$additionalProperties}"
}
