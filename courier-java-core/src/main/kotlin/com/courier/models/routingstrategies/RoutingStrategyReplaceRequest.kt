// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.MessageChannels
import com.courier.models.MessageProviders
import com.courier.models.MessageRouting
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Request body for replacing a routing strategy. Full document replacement; missing optional fields
 * are cleared.
 */
class RoutingStrategyReplaceRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val routing: JsonField<MessageRouting>,
    private val channels: JsonField<MessageChannels>,
    private val description: JsonField<String>,
    private val providers: JsonField<MessageProviders>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing")
        @ExcludeMissing
        routing: JsonField<MessageRouting> = JsonMissing.of(),
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<MessageChannels> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<MessageProviders> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(name, routing, channels, description, providers, tags, mutableMapOf())

    /**
     * Human-readable name for the routing strategy.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Routing tree defining channel selection method and order.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routing(): MessageRouting = routing.getRequired("routing")

    /**
     * Per-channel delivery configuration. Omit to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<MessageChannels> = channels.getOptional("channels")

    /**
     * Optional description. Omit or null to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Per-provider delivery configuration. Omit to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providers(): Optional<MessageProviders> = providers.getOptional("providers")

    /**
     * Optional tags. Omit or null to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

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
    @JsonProperty("routing") @ExcludeMissing fun _routing(): JsonField<MessageRouting> = routing

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<MessageChannels> = channels

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers")
    @ExcludeMissing
    fun _providers(): JsonField<MessageProviders> = providers

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
         * Returns a mutable builder for constructing an instance of
         * [RoutingStrategyReplaceRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .routing()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoutingStrategyReplaceRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var routing: JsonField<MessageRouting>? = null
        private var channels: JsonField<MessageChannels> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var providers: JsonField<MessageProviders> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routingStrategyReplaceRequest: RoutingStrategyReplaceRequest) = apply {
            name = routingStrategyReplaceRequest.name
            routing = routingStrategyReplaceRequest.routing
            channels = routingStrategyReplaceRequest.channels
            description = routingStrategyReplaceRequest.description
            providers = routingStrategyReplaceRequest.providers
            tags = routingStrategyReplaceRequest.tags.map { it.toMutableList() }
            additionalProperties = routingStrategyReplaceRequest.additionalProperties.toMutableMap()
        }

        /** Human-readable name for the routing strategy. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Routing tree defining channel selection method and order. */
        fun routing(routing: MessageRouting) = routing(JsonField.of(routing))

        /**
         * Sets [Builder.routing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routing] with a well-typed [MessageRouting] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routing(routing: JsonField<MessageRouting>) = apply { this.routing = routing }

        /** Per-channel delivery configuration. Omit to clear. */
        fun channels(channels: MessageChannels?) = channels(JsonField.ofNullable(channels))

        /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
        fun channels(channels: Optional<MessageChannels>) = channels(channels.getOrNull())

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed [MessageChannels] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channels(channels: JsonField<MessageChannels>) = apply { this.channels = channels }

        /** Optional description. Omit or null to clear. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Per-provider delivery configuration. Omit to clear. */
        fun providers(providers: MessageProviders?) = providers(JsonField.ofNullable(providers))

        /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
        fun providers(providers: Optional<MessageProviders>) = providers(providers.getOrNull())

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed [MessageProviders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providers(providers: JsonField<MessageProviders>) = apply { this.providers = providers }

        /** Optional tags. Omit or null to clear. */
        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

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
         * Returns an immutable instance of [RoutingStrategyReplaceRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .routing()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RoutingStrategyReplaceRequest =
            RoutingStrategyReplaceRequest(
                checkRequired("name", name),
                checkRequired("routing", routing),
                channels,
                description,
                providers,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoutingStrategyReplaceRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        routing().validate()
        channels().ifPresent { it.validate() }
        description()
        providers().ifPresent { it.validate() }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (routing.asKnown().getOrNull()?.validity() ?: 0) +
            (channels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (providers.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutingStrategyReplaceRequest &&
            name == other.name &&
            routing == other.routing &&
            channels == other.channels &&
            description == other.description &&
            providers == other.providers &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, routing, channels, description, providers, tags, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingStrategyReplaceRequest{name=$name, routing=$routing, channels=$channels, description=$description, providers=$providers, tags=$tags, additionalProperties=$additionalProperties}"
}
