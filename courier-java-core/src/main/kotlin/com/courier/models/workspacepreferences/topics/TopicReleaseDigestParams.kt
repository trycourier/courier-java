// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences.topics

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.models.workspacepreferences.TopicDigestReleaseRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Send one recipient's held digest now, instead of waiting for its schedule. Use it to preview what
 * a digest will look like, or to let someone flush their own.
 *
 * Keyed on the topic because that is how a held digest is stored: one per recipient per topic, with
 * the schedule recorded on it rather than part of its identity. To flush every recipient on a
 * schedule instead, use `POST /digests/schedules/{schedule_id}/trigger`.
 */
class TopicReleaseDigestParams
private constructor(
    private val sectionId: String,
    private val topicId: String?,
    private val topicDigestReleaseRequest: TopicDigestReleaseRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sectionId(): String = sectionId

    fun topicId(): Optional<String> = Optional.ofNullable(topicId)

    /** Which recipient's held digest to release. */
    fun topicDigestReleaseRequest(): TopicDigestReleaseRequest = topicDigestReleaseRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        topicDigestReleaseRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopicReleaseDigestParams].
         *
         * The following fields are required:
         * ```java
         * .sectionId()
         * .topicDigestReleaseRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicReleaseDigestParams]. */
    class Builder internal constructor() {

        private var sectionId: String? = null
        private var topicId: String? = null
        private var topicDigestReleaseRequest: TopicDigestReleaseRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(topicReleaseDigestParams: TopicReleaseDigestParams) = apply {
            sectionId = topicReleaseDigestParams.sectionId
            topicId = topicReleaseDigestParams.topicId
            topicDigestReleaseRequest = topicReleaseDigestParams.topicDigestReleaseRequest
            additionalHeaders = topicReleaseDigestParams.additionalHeaders.toBuilder()
            additionalQueryParams = topicReleaseDigestParams.additionalQueryParams.toBuilder()
        }

        fun sectionId(sectionId: String) = apply { this.sectionId = sectionId }

        fun topicId(topicId: String?) = apply { this.topicId = topicId }

        /** Alias for calling [Builder.topicId] with `topicId.orElse(null)`. */
        fun topicId(topicId: Optional<String>) = topicId(topicId.getOrNull())

        /** Which recipient's held digest to release. */
        fun topicDigestReleaseRequest(topicDigestReleaseRequest: TopicDigestReleaseRequest) =
            apply {
                this.topicDigestReleaseRequest = topicDigestReleaseRequest
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
         * Returns an immutable instance of [TopicReleaseDigestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sectionId()
         * .topicDigestReleaseRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopicReleaseDigestParams =
            TopicReleaseDigestParams(
                checkRequired("sectionId", sectionId),
                topicId,
                checkRequired("topicDigestReleaseRequest", topicDigestReleaseRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): TopicDigestReleaseRequest = topicDigestReleaseRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sectionId
            1 -> topicId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicReleaseDigestParams &&
            sectionId == other.sectionId &&
            topicId == other.topicId &&
            topicDigestReleaseRequest == other.topicDigestReleaseRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sectionId,
            topicId,
            topicDigestReleaseRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TopicReleaseDigestParams{sectionId=$sectionId, topicId=$topicId, topicDigestReleaseRequest=$topicDigestReleaseRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
