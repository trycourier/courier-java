// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects

/**
 * Cancel journey runs. The request body must include EXACTLY ONE of `cancelation_token` (cancels
 * every run associated with the token) or `run_id` (cancels a single tenant-scoped run). Supplying
 * both or neither is a `400`. A `run_id` that does not match a run for the tenant returns `404`.
 * Cancelation is idempotent: a run that has already finished (`PROCESSED`/`ERROR`) or was already
 * `CANCELED` is left unchanged and its current status is returned.
 */
class JourneyCancelParams
private constructor(
    private val cancelJourneyRequest: CancelJourneyRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

        private var cancelJourneyRequest: CancelJourneyRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(journeyCancelParams: JourneyCancelParams) = apply {
            cancelJourneyRequest = journeyCancelParams.cancelJourneyRequest
            additionalHeaders = journeyCancelParams.additionalHeaders.toBuilder()
            additionalQueryParams = journeyCancelParams.additionalQueryParams.toBuilder()
        }

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
                checkRequired("cancelJourneyRequest", cancelJourneyRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CancelJourneyRequest = cancelJourneyRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyCancelParams &&
            cancelJourneyRequest == other.cancelJourneyRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cancelJourneyRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "JourneyCancelParams{cancelJourneyRequest=$cancelJourneyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
