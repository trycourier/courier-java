// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.getOrThrow
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
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
 * A single node in a journey DAG. Discriminated by `type`, with a secondary discriminator on some
 * variants (`trigger_type` for trigger, `mode` for delay, `method` for fetch, `scope` for
 * throttle).
 */
@JsonDeserialize(using = JourneyNode.Deserializer::class)
@JsonSerialize(using = JourneyNode.Serializer::class)
class JourneyNode
private constructor(
    private val apiInvokeTrigger: JourneyApiInvokeTriggerNode? = null,
    private val segmentTrigger: JourneySegmentTriggerNode? = null,
    private val send: JourneySendNode? = null,
    private val delayDuration: JourneyDelayDurationNode? = null,
    private val delayUntil: JourneyDelayUntilNode? = null,
    private val fetchGetDelete: JourneyFetchGetDeleteNode? = null,
    private val fetchPostPut: JourneyFetchPostPutNode? = null,
    private val ai: JourneyAiNode? = null,
    private val throttleStatic: JourneyThrottleStaticNode? = null,
    private val throttleDynamic: JourneyThrottleDynamicNode? = null,
    private val batch: JourneyBatchNode? = null,
    private val addToDigest: JourneyAddToDigestNode? = null,
    private val exit: JourneyExitNode? = null,
    private val branch: JourneyBranchNode? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Trigger fired when the journey is invoked via the API. The optional `schema` field is a JSON
     * Schema that validates the invocation payload.
     */
    fun apiInvokeTrigger(): Optional<JourneyApiInvokeTriggerNode> =
        Optional.ofNullable(apiInvokeTrigger)

    /** Trigger fired by a segment event (`identify`, `group`, or `track`). */
    fun segmentTrigger(): Optional<JourneySegmentTriggerNode> = Optional.ofNullable(segmentTrigger)

    /**
     * Send to the recipient. A send node sources its content from EXACTLY ONE of `message.template`
     * (a single notification template) or `experiment` (an A/B split across weighted template
     * variants) — supplying both, or neither, is rejected. Optionally override the recipient
     * address, delay the send, or attach `data`.
     */
    fun send(): Optional<JourneySendNode> = Optional.ofNullable(send)

    /** Pause the journey run for a fixed `duration`. */
    fun delayDuration(): Optional<JourneyDelayDurationNode> = Optional.ofNullable(delayDuration)

    /** Pause the journey run `until` a specific time. */
    fun delayUntil(): Optional<JourneyDelayUntilNode> = Optional.ofNullable(delayUntil)

    /**
     * Issue an HTTP GET or DELETE request and merge the response into the journey state per
     * `merge_strategy`.
     */
    fun fetchGetDelete(): Optional<JourneyFetchGetDeleteNode> = Optional.ofNullable(fetchGetDelete)

    /**
     * Issue an HTTP POST or PUT request with a `body` and merge the response into the journey state
     * per `merge_strategy`.
     */
    fun fetchPostPut(): Optional<JourneyFetchPostPutNode> = Optional.ofNullable(fetchPostPut)

    /**
     * Invoke an AI step with `user_prompt` and optional `web_search`. Returns a structured response
     * conforming to `output_schema`.
     */
    fun ai(): Optional<JourneyAiNode> = Optional.ofNullable(ai)

    /**
     * Throttle the journey by a static `scope` (`user` or `global`), allowing at most `max_allowed`
     * invocations per `period`.
     */
    fun throttleStatic(): Optional<JourneyThrottleStaticNode> = Optional.ofNullable(throttleStatic)

    /**
     * Throttle the journey by a dynamic `throttle_key`, allowing at most `max_allowed` invocations
     * per `period`.
     */
    fun throttleDynamic(): Optional<JourneyThrottleDynamicNode> =
        Optional.ofNullable(throttleDynamic)

    /**
     * Collect events arriving at the node into a single batch and fire one downstream step with the
     * aggregated payload. The first event into a batch owns the run; later contributing events
     * terminate at the batch step. The batch releases when any of `max_items` is reached, a quiet
     * window of `wait_period` elapses, or the `max_wait_period` ceiling hits.
     */
    fun batch(): Optional<JourneyBatchNode> = Optional.ofNullable(batch)

    /**
     * Add the current event to a digest keyed by the given subscription topic. The digest
     * accumulates events and releases them on the schedule configured for the topic.
     */
    fun addToDigest(): Optional<JourneyAddToDigestNode> = Optional.ofNullable(addToDigest)

    /** Terminate the journey run. */
    fun exit(): Optional<JourneyExitNode> = Optional.ofNullable(exit)

    /**
     * Branch node. Routes to the first entry in `paths[]` whose `conditions` match, else falls
     * through to `default.nodes`.
     */
    fun branch(): Optional<JourneyBranchNode> = Optional.ofNullable(branch)

    fun isApiInvokeTrigger(): Boolean = apiInvokeTrigger != null

    fun isSegmentTrigger(): Boolean = segmentTrigger != null

    fun isSend(): Boolean = send != null

    fun isDelayDuration(): Boolean = delayDuration != null

    fun isDelayUntil(): Boolean = delayUntil != null

    fun isFetchGetDelete(): Boolean = fetchGetDelete != null

    fun isFetchPostPut(): Boolean = fetchPostPut != null

    fun isAi(): Boolean = ai != null

    fun isThrottleStatic(): Boolean = throttleStatic != null

    fun isThrottleDynamic(): Boolean = throttleDynamic != null

    fun isBatch(): Boolean = batch != null

    fun isAddToDigest(): Boolean = addToDigest != null

    fun isExit(): Boolean = exit != null

    fun isBranch(): Boolean = branch != null

    /**
     * Trigger fired when the journey is invoked via the API. The optional `schema` field is a JSON
     * Schema that validates the invocation payload.
     */
    fun asApiInvokeTrigger(): JourneyApiInvokeTriggerNode =
        apiInvokeTrigger.getOrThrow("apiInvokeTrigger")

    /** Trigger fired by a segment event (`identify`, `group`, or `track`). */
    fun asSegmentTrigger(): JourneySegmentTriggerNode = segmentTrigger.getOrThrow("segmentTrigger")

    /**
     * Send to the recipient. A send node sources its content from EXACTLY ONE of `message.template`
     * (a single notification template) or `experiment` (an A/B split across weighted template
     * variants) — supplying both, or neither, is rejected. Optionally override the recipient
     * address, delay the send, or attach `data`.
     */
    fun asSend(): JourneySendNode = send.getOrThrow("send")

    /** Pause the journey run for a fixed `duration`. */
    fun asDelayDuration(): JourneyDelayDurationNode = delayDuration.getOrThrow("delayDuration")

    /** Pause the journey run `until` a specific time. */
    fun asDelayUntil(): JourneyDelayUntilNode = delayUntil.getOrThrow("delayUntil")

    /**
     * Issue an HTTP GET or DELETE request and merge the response into the journey state per
     * `merge_strategy`.
     */
    fun asFetchGetDelete(): JourneyFetchGetDeleteNode = fetchGetDelete.getOrThrow("fetchGetDelete")

    /**
     * Issue an HTTP POST or PUT request with a `body` and merge the response into the journey state
     * per `merge_strategy`.
     */
    fun asFetchPostPut(): JourneyFetchPostPutNode = fetchPostPut.getOrThrow("fetchPostPut")

    /**
     * Invoke an AI step with `user_prompt` and optional `web_search`. Returns a structured response
     * conforming to `output_schema`.
     */
    fun asAi(): JourneyAiNode = ai.getOrThrow("ai")

    /**
     * Throttle the journey by a static `scope` (`user` or `global`), allowing at most `max_allowed`
     * invocations per `period`.
     */
    fun asThrottleStatic(): JourneyThrottleStaticNode = throttleStatic.getOrThrow("throttleStatic")

    /**
     * Throttle the journey by a dynamic `throttle_key`, allowing at most `max_allowed` invocations
     * per `period`.
     */
    fun asThrottleDynamic(): JourneyThrottleDynamicNode =
        throttleDynamic.getOrThrow("throttleDynamic")

    /**
     * Collect events arriving at the node into a single batch and fire one downstream step with the
     * aggregated payload. The first event into a batch owns the run; later contributing events
     * terminate at the batch step. The batch releases when any of `max_items` is reached, a quiet
     * window of `wait_period` elapses, or the `max_wait_period` ceiling hits.
     */
    fun asBatch(): JourneyBatchNode = batch.getOrThrow("batch")

    /**
     * Add the current event to a digest keyed by the given subscription topic. The digest
     * accumulates events and releases them on the schedule configured for the topic.
     */
    fun asAddToDigest(): JourneyAddToDigestNode = addToDigest.getOrThrow("addToDigest")

    /** Terminate the journey run. */
    fun asExit(): JourneyExitNode = exit.getOrThrow("exit")

    /**
     * Branch node. Routes to the first entry in `paths[]` whose `conditions` match, else falls
     * through to `default.nodes`.
     */
    fun asBranch(): JourneyBranchNode = branch.getOrThrow("branch")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.courier.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = journeyNode.accept(new JourneyNode.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitApiInvokeTrigger(JourneyApiInvokeTriggerNode apiInvokeTrigger) {
     *         return Optional.of(apiInvokeTrigger.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws CourierInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            apiInvokeTrigger != null -> visitor.visitApiInvokeTrigger(apiInvokeTrigger)
            segmentTrigger != null -> visitor.visitSegmentTrigger(segmentTrigger)
            send != null -> visitor.visitSend(send)
            delayDuration != null -> visitor.visitDelayDuration(delayDuration)
            delayUntil != null -> visitor.visitDelayUntil(delayUntil)
            fetchGetDelete != null -> visitor.visitFetchGetDelete(fetchGetDelete)
            fetchPostPut != null -> visitor.visitFetchPostPut(fetchPostPut)
            ai != null -> visitor.visitAi(ai)
            throttleStatic != null -> visitor.visitThrottleStatic(throttleStatic)
            throttleDynamic != null -> visitor.visitThrottleDynamic(throttleDynamic)
            batch != null -> visitor.visitBatch(batch)
            addToDigest != null -> visitor.visitAddToDigest(addToDigest)
            exit != null -> visitor.visitExit(exit)
            branch != null -> visitor.visitBranch(branch)
            else -> visitor.unknown(_json)
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
    fun validate(): JourneyNode = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitApiInvokeTrigger(apiInvokeTrigger: JourneyApiInvokeTriggerNode) {
                    apiInvokeTrigger.validate()
                }

                override fun visitSegmentTrigger(segmentTrigger: JourneySegmentTriggerNode) {
                    segmentTrigger.validate()
                }

                override fun visitSend(send: JourneySendNode) {
                    send.validate()
                }

                override fun visitDelayDuration(delayDuration: JourneyDelayDurationNode) {
                    delayDuration.validate()
                }

                override fun visitDelayUntil(delayUntil: JourneyDelayUntilNode) {
                    delayUntil.validate()
                }

                override fun visitFetchGetDelete(fetchGetDelete: JourneyFetchGetDeleteNode) {
                    fetchGetDelete.validate()
                }

                override fun visitFetchPostPut(fetchPostPut: JourneyFetchPostPutNode) {
                    fetchPostPut.validate()
                }

                override fun visitAi(ai: JourneyAiNode) {
                    ai.validate()
                }

                override fun visitThrottleStatic(throttleStatic: JourneyThrottleStaticNode) {
                    throttleStatic.validate()
                }

                override fun visitThrottleDynamic(throttleDynamic: JourneyThrottleDynamicNode) {
                    throttleDynamic.validate()
                }

                override fun visitBatch(batch: JourneyBatchNode) {
                    batch.validate()
                }

                override fun visitAddToDigest(addToDigest: JourneyAddToDigestNode) {
                    addToDigest.validate()
                }

                override fun visitExit(exit: JourneyExitNode) {
                    exit.validate()
                }

                override fun visitBranch(branch: JourneyBranchNode) {
                    branch.validate()
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
                override fun visitApiInvokeTrigger(apiInvokeTrigger: JourneyApiInvokeTriggerNode) =
                    apiInvokeTrigger.validity()

                override fun visitSegmentTrigger(segmentTrigger: JourneySegmentTriggerNode) =
                    segmentTrigger.validity()

                override fun visitSend(send: JourneySendNode) = send.validity()

                override fun visitDelayDuration(delayDuration: JourneyDelayDurationNode) =
                    delayDuration.validity()

                override fun visitDelayUntil(delayUntil: JourneyDelayUntilNode) =
                    delayUntil.validity()

                override fun visitFetchGetDelete(fetchGetDelete: JourneyFetchGetDeleteNode) =
                    fetchGetDelete.validity()

                override fun visitFetchPostPut(fetchPostPut: JourneyFetchPostPutNode) =
                    fetchPostPut.validity()

                override fun visitAi(ai: JourneyAiNode) = ai.validity()

                override fun visitThrottleStatic(throttleStatic: JourneyThrottleStaticNode) =
                    throttleStatic.validity()

                override fun visitThrottleDynamic(throttleDynamic: JourneyThrottleDynamicNode) =
                    throttleDynamic.validity()

                override fun visitBatch(batch: JourneyBatchNode) = batch.validity()

                override fun visitAddToDigest(addToDigest: JourneyAddToDigestNode) =
                    addToDigest.validity()

                override fun visitExit(exit: JourneyExitNode) = exit.validity()

                override fun visitBranch(branch: JourneyBranchNode) = branch.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyNode &&
            apiInvokeTrigger == other.apiInvokeTrigger &&
            segmentTrigger == other.segmentTrigger &&
            send == other.send &&
            delayDuration == other.delayDuration &&
            delayUntil == other.delayUntil &&
            fetchGetDelete == other.fetchGetDelete &&
            fetchPostPut == other.fetchPostPut &&
            ai == other.ai &&
            throttleStatic == other.throttleStatic &&
            throttleDynamic == other.throttleDynamic &&
            batch == other.batch &&
            addToDigest == other.addToDigest &&
            exit == other.exit &&
            branch == other.branch
    }

    override fun hashCode(): Int =
        Objects.hash(
            apiInvokeTrigger,
            segmentTrigger,
            send,
            delayDuration,
            delayUntil,
            fetchGetDelete,
            fetchPostPut,
            ai,
            throttleStatic,
            throttleDynamic,
            batch,
            addToDigest,
            exit,
            branch,
        )

    override fun toString(): String =
        when {
            apiInvokeTrigger != null -> "JourneyNode{apiInvokeTrigger=$apiInvokeTrigger}"
            segmentTrigger != null -> "JourneyNode{segmentTrigger=$segmentTrigger}"
            send != null -> "JourneyNode{send=$send}"
            delayDuration != null -> "JourneyNode{delayDuration=$delayDuration}"
            delayUntil != null -> "JourneyNode{delayUntil=$delayUntil}"
            fetchGetDelete != null -> "JourneyNode{fetchGetDelete=$fetchGetDelete}"
            fetchPostPut != null -> "JourneyNode{fetchPostPut=$fetchPostPut}"
            ai != null -> "JourneyNode{ai=$ai}"
            throttleStatic != null -> "JourneyNode{throttleStatic=$throttleStatic}"
            throttleDynamic != null -> "JourneyNode{throttleDynamic=$throttleDynamic}"
            batch != null -> "JourneyNode{batch=$batch}"
            addToDigest != null -> "JourneyNode{addToDigest=$addToDigest}"
            exit != null -> "JourneyNode{exit=$exit}"
            branch != null -> "JourneyNode{branch=$branch}"
            _json != null -> "JourneyNode{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid JourneyNode")
        }

    companion object {

        /**
         * Trigger fired when the journey is invoked via the API. The optional `schema` field is a
         * JSON Schema that validates the invocation payload.
         */
        @JvmStatic
        fun ofApiInvokeTrigger(apiInvokeTrigger: JourneyApiInvokeTriggerNode) =
            JourneyNode(apiInvokeTrigger = apiInvokeTrigger)

        /** Trigger fired by a segment event (`identify`, `group`, or `track`). */
        @JvmStatic
        fun ofSegmentTrigger(segmentTrigger: JourneySegmentTriggerNode) =
            JourneyNode(segmentTrigger = segmentTrigger)

        /**
         * Send to the recipient. A send node sources its content from EXACTLY ONE of
         * `message.template` (a single notification template) or `experiment` (an A/B split across
         * weighted template variants) — supplying both, or neither, is rejected. Optionally
         * override the recipient address, delay the send, or attach `data`.
         */
        @JvmStatic fun ofSend(send: JourneySendNode) = JourneyNode(send = send)

        /** Pause the journey run for a fixed `duration`. */
        @JvmStatic
        fun ofDelayDuration(delayDuration: JourneyDelayDurationNode) =
            JourneyNode(delayDuration = delayDuration)

        /** Pause the journey run `until` a specific time. */
        @JvmStatic
        fun ofDelayUntil(delayUntil: JourneyDelayUntilNode) = JourneyNode(delayUntil = delayUntil)

        /**
         * Issue an HTTP GET or DELETE request and merge the response into the journey state per
         * `merge_strategy`.
         */
        @JvmStatic
        fun ofFetchGetDelete(fetchGetDelete: JourneyFetchGetDeleteNode) =
            JourneyNode(fetchGetDelete = fetchGetDelete)

        /**
         * Issue an HTTP POST or PUT request with a `body` and merge the response into the journey
         * state per `merge_strategy`.
         */
        @JvmStatic
        fun ofFetchPostPut(fetchPostPut: JourneyFetchPostPutNode) =
            JourneyNode(fetchPostPut = fetchPostPut)

        /**
         * Invoke an AI step with `user_prompt` and optional `web_search`. Returns a structured
         * response conforming to `output_schema`.
         */
        @JvmStatic fun ofAi(ai: JourneyAiNode) = JourneyNode(ai = ai)

        /**
         * Throttle the journey by a static `scope` (`user` or `global`), allowing at most
         * `max_allowed` invocations per `period`.
         */
        @JvmStatic
        fun ofThrottleStatic(throttleStatic: JourneyThrottleStaticNode) =
            JourneyNode(throttleStatic = throttleStatic)

        /**
         * Throttle the journey by a dynamic `throttle_key`, allowing at most `max_allowed`
         * invocations per `period`.
         */
        @JvmStatic
        fun ofThrottleDynamic(throttleDynamic: JourneyThrottleDynamicNode) =
            JourneyNode(throttleDynamic = throttleDynamic)

        /**
         * Collect events arriving at the node into a single batch and fire one downstream step with
         * the aggregated payload. The first event into a batch owns the run; later contributing
         * events terminate at the batch step. The batch releases when any of `max_items` is
         * reached, a quiet window of `wait_period` elapses, or the `max_wait_period` ceiling hits.
         */
        @JvmStatic fun ofBatch(batch: JourneyBatchNode) = JourneyNode(batch = batch)

        /**
         * Add the current event to a digest keyed by the given subscription topic. The digest
         * accumulates events and releases them on the schedule configured for the topic.
         */
        @JvmStatic
        fun ofAddToDigest(addToDigest: JourneyAddToDigestNode) =
            JourneyNode(addToDigest = addToDigest)

        /** Terminate the journey run. */
        @JvmStatic fun ofExit(exit: JourneyExitNode) = JourneyNode(exit = exit)

        /**
         * Branch node. Routes to the first entry in `paths[]` whose `conditions` match, else falls
         * through to `default.nodes`.
         */
        @JvmStatic fun ofBranch(branch: JourneyBranchNode) = JourneyNode(branch = branch)
    }

    /**
     * An interface that defines how to map each variant of [JourneyNode] to a value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Trigger fired when the journey is invoked via the API. The optional `schema` field is a
         * JSON Schema that validates the invocation payload.
         */
        fun visitApiInvokeTrigger(apiInvokeTrigger: JourneyApiInvokeTriggerNode): T

        /** Trigger fired by a segment event (`identify`, `group`, or `track`). */
        fun visitSegmentTrigger(segmentTrigger: JourneySegmentTriggerNode): T

        /**
         * Send to the recipient. A send node sources its content from EXACTLY ONE of
         * `message.template` (a single notification template) or `experiment` (an A/B split across
         * weighted template variants) — supplying both, or neither, is rejected. Optionally
         * override the recipient address, delay the send, or attach `data`.
         */
        fun visitSend(send: JourneySendNode): T

        /** Pause the journey run for a fixed `duration`. */
        fun visitDelayDuration(delayDuration: JourneyDelayDurationNode): T

        /** Pause the journey run `until` a specific time. */
        fun visitDelayUntil(delayUntil: JourneyDelayUntilNode): T

        /**
         * Issue an HTTP GET or DELETE request and merge the response into the journey state per
         * `merge_strategy`.
         */
        fun visitFetchGetDelete(fetchGetDelete: JourneyFetchGetDeleteNode): T

        /**
         * Issue an HTTP POST or PUT request with a `body` and merge the response into the journey
         * state per `merge_strategy`.
         */
        fun visitFetchPostPut(fetchPostPut: JourneyFetchPostPutNode): T

        /**
         * Invoke an AI step with `user_prompt` and optional `web_search`. Returns a structured
         * response conforming to `output_schema`.
         */
        fun visitAi(ai: JourneyAiNode): T

        /**
         * Throttle the journey by a static `scope` (`user` or `global`), allowing at most
         * `max_allowed` invocations per `period`.
         */
        fun visitThrottleStatic(throttleStatic: JourneyThrottleStaticNode): T

        /**
         * Throttle the journey by a dynamic `throttle_key`, allowing at most `max_allowed`
         * invocations per `period`.
         */
        fun visitThrottleDynamic(throttleDynamic: JourneyThrottleDynamicNode): T

        /**
         * Collect events arriving at the node into a single batch and fire one downstream step with
         * the aggregated payload. The first event into a batch owns the run; later contributing
         * events terminate at the batch step. The batch releases when any of `max_items` is
         * reached, a quiet window of `wait_period` elapses, or the `max_wait_period` ceiling hits.
         */
        fun visitBatch(batch: JourneyBatchNode): T

        /**
         * Add the current event to a digest keyed by the given subscription topic. The digest
         * accumulates events and releases them on the schedule configured for the topic.
         */
        fun visitAddToDigest(addToDigest: JourneyAddToDigestNode): T

        /** Terminate the journey run. */
        fun visitExit(exit: JourneyExitNode): T

        /**
         * Branch node. Routes to the first entry in `paths[]` whose `conditions` match, else falls
         * through to `default.nodes`.
         */
        fun visitBranch(branch: JourneyBranchNode): T

        /**
         * Maps an unknown variant of [JourneyNode] to a value of type [T].
         *
         * An instance of [JourneyNode] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown JourneyNode: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<JourneyNode>(JourneyNode::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): JourneyNode {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<JourneyApiInvokeTriggerNode>())?.let {
                            JourneyNode(apiInvokeTrigger = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneySegmentTriggerNode>())?.let {
                            JourneyNode(segmentTrigger = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneySendNode>())?.let {
                            JourneyNode(send = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyDelayDurationNode>())?.let {
                            JourneyNode(delayDuration = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyDelayUntilNode>())?.let {
                            JourneyNode(delayUntil = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyFetchGetDeleteNode>())?.let {
                            JourneyNode(fetchGetDelete = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyFetchPostPutNode>())?.let {
                            JourneyNode(fetchPostPut = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyAiNode>())?.let {
                            JourneyNode(ai = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyThrottleStaticNode>())?.let {
                            JourneyNode(throttleStatic = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyThrottleDynamicNode>())?.let {
                            JourneyNode(throttleDynamic = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyBatchNode>())?.let {
                            JourneyNode(batch = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyAddToDigestNode>())?.let {
                            JourneyNode(addToDigest = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyExitNode>())?.let {
                            JourneyNode(exit = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyBranchNode>())?.let {
                            JourneyNode(branch = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> JourneyNode(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<JourneyNode>(JourneyNode::class) {

        override fun serialize(
            value: JourneyNode,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.apiInvokeTrigger != null -> generator.writeObject(value.apiInvokeTrigger)
                value.segmentTrigger != null -> generator.writeObject(value.segmentTrigger)
                value.send != null -> generator.writeObject(value.send)
                value.delayDuration != null -> generator.writeObject(value.delayDuration)
                value.delayUntil != null -> generator.writeObject(value.delayUntil)
                value.fetchGetDelete != null -> generator.writeObject(value.fetchGetDelete)
                value.fetchPostPut != null -> generator.writeObject(value.fetchPostPut)
                value.ai != null -> generator.writeObject(value.ai)
                value.throttleStatic != null -> generator.writeObject(value.throttleStatic)
                value.throttleDynamic != null -> generator.writeObject(value.throttleDynamic)
                value.batch != null -> generator.writeObject(value.batch)
                value.addToDigest != null -> generator.writeObject(value.addToDigest)
                value.exit != null -> generator.writeObject(value.exit)
                value.branch != null -> generator.writeObject(value.branch)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid JourneyNode")
            }
        }
    }

    /**
     * Collect events arriving at the node into a single batch and fire one downstream step with the
     * aggregated payload. The first event into a batch owns the run; later contributing events
     * terminate at the batch step. The batch releases when any of `max_items` is reached, a quiet
     * window of `wait_period` elapses, or the `max_wait_period` ceiling hits.
     */
    class JourneyBatchNode
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxWaitPeriod: JsonField<String>,
        private val retain: JsonField<Retain>,
        private val scope: JsonField<Scope>,
        private val type: JsonField<Type>,
        private val waitPeriod: JsonField<String>,
        private val id: JsonField<String>,
        private val categoryKey: JsonField<String>,
        private val conditions: JsonField<JourneyConditionsField>,
        private val maxItems: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_wait_period")
            @ExcludeMissing
            maxWaitPeriod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retain") @ExcludeMissing retain: JsonField<Retain> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("wait_period")
            @ExcludeMissing
            waitPeriod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category_key")
            @ExcludeMissing
            categoryKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conditions")
            @ExcludeMissing
            conditions: JsonField<JourneyConditionsField> = JsonMissing.of(),
            @JsonProperty("max_items") @ExcludeMissing maxItems: JsonField<Long> = JsonMissing.of(),
        ) : this(
            maxWaitPeriod,
            retain,
            scope,
            type,
            waitPeriod,
            id,
            categoryKey,
            conditions,
            maxItems,
            mutableMapOf(),
        )

        /**
         * ISO 8601 duration. Hard ceiling from the first event into the batch; releases the batch
         * unconditionally when it elapses.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxWaitPeriod(): String = maxWaitPeriod.getRequired("max_wait_period")

        /**
         * How to select which collected events to retain in the aggregated payload when the batch
         * releases.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retain(): Retain = retain.getRequired("retain")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): Scope = scope.getRequired("scope")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * ISO 8601 duration. Quiet window that releases the batch when it elapses with no new
         * contributing events. Must be less than `max_wait_period`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun waitPeriod(): String = waitPeriod.getRequired("wait_period")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Optional partition key. Events with the same `category_key` are batched together; events
         * with different values are batched separately.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categoryKey(): Optional<String> = categoryKey.getOptional("category_key")

        /**
         * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group, or
         * an AND/OR nested group. Omit the `conditions` property entirely to express "no
         * conditions".
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conditions(): Optional<JourneyConditionsField> = conditions.getOptional("conditions")

        /**
         * Releases the batch once this many events have been collected.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxItems(): Optional<Long> = maxItems.getOptional("max_items")

        /**
         * Returns the raw JSON value of [maxWaitPeriod].
         *
         * Unlike [maxWaitPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_wait_period")
        @ExcludeMissing
        fun _maxWaitPeriod(): JsonField<String> = maxWaitPeriod

        /**
         * Returns the raw JSON value of [retain].
         *
         * Unlike [retain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retain") @ExcludeMissing fun _retain(): JsonField<Retain> = retain

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [waitPeriod].
         *
         * Unlike [waitPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wait_period")
        @ExcludeMissing
        fun _waitPeriod(): JsonField<String> = waitPeriod

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [categoryKey].
         *
         * Unlike [categoryKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category_key")
        @ExcludeMissing
        fun _categoryKey(): JsonField<String> = categoryKey

        /**
         * Returns the raw JSON value of [conditions].
         *
         * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("conditions")
        @ExcludeMissing
        fun _conditions(): JsonField<JourneyConditionsField> = conditions

        /**
         * Returns the raw JSON value of [maxItems].
         *
         * Unlike [maxItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_items") @ExcludeMissing fun _maxItems(): JsonField<Long> = maxItems

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
             * Returns a mutable builder for constructing an instance of [JourneyBatchNode].
             *
             * The following fields are required:
             * ```java
             * .maxWaitPeriod()
             * .retain()
             * .scope()
             * .type()
             * .waitPeriod()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JourneyBatchNode]. */
        class Builder internal constructor() {

            private var maxWaitPeriod: JsonField<String>? = null
            private var retain: JsonField<Retain>? = null
            private var scope: JsonField<Scope>? = null
            private var type: JsonField<Type>? = null
            private var waitPeriod: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var categoryKey: JsonField<String> = JsonMissing.of()
            private var conditions: JsonField<JourneyConditionsField> = JsonMissing.of()
            private var maxItems: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(journeyBatchNode: JourneyBatchNode) = apply {
                maxWaitPeriod = journeyBatchNode.maxWaitPeriod
                retain = journeyBatchNode.retain
                scope = journeyBatchNode.scope
                type = journeyBatchNode.type
                waitPeriod = journeyBatchNode.waitPeriod
                id = journeyBatchNode.id
                categoryKey = journeyBatchNode.categoryKey
                conditions = journeyBatchNode.conditions
                maxItems = journeyBatchNode.maxItems
                additionalProperties = journeyBatchNode.additionalProperties.toMutableMap()
            }

            /**
             * ISO 8601 duration. Hard ceiling from the first event into the batch; releases the
             * batch unconditionally when it elapses.
             */
            fun maxWaitPeriod(maxWaitPeriod: String) = maxWaitPeriod(JsonField.of(maxWaitPeriod))

            /**
             * Sets [Builder.maxWaitPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxWaitPeriod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxWaitPeriod(maxWaitPeriod: JsonField<String>) = apply {
                this.maxWaitPeriod = maxWaitPeriod
            }

            /**
             * How to select which collected events to retain in the aggregated payload when the
             * batch releases.
             */
            fun retain(retain: Retain) = retain(JsonField.of(retain))

            /**
             * Sets [Builder.retain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retain] with a well-typed [Retain] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retain(retain: JsonField<Retain>) = apply { this.retain = retain }

            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * ISO 8601 duration. Quiet window that releases the batch when it elapses with no new
             * contributing events. Must be less than `max_wait_period`.
             */
            fun waitPeriod(waitPeriod: String) = waitPeriod(JsonField.of(waitPeriod))

            /**
             * Sets [Builder.waitPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitPeriod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waitPeriod(waitPeriod: JsonField<String>) = apply { this.waitPeriod = waitPeriod }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Optional partition key. Events with the same `category_key` are batched together;
             * events with different values are batched separately.
             */
            fun categoryKey(categoryKey: String) = categoryKey(JsonField.of(categoryKey))

            /**
             * Sets [Builder.categoryKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categoryKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categoryKey(categoryKey: JsonField<String>) = apply {
                this.categoryKey = categoryKey
            }

            /**
             * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group,
             * or an AND/OR nested group. Omit the `conditions` property entirely to express "no
             * conditions".
             */
            fun conditions(conditions: JourneyConditionsField) =
                conditions(JsonField.of(conditions))

            /**
             * Sets [Builder.conditions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conditions] with a well-typed
             * [JourneyConditionsField] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun conditions(conditions: JsonField<JourneyConditionsField>) = apply {
                this.conditions = conditions
            }

            /**
             * Alias for calling [conditions] with
             * `JourneyConditionsField.ofConditionAtom(conditionAtom)`.
             */
            fun conditionsOfConditionAtom(conditionAtom: List<String>) =
                conditions(JourneyConditionsField.ofConditionAtom(conditionAtom))

            /**
             * Alias for calling [conditions] with
             * `JourneyConditionsField.ofConditionGroup(conditionGroup)`.
             */
            fun conditions(conditionGroup: JourneyConditionGroup) =
                conditions(JourneyConditionsField.ofConditionGroup(conditionGroup))

            /**
             * Alias for calling [conditions] with
             * `JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup)`.
             */
            fun conditions(conditionNestedGroup: JourneyConditionNestedGroup) =
                conditions(JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup))

            /** Releases the batch once this many events have been collected. */
            fun maxItems(maxItems: Long) = maxItems(JsonField.of(maxItems))

            /**
             * Sets [Builder.maxItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxItems] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxItems(maxItems: JsonField<Long>) = apply { this.maxItems = maxItems }

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
             * Returns an immutable instance of [JourneyBatchNode].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .maxWaitPeriod()
             * .retain()
             * .scope()
             * .type()
             * .waitPeriod()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): JourneyBatchNode =
                JourneyBatchNode(
                    checkRequired("maxWaitPeriod", maxWaitPeriod),
                    checkRequired("retain", retain),
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    checkRequired("waitPeriod", waitPeriod),
                    id,
                    categoryKey,
                    conditions,
                    maxItems,
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
        fun validate(): JourneyBatchNode = apply {
            if (validated) {
                return@apply
            }

            maxWaitPeriod()
            retain().validate()
            scope().validate()
            type().validate()
            waitPeriod()
            id()
            categoryKey()
            conditions().ifPresent { it.validate() }
            maxItems()
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
            (if (maxWaitPeriod.asKnown().isPresent) 1 else 0) +
                (retain.asKnown().getOrNull()?.validity() ?: 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (waitPeriod.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (categoryKey.asKnown().isPresent) 1 else 0) +
                (conditions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxItems.asKnown().isPresent) 1 else 0)

        /**
         * How to select which collected events to retain in the aggregated payload when the batch
         * releases.
         */
        class Retain
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Long>,
            private val type: JsonField<Type>,
            private val sortKey: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("sort_key")
                @ExcludeMissing
                sortKey: JsonField<String> = JsonMissing.of(),
            ) : this(count, type, sortKey, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Long = count.getRequired("count")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Dot-path into the event payload (e.g. `data.priority`). Required when `type` is
             * `highest` or `lowest`.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sortKey(): Optional<String> = sortKey.getOptional("sort_key")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [sortKey].
             *
             * Unlike [sortKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sort_key") @ExcludeMissing fun _sortKey(): JsonField<String> = sortKey

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
                 * Returns a mutable builder for constructing an instance of [Retain].
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Retain]. */
            class Builder internal constructor() {

                private var count: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var sortKey: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(retain: Retain) = apply {
                    count = retain.count
                    type = retain.type
                    sortKey = retain.sortKey
                    additionalProperties = retain.additionalProperties.toMutableMap()
                }

                fun count(count: Long) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Long>) = apply { this.count = count }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Dot-path into the event payload (e.g. `data.priority`). Required when `type` is
                 * `highest` or `lowest`.
                 */
                fun sortKey(sortKey: String) = sortKey(JsonField.of(sortKey))

                /**
                 * Sets [Builder.sortKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sortKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sortKey(sortKey: JsonField<String>) = apply { this.sortKey = sortKey }

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
                 * Returns an immutable instance of [Retain].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Retain =
                    Retain(
                        checkRequired("count", count),
                        checkRequired("type", type),
                        sortKey,
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
            fun validate(): Retain = apply {
                if (validated) {
                    return@apply
                }

                count()
                type().validate()
                sortKey()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (sortKey.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val FIRST = of("first")

                    @JvmField val LAST = of("last")

                    @JvmField val HIGHEST = of("highest")

                    @JvmField val LOWEST = of("lowest")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FIRST,
                    LAST,
                    HIGHEST,
                    LOWEST,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIRST,
                    LAST,
                    HIGHEST,
                    LOWEST,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        FIRST -> Value.FIRST
                        LAST -> Value.LAST
                        HIGHEST -> Value.HIGHEST
                        LOWEST -> Value.LOWEST
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
                        FIRST -> Known.FIRST
                        LAST -> Known.LAST
                        HIGHEST -> Known.HIGHEST
                        LOWEST -> Known.LOWEST
                        else -> throw CourierInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Retain &&
                    count == other.count &&
                    type == other.type &&
                    sortKey == other.sortKey &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, type, sortKey, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Retain{count=$count, type=$type, sortKey=$sortKey, additionalProperties=$additionalProperties}"
        }

        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val USER = of("user")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                USER
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USER,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    USER -> Value.USER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    USER -> Known.USER
                    else -> throw CourierInvalidDataException("Unknown Scope: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BATCH = of("batch")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                BATCH
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BATCH,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BATCH -> Value.BATCH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    BATCH -> Known.BATCH
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JourneyBatchNode &&
                maxWaitPeriod == other.maxWaitPeriod &&
                retain == other.retain &&
                scope == other.scope &&
                type == other.type &&
                waitPeriod == other.waitPeriod &&
                id == other.id &&
                categoryKey == other.categoryKey &&
                conditions == other.conditions &&
                maxItems == other.maxItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                maxWaitPeriod,
                retain,
                scope,
                type,
                waitPeriod,
                id,
                categoryKey,
                conditions,
                maxItems,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JourneyBatchNode{maxWaitPeriod=$maxWaitPeriod, retain=$retain, scope=$scope, type=$type, waitPeriod=$waitPeriod, id=$id, categoryKey=$categoryKey, conditions=$conditions, maxItems=$maxItems, additionalProperties=$additionalProperties}"
    }

    /**
     * Add the current event to a digest keyed by the given subscription topic. The digest
     * accumulates events and releases them on the schedule configured for the topic.
     */
    class JourneyAddToDigestNode
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val subscriptionTopicId: JsonField<String>,
        private val type: JsonField<Type>,
        private val id: JsonField<String>,
        private val conditions: JsonField<JourneyConditionsField>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subscription_topic_id")
            @ExcludeMissing
            subscriptionTopicId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conditions")
            @ExcludeMissing
            conditions: JsonField<JourneyConditionsField> = JsonMissing.of(),
        ) : this(subscriptionTopicId, type, id, conditions, mutableMapOf())

        /**
         * The subscription topic that owns the digest the event is added to.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionTopicId(): String = subscriptionTopicId.getRequired("subscription_topic_id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group, or
         * an AND/OR nested group. Omit the `conditions` property entirely to express "no
         * conditions".
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conditions(): Optional<JourneyConditionsField> = conditions.getOptional("conditions")

        /**
         * Returns the raw JSON value of [subscriptionTopicId].
         *
         * Unlike [subscriptionTopicId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_topic_id")
        @ExcludeMissing
        fun _subscriptionTopicId(): JsonField<String> = subscriptionTopicId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [conditions].
         *
         * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("conditions")
        @ExcludeMissing
        fun _conditions(): JsonField<JourneyConditionsField> = conditions

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
             * Returns a mutable builder for constructing an instance of [JourneyAddToDigestNode].
             *
             * The following fields are required:
             * ```java
             * .subscriptionTopicId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JourneyAddToDigestNode]. */
        class Builder internal constructor() {

            private var subscriptionTopicId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var conditions: JsonField<JourneyConditionsField> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(journeyAddToDigestNode: JourneyAddToDigestNode) = apply {
                subscriptionTopicId = journeyAddToDigestNode.subscriptionTopicId
                type = journeyAddToDigestNode.type
                id = journeyAddToDigestNode.id
                conditions = journeyAddToDigestNode.conditions
                additionalProperties = journeyAddToDigestNode.additionalProperties.toMutableMap()
            }

            /** The subscription topic that owns the digest the event is added to. */
            fun subscriptionTopicId(subscriptionTopicId: String) =
                subscriptionTopicId(JsonField.of(subscriptionTopicId))

            /**
             * Sets [Builder.subscriptionTopicId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionTopicId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionTopicId(subscriptionTopicId: JsonField<String>) = apply {
                this.subscriptionTopicId = subscriptionTopicId
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group,
             * or an AND/OR nested group. Omit the `conditions` property entirely to express "no
             * conditions".
             */
            fun conditions(conditions: JourneyConditionsField) =
                conditions(JsonField.of(conditions))

            /**
             * Sets [Builder.conditions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conditions] with a well-typed
             * [JourneyConditionsField] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun conditions(conditions: JsonField<JourneyConditionsField>) = apply {
                this.conditions = conditions
            }

            /**
             * Alias for calling [conditions] with
             * `JourneyConditionsField.ofConditionAtom(conditionAtom)`.
             */
            fun conditionsOfConditionAtom(conditionAtom: List<String>) =
                conditions(JourneyConditionsField.ofConditionAtom(conditionAtom))

            /**
             * Alias for calling [conditions] with
             * `JourneyConditionsField.ofConditionGroup(conditionGroup)`.
             */
            fun conditions(conditionGroup: JourneyConditionGroup) =
                conditions(JourneyConditionsField.ofConditionGroup(conditionGroup))

            /**
             * Alias for calling [conditions] with
             * `JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup)`.
             */
            fun conditions(conditionNestedGroup: JourneyConditionNestedGroup) =
                conditions(JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup))

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
             * Returns an immutable instance of [JourneyAddToDigestNode].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .subscriptionTopicId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): JourneyAddToDigestNode =
                JourneyAddToDigestNode(
                    checkRequired("subscriptionTopicId", subscriptionTopicId),
                    checkRequired("type", type),
                    id,
                    conditions,
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
        fun validate(): JourneyAddToDigestNode = apply {
            if (validated) {
                return@apply
            }

            subscriptionTopicId()
            type().validate()
            id()
            conditions().ifPresent { it.validate() }
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
            (if (subscriptionTopicId.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (conditions.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ADD_TO_DIGEST = of("add-to-digest")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ADD_TO_DIGEST
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADD_TO_DIGEST,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ADD_TO_DIGEST -> Value.ADD_TO_DIGEST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ADD_TO_DIGEST -> Known.ADD_TO_DIGEST
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JourneyAddToDigestNode &&
                subscriptionTopicId == other.subscriptionTopicId &&
                type == other.type &&
                id == other.id &&
                conditions == other.conditions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(subscriptionTopicId, type, id, conditions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JourneyAddToDigestNode{subscriptionTopicId=$subscriptionTopicId, type=$type, id=$id, conditions=$conditions, additionalProperties=$additionalProperties}"
    }

    /**
     * Branch node. Routes to the first entry in `paths[]` whose `conditions` match, else falls
     * through to `default.nodes`.
     */
    class JourneyBranchNode
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val default_: JsonField<Default>,
        private val paths: JsonField<List<Path>>,
        private val type: JsonField<Type>,
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("default")
            @ExcludeMissing
            default_: JsonField<Default> = JsonMissing.of(),
            @JsonProperty("paths") @ExcludeMissing paths: JsonField<List<Path>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        ) : this(default_, paths, type, id, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun default_(): Default = default_.getRequired("default")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paths(): List<Path> = paths.getRequired("paths")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Returns the raw JSON value of [default_].
         *
         * Unlike [default_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("default") @ExcludeMissing fun _default_(): JsonField<Default> = default_

        /**
         * Returns the raw JSON value of [paths].
         *
         * Unlike [paths], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paths") @ExcludeMissing fun _paths(): JsonField<List<Path>> = paths

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [JourneyBranchNode].
             *
             * The following fields are required:
             * ```java
             * .default_()
             * .paths()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JourneyBranchNode]. */
        class Builder internal constructor() {

            private var default_: JsonField<Default>? = null
            private var paths: JsonField<MutableList<Path>>? = null
            private var type: JsonField<Type>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(journeyBranchNode: JourneyBranchNode) = apply {
                default_ = journeyBranchNode.default_
                paths = journeyBranchNode.paths.map { it.toMutableList() }
                type = journeyBranchNode.type
                id = journeyBranchNode.id
                additionalProperties = journeyBranchNode.additionalProperties.toMutableMap()
            }

            fun default_(default_: Default) = default_(JsonField.of(default_))

            /**
             * Sets [Builder.default_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.default_] with a well-typed [Default] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun default_(default_: JsonField<Default>) = apply { this.default_ = default_ }

            fun paths(paths: List<Path>) = paths(JsonField.of(paths))

            /**
             * Sets [Builder.paths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paths] with a well-typed `List<Path>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paths(paths: JsonField<List<Path>>) = apply {
                this.paths = paths.map { it.toMutableList() }
            }

            /**
             * Adds a single [Path] to [paths].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPath(path: Path) = apply {
                paths =
                    (paths ?: JsonField.of(mutableListOf())).also {
                        checkKnown("paths", it).add(path)
                    }
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [JourneyBranchNode].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .default_()
             * .paths()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): JourneyBranchNode =
                JourneyBranchNode(
                    checkRequired("default_", default_),
                    checkRequired("paths", paths).map { it.toImmutable() },
                    checkRequired("type", type),
                    id,
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
        fun validate(): JourneyBranchNode = apply {
            if (validated) {
                return@apply
            }

            default_().validate()
            paths().forEach { it.validate() }
            type().validate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (default_.asKnown().getOrNull()?.validity() ?: 0) +
                (paths.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0)

        class Default
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val nodes: JsonField<List<JourneyNode>>,
            private val label: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("nodes")
                @ExcludeMissing
                nodes: JsonField<List<JourneyNode>> = JsonMissing.of(),
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            ) : this(nodes, label, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nodes(): List<JourneyNode> = nodes.getRequired("nodes")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * Returns the raw JSON value of [nodes].
             *
             * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nodes")
            @ExcludeMissing
            fun _nodes(): JsonField<List<JourneyNode>> = nodes

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
                 * Returns a mutable builder for constructing an instance of [Default].
                 *
                 * The following fields are required:
                 * ```java
                 * .nodes()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Default]. */
            class Builder internal constructor() {

                private var nodes: JsonField<MutableList<JourneyNode>>? = null
                private var label: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(default_: Default) = apply {
                    nodes = default_.nodes.map { it.toMutableList() }
                    label = default_.label
                    additionalProperties = default_.additionalProperties.toMutableMap()
                }

                fun nodes(nodes: List<JourneyNode>) = nodes(JsonField.of(nodes))

                /**
                 * Sets [Builder.nodes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nodes] with a well-typed `List<JourneyNode>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                        (nodes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("nodes", it).add(node)
                        }
                }

                /**
                 * Alias for calling [addNode] with
                 * `JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger)`.
                 */
                fun addNode(apiInvokeTrigger: JourneyApiInvokeTriggerNode) =
                    addNode(JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofSegmentTrigger(segmentTrigger)`.
                 */
                fun addNode(segmentTrigger: JourneySegmentTriggerNode) =
                    addNode(JourneyNode.ofSegmentTrigger(segmentTrigger))

                /** Alias for calling [addNode] with `JourneyNode.ofSend(send)`. */
                fun addNode(send: JourneySendNode) = addNode(JourneyNode.ofSend(send))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofDelayDuration(delayDuration)`.
                 */
                fun addNode(delayDuration: JourneyDelayDurationNode) =
                    addNode(JourneyNode.ofDelayDuration(delayDuration))

                /** Alias for calling [addNode] with `JourneyNode.ofDelayUntil(delayUntil)`. */
                fun addNode(delayUntil: JourneyDelayUntilNode) =
                    addNode(JourneyNode.ofDelayUntil(delayUntil))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofFetchGetDelete(fetchGetDelete)`.
                 */
                fun addNode(fetchGetDelete: JourneyFetchGetDeleteNode) =
                    addNode(JourneyNode.ofFetchGetDelete(fetchGetDelete))

                /** Alias for calling [addNode] with `JourneyNode.ofFetchPostPut(fetchPostPut)`. */
                fun addNode(fetchPostPut: JourneyFetchPostPutNode) =
                    addNode(JourneyNode.ofFetchPostPut(fetchPostPut))

                /** Alias for calling [addNode] with `JourneyNode.ofAi(ai)`. */
                fun addNode(ai: JourneyAiNode) = addNode(JourneyNode.ofAi(ai))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofThrottleStatic(throttleStatic)`.
                 */
                fun addNode(throttleStatic: JourneyThrottleStaticNode) =
                    addNode(JourneyNode.ofThrottleStatic(throttleStatic))

                /**
                 * Alias for calling [addNode] with
                 * `JourneyNode.ofThrottleDynamic(throttleDynamic)`.
                 */
                fun addNode(throttleDynamic: JourneyThrottleDynamicNode) =
                    addNode(JourneyNode.ofThrottleDynamic(throttleDynamic))

                /** Alias for calling [addNode] with `JourneyNode.ofBatch(batch)`. */
                fun addNode(batch: JourneyBatchNode) = addNode(JourneyNode.ofBatch(batch))

                /** Alias for calling [addNode] with `JourneyNode.ofAddToDigest(addToDigest)`. */
                fun addNode(addToDigest: JourneyAddToDigestNode) =
                    addNode(JourneyNode.ofAddToDigest(addToDigest))

                /** Alias for calling [addNode] with `JourneyNode.ofExit(exit)`. */
                fun addNode(exit: JourneyExitNode) = addNode(JourneyNode.ofExit(exit))

                /** Alias for calling [addNode] with `JourneyNode.ofBranch(branch)`. */
                fun addNode(branch: JourneyBranchNode) = addNode(JourneyNode.ofBranch(branch))

                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

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
                 * Returns an immutable instance of [Default].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .nodes()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Default =
                    Default(
                        checkRequired("nodes", nodes).map { it.toImmutable() },
                        label,
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
            fun validate(): Default = apply {
                if (validated) {
                    return@apply
                }

                nodes().forEach { it.validate() }
                label()
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
                (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (label.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Default &&
                    nodes == other.nodes &&
                    label == other.label &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(nodes, label, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Default{nodes=$nodes, label=$label, additionalProperties=$additionalProperties}"
        }

        class Path
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val conditions: JsonField<JourneyConditionsField>,
            private val nodes: JsonField<List<JourneyNode>>,
            private val label: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("conditions")
                @ExcludeMissing
                conditions: JsonField<JourneyConditionsField> = JsonMissing.of(),
                @JsonProperty("nodes")
                @ExcludeMissing
                nodes: JsonField<List<JourneyNode>> = JsonMissing.of(),
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            ) : this(conditions, nodes, label, mutableMapOf())

            /**
             * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group,
             * or an AND/OR nested group. Omit the `conditions` property entirely to express "no
             * conditions".
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun conditions(): JourneyConditionsField = conditions.getRequired("conditions")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nodes(): List<JourneyNode> = nodes.getRequired("nodes")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * Returns the raw JSON value of [conditions].
             *
             * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("conditions")
            @ExcludeMissing
            fun _conditions(): JsonField<JourneyConditionsField> = conditions

            /**
             * Returns the raw JSON value of [nodes].
             *
             * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nodes")
            @ExcludeMissing
            fun _nodes(): JsonField<List<JourneyNode>> = nodes

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
                 * Returns a mutable builder for constructing an instance of [Path].
                 *
                 * The following fields are required:
                 * ```java
                 * .conditions()
                 * .nodes()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Path]. */
            class Builder internal constructor() {

                private var conditions: JsonField<JourneyConditionsField>? = null
                private var nodes: JsonField<MutableList<JourneyNode>>? = null
                private var label: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(path: Path) = apply {
                    conditions = path.conditions
                    nodes = path.nodes.map { it.toMutableList() }
                    label = path.label
                    additionalProperties = path.additionalProperties.toMutableMap()
                }

                /**
                 * Condition spec for a journey node. Accepts a single condition atom, an AND/OR
                 * group, or an AND/OR nested group. Omit the `conditions` property entirely to
                 * express "no conditions".
                 */
                fun conditions(conditions: JourneyConditionsField) =
                    conditions(JsonField.of(conditions))

                /**
                 * Sets [Builder.conditions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conditions] with a well-typed
                 * [JourneyConditionsField] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conditions(conditions: JsonField<JourneyConditionsField>) = apply {
                    this.conditions = conditions
                }

                /**
                 * Alias for calling [conditions] with
                 * `JourneyConditionsField.ofConditionAtom(conditionAtom)`.
                 */
                fun conditionsOfConditionAtom(conditionAtom: List<String>) =
                    conditions(JourneyConditionsField.ofConditionAtom(conditionAtom))

                /**
                 * Alias for calling [conditions] with
                 * `JourneyConditionsField.ofConditionGroup(conditionGroup)`.
                 */
                fun conditions(conditionGroup: JourneyConditionGroup) =
                    conditions(JourneyConditionsField.ofConditionGroup(conditionGroup))

                /**
                 * Alias for calling [conditions] with
                 * `JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup)`.
                 */
                fun conditions(conditionNestedGroup: JourneyConditionNestedGroup) =
                    conditions(JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup))

                fun nodes(nodes: List<JourneyNode>) = nodes(JsonField.of(nodes))

                /**
                 * Sets [Builder.nodes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nodes] with a well-typed `List<JourneyNode>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                        (nodes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("nodes", it).add(node)
                        }
                }

                /**
                 * Alias for calling [addNode] with
                 * `JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger)`.
                 */
                fun addNode(apiInvokeTrigger: JourneyApiInvokeTriggerNode) =
                    addNode(JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofSegmentTrigger(segmentTrigger)`.
                 */
                fun addNode(segmentTrigger: JourneySegmentTriggerNode) =
                    addNode(JourneyNode.ofSegmentTrigger(segmentTrigger))

                /** Alias for calling [addNode] with `JourneyNode.ofSend(send)`. */
                fun addNode(send: JourneySendNode) = addNode(JourneyNode.ofSend(send))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofDelayDuration(delayDuration)`.
                 */
                fun addNode(delayDuration: JourneyDelayDurationNode) =
                    addNode(JourneyNode.ofDelayDuration(delayDuration))

                /** Alias for calling [addNode] with `JourneyNode.ofDelayUntil(delayUntil)`. */
                fun addNode(delayUntil: JourneyDelayUntilNode) =
                    addNode(JourneyNode.ofDelayUntil(delayUntil))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofFetchGetDelete(fetchGetDelete)`.
                 */
                fun addNode(fetchGetDelete: JourneyFetchGetDeleteNode) =
                    addNode(JourneyNode.ofFetchGetDelete(fetchGetDelete))

                /** Alias for calling [addNode] with `JourneyNode.ofFetchPostPut(fetchPostPut)`. */
                fun addNode(fetchPostPut: JourneyFetchPostPutNode) =
                    addNode(JourneyNode.ofFetchPostPut(fetchPostPut))

                /** Alias for calling [addNode] with `JourneyNode.ofAi(ai)`. */
                fun addNode(ai: JourneyAiNode) = addNode(JourneyNode.ofAi(ai))

                /**
                 * Alias for calling [addNode] with `JourneyNode.ofThrottleStatic(throttleStatic)`.
                 */
                fun addNode(throttleStatic: JourneyThrottleStaticNode) =
                    addNode(JourneyNode.ofThrottleStatic(throttleStatic))

                /**
                 * Alias for calling [addNode] with
                 * `JourneyNode.ofThrottleDynamic(throttleDynamic)`.
                 */
                fun addNode(throttleDynamic: JourneyThrottleDynamicNode) =
                    addNode(JourneyNode.ofThrottleDynamic(throttleDynamic))

                /** Alias for calling [addNode] with `JourneyNode.ofBatch(batch)`. */
                fun addNode(batch: JourneyBatchNode) = addNode(JourneyNode.ofBatch(batch))

                /** Alias for calling [addNode] with `JourneyNode.ofAddToDigest(addToDigest)`. */
                fun addNode(addToDigest: JourneyAddToDigestNode) =
                    addNode(JourneyNode.ofAddToDigest(addToDigest))

                /** Alias for calling [addNode] with `JourneyNode.ofExit(exit)`. */
                fun addNode(exit: JourneyExitNode) = addNode(JourneyNode.ofExit(exit))

                /** Alias for calling [addNode] with `JourneyNode.ofBranch(branch)`. */
                fun addNode(branch: JourneyBranchNode) = addNode(JourneyNode.ofBranch(branch))

                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

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
                 * Returns an immutable instance of [Path].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .conditions()
                 * .nodes()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Path =
                    Path(
                        checkRequired("conditions", conditions),
                        checkRequired("nodes", nodes).map { it.toImmutable() },
                        label,
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
            fun validate(): Path = apply {
                if (validated) {
                    return@apply
                }

                conditions().validate()
                nodes().forEach { it.validate() }
                label()
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
                (conditions.asKnown().getOrNull()?.validity() ?: 0) +
                    (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (label.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Path &&
                    conditions == other.conditions &&
                    nodes == other.nodes &&
                    label == other.label &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(conditions, nodes, label, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Path{conditions=$conditions, nodes=$nodes, label=$label, additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BRANCH = of("branch")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                BRANCH
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BRANCH,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BRANCH -> Value.BRANCH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    BRANCH -> Known.BRANCH
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JourneyBranchNode &&
                default_ == other.default_ &&
                paths == other.paths &&
                type == other.type &&
                id == other.id &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(default_, paths, type, id, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JourneyBranchNode{default_=$default_, paths=$paths, type=$type, id=$id, additionalProperties=$additionalProperties}"
    }
}
