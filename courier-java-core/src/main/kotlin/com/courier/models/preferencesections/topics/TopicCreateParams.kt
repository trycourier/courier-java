// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections.topics

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.models.preferencesections.PreferenceTopicCreateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a subscription preference topic inside a section. Fails with 404 if the section does not
 * exist. The topic id is generated and returned.
 */
class TopicCreateParams
private constructor(
    private val sectionId: String?,
    private val preferenceTopicCreateRequest: PreferenceTopicCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sectionId(): Optional<String> = Optional.ofNullable(sectionId)

    /** Request body for creating a preference topic. */
    fun preferenceTopicCreateRequest(): PreferenceTopicCreateRequest = preferenceTopicCreateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        preferenceTopicCreateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopicCreateParams].
         *
         * The following fields are required:
         * ```java
         * .preferenceTopicCreateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicCreateParams]. */
    class Builder internal constructor() {

        private var sectionId: String? = null
        private var preferenceTopicCreateRequest: PreferenceTopicCreateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(topicCreateParams: TopicCreateParams) = apply {
            sectionId = topicCreateParams.sectionId
            preferenceTopicCreateRequest = topicCreateParams.preferenceTopicCreateRequest
            additionalHeaders = topicCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = topicCreateParams.additionalQueryParams.toBuilder()
        }

        fun sectionId(sectionId: String?) = apply { this.sectionId = sectionId }

        /** Alias for calling [Builder.sectionId] with `sectionId.orElse(null)`. */
        fun sectionId(sectionId: Optional<String>) = sectionId(sectionId.getOrNull())

        /** Request body for creating a preference topic. */
        fun preferenceTopicCreateRequest(
            preferenceTopicCreateRequest: PreferenceTopicCreateRequest
        ) = apply { this.preferenceTopicCreateRequest = preferenceTopicCreateRequest }

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
         * Returns an immutable instance of [TopicCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .preferenceTopicCreateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopicCreateParams =
            TopicCreateParams(
                sectionId,
                checkRequired("preferenceTopicCreateRequest", preferenceTopicCreateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PreferenceTopicCreateRequest = preferenceTopicCreateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sectionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicCreateParams &&
            sectionId == other.sectionId &&
            preferenceTopicCreateRequest == other.preferenceTopicCreateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sectionId,
            preferenceTopicCreateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TopicCreateParams{sectionId=$sectionId, preferenceTopicCreateRequest=$preferenceTopicCreateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
