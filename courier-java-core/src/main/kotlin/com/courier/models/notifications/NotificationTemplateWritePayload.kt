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

/** Template fields accepted in POST and PUT request bodies, nested under a `notification` key. */
class NotificationTemplateWritePayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brand: JsonField<NotificationTemplatePayload.Brand>,
    private val content: JsonField<ElementalContent>,
    private val name: JsonField<String>,
    private val routing: JsonField<NotificationTemplatePayload.Routing>,
    private val subscription: JsonField<NotificationTemplatePayload.Subscription>,
    private val tags: JsonField<List<String>>,
    private val alias: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand")
        @ExcludeMissing
        brand: JsonField<NotificationTemplatePayload.Brand> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<ElementalContent> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing")
        @ExcludeMissing
        routing: JsonField<NotificationTemplatePayload.Routing> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<NotificationTemplatePayload.Subscription> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
    ) : this(brand, content, name, routing, subscription, tags, alias, mutableMapOf())

    fun toNotificationTemplatePayload(): NotificationTemplatePayload =
        NotificationTemplatePayload.builder()
            .brand(brand)
            .content(content)
            .name(name)
            .routing(routing)
            .subscription(subscription)
            .tags(tags)
            .build()

    /**
     * Brand reference, or null for no brand.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<NotificationTemplatePayload.Brand> = brand.getOptional("brand")

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
    fun routing(): Optional<NotificationTemplatePayload.Routing> = routing.getOptional("routing")

    /**
     * Subscription topic reference, or null for none.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscription(): Optional<NotificationTemplatePayload.Subscription> =
        subscription.getOptional("subscription")

    /**
     * Tags for categorization. Send empty array for none.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String> = tags.getRequired("tags")

    /**
     * Send-time alias for this template — the value you pass as `event` to POST /send. Writes
     * accept a single alias only. Optional, with three distinct meanings. Omit it to leave any
     * existing aliases untouched. Send a string to make this the template's only alias — a template
     * that already resolved from several aliases keeps just this one and the rest are detached.
     * Send null to remove every alias from the template. An alias may not be claimed by another
     * template — doing so returns 409 — and may not begin with "tenant/".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alias(): Optional<String> = alias.getOptional("alias")

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand")
    @ExcludeMissing
    fun _brand(): JsonField<NotificationTemplatePayload.Brand> = brand

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
    @JsonProperty("routing")
    @ExcludeMissing
    fun _routing(): JsonField<NotificationTemplatePayload.Routing> = routing

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<NotificationTemplatePayload.Subscription> = subscription

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [alias].
     *
     * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

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
         * [NotificationTemplateWritePayload].
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

    /** A builder for [NotificationTemplateWritePayload]. */
    class Builder internal constructor() {

        private var brand: JsonField<NotificationTemplatePayload.Brand>? = null
        private var content: JsonField<ElementalContent>? = null
        private var name: JsonField<String>? = null
        private var routing: JsonField<NotificationTemplatePayload.Routing>? = null
        private var subscription: JsonField<NotificationTemplatePayload.Subscription>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var alias: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationTemplateWritePayload: NotificationTemplateWritePayload) =
            apply {
                brand = notificationTemplateWritePayload.brand
                content = notificationTemplateWritePayload.content
                name = notificationTemplateWritePayload.name
                routing = notificationTemplateWritePayload.routing
                subscription = notificationTemplateWritePayload.subscription
                tags = notificationTemplateWritePayload.tags.map { it.toMutableList() }
                alias = notificationTemplateWritePayload.alias
                additionalProperties =
                    notificationTemplateWritePayload.additionalProperties.toMutableMap()
            }

        /** Brand reference, or null for no brand. */
        fun brand(brand: NotificationTemplatePayload.Brand?) = brand(JsonField.ofNullable(brand))

        /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
        fun brand(brand: Optional<NotificationTemplatePayload.Brand>) = brand(brand.getOrNull())

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed
         * [NotificationTemplatePayload.Brand] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<NotificationTemplatePayload.Brand>) = apply {
            this.brand = brand
        }

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
        fun routing(routing: NotificationTemplatePayload.Routing?) =
            routing(JsonField.ofNullable(routing))

        /** Alias for calling [Builder.routing] with `routing.orElse(null)`. */
        fun routing(routing: Optional<NotificationTemplatePayload.Routing>) =
            routing(routing.getOrNull())

        /**
         * Sets [Builder.routing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routing] with a well-typed
         * [NotificationTemplatePayload.Routing] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun routing(routing: JsonField<NotificationTemplatePayload.Routing>) = apply {
            this.routing = routing
        }

        /** Subscription topic reference, or null for none. */
        fun subscription(subscription: NotificationTemplatePayload.Subscription?) =
            subscription(JsonField.ofNullable(subscription))

        /** Alias for calling [Builder.subscription] with `subscription.orElse(null)`. */
        fun subscription(subscription: Optional<NotificationTemplatePayload.Subscription>) =
            subscription(subscription.getOrNull())

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed
         * [NotificationTemplatePayload.Subscription] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun subscription(subscription: JsonField<NotificationTemplatePayload.Subscription>) =
            apply {
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

        /**
         * Send-time alias for this template — the value you pass as `event` to POST /send. Writes
         * accept a single alias only. Optional, with three distinct meanings. Omit it to leave any
         * existing aliases untouched. Send a string to make this the template's only alias — a
         * template that already resolved from several aliases keeps just this one and the rest are
         * detached. Send null to remove every alias from the template. An alias may not be claimed
         * by another template — doing so returns 409 — and may not begin with "tenant/".
         */
        fun alias(alias: String?) = alias(JsonField.ofNullable(alias))

        /** Alias for calling [Builder.alias] with `alias.orElse(null)`. */
        fun alias(alias: Optional<String>) = alias(alias.getOrNull())

        /**
         * Sets [Builder.alias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alias(alias: JsonField<String>) = apply { this.alias = alias }

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
         * Returns an immutable instance of [NotificationTemplateWritePayload].
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
        fun build(): NotificationTemplateWritePayload =
            NotificationTemplateWritePayload(
                checkRequired("brand", brand),
                checkRequired("content", content),
                checkRequired("name", name),
                checkRequired("routing", routing),
                checkRequired("subscription", subscription),
                checkRequired("tags", tags).map { it.toImmutable() },
                alias,
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
    fun validate(): NotificationTemplateWritePayload = apply {
        if (validated) {
            return@apply
        }

        brand().ifPresent { it.validate() }
        content().validate()
        name()
        routing().ifPresent { it.validate() }
        subscription().ifPresent { it.validate() }
        tags()
        alias()
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
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (alias.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationTemplateWritePayload &&
            brand == other.brand &&
            content == other.content &&
            name == other.name &&
            routing == other.routing &&
            subscription == other.subscription &&
            tags == other.tags &&
            alias == other.alias &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(brand, content, name, routing, subscription, tags, alias, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationTemplateWritePayload{brand=$brand, content=$content, name=$name, routing=$routing, subscription=$subscription, tags=$tags, alias=$alias, additionalProperties=$additionalProperties}"
}
