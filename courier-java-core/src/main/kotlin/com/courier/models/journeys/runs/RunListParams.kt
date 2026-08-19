// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.runs

import com.courier.core.Params
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List runs of the workspace's Journeys, newest first, filtered by status, Journey, or date range
 * and paged by cursor. Runs of v2 Automations are listed by `GET /automations/runs` instead — the
 * two surfaces never return each other's runs. Runs are retained for 95 days.
 */
class RunListParams
private constructor(
    private val cursor: String?,
    private val endDate: String?,
    private val limit: String?,
    private val startDate: String?,
    private val status: String?,
    private val templateId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A cursor token for pagination. Use the `next_cursor` from the previous response to fetch the
     * next page of results. Treat it as opaque.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** An inclusive upper bound on `created_at`, in the same format as `start_date`. */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /**
     * The number of runs to return per page, between `1` and `50`. Defaults to `20`. Values outside
     * the range are clamped, and a non-numeric value falls back to `20`.
     */
    fun limit(): Optional<String> = Optional.ofNullable(limit)

    /**
     * An inclusive lower bound on `created_at`, as an ISO 8601 date or timestamp (e.g. `2026-08-18`
     * or `2026-08-18T20:06:36.259Z`). Any other format returns `400`.
     */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** A comma-separated list of run statuses to filter on, e.g. `PROCESSED,ERROR`. */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** A comma-separated list of Journey ids to filter on. */
    fun templateId(): Optional<String> = Optional.ofNullable(templateId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var endDate: String? = null
        private var limit: String? = null
        private var startDate: String? = null
        private var status: String? = null
        private var templateId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runListParams: RunListParams) = apply {
            cursor = runListParams.cursor
            endDate = runListParams.endDate
            limit = runListParams.limit
            startDate = runListParams.startDate
            status = runListParams.status
            templateId = runListParams.templateId
            additionalHeaders = runListParams.additionalHeaders.toBuilder()
            additionalQueryParams = runListParams.additionalQueryParams.toBuilder()
        }

        /**
         * A cursor token for pagination. Use the `next_cursor` from the previous response to fetch
         * the next page of results. Treat it as opaque.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** An inclusive upper bound on `created_at`, in the same format as `start_date`. */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /**
         * The number of runs to return per page, between `1` and `50`. Defaults to `20`. Values
         * outside the range are clamped, and a non-numeric value falls back to `20`.
         */
        fun limit(limit: String?) = apply { this.limit = limit }

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<String>) = limit(limit.getOrNull())

        /**
         * An inclusive lower bound on `created_at`, as an ISO 8601 date or timestamp (e.g.
         * `2026-08-18` or `2026-08-18T20:06:36.259Z`). Any other format returns `400`.
         */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** A comma-separated list of run statuses to filter on, e.g. `PROCESSED,ERROR`. */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /** A comma-separated list of Journey ids to filter on. */
        fun templateId(templateId: String?) = apply { this.templateId = templateId }

        /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
        fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

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
         * Returns an immutable instance of [RunListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunListParams =
            RunListParams(
                cursor,
                endDate,
                limit,
                startDate,
                status,
                templateId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                endDate?.let { put("end_date", it) }
                limit?.let { put("limit", it) }
                startDate?.let { put("start_date", it) }
                status?.let { put("status", it) }
                templateId?.let { put("template_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunListParams &&
            cursor == other.cursor &&
            endDate == other.endDate &&
            limit == other.limit &&
            startDate == other.startDate &&
            status == other.status &&
            templateId == other.templateId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            endDate,
            limit,
            startDate,
            status,
            templateId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunListParams{cursor=$cursor, endDate=$endDate, limit=$limit, startDate=$startDate, status=$status, templateId=$templateId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
