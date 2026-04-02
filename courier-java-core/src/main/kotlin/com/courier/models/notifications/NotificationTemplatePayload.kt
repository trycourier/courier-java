// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ElementalContent
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Full document shape used in POST and PUT request bodies, and returned inside the GET response
 * envelope.
 */
class NotificationTemplatePayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brand: JsonField<Brand>,
    private val content: JsonField<ElementalContent>,
    private val name: JsonField<String>,
    private val routing: JsonField<Routing>,
    private val subscription: JsonField<Subscription>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<Brand> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<ElementalContent> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing") @ExcludeMissing routing: JsonField<Routing> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<Subscription> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(brand, content, name, routing, subscription, tags, mutableMapOf())

    /**
     * Brand reference, or null for no brand.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<Brand> = brand.getOptional("brand")

    /**
     * Elemental content definition.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): ElementalContent = content.getRequired("content")

    /**
     * Display name for the template.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Routing strategy reference, or null for none.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routing(): Optional<Routing> = routing.getOptional("routing")

    /**
     * Subscription topic reference, or null for none.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscription(): Optional<Subscription> = subscription.getOptional("subscription")

    /**
     * Tags for categorization. Send empty array for none.
     *
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
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<ElementalContent> = content

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [routing].
     *
     * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing") @ExcludeMissing fun _routing(): JsonField<Routing> = routing

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [NotificationTemplatePayload].
         *
         * The following fields are required:
         * ```java
         * .brand()
         * .content()
         * .name()
         * .routing()
         * .subscription()
         * .tags()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationTemplatePayload]. */
    class Builder internal constructor() {

        private var brand: JsonField<Brand>? = null
        private var content: JsonField<ElementalContent>? = null
        private var name: JsonField<String>? = null
        private var routing: JsonField<Routing>? = null
        private var subscription: JsonField<Subscription>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationTemplatePayload: NotificationTemplatePayload) = apply {
            brand = notificationTemplatePayload.brand
            content = notificationTemplatePayload.content
            name = notificationTemplatePayload.name
            routing = notificationTemplatePayload.routing
            subscription = notificationTemplatePayload.subscription
            tags = notificationTemplatePayload.tags.map { it.toMutableList() }
            additionalProperties = notificationTemplatePayload.additionalProperties.toMutableMap()
        }

        /** Brand reference, or null for no brand. */
        fun brand(brand: Brand?) = brand(JsonField.ofNullable(brand))

        /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
        fun brand(brand: Optional<Brand>) = brand(brand.getOrNull())

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [Brand] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<Brand>) = apply { this.brand = brand }

        /** Elemental content definition. */
        fun content(content: ElementalContent) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [ElementalContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<ElementalContent>) = apply { this.content = content }

        /** Display name for the template. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Routing strategy reference, or null for none. */
        fun routing(routing: Routing?) = routing(JsonField.ofNullable(routing))

        /** Alias for calling [Builder.routing] with `routing.orElse(null)`. */
        fun routing(routing: Optional<Routing>) = routing(routing.getOrNull())

        /**
         * Sets [Builder.routing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routing] with a well-typed [Routing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun routing(routing: JsonField<Routing>) = apply { this.routing = routing }

        /** Subscription topic reference, or null for none. */
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

        /** Tags for categorization. Send empty array for none. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [NotificationTemplatePayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .brand()
         * .content()
         * .name()
         * .routing()
         * .subscription()
         * .tags()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationTemplatePayload =
            NotificationTemplatePayload(
                checkRequired("brand", brand),
                checkRequired("content", content),
                checkRequired("name", name),
                checkRequired("routing", routing),
                checkRequired("subscription", subscription),
                checkRequired("tags", tags).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationTemplatePayload = apply {
        if (validated) {
            return@apply
        }

        brand().ifPresent { it.validate() }
        content().validate()
        name()
        routing().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (brand.asKnown().getOrNull()?.validity() ?: 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (routing.asKnown().getOrNull()?.validity() ?: 0) +
            (subscription.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    /** Brand reference, or null for no brand. */
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
            fun build(): Brand = Brand(checkRequired("id", id), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

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

    /** Routing strategy reference, or null for none. */
    class Routing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val strategyId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("strategy_id")
            @ExcludeMissing
            strategyId: JsonField<String> = JsonMissing.of()
        ) : this(strategyId, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun strategyId(): String = strategyId.getRequired("strategy_id")

        /**
         * Returns the raw JSON value of [strategyId].
         *
         * Unlike [strategyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("strategy_id")
        @ExcludeMissing
        fun _strategyId(): JsonField<String> = strategyId

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
             * .strategyId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Routing]. */
        class Builder internal constructor() {

            private var strategyId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(routing: Routing) = apply {
                strategyId = routing.strategyId
                additionalProperties = routing.additionalProperties.toMutableMap()
            }

            fun strategyId(strategyId: String) = strategyId(JsonField.of(strategyId))

            /**
             * Sets [Builder.strategyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.strategyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun strategyId(strategyId: JsonField<String>) = apply { this.strategyId = strategyId }

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
             * Returns an immutable instance of [Routing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .strategyId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Routing =
                Routing(
                    checkRequired("strategyId", strategyId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Routing = apply {
            if (validated) {
                return@apply
            }

            strategyId()
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
        @JvmSynthetic internal fun validity(): Int = (if (strategyId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Routing &&
                strategyId == other.strategyId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(strategyId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Routing{strategyId=$strategyId, additionalProperties=$additionalProperties}"
    }

    /** Subscription topic reference, or null for none. */
    class Subscription
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val topicId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("topic_id") @ExcludeMissing topicId: JsonField<String> = JsonMissing.of()
        ) : this(topicId, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
             * You should usually call [Builder.topicId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

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
                Subscription(checkRequired("topicId", topicId), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

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

        return other is NotificationTemplatePayload &&
            brand == other.brand &&
            content == other.content &&
            name == other.name &&
            routing == other.routing &&
            subscription == other.subscription &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(brand, content, name, routing, subscription, tags, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationTemplatePayload{brand=$brand, content=$content, name=$name, routing=$routing, subscription=$subscription, tags=$tags, additionalProperties=$additionalProperties}"
}
