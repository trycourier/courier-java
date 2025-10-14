// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

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

class NotificationGetContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val blocks: JsonField<List<Block>>,
    private val channels: JsonField<List<Channel>>,
    private val checksum: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("blocks") @ExcludeMissing blocks: JsonField<List<Block>> = JsonMissing.of(),
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<Channel>> = JsonMissing.of(),
        @JsonProperty("checksum") @ExcludeMissing checksum: JsonField<String> = JsonMissing.of(),
    ) : this(blocks, channels, checksum, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocks(): Optional<List<Block>> = blocks.getOptional("blocks")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<List<Channel>> = channels.getOptional("channels")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checksum(): Optional<String> = checksum.getOptional("checksum")

    /**
     * Returns the raw JSON value of [blocks].
     *
     * Unlike [blocks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocks") @ExcludeMissing fun _blocks(): JsonField<List<Block>> = blocks

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<List<Channel>> = channels

    /**
     * Returns the raw JSON value of [checksum].
     *
     * Unlike [checksum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checksum") @ExcludeMissing fun _checksum(): JsonField<String> = checksum

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

        /** Returns a mutable builder for constructing an instance of [NotificationGetContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationGetContent]. */
    class Builder internal constructor() {

        private var blocks: JsonField<MutableList<Block>>? = null
        private var channels: JsonField<MutableList<Channel>>? = null
        private var checksum: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationGetContent: NotificationGetContent) = apply {
            blocks = notificationGetContent.blocks.map { it.toMutableList() }
            channels = notificationGetContent.channels.map { it.toMutableList() }
            checksum = notificationGetContent.checksum
            additionalProperties = notificationGetContent.additionalProperties.toMutableMap()
        }

        fun blocks(blocks: List<Block>?) = blocks(JsonField.ofNullable(blocks))

        /** Alias for calling [Builder.blocks] with `blocks.orElse(null)`. */
        fun blocks(blocks: Optional<List<Block>>) = blocks(blocks.getOrNull())

        /**
         * Sets [Builder.blocks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocks] with a well-typed `List<Block>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun blocks(blocks: JsonField<List<Block>>) = apply {
            this.blocks = blocks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Block] to [blocks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlock(block: Block) = apply {
            blocks =
                (blocks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blocks", it).add(block)
                }
        }

        fun channels(channels: List<Channel>?) = channels(JsonField.ofNullable(channels))

        /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
        fun channels(channels: Optional<List<Channel>>) = channels(channels.getOrNull())

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed `List<Channel>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channels(channels: JsonField<List<Channel>>) = apply {
            this.channels = channels.map { it.toMutableList() }
        }

        /**
         * Adds a single [Channel] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: Channel) = apply {
            channels =
                (channels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channels", it).add(channel)
                }
        }

        fun checksum(checksum: String?) = checksum(JsonField.ofNullable(checksum))

        /** Alias for calling [Builder.checksum] with `checksum.orElse(null)`. */
        fun checksum(checksum: Optional<String>) = checksum(checksum.getOrNull())

        /**
         * Sets [Builder.checksum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checksum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun checksum(checksum: JsonField<String>) = apply { this.checksum = checksum }

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
         * Returns an immutable instance of [NotificationGetContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationGetContent =
            NotificationGetContent(
                (blocks ?: JsonMissing.of()).map { it.toImmutable() },
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                checksum,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationGetContent = apply {
        if (validated) {
            return@apply
        }

        blocks().ifPresent { it.forEach { it.validate() } }
        channels().ifPresent { it.forEach { it.validate() } }
        checksum()
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
        (blocks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (channels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (checksum.asKnown().isPresent) 1 else 0)

    class Block
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val type: JsonField<Type>,
        private val alias: JsonField<String>,
        private val checksum: JsonField<String>,
        private val content: JsonField<Content>,
        private val context: JsonField<String>,
        private val locales: JsonField<Locales>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("checksum")
            @ExcludeMissing
            checksum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
        ) : this(id, type, alias, checksum, content, context, locales, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alias(): Optional<String> = alias.getOptional("alias")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checksum(): Optional<String> = checksum.getOptional("checksum")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<Content> = content.getOptional("content")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<String> = context.getOptional("context")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locales(): Optional<Locales> = locales.getOptional("locales")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [alias].
         *
         * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

        /**
         * Returns the raw JSON value of [checksum].
         *
         * Unlike [checksum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checksum") @ExcludeMissing fun _checksum(): JsonField<String> = checksum

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<String> = context

        /**
         * Returns the raw JSON value of [locales].
         *
         * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

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
             * Returns a mutable builder for constructing an instance of [Block].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Block]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var alias: JsonField<String> = JsonMissing.of()
            private var checksum: JsonField<String> = JsonMissing.of()
            private var content: JsonField<Content> = JsonMissing.of()
            private var context: JsonField<String> = JsonMissing.of()
            private var locales: JsonField<Locales> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(block: Block) = apply {
                id = block.id
                type = block.type
                alias = block.alias
                checksum = block.checksum
                content = block.content
                context = block.context
                locales = block.locales
                additionalProperties = block.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun alias(alias: String?) = alias(JsonField.ofNullable(alias))

            /** Alias for calling [Builder.alias] with `alias.orElse(null)`. */
            fun alias(alias: Optional<String>) = alias(alias.getOrNull())

            /**
             * Sets [Builder.alias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alias(alias: JsonField<String>) = apply { this.alias = alias }

            fun checksum(checksum: String?) = checksum(JsonField.ofNullable(checksum))

            /** Alias for calling [Builder.checksum] with `checksum.orElse(null)`. */
            fun checksum(checksum: Optional<String>) = checksum(checksum.getOrNull())

            /**
             * Sets [Builder.checksum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checksum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checksum(checksum: JsonField<String>) = apply { this.checksum = checksum }

            fun content(content: Content?) = content(JsonField.ofNullable(content))

            /** Alias for calling [Builder.content] with `content.orElse(null)`. */
            fun content(content: Optional<Content>) = content(content.getOrNull())

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            /** Alias for calling [content] with `Content.ofString(string)`. */
            fun content(string: String) = content(Content.ofString(string))

            /**
             * Alias for calling [content] with
             * `Content.ofNotificationContentHierarchy(notificationContentHierarchy)`.
             */
            fun content(notificationContentHierarchy: Content.NotificationContentHierarchy) =
                content(Content.ofNotificationContentHierarchy(notificationContentHierarchy))

            fun context(context: String?) = context(JsonField.ofNullable(context))

            /** Alias for calling [Builder.context] with `context.orElse(null)`. */
            fun context(context: Optional<String>) = context(context.getOrNull())

            /**
             * Sets [Builder.context] to an arbitrary JSON value.
             *
             * You should usually call [Builder.context] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<String>) = apply { this.context = context }

            fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

            /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
            fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

            /**
             * Sets [Builder.locales] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locales] with a well-typed [Locales] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

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
             * Returns an immutable instance of [Block].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Block =
                Block(
                    checkRequired("id", id),
                    checkRequired("type", type),
                    alias,
                    checksum,
                    content,
                    context,
                    locales,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Block = apply {
            if (validated) {
                return@apply
            }

            id()
            type().validate()
            alias()
            checksum()
            content().ifPresent { it.validate() }
            context()
            locales().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (alias.asKnown().isPresent) 1 else 0) +
                (if (checksum.asKnown().isPresent) 1 else 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                (if (context.asKnown().isPresent) 1 else 0) +
                (locales.asKnown().getOrNull()?.validity() ?: 0)

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

                @JvmField val DIVIDER = of("divider")

                @JvmField val IMAGE = of("image")

                @JvmField val JSONNET = of("jsonnet")

                @JvmField val LIST = of("list")

                @JvmField val MARKDOWN = of("markdown")

                @JvmField val QUOTE = of("quote")

                @JvmField val TEMPLATE = of("template")

                @JvmField val TEXT = of("text")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACTION,
                DIVIDER,
                IMAGE,
                JSONNET,
                LIST,
                MARKDOWN,
                QUOTE,
                TEMPLATE,
                TEXT,
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
                DIVIDER,
                IMAGE,
                JSONNET,
                LIST,
                MARKDOWN,
                QUOTE,
                TEMPLATE,
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
                    ACTION -> Value.ACTION
                    DIVIDER -> Value.DIVIDER
                    IMAGE -> Value.IMAGE
                    JSONNET -> Value.JSONNET
                    LIST -> Value.LIST
                    MARKDOWN -> Value.MARKDOWN
                    QUOTE -> Value.QUOTE
                    TEMPLATE -> Value.TEMPLATE
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
                    ACTION -> Known.ACTION
                    DIVIDER -> Known.DIVIDER
                    IMAGE -> Known.IMAGE
                    JSONNET -> Known.JSONNET
                    LIST -> Known.LIST
                    MARKDOWN -> Known.MARKDOWN
                    QUOTE -> Known.QUOTE
                    TEMPLATE -> Known.TEMPLATE
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

        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val string: String? = null,
            private val notificationContentHierarchy: NotificationContentHierarchy? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun notificationContentHierarchy(): Optional<NotificationContentHierarchy> =
                Optional.ofNullable(notificationContentHierarchy)

            fun isString(): Boolean = string != null

            fun isNotificationContentHierarchy(): Boolean = notificationContentHierarchy != null

            fun asString(): String = string.getOrThrow("string")

            fun asNotificationContentHierarchy(): NotificationContentHierarchy =
                notificationContentHierarchy.getOrThrow("notificationContentHierarchy")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    notificationContentHierarchy != null ->
                        visitor.visitNotificationContentHierarchy(notificationContentHierarchy)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitNotificationContentHierarchy(
                            notificationContentHierarchy: NotificationContentHierarchy
                        ) {
                            notificationContentHierarchy.validate()
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
                        override fun visitString(string: String) = 1

                        override fun visitNotificationContentHierarchy(
                            notificationContentHierarchy: NotificationContentHierarchy
                        ) = notificationContentHierarchy.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    string == other.string &&
                    notificationContentHierarchy == other.notificationContentHierarchy
            }

            override fun hashCode(): Int = Objects.hash(string, notificationContentHierarchy)

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    notificationContentHierarchy != null ->
                        "Content{notificationContentHierarchy=$notificationContentHierarchy}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = Content(string = string)

                @JvmStatic
                fun ofNotificationContentHierarchy(
                    notificationContentHierarchy: NotificationContentHierarchy
                ) = Content(notificationContentHierarchy = notificationContentHierarchy)
            }

            /**
             * An interface that defines how to map each variant of [Content] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitNotificationContentHierarchy(
                    notificationContentHierarchy: NotificationContentHierarchy
                ): T

                /**
                 * Maps an unknown variant of [Content] to a value of type [T].
                 *
                 * An instance of [Content] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
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
                                tryDeserialize(node, jacksonTypeRef<NotificationContentHierarchy>())
                                    ?.let {
                                        Content(notificationContentHierarchy = it, _json = json)
                                    },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Content(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from array).
                        0 -> Content(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
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
                        value.string != null -> generator.writeObject(value.string)
                        value.notificationContentHierarchy != null ->
                            generator.writeObject(value.notificationContentHierarchy)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            class NotificationContentHierarchy
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val children: JsonField<String>,
                private val parent: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("children")
                    @ExcludeMissing
                    children: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parent")
                    @ExcludeMissing
                    parent: JsonField<String> = JsonMissing.of(),
                ) : this(children, parent, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun children(): Optional<String> = children.getOptional("children")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun parent(): Optional<String> = parent.getOptional("parent")

                /**
                 * Returns the raw JSON value of [children].
                 *
                 * Unlike [children], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("children")
                @ExcludeMissing
                fun _children(): JsonField<String> = children

                /**
                 * Returns the raw JSON value of [parent].
                 *
                 * Unlike [parent], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<String> = parent

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
                     * [NotificationContentHierarchy].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NotificationContentHierarchy]. */
                class Builder internal constructor() {

                    private var children: JsonField<String> = JsonMissing.of()
                    private var parent: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(notificationContentHierarchy: NotificationContentHierarchy) =
                        apply {
                            children = notificationContentHierarchy.children
                            parent = notificationContentHierarchy.parent
                            additionalProperties =
                                notificationContentHierarchy.additionalProperties.toMutableMap()
                        }

                    fun children(children: String?) = children(JsonField.ofNullable(children))

                    /** Alias for calling [Builder.children] with `children.orElse(null)`. */
                    fun children(children: Optional<String>) = children(children.getOrNull())

                    /**
                     * Sets [Builder.children] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.children] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun children(children: JsonField<String>) = apply { this.children = children }

                    fun parent(parent: String?) = parent(JsonField.ofNullable(parent))

                    /** Alias for calling [Builder.parent] with `parent.orElse(null)`. */
                    fun parent(parent: Optional<String>) = parent(parent.getOrNull())

                    /**
                     * Sets [Builder.parent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parent] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [NotificationContentHierarchy].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): NotificationContentHierarchy =
                        NotificationContentHierarchy(
                            children,
                            parent,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): NotificationContentHierarchy = apply {
                    if (validated) {
                        return@apply
                    }

                    children()
                    parent()
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
                    (if (children.asKnown().isPresent) 1 else 0) +
                        (if (parent.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NotificationContentHierarchy &&
                        children == other.children &&
                        parent == other.parent &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(children, parent, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NotificationContentHierarchy{children=$children, parent=$parent, additionalProperties=$additionalProperties}"
            }
        }

        class Locales
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

                /** Returns a mutable builder for constructing an instance of [Locales]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Locales]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(locales: Locales) = apply {
                    additionalProperties = locales.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Locales].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Locales = Locales(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Locales = apply {
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

                return other is Locales && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Locales{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Block &&
                id == other.id &&
                type == other.type &&
                alias == other.alias &&
                checksum == other.checksum &&
                content == other.content &&
                context == other.context &&
                locales == other.locales &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, type, alias, checksum, content, context, locales, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Block{id=$id, type=$type, alias=$alias, checksum=$checksum, content=$content, context=$context, locales=$locales, additionalProperties=$additionalProperties}"
    }

    class Channel
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val checksum: JsonField<String>,
        private val content: JsonField<Content>,
        private val locales: JsonField<Locales>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("checksum")
            @ExcludeMissing
            checksum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(id, checksum, content, locales, type, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checksum(): Optional<String> = checksum.getOptional("checksum")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<Content> = content.getOptional("content")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locales(): Optional<Locales> = locales.getOptional("locales")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [checksum].
         *
         * Unlike [checksum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checksum") @ExcludeMissing fun _checksum(): JsonField<String> = checksum

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        /**
         * Returns the raw JSON value of [locales].
         *
         * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [Channel].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Channel]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var checksum: JsonField<String> = JsonMissing.of()
            private var content: JsonField<Content> = JsonMissing.of()
            private var locales: JsonField<Locales> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(channel: Channel) = apply {
                id = channel.id
                checksum = channel.checksum
                content = channel.content
                locales = channel.locales
                type = channel.type
                additionalProperties = channel.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun checksum(checksum: String?) = checksum(JsonField.ofNullable(checksum))

            /** Alias for calling [Builder.checksum] with `checksum.orElse(null)`. */
            fun checksum(checksum: Optional<String>) = checksum(checksum.getOrNull())

            /**
             * Sets [Builder.checksum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checksum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checksum(checksum: JsonField<String>) = apply { this.checksum = checksum }

            fun content(content: Content?) = content(JsonField.ofNullable(content))

            /** Alias for calling [Builder.content] with `content.orElse(null)`. */
            fun content(content: Optional<Content>) = content(content.getOrNull())

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

            /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
            fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

            /**
             * Sets [Builder.locales] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locales] with a well-typed [Locales] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

            fun type(type: String?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<String>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Channel].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Channel =
                Channel(
                    checkRequired("id", id),
                    checksum,
                    content,
                    locales,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Channel = apply {
            if (validated) {
                return@apply
            }

            id()
            checksum()
            content().ifPresent { it.validate() }
            locales().ifPresent { it.validate() }
            type()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (checksum.asKnown().isPresent) 1 else 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                (locales.asKnown().getOrNull()?.validity() ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        class Content
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val subject: JsonField<String>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subject")
                @ExcludeMissing
                subject: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(subject, title, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subject(): Optional<String> = subject.getOptional("subject")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [subject].
             *
             * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

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

                /** Returns a mutable builder for constructing an instance of [Content]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Content]. */
            class Builder internal constructor() {

                private var subject: JsonField<String> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(content: Content) = apply {
                    subject = content.subject
                    title = content.title
                    additionalProperties = content.additionalProperties.toMutableMap()
                }

                fun subject(subject: String?) = subject(JsonField.ofNullable(subject))

                /** Alias for calling [Builder.subject] with `subject.orElse(null)`. */
                fun subject(subject: Optional<String>) = subject(subject.getOrNull())

                /**
                 * Sets [Builder.subject] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subject] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subject(subject: JsonField<String>) = apply { this.subject = subject }

                fun title(title: String?) = title(JsonField.ofNullable(title))

                /** Alias for calling [Builder.title] with `title.orElse(null)`. */
                fun title(title: Optional<String>) = title(title.getOrNull())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Content].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Content = Content(subject, title, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                subject()
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
                (if (subject.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    subject == other.subject &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(subject, title, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Content{subject=$subject, title=$title, additionalProperties=$additionalProperties}"
        }

        class Locales
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

                /** Returns a mutable builder for constructing an instance of [Locales]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Locales]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(locales: Locales) = apply {
                    additionalProperties = locales.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Locales].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Locales = Locales(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Locales = apply {
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

                return other is Locales && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Locales{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Channel &&
                id == other.id &&
                checksum == other.checksum &&
                content == other.content &&
                locales == other.locales &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, checksum, content, locales, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Channel{id=$id, checksum=$checksum, content=$content, locales=$locales, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationGetContent &&
            blocks == other.blocks &&
            channels == other.channels &&
            checksum == other.checksum &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(blocks, channels, checksum, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationGetContent{blocks=$blocks, channels=$channels, checksum=$checksum, additionalProperties=$additionalProperties}"
}
