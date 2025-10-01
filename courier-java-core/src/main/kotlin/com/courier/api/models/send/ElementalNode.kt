// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.getOrThrow
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The channel element allows a notification to be customized based on which channel it is sent
 * through. For example, you may want to display a detailed message when the notification is sent
 * through email, and a more concise message in a push notification. Channel elements are only valid
 * as top-level elements; you cannot nest channel elements. If there is a channel element specified
 * at the top-level of the document, all sibling elements must be channel elements. Note: As an
 * alternative, most elements support a `channel` property. Which allows you to selectively display
 * an individual element on a per channel basis. See the
 * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/) for
 * more details.
 */
@JsonDeserialize(using = ElementalNode.Deserializer::class)
@JsonSerialize(using = ElementalNode.Serializer::class)
class ElementalNode
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val unionMember1: UnionMember1? = null,
    private val unionMember2: UnionMember2? = null,
    private val unionMember3: UnionMember3? = null,
    private val unionMember4: UnionMember4? = null,
    private val unionMember5: UnionMember5? = null,
    private val unionMember6: UnionMember6? = null,
    private val unionMember7: UnionMember7? = null,
    private val _json: JsonValue? = null,
) {

    fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    /**
     * The channel element allows a notification to be customized based on which channel it is sent
     * through. For example, you may want to display a detailed message when the notification is
     * sent through email, and a more concise message in a push notification. Channel elements are
     * only valid as top-level elements; you cannot nest channel elements. If there is a channel
     * element specified at the top-level of the document, all sibling elements must be channel
     * elements. Note: As an alternative, most elements support a `channel` property. Which allows
     * you to selectively display an individual element on a per channel basis. See the
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

    fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

    fun unionMember4(): Optional<UnionMember4> = Optional.ofNullable(unionMember4)

    fun unionMember5(): Optional<UnionMember5> = Optional.ofNullable(unionMember5)

    /**
     * Allows you to group elements together. This can be useful when used in combination with "if"
     * or "loop". See
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    fun unionMember6(): Optional<UnionMember6> = Optional.ofNullable(unionMember6)

    fun unionMember7(): Optional<UnionMember7> = Optional.ofNullable(unionMember7)

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun isUnionMember2(): Boolean = unionMember2 != null

    fun isUnionMember3(): Boolean = unionMember3 != null

    fun isUnionMember4(): Boolean = unionMember4 != null

    fun isUnionMember5(): Boolean = unionMember5 != null

    fun isUnionMember6(): Boolean = unionMember6 != null

    fun isUnionMember7(): Boolean = unionMember7 != null

    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    /**
     * The channel element allows a notification to be customized based on which channel it is sent
     * through. For example, you may want to display a detailed message when the notification is
     * sent through email, and a more concise message in a push notification. Channel elements are
     * only valid as top-level elements; you cannot nest channel elements. If there is a channel
     * element specified at the top-level of the document, all sibling elements must be channel
     * elements. Note: As an alternative, most elements support a `channel` property. Which allows
     * you to selectively display an individual element on a per channel basis. See the
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

    fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

    fun asUnionMember4(): UnionMember4 = unionMember4.getOrThrow("unionMember4")

    fun asUnionMember5(): UnionMember5 = unionMember5.getOrThrow("unionMember5")

    /**
     * Allows you to group elements together. This can be useful when used in combination with "if"
     * or "loop". See
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    fun asUnionMember6(): UnionMember6 = unionMember6.getOrThrow("unionMember6")

    fun asUnionMember7(): UnionMember7 = unionMember7.getOrThrow("unionMember7")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
            unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
            unionMember4 != null -> visitor.visitUnionMember4(unionMember4)
            unionMember5 != null -> visitor.visitUnionMember5(unionMember5)
            unionMember6 != null -> visitor.visitUnionMember6(unionMember6)
            unionMember7 != null -> visitor.visitUnionMember7(unionMember7)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ElementalNode = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }

                override fun visitUnionMember2(unionMember2: UnionMember2) {
                    unionMember2.validate()
                }

                override fun visitUnionMember3(unionMember3: UnionMember3) {
                    unionMember3.validate()
                }

                override fun visitUnionMember4(unionMember4: UnionMember4) {
                    unionMember4.validate()
                }

                override fun visitUnionMember5(unionMember5: UnionMember5) {
                    unionMember5.validate()
                }

                override fun visitUnionMember6(unionMember6: UnionMember6) {
                    unionMember6.validate()
                }

                override fun visitUnionMember7(unionMember7: UnionMember7) {
                    unionMember7.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun visitUnionMember2(unionMember2: UnionMember2) = unionMember2.validity()

                override fun visitUnionMember3(unionMember3: UnionMember3) = unionMember3.validity()

                override fun visitUnionMember4(unionMember4: UnionMember4) = unionMember4.validity()

                override fun visitUnionMember5(unionMember5: UnionMember5) = unionMember5.validity()

                override fun visitUnionMember6(unionMember6: UnionMember6) = unionMember6.validity()

                override fun visitUnionMember7(unionMember7: UnionMember7) = unionMember7.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalNode &&
            unionMember0 == other.unionMember0 &&
            unionMember1 == other.unionMember1 &&
            unionMember2 == other.unionMember2 &&
            unionMember3 == other.unionMember3 &&
            unionMember4 == other.unionMember4 &&
            unionMember5 == other.unionMember5 &&
            unionMember6 == other.unionMember6 &&
            unionMember7 == other.unionMember7
    }

    override fun hashCode(): Int =
        Objects.hash(
            unionMember0,
            unionMember1,
            unionMember2,
            unionMember3,
            unionMember4,
            unionMember5,
            unionMember6,
            unionMember7,
        )

    override fun toString(): String =
        when {
            unionMember0 != null -> "ElementalNode{unionMember0=$unionMember0}"
            unionMember1 != null -> "ElementalNode{unionMember1=$unionMember1}"
            unionMember2 != null -> "ElementalNode{unionMember2=$unionMember2}"
            unionMember3 != null -> "ElementalNode{unionMember3=$unionMember3}"
            unionMember4 != null -> "ElementalNode{unionMember4=$unionMember4}"
            unionMember5 != null -> "ElementalNode{unionMember5=$unionMember5}"
            unionMember6 != null -> "ElementalNode{unionMember6=$unionMember6}"
            unionMember7 != null -> "ElementalNode{unionMember7=$unionMember7}"
            _json != null -> "ElementalNode{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ElementalNode")
        }

    companion object {

        @JvmStatic
        fun ofUnionMember0(unionMember0: UnionMember0) = ElementalNode(unionMember0 = unionMember0)

        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) = ElementalNode(unionMember1 = unionMember1)

        /**
         * The channel element allows a notification to be customized based on which channel it is
         * sent through. For example, you may want to display a detailed message when the
         * notification is sent through email, and a more concise message in a push notification.
         * Channel elements are only valid as top-level elements; you cannot nest channel elements.
         * If there is a channel element specified at the top-level of the document, all sibling
         * elements must be channel elements. Note: As an alternative, most elements support a
         * `channel` property. Which allows you to selectively display an individual element on a
         * per channel basis. See the
         * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
         * for more details.
         */
        @JvmStatic
        fun ofUnionMember2(unionMember2: UnionMember2) = ElementalNode(unionMember2 = unionMember2)

        @JvmStatic
        fun ofUnionMember3(unionMember3: UnionMember3) = ElementalNode(unionMember3 = unionMember3)

        @JvmStatic
        fun ofUnionMember4(unionMember4: UnionMember4) = ElementalNode(unionMember4 = unionMember4)

        @JvmStatic
        fun ofUnionMember5(unionMember5: UnionMember5) = ElementalNode(unionMember5 = unionMember5)

        /**
         * Allows you to group elements together. This can be useful when used in combination with
         * "if" or "loop". See
         * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
         * for more details.
         */
        @JvmStatic
        fun ofUnionMember6(unionMember6: UnionMember6) = ElementalNode(unionMember6 = unionMember6)

        @JvmStatic
        fun ofUnionMember7(unionMember7: UnionMember7) = ElementalNode(unionMember7 = unionMember7)
    }

    /**
     * An interface that defines how to map each variant of [ElementalNode] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitUnionMember0(unionMember0: UnionMember0): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        /**
         * The channel element allows a notification to be customized based on which channel it is
         * sent through. For example, you may want to display a detailed message when the
         * notification is sent through email, and a more concise message in a push notification.
         * Channel elements are only valid as top-level elements; you cannot nest channel elements.
         * If there is a channel element specified at the top-level of the document, all sibling
         * elements must be channel elements. Note: As an alternative, most elements support a
         * `channel` property. Which allows you to selectively display an individual element on a
         * per channel basis. See the
         * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
         * for more details.
         */
        fun visitUnionMember2(unionMember2: UnionMember2): T

        fun visitUnionMember3(unionMember3: UnionMember3): T

        fun visitUnionMember4(unionMember4: UnionMember4): T

        fun visitUnionMember5(unionMember5: UnionMember5): T

        /**
         * Allows you to group elements together. This can be useful when used in combination with
         * "if" or "loop". See
         * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
         * for more details.
         */
        fun visitUnionMember6(unionMember6: UnionMember6): T

        fun visitUnionMember7(unionMember7: UnionMember7): T

        /**
         * Maps an unknown variant of [ElementalNode] to a value of type [T].
         *
         * An instance of [ElementalNode] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown ElementalNode: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ElementalNode>(ElementalNode::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ElementalNode {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            ElementalNode(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            ElementalNode(unionMember1 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                            ElementalNode(unionMember2 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                            ElementalNode(unionMember3 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember4>())?.let {
                            ElementalNode(unionMember4 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember5>())?.let {
                            ElementalNode(unionMember5 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember6>())?.let {
                            ElementalNode(unionMember6 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember7>())?.let {
                            ElementalNode(unionMember7 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ElementalNode(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ElementalNode>(ElementalNode::class) {

        override fun serialize(
            value: ElementalNode,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                value.unionMember4 != null -> generator.writeObject(value.unionMember4)
                value.unionMember5 != null -> generator.writeObject(value.unionMember5)
                value.unionMember6 != null -> generator.writeObject(value.unionMember6)
                value.unionMember7 != null -> generator.writeObject(value.unionMember7)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ElementalNode")
            }
        }
    }

    class UnionMember0
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember0: UnionMember0) = apply {
                channels = unionMember0.channels.map { it.toMutableList() }
                if_ = unionMember0.if_
                loop = unionMember0.loop
                ref = unionMember0.ref
                type = unionMember0.type
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember0 =
                UnionMember0(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TEXT = of("text")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TEXT
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TEXT -> Value.TEXT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TEXT -> Known.TEXT
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember0 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                channels = unionMember1.channels.map { it.toMutableList() }
                if_ = unionMember1.if_
                loop = unionMember1.loop
                ref = unionMember1.ref
                type = unionMember1.type
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember1 =
                UnionMember1(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val META = of("meta")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                META
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                META,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    META -> Value.META
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    META -> Known.META
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The channel element allows a notification to be customized based on which channel it is sent
     * through. For example, you may want to display a detailed message when the notification is
     * sent through email, and a more concise message in a push notification. Channel elements are
     * only valid as top-level elements; you cannot nest channel elements. If there is a channel
     * element specified at the top-level of the document, all sibling elements must be channel
     * elements. Note: As an alternative, most elements support a `channel` property. Which allows
     * you to selectively display an individual element on a per channel basis. See the
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    class UnionMember2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channel: JsonField<String>,
        private val channels: JsonField<List<String>>,
        private val elements: JsonField<List<ElementalNode>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val raw: JsonField<ElementalChannelNode.Raw>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channels")
            @ExcludeMissing
            channels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("elements")
            @ExcludeMissing
            elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
            @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("loop") @ExcludeMissing loop: JsonField<String> = JsonMissing.of(),
            @JsonProperty("raw")
            @ExcludeMissing
            raw: JsonField<ElementalChannelNode.Raw> = JsonMissing.of(),
            @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channel, channels, elements, if_, loop, raw, ref, type, mutableMapOf())

        fun toElementalChannelNode(): ElementalChannelNode =
            ElementalChannelNode.builder()
                .channel(channel)
                .channels(channels)
                .elements(elements)
                .if_(if_)
                .loop(loop)
                .raw(raw)
                .ref(ref)
                .build()

        /**
         * The channel the contents of this element should be applied to. Can be `email`, `push`,
         * `direct_message`, `sms` or a provider such as slack
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channel(): String = channel.getRequired("channel")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channels(): Optional<List<String>> = channels.getOptional("channels")

        /**
         * An array of elements to apply to the channel. If `raw` has not been specified, `elements`
         * is `required`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun elements(): Optional<List<ElementalNode>> = elements.getOptional("elements")

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
         * Raw data to apply to the channel. If `elements` has not been specified, `raw` is
         * `required`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun raw(): Optional<ElementalChannelNode.Raw> = raw.getOptional("raw")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ref(): Optional<String> = ref.getOptional("ref")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

        /**
         * Returns the raw JSON value of [elements].
         *
         * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elements")
        @ExcludeMissing
        fun _elements(): JsonField<List<ElementalNode>> = elements

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
         * Returns the raw JSON value of [raw].
         *
         * Unlike [raw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw") @ExcludeMissing fun _raw(): JsonField<ElementalChannelNode.Raw> = raw

        /**
         * Returns the raw JSON value of [ref].
         *
         * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [UnionMember2].
             *
             * The following fields are required:
             * ```java
             * .channel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember2]. */
        class Builder internal constructor() {

            private var channel: JsonField<String>? = null
            private var channels: JsonField<MutableList<String>>? = null
            private var elements: JsonField<MutableList<ElementalNode>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var raw: JsonField<ElementalChannelNode.Raw> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember2: UnionMember2) = apply {
                channel = unionMember2.channel
                channels = unionMember2.channels.map { it.toMutableList() }
                elements = unionMember2.elements.map { it.toMutableList() }
                if_ = unionMember2.if_
                loop = unionMember2.loop
                raw = unionMember2.raw
                ref = unionMember2.ref
                type = unionMember2.type
                additionalProperties = unionMember2.additionalProperties.toMutableMap()
            }

            /**
             * The channel the contents of this element should be applied to. Can be `email`,
             * `push`, `direct_message`, `sms` or a provider such as slack
             */
            fun channel(channel: String) = channel(JsonField.of(channel))

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<String>) = apply { this.channel = channel }

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

            /**
             * An array of elements to apply to the channel. If `raw` has not been specified,
             * `elements` is `required`.
             */
            fun elements(elements: List<ElementalNode>?) = elements(JsonField.ofNullable(elements))

            /** Alias for calling [Builder.elements] with `elements.orElse(null)`. */
            fun elements(elements: Optional<List<ElementalNode>>) = elements(elements.getOrNull())

            /**
             * Sets [Builder.elements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elements] with a well-typed `List<ElementalNode>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun addElement(unionMember0: UnionMember0) =
                addElement(ElementalNode.ofUnionMember0(unionMember0))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember1(unionMember1)`. */
            fun addElement(unionMember1: UnionMember1) =
                addElement(ElementalNode.ofUnionMember1(unionMember1))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember2(unionMember2)`. */
            fun addElement(unionMember2: UnionMember2) =
                addElement(ElementalNode.ofUnionMember2(unionMember2))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember3(unionMember3)`. */
            fun addElement(unionMember3: UnionMember3) =
                addElement(ElementalNode.ofUnionMember3(unionMember3))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember4(unionMember4)`. */
            fun addElement(unionMember4: UnionMember4) =
                addElement(ElementalNode.ofUnionMember4(unionMember4))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember5(unionMember5)`. */
            fun addElement(unionMember5: UnionMember5) =
                addElement(ElementalNode.ofUnionMember5(unionMember5))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember6(unionMember6)`. */
            fun addElement(unionMember6: UnionMember6) =
                addElement(ElementalNode.ofUnionMember6(unionMember6))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember7(unionMember7)`. */
            fun addElement(unionMember7: UnionMember7) =
                addElement(ElementalNode.ofUnionMember7(unionMember7))

            fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

            /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
            fun if_(if_: Optional<String>) = if_(if_.getOrNull())

            /**
             * Sets [Builder.if_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.if_] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            /**
             * Raw data to apply to the channel. If `elements` has not been specified, `raw` is
             * `required`.
             */
            fun raw(raw: ElementalChannelNode.Raw?) = raw(JsonField.ofNullable(raw))

            /** Alias for calling [Builder.raw] with `raw.orElse(null)`. */
            fun raw(raw: Optional<ElementalChannelNode.Raw>) = raw(raw.getOrNull())

            /**
             * Sets [Builder.raw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raw] with a well-typed [ElementalChannelNode.Raw]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun raw(raw: JsonField<ElementalChannelNode.Raw>) = apply { this.raw = raw }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .channel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember2 =
                UnionMember2(
                    checkRequired("channel", channel),
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    (elements ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    raw,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember2 = apply {
            if (validated) {
                return@apply
            }

            channel()
            channels()
            elements().ifPresent { it.forEach { it.validate() } }
            if_()
            loop()
            raw().ifPresent { it.validate() }
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (channel.asKnown().isPresent) 1 else 0) +
                (channels.asKnown().getOrNull()?.size ?: 0) +
                (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (raw.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHANNEL = of("channel")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CHANNEL
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHANNEL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CHANNEL -> Value.CHANNEL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CHANNEL -> Known.CHANNEL
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember2 &&
                channel == other.channel &&
                channels == other.channels &&
                elements == other.elements &&
                if_ == other.if_ &&
                loop == other.loop &&
                raw == other.raw &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                channel,
                channels,
                elements,
                if_,
                loop,
                raw,
                ref,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember2{channel=$channel, channels=$channels, elements=$elements, if_=$if_, loop=$loop, raw=$raw, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    class UnionMember3
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [UnionMember3]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember3]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember3: UnionMember3) = apply {
                channels = unionMember3.channels.map { it.toMutableList() }
                if_ = unionMember3.if_
                loop = unionMember3.loop
                ref = unionMember3.ref
                type = unionMember3.type
                additionalProperties = unionMember3.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember3].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember3 =
                UnionMember3(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember3 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IMAGE = of("image")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                IMAGE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IMAGE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IMAGE -> Value.IMAGE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IMAGE -> Known.IMAGE
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember3 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember3{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    class UnionMember4
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [UnionMember4]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember4]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember4: UnionMember4) = apply {
                channels = unionMember4.channels.map { it.toMutableList() }
                if_ = unionMember4.if_
                loop = unionMember4.loop
                ref = unionMember4.ref
                type = unionMember4.type
                additionalProperties = unionMember4.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember4].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember4 =
                UnionMember4(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember4 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACTION = of("action")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACTION
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTION,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACTION -> Value.ACTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACTION -> Known.ACTION
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember4 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember4{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    class UnionMember5
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [UnionMember5]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember5]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember5: UnionMember5) = apply {
                channels = unionMember5.channels.map { it.toMutableList() }
                if_ = unionMember5.if_
                loop = unionMember5.loop
                ref = unionMember5.ref
                type = unionMember5.type
                additionalProperties = unionMember5.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember5].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember5 =
                UnionMember5(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember5 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DIVIDER = of("divider")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DIVIDER
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIVIDER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DIVIDER -> Value.DIVIDER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DIVIDER -> Known.DIVIDER
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember5 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember5{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Allows you to group elements together. This can be useful when used in combination with "if"
     * or "loop". See
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    class UnionMember6
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val elements: JsonField<List<ElementalNode>>,
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(elements, channels, if_, loop, ref, type, mutableMapOf())

        fun toElementalGroupNode(): ElementalGroupNode =
            ElementalGroupNode.builder()
                .elements(elements)
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .build()

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

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
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [UnionMember6].
             *
             * The following fields are required:
             * ```java
             * .elements()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember6]. */
        class Builder internal constructor() {

            private var elements: JsonField<MutableList<ElementalNode>>? = null
            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember6: UnionMember6) = apply {
                elements = unionMember6.elements.map { it.toMutableList() }
                channels = unionMember6.channels.map { it.toMutableList() }
                if_ = unionMember6.if_
                loop = unionMember6.loop
                ref = unionMember6.ref
                type = unionMember6.type
                additionalProperties = unionMember6.additionalProperties.toMutableMap()
            }

            /** Sub elements to render. */
            fun elements(elements: List<ElementalNode>) = elements(JsonField.of(elements))

            /**
             * Sets [Builder.elements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elements] with a well-typed `List<ElementalNode>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun addElement(unionMember0: UnionMember0) =
                addElement(ElementalNode.ofUnionMember0(unionMember0))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember1(unionMember1)`. */
            fun addElement(unionMember1: UnionMember1) =
                addElement(ElementalNode.ofUnionMember1(unionMember1))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember2(unionMember2)`. */
            fun addElement(unionMember2: UnionMember2) =
                addElement(ElementalNode.ofUnionMember2(unionMember2))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember3(unionMember3)`. */
            fun addElement(unionMember3: UnionMember3) =
                addElement(ElementalNode.ofUnionMember3(unionMember3))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember4(unionMember4)`. */
            fun addElement(unionMember4: UnionMember4) =
                addElement(ElementalNode.ofUnionMember4(unionMember4))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember5(unionMember5)`. */
            fun addElement(unionMember5: UnionMember5) =
                addElement(ElementalNode.ofUnionMember5(unionMember5))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember6(unionMember6)`. */
            fun addElement(unionMember6: UnionMember6) =
                addElement(ElementalNode.ofUnionMember6(unionMember6))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember7(unionMember7)`. */
            fun addElement(unionMember7: UnionMember7) =
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember6].
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
            fun build(): UnionMember6 =
                UnionMember6(
                    checkRequired("elements", elements).map { it.toImmutable() },
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember6 = apply {
            if (validated) {
                return@apply
            }

            elements().forEach { it.validate() }
            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val GROUP = of("group")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                GROUP
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GROUP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    GROUP -> Value.GROUP
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    GROUP -> Known.GROUP
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember6 &&
                elements == other.elements &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(elements, channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember6{elements=$elements, channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }

    class UnionMember7
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val type: JsonField<Type>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [UnionMember7]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember7]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember7: UnionMember7) = apply {
                channels = unionMember7.channels.map { it.toMutableList() }
                if_ = unionMember7.if_
                loop = unionMember7.loop
                ref = unionMember7.ref
                type = unionMember7.type
                additionalProperties = unionMember7.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember7].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember7 =
                UnionMember7(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember7 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val QUOTE = of("quote")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                QUOTE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUOTE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    QUOTE -> Value.QUOTE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    QUOTE -> Known.QUOTE
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember7 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember7{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }
}
