// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkRequired
import com.courier.api.core.getOrThrow
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.Content
import com.courier.api.models.send.MessageContext
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

class InboundBulkMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brand: JsonField<String>,
    private val data: JsonField<Data>,
    private val event: JsonField<String>,
    private val locale: JsonField<Locale>,
    private val message: JsonField<Message>,
    private val override: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<Locale> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
        @JsonProperty("override") @ExcludeMissing override: JsonValue = JsonMissing.of(),
    ) : this(brand, data, event, locale, message, override, mutableMapOf())

    /**
     * A unique identifier that represents the brand that should be used for rendering the
     * notification.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<String> = brand.getOptional("brand")

    /**
     * JSON that includes any data you want to pass to a message template. The data will populate
     * the corresponding template variables.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun event(): Optional<String> = event.getOptional("event")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<Locale> = locale.getOptional("locale")

    /**
     * Describes the content of the message in a way that will work for email, push, chat, or any
     * channel.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<Message> = message.getOptional("message")

    /**
     * JSON that is merged into the request sent by Courier to the provider to override properties
     * or to gain access to features in the provider API that are not natively supported by Courier.
     */
    @JsonProperty("override") @ExcludeMissing fun _override(): JsonValue = override

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<Locale> = locale

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

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

        /** Returns a mutable builder for constructing an instance of [InboundBulkMessage]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundBulkMessage]. */
    class Builder internal constructor() {

        private var brand: JsonField<String> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var event: JsonField<String> = JsonMissing.of()
        private var locale: JsonField<Locale> = JsonMissing.of()
        private var message: JsonField<Message> = JsonMissing.of()
        private var override: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundBulkMessage: InboundBulkMessage) = apply {
            brand = inboundBulkMessage.brand
            data = inboundBulkMessage.data
            event = inboundBulkMessage.event
            locale = inboundBulkMessage.locale
            message = inboundBulkMessage.message
            override = inboundBulkMessage.override
            additionalProperties = inboundBulkMessage.additionalProperties.toMutableMap()
        }

        /**
         * A unique identifier that represents the brand that should be used for rendering the
         * notification.
         */
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
         * JSON that includes any data you want to pass to a message template. The data will
         * populate the corresponding template variables.
         */
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

        fun event(event: String?) = event(JsonField.ofNullable(event))

        /** Alias for calling [Builder.event] with `event.orElse(null)`. */
        fun event(event: Optional<String>) = event(event.getOrNull())

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<String>) = apply { this.event = event }

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

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel.
         */
        fun message(message: Message?) = message(JsonField.ofNullable(message))

        /** Alias for calling [Builder.message] with `message.orElse(null)`. */
        fun message(message: Optional<Message>) = message(message.getOrNull())

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [Message] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<Message>) = apply { this.message = message }

        /**
         * Alias for calling [message] with `Message.ofInboundBulkTemplate(inboundBulkTemplate)`.
         */
        fun message(inboundBulkTemplate: Message.InboundBulkTemplateMessage) =
            message(Message.ofInboundBulkTemplate(inboundBulkTemplate))

        /** Alias for calling [message] with `Message.ofInboundBulkContent(inboundBulkContent)`. */
        fun message(inboundBulkContent: Message.InboundBulkContentMessage) =
            message(Message.ofInboundBulkContent(inboundBulkContent))

        /**
         * JSON that is merged into the request sent by Courier to the provider to override
         * properties or to gain access to features in the provider API that are not natively
         * supported by Courier.
         */
        fun override(override: JsonValue) = apply { this.override = override }

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
         */
        fun build(): InboundBulkMessage =
            InboundBulkMessage(
                brand,
                data,
                event,
                locale,
                message,
                override,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundBulkMessage = apply {
        if (validated) {
            return@apply
        }

        brand()
        data().ifPresent { it.validate() }
        event()
        locale().ifPresent { it.validate() }
        message().ifPresent { it.validate() }
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
        (if (brand.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (event.asKnown().isPresent) 1 else 0) +
            (locale.asKnown().getOrNull()?.validity() ?: 0) +
            (message.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * JSON that includes any data you want to pass to a message template. The data will populate
     * the corresponding template variables.
     */
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

    /**
     * Describes the content of the message in a way that will work for email, push, chat, or any
     * channel.
     */
    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val inboundBulkTemplate: InboundBulkTemplateMessage? = null,
        private val inboundBulkContent: InboundBulkContentMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel.
         */
        fun inboundBulkTemplate(): Optional<InboundBulkTemplateMessage> =
            Optional.ofNullable(inboundBulkTemplate)

        /**
         * A template for a type of message that can be sent more than once. For example, you might
         * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
         */
        fun inboundBulkContent(): Optional<InboundBulkContentMessage> =
            Optional.ofNullable(inboundBulkContent)

        fun isInboundBulkTemplate(): Boolean = inboundBulkTemplate != null

        fun isInboundBulkContent(): Boolean = inboundBulkContent != null

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel.
         */
        fun asInboundBulkTemplate(): InboundBulkTemplateMessage =
            inboundBulkTemplate.getOrThrow("inboundBulkTemplate")

        /**
         * A template for a type of message that can be sent more than once. For example, you might
         * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
         */
        fun asInboundBulkContent(): InboundBulkContentMessage =
            inboundBulkContent.getOrThrow("inboundBulkContent")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                inboundBulkTemplate != null -> visitor.visitInboundBulkTemplate(inboundBulkTemplate)
                inboundBulkContent != null -> visitor.visitInboundBulkContent(inboundBulkContent)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInboundBulkTemplate(
                        inboundBulkTemplate: InboundBulkTemplateMessage
                    ) {
                        inboundBulkTemplate.validate()
                    }

                    override fun visitInboundBulkContent(
                        inboundBulkContent: InboundBulkContentMessage
                    ) {
                        inboundBulkContent.validate()
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
                    override fun visitInboundBulkTemplate(
                        inboundBulkTemplate: InboundBulkTemplateMessage
                    ) = inboundBulkTemplate.validity()

                    override fun visitInboundBulkContent(
                        inboundBulkContent: InboundBulkContentMessage
                    ) = inboundBulkContent.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                inboundBulkTemplate == other.inboundBulkTemplate &&
                inboundBulkContent == other.inboundBulkContent
        }

        override fun hashCode(): Int = Objects.hash(inboundBulkTemplate, inboundBulkContent)

        override fun toString(): String =
            when {
                inboundBulkTemplate != null -> "Message{inboundBulkTemplate=$inboundBulkTemplate}"
                inboundBulkContent != null -> "Message{inboundBulkContent=$inboundBulkContent}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            /**
             * Describes the content of the message in a way that will work for email, push, chat,
             * or any channel.
             */
            @JvmStatic
            fun ofInboundBulkTemplate(inboundBulkTemplate: InboundBulkTemplateMessage) =
                Message(inboundBulkTemplate = inboundBulkTemplate)

            /**
             * A template for a type of message that can be sent more than once. For example, you
             * might create an "Appointment Reminder" Notification or “Reset Password”
             * Notifications.
             */
            @JvmStatic
            fun ofInboundBulkContent(inboundBulkContent: InboundBulkContentMessage) =
                Message(inboundBulkContent = inboundBulkContent)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Describes the content of the message in a way that will work for email, push, chat,
             * or any channel.
             */
            fun visitInboundBulkTemplate(inboundBulkTemplate: InboundBulkTemplateMessage): T

            /**
             * A template for a type of message that can be sent more than once. For example, you
             * might create an "Appointment Reminder" Notification or “Reset Password”
             * Notifications.
             */
            fun visitInboundBulkContent(inboundBulkContent: InboundBulkContentMessage): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws CourierInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CourierInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<InboundBulkTemplateMessage>())
                                ?.let { Message(inboundBulkTemplate = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<InboundBulkContentMessage>())?.let {
                                Message(inboundBulkContent = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Message(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.inboundBulkTemplate != null ->
                        generator.writeObject(value.inboundBulkTemplate)
                    value.inboundBulkContent != null ->
                        generator.writeObject(value.inboundBulkContent)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel.
         */
        class InboundBulkTemplateMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val brandId: JsonField<String>,
            private val channels: JsonField<BaseMessage.Channels>,
            private val context: JsonField<MessageContext>,
            private val data: JsonField<BaseMessage.Data>,
            private val delay: JsonField<BaseMessage.Delay>,
            private val expiry: JsonField<BaseMessage.Expiry>,
            private val metadata: JsonField<BaseMessage.Metadata>,
            private val preferences: JsonField<BaseMessage.Preferences>,
            private val providers: JsonField<BaseMessage.Providers>,
            private val routing: JsonField<BaseMessage.Routing>,
            private val timeout: JsonField<BaseMessage.Timeout>,
            private val template: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("channels")
                @ExcludeMissing
                channels: JsonField<BaseMessage.Channels> = JsonMissing.of(),
                @JsonProperty("context")
                @ExcludeMissing
                context: JsonField<MessageContext> = JsonMissing.of(),
                @JsonProperty("data")
                @ExcludeMissing
                data: JsonField<BaseMessage.Data> = JsonMissing.of(),
                @JsonProperty("delay")
                @ExcludeMissing
                delay: JsonField<BaseMessage.Delay> = JsonMissing.of(),
                @JsonProperty("expiry")
                @ExcludeMissing
                expiry: JsonField<BaseMessage.Expiry> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<BaseMessage.Metadata> = JsonMissing.of(),
                @JsonProperty("preferences")
                @ExcludeMissing
                preferences: JsonField<BaseMessage.Preferences> = JsonMissing.of(),
                @JsonProperty("providers")
                @ExcludeMissing
                providers: JsonField<BaseMessage.Providers> = JsonMissing.of(),
                @JsonProperty("routing")
                @ExcludeMissing
                routing: JsonField<BaseMessage.Routing> = JsonMissing.of(),
                @JsonProperty("timeout")
                @ExcludeMissing
                timeout: JsonField<BaseMessage.Timeout> = JsonMissing.of(),
                @JsonProperty("template")
                @ExcludeMissing
                template: JsonField<String> = JsonMissing.of(),
            ) : this(
                brandId,
                channels,
                context,
                data,
                delay,
                expiry,
                metadata,
                preferences,
                providers,
                routing,
                timeout,
                template,
                mutableMapOf(),
            )

            fun toBaseMessage(): BaseMessage =
                BaseMessage.builder()
                    .brandId(brandId)
                    .channels(channels)
                    .context(context)
                    .data(data)
                    .delay(delay)
                    .expiry(expiry)
                    .metadata(metadata)
                    .preferences(preferences)
                    .providers(providers)
                    .routing(routing)
                    .timeout(timeout)
                    .build()

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun brandId(): Optional<String> = brandId.getOptional("brand_id")

            /**
             * "Define run-time configuration for one or more channels. If you don't specify
             * channels, the default configuration for each channel will be used. Valid ChannelId's
             * are: email, sms, push, inbox, direct_message, banner, and webhook."
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun channels(): Optional<BaseMessage.Channels> = channels.getOptional("channels")

            /**
             * Context to load with this recipient. Will override any context set on
             * message.context.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun context(): Optional<MessageContext> = context.getOptional("context")

            /**
             * An arbitrary object that includes any data you want to pass to the message. The data
             * will populate the corresponding template or elements variables.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun data(): Optional<BaseMessage.Data> = data.getOptional("data")

            /**
             * Defines the time to wait before delivering the message. You can specify one of the
             * following options. Duration with the number of milliseconds to delay. Until with an
             * ISO 8601 timestamp that specifies when it should be delivered. Until with an
             * OpenStreetMap opening_hours-like format that specifies the
             * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
             * (e.g., 'Mo-Fr 08:00-18:00pm')
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun delay(): Optional<BaseMessage.Delay> = delay.getOptional("delay")

            /**
             * "Expiry allows you to set an absolute or relative time in which a message expires.
             * Note: This is only valid for the Courier Inbox channel as of 12-08-2022."
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expiry(): Optional<BaseMessage.Expiry> = expiry.getOptional("expiry")

            /**
             * Metadata such as utm tracking attached with the notification through this channel.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<BaseMessage.Metadata> = metadata.getOptional("metadata")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preferences(): Optional<BaseMessage.Preferences> =
                preferences.getOptional("preferences")

            /**
             * An object whose keys are valid provider identifiers which map to an object.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun providers(): Optional<BaseMessage.Providers> = providers.getOptional("providers")

            /**
             * Allows you to customize which channel(s) Courier will potentially deliver the
             * message. If no routing key is specified, Courier will use the default routing
             * configuration or routing defined by the template.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routing(): Optional<BaseMessage.Routing> = routing.getOptional("routing")

            /**
             * Time in ms to attempt the channel before failing over to the next available channel.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout(): Optional<BaseMessage.Timeout> = timeout.getOptional("timeout")

            /**
             * The id of the notification template to be rendered and sent to the recipient(s). This
             * field or the content field must be supplied.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun template(): String = template.getRequired("template")

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [channels].
             *
             * Unlike [channels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("channels")
            @ExcludeMissing
            fun _channels(): JsonField<BaseMessage.Channels> = channels

            /**
             * Returns the raw JSON value of [context].
             *
             * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("context")
            @ExcludeMissing
            fun _context(): JsonField<MessageContext> = context

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<BaseMessage.Data> = data

            /**
             * Returns the raw JSON value of [delay].
             *
             * Unlike [delay], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("delay")
            @ExcludeMissing
            fun _delay(): JsonField<BaseMessage.Delay> = delay

            /**
             * Returns the raw JSON value of [expiry].
             *
             * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("expiry")
            @ExcludeMissing
            fun _expiry(): JsonField<BaseMessage.Expiry> = expiry

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<BaseMessage.Metadata> = metadata

            /**
             * Returns the raw JSON value of [preferences].
             *
             * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("preferences")
            @ExcludeMissing
            fun _preferences(): JsonField<BaseMessage.Preferences> = preferences

            /**
             * Returns the raw JSON value of [providers].
             *
             * Unlike [providers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("providers")
            @ExcludeMissing
            fun _providers(): JsonField<BaseMessage.Providers> = providers

            /**
             * Returns the raw JSON value of [routing].
             *
             * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routing")
            @ExcludeMissing
            fun _routing(): JsonField<BaseMessage.Routing> = routing

            /**
             * Returns the raw JSON value of [timeout].
             *
             * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("timeout")
            @ExcludeMissing
            fun _timeout(): JsonField<BaseMessage.Timeout> = timeout

            /**
             * Returns the raw JSON value of [template].
             *
             * Unlike [template], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [InboundBulkTemplateMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .template()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboundBulkTemplateMessage]. */
            class Builder internal constructor() {

                private var brandId: JsonField<String> = JsonMissing.of()
                private var channels: JsonField<BaseMessage.Channels> = JsonMissing.of()
                private var context: JsonField<MessageContext> = JsonMissing.of()
                private var data: JsonField<BaseMessage.Data> = JsonMissing.of()
                private var delay: JsonField<BaseMessage.Delay> = JsonMissing.of()
                private var expiry: JsonField<BaseMessage.Expiry> = JsonMissing.of()
                private var metadata: JsonField<BaseMessage.Metadata> = JsonMissing.of()
                private var preferences: JsonField<BaseMessage.Preferences> = JsonMissing.of()
                private var providers: JsonField<BaseMessage.Providers> = JsonMissing.of()
                private var routing: JsonField<BaseMessage.Routing> = JsonMissing.of()
                private var timeout: JsonField<BaseMessage.Timeout> = JsonMissing.of()
                private var template: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundBulkTemplateMessage: InboundBulkTemplateMessage) = apply {
                    brandId = inboundBulkTemplateMessage.brandId
                    channels = inboundBulkTemplateMessage.channels
                    context = inboundBulkTemplateMessage.context
                    data = inboundBulkTemplateMessage.data
                    delay = inboundBulkTemplateMessage.delay
                    expiry = inboundBulkTemplateMessage.expiry
                    metadata = inboundBulkTemplateMessage.metadata
                    preferences = inboundBulkTemplateMessage.preferences
                    providers = inboundBulkTemplateMessage.providers
                    routing = inboundBulkTemplateMessage.routing
                    timeout = inboundBulkTemplateMessage.timeout
                    template = inboundBulkTemplateMessage.template
                    additionalProperties =
                        inboundBulkTemplateMessage.additionalProperties.toMutableMap()
                }

                fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

                /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
                fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /**
                 * "Define run-time configuration for one or more channels. If you don't specify
                 * channels, the default configuration for each channel will be used. Valid
                 * ChannelId's are: email, sms, push, inbox, direct_message, banner, and webhook."
                 */
                fun channels(channels: BaseMessage.Channels?) =
                    channels(JsonField.ofNullable(channels))

                /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
                fun channels(channels: Optional<BaseMessage.Channels>) =
                    channels(channels.getOrNull())

                /**
                 * Sets [Builder.channels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channels] with a well-typed
                 * [BaseMessage.Channels] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun channels(channels: JsonField<BaseMessage.Channels>) = apply {
                    this.channels = channels
                }

                /**
                 * Context to load with this recipient. Will override any context set on
                 * message.context.
                 */
                fun context(context: MessageContext?) = context(JsonField.ofNullable(context))

                /** Alias for calling [Builder.context] with `context.orElse(null)`. */
                fun context(context: Optional<MessageContext>) = context(context.getOrNull())

                /**
                 * Sets [Builder.context] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.context] with a well-typed [MessageContext]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun context(context: JsonField<MessageContext>) = apply { this.context = context }

                /**
                 * An arbitrary object that includes any data you want to pass to the message. The
                 * data will populate the corresponding template or elements variables.
                 */
                fun data(data: BaseMessage.Data?) = data(JsonField.ofNullable(data))

                /** Alias for calling [Builder.data] with `data.orElse(null)`. */
                fun data(data: Optional<BaseMessage.Data>) = data(data.getOrNull())

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [BaseMessage.Data] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun data(data: JsonField<BaseMessage.Data>) = apply { this.data = data }

                /**
                 * Defines the time to wait before delivering the message. You can specify one of
                 * the following options. Duration with the number of milliseconds to delay. Until
                 * with an ISO 8601 timestamp that specifies when it should be delivered. Until with
                 * an OpenStreetMap opening_hours-like format that specifies the
                 * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
                 * (e.g., 'Mo-Fr 08:00-18:00pm')
                 */
                fun delay(delay: BaseMessage.Delay?) = delay(JsonField.ofNullable(delay))

                /** Alias for calling [Builder.delay] with `delay.orElse(null)`. */
                fun delay(delay: Optional<BaseMessage.Delay>) = delay(delay.getOrNull())

                /**
                 * Sets [Builder.delay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delay] with a well-typed [BaseMessage.Delay]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun delay(delay: JsonField<BaseMessage.Delay>) = apply { this.delay = delay }

                /**
                 * "Expiry allows you to set an absolute or relative time in which a message
                 * expires. Note: This is only valid for the Courier Inbox channel as of
                 * 12-08-2022."
                 */
                fun expiry(expiry: BaseMessage.Expiry?) = expiry(JsonField.ofNullable(expiry))

                /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
                fun expiry(expiry: Optional<BaseMessage.Expiry>) = expiry(expiry.getOrNull())

                /**
                 * Sets [Builder.expiry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiry] with a well-typed [BaseMessage.Expiry]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiry(expiry: JsonField<BaseMessage.Expiry>) = apply { this.expiry = expiry }

                /**
                 * Metadata such as utm tracking attached with the notification through this
                 * channel.
                 */
                fun metadata(metadata: BaseMessage.Metadata?) =
                    metadata(JsonField.ofNullable(metadata))

                /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
                fun metadata(metadata: Optional<BaseMessage.Metadata>) =
                    metadata(metadata.getOrNull())

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed
                 * [BaseMessage.Metadata] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun metadata(metadata: JsonField<BaseMessage.Metadata>) = apply {
                    this.metadata = metadata
                }

                fun preferences(preferences: BaseMessage.Preferences?) =
                    preferences(JsonField.ofNullable(preferences))

                /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
                fun preferences(preferences: Optional<BaseMessage.Preferences>) =
                    preferences(preferences.getOrNull())

                /**
                 * Sets [Builder.preferences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preferences] with a well-typed
                 * [BaseMessage.Preferences] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun preferences(preferences: JsonField<BaseMessage.Preferences>) = apply {
                    this.preferences = preferences
                }

                /** An object whose keys are valid provider identifiers which map to an object. */
                fun providers(providers: BaseMessage.Providers?) =
                    providers(JsonField.ofNullable(providers))

                /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
                fun providers(providers: Optional<BaseMessage.Providers>) =
                    providers(providers.getOrNull())

                /**
                 * Sets [Builder.providers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providers] with a well-typed
                 * [BaseMessage.Providers] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun providers(providers: JsonField<BaseMessage.Providers>) = apply {
                    this.providers = providers
                }

                /**
                 * Allows you to customize which channel(s) Courier will potentially deliver the
                 * message. If no routing key is specified, Courier will use the default routing
                 * configuration or routing defined by the template.
                 */
                fun routing(routing: BaseMessage.Routing?) = routing(JsonField.ofNullable(routing))

                /** Alias for calling [Builder.routing] with `routing.orElse(null)`. */
                fun routing(routing: Optional<BaseMessage.Routing>) = routing(routing.getOrNull())

                /**
                 * Sets [Builder.routing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routing] with a well-typed [BaseMessage.Routing]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun routing(routing: JsonField<BaseMessage.Routing>) = apply {
                    this.routing = routing
                }

                /**
                 * Time in ms to attempt the channel before failing over to the next available
                 * channel.
                 */
                fun timeout(timeout: BaseMessage.Timeout?) = timeout(JsonField.ofNullable(timeout))

                /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
                fun timeout(timeout: Optional<BaseMessage.Timeout>) = timeout(timeout.getOrNull())

                /**
                 * Sets [Builder.timeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout] with a well-typed [BaseMessage.Timeout]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timeout(timeout: JsonField<BaseMessage.Timeout>) = apply {
                    this.timeout = timeout
                }

                /**
                 * The id of the notification template to be rendered and sent to the recipient(s).
                 * This field or the content field must be supplied.
                 */
                fun template(template: String) = template(JsonField.of(template))

                /**
                 * Sets [Builder.template] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.template] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun template(template: JsonField<String>) = apply { this.template = template }

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
                 * Returns an immutable instance of [InboundBulkTemplateMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .template()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InboundBulkTemplateMessage =
                    InboundBulkTemplateMessage(
                        brandId,
                        channels,
                        context,
                        data,
                        delay,
                        expiry,
                        metadata,
                        preferences,
                        providers,
                        routing,
                        timeout,
                        checkRequired("template", template),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InboundBulkTemplateMessage = apply {
                if (validated) {
                    return@apply
                }

                brandId()
                channels().ifPresent { it.validate() }
                context().ifPresent { it.validate() }
                data().ifPresent { it.validate() }
                delay().ifPresent { it.validate() }
                expiry().ifPresent { it.validate() }
                metadata().ifPresent { it.validate() }
                preferences().ifPresent { it.validate() }
                providers().ifPresent { it.validate() }
                routing().ifPresent { it.validate() }
                timeout().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (brandId.asKnown().isPresent) 1 else 0) +
                    (channels.asKnown().getOrNull()?.validity() ?: 0) +
                    (context.asKnown().getOrNull()?.validity() ?: 0) +
                    (data.asKnown().getOrNull()?.validity() ?: 0) +
                    (delay.asKnown().getOrNull()?.validity() ?: 0) +
                    (expiry.asKnown().getOrNull()?.validity() ?: 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (preferences.asKnown().getOrNull()?.validity() ?: 0) +
                    (providers.asKnown().getOrNull()?.validity() ?: 0) +
                    (routing.asKnown().getOrNull()?.validity() ?: 0) +
                    (timeout.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (template.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundBulkTemplateMessage &&
                    brandId == other.brandId &&
                    channels == other.channels &&
                    context == other.context &&
                    data == other.data &&
                    delay == other.delay &&
                    expiry == other.expiry &&
                    metadata == other.metadata &&
                    preferences == other.preferences &&
                    providers == other.providers &&
                    routing == other.routing &&
                    timeout == other.timeout &&
                    template == other.template &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    brandId,
                    channels,
                    context,
                    data,
                    delay,
                    expiry,
                    metadata,
                    preferences,
                    providers,
                    routing,
                    timeout,
                    template,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundBulkTemplateMessage{brandId=$brandId, channels=$channels, context=$context, data=$data, delay=$delay, expiry=$expiry, metadata=$metadata, preferences=$preferences, providers=$providers, routing=$routing, timeout=$timeout, template=$template, additionalProperties=$additionalProperties}"
        }

        /**
         * A template for a type of message that can be sent more than once. For example, you might
         * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
         */
        class InboundBulkContentMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val brandId: JsonField<String>,
            private val channels: JsonField<BaseMessage.Channels>,
            private val context: JsonField<MessageContext>,
            private val data: JsonField<BaseMessage.Data>,
            private val delay: JsonField<BaseMessage.Delay>,
            private val expiry: JsonField<BaseMessage.Expiry>,
            private val metadata: JsonField<BaseMessage.Metadata>,
            private val preferences: JsonField<BaseMessage.Preferences>,
            private val providers: JsonField<BaseMessage.Providers>,
            private val routing: JsonField<BaseMessage.Routing>,
            private val timeout: JsonField<BaseMessage.Timeout>,
            private val content: JsonField<Content>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("channels")
                @ExcludeMissing
                channels: JsonField<BaseMessage.Channels> = JsonMissing.of(),
                @JsonProperty("context")
                @ExcludeMissing
                context: JsonField<MessageContext> = JsonMissing.of(),
                @JsonProperty("data")
                @ExcludeMissing
                data: JsonField<BaseMessage.Data> = JsonMissing.of(),
                @JsonProperty("delay")
                @ExcludeMissing
                delay: JsonField<BaseMessage.Delay> = JsonMissing.of(),
                @JsonProperty("expiry")
                @ExcludeMissing
                expiry: JsonField<BaseMessage.Expiry> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<BaseMessage.Metadata> = JsonMissing.of(),
                @JsonProperty("preferences")
                @ExcludeMissing
                preferences: JsonField<BaseMessage.Preferences> = JsonMissing.of(),
                @JsonProperty("providers")
                @ExcludeMissing
                providers: JsonField<BaseMessage.Providers> = JsonMissing.of(),
                @JsonProperty("routing")
                @ExcludeMissing
                routing: JsonField<BaseMessage.Routing> = JsonMissing.of(),
                @JsonProperty("timeout")
                @ExcludeMissing
                timeout: JsonField<BaseMessage.Timeout> = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
            ) : this(
                brandId,
                channels,
                context,
                data,
                delay,
                expiry,
                metadata,
                preferences,
                providers,
                routing,
                timeout,
                content,
                mutableMapOf(),
            )

            fun toBaseMessage(): BaseMessage =
                BaseMessage.builder()
                    .brandId(brandId)
                    .channels(channels)
                    .context(context)
                    .data(data)
                    .delay(delay)
                    .expiry(expiry)
                    .metadata(metadata)
                    .preferences(preferences)
                    .providers(providers)
                    .routing(routing)
                    .timeout(timeout)
                    .build()

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun brandId(): Optional<String> = brandId.getOptional("brand_id")

            /**
             * "Define run-time configuration for one or more channels. If you don't specify
             * channels, the default configuration for each channel will be used. Valid ChannelId's
             * are: email, sms, push, inbox, direct_message, banner, and webhook."
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun channels(): Optional<BaseMessage.Channels> = channels.getOptional("channels")

            /**
             * Context to load with this recipient. Will override any context set on
             * message.context.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun context(): Optional<MessageContext> = context.getOptional("context")

            /**
             * An arbitrary object that includes any data you want to pass to the message. The data
             * will populate the corresponding template or elements variables.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun data(): Optional<BaseMessage.Data> = data.getOptional("data")

            /**
             * Defines the time to wait before delivering the message. You can specify one of the
             * following options. Duration with the number of milliseconds to delay. Until with an
             * ISO 8601 timestamp that specifies when it should be delivered. Until with an
             * OpenStreetMap opening_hours-like format that specifies the
             * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
             * (e.g., 'Mo-Fr 08:00-18:00pm')
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun delay(): Optional<BaseMessage.Delay> = delay.getOptional("delay")

            /**
             * "Expiry allows you to set an absolute or relative time in which a message expires.
             * Note: This is only valid for the Courier Inbox channel as of 12-08-2022."
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expiry(): Optional<BaseMessage.Expiry> = expiry.getOptional("expiry")

            /**
             * Metadata such as utm tracking attached with the notification through this channel.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<BaseMessage.Metadata> = metadata.getOptional("metadata")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preferences(): Optional<BaseMessage.Preferences> =
                preferences.getOptional("preferences")

            /**
             * An object whose keys are valid provider identifiers which map to an object.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun providers(): Optional<BaseMessage.Providers> = providers.getOptional("providers")

            /**
             * Allows you to customize which channel(s) Courier will potentially deliver the
             * message. If no routing key is specified, Courier will use the default routing
             * configuration or routing defined by the template.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routing(): Optional<BaseMessage.Routing> = routing.getOptional("routing")

            /**
             * Time in ms to attempt the channel before failing over to the next available channel.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout(): Optional<BaseMessage.Timeout> = timeout.getOptional("timeout")

            /**
             * Describes the content of the message in a way that will work for email, push, chat,
             * or any channel. Either this or template must be specified.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [channels].
             *
             * Unlike [channels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("channels")
            @ExcludeMissing
            fun _channels(): JsonField<BaseMessage.Channels> = channels

            /**
             * Returns the raw JSON value of [context].
             *
             * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("context")
            @ExcludeMissing
            fun _context(): JsonField<MessageContext> = context

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<BaseMessage.Data> = data

            /**
             * Returns the raw JSON value of [delay].
             *
             * Unlike [delay], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("delay")
            @ExcludeMissing
            fun _delay(): JsonField<BaseMessage.Delay> = delay

            /**
             * Returns the raw JSON value of [expiry].
             *
             * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("expiry")
            @ExcludeMissing
            fun _expiry(): JsonField<BaseMessage.Expiry> = expiry

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<BaseMessage.Metadata> = metadata

            /**
             * Returns the raw JSON value of [preferences].
             *
             * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("preferences")
            @ExcludeMissing
            fun _preferences(): JsonField<BaseMessage.Preferences> = preferences

            /**
             * Returns the raw JSON value of [providers].
             *
             * Unlike [providers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("providers")
            @ExcludeMissing
            fun _providers(): JsonField<BaseMessage.Providers> = providers

            /**
             * Returns the raw JSON value of [routing].
             *
             * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routing")
            @ExcludeMissing
            fun _routing(): JsonField<BaseMessage.Routing> = routing

            /**
             * Returns the raw JSON value of [timeout].
             *
             * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("timeout")
            @ExcludeMissing
            fun _timeout(): JsonField<BaseMessage.Timeout> = timeout

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

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
                 * [InboundBulkContentMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboundBulkContentMessage]. */
            class Builder internal constructor() {

                private var brandId: JsonField<String> = JsonMissing.of()
                private var channels: JsonField<BaseMessage.Channels> = JsonMissing.of()
                private var context: JsonField<MessageContext> = JsonMissing.of()
                private var data: JsonField<BaseMessage.Data> = JsonMissing.of()
                private var delay: JsonField<BaseMessage.Delay> = JsonMissing.of()
                private var expiry: JsonField<BaseMessage.Expiry> = JsonMissing.of()
                private var metadata: JsonField<BaseMessage.Metadata> = JsonMissing.of()
                private var preferences: JsonField<BaseMessage.Preferences> = JsonMissing.of()
                private var providers: JsonField<BaseMessage.Providers> = JsonMissing.of()
                private var routing: JsonField<BaseMessage.Routing> = JsonMissing.of()
                private var timeout: JsonField<BaseMessage.Timeout> = JsonMissing.of()
                private var content: JsonField<Content>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundBulkContentMessage: InboundBulkContentMessage) = apply {
                    brandId = inboundBulkContentMessage.brandId
                    channels = inboundBulkContentMessage.channels
                    context = inboundBulkContentMessage.context
                    data = inboundBulkContentMessage.data
                    delay = inboundBulkContentMessage.delay
                    expiry = inboundBulkContentMessage.expiry
                    metadata = inboundBulkContentMessage.metadata
                    preferences = inboundBulkContentMessage.preferences
                    providers = inboundBulkContentMessage.providers
                    routing = inboundBulkContentMessage.routing
                    timeout = inboundBulkContentMessage.timeout
                    content = inboundBulkContentMessage.content
                    additionalProperties =
                        inboundBulkContentMessage.additionalProperties.toMutableMap()
                }

                fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

                /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
                fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /**
                 * "Define run-time configuration for one or more channels. If you don't specify
                 * channels, the default configuration for each channel will be used. Valid
                 * ChannelId's are: email, sms, push, inbox, direct_message, banner, and webhook."
                 */
                fun channels(channels: BaseMessage.Channels?) =
                    channels(JsonField.ofNullable(channels))

                /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
                fun channels(channels: Optional<BaseMessage.Channels>) =
                    channels(channels.getOrNull())

                /**
                 * Sets [Builder.channels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channels] with a well-typed
                 * [BaseMessage.Channels] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun channels(channels: JsonField<BaseMessage.Channels>) = apply {
                    this.channels = channels
                }

                /**
                 * Context to load with this recipient. Will override any context set on
                 * message.context.
                 */
                fun context(context: MessageContext?) = context(JsonField.ofNullable(context))

                /** Alias for calling [Builder.context] with `context.orElse(null)`. */
                fun context(context: Optional<MessageContext>) = context(context.getOrNull())

                /**
                 * Sets [Builder.context] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.context] with a well-typed [MessageContext]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun context(context: JsonField<MessageContext>) = apply { this.context = context }

                /**
                 * An arbitrary object that includes any data you want to pass to the message. The
                 * data will populate the corresponding template or elements variables.
                 */
                fun data(data: BaseMessage.Data?) = data(JsonField.ofNullable(data))

                /** Alias for calling [Builder.data] with `data.orElse(null)`. */
                fun data(data: Optional<BaseMessage.Data>) = data(data.getOrNull())

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [BaseMessage.Data] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun data(data: JsonField<BaseMessage.Data>) = apply { this.data = data }

                /**
                 * Defines the time to wait before delivering the message. You can specify one of
                 * the following options. Duration with the number of milliseconds to delay. Until
                 * with an ISO 8601 timestamp that specifies when it should be delivered. Until with
                 * an OpenStreetMap opening_hours-like format that specifies the
                 * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
                 * (e.g., 'Mo-Fr 08:00-18:00pm')
                 */
                fun delay(delay: BaseMessage.Delay?) = delay(JsonField.ofNullable(delay))

                /** Alias for calling [Builder.delay] with `delay.orElse(null)`. */
                fun delay(delay: Optional<BaseMessage.Delay>) = delay(delay.getOrNull())

                /**
                 * Sets [Builder.delay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delay] with a well-typed [BaseMessage.Delay]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun delay(delay: JsonField<BaseMessage.Delay>) = apply { this.delay = delay }

                /**
                 * "Expiry allows you to set an absolute or relative time in which a message
                 * expires. Note: This is only valid for the Courier Inbox channel as of
                 * 12-08-2022."
                 */
                fun expiry(expiry: BaseMessage.Expiry?) = expiry(JsonField.ofNullable(expiry))

                /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
                fun expiry(expiry: Optional<BaseMessage.Expiry>) = expiry(expiry.getOrNull())

                /**
                 * Sets [Builder.expiry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiry] with a well-typed [BaseMessage.Expiry]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiry(expiry: JsonField<BaseMessage.Expiry>) = apply { this.expiry = expiry }

                /**
                 * Metadata such as utm tracking attached with the notification through this
                 * channel.
                 */
                fun metadata(metadata: BaseMessage.Metadata?) =
                    metadata(JsonField.ofNullable(metadata))

                /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
                fun metadata(metadata: Optional<BaseMessage.Metadata>) =
                    metadata(metadata.getOrNull())

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed
                 * [BaseMessage.Metadata] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun metadata(metadata: JsonField<BaseMessage.Metadata>) = apply {
                    this.metadata = metadata
                }

                fun preferences(preferences: BaseMessage.Preferences?) =
                    preferences(JsonField.ofNullable(preferences))

                /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
                fun preferences(preferences: Optional<BaseMessage.Preferences>) =
                    preferences(preferences.getOrNull())

                /**
                 * Sets [Builder.preferences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preferences] with a well-typed
                 * [BaseMessage.Preferences] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun preferences(preferences: JsonField<BaseMessage.Preferences>) = apply {
                    this.preferences = preferences
                }

                /** An object whose keys are valid provider identifiers which map to an object. */
                fun providers(providers: BaseMessage.Providers?) =
                    providers(JsonField.ofNullable(providers))

                /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
                fun providers(providers: Optional<BaseMessage.Providers>) =
                    providers(providers.getOrNull())

                /**
                 * Sets [Builder.providers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providers] with a well-typed
                 * [BaseMessage.Providers] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun providers(providers: JsonField<BaseMessage.Providers>) = apply {
                    this.providers = providers
                }

                /**
                 * Allows you to customize which channel(s) Courier will potentially deliver the
                 * message. If no routing key is specified, Courier will use the default routing
                 * configuration or routing defined by the template.
                 */
                fun routing(routing: BaseMessage.Routing?) = routing(JsonField.ofNullable(routing))

                /** Alias for calling [Builder.routing] with `routing.orElse(null)`. */
                fun routing(routing: Optional<BaseMessage.Routing>) = routing(routing.getOrNull())

                /**
                 * Sets [Builder.routing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routing] with a well-typed [BaseMessage.Routing]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun routing(routing: JsonField<BaseMessage.Routing>) = apply {
                    this.routing = routing
                }

                /**
                 * Time in ms to attempt the channel before failing over to the next available
                 * channel.
                 */
                fun timeout(timeout: BaseMessage.Timeout?) = timeout(JsonField.ofNullable(timeout))

                /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
                fun timeout(timeout: Optional<BaseMessage.Timeout>) = timeout(timeout.getOrNull())

                /**
                 * Sets [Builder.timeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout] with a well-typed [BaseMessage.Timeout]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timeout(timeout: JsonField<BaseMessage.Timeout>) = apply {
                    this.timeout = timeout
                }

                /**
                 * Describes the content of the message in a way that will work for email, push,
                 * chat, or any channel. Either this or template must be specified.
                 */
                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofElemental(elemental)`. */
                fun content(elemental: Content.ElementalContent) =
                    content(Content.ofElemental(elemental))

                /**
                 * Alias for calling [content] with
                 * `Content.ofElementalContentSugar(elementalContentSugar)`.
                 */
                fun content(elementalContentSugar: Content.ElementalContentSugar) =
                    content(Content.ofElementalContentSugar(elementalContentSugar))

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
                 * Returns an immutable instance of [InboundBulkContentMessage].
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
                fun build(): InboundBulkContentMessage =
                    InboundBulkContentMessage(
                        brandId,
                        channels,
                        context,
                        data,
                        delay,
                        expiry,
                        metadata,
                        preferences,
                        providers,
                        routing,
                        timeout,
                        checkRequired("content", content),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InboundBulkContentMessage = apply {
                if (validated) {
                    return@apply
                }

                brandId()
                channels().ifPresent { it.validate() }
                context().ifPresent { it.validate() }
                data().ifPresent { it.validate() }
                delay().ifPresent { it.validate() }
                expiry().ifPresent { it.validate() }
                metadata().ifPresent { it.validate() }
                preferences().ifPresent { it.validate() }
                providers().ifPresent { it.validate() }
                routing().ifPresent { it.validate() }
                timeout().ifPresent { it.validate() }
                content().validate()
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
                (if (brandId.asKnown().isPresent) 1 else 0) +
                    (channels.asKnown().getOrNull()?.validity() ?: 0) +
                    (context.asKnown().getOrNull()?.validity() ?: 0) +
                    (data.asKnown().getOrNull()?.validity() ?: 0) +
                    (delay.asKnown().getOrNull()?.validity() ?: 0) +
                    (expiry.asKnown().getOrNull()?.validity() ?: 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (preferences.asKnown().getOrNull()?.validity() ?: 0) +
                    (providers.asKnown().getOrNull()?.validity() ?: 0) +
                    (routing.asKnown().getOrNull()?.validity() ?: 0) +
                    (timeout.asKnown().getOrNull()?.validity() ?: 0) +
                    (content.asKnown().getOrNull()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundBulkContentMessage &&
                    brandId == other.brandId &&
                    channels == other.channels &&
                    context == other.context &&
                    data == other.data &&
                    delay == other.delay &&
                    expiry == other.expiry &&
                    metadata == other.metadata &&
                    preferences == other.preferences &&
                    providers == other.providers &&
                    routing == other.routing &&
                    timeout == other.timeout &&
                    content == other.content &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    brandId,
                    channels,
                    context,
                    data,
                    delay,
                    expiry,
                    metadata,
                    preferences,
                    providers,
                    routing,
                    timeout,
                    content,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundBulkContentMessage{brandId=$brandId, channels=$channels, context=$context, data=$data, delay=$delay, expiry=$expiry, metadata=$metadata, preferences=$preferences, providers=$providers, routing=$routing, timeout=$timeout, content=$content, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundBulkMessage &&
            brand == other.brand &&
            data == other.data &&
            event == other.event &&
            locale == other.locale &&
            message == other.message &&
            override == other.override &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(brand, data, event, locale, message, override, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundBulkMessage{brand=$brand, data=$data, event=$event, locale=$locale, message=$message, override=$override, additionalProperties=$additionalProperties}"
}
