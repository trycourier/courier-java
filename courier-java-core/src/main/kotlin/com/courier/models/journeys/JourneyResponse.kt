// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class JourneyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val created: JsonField<Long>,
    private val creator: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val nodes: JsonField<List<JourneyNode>>,
    private val published: JsonField<Long>,
    private val state: JsonField<JourneyState>,
    private val updated: JsonField<Long>,
    private val updater: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nodes")
        @ExcludeMissing
        nodes: JsonField<List<JourneyNode>> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<JourneyState> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updater") @ExcludeMissing updater: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        created,
        creator,
        enabled,
        name,
        nodes,
        published,
        state,
        updated,
        updater,
        mutableMapOf(),
    )

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<Long> = created.getOptional("created")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creator(): Optional<String> = creator.getOptional("creator")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nodes(): List<JourneyNode> = nodes.getRequired("nodes")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun published(): Optional<Long> = published.getOptional("published")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): JourneyState = state.getRequired("state")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<Long> = updated.getOptional("updated")

    /**
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
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<String> = creator

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nodes].
     *
     * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nodes") @ExcludeMissing fun _nodes(): JsonField<List<JourneyNode>> = nodes

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Long> = published

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<JourneyState> = state

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
         * Returns a mutable builder for constructing an instance of [JourneyResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .created()
         * .creator()
         * .enabled()
         * .name()
         * .nodes()
         * .published()
         * .state()
         * .updated()
         * .updater()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var created: JsonField<Long>? = null
        private var creator: JsonField<String>? = null
        private var enabled: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var nodes: JsonField<MutableList<JourneyNode>>? = null
        private var published: JsonField<Long>? = null
        private var state: JsonField<JourneyState>? = null
        private var updated: JsonField<Long>? = null
        private var updater: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyResponse: JourneyResponse) = apply {
            id = journeyResponse.id
            created = journeyResponse.created
            creator = journeyResponse.creator
            enabled = journeyResponse.enabled
            name = journeyResponse.name
            nodes = journeyResponse.nodes.map { it.toMutableList() }
            published = journeyResponse.published
            state = journeyResponse.state
            updated = journeyResponse.updated
            updater = journeyResponse.updater
            additionalProperties = journeyResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun created(created: Long?) = created(JsonField.ofNullable(created))

        /**
         * Alias for [Builder.created].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun created(created: Long) = created(created as Long?)

        /** Alias for calling [Builder.created] with `created.orElse(null)`. */
        fun created(created: Optional<Long>) = created(created.getOrNull())

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Long>) = apply { this.created = created }

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

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun nodes(nodes: List<JourneyNode>) = nodes(JsonField.of(nodes))

        /**
         * Sets [Builder.nodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nodes] with a well-typed `List<JourneyNode>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nodes(nodes: JsonField<List<JourneyNode>>) = apply {
            this.nodes = nodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [JourneyNode] to [nodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNode(node: JourneyNode) = apply {
            nodes =
                (nodes ?: JsonField.of(mutableListOf())).also { checkKnown("nodes", it).add(node) }
        }

        /** Alias for calling [addNode] with `JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger)`. */
        fun addNode(apiInvokeTrigger: JourneyApiInvokeTriggerNode) =
            addNode(JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger))

        /** Alias for calling [addNode] with `JourneyNode.ofSegmentTrigger(segmentTrigger)`. */
        fun addNode(segmentTrigger: JourneySegmentTriggerNode) =
            addNode(JourneyNode.ofSegmentTrigger(segmentTrigger))

        /** Alias for calling [addNode] with `JourneyNode.ofSend(send)`. */
        fun addNode(send: JourneySendNode) = addNode(JourneyNode.ofSend(send))

        /** Alias for calling [addNode] with `JourneyNode.ofDelayDuration(delayDuration)`. */
        fun addNode(delayDuration: JourneyDelayDurationNode) =
            addNode(JourneyNode.ofDelayDuration(delayDuration))

        /** Alias for calling [addNode] with `JourneyNode.ofDelayUntil(delayUntil)`. */
        fun addNode(delayUntil: JourneyDelayUntilNode) =
            addNode(JourneyNode.ofDelayUntil(delayUntil))

        /** Alias for calling [addNode] with `JourneyNode.ofFetchGetDelete(fetchGetDelete)`. */
        fun addNode(fetchGetDelete: JourneyFetchGetDeleteNode) =
            addNode(JourneyNode.ofFetchGetDelete(fetchGetDelete))

        /** Alias for calling [addNode] with `JourneyNode.ofFetchPostPut(fetchPostPut)`. */
        fun addNode(fetchPostPut: JourneyFetchPostPutNode) =
            addNode(JourneyNode.ofFetchPostPut(fetchPostPut))

        /** Alias for calling [addNode] with `JourneyNode.ofAi(ai)`. */
        fun addNode(ai: JourneyAiNode) = addNode(JourneyNode.ofAi(ai))

        /** Alias for calling [addNode] with `JourneyNode.ofThrottleStatic(throttleStatic)`. */
        fun addNode(throttleStatic: JourneyThrottleStaticNode) =
            addNode(JourneyNode.ofThrottleStatic(throttleStatic))

        /** Alias for calling [addNode] with `JourneyNode.ofThrottleDynamic(throttleDynamic)`. */
        fun addNode(throttleDynamic: JourneyThrottleDynamicNode) =
            addNode(JourneyNode.ofThrottleDynamic(throttleDynamic))

        /** Alias for calling [addNode] with `JourneyNode.ofExit(exit)`. */
        fun addNode(exit: JourneyExitNode) = addNode(JourneyNode.ofExit(exit))

        /** Alias for calling [addNode] with `JourneyNode.ofBranch(branch)`. */
        fun addNode(branch: JourneyNode.JourneyBranchNode) = addNode(JourneyNode.ofBranch(branch))

        fun published(published: Long?) = published(JsonField.ofNullable(published))

        /**
         * Alias for [Builder.published].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun published(published: Long) = published(published as Long?)

        /** Alias for calling [Builder.published] with `published.orElse(null)`. */
        fun published(published: Optional<Long>) = published(published.getOrNull())

        /**
         * Sets [Builder.published] to an arbitrary JSON value.
         *
         * You should usually call [Builder.published] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun published(published: JsonField<Long>) = apply { this.published = published }

        fun state(state: JourneyState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [JourneyState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun state(state: JsonField<JourneyState>) = apply { this.state = state }

        fun updated(updated: Long?) = updated(JsonField.ofNullable(updated))

        /**
         * Alias for [Builder.updated].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun updated(updated: Long) = updated(updated as Long?)

        /** Alias for calling [Builder.updated] with `updated.orElse(null)`. */
        fun updated(updated: Optional<Long>) = updated(updated.getOrNull())

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<Long>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [JourneyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .created()
         * .creator()
         * .enabled()
         * .name()
         * .nodes()
         * .published()
         * .state()
         * .updated()
         * .updater()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyResponse =
            JourneyResponse(
                checkRequired("id", id),
                checkRequired("created", created),
                checkRequired("creator", creator),
                checkRequired("enabled", enabled),
                checkRequired("name", name),
                checkRequired("nodes", nodes).map { it.toImmutable() },
                checkRequired("published", published),
                checkRequired("state", state),
                checkRequired("updated", updated),
                checkRequired("updater", updater),
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
    fun validate(): JourneyResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        created()
        creator()
        enabled()
        name()
        nodes().forEach { it.validate() }
        published()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (creator.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (published.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (updater.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyResponse &&
            id == other.id &&
            created == other.created &&
            creator == other.creator &&
            enabled == other.enabled &&
            name == other.name &&
            nodes == other.nodes &&
            published == other.published &&
            state == other.state &&
            updated == other.updated &&
            updater == other.updater &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            created,
            creator,
            enabled,
            name,
            nodes,
            published,
            state,
            updated,
            updater,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyResponse{id=$id, created=$created, creator=$creator, enabled=$enabled, name=$name, nodes=$nodes, published=$published, state=$state, updated=$updated, updater=$updater, additionalProperties=$additionalProperties}"
}
