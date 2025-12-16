// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.checkRequired
import com.courier.core.getOrThrow
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ElementalContent
import com.courier.models.ElementalContentSugar
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
 * Bulk message definition. Supports two formats:
 * - V1 format: Requires `event` field (event ID or notification ID)
 * - V2 format: Optionally use `template` (notification ID) or `content` (Elemental content) in
 *   addition to `event`
 */
class InboundBulkMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val event: JsonField<String>,
    private val brand: JsonField<String>,
    private val content: JsonField<Content>,
    private val data: JsonField<Data>,
    private val locale: JsonField<Locale>,
    private val override: JsonField<Override>,
    private val template: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<Locale> = JsonMissing.of(),
        @JsonProperty("override") @ExcludeMissing override: JsonField<Override> = JsonMissing.of(),
        @JsonProperty("template") @ExcludeMissing template: JsonField<String> = JsonMissing.of(),
    ) : this(event, brand, content, data, locale, override, template, mutableMapOf())

    /**
     * Event ID or Notification ID (required). Can be either a Notification ID (e.g.,
     * "FRH3QXM9E34W4RKP7MRC8NZ1T8V8") or a custom Event ID (e.g., "welcome-email") mapped to a
     * notification.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun event(): String = event.getRequired("event")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<String> = brand.getOptional("brand")

    /**
     * Elemental content (optional, for V2 format). When provided, this will be used instead of the
     * notification associated with the `event` field.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<Content> = content.getOptional("content")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<Locale> = locale.getOptional("locale")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun override(): Optional<Override> = override.getOptional("override")

    /**
     * Notification ID or template ID (optional, for V2 format). When provided, this will be used
     * instead of the notification associated with the `event` field.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun template(): Optional<String> = template.getOptional("template")

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<Locale> = locale

    /**
     * Returns the raw JSON value of [override].
     *
     * Unlike [override], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("override") @ExcludeMissing fun _override(): JsonField<Override> = override

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

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
         * Returns a mutable builder for constructing an instance of [InboundBulkMessage].
         *
         * The following fields are required:
         * ```java
         * .event()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundBulkMessage]. */
    class Builder internal constructor() {

        private var event: JsonField<String>? = null
        private var brand: JsonField<String> = JsonMissing.of()
        private var content: JsonField<Content> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var locale: JsonField<Locale> = JsonMissing.of()
        private var override: JsonField<Override> = JsonMissing.of()
        private var template: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundBulkMessage: InboundBulkMessage) = apply {
            event = inboundBulkMessage.event
            brand = inboundBulkMessage.brand
            content = inboundBulkMessage.content
            data = inboundBulkMessage.data
            locale = inboundBulkMessage.locale
            override = inboundBulkMessage.override
            template = inboundBulkMessage.template
            additionalProperties = inboundBulkMessage.additionalProperties.toMutableMap()
        }

        /**
         * Event ID or Notification ID (required). Can be either a Notification ID (e.g.,
         * "FRH3QXM9E34W4RKP7MRC8NZ1T8V8") or a custom Event ID (e.g., "welcome-email") mapped to a
         * notification.
         */
        fun event(event: String) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<String>) = apply { this.event = event }

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

        /**
         * Elemental content (optional, for V2 format). When provided, this will be used instead of
         * the notification associated with the `event` field.
         */
        fun content(content: Content?) = content(JsonField.ofNullable(content))

        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
        fun content(content: Optional<Content>) = content(content.getOrNull())

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [Content] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<Content>) = apply { this.content = content }

        /**
         * Alias for calling [content] with
         * `Content.ofElementalContentSugar(elementalContentSugar)`.
         */
        fun content(elementalContentSugar: ElementalContentSugar) =
            content(Content.ofElementalContentSugar(elementalContentSugar))

        /** Alias for calling [content] with `Content.ofElemental(elemental)`. */
        fun content(elemental: ElementalContent) = content(Content.ofElemental(elemental))

        fun data(data: Data?) = data(JsonField.ofNullable(data))

        /** Alias for calling [Builder.data] with `data.orElse(null)`. */
        fun data(data: Optional<Data>) = data(data.getOrNull())

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun locale(locale: Locale?) = locale(JsonField.ofNullable(locale))

        /** Alias for calling [Builder.locale] with `locale.orElse(null)`. */
        fun locale(locale: Optional<Locale>) = locale(locale.getOrNull())

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [Locale] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<Locale>) = apply { this.locale = locale }

        fun override(override: Override?) = override(JsonField.ofNullable(override))

        /** Alias for calling [Builder.override] with `override.orElse(null)`. */
        fun override(override: Optional<Override>) = override(override.getOrNull())

        /**
         * Sets [Builder.override] to an arbitrary JSON value.
         *
         * You should usually call [Builder.override] with a well-typed [Override] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun override(override: JsonField<Override>) = apply { this.override = override }

        /**
         * Notification ID or template ID (optional, for V2 format). When provided, this will be
         * used instead of the notification associated with the `event` field.
         */
        fun template(template: String?) = template(JsonField.ofNullable(template))

        /** Alias for calling [Builder.template] with `template.orElse(null)`. */
        fun template(template: Optional<String>) = template(template.getOrNull())

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun template(template: JsonField<String>) = apply { this.template = template }

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
         * Returns an immutable instance of [InboundBulkMessage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .event()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundBulkMessage =
            InboundBulkMessage(
                checkRequired("event", event),
                brand,
                content,
                data,
                locale,
                override,
                template,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundBulkMessage = apply {
        if (validated) {
            return@apply
        }

        event()
        brand()
        content().ifPresent { it.validate() }
        data().ifPresent { it.validate() }
        locale().ifPresent { it.validate() }
        override().ifPresent { it.validate() }
        template()
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
        (if (event.asKnown().isPresent) 1 else 0) +
            (if (brand.asKnown().isPresent) 1 else 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (locale.asKnown().getOrNull()?.validity() ?: 0) +
            (override.asKnown().getOrNull()?.validity() ?: 0) +
            (if (template.asKnown().isPresent) 1 else 0)

    /**
     * Elemental content (optional, for V2 format). When provided, this will be used instead of the
     * notification associated with the `event` field.
     */
    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val elementalContentSugar: ElementalContentSugar? = null,
        private val elemental: ElementalContent? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Syntactic sugar to provide a fast shorthand for Courier Elemental Blocks. */
        fun elementalContentSugar(): Optional<ElementalContentSugar> =
            Optional.ofNullable(elementalContentSugar)

        fun elemental(): Optional<ElementalContent> = Optional.ofNullable(elemental)

        fun isElementalContentSugar(): Boolean = elementalContentSugar != null

        fun isElemental(): Boolean = elemental != null

        /** Syntactic sugar to provide a fast shorthand for Courier Elemental Blocks. */
        fun asElementalContentSugar(): ElementalContentSugar =
            elementalContentSugar.getOrThrow("elementalContentSugar")

        fun asElemental(): ElementalContent = elemental.getOrThrow("elemental")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                elementalContentSugar != null ->
                    visitor.visitElementalContentSugar(elementalContentSugar)
                elemental != null -> visitor.visitElemental(elemental)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Content = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitElementalContentSugar(
                        elementalContentSugar: ElementalContentSugar
                    ) {
                        elementalContentSugar.validate()
                    }

                    override fun visitElemental(elemental: ElementalContent) {
                        elemental.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitElementalContentSugar(
                        elementalContentSugar: ElementalContentSugar
                    ) = elementalContentSugar.validity()

                    override fun visitElemental(elemental: ElementalContent) = elemental.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Content &&
                elementalContentSugar == other.elementalContentSugar &&
                elemental == other.elemental
        }

        override fun hashCode(): Int = Objects.hash(elementalContentSugar, elemental)

        override fun toString(): String =
            when {
                elementalContentSugar != null ->
                    "Content{elementalContentSugar=$elementalContentSugar}"
                elemental != null -> "Content{elemental=$elemental}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }

        companion object {

            /** Syntactic sugar to provide a fast shorthand for Courier Elemental Blocks. */
            @JvmStatic
            fun ofElementalContentSugar(elementalContentSugar: ElementalContentSugar) =
                Content(elementalContentSugar = elementalContentSugar)

            @JvmStatic fun ofElemental(elemental: ElementalContent) = Content(elemental = elemental)
        }

        /**
         * An interface that defines how to map each variant of [Content] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Syntactic sugar to provide a fast shorthand for Courier Elemental Blocks. */
            fun visitElementalContentSugar(elementalContentSugar: ElementalContentSugar): T

            fun visitElemental(elemental: ElementalContent): T

            /**
             * Maps an unknown variant of [Content] to a value of type [T].
             *
             * An instance of [Content] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
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
                            tryDeserialize(node, jacksonTypeRef<ElementalContentSugar>())?.let {
                                Content(elementalContentSugar = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ElementalContent>())?.let {
                                Content(elemental = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Content(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
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
                    value.elementalContentSugar != null ->
                        generator.writeObject(value.elementalContentSugar)
                    value.elemental != null -> generator.writeObject(value.elemental)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
                }
            }
        }
    }

    class Data
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    class Locale
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Locale]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Locale]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(locale: Locale) = apply {
                additionalProperties = locale.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Locale].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Locale = Locale(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Locale = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Locale && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Locale{additionalProperties=$additionalProperties}"
    }

    class Override
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Override]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Override]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                additionalProperties = override.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Override].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Override = Override(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Override = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Override && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Override{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundBulkMessage &&
            event == other.event &&
            brand == other.brand &&
            content == other.content &&
            data == other.data &&
            locale == other.locale &&
            override == other.override &&
            template == other.template &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(event, brand, content, data, locale, override, template, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundBulkMessage{event=$event, brand=$brand, content=$content, data=$data, locale=$locale, override=$override, template=$template, additionalProperties=$additionalProperties}"
}
