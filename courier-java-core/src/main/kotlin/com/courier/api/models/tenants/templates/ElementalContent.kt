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
import kotlin.jvm.optionals.getOrNull

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

        /** For example, "2022-01-01" */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
