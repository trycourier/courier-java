// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ElementalActionNodeWithType
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalDividerNodeWithType
import com.courier.models.ElementalHtmlNodeWithType
import com.courier.models.ElementalImageNodeWithType
import com.courier.models.ElementalMetaNodeWithType
import com.courier.models.ElementalNode
import com.courier.models.ElementalQuoteNodeWithType
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Request body for replacing the elemental content of a notification template. */
class NotificationContentPutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<Content>,
    private val state: JsonField<NotificationTemplateState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        state: JsonField<NotificationTemplateState> = JsonMissing.of(),
    ) : this(content, state, mutableMapOf())

    /**
     * Elemental content payload. The server defaults `version` when omitted.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): Content = content.getRequired("content")

    /**
     * Template state. Defaults to `DRAFT`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<NotificationTemplateState> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state")
    @ExcludeMissing
    fun _state(): JsonField<NotificationTemplateState> = state

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
         * Returns a mutable builder for constructing an instance of
         * [NotificationContentPutRequest].
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationContentPutRequest]. */
    class Builder internal constructor() {

        private var content: JsonField<Content>? = null
        private var state: JsonField<NotificationTemplateState> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationContentPutRequest: NotificationContentPutRequest) = apply {
            content = notificationContentPutRequest.content
            state = notificationContentPutRequest.state
            additionalProperties = notificationContentPutRequest.additionalProperties.toMutableMap()
        }

        /** Elemental content payload. The server defaults `version` when omitted. */
        fun content(content: Content) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [Content] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<Content>) = apply { this.content = content }

        /** Template state. Defaults to `DRAFT`. */
        fun state(state: NotificationTemplateState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [NotificationTemplateState]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun state(state: JsonField<NotificationTemplateState>) = apply { this.state = state }

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
         * Returns an immutable instance of [NotificationContentPutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationContentPutRequest =
            NotificationContentPutRequest(
                checkRequired("content", content),
                state,
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
    fun validate(): NotificationContentPutRequest = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        state().ifPresent { it.validate() }
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
        (content.asKnown().getOrNull()?.validity() ?: 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0)

    /** Elemental content payload. The server defaults `version` when omitted. */
    class Content
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val elements: JsonField<List<ElementalNode>>,
        private val scope: JsonField<Scope>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("elements")
            @ExcludeMissing
            elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(elements, scope, version, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun elements(): List<ElementalNode> = elements.getRequired("elements")

        /**
         * How template variables read the data sent with the message. Under `strict`, data fields
         * are read only through the `data.` prefix, as in `{{data.name}}`. Under `default`, `data`
         * is spread onto the root, so `{{name}}` resolves and `{{data.name}}` renders as an empty
         * string. This request replaces the stored content, so omitting `scope` resets it to
         * `default`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scope(): Optional<Scope> = scope.getOptional("scope")

        /**
         * Content version identifier (e.g., `2022-01-01`). Optional; server defaults when omitted.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<String> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [elements].
         *
         * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elements")
        @ExcludeMissing
        fun _elements(): JsonField<List<ElementalNode>> = elements

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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
             * Returns a mutable builder for constructing an instance of [Content].
             *
             * The following fields are required:
             * ```java
             * .elements()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Content]. */
        class Builder internal constructor() {

            private var elements: JsonField<MutableList<ElementalNode>>? = null
            private var scope: JsonField<Scope> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(content: Content) = apply {
                elements = content.elements.map { it.toMutableList() }
                scope = content.scope
                version = content.version
                additionalProperties = content.additionalProperties.toMutableMap()
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

            /**
             * Alias for calling [addElement] with
             * `ElementalNode.ofTextNodeWithType(textNodeWithType)`.
             */
            fun addElement(textNodeWithType: ElementalTextNodeWithType) =
                addElement(ElementalNode.ofTextNodeWithType(textNodeWithType))

            /**
             * Alias for calling [addElement] with
             * `ElementalNode.ofMetaNodeWithType(metaNodeWithType)`.
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
             * Alias for calling [addElement] with
             * `ElementalNode.ofHtmlNodeWithType(htmlNodeWithType)`.
             */
            fun addElement(htmlNodeWithType: ElementalHtmlNodeWithType) =
                addElement(ElementalNode.ofHtmlNodeWithType(htmlNodeWithType))

            /**
             * How template variables read the data sent with the message. Under `strict`, data
             * fields are read only through the `data.` prefix, as in `{{data.name}}`. Under
             * `default`, `data` is spread onto the root, so `{{name}}` resolves and `{{data.name}}`
             * renders as an empty string. This request replaces the stored content, so omitting
             * `scope` resets it to `default`.
             */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            /**
             * Content version identifier (e.g., `2022-01-01`). Optional; server defaults when
             * omitted.
             */
            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [Content].
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
            fun build(): Content =
                Content(
                    checkRequired("elements", elements).map { it.toImmutable() },
                    scope,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Content = apply {
            if (validated) {
                return@apply
            }

            elements().forEach { it.validate() }
            scope().ifPresent { it.validate() }
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
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        /**
         * How template variables read the data sent with the message. Under `strict`, data fields
         * are read only through the `data.` prefix, as in `{{data.name}}`. Under `default`, `data`
         * is spread onto the root, so `{{name}}` resolves and `{{data.name}}` renders as an empty
         * string. This request replaces the stored content, so omitting `scope` resets it to
         * `default`.
         */
        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEFAULT,
                STRICT,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
                 */
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
                    DEFAULT -> Value.DEFAULT
                    STRICT -> Value.STRICT
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
                    DEFAULT -> Known.DEFAULT
                    STRICT -> Known.STRICT
                    else -> throw CourierInvalidDataException("Unknown Scope: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is Content &&
                elements == other.elements &&
                scope == other.scope &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(elements, scope, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Content{elements=$elements, scope=$scope, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationContentPutRequest &&
            content == other.content &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(content, state, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationContentPutRequest{content=$content, state=$state, additionalProperties=$additionalProperties}"
}
