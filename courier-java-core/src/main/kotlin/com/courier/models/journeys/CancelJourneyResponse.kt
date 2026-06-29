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
 * `202 Accepted` body for `POST /journeys/cancel`, echoing the submitted identifier. The token
 * branch returns `{ cancelation_token }`; the run_id branch returns `{ run_id, status }`.
 */
@JsonDeserialize(using = CancelJourneyResponse.Deserializer::class)
@JsonSerialize(using = CancelJourneyResponse.Serializer::class)
class CancelJourneyResponse
private constructor(
    private val tokenBranch: TokenBranch? = null,
    private val runIdBranch: RunIdBranch? = null,
    private val _json: JsonValue? = null,
) {

    fun tokenBranch(): Optional<TokenBranch> = Optional.ofNullable(tokenBranch)

    fun runIdBranch(): Optional<RunIdBranch> = Optional.ofNullable(runIdBranch)

    fun isTokenBranch(): Boolean = tokenBranch != null

    fun isRunIdBranch(): Boolean = runIdBranch != null

    fun asTokenBranch(): TokenBranch = tokenBranch.getOrThrow("tokenBranch")

    fun asRunIdBranch(): RunIdBranch = runIdBranch.getOrThrow("runIdBranch")

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
     * Optional<String> result = cancelJourneyResponse.accept(new CancelJourneyResponse.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitTokenBranch(TokenBranch tokenBranch) {
     *         return Optional.of(tokenBranch.toString());
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
            tokenBranch != null -> visitor.visitTokenBranch(tokenBranch)
            runIdBranch != null -> visitor.visitRunIdBranch(runIdBranch)
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
    fun validate(): CancelJourneyResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTokenBranch(tokenBranch: TokenBranch) {
                    tokenBranch.validate()
                }

                override fun visitRunIdBranch(runIdBranch: RunIdBranch) {
                    runIdBranch.validate()
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
                override fun visitTokenBranch(tokenBranch: TokenBranch) = tokenBranch.validity()

                override fun visitRunIdBranch(runIdBranch: RunIdBranch) = runIdBranch.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CancelJourneyResponse &&
            tokenBranch == other.tokenBranch &&
            runIdBranch == other.runIdBranch
    }

    override fun hashCode(): Int = Objects.hash(tokenBranch, runIdBranch)

    override fun toString(): String =
        when {
            tokenBranch != null -> "CancelJourneyResponse{tokenBranch=$tokenBranch}"
            runIdBranch != null -> "CancelJourneyResponse{runIdBranch=$runIdBranch}"
            _json != null -> "CancelJourneyResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CancelJourneyResponse")
        }

    companion object {

        @JvmStatic
        fun ofTokenBranch(tokenBranch: TokenBranch) =
            CancelJourneyResponse(tokenBranch = tokenBranch)

        @JvmStatic
        fun ofRunIdBranch(runIdBranch: RunIdBranch) =
            CancelJourneyResponse(runIdBranch = runIdBranch)
    }

    /**
     * An interface that defines how to map each variant of [CancelJourneyResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitTokenBranch(tokenBranch: TokenBranch): T

        fun visitRunIdBranch(runIdBranch: RunIdBranch): T

        /**
         * Maps an unknown variant of [CancelJourneyResponse] to a value of type [T].
         *
         * An instance of [CancelJourneyResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown CancelJourneyResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CancelJourneyResponse>(CancelJourneyResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CancelJourneyResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<TokenBranch>())?.let {
                            CancelJourneyResponse(tokenBranch = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RunIdBranch>())?.let {
                            CancelJourneyResponse(runIdBranch = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CancelJourneyResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CancelJourneyResponse>(CancelJourneyResponse::class) {

        override fun serialize(
            value: CancelJourneyResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.tokenBranch != null -> generator.writeObject(value.tokenBranch)
                value.runIdBranch != null -> generator.writeObject(value.runIdBranch)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CancelJourneyResponse")
            }
        }
    }

    class TokenBranch
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
             * Returns a mutable builder for constructing an instance of [TokenBranch].
             *
             * The following fields are required:
             * ```java
             * .cancelationToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenBranch]. */
        class Builder internal constructor() {

            private var cancelationToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenBranch: TokenBranch) = apply {
                cancelationToken = tokenBranch.cancelationToken
                additionalProperties = tokenBranch.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TokenBranch].
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
            fun build(): TokenBranch =
                TokenBranch(
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
        fun validate(): TokenBranch = apply {
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

            return other is TokenBranch &&
                cancelationToken == other.cancelationToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(cancelationToken, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenBranch{cancelationToken=$cancelationToken, additionalProperties=$additionalProperties}"
    }

    class RunIdBranch
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val runId: JsonField<String>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(runId, status, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runId(): String = runId.getRequired("run_id")

        /**
         * The run's resulting status. `CANCELED` when the run was active and we canceled it;
         * `PROCESSED` or `ERROR` when the run had already finished and was left untouched;
         * `CANCELED` for an already-canceled run.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
             * Returns a mutable builder for constructing an instance of [RunIdBranch].
             *
             * The following fields are required:
             * ```java
             * .runId()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RunIdBranch]. */
        class Builder internal constructor() {

            private var runId: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runIdBranch: RunIdBranch) = apply {
                runId = runIdBranch.runId
                status = runIdBranch.status
                additionalProperties = runIdBranch.additionalProperties.toMutableMap()
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

            /**
             * The run's resulting status. `CANCELED` when the run was active and we canceled it;
             * `PROCESSED` or `ERROR` when the run had already finished and was left untouched;
             * `CANCELED` for an already-canceled run.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
             * Returns an immutable instance of [RunIdBranch].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .runId()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RunIdBranch =
                RunIdBranch(
                    checkRequired("runId", runId),
                    checkRequired("status", status),
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
        fun validate(): RunIdBranch = apply {
            if (validated) {
                return@apply
            }

            runId()
            status()
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
            (if (runId.asKnown().isPresent) 1 else 0) + (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RunIdBranch &&
                runId == other.runId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(runId, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RunIdBranch{runId=$runId, status=$status, additionalProperties=$additionalProperties}"
    }
}
