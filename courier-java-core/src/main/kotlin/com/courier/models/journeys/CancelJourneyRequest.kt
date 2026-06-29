// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.checkRequired
import com.courier.core.getOrThrow
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

/**
 * Request body for `POST /journeys/cancel`. Provide EXACTLY ONE of `cancelation_token` (cancels
 * every run associated with the token) or `run_id` (cancels a single tenant-scoped run).
 */
@JsonDeserialize(using = CancelJourneyRequest.Deserializer::class)
@JsonSerialize(using = CancelJourneyRequest.Serializer::class)
class CancelJourneyRequest
private constructor(
    private val byCancelationToken: ByCancelationToken? = null,
    private val byRunId: ByRunId? = null,
    private val _json: JsonValue? = null,
) {

    fun byCancelationToken(): Optional<ByCancelationToken> = Optional.ofNullable(byCancelationToken)

    fun byRunId(): Optional<ByRunId> = Optional.ofNullable(byRunId)

    fun isByCancelationToken(): Boolean = byCancelationToken != null

    fun isByRunId(): Boolean = byRunId != null

    fun asByCancelationToken(): ByCancelationToken =
        byCancelationToken.getOrThrow("byCancelationToken")

    fun asByRunId(): ByRunId = byRunId.getOrThrow("byRunId")

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
     * Optional<String> result = cancelJourneyRequest.accept(new CancelJourneyRequest.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitByCancelationToken(ByCancelationToken byCancelationToken) {
     *         return Optional.of(byCancelationToken.toString());
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
            byCancelationToken != null -> visitor.visitByCancelationToken(byCancelationToken)
            byRunId != null -> visitor.visitByRunId(byRunId)
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
    fun validate(): CancelJourneyRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitByCancelationToken(byCancelationToken: ByCancelationToken) {
                    byCancelationToken.validate()
                }

                override fun visitByRunId(byRunId: ByRunId) {
                    byRunId.validate()
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
                override fun visitByCancelationToken(byCancelationToken: ByCancelationToken) =
                    byCancelationToken.validity()

                override fun visitByRunId(byRunId: ByRunId) = byRunId.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CancelJourneyRequest &&
            byCancelationToken == other.byCancelationToken &&
            byRunId == other.byRunId
    }

    override fun hashCode(): Int = Objects.hash(byCancelationToken, byRunId)

    override fun toString(): String =
        when {
            byCancelationToken != null ->
                "CancelJourneyRequest{byCancelationToken=$byCancelationToken}"
            byRunId != null -> "CancelJourneyRequest{byRunId=$byRunId}"
            _json != null -> "CancelJourneyRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CancelJourneyRequest")
        }

    companion object {

        @JvmStatic
        fun ofByCancelationToken(byCancelationToken: ByCancelationToken) =
            CancelJourneyRequest(byCancelationToken = byCancelationToken)

        @JvmStatic fun ofByRunId(byRunId: ByRunId) = CancelJourneyRequest(byRunId = byRunId)
    }

    /**
     * An interface that defines how to map each variant of [CancelJourneyRequest] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitByCancelationToken(byCancelationToken: ByCancelationToken): T

        fun visitByRunId(byRunId: ByRunId): T

        /**
         * Maps an unknown variant of [CancelJourneyRequest] to a value of type [T].
         *
         * An instance of [CancelJourneyRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown CancelJourneyRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CancelJourneyRequest>(CancelJourneyRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CancelJourneyRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ByCancelationToken>())?.let {
                            CancelJourneyRequest(byCancelationToken = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ByRunId>())?.let {
                            CancelJourneyRequest(byRunId = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CancelJourneyRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<CancelJourneyRequest>(CancelJourneyRequest::class) {

        override fun serialize(
            value: CancelJourneyRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.byCancelationToken != null -> generator.writeObject(value.byCancelationToken)
                value.byRunId != null -> generator.writeObject(value.byRunId)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CancelJourneyRequest")
            }
        }
    }

    class ByCancelationToken
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cancelationToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cancelation_token")
            @ExcludeMissing
            cancelationToken: JsonField<String> = JsonMissing.of()
        ) : this(cancelationToken, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cancelationToken(): String = cancelationToken.getRequired("cancelation_token")

        /**
         * Returns the raw JSON value of [cancelationToken].
         *
         * Unlike [cancelationToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancelation_token")
        @ExcludeMissing
        fun _cancelationToken(): JsonField<String> = cancelationToken

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
             * Returns a mutable builder for constructing an instance of [ByCancelationToken].
             *
             * The following fields are required:
             * ```java
             * .cancelationToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ByCancelationToken]. */
        class Builder internal constructor() {

            private var cancelationToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(byCancelationToken: ByCancelationToken) = apply {
                cancelationToken = byCancelationToken.cancelationToken
                additionalProperties = byCancelationToken.additionalProperties.toMutableMap()
            }

            fun cancelationToken(cancelationToken: String) =
                cancelationToken(JsonField.of(cancelationToken))

            /**
             * Sets [Builder.cancelationToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelationToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelationToken(cancelationToken: JsonField<String>) = apply {
                this.cancelationToken = cancelationToken
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
             * Returns an immutable instance of [ByCancelationToken].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cancelationToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ByCancelationToken =
                ByCancelationToken(
                    checkRequired("cancelationToken", cancelationToken),
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
        fun validate(): ByCancelationToken = apply {
            if (validated) {
                return@apply
            }

            cancelationToken()
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
        internal fun validity(): Int = (if (cancelationToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ByCancelationToken &&
                cancelationToken == other.cancelationToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(cancelationToken, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ByCancelationToken{cancelationToken=$cancelationToken, additionalProperties=$additionalProperties}"
    }

    class ByRunId
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val runId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of()
        ) : this(runId, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runId(): String = runId.getRequired("run_id")

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

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
             * Returns a mutable builder for constructing an instance of [ByRunId].
             *
             * The following fields are required:
             * ```java
             * .runId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ByRunId]. */
        class Builder internal constructor() {

            private var runId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(byRunId: ByRunId) = apply {
                runId = byRunId.runId
                additionalProperties = byRunId.additionalProperties.toMutableMap()
            }

            fun runId(runId: String) = runId(JsonField.of(runId))

            /**
             * Sets [Builder.runId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runId(runId: JsonField<String>) = apply { this.runId = runId }

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
             * Returns an immutable instance of [ByRunId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .runId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ByRunId =
                ByRunId(checkRequired("runId", runId), additionalProperties.toMutableMap())
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
        fun validate(): ByRunId = apply {
            if (validated) {
                return@apply
            }

            runId()
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
        @JvmSynthetic internal fun validity(): Int = (if (runId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ByRunId &&
                runId == other.runId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(runId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ByRunId{runId=$runId, additionalProperties=$additionalProperties}"
    }
}
