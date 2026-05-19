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

/** Request body for creating a journey. */
class CreateJourneyRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val nodes: JsonField<List<JourneyNode>>,
    private val enabled: JsonField<Boolean>,
    private val state: JsonField<JourneyState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nodes")
        @ExcludeMissing
        nodes: JsonField<List<JourneyNode>> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<JourneyState> = JsonMissing.of(),
    ) : this(name, nodes, enabled, state, mutableMapOf())

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
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * Lifecycle state of a journey.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<JourneyState> = state.getOptional("state")

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
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<JourneyState> = state

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
         * Returns a mutable builder for constructing an instance of [CreateJourneyRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .nodes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateJourneyRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var nodes: JsonField<MutableList<JourneyNode>>? = null
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var state: JsonField<JourneyState> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createJourneyRequest: CreateJourneyRequest) = apply {
            name = createJourneyRequest.name
            nodes = createJourneyRequest.nodes.map { it.toMutableList() }
            enabled = createJourneyRequest.enabled
            state = createJourneyRequest.state
            additionalProperties = createJourneyRequest.additionalProperties.toMutableMap()
        }

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

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** Lifecycle state of a journey. */
        fun state(state: JourneyState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [JourneyState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun state(state: JsonField<JourneyState>) = apply { this.state = state }

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
         * Returns an immutable instance of [CreateJourneyRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .nodes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateJourneyRequest =
            CreateJourneyRequest(
                checkRequired("name", name),
                checkRequired("nodes", nodes).map { it.toImmutable() },
                enabled,
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
    fun validate(): CreateJourneyRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        nodes().forEach { it.validate() }
        enabled()
        state().ifPresent { it.validate() }
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
            (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateJourneyRequest &&
            name == other.name &&
            nodes == other.nodes &&
            enabled == other.enabled &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, nodes, enabled, state, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateJourneyRequest{name=$name, nodes=$nodes, enabled=$enabled, state=$state, additionalProperties=$additionalProperties}"
}
