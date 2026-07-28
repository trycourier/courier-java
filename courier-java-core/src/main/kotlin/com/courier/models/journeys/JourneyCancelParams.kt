// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Cancels in-flight journey runs, either every run sharing a cancelation token or one run by id.
 * Use it to stop a sequence when the event resolves.
 */
class JourneyCancelParams
private constructor(
    private val idempotencyKey: String?,
    private val xIdempotencyExpiration: String?,
    private val cancelJourneyRequest: CancelJourneyRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun xIdempotencyExpiration(): Optional<String> = Optional.ofNullable(xIdempotencyExpiration)

    /**
     * Request body for `POST /journeys/cancel`. Provide EXACTLY ONE of `cancelation_token` (cancels
     * every run associated with the token) or `run_id` (cancels a single tenant-scoped run).
     */
    fun cancelJourneyRequest(): CancelJourneyRequest = cancelJourneyRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JourneyCancelParams].
         *
         * The following fields are required:
         * ```java
         * .cancelJourneyRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyCancelParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var xIdempotencyExpiration: String? = null
        private var cancelJourneyRequest: CancelJourneyRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(journeyCancelParams: JourneyCancelParams) = apply {
            idempotencyKey = journeyCancelParams.idempotencyKey
            xIdempotencyExpiration = journeyCancelParams.xIdempotencyExpiration
            cancelJourneyRequest = journeyCancelParams.cancelJourneyRequest
            additionalHeaders = journeyCancelParams.additionalHeaders.toBuilder()
            additionalQueryParams = journeyCancelParams.additionalQueryParams.toBuilder()
        }

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
         * Request body for `POST /journeys/cancel`. Provide EXACTLY ONE of `cancelation_token`
         * (cancels every run associated with the token) or `run_id` (cancels a single tenant-scoped
         * run).
         */
        fun cancelJourneyRequest(cancelJourneyRequest: CancelJourneyRequest) = apply {
            this.cancelJourneyRequest = cancelJourneyRequest
        }

        /**
         * Alias for calling [cancelJourneyRequest] with
         * `CancelJourneyRequest.ofByCancelationToken(byCancelationToken)`.
         */
        fun cancelJourneyRequest(byCancelationToken: CancelJourneyRequest.ByCancelationToken) =
            cancelJourneyRequest(CancelJourneyRequest.ofByCancelationToken(byCancelationToken))

        /**
         * Alias for calling [cancelJourneyRequest] with `CancelJourneyRequest.ofByRunId(byRunId)`.
         */
        fun cancelJourneyRequest(byRunId: CancelJourneyRequest.ByRunId) =
            cancelJourneyRequest(CancelJourneyRequest.ofByRunId(byRunId))

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
         * Returns an immutable instance of [JourneyCancelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cancelJourneyRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyCancelParams =
            JourneyCancelParams(
                idempotencyKey,
                xIdempotencyExpiration,
                checkRequired("cancelJourneyRequest", cancelJourneyRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CancelJourneyRequest = cancelJourneyRequest

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

        return other is JourneyCancelParams &&
            idempotencyKey == other.idempotencyKey &&
            xIdempotencyExpiration == other.xIdempotencyExpiration &&
            cancelJourneyRequest == other.cancelJourneyRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            idempotencyKey,
            xIdempotencyExpiration,
            cancelJourneyRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "JourneyCancelParams{idempotencyKey=$idempotencyKey, xIdempotencyExpiration=$xIdempotencyExpiration, cancelJourneyRequest=$cancelJourneyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
