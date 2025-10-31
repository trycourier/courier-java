// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.getOrThrow
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.ElementalContent
import com.courier.api.models.ElementalContentSugar
import com.courier.api.models.MessageContext
import com.courier.api.models.MessageRouting
import com.courier.api.models.MessageRoutingChannel
import com.courier.api.models.Recipient
import com.courier.api.models.UserRecipient
import com.courier.api.models.Utm
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

/** API to send a message to one or more recipients. */
class SendMessageParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The message property has the following primary top-level properties. They define the
     * destination and content of the message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): Message = body.message()

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _message(): JsonField<Message> = body._message()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SendMessageParams].
         *
         * The following fields are required:
         * ```java
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SendMessageParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sendMessageParams: SendMessageParams) = apply {
            body = sendMessageParams.body.toBuilder()
            additionalHeaders = sendMessageParams.additionalHeaders.toBuilder()
            additionalQueryParams = sendMessageParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [message]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The message property has the following primary top-level properties. They define the
         * destination and content of the message.
         */
        fun message(message: Message) = apply { body.message(message) }

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [Message] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<Message>) = apply { body.message(message) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SendMessageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SendMessageParams =
            SendMessageParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val message: JsonField<Message>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of()
        ) : this(message, mutableMapOf())

        /**
         * The message property has the following primary top-level properties. They define the
         * destination and content of the message.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): Message = message.getRequired("message")

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var message: JsonField<Message>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                message = body.message
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The message property has the following primary top-level properties. They define the
             * destination and content of the message.
             */
            fun message(message: Message) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [Message] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<Message>) = apply { this.message = message }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("message", message), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            message().validate()
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
        internal fun validity(): Int = (message.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(message, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{message=$message, additionalProperties=$additionalProperties}"
    }

    /**
     * The message property has the following primary top-level properties. They define the
     * destination and content of the message.
     */
    class Message
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val brandId: JsonField<String>,
        private val channels: JsonField<Channels>,
        private val content: JsonField<Content>,
        private val context: JsonField<MessageContext>,
        private val data: JsonField<Data>,
        private val delay: JsonField<Delay>,
        private val expiry: JsonField<Expiry>,
        private val metadata: JsonField<Metadata>,
        private val preferences: JsonField<Preferences>,
        private val providers: JsonField<Providers>,
        private val routing: JsonField<Routing>,
        private val template: JsonField<String>,
        private val timeout: JsonField<Timeout>,
        private val to: JsonField<To>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channels")
            @ExcludeMissing
            channels: JsonField<Channels> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("context")
            @ExcludeMissing
            context: JsonField<MessageContext> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("delay") @ExcludeMissing delay: JsonField<Delay> = JsonMissing.of(),
            @JsonProperty("expiry") @ExcludeMissing expiry: JsonField<Expiry> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("preferences")
            @ExcludeMissing
            preferences: JsonField<Preferences> = JsonMissing.of(),
            @JsonProperty("providers")
            @ExcludeMissing
            providers: JsonField<Providers> = JsonMissing.of(),
            @JsonProperty("routing") @ExcludeMissing routing: JsonField<Routing> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Timeout> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
        ) : this(
            brandId,
            channels,
            content,
            context,
            data,
            delay,
            expiry,
            metadata,
            preferences,
            providers,
            routing,
            template,
            timeout,
            to,
            mutableMapOf(),
        )

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brand_id")

        /**
         * Define run-time configuration for channels. Valid ChannelId's: email, sms, push, inbox,
         * direct_message, banner, webhook.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channels(): Optional<Channels> = channels.getOptional("channels")

        /**
         * Describes content that will work for email, inbox, push, chat, or any channel id.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<Content> = content.getOptional("content")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<MessageContext> = context.getOptional("context")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun delay(): Optional<Delay> = delay.getOptional("delay")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiry(): Optional<Expiry> = expiry.getOptional("expiry")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferences(): Optional<Preferences> = preferences.getOptional("preferences")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providers(): Optional<Providers> = providers.getOptional("providers")

        /**
         * Customize which channels/providers Courier may deliver the message through.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routing(): Optional<Routing> = routing.getOptional("routing")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun template(): Optional<String> = template.getOptional("template")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Timeout> = timeout.getOptional("timeout")

        /**
         * The recipient or a list of recipients of the message
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<To> = to.getOptional("to")

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
        @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Channels> = channels

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
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<MessageContext> = context

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [delay].
         *
         * Unlike [delay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delay") @ExcludeMissing fun _delay(): JsonField<Delay> = delay

        /**
         * Returns the raw JSON value of [expiry].
         *
         * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiry") @ExcludeMissing fun _expiry(): JsonField<Expiry> = expiry

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [preferences].
         *
         * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preferences")
        @ExcludeMissing
        fun _preferences(): JsonField<Preferences> = preferences

        /**
         * Returns the raw JSON value of [providers].
         *
         * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("providers")
        @ExcludeMissing
        fun _providers(): JsonField<Providers> = providers

        /**
         * Returns the raw JSON value of [routing].
         *
         * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routing") @ExcludeMissing fun _routing(): JsonField<Routing> = routing

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Timeout> = timeout

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

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

            /** Returns a mutable builder for constructing an instance of [Message]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var brandId: JsonField<String> = JsonMissing.of()
            private var channels: JsonField<Channels> = JsonMissing.of()
            private var content: JsonField<Content> = JsonMissing.of()
            private var context: JsonField<MessageContext> = JsonMissing.of()
            private var data: JsonField<Data> = JsonMissing.of()
            private var delay: JsonField<Delay> = JsonMissing.of()
            private var expiry: JsonField<Expiry> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var preferences: JsonField<Preferences> = JsonMissing.of()
            private var providers: JsonField<Providers> = JsonMissing.of()
            private var routing: JsonField<Routing> = JsonMissing.of()
            private var template: JsonField<String> = JsonMissing.of()
            private var timeout: JsonField<Timeout> = JsonMissing.of()
            private var to: JsonField<To> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                brandId = message.brandId
                channels = message.channels
                content = message.content
                context = message.context
                data = message.data
                delay = message.delay
                expiry = message.expiry
                metadata = message.metadata
                preferences = message.preferences
                providers = message.providers
                routing = message.routing
                template = message.template
                timeout = message.timeout
                to = message.to
                additionalProperties = message.additionalProperties.toMutableMap()
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
             * Define run-time configuration for channels. Valid ChannelId's: email, sms, push,
             * inbox, direct_message, banner, webhook.
             */
            fun channels(channels: Channels?) = channels(JsonField.ofNullable(channels))

            /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
            fun channels(channels: Optional<Channels>) = channels(channels.getOrNull())

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed [Channels] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

            /** Describes content that will work for email, inbox, push, chat, or any channel id. */
            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun data(data: Data?) = data(JsonField.ofNullable(data))

            /** Alias for calling [Builder.data] with `data.orElse(null)`. */
            fun data(data: Optional<Data>) = data(data.getOrNull())

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            fun delay(delay: Delay?) = delay(JsonField.ofNullable(delay))

            /** Alias for calling [Builder.delay] with `delay.orElse(null)`. */
            fun delay(delay: Optional<Delay>) = delay(delay.getOrNull())

            /**
             * Sets [Builder.delay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delay] with a well-typed [Delay] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun delay(delay: JsonField<Delay>) = apply { this.delay = delay }

            fun expiry(expiry: Expiry?) = expiry(JsonField.ofNullable(expiry))

            /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
            fun expiry(expiry: Optional<Expiry>) = expiry(expiry.getOrNull())

            /**
             * Sets [Builder.expiry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiry] with a well-typed [Expiry] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiry(expiry: JsonField<Expiry>) = apply { this.expiry = expiry }

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun preferences(preferences: Preferences?) =
                preferences(JsonField.ofNullable(preferences))

            /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
            fun preferences(preferences: Optional<Preferences>) =
                preferences(preferences.getOrNull())

            /**
             * Sets [Builder.preferences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferences] with a well-typed [Preferences] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preferences(preferences: JsonField<Preferences>) = apply {
                this.preferences = preferences
            }

            fun providers(providers: Providers?) = providers(JsonField.ofNullable(providers))

            /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
            fun providers(providers: Optional<Providers>) = providers(providers.getOrNull())

            /**
             * Sets [Builder.providers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providers] with a well-typed [Providers] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providers(providers: JsonField<Providers>) = apply { this.providers = providers }

            /** Customize which channels/providers Courier may deliver the message through. */
            fun routing(routing: Routing?) = routing(JsonField.ofNullable(routing))

            /** Alias for calling [Builder.routing] with `routing.orElse(null)`. */
            fun routing(routing: Optional<Routing>) = routing(routing.getOrNull())

            /**
             * Sets [Builder.routing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routing] with a well-typed [Routing] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routing(routing: JsonField<Routing>) = apply { this.routing = routing }

            fun template(template: String?) = template(JsonField.ofNullable(template))

            /** Alias for calling [Builder.template] with `template.orElse(null)`. */
            fun template(template: Optional<String>) = template(template.getOrNull())

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

            fun timeout(timeout: Timeout?) = timeout(JsonField.ofNullable(timeout))

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Timeout>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Timeout] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Timeout>) = apply { this.timeout = timeout }

            /** The recipient or a list of recipients of the message */
            fun to(to: To?) = to(JsonField.ofNullable(to))

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<To>) = to(to.getOrNull())

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [To] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<To>) = apply { this.to = to }

            /** Alias for calling [to] with `To.ofUserRecipient(userRecipient)`. */
            fun to(userRecipient: UserRecipient) = to(To.ofUserRecipient(userRecipient))

            /** Alias for calling [to] with `To.ofRecipients(recipients)`. */
            fun toOfRecipients(recipients: List<Recipient>) = to(To.ofRecipients(recipients))

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
             * Returns an immutable instance of [Message].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Message =
                Message(
                    brandId,
                    channels,
                    content,
                    context,
                    data,
                    delay,
                    expiry,
                    metadata,
                    preferences,
                    providers,
                    routing,
                    template,
                    timeout,
                    to,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            brandId()
            channels().ifPresent { it.validate() }
            content().ifPresent { it.validate() }
            context().ifPresent { it.validate() }
            data().ifPresent { it.validate() }
            delay().ifPresent { it.validate() }
            expiry().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            preferences().ifPresent { it.validate() }
            providers().ifPresent { it.validate() }
            routing().ifPresent { it.validate() }
            template()
            timeout().ifPresent { it.validate() }
            to().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                (context.asKnown().getOrNull()?.validity() ?: 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (delay.asKnown().getOrNull()?.validity() ?: 0) +
                (expiry.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (preferences.asKnown().getOrNull()?.validity() ?: 0) +
                (providers.asKnown().getOrNull()?.validity() ?: 0) +
                (routing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (template.asKnown().isPresent) 1 else 0) +
                (timeout.asKnown().getOrNull()?.validity() ?: 0) +
                (to.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Define run-time configuration for channels. Valid ChannelId's: email, sms, push, inbox,
         * direct_message, banner, webhook.
         */
        class Channels
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

                /** Returns a mutable builder for constructing an instance of [Channels]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Channels]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(channels: Channels) = apply {
                    additionalProperties = channels.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Channels].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Channels = Channels(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Channels = apply {
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

                return other is Channels && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Channels{additionalProperties=$additionalProperties}"
        }

        /** Describes content that will work for email, inbox, push, chat, or any channel id. */
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

                        override fun visitElemental(elemental: ElementalContent) =
                            elemental.validity()

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

                @JvmStatic
                fun ofElemental(elemental: ElementalContent) = Content(elemental = elemental)
            }

            /**
             * An interface that defines how to map each variant of [Content] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** Syntactic sugar to provide a fast shorthand for Courier Elemental Blocks. */
                fun visitElementalContentSugar(elementalContentSugar: ElementalContentSugar): T

                fun visitElemental(elemental: ElementalContent): T

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
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
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

        class Delay
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val duration: JsonField<Long>,
            private val until: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("until") @ExcludeMissing until: JsonField<String> = JsonMissing.of(),
            ) : this(duration, until, mutableMapOf())

            /**
             * The duration of the delay in milliseconds.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun duration(): Optional<Long> = duration.getOptional("duration")

            /**
             * ISO 8601 timestamp or opening_hours-like format.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun until(): Optional<String> = until.getOptional("until")

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

            /**
             * Returns the raw JSON value of [until].
             *
             * Unlike [until], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("until") @ExcludeMissing fun _until(): JsonField<String> = until

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

                /** Returns a mutable builder for constructing an instance of [Delay]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Delay]. */
            class Builder internal constructor() {

                private var duration: JsonField<Long> = JsonMissing.of()
                private var until: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(delay: Delay) = apply {
                    duration = delay.duration
                    until = delay.until
                    additionalProperties = delay.additionalProperties.toMutableMap()
                }

                /** The duration of the delay in milliseconds. */
                fun duration(duration: Long?) = duration(JsonField.ofNullable(duration))

                /**
                 * Alias for [Builder.duration].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun duration(duration: Long) = duration(duration as Long?)

                /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
                fun duration(duration: Optional<Long>) = duration(duration.getOrNull())

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

                /** ISO 8601 timestamp or opening_hours-like format. */
                fun until(until: String?) = until(JsonField.ofNullable(until))

                /** Alias for calling [Builder.until] with `until.orElse(null)`. */
                fun until(until: Optional<String>) = until(until.getOrNull())

                /**
                 * Sets [Builder.until] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.until] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun until(until: JsonField<String>) = apply { this.until = until }

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
                 * Returns an immutable instance of [Delay].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Delay = Delay(duration, until, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Delay = apply {
                if (validated) {
                    return@apply
                }

                duration()
                until()
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
                (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (until.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Delay &&
                    duration == other.duration &&
                    until == other.until &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(duration, until, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Delay{duration=$duration, until=$until, additionalProperties=$additionalProperties}"
        }

        class Expiry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val expiresIn: JsonField<ExpiresIn>,
            private val expiresAt: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("expires_in")
                @ExcludeMissing
                expiresIn: JsonField<ExpiresIn> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<String> = JsonMissing.of(),
            ) : this(expiresIn, expiresAt, mutableMapOf())

            /**
             * Duration in ms or ISO8601 duration (e.g. P1DT4H).
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expiresIn(): ExpiresIn = expiresIn.getRequired("expires_in")

            /**
             * Epoch or ISO8601 timestamp with timezone.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

            /**
             * Returns the raw JSON value of [expiresIn].
             *
             * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_in")
            @ExcludeMissing
            fun _expiresIn(): JsonField<ExpiresIn> = expiresIn

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<String> = expiresAt

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
                 * Returns a mutable builder for constructing an instance of [Expiry].
                 *
                 * The following fields are required:
                 * ```java
                 * .expiresIn()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Expiry]. */
            class Builder internal constructor() {

                private var expiresIn: JsonField<ExpiresIn>? = null
                private var expiresAt: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(expiry: Expiry) = apply {
                    expiresIn = expiry.expiresIn
                    expiresAt = expiry.expiresAt
                    additionalProperties = expiry.additionalProperties.toMutableMap()
                }

                /** Duration in ms or ISO8601 duration (e.g. P1DT4H). */
                fun expiresIn(expiresIn: ExpiresIn) = expiresIn(JsonField.of(expiresIn))

                /**
                 * Sets [Builder.expiresIn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresIn] with a well-typed [ExpiresIn] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expiresIn(expiresIn: JsonField<ExpiresIn>) = apply {
                    this.expiresIn = expiresIn
                }

                /** Alias for calling [expiresIn] with `ExpiresIn.ofString(string)`. */
                fun expiresIn(string: String) = expiresIn(ExpiresIn.ofString(string))

                /** Alias for calling [expiresIn] with `ExpiresIn.ofInteger(integer)`. */
                fun expiresIn(integer: Long) = expiresIn(ExpiresIn.ofInteger(integer))

                /** Epoch or ISO8601 timestamp with timezone. */
                fun expiresAt(expiresAt: String?) = expiresAt(JsonField.ofNullable(expiresAt))

                /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
                fun expiresAt(expiresAt: Optional<String>) = expiresAt(expiresAt.getOrNull())

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

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
                 * Returns an immutable instance of [Expiry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .expiresIn()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Expiry =
                    Expiry(
                        checkRequired("expiresIn", expiresIn),
                        expiresAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Expiry = apply {
                if (validated) {
                    return@apply
                }

                expiresIn().validate()
                expiresAt()
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
                (expiresIn.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (expiresAt.asKnown().isPresent) 1 else 0)

            /** Duration in ms or ISO8601 duration (e.g. P1DT4H). */
            @JsonDeserialize(using = ExpiresIn.Deserializer::class)
            @JsonSerialize(using = ExpiresIn.Serializer::class)
            class ExpiresIn
            private constructor(
                private val string: String? = null,
                private val integer: Long? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun isString(): Boolean = string != null

                fun isInteger(): Boolean = integer != null

                fun asString(): String = string.getOrThrow("string")

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        integer != null -> visitor.visitInteger(integer)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): ExpiresIn = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitInteger(integer: Long) {}
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

                            override fun visitInteger(integer: Long) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ExpiresIn && string == other.string && integer == other.integer
                }

                override fun hashCode(): Int = Objects.hash(string, integer)

                override fun toString(): String =
                    when {
                        string != null -> "ExpiresIn{string=$string}"
                        integer != null -> "ExpiresIn{integer=$integer}"
                        _json != null -> "ExpiresIn{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ExpiresIn")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = ExpiresIn(string = string)

                    @JvmStatic fun ofInteger(integer: Long) = ExpiresIn(integer = integer)
                }

                /**
                 * An interface that defines how to map each variant of [ExpiresIn] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitInteger(integer: Long): T

                    /**
                     * Maps an unknown variant of [ExpiresIn] to a value of type [T].
                     *
                     * An instance of [ExpiresIn] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws CourierInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw CourierInvalidDataException("Unknown ExpiresIn: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<ExpiresIn>(ExpiresIn::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ExpiresIn {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        ExpiresIn(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        ExpiresIn(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> ExpiresIn(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<ExpiresIn>(ExpiresIn::class) {

                    override fun serialize(
                        value: ExpiresIn,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.integer != null -> generator.writeObject(value.integer)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ExpiresIn")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Expiry &&
                    expiresIn == other.expiresIn &&
                    expiresAt == other.expiresAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(expiresIn, expiresAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Expiry{expiresIn=$expiresIn, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
        }

        class Metadata
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val event: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val traceId: JsonField<String>,
            private val utm: JsonField<Utm>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("trace_id")
                @ExcludeMissing
                traceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("utm") @ExcludeMissing utm: JsonField<Utm> = JsonMissing.of(),
            ) : this(event, tags, traceId, utm, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun event(): Optional<String> = event.getOptional("event")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun traceId(): Optional<String> = traceId.getOptional("trace_id")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun utm(): Optional<Utm> = utm.getOptional("utm")

            /**
             * Returns the raw JSON value of [event].
             *
             * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [traceId].
             *
             * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

            /**
             * Returns the raw JSON value of [utm].
             *
             * Unlike [utm], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("utm") @ExcludeMissing fun _utm(): JsonField<Utm> = utm

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

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var event: JsonField<String> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var traceId: JsonField<String> = JsonMissing.of()
                private var utm: JsonField<Utm> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    event = metadata.event
                    tags = metadata.tags.map { it.toMutableList() }
                    traceId = metadata.traceId
                    utm = metadata.utm
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun event(event: String?) = event(JsonField.ofNullable(event))

                /** Alias for calling [Builder.event] with `event.orElse(null)`. */
                fun event(event: Optional<String>) = event(event.getOrNull())

                /**
                 * Sets [Builder.event] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.event] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun event(event: JsonField<String>) = apply { this.event = event }

                fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

                /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
                fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                fun traceId(traceId: String?) = traceId(JsonField.ofNullable(traceId))

                /** Alias for calling [Builder.traceId] with `traceId.orElse(null)`. */
                fun traceId(traceId: Optional<String>) = traceId(traceId.getOrNull())

                /**
                 * Sets [Builder.traceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun utm(utm: Utm?) = utm(JsonField.ofNullable(utm))

                /** Alias for calling [Builder.utm] with `utm.orElse(null)`. */
                fun utm(utm: Optional<Utm>) = utm(utm.getOrNull())

                /**
                 * Sets [Builder.utm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.utm] with a well-typed [Utm] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun utm(utm: JsonField<Utm>) = apply { this.utm = utm }

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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata =
                    Metadata(
                        event,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        traceId,
                        utm,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                event()
                tags()
                traceId()
                utm().ifPresent { it.validate() }
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
                (if (event.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (traceId.asKnown().isPresent) 1 else 0) +
                    (utm.asKnown().getOrNull()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata &&
                    event == other.event &&
                    tags == other.tags &&
                    traceId == other.traceId &&
                    utm == other.utm &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(event, tags, traceId, utm, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Metadata{event=$event, tags=$tags, traceId=$traceId, utm=$utm, additionalProperties=$additionalProperties}"
        }

        class Preferences
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val subscriptionTopicId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subscription_topic_id")
                @ExcludeMissing
                subscriptionTopicId: JsonField<String> = JsonMissing.of()
            ) : this(subscriptionTopicId, mutableMapOf())

            /**
             * The subscription topic to apply to the message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionTopicId(): String =
                subscriptionTopicId.getRequired("subscription_topic_id")

            /**
             * Returns the raw JSON value of [subscriptionTopicId].
             *
             * Unlike [subscriptionTopicId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_topic_id")
            @ExcludeMissing
            fun _subscriptionTopicId(): JsonField<String> = subscriptionTopicId

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
                 * Returns a mutable builder for constructing an instance of [Preferences].
                 *
                 * The following fields are required:
                 * ```java
                 * .subscriptionTopicId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Preferences]. */
            class Builder internal constructor() {

                private var subscriptionTopicId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(preferences: Preferences) = apply {
                    subscriptionTopicId = preferences.subscriptionTopicId
                    additionalProperties = preferences.additionalProperties.toMutableMap()
                }

                /** The subscription topic to apply to the message. */
                fun subscriptionTopicId(subscriptionTopicId: String) =
                    subscriptionTopicId(JsonField.of(subscriptionTopicId))

                /**
                 * Sets [Builder.subscriptionTopicId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionTopicId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subscriptionTopicId(subscriptionTopicId: JsonField<String>) = apply {
                    this.subscriptionTopicId = subscriptionTopicId
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
                 * Returns an immutable instance of [Preferences].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .subscriptionTopicId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Preferences =
                    Preferences(
                        checkRequired("subscriptionTopicId", subscriptionTopicId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Preferences = apply {
                if (validated) {
                    return@apply
                }

                subscriptionTopicId()
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
            internal fun validity(): Int = (if (subscriptionTopicId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Preferences &&
                    subscriptionTopicId == other.subscriptionTopicId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(subscriptionTopicId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Preferences{subscriptionTopicId=$subscriptionTopicId, additionalProperties=$additionalProperties}"
        }

        class Providers
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

                /** Returns a mutable builder for constructing an instance of [Providers]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Providers]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providers: Providers) = apply {
                    additionalProperties = providers.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Providers].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Providers = Providers(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Providers = apply {
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

                return other is Providers && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Providers{additionalProperties=$additionalProperties}"
        }

        /** Customize which channels/providers Courier may deliver the message through. */
        class Routing
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val channels: JsonField<List<MessageRoutingChannel>>,
            private val method: JsonField<Method>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("channels")
                @ExcludeMissing
                channels: JsonField<List<MessageRoutingChannel>> = JsonMissing.of(),
                @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            ) : this(channels, method, mutableMapOf())

            /**
             * A list of channels or providers (or nested routing rules).
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun channels(): List<MessageRoutingChannel> = channels.getRequired("channels")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun method(): Method = method.getRequired("method")

            /**
             * Returns the raw JSON value of [channels].
             *
             * Unlike [channels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("channels")
            @ExcludeMissing
            fun _channels(): JsonField<List<MessageRoutingChannel>> = channels

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

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
                 * Returns a mutable builder for constructing an instance of [Routing].
                 *
                 * The following fields are required:
                 * ```java
                 * .channels()
                 * .method()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Routing]. */
            class Builder internal constructor() {

                private var channels: JsonField<MutableList<MessageRoutingChannel>>? = null
                private var method: JsonField<Method>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(routing: Routing) = apply {
                    channels = routing.channels.map { it.toMutableList() }
                    method = routing.method
                    additionalProperties = routing.additionalProperties.toMutableMap()
                }

                /** A list of channels or providers (or nested routing rules). */
                fun channels(channels: List<MessageRoutingChannel>) =
                    channels(JsonField.of(channels))

                /**
                 * Sets [Builder.channels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channels] with a well-typed
                 * `List<MessageRoutingChannel>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun channels(channels: JsonField<List<MessageRoutingChannel>>) = apply {
                    this.channels = channels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [MessageRoutingChannel] to [channels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addChannel(channel: MessageRoutingChannel) = apply {
                    channels =
                        (channels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("channels", it).add(channel)
                        }
                }

                /** Alias for calling [addChannel] with `MessageRoutingChannel.ofString(string)`. */
                fun addChannel(string: String) = addChannel(MessageRoutingChannel.ofString(string))

                /**
                 * Alias for calling [addChannel] with
                 * `MessageRoutingChannel.ofMessageRouting(messageRouting)`.
                 */
                fun addChannel(messageRouting: MessageRouting) =
                    addChannel(MessageRoutingChannel.ofMessageRouting(messageRouting))

                fun method(method: Method) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [Method] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<Method>) = apply { this.method = method }

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
                 * Returns an immutable instance of [Routing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .channels()
                 * .method()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Routing =
                    Routing(
                        checkRequired("channels", channels).map { it.toImmutable() },
                        checkRequired("method", method),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Routing = apply {
                if (validated) {
                    return@apply
                }

                channels().forEach { it.validate() }
                method().validate()
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
                (channels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (method.asKnown().getOrNull()?.validity() ?: 0)

            class Method @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ALL = of("all")

                    @JvmField val SINGLE = of("single")

                    @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                }

                /** An enum containing [Method]'s known values. */
                enum class Known {
                    ALL,
                    SINGLE,
                }

                /**
                 * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Method] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALL,
                    SINGLE,
                    /**
                     * An enum member indicating that [Method] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ALL -> Value.ALL
                        SINGLE -> Value.SINGLE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ALL -> Known.ALL
                        SINGLE -> Known.SINGLE
                        else -> throw CourierInvalidDataException("Unknown Method: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Method = apply {
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

                    return other is Method && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Routing &&
                    channels == other.channels &&
                    method == other.method &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(channels, method, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Routing{channels=$channels, method=$method, additionalProperties=$additionalProperties}"
        }

        class Timeout
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val channel: JsonField<Channel>,
            private val criteria: JsonField<Criteria>,
            private val escalation: JsonField<Long>,
            private val message: JsonField<Long>,
            private val provider: JsonField<Provider>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("channel")
                @ExcludeMissing
                channel: JsonField<Channel> = JsonMissing.of(),
                @JsonProperty("criteria")
                @ExcludeMissing
                criteria: JsonField<Criteria> = JsonMissing.of(),
                @JsonProperty("escalation")
                @ExcludeMissing
                escalation: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<Provider> = JsonMissing.of(),
            ) : this(channel, criteria, escalation, message, provider, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun channel(): Optional<Channel> = channel.getOptional("channel")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun criteria(): Optional<Criteria> = criteria.getOptional("criteria")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun escalation(): Optional<Long> = escalation.getOptional("escalation")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<Long> = message.getOptional("message")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun provider(): Optional<Provider> = provider.getOptional("provider")

            /**
             * Returns the raw JSON value of [channel].
             *
             * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

            /**
             * Returns the raw JSON value of [criteria].
             *
             * Unlike [criteria], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("criteria")
            @ExcludeMissing
            fun _criteria(): JsonField<Criteria> = criteria

            /**
             * Returns the raw JSON value of [escalation].
             *
             * Unlike [escalation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("escalation")
            @ExcludeMissing
            fun _escalation(): JsonField<Long> = escalation

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Long> = message

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): JsonField<Provider> = provider

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

                /** Returns a mutable builder for constructing an instance of [Timeout]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Timeout]. */
            class Builder internal constructor() {

                private var channel: JsonField<Channel> = JsonMissing.of()
                private var criteria: JsonField<Criteria> = JsonMissing.of()
                private var escalation: JsonField<Long> = JsonMissing.of()
                private var message: JsonField<Long> = JsonMissing.of()
                private var provider: JsonField<Provider> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(timeout: Timeout) = apply {
                    channel = timeout.channel
                    criteria = timeout.criteria
                    escalation = timeout.escalation
                    message = timeout.message
                    provider = timeout.provider
                    additionalProperties = timeout.additionalProperties.toMutableMap()
                }

                fun channel(channel: Channel?) = channel(JsonField.ofNullable(channel))

                /** Alias for calling [Builder.channel] with `channel.orElse(null)`. */
                fun channel(channel: Optional<Channel>) = channel(channel.getOrNull())

                /**
                 * Sets [Builder.channel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channel] with a well-typed [Channel] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

                fun criteria(criteria: Criteria?) = criteria(JsonField.ofNullable(criteria))

                /** Alias for calling [Builder.criteria] with `criteria.orElse(null)`. */
                fun criteria(criteria: Optional<Criteria>) = criteria(criteria.getOrNull())

                /**
                 * Sets [Builder.criteria] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.criteria] with a well-typed [Criteria] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun criteria(criteria: JsonField<Criteria>) = apply { this.criteria = criteria }

                fun escalation(escalation: Long?) = escalation(JsonField.ofNullable(escalation))

                /**
                 * Alias for [Builder.escalation].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun escalation(escalation: Long) = escalation(escalation as Long?)

                /** Alias for calling [Builder.escalation] with `escalation.orElse(null)`. */
                fun escalation(escalation: Optional<Long>) = escalation(escalation.getOrNull())

                /**
                 * Sets [Builder.escalation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.escalation] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun escalation(escalation: JsonField<Long>) = apply { this.escalation = escalation }

                fun message(message: Long?) = message(JsonField.ofNullable(message))

                /**
                 * Alias for [Builder.message].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun message(message: Long) = message(message as Long?)

                /** Alias for calling [Builder.message] with `message.orElse(null)`. */
                fun message(message: Optional<Long>) = message(message.getOrNull())

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun message(message: JsonField<Long>) = apply { this.message = message }

                fun provider(provider: Provider?) = provider(JsonField.ofNullable(provider))

                /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
                fun provider(provider: Optional<Provider>) = provider(provider.getOrNull())

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [Timeout].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Timeout =
                    Timeout(
                        channel,
                        criteria,
                        escalation,
                        message,
                        provider,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Timeout = apply {
                if (validated) {
                    return@apply
                }

                channel().ifPresent { it.validate() }
                criteria().ifPresent { it.validate() }
                escalation()
                message()
                provider().ifPresent { it.validate() }
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
                (channel.asKnown().getOrNull()?.validity() ?: 0) +
                    (criteria.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (escalation.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (provider.asKnown().getOrNull()?.validity() ?: 0)

            class Channel
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

                    /** Returns a mutable builder for constructing an instance of [Channel]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Channel]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(channel: Channel) = apply {
                        additionalProperties = channel.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Channel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Channel = Channel(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Channel = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Channel && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Channel{additionalProperties=$additionalProperties}"
            }

            class Criteria @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NO_ESCALATION = of("no-escalation")

                    @JvmField val DELIVERED = of("delivered")

                    @JvmField val VIEWED = of("viewed")

                    @JvmField val ENGAGED = of("engaged")

                    @JvmStatic fun of(value: String) = Criteria(JsonField.of(value))
                }

                /** An enum containing [Criteria]'s known values. */
                enum class Known {
                    NO_ESCALATION,
                    DELIVERED,
                    VIEWED,
                    ENGAGED,
                }

                /**
                 * An enum containing [Criteria]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Criteria] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NO_ESCALATION,
                    DELIVERED,
                    VIEWED,
                    ENGAGED,
                    /**
                     * An enum member indicating that [Criteria] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NO_ESCALATION -> Value.NO_ESCALATION
                        DELIVERED -> Value.DELIVERED
                        VIEWED -> Value.VIEWED
                        ENGAGED -> Value.ENGAGED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NO_ESCALATION -> Known.NO_ESCALATION
                        DELIVERED -> Known.DELIVERED
                        VIEWED -> Known.VIEWED
                        ENGAGED -> Known.ENGAGED
                        else -> throw CourierInvalidDataException("Unknown Criteria: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Criteria = apply {
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

                    return other is Criteria && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Provider
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

                    /** Returns a mutable builder for constructing an instance of [Provider]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Provider]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(provider: Provider) = apply {
                        additionalProperties = provider.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Provider].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Provider = Provider(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Provider = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Provider && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Provider{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Timeout &&
                    channel == other.channel &&
                    criteria == other.criteria &&
                    escalation == other.escalation &&
                    message == other.message &&
                    provider == other.provider &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(channel, criteria, escalation, message, provider, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Timeout{channel=$channel, criteria=$criteria, escalation=$escalation, message=$message, provider=$provider, additionalProperties=$additionalProperties}"
        }

        /** The recipient or a list of recipients of the message */
        @JsonDeserialize(using = To.Deserializer::class)
        @JsonSerialize(using = To.Serializer::class)
        class To
        private constructor(
            private val userRecipient: UserRecipient? = null,
            private val recipients: List<Recipient>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun userRecipient(): Optional<UserRecipient> = Optional.ofNullable(userRecipient)

            fun recipients(): Optional<List<Recipient>> = Optional.ofNullable(recipients)

            fun isUserRecipient(): Boolean = userRecipient != null

            fun isRecipients(): Boolean = recipients != null

            fun asUserRecipient(): UserRecipient = userRecipient.getOrThrow("userRecipient")

            fun asRecipients(): List<Recipient> = recipients.getOrThrow("recipients")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    userRecipient != null -> visitor.visitUserRecipient(userRecipient)
                    recipients != null -> visitor.visitRecipients(recipients)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): To = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUserRecipient(userRecipient: UserRecipient) {
                            userRecipient.validate()
                        }

                        override fun visitRecipients(recipients: List<Recipient>) {
                            recipients.forEach { it.validate() }
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
                        override fun visitUserRecipient(userRecipient: UserRecipient) =
                            userRecipient.validity()

                        override fun visitRecipients(recipients: List<Recipient>) =
                            recipients.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is To &&
                    userRecipient == other.userRecipient &&
                    recipients == other.recipients
            }

            override fun hashCode(): Int = Objects.hash(userRecipient, recipients)

            override fun toString(): String =
                when {
                    userRecipient != null -> "To{userRecipient=$userRecipient}"
                    recipients != null -> "To{recipients=$recipients}"
                    _json != null -> "To{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid To")
                }

            companion object {

                @JvmStatic
                fun ofUserRecipient(userRecipient: UserRecipient) =
                    To(userRecipient = userRecipient)

                @JvmStatic
                fun ofRecipients(recipients: List<Recipient>) =
                    To(recipients = recipients.toImmutable())
            }

            /** An interface that defines how to map each variant of [To] to a value of type [T]. */
            interface Visitor<out T> {

                fun visitUserRecipient(userRecipient: UserRecipient): T

                fun visitRecipients(recipients: List<Recipient>): T

                /**
                 * Maps an unknown variant of [To] to a value of type [T].
                 *
                 * An instance of [To] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws CourierInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw CourierInvalidDataException("Unknown To: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<To>(To::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): To {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<UserRecipient>())?.let {
                                    To(userRecipient = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<Recipient>>())?.let {
                                    To(recipients = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> To(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<To>(To::class) {

                override fun serialize(
                    value: To,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.userRecipient != null -> generator.writeObject(value.userRecipient)
                        value.recipients != null -> generator.writeObject(value.recipients)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid To")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                brandId == other.brandId &&
                channels == other.channels &&
                content == other.content &&
                context == other.context &&
                data == other.data &&
                delay == other.delay &&
                expiry == other.expiry &&
                metadata == other.metadata &&
                preferences == other.preferences &&
                providers == other.providers &&
                routing == other.routing &&
                template == other.template &&
                timeout == other.timeout &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                brandId,
                channels,
                content,
                context,
                data,
                delay,
                expiry,
                metadata,
                preferences,
                providers,
                routing,
                template,
                timeout,
                to,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Message{brandId=$brandId, channels=$channels, content=$content, context=$context, data=$data, delay=$delay, expiry=$expiry, metadata=$metadata, preferences=$preferences, providers=$providers, routing=$routing, template=$template, timeout=$timeout, to=$to, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SendMessageParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SendMessageParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
