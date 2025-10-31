// File generated from our OpenAPI spec by Stainless.

package com.courier.models

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

class ElementalContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val elements: JsonField<List<ElementalNode>>,
    private val version: JsonField<String>,
    private val brand: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("elements")
        @ExcludeMissing
        elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
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

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<String> = brand.getOptional("brand")

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

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

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
        private var brand: JsonField<String> = JsonMissing.of()
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

        /**
         * Alias for calling [addElement] with `ElementalNode.ofTextNodeWithType(textNodeWithType)`.
         */
        fun addElement(textNodeWithType: ElementalTextNodeWithType) =
            addElement(ElementalNode.ofTextNodeWithType(textNodeWithType))

        /**
         * Alias for calling [addElement] with `ElementalNode.ofMetaNodeWithType(metaNodeWithType)`.
         */
        fun addElement(metaNodeWithType: ElementalMetaNodeWithType) =
            addElement(ElementalNode.ofMetaNodeWithType(metaNodeWithType))

        /**
         * Alias for calling [addElement] with
         * `ElementalNode.ofChannelNodeWithType(channelNodeWithType)`.
         */
        fun addElement(channelNodeWithType: ElementalChannelNodeWithType) =
            addElement(ElementalNode.ofChannelNodeWithType(channelNodeWithType))

        /**
         * Alias for calling [addElement] with
         * `ElementalNode.ofImageNodeWithType(imageNodeWithType)`.
         */
        fun addElement(imageNodeWithType: ElementalImageNodeWithType) =
            addElement(ElementalNode.ofImageNodeWithType(imageNodeWithType))

        /**
         * Alias for calling [addElement] with
         * `ElementalNode.ofActionNodeWithType(actionNodeWithType)`.
         */
        fun addElement(actionNodeWithType: ElementalActionNodeWithType) =
            addElement(ElementalNode.ofActionNodeWithType(actionNodeWithType))

        /**
         * Alias for calling [addElement] with
         * `ElementalNode.ofDividerNodeWithType(dividerNodeWithType)`.
         */
        fun addElement(dividerNodeWithType: ElementalDividerNodeWithType) =
            addElement(ElementalNode.ofDividerNodeWithType(dividerNodeWithType))

        /**
         * Alias for calling [addElement] with
         * `ElementalNode.ofQuoteNodeWithType(quoteNodeWithType)`.
         */
        fun addElement(quoteNodeWithType: ElementalQuoteNodeWithType) =
            addElement(ElementalNode.ofQuoteNodeWithType(quoteNodeWithType))

        /** For example, "2022-01-01" */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        fun brand(brand: String?) = brand(JsonField.ofNullable(brand))

        /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
        fun brand(brand: Optional<String>) = brand(brand.getOrNull())

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<String>) = apply { this.brand = brand }

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
        brand()
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
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (brand.asKnown().isPresent) 1 else 0)

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
