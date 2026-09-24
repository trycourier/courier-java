// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.Params
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the history of preference changes in this environment, newest first. Each entry records
 * one change a user made to one subscription topic, and carries the value before it where there was
 * one. Supply user_id to read a single user's history instead of the whole environment.
 */
class WorkspacePreferenceListLogsParams
private constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val since: String?,
    private val tenantId: String?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A cursor from a previous response's paging.cursor. Continue only while paging.more is true;
     * the cursor is omitted on the last page.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** How many entries to return. Defaults to 25. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Return only changes at or after this time, as an ISO-8601 date or date-time. A date alone is
     * read as the start of that day in UTC.
     */
    fun since(): Optional<String> = Optional.ofNullable(since)

    /**
     * Narrow to the changes this user made in one tenant context. Only valid together with user_id.
     */
    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    /** Return only this user's changes. Omit it to read every change in the environment. */
    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WorkspacePreferenceListLogsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [WorkspacePreferenceListLogsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspacePreferenceListLogsParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var limit: Long? = null
        private var since: String? = null
        private var tenantId: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workspacePreferenceListLogsParams: WorkspacePreferenceListLogsParams) =
            apply {
                cursor = workspacePreferenceListLogsParams.cursor
                limit = workspacePreferenceListLogsParams.limit
                since = workspacePreferenceListLogsParams.since
                tenantId = workspacePreferenceListLogsParams.tenantId
                userId = workspacePreferenceListLogsParams.userId
                additionalHeaders = workspacePreferenceListLogsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    workspacePreferenceListLogsParams.additionalQueryParams.toBuilder()
            }

        /**
         * A cursor from a previous response's paging.cursor. Continue only while paging.more is
         * true; the cursor is omitted on the last page.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** How many entries to return. Defaults to 25. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Return only changes at or after this time, as an ISO-8601 date or date-time. A date alone
         * is read as the start of that day in UTC.
         */
        fun since(since: String?) = apply { this.since = since }

        /** Alias for calling [Builder.since] with `since.orElse(null)`. */
        fun since(since: Optional<String>) = since(since.getOrNull())

        /**
         * Narrow to the changes this user made in one tenant context. Only valid together with
         * user_id.
         */
        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /** Return only this user's changes. Omit it to read every change in the environment. */
        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

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
         * Returns an immutable instance of [WorkspacePreferenceListLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WorkspacePreferenceListLogsParams =
            WorkspacePreferenceListLogsParams(
                cursor,
                limit,
                since,
                tenantId,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                since?.let { put("since", it) }
                tenantId?.let { put("tenant_id", it) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspacePreferenceListLogsParams &&
            cursor == other.cursor &&
            limit == other.limit &&
            since == other.since &&
            tenantId == other.tenantId &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            limit,
            since,
            tenantId,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "WorkspacePreferenceListLogsParams{cursor=$cursor, limit=$limit, since=$since, tenantId=$tenantId, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
