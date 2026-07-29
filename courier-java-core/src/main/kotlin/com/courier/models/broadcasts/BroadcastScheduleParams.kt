// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Schedule a broadcast for a future send to a list or audience. Publishes the broadcast template
 * first. Not allowed once the broadcast is sending or sent. For an immediate send use POST
 * /broadcasts/{broadcastId}/send.
 */
class BroadcastScheduleParams
private constructor(
    private val broadcastId: String?,
    private val scheduleBroadcastRequest: ScheduleBroadcastRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun broadcastId(): Optional<String> = Optional.ofNullable(broadcastId)

    /** Request body for scheduling a broadcast for a future send. */
    fun scheduleBroadcastRequest(): ScheduleBroadcastRequest = scheduleBroadcastRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        scheduleBroadcastRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BroadcastScheduleParams].
         *
         * The following fields are required:
         * ```java
         * .scheduleBroadcastRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BroadcastScheduleParams]. */
    class Builder internal constructor() {

        private var broadcastId: String? = null
        private var scheduleBroadcastRequest: ScheduleBroadcastRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(broadcastScheduleParams: BroadcastScheduleParams) = apply {
            broadcastId = broadcastScheduleParams.broadcastId
            scheduleBroadcastRequest = broadcastScheduleParams.scheduleBroadcastRequest
            additionalHeaders = broadcastScheduleParams.additionalHeaders.toBuilder()
            additionalQueryParams = broadcastScheduleParams.additionalQueryParams.toBuilder()
        }

        fun broadcastId(broadcastId: String?) = apply { this.broadcastId = broadcastId }

        /** Alias for calling [Builder.broadcastId] with `broadcastId.orElse(null)`. */
        fun broadcastId(broadcastId: Optional<String>) = broadcastId(broadcastId.getOrNull())

        /** Request body for scheduling a broadcast for a future send. */
        fun scheduleBroadcastRequest(scheduleBroadcastRequest: ScheduleBroadcastRequest) = apply {
            this.scheduleBroadcastRequest = scheduleBroadcastRequest
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
         * Returns an immutable instance of [BroadcastScheduleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scheduleBroadcastRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BroadcastScheduleParams =
            BroadcastScheduleParams(
                broadcastId,
                checkRequired("scheduleBroadcastRequest", scheduleBroadcastRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ScheduleBroadcastRequest = scheduleBroadcastRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> broadcastId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BroadcastScheduleParams &&
            broadcastId == other.broadcastId &&
            scheduleBroadcastRequest == other.scheduleBroadcastRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            broadcastId,
            scheduleBroadcastRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BroadcastScheduleParams{broadcastId=$broadcastId, scheduleBroadcastRequest=$scheduleBroadcastRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
