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

class ElementalContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val elements: JsonField<List<ElementalNode>>,
    private val version: JsonField<String>,
    private val scope: JsonField<Scope>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("elements")
        @ExcludeMissing
        elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
    ) : this(elements, version, scope, mutableMapOf())

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
     * How template variables read the data sent with the message. Under `strict`, data fields are
     * read only through the `data.` prefix, as in `{{data.name}}`. Under `default`, `data` is
     * spread onto the root, so `{{name}}` resolves and `{{data.name}}` renders as an empty string.
     * Templates saved in Design Studio are `strict`. When omitted, the content is `default`. A
     * write that replaces a template's content resets it to `default` unless the request sends
     * `scope` again.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<Scope> = scope.getOptional("scope")

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
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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
        private var scope: JsonField<Scope> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalContent: ElementalContent) = apply {
            elements = elementalContent.elements.map { it.toMutableList() }
            version = elementalContent.version
            scope = elementalContent.scope
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

        /**
         * Alias for calling [addElement] with `ElementalNode.ofHtmlNodeWithType(htmlNodeWithType)`.
         */
        fun addElement(htmlNodeWithType: ElementalHtmlNodeWithType) =
            addElement(ElementalNode.ofHtmlNodeWithType(htmlNodeWithType))

        /** For example, "2022-01-01" */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        /**
         * How template variables read the data sent with the message. Under `strict`, data fields
         * are read only through the `data.` prefix, as in `{{data.name}}`. Under `default`, `data`
         * is spread onto the root, so `{{name}}` resolves and `{{data.name}}` renders as an empty
         * string. Templates saved in Design Studio are `strict`. When omitted, the content is
         * `default`. A write that replaces a template's content resets it to `default` unless the
         * request sends `scope` again.
         */
        fun scope(scope: Scope) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

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
                scope,
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
    fun validate(): ElementalContent = apply {
        if (validated) {
            return@apply
        }

        elements().forEach { it.validate() }
        version()
        scope().ifPresent { it.validate() }
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
            (scope.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * How template variables read the data sent with the message. Under `strict`, data fields are
     * read only through the `data.` prefix, as in `{{data.name}}`. Under `default`, `data` is
     * spread onto the root, so `{{name}}` resolves and `{{data.name}}` renders as an empty string.
     * Templates saved in Design Studio are `strict`. When omitted, the content is `default`. A
     * write that replaces a template's content resets it to `default` unless the request sends
     * `scope` again.
     */
    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEFAULT = of("default")

            @JvmField val STRICT = of("strict")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            DEFAULT,
            STRICT,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            STRICT,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
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
                DEFAULT -> Value.DEFAULT
                STRICT -> Value.STRICT
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
                DEFAULT -> Known.DEFAULT
                STRICT -> Known.STRICT
                else -> throw CourierInvalidDataException("Unknown Scope: $value")
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
        fun validate(): Scope = apply {
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

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalContent &&
            elements == other.elements &&
            version == other.version &&
            scope == other.scope &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(elements, version, scope, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalContent{elements=$elements, version=$version, scope=$scope, additionalProperties=$additionalProperties}"
}
