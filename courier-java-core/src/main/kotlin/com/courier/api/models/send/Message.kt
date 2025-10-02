// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkRequired
import com.courier.api.core.getOrThrow
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.bulk.UserRecipient
import com.courier.api.models.tenants.templates.ElementalContent
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
 * Describes the content of the message in a way that will work for email, push, chat, or any
 * channel.
 */
@JsonDeserialize(using = Message.Deserializer::class)
@JsonSerialize(using = Message.Serializer::class)
class Message
private constructor(
    private val content: ContentMessage? = null,
    private val template: TemplateMessage? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Describes the content of the message in a way that will work for email, push, chat, or any
     * channel.
     */
    fun content(): Optional<ContentMessage> = Optional.ofNullable(content)

    /**
     * A template for a type of message that can be sent more than once. For example, you might
     * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
     */
    fun template(): Optional<TemplateMessage> = Optional.ofNullable(template)

    fun isContent(): Boolean = content != null

    fun isTemplate(): Boolean = template != null

    /**
     * Describes the content of the message in a way that will work for email, push, chat, or any
     * channel.
     */
    fun asContent(): ContentMessage = content.getOrThrow("content")

    /**
     * A template for a type of message that can be sent more than once. For example, you might
     * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
     */
    fun asTemplate(): TemplateMessage = template.getOrThrow("template")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            content != null -> visitor.visitContent(content)
            template != null -> visitor.visitTemplate(template)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Message = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitContent(content: ContentMessage) {
                    content.validate()
                }

                override fun visitTemplate(template: TemplateMessage) {
                    template.validate()
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
                override fun visitContent(content: ContentMessage) = content.validity()

                override fun visitTemplate(template: TemplateMessage) = template.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Message && content == other.content && template == other.template
    }

    override fun hashCode(): Int = Objects.hash(content, template)

    override fun toString(): String =
        when {
            content != null -> "Message{content=$content}"
            template != null -> "Message{template=$template}"
            _json != null -> "Message{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Message")
        }

    companion object {

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel.
         */
        @JvmStatic fun ofContent(content: ContentMessage) = Message(content = content)

        /**
         * A template for a type of message that can be sent more than once. For example, you might
         * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
         */
        @JvmStatic fun ofTemplate(template: TemplateMessage) = Message(template = template)
    }

    /** An interface that defines how to map each variant of [Message] to a value of type [T]. */
    interface Visitor<out T> {

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel.
         */
        fun visitContent(content: ContentMessage): T

        /**
         * A template for a type of message that can be sent more than once. For example, you might
         * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
         */
        fun visitTemplate(template: TemplateMessage): T

        /**
         * Maps an unknown variant of [Message] to a value of type [T].
         *
         * An instance of [Message] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
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
                        tryDeserialize(node, jacksonTypeRef<ContentMessage>())?.let {
                            Message(content = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TemplateMessage>())?.let {
                            Message(template = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Message(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
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
                value.content != null -> generator.writeObject(value.content)
                value.template != null -> generator.writeObject(value.template)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Message")
            }
        }
    }

    /**
     * Describes the content of the message in a way that will work for email, push, chat, or any
     * channel.
     */
    class ContentMessage
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
        private val to: JsonField<BaseMessageSendTo.To>,
        private val content: JsonField<Content>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("to")
            @ExcludeMissing
            to: JsonField<BaseMessageSendTo.To> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
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
            to,
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

        fun toBaseMessageSendTo(): BaseMessageSendTo = BaseMessageSendTo.builder().to(to).build()

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brand_id")

        /**
         * "Define run-time configuration for one or more channels. If you don't specify channels,
         * the default configuration for each channel will be used. Valid ChannelId's are: email,
         * sms, push, inbox, direct_message, banner, and webhook."
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channels(): Optional<BaseMessage.Channels> = channels.getOptional("channels")

        /**
         * Context to load with this recipient. Will override any context set on message.context.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<MessageContext> = context.getOptional("context")

        /**
         * An arbitrary object that includes any data you want to pass to the message. The data will
         * populate the corresponding template or elements variables.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<BaseMessage.Data> = data.getOptional("data")

        /**
         * Defines the time to wait before delivering the message. You can specify one of the
         * following options. Duration with the number of milliseconds to delay. Until with an ISO
         * 8601 timestamp that specifies when it should be delivered. Until with an OpenStreetMap
         * opening_hours-like format that specifies the
         * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
         * (e.g., 'Mo-Fr 08:00-18:00pm')
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun delay(): Optional<BaseMessage.Delay> = delay.getOptional("delay")

        /**
         * "Expiry allows you to set an absolute or relative time in which a message expires. Note:
         * This is only valid for the Courier Inbox channel as of 12-08-2022."
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiry(): Optional<BaseMessage.Expiry> = expiry.getOptional("expiry")

        /**
         * Metadata such as utm tracking attached with the notification through this channel.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<BaseMessage.Metadata> = metadata.getOptional("metadata")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferences(): Optional<BaseMessage.Preferences> =
            preferences.getOptional("preferences")

        /**
         * An object whose keys are valid provider identifiers which map to an object.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providers(): Optional<BaseMessage.Providers> = providers.getOptional("providers")

        /**
         * Allows you to customize which channel(s) Courier will potentially deliver the message. If
         * no routing key is specified, Courier will use the default routing configuration or
         * routing defined by the template.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routing(): Optional<BaseMessage.Routing> = routing.getOptional("routing")

        /**
         * Time in ms to attempt the channel before failing over to the next available channel.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<BaseMessage.Timeout> = timeout.getOptional("timeout")

        /**
         * The recipient or a list of recipients of the message
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<BaseMessageSendTo.To> = to.getOptional("to")

        /**
         * Describes the content of the message in a way that will work for email, push, chat, or
         * any channel. Either this or template must be specified.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<BaseMessage.Channels> = channels

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<MessageContext> = context

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
        @JsonProperty("delay") @ExcludeMissing fun _delay(): JsonField<BaseMessage.Delay> = delay

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
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): JsonField<BaseMessage.Metadata> = metadata

        /**
         * Returns the raw JSON value of [preferences].
         *
         * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preferences")
        @ExcludeMissing
        fun _preferences(): JsonField<BaseMessage.Preferences> = preferences

        /**
         * Returns the raw JSON value of [providers].
         *
         * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<BaseMessageSendTo.To> = to

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
             * Returns a mutable builder for constructing an instance of [ContentMessage].
             *
             * The following fields are required:
             * ```java
             * .content()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentMessage]. */
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
            private var to: JsonField<BaseMessageSendTo.To> = JsonMissing.of()
            private var content: JsonField<Content>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentMessage: ContentMessage) = apply {
                brandId = contentMessage.brandId
                channels = contentMessage.channels
                context = contentMessage.context
                data = contentMessage.data
                delay = contentMessage.delay
                expiry = contentMessage.expiry
                metadata = contentMessage.metadata
                preferences = contentMessage.preferences
                providers = contentMessage.providers
                routing = contentMessage.routing
                timeout = contentMessage.timeout
                to = contentMessage.to
                content = contentMessage.content
                additionalProperties = contentMessage.additionalProperties.toMutableMap()
            }

            fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

            /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
            fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /**
             * "Define run-time configuration for one or more channels. If you don't specify
             * channels, the default configuration for each channel will be used. Valid ChannelId's
             * are: email, sms, push, inbox, direct_message, banner, and webhook."
             */
            fun channels(channels: BaseMessage.Channels?) = channels(JsonField.ofNullable(channels))

            /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
            fun channels(channels: Optional<BaseMessage.Channels>) = channels(channels.getOrNull())

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed [BaseMessage.Channels]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.context] with a well-typed [MessageContext] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<MessageContext>) = apply { this.context = context }

            /**
             * An arbitrary object that includes any data you want to pass to the message. The data
             * will populate the corresponding template or elements variables.
             */
            fun data(data: BaseMessage.Data?) = data(JsonField.ofNullable(data))

            /** Alias for calling [Builder.data] with `data.orElse(null)`. */
            fun data(data: Optional<BaseMessage.Data>) = data(data.getOrNull())

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [BaseMessage.Data] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<BaseMessage.Data>) = apply { this.data = data }

            /**
             * Defines the time to wait before delivering the message. You can specify one of the
             * following options. Duration with the number of milliseconds to delay. Until with an
             * ISO 8601 timestamp that specifies when it should be delivered. Until with an
             * OpenStreetMap opening_hours-like format that specifies the
             * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
             * (e.g., 'Mo-Fr 08:00-18:00pm')
             */
            fun delay(delay: BaseMessage.Delay?) = delay(JsonField.ofNullable(delay))

            /** Alias for calling [Builder.delay] with `delay.orElse(null)`. */
            fun delay(delay: Optional<BaseMessage.Delay>) = delay(delay.getOrNull())

            /**
             * Sets [Builder.delay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delay] with a well-typed [BaseMessage.Delay] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delay(delay: JsonField<BaseMessage.Delay>) = apply { this.delay = delay }

            /**
             * "Expiry allows you to set an absolute or relative time in which a message expires.
             * Note: This is only valid for the Courier Inbox channel as of 12-08-2022."
             */
            fun expiry(expiry: BaseMessage.Expiry?) = expiry(JsonField.ofNullable(expiry))

            /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
            fun expiry(expiry: Optional<BaseMessage.Expiry>) = expiry(expiry.getOrNull())

            /**
             * Sets [Builder.expiry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiry] with a well-typed [BaseMessage.Expiry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiry(expiry: JsonField<BaseMessage.Expiry>) = apply { this.expiry = expiry }

            /**
             * Metadata such as utm tracking attached with the notification through this channel.
             */
            fun metadata(metadata: BaseMessage.Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<BaseMessage.Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [BaseMessage.Metadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.providers] with a well-typed [BaseMessage.Providers]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun routing(routing: JsonField<BaseMessage.Routing>) = apply { this.routing = routing }

            /**
             * Time in ms to attempt the channel before failing over to the next available channel.
             */
            fun timeout(timeout: BaseMessage.Timeout?) = timeout(JsonField.ofNullable(timeout))

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<BaseMessage.Timeout>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [BaseMessage.Timeout]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeout(timeout: JsonField<BaseMessage.Timeout>) = apply { this.timeout = timeout }

            /** The recipient or a list of recipients of the message */
            fun to(to: BaseMessageSendTo.To?) = to(JsonField.ofNullable(to))

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<BaseMessageSendTo.To>) = to(to.getOrNull())

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [BaseMessageSendTo.To] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun to(to: JsonField<BaseMessageSendTo.To>) = apply { this.to = to }

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofAudienceRecipient(audienceRecipient)`.
             */
            fun to(audienceRecipient: BaseMessageSendTo.To.AudienceRecipient) =
                to(BaseMessageSendTo.To.ofAudienceRecipient(audienceRecipient))

            /** Alias for calling [to] with `BaseMessageSendTo.To.ofUnionMember1(unionMember1)`. */
            fun to(unionMember1: BaseMessageSendTo.To.UnionMember1) =
                to(BaseMessageSendTo.To.ofUnionMember1(unionMember1))

            /** Alias for calling [to] with `BaseMessageSendTo.To.ofUnionMember2(unionMember2)`. */
            fun to(unionMember2: BaseMessageSendTo.To.UnionMember2) =
                to(BaseMessageSendTo.To.ofUnionMember2(unionMember2))

            /**
             * Alias for calling [to] with `BaseMessageSendTo.To.ofUserRecipient(userRecipient)`.
             */
            fun to(userRecipient: UserRecipient) =
                to(BaseMessageSendTo.To.ofUserRecipient(userRecipient))

            /**
             * Alias for calling [to] with `BaseMessageSendTo.To.ofSlackRecipient(slackRecipient)`.
             */
            fun to(slackRecipient: BaseMessageSendTo.To.SlackRecipient) =
                to(BaseMessageSendTo.To.ofSlackRecipient(slackRecipient))

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofMsTeamsRecipient(msTeamsRecipient)`.
             */
            fun to(msTeamsRecipient: BaseMessageSendTo.To.MsTeamsRecipient) =
                to(BaseMessageSendTo.To.ofMsTeamsRecipient(msTeamsRecipient))

            /**
             * Alias for calling [to] with `BaseMessageSendTo.To.ofRecipientData(recipientData)`.
             */
            fun to(recipientData: BaseMessageSendTo.To.RecipientData) =
                to(BaseMessageSendTo.To.ofRecipientData(recipientData))

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofPagerdutyRecipient(pagerdutyRecipient)`.
             */
            fun to(pagerdutyRecipient: BaseMessageSendTo.To.PagerdutyRecipient) =
                to(BaseMessageSendTo.To.ofPagerdutyRecipient(pagerdutyRecipient))

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofWebhookRecipient(webhookRecipient)`.
             */
            fun to(webhookRecipient: BaseMessageSendTo.To.WebhookRecipient) =
                to(BaseMessageSendTo.To.ofWebhookRecipient(webhookRecipient))

            /** Alias for calling [to] with `BaseMessageSendTo.To.ofRecipients(recipients)`. */
            fun toOfRecipients(recipients: List<Recipient>) =
                to(BaseMessageSendTo.To.ofRecipients(recipients))

            /**
             * Describes the content of the message in a way that will work for email, push, chat,
             * or any channel. Either this or template must be specified.
             */
            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            /** Alias for calling [content] with `Content.ofElemental(elemental)`. */
            fun content(elemental: ElementalContent) = content(Content.ofElemental(elemental))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ContentMessage].
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
            fun build(): ContentMessage =
                ContentMessage(
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
                    to,
                    checkRequired("content", content),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ContentMessage = apply {
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
            to().ifPresent { it.validate() }
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
                (to.asKnown().getOrNull()?.validity() ?: 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentMessage &&
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
                to == other.to &&
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
                to,
                content,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentMessage{brandId=$brandId, channels=$channels, context=$context, data=$data, delay=$delay, expiry=$expiry, metadata=$metadata, preferences=$preferences, providers=$providers, routing=$routing, timeout=$timeout, to=$to, content=$content, additionalProperties=$additionalProperties}"
    }

    /**
     * A template for a type of message that can be sent more than once. For example, you might
     * create an "Appointment Reminder" Notification or “Reset Password” Notifications.
     */
    class TemplateMessage
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
        private val to: JsonField<BaseMessageSendTo.To>,
        private val template: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("to")
            @ExcludeMissing
            to: JsonField<BaseMessageSendTo.To> = JsonMissing.of(),
            @JsonProperty("template") @ExcludeMissing template: JsonField<String> = JsonMissing.of(),
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
            to,
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

        fun toBaseMessageSendTo(): BaseMessageSendTo = BaseMessageSendTo.builder().to(to).build()

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brand_id")

        /**
         * "Define run-time configuration for one or more channels. If you don't specify channels,
         * the default configuration for each channel will be used. Valid ChannelId's are: email,
         * sms, push, inbox, direct_message, banner, and webhook."
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channels(): Optional<BaseMessage.Channels> = channels.getOptional("channels")

        /**
         * Context to load with this recipient. Will override any context set on message.context.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<MessageContext> = context.getOptional("context")

        /**
         * An arbitrary object that includes any data you want to pass to the message. The data will
         * populate the corresponding template or elements variables.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<BaseMessage.Data> = data.getOptional("data")

        /**
         * Defines the time to wait before delivering the message. You can specify one of the
         * following options. Duration with the number of milliseconds to delay. Until with an ISO
         * 8601 timestamp that specifies when it should be delivered. Until with an OpenStreetMap
         * opening_hours-like format that specifies the
         * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
         * (e.g., 'Mo-Fr 08:00-18:00pm')
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun delay(): Optional<BaseMessage.Delay> = delay.getOptional("delay")

        /**
         * "Expiry allows you to set an absolute or relative time in which a message expires. Note:
         * This is only valid for the Courier Inbox channel as of 12-08-2022."
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiry(): Optional<BaseMessage.Expiry> = expiry.getOptional("expiry")

        /**
         * Metadata such as utm tracking attached with the notification through this channel.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<BaseMessage.Metadata> = metadata.getOptional("metadata")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferences(): Optional<BaseMessage.Preferences> =
            preferences.getOptional("preferences")

        /**
         * An object whose keys are valid provider identifiers which map to an object.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providers(): Optional<BaseMessage.Providers> = providers.getOptional("providers")

        /**
         * Allows you to customize which channel(s) Courier will potentially deliver the message. If
         * no routing key is specified, Courier will use the default routing configuration or
         * routing defined by the template.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routing(): Optional<BaseMessage.Routing> = routing.getOptional("routing")

        /**
         * Time in ms to attempt the channel before failing over to the next available channel.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<BaseMessage.Timeout> = timeout.getOptional("timeout")

        /**
         * The recipient or a list of recipients of the message
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<BaseMessageSendTo.To> = to.getOptional("to")

        /**
         * The id of the notification template to be rendered and sent to the recipient(s). This
         * field or the content field must be supplied.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<BaseMessage.Channels> = channels

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<MessageContext> = context

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
        @JsonProperty("delay") @ExcludeMissing fun _delay(): JsonField<BaseMessage.Delay> = delay

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
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): JsonField<BaseMessage.Metadata> = metadata

        /**
         * Returns the raw JSON value of [preferences].
         *
         * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preferences")
        @ExcludeMissing
        fun _preferences(): JsonField<BaseMessage.Preferences> = preferences

        /**
         * Returns the raw JSON value of [providers].
         *
         * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<BaseMessageSendTo.To> = to

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
             * Returns a mutable builder for constructing an instance of [TemplateMessage].
             *
             * The following fields are required:
             * ```java
             * .template()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateMessage]. */
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
            private var to: JsonField<BaseMessageSendTo.To> = JsonMissing.of()
            private var template: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateMessage: TemplateMessage) = apply {
                brandId = templateMessage.brandId
                channels = templateMessage.channels
                context = templateMessage.context
                data = templateMessage.data
                delay = templateMessage.delay
                expiry = templateMessage.expiry
                metadata = templateMessage.metadata
                preferences = templateMessage.preferences
                providers = templateMessage.providers
                routing = templateMessage.routing
                timeout = templateMessage.timeout
                to = templateMessage.to
                template = templateMessage.template
                additionalProperties = templateMessage.additionalProperties.toMutableMap()
            }

            fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

            /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
            fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /**
             * "Define run-time configuration for one or more channels. If you don't specify
             * channels, the default configuration for each channel will be used. Valid ChannelId's
             * are: email, sms, push, inbox, direct_message, banner, and webhook."
             */
            fun channels(channels: BaseMessage.Channels?) = channels(JsonField.ofNullable(channels))

            /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
            fun channels(channels: Optional<BaseMessage.Channels>) = channels(channels.getOrNull())

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed [BaseMessage.Channels]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.context] with a well-typed [MessageContext] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<MessageContext>) = apply { this.context = context }

            /**
             * An arbitrary object that includes any data you want to pass to the message. The data
             * will populate the corresponding template or elements variables.
             */
            fun data(data: BaseMessage.Data?) = data(JsonField.ofNullable(data))

            /** Alias for calling [Builder.data] with `data.orElse(null)`. */
            fun data(data: Optional<BaseMessage.Data>) = data(data.getOrNull())

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [BaseMessage.Data] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<BaseMessage.Data>) = apply { this.data = data }

            /**
             * Defines the time to wait before delivering the message. You can specify one of the
             * following options. Duration with the number of milliseconds to delay. Until with an
             * ISO 8601 timestamp that specifies when it should be delivered. Until with an
             * OpenStreetMap opening_hours-like format that specifies the
             * [Delivery Window](https://www.courier.com/docs/platform/sending/failover/#delivery-window)
             * (e.g., 'Mo-Fr 08:00-18:00pm')
             */
            fun delay(delay: BaseMessage.Delay?) = delay(JsonField.ofNullable(delay))

            /** Alias for calling [Builder.delay] with `delay.orElse(null)`. */
            fun delay(delay: Optional<BaseMessage.Delay>) = delay(delay.getOrNull())

            /**
             * Sets [Builder.delay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delay] with a well-typed [BaseMessage.Delay] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delay(delay: JsonField<BaseMessage.Delay>) = apply { this.delay = delay }

            /**
             * "Expiry allows you to set an absolute or relative time in which a message expires.
             * Note: This is only valid for the Courier Inbox channel as of 12-08-2022."
             */
            fun expiry(expiry: BaseMessage.Expiry?) = expiry(JsonField.ofNullable(expiry))

            /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
            fun expiry(expiry: Optional<BaseMessage.Expiry>) = expiry(expiry.getOrNull())

            /**
             * Sets [Builder.expiry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiry] with a well-typed [BaseMessage.Expiry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiry(expiry: JsonField<BaseMessage.Expiry>) = apply { this.expiry = expiry }

            /**
             * Metadata such as utm tracking attached with the notification through this channel.
             */
            fun metadata(metadata: BaseMessage.Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<BaseMessage.Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [BaseMessage.Metadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.providers] with a well-typed [BaseMessage.Providers]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun routing(routing: JsonField<BaseMessage.Routing>) = apply { this.routing = routing }

            /**
             * Time in ms to attempt the channel before failing over to the next available channel.
             */
            fun timeout(timeout: BaseMessage.Timeout?) = timeout(JsonField.ofNullable(timeout))

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<BaseMessage.Timeout>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [BaseMessage.Timeout]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeout(timeout: JsonField<BaseMessage.Timeout>) = apply { this.timeout = timeout }

            /** The recipient or a list of recipients of the message */
            fun to(to: BaseMessageSendTo.To?) = to(JsonField.ofNullable(to))

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<BaseMessageSendTo.To>) = to(to.getOrNull())

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [BaseMessageSendTo.To] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun to(to: JsonField<BaseMessageSendTo.To>) = apply { this.to = to }

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofAudienceRecipient(audienceRecipient)`.
             */
            fun to(audienceRecipient: BaseMessageSendTo.To.AudienceRecipient) =
                to(BaseMessageSendTo.To.ofAudienceRecipient(audienceRecipient))

            /** Alias for calling [to] with `BaseMessageSendTo.To.ofUnionMember1(unionMember1)`. */
            fun to(unionMember1: BaseMessageSendTo.To.UnionMember1) =
                to(BaseMessageSendTo.To.ofUnionMember1(unionMember1))

            /** Alias for calling [to] with `BaseMessageSendTo.To.ofUnionMember2(unionMember2)`. */
            fun to(unionMember2: BaseMessageSendTo.To.UnionMember2) =
                to(BaseMessageSendTo.To.ofUnionMember2(unionMember2))

            /**
             * Alias for calling [to] with `BaseMessageSendTo.To.ofUserRecipient(userRecipient)`.
             */
            fun to(userRecipient: UserRecipient) =
                to(BaseMessageSendTo.To.ofUserRecipient(userRecipient))

            /**
             * Alias for calling [to] with `BaseMessageSendTo.To.ofSlackRecipient(slackRecipient)`.
             */
            fun to(slackRecipient: BaseMessageSendTo.To.SlackRecipient) =
                to(BaseMessageSendTo.To.ofSlackRecipient(slackRecipient))

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofMsTeamsRecipient(msTeamsRecipient)`.
             */
            fun to(msTeamsRecipient: BaseMessageSendTo.To.MsTeamsRecipient) =
                to(BaseMessageSendTo.To.ofMsTeamsRecipient(msTeamsRecipient))

            /**
             * Alias for calling [to] with `BaseMessageSendTo.To.ofRecipientData(recipientData)`.
             */
            fun to(recipientData: BaseMessageSendTo.To.RecipientData) =
                to(BaseMessageSendTo.To.ofRecipientData(recipientData))

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofPagerdutyRecipient(pagerdutyRecipient)`.
             */
            fun to(pagerdutyRecipient: BaseMessageSendTo.To.PagerdutyRecipient) =
                to(BaseMessageSendTo.To.ofPagerdutyRecipient(pagerdutyRecipient))

            /**
             * Alias for calling [to] with
             * `BaseMessageSendTo.To.ofWebhookRecipient(webhookRecipient)`.
             */
            fun to(webhookRecipient: BaseMessageSendTo.To.WebhookRecipient) =
                to(BaseMessageSendTo.To.ofWebhookRecipient(webhookRecipient))

            /** Alias for calling [to] with `BaseMessageSendTo.To.ofRecipients(recipients)`. */
            fun toOfRecipients(recipients: List<Recipient>) =
                to(BaseMessageSendTo.To.ofRecipients(recipients))

            /**
             * The id of the notification template to be rendered and sent to the recipient(s). This
             * field or the content field must be supplied.
             */
            fun template(template: String) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [TemplateMessage].
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
            fun build(): TemplateMessage =
                TemplateMessage(
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
                    to,
                    checkRequired("template", template),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TemplateMessage = apply {
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
            to().ifPresent { it.validate() }
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
                (to.asKnown().getOrNull()?.validity() ?: 0) +
                (if (template.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TemplateMessage &&
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
                to == other.to &&
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
                to,
                template,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateMessage{brandId=$brandId, channels=$channels, context=$context, data=$data, delay=$delay, expiry=$expiry, metadata=$metadata, preferences=$preferences, providers=$providers, routing=$routing, timeout=$timeout, to=$to, template=$template, additionalProperties=$additionalProperties}"
    }
}
