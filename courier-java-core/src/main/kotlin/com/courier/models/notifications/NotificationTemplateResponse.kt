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
 * Response for GET /notifications/{id}, POST /notifications, and PUT /notifications/{id}. Returns
 * all template fields at the top level.
 */
class NotificationTemplateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brand: JsonField<NotificationTemplatePayload.Brand>,
    private val content: JsonField<ElementalContent>,
    private val name: JsonField<String>,
    private val routing: JsonField<NotificationTemplatePayload.Routing>,
    private val subscription: JsonField<NotificationTemplatePayload.Subscription>,
    private val tags: JsonField<List<String>>,
    private val id: JsonField<String>,
    private val created: JsonField<Long>,
    private val creator: JsonField<String>,
    private val state: JsonField<State>,
    private val updated: JsonField<Long>,
    private val updater: JsonField<String>,
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
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updater") @ExcludeMissing updater: JsonField<String> = JsonMissing.of(),
    ) : this(
        brand,
        content,
        name,
        routing,
        subscription,
        tags,
        id,
        created,
        creator,
        state,
        updated,
        updater,
        mutableMapOf(),
    )

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
     * The template ID.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Epoch milliseconds when the template was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): Long = created.getRequired("created")

    /**
     * User ID of the creator.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creator(): String = creator.getRequired("creator")

    /**
     * The template state. Always uppercase.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * Epoch milliseconds of last update.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<Long> = updated.getOptional("updated")

    /**
     * User ID of the last updater.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updater(): Optional<String> = updater.getOptional("updater")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<String> = creator

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<Long> = updated

    /**
     * Returns the raw JSON value of [updater].
     *
     * Unlike [updater], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updater") @ExcludeMissing fun _updater(): JsonField<String> = updater

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
         * Returns a mutable builder for constructing an instance of [NotificationTemplateResponse].
         *
         * The following fields are required:
         * ```java
         * .brand()
         * .content()
         * .name()
         * .routing()
         * .subscription()
         * .tags()
         * .id()
         * .created()
         * .creator()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationTemplateResponse]. */
    class Builder internal constructor() {

        private var brand: JsonField<NotificationTemplatePayload.Brand>? = null
        private var content: JsonField<ElementalContent>? = null
        private var name: JsonField<String>? = null
        private var routing: JsonField<NotificationTemplatePayload.Routing>? = null
        private var subscription: JsonField<NotificationTemplatePayload.Subscription>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var id: JsonField<String>? = null
        private var created: JsonField<Long>? = null
        private var creator: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var updated: JsonField<Long> = JsonMissing.of()
        private var updater: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationTemplateResponse: NotificationTemplateResponse) = apply {
            brand = notificationTemplateResponse.brand
            content = notificationTemplateResponse.content
            name = notificationTemplateResponse.name
            routing = notificationTemplateResponse.routing
            subscription = notificationTemplateResponse.subscription
            tags = notificationTemplateResponse.tags.map { it.toMutableList() }
            id = notificationTemplateResponse.id
            created = notificationTemplateResponse.created
            creator = notificationTemplateResponse.creator
            state = notificationTemplateResponse.state
            updated = notificationTemplateResponse.updated
            updater = notificationTemplateResponse.updater
            additionalProperties = notificationTemplateResponse.additionalProperties.toMutableMap()
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

        /** The template ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Epoch milliseconds when the template was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** User ID of the creator. */
        fun creator(creator: String) = creator(JsonField.of(creator))

        /**
         * Sets [Builder.creator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creator(creator: JsonField<String>) = apply { this.creator = creator }

        /** The template state. Always uppercase. */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Epoch milliseconds of last update. */
        fun updated(updated: Long) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<Long>) = apply { this.updated = updated }

        /** User ID of the last updater. */
        fun updater(updater: String) = updater(JsonField.of(updater))

        /**
         * Sets [Builder.updater] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updater] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updater(updater: JsonField<String>) = apply { this.updater = updater }

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
         * Returns an immutable instance of [NotificationTemplateResponse].
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
         * .id()
         * .created()
         * .creator()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationTemplateResponse =
            NotificationTemplateResponse(
                checkRequired("brand", brand),
                checkRequired("content", content),
                checkRequired("name", name),
                checkRequired("routing", routing),
                checkRequired("subscription", subscription),
                checkRequired("tags", tags).map { it.toImmutable() },
                checkRequired("id", id),
                checkRequired("created", created),
                checkRequired("creator", creator),
                checkRequired("state", state),
                updated,
                updater,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationTemplateResponse = apply {
        if (validated) {
            return@apply
        }

        brand().ifPresent { it.validate() }
        content().validate()
        name()
        routing().ifPresent { it.validate() }
        subscription().ifPresent { it.validate() }
        tags()
        id()
        created()
        creator()
        state().validate()
        updated()
        updater()
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
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (creator.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (updater.asKnown().isPresent) 1 else 0)

    /** The template state. Always uppercase. */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("DRAFT")

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            DRAFT,
            PUBLISHED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            PUBLISHED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                PUBLISHED -> Value.PUBLISHED
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
                DRAFT -> Known.DRAFT
                PUBLISHED -> Known.PUBLISHED
                else -> throw CourierInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationTemplateResponse &&
            brand == other.brand &&
            content == other.content &&
            name == other.name &&
            routing == other.routing &&
            subscription == other.subscription &&
            tags == other.tags &&
            id == other.id &&
            created == other.created &&
            creator == other.creator &&
            state == other.state &&
            updated == other.updated &&
            updater == other.updater &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brand,
            content,
            name,
            routing,
            subscription,
            tags,
            id,
            created,
            creator,
            state,
            updated,
            updater,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationTemplateResponse{brand=$brand, content=$content, name=$name, routing=$routing, subscription=$subscription, tags=$tags, id=$id, created=$created, creator=$creator, state=$state, updated=$updated, updater=$updater, additionalProperties=$additionalProperties}"
}
