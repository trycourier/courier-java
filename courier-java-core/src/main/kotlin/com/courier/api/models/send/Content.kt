// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
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

/** Syntatic Sugar to provide a fast shorthand for Courier Elemental Blocks. */
@JsonDeserialize(using = Content.Deserializer::class)
@JsonSerialize(using = Content.Serializer::class)
class Content
private constructor(
    private val elemental: ElementalContent? = null,
    private val elementalContentSugar: ElementalContentSugar? = null,
    private val _json: JsonValue? = null,
) {

    fun elemental(): Optional<ElementalContent> = Optional.ofNullable(elemental)

    /** Syntatic Sugar to provide a fast shorthand for Courier Elemental Blocks. */
    fun elementalContentSugar(): Optional<ElementalContentSugar> =
        Optional.ofNullable(elementalContentSugar)

    fun isElemental(): Boolean = elemental != null

    fun isElementalContentSugar(): Boolean = elementalContentSugar != null

    fun asElemental(): ElementalContent = elemental.getOrThrow("elemental")

    /** Syntatic Sugar to provide a fast shorthand for Courier Elemental Blocks. */
    fun asElementalContentSugar(): ElementalContentSugar =
        elementalContentSugar.getOrThrow("elementalContentSugar")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            elemental != null -> visitor.visitElemental(elemental)
            elementalContentSugar != null ->
                visitor.visitElementalContentSugar(elementalContentSugar)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Content = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitElemental(elemental: ElementalContent) {
                    elemental.validate()
                }

                override fun visitElementalContentSugar(
                    elementalContentSugar: ElementalContentSugar
                ) {
                    elementalContentSugar.validate()
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
                override fun visitElemental(elemental: ElementalContent) = elemental.validity()

                override fun visitElementalContentSugar(
                    elementalContentSugar: ElementalContentSugar
                ) = elementalContentSugar.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Content &&
            elemental == other.elemental &&
            elementalContentSugar == other.elementalContentSugar
    }

    override fun hashCode(): Int = Objects.hash(elemental, elementalContentSugar)

    override fun toString(): String =
        when {
            elemental != null -> "Content{elemental=$elemental}"
            elementalContentSugar != null -> "Content{elementalContentSugar=$elementalContentSugar}"
            _json != null -> "Content{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Content")
        }

    companion object {

        @JvmStatic fun ofElemental(elemental: ElementalContent) = Content(elemental = elemental)

        /** Syntatic Sugar to provide a fast shorthand for Courier Elemental Blocks. */
        @JvmStatic
        fun ofElementalContentSugar(elementalContentSugar: ElementalContentSugar) =
            Content(elementalContentSugar = elementalContentSugar)
    }

    /** An interface that defines how to map each variant of [Content] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitElemental(elemental: ElementalContent): T

        /** Syntatic Sugar to provide a fast shorthand for Courier Elemental Blocks. */
        fun visitElementalContentSugar(elementalContentSugar: ElementalContentSugar): T

        /**
         * Maps an unknown variant of [Content] to a value of type [T].
         *
         * An instance of [Content] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Content: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Content>(Content::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Content {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ElementalContent>())?.let {
                            Content(elemental = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalContentSugar>())?.let {
                            Content(elementalContentSugar = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Content(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Content>(Content::class) {

        override fun serialize(
            value: Content,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.elemental != null -> generator.writeObject(value.elemental)
                value.elementalContentSugar != null ->
                    generator.writeObject(value.elementalContentSugar)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Content")
            }
        }
    }

    class ElementalContent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val elements: JsonField<List<ElementalNode>>,
        private val version: JsonField<String>,
        private val brand: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("elements")
            @ExcludeMissing
            elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
            @JsonProperty("brand") @ExcludeMissing brand: JsonValue = JsonMissing.of(),
        ) : this(elements, version, brand, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun elements(): List<ElementalNode> = elements.getRequired("elements")

        /**
         * For example, "2022-01-01"
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): String = version.getRequired("version")

        @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonValue = brand

        /**
         * Returns the raw JSON value of [elements].
         *
         * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elements")
        @ExcludeMissing
        fun _elements(): JsonField<List<ElementalNode>> = elements

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
             * Returns a mutable builder for constructing an instance of [ElementalContent].
             *
             * The following fields are required:
             * ```java
             * .elements()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ElementalContent]. */
        class Builder internal constructor() {

            private var elements: JsonField<MutableList<ElementalNode>>? = null
            private var version: JsonField<String>? = null
            private var brand: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(elementalContent: ElementalContent) = apply {
                elements = elementalContent.elements.map { it.toMutableList() }
                version = elementalContent.version
                brand = elementalContent.brand
                additionalProperties = elementalContent.additionalProperties.toMutableMap()
            }

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
            fun addElement(unionMember0: ElementalNode.UnionMember0) =
                addElement(ElementalNode.ofUnionMember0(unionMember0))

            /** Alias for calling [addElement] with `ElementalNode.ofUnionMember1(unionMember1)`. */
            fun addElement(unionMember1: ElementalNode.UnionMember1) =
                addElement(ElementalNode.ofUnionMember1(unionMember1))

            /** Alias for calling [addElement] with `ElementalNode.ofType(type)`. */
            fun addElement(type: ElementalNode.Type) = addElement(ElementalNode.ofType(type))

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

            /** For example, "2022-01-01" */
            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

            fun brand(brand: JsonValue) = apply { this.brand = brand }

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
             * Returns an immutable instance of [ElementalContent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .elements()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ElementalContent =
                ElementalContent(
                    checkRequired("elements", elements).map { it.toImmutable() },
                    checkRequired("version", version),
                    brand,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ElementalContent = apply {
            if (validated) {
                return@apply
            }

            elements().forEach { it.validate() }
            version()
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
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ElementalContent &&
                elements == other.elements &&
                version == other.version &&
                brand == other.brand &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(elements, version, brand, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ElementalContent{elements=$elements, version=$version, brand=$brand, additionalProperties=$additionalProperties}"
    }

    /** Syntatic Sugar to provide a fast shorthand for Courier Elemental Blocks. */
    class ElementalContentSugar
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val body: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(body, title, mutableMapOf())

        /**
         * The text content displayed in the notification.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun body(): String = body.getRequired("body")

        /**
         * The title to be displayed by supported channels i.e. push, email (as subject)
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Returns the raw JSON value of [body].
         *
         * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * Returns a mutable builder for constructing an instance of [ElementalContentSugar].
             *
             * The following fields are required:
             * ```java
             * .body()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ElementalContentSugar]. */
        class Builder internal constructor() {

            private var body: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(elementalContentSugar: ElementalContentSugar) = apply {
                body = elementalContentSugar.body
                title = elementalContentSugar.title
                additionalProperties = elementalContentSugar.additionalProperties.toMutableMap()
            }

            /** The text content displayed in the notification. */
            fun body(body: String) = body(JsonField.of(body))

            /**
             * Sets [Builder.body] to an arbitrary JSON value.
             *
             * You should usually call [Builder.body] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun body(body: JsonField<String>) = apply { this.body = body }

            /** The title to be displayed by supported channels i.e. push, email (as subject) */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [ElementalContentSugar].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .body()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ElementalContentSugar =
                ElementalContentSugar(
                    checkRequired("body", body),
                    checkRequired("title", title),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ElementalContentSugar = apply {
            if (validated) {
                return@apply
            }

            body()
            title()
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
            (if (body.asKnown().isPresent) 1 else 0) + (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ElementalContentSugar &&
                body == other.body &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(body, title, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ElementalContentSugar{body=$body, title=$title, additionalProperties=$additionalProperties}"
    }
}
