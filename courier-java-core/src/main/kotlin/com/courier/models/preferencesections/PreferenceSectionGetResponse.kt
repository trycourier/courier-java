// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A preference section in your workspace, including its topics. */
class PreferenceSectionGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val created: JsonField<String>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val routingOptions: JsonField<List<ChannelClassification>>,
    private val topics: JsonField<List<PreferenceTopicGetResponse>>,
    private val creator: JsonField<String>,
    private val updated: JsonField<String>,
    private val updater: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_options")
        @ExcludeMissing
        routingOptions: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("topics")
        @ExcludeMissing
        topics: JsonField<List<PreferenceTopicGetResponse>> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updater") @ExcludeMissing updater: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        created,
        hasCustomRouting,
        name,
        routingOptions,
        topics,
        creator,
        updated,
        updater,
        mutableMapOf(),
    )

    /**
     * The preference section id.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ISO-8601 timestamp of when the section was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): String = created.getRequired("created")

    /**
     * Whether the section defines custom routing for its topics.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCustomRouting(): Boolean = hasCustomRouting.getRequired("has_custom_routing")

    /**
     * Human-readable name.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Default channels for the section. May be empty.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingOptions(): List<ChannelClassification> =
        routingOptions.getRequired("routing_options")

    /**
     * The topics contained in this section.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topics(): List<PreferenceTopicGetResponse> = topics.getRequired("topics")

    /**
     * Id of the creator.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creator(): Optional<String> = creator.getOptional("creator")

    /**
     * ISO-8601 timestamp of the last update.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<String> = updated.getOptional("updated")

    /**
     * Id of the last updater.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updater(): Optional<String> = updater.getOptional("updater")

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
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    /**
     * Returns the raw JSON value of [hasCustomRouting].
     *
     * Unlike [hasCustomRouting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("has_custom_routing")
    @ExcludeMissing
    fun _hasCustomRouting(): JsonField<Boolean> = hasCustomRouting

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [routingOptions].
     *
     * Unlike [routingOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_options")
    @ExcludeMissing
    fun _routingOptions(): JsonField<List<ChannelClassification>> = routingOptions

    /**
     * Returns the raw JSON value of [topics].
     *
     * Unlike [topics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topics")
    @ExcludeMissing
    fun _topics(): JsonField<List<PreferenceTopicGetResponse>> = topics

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<String> = creator

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<String> = updated

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
         * Returns a mutable builder for constructing an instance of [PreferenceSectionGetResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .created()
         * .hasCustomRouting()
         * .name()
         * .routingOptions()
         * .topics()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceSectionGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var created: JsonField<String>? = null
        private var hasCustomRouting: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var routingOptions: JsonField<MutableList<ChannelClassification>>? = null
        private var topics: JsonField<MutableList<PreferenceTopicGetResponse>>? = null
        private var creator: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<String> = JsonMissing.of()
        private var updater: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceSectionGetResponse: PreferenceSectionGetResponse) = apply {
            id = preferenceSectionGetResponse.id
            created = preferenceSectionGetResponse.created
            hasCustomRouting = preferenceSectionGetResponse.hasCustomRouting
            name = preferenceSectionGetResponse.name
            routingOptions = preferenceSectionGetResponse.routingOptions.map { it.toMutableList() }
            topics = preferenceSectionGetResponse.topics.map { it.toMutableList() }
            creator = preferenceSectionGetResponse.creator
            updated = preferenceSectionGetResponse.updated
            updater = preferenceSectionGetResponse.updater
            additionalProperties = preferenceSectionGetResponse.additionalProperties.toMutableMap()
        }

        /** The preference section id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO-8601 timestamp of when the section was created. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

        /** Whether the section defines custom routing for its topics. */
        fun hasCustomRouting(hasCustomRouting: Boolean) =
            hasCustomRouting(JsonField.of(hasCustomRouting))

        /**
         * Sets [Builder.hasCustomRouting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCustomRouting] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasCustomRouting(hasCustomRouting: JsonField<Boolean>) = apply {
            this.hasCustomRouting = hasCustomRouting
        }

        /** Human-readable name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Default channels for the section. May be empty. */
        fun routingOptions(routingOptions: List<ChannelClassification>) =
            routingOptions(JsonField.of(routingOptions))

        /**
         * Sets [Builder.routingOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingOptions] with a well-typed
         * `List<ChannelClassification>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun routingOptions(routingOptions: JsonField<List<ChannelClassification>>) = apply {
            this.routingOptions = routingOptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelClassification] to [routingOptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingOption(routingOption: ChannelClassification) = apply {
            routingOptions =
                (routingOptions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routingOptions", it).add(routingOption)
                }
        }

        /** The topics contained in this section. */
        fun topics(topics: List<PreferenceTopicGetResponse>) = topics(JsonField.of(topics))

        /**
         * Sets [Builder.topics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topics] with a well-typed
         * `List<PreferenceTopicGetResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun topics(topics: JsonField<List<PreferenceTopicGetResponse>>) = apply {
            this.topics = topics.map { it.toMutableList() }
        }

        /**
         * Adds a single [PreferenceTopicGetResponse] to [topics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTopic(topic: PreferenceTopicGetResponse) = apply {
            topics =
                (topics ?: JsonField.of(mutableListOf())).also {
                    checkKnown("topics", it).add(topic)
                }
        }

        /** Id of the creator. */
        fun creator(creator: String?) = creator(JsonField.ofNullable(creator))

        /** Alias for calling [Builder.creator] with `creator.orElse(null)`. */
        fun creator(creator: Optional<String>) = creator(creator.getOrNull())

        /**
         * Sets [Builder.creator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creator(creator: JsonField<String>) = apply { this.creator = creator }

        /** ISO-8601 timestamp of the last update. */
        fun updated(updated: String?) = updated(JsonField.ofNullable(updated))

        /** Alias for calling [Builder.updated] with `updated.orElse(null)`. */
        fun updated(updated: Optional<String>) = updated(updated.getOrNull())

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<String>) = apply { this.updated = updated }

        /** Id of the last updater. */
        fun updater(updater: String?) = updater(JsonField.ofNullable(updater))

        /** Alias for calling [Builder.updater] with `updater.orElse(null)`. */
        fun updater(updater: Optional<String>) = updater(updater.getOrNull())

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
         * Returns an immutable instance of [PreferenceSectionGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .created()
         * .hasCustomRouting()
         * .name()
         * .routingOptions()
         * .topics()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceSectionGetResponse =
            PreferenceSectionGetResponse(
                checkRequired("id", id),
                checkRequired("created", created),
                checkRequired("hasCustomRouting", hasCustomRouting),
                checkRequired("name", name),
                checkRequired("routingOptions", routingOptions).map { it.toImmutable() },
                checkRequired("topics", topics).map { it.toImmutable() },
                creator,
                updated,
                updater,
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
    fun validate(): PreferenceSectionGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        created()
        hasCustomRouting()
        name()
        routingOptions().forEach { it.validate() }
        topics().forEach { it.validate() }
        creator()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (hasCustomRouting.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (routingOptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (topics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (creator.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (updater.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceSectionGetResponse &&
            id == other.id &&
            created == other.created &&
            hasCustomRouting == other.hasCustomRouting &&
            name == other.name &&
            routingOptions == other.routingOptions &&
            topics == other.topics &&
            creator == other.creator &&
            updated == other.updated &&
            updater == other.updater &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            created,
            hasCustomRouting,
            name,
            routingOptions,
            topics,
            creator,
            updated,
            updater,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceSectionGetResponse{id=$id, created=$created, hasCustomRouting=$hasCustomRouting, name=$name, routingOptions=$routingOptions, topics=$topics, creator=$creator, updated=$updated, updater=$updater, additionalProperties=$additionalProperties}"
}
