// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Starts a journey run for one user and returns a runId. Runs execute asynchronously, so the
 * response arrives before any message is sent.
 */
class JourneyInvokeParams
private constructor(
    private val templateId: String?,
    private val idempotencyKey: String?,
    private val xIdempotencyExpiration: String?,
    private val journeysInvokeRequest: JourneysInvokeRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun templateId(): Optional<String> = Optional.ofNullable(templateId)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun xIdempotencyExpiration(): Optional<String> = Optional.ofNullable(xIdempotencyExpiration)

    /**
     * Request body for invoking a journey. Requires either a user identifier or a profile with
     * contact information. User identifiers can be provided via user_id field, or resolved from
     * profile/data objects (user_id, userId, or anonymousId fields).
     */
    fun journeysInvokeRequest(): JourneysInvokeRequest = journeysInvokeRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        journeysInvokeRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JourneyInvokeParams].
         *
         * The following fields are required:
         * ```java
         * .journeysInvokeRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyInvokeParams]. */
    class Builder internal constructor() {

        private var templateId: String? = null
        private var idempotencyKey: String? = null
        private var xIdempotencyExpiration: String? = null
        private var journeysInvokeRequest: JourneysInvokeRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(journeyInvokeParams: JourneyInvokeParams) = apply {
            templateId = journeyInvokeParams.templateId
            idempotencyKey = journeyInvokeParams.idempotencyKey
            xIdempotencyExpiration = journeyInvokeParams.xIdempotencyExpiration
            journeysInvokeRequest = journeyInvokeParams.journeysInvokeRequest
            additionalHeaders = journeyInvokeParams.additionalHeaders.toBuilder()
            additionalQueryParams = journeyInvokeParams.additionalQueryParams.toBuilder()
        }

        fun templateId(templateId: String?) = apply { this.templateId = templateId }

        /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
        fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        fun xIdempotencyExpiration(xIdempotencyExpiration: String?) = apply {
            this.xIdempotencyExpiration = xIdempotencyExpiration
        }

        /**
         * Alias for calling [Builder.xIdempotencyExpiration] with
         * `xIdempotencyExpiration.orElse(null)`.
         */
        fun xIdempotencyExpiration(xIdempotencyExpiration: Optional<String>) =
            xIdempotencyExpiration(xIdempotencyExpiration.getOrNull())

        /**
         * Request body for invoking a journey. Requires either a user identifier or a profile with
         * contact information. User identifiers can be provided via user_id field, or resolved from
         * profile/data objects (user_id, userId, or anonymousId fields).
         */
        fun journeysInvokeRequest(journeysInvokeRequest: JourneysInvokeRequest) = apply {
            this.journeysInvokeRequest = journeysInvokeRequest
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [JourneyInvokeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .journeysInvokeRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyInvokeParams =
            JourneyInvokeParams(
                templateId,
                idempotencyKey,
                xIdempotencyExpiration,
                checkRequired("journeysInvokeRequest", journeysInvokeRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): JourneysInvokeRequest = journeysInvokeRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> templateId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                xIdempotencyExpiration?.let { put("x-idempotency-expiration", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyInvokeParams &&
            templateId == other.templateId &&
            idempotencyKey == other.idempotencyKey &&
            xIdempotencyExpiration == other.xIdempotencyExpiration &&
            journeysInvokeRequest == other.journeysInvokeRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            templateId,
            idempotencyKey,
            xIdempotencyExpiration,
            journeysInvokeRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "JourneyInvokeParams{templateId=$templateId, idempotencyKey=$idempotencyKey, xIdempotencyExpiration=$xIdempotencyExpiration, journeysInvokeRequest=$journeysInvokeRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
