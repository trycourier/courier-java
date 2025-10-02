// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ElementalGroupNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val elements: JsonField<List<ElementalNode>>,
    private val channels: JsonField<List<String>>,
    private val if_: JsonField<String>,
    private val loop: JsonField<String>,
    private val ref: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("elements")
        @ExcludeMissing
        elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loop") @ExcludeMissing loop: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
    ) : this(elements, channels, if_, loop, ref, mutableMapOf())

    /**
     * Sub elements to render.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun elements(): List<ElementalNode> = elements.getRequired("elements")

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
     * Returns the raw JSON value of [elements].
     *
     * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elements")
    @ExcludeMissing
    fun _elements(): JsonField<List<ElementalNode>> = elements

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
         * Returns a mutable builder for constructing an instance of [ElementalGroupNode].
         *
         * The following fields are required:
         * ```java
         * .elements()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElementalGroupNode]. */
    class Builder internal constructor() {

        private var elements: JsonField<MutableList<ElementalNode>>? = null
        private var channels: JsonField<MutableList<String>>? = null
        private var if_: JsonField<String> = JsonMissing.of()
        private var loop: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalGroupNode: ElementalGroupNode) = apply {
            elements = elementalGroupNode.elements.map { it.toMutableList() }
            channels = elementalGroupNode.channels.map { it.toMutableList() }
            if_ = elementalGroupNode.if_
            loop = elementalGroupNode.loop
            ref = elementalGroupNode.ref
            additionalProperties = elementalGroupNode.additionalProperties.toMutableMap()
        }

        /** Sub elements to render. */
        fun elements(elements: List<ElementalNode>) = elements(JsonField.of(elements))

        /**
         * Sets [Builder.elements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elements] with a well-typed `List<ElementalNode>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elements(elements: JsonField<List<ElementalNode>>) = apply {
            this.elements = elements.map { it.toMutableList() }
        }

        /**
         * Adds a single [ElementalNode] to [elements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addElement(element: ElementalNode) = apply {
            elements =
                (elements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("elements", it).add(element)
                }
        }

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember0(unionMember0)`. */
        fun addElement(unionMember0: ElementalNode.UnionMember0) =
            addElement(ElementalNode.ofUnionMember0(unionMember0))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember1(unionMember1)`. */
        fun addElement(unionMember1: ElementalNode.UnionMember1) =
            addElement(ElementalNode.ofUnionMember1(unionMember1))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember2(unionMember2)`. */
        fun addElement(unionMember2: ElementalNode.UnionMember2) =
            addElement(ElementalNode.ofUnionMember2(unionMember2))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember3(unionMember3)`. */
        fun addElement(unionMember3: ElementalNode.UnionMember3) =
            addElement(ElementalNode.ofUnionMember3(unionMember3))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember4(unionMember4)`. */
        fun addElement(unionMember4: ElementalNode.UnionMember4) =
            addElement(ElementalNode.ofUnionMember4(unionMember4))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember5(unionMember5)`. */
        fun addElement(unionMember5: ElementalNode.UnionMember5) =
            addElement(ElementalNode.ofUnionMember5(unionMember5))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember6(unionMember6)`. */
        fun addElement(unionMember6: ElementalNode.UnionMember6) =
            addElement(ElementalNode.ofUnionMember6(unionMember6))

        /** Alias for calling [addElement] with `ElementalNode.ofUnionMember7(unionMember7)`. */
        fun addElement(unionMember7: ElementalNode.UnionMember7) =
            addElement(ElementalNode.ofUnionMember7(unionMember7))

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
         * Returns an immutable instance of [ElementalGroupNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .elements()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ElementalGroupNode =
            ElementalGroupNode(
                checkRequired("elements", elements).map { it.toImmutable() },
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                if_,
                loop,
                ref,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ElementalGroupNode = apply {
        if (validated) {
            return@apply
        }

        elements().forEach { it.validate() }
        channels()
        if_()
        loop()
        ref()
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
        (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (channels.asKnown().getOrNull()?.size ?: 0) +
            (if (if_.asKnown().isPresent) 1 else 0) +
            (if (loop.asKnown().isPresent) 1 else 0) +
            (if (ref.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalGroupNode &&
            elements == other.elements &&
            channels == other.channels &&
            if_ == other.if_ &&
            loop == other.loop &&
            ref == other.ref &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(elements, channels, if_, loop, ref, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalGroupNode{elements=$elements, channels=$channels, if_=$if_, loop=$loop, ref=$ref, additionalProperties=$additionalProperties}"
}
