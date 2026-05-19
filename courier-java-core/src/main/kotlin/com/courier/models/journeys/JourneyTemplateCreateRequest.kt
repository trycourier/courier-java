// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

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

/** Request body for creating a notification template scoped to a journey. */
class JourneyTemplateCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channel: JsonField<String>,
    private val notification: JsonField<Notification>,
    private val providerKey: JsonField<String>,
    private val state: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notification")
        @ExcludeMissing
        notification: JsonField<Notification> = JsonMissing.of(),
        @JsonProperty("providerKey")
        @ExcludeMissing
        providerKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
    ) : this(channel, notification, providerKey, state, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): String = channel.getRequired("channel")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notification(): Notification = notification.getRequired("notification")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerKey(): Optional<String> = providerKey.getOptional("providerKey")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

    /**
     * Returns the raw JSON value of [notification].
     *
     * Unlike [notification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notification")
    @ExcludeMissing
    fun _notification(): JsonField<Notification> = notification

    /**
     * Returns the raw JSON value of [providerKey].
     *
     * Unlike [providerKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providerKey") @ExcludeMissing fun _providerKey(): JsonField<String> = providerKey

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
         * Returns a mutable builder for constructing an instance of [JourneyTemplateCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .notification()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyTemplateCreateRequest]. */
    class Builder internal constructor() {

        private var channel: JsonField<String>? = null
        private var notification: JsonField<Notification>? = null
        private var providerKey: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyTemplateCreateRequest: JourneyTemplateCreateRequest) = apply {
            channel = journeyTemplateCreateRequest.channel
            notification = journeyTemplateCreateRequest.notification
            providerKey = journeyTemplateCreateRequest.providerKey
            state = journeyTemplateCreateRequest.state
            additionalProperties = journeyTemplateCreateRequest.additionalProperties.toMutableMap()
        }

        fun channel(channel: String) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<String>) = apply { this.channel = channel }

        fun notification(notification: Notification) = notification(JsonField.of(notification))

        /**
         * Sets [Builder.notification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notification] with a well-typed [Notification] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notification(notification: JsonField<Notification>) = apply {
            this.notification = notification
        }

        fun providerKey(providerKey: String) = providerKey(JsonField.of(providerKey))

        /**
         * Sets [Builder.providerKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerKey(providerKey: JsonField<String>) = apply { this.providerKey = providerKey }

        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

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
         * Returns an immutable instance of [JourneyTemplateCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .notification()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyTemplateCreateRequest =
            JourneyTemplateCreateRequest(
                checkRequired("channel", channel),
                checkRequired("notification", notification),
                providerKey,
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
    fun validate(): JourneyTemplateCreateRequest = apply {
        if (validated) {
            return@apply
        }

        channel()
        notification().validate()
        providerKey()
        state()
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
        (if (channel.asKnown().isPresent) 1 else 0) +
            (notification.asKnown().getOrNull()?.validity() ?: 0) +
            (if (providerKey.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0)

    class Notification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val brand: JsonField<Brand>,
        private val content: JsonField<Content>,
        private val name: JsonField<String>,
        private val subscription: JsonField<Subscription>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand") @ExcludeMissing brand: JsonField<Brand> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscription")
            @ExcludeMissing
            subscription: JsonField<Subscription> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(brand, content, name, subscription, tags, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brand(): Optional<Brand> = brand.getOptional("brand")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): Content = content.getRequired("content")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscription(): Optional<Subscription> = subscription.getOptional("subscription")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tags(): List<String> = tags.getRequired("tags")

        /**
         * Returns the raw JSON value of [brand].
         *
         * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<Brand> = brand

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [subscription].
         *
         * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun _subscription(): JsonField<Subscription> = subscription

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
             * Returns a mutable builder for constructing an instance of [Notification].
             *
             * The following fields are required:
             * ```java
             * .brand()
             * .content()
             * .name()
             * .subscription()
             * .tags()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Notification]. */
        class Builder internal constructor() {

            private var brand: JsonField<Brand>? = null
            private var content: JsonField<Content>? = null
            private var name: JsonField<String>? = null
            private var subscription: JsonField<Subscription>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notification: Notification) = apply {
                brand = notification.brand
                content = notification.content
                name = notification.name
                subscription = notification.subscription
                tags = notification.tags.map { it.toMutableList() }
                additionalProperties = notification.additionalProperties.toMutableMap()
            }

            fun brand(brand: Brand?) = brand(JsonField.ofNullable(brand))

            /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
            fun brand(brand: Optional<Brand>) = brand(brand.getOrNull())

            /**
             * Sets [Builder.brand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brand] with a well-typed [Brand] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun brand(brand: JsonField<Brand>) = apply { this.brand = brand }

            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun subscription(subscription: Subscription?) =
                subscription(JsonField.ofNullable(subscription))

            /** Alias for calling [Builder.subscription] with `subscription.orElse(null)`. */
            fun subscription(subscription: Optional<Subscription>) =
                subscription(subscription.getOrNull())

            /**
             * Sets [Builder.subscription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscription] with a well-typed [Subscription] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscription(subscription: JsonField<Subscription>) = apply {
                this.subscription = subscription
            }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * Returns an immutable instance of [Notification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .brand()
             * .content()
             * .name()
             * .subscription()
             * .tags()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Notification =
                Notification(
                    checkRequired("brand", brand),
                    checkRequired("content", content),
                    checkRequired("name", name),
                    checkRequired("subscription", subscription),
                    checkRequired("tags", tags).map { it.toImmutable() },
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
        fun validate(): Notification = apply {
            if (validated) {
                return@apply
            }

            brand().ifPresent { it.validate() }
            content().validate()
            name()
            subscription().ifPresent { it.validate() }
            tags()
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
            (brand.asKnown().getOrNull()?.validity() ?: 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (subscription.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        class Brand
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [Brand].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Brand]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(brand: Brand) = apply {
                    id = brand.id
                    additionalProperties = brand.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [Brand].
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
                fun build(): Brand =
                    Brand(checkRequired("id", id), additionalProperties.toMutableMap())
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
            fun validate(): Brand = apply {
                if (validated) {
                    return@apply
                }

                id()
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
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Brand &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Brand{id=$id, additionalProperties=$additionalProperties}"
        }

        class Content
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elements: JsonField<List<ElementalNode>>,
            private val version: JsonField<Version>,
            private val scope: JsonField<Scope>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elements")
                @ExcludeMissing
                elements: JsonField<List<ElementalNode>> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<Version> = JsonMissing.of(),
                @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            ) : this(elements, version, scope, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun elements(): List<ElementalNode> = elements.getRequired("elements")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun version(): Version = version.getRequired("version")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun scope(): Optional<Scope> = scope.getOptional("scope")

            /**
             * Returns the raw JSON value of [elements].
             *
             * Unlike [elements], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elements")
            @ExcludeMissing
            fun _elements(): JsonField<List<ElementalNode>> = elements

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Version> = version

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
                 * Returns a mutable builder for constructing an instance of [Content].
                 *
                 * The following fields are required:
                 * ```java
                 * .elements()
                 * .version()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Content]. */
            class Builder internal constructor() {

                private var elements: JsonField<MutableList<ElementalNode>>? = null
                private var version: JsonField<Version>? = null
                private var scope: JsonField<Scope> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(content: Content) = apply {
                    elements = content.elements.map { it.toMutableList() }
                    version = content.version
                    scope = content.scope
                    additionalProperties = content.additionalProperties.toMutableMap()
                }

                fun elements(elements: List<ElementalNode>) = elements(JsonField.of(elements))

                /**
                 * Sets [Builder.elements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elements] with a well-typed
                 * `List<ElementalNode>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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

                fun version(version: Version) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [Version] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun version(version: JsonField<Version>) = apply { this.version = version }

                fun scope(scope: Scope) = scope(JsonField.of(scope))

                /**
                 * Sets [Builder.scope] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scope] with a well-typed [Scope] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .elements()
                 * .version()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Content =
                    Content(
                        checkRequired("elements", elements).map { it.toImmutable() },
                        checkRequired("version", version),
                        scope,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                elements().forEach { it.validate() }
                version().validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (version.asKnown().getOrNull()?.validity() ?: 0) +
                    (scope.asKnown().getOrNull()?.validity() ?: 0)

            class Version @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val _2022_01_01 = of("2022-01-01")

                    @JvmStatic fun of(value: String) = Version(JsonField.of(value))
                }

                /** An enum containing [Version]'s known values. */
                enum class Known {
                    _2022_01_01
                }

                /**
                 * An enum containing [Version]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Version] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    _2022_01_01,
                    /**
                     * An enum member indicating that [Version] was instantiated with an unknown
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
                        _2022_01_01 -> Value._2022_01_01
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
                        _2022_01_01 -> Known._2022_01_01
                        else -> throw CourierInvalidDataException("Unknown Version: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws CourierInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Version = apply {
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

                    return other is Version && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Scope @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DEFAULT,
                    STRICT,
                    /**
                     * An enum member indicating that [Scope] was instantiated with an unknown
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
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws CourierInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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
                    version == other.version &&
                    scope == other.scope &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elements, version, scope, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Content{elements=$elements, version=$version, scope=$scope, additionalProperties=$additionalProperties}"
        }

        class Subscription
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val topicId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("topic_id")
                @ExcludeMissing
                topicId: JsonField<String> = JsonMissing.of()
            ) : this(topicId, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun topicId(): String = topicId.getRequired("topic_id")

            /**
             * Returns the raw JSON value of [topicId].
             *
             * Unlike [topicId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("topic_id") @ExcludeMissing fun _topicId(): JsonField<String> = topicId

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
                 * Returns a mutable builder for constructing an instance of [Subscription].
                 *
                 * The following fields are required:
                 * ```java
                 * .topicId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Subscription]. */
            class Builder internal constructor() {

                private var topicId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscription: Subscription) = apply {
                    topicId = subscription.topicId
                    additionalProperties = subscription.additionalProperties.toMutableMap()
                }

                fun topicId(topicId: String) = topicId(JsonField.of(topicId))

                /**
                 * Sets [Builder.topicId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topicId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

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
                 * Returns an immutable instance of [Subscription].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .topicId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Subscription =
                    Subscription(
                        checkRequired("topicId", topicId),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Subscription = apply {
                if (validated) {
                    return@apply
                }

                topicId()
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
            @JvmSynthetic internal fun validity(): Int = (if (topicId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subscription &&
                    topicId == other.topicId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(topicId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Subscription{topicId=$topicId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Notification &&
                brand == other.brand &&
                content == other.content &&
                name == other.name &&
                subscription == other.subscription &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(brand, content, name, subscription, tags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Notification{brand=$brand, content=$content, name=$name, subscription=$subscription, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyTemplateCreateRequest &&
            channel == other.channel &&
            notification == other.notification &&
            providerKey == other.providerKey &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(channel, notification, providerKey, state, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyTemplateCreateRequest{channel=$channel, notification=$notification, providerKey=$providerKey, state=$state, additionalProperties=$additionalProperties}"
}
