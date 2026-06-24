// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Replace a preference section. Full document replacement; missing optional fields are cleared.
 * Topics attached to the section are unaffected.
 */
class PreferenceSectionReplaceParams
private constructor(
    private val sectionId: String?,
    private val preferenceSectionReplaceRequest: PreferenceSectionReplaceRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sectionId(): Optional<String> = Optional.ofNullable(sectionId)

    /**
     * Request body for replacing a preference section. Full document replacement; missing optional
     * fields are cleared.
     */
    fun preferenceSectionReplaceRequest(): PreferenceSectionReplaceRequest =
        preferenceSectionReplaceRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        preferenceSectionReplaceRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PreferenceSectionReplaceParams].
         *
         * The following fields are required:
         * ```java
         * .preferenceSectionReplaceRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceSectionReplaceParams]. */
    class Builder internal constructor() {

        private var sectionId: String? = null
        private var preferenceSectionReplaceRequest: PreferenceSectionReplaceRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(preferenceSectionReplaceParams: PreferenceSectionReplaceParams) = apply {
            sectionId = preferenceSectionReplaceParams.sectionId
            preferenceSectionReplaceRequest =
                preferenceSectionReplaceParams.preferenceSectionReplaceRequest
            additionalHeaders = preferenceSectionReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = preferenceSectionReplaceParams.additionalQueryParams.toBuilder()
        }

        fun sectionId(sectionId: String?) = apply { this.sectionId = sectionId }

        /** Alias for calling [Builder.sectionId] with `sectionId.orElse(null)`. */
        fun sectionId(sectionId: Optional<String>) = sectionId(sectionId.getOrNull())

        /**
         * Request body for replacing a preference section. Full document replacement; missing
         * optional fields are cleared.
         */
        fun preferenceSectionReplaceRequest(
            preferenceSectionReplaceRequest: PreferenceSectionReplaceRequest
        ) = apply { this.preferenceSectionReplaceRequest = preferenceSectionReplaceRequest }

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
         * Returns an immutable instance of [PreferenceSectionReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .preferenceSectionReplaceRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceSectionReplaceParams =
            PreferenceSectionReplaceParams(
                sectionId,
                checkRequired("preferenceSectionReplaceRequest", preferenceSectionReplaceRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PreferenceSectionReplaceRequest = preferenceSectionReplaceRequest

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

        return other is PreferenceSectionReplaceParams &&
            sectionId == other.sectionId &&
            preferenceSectionReplaceRequest == other.preferenceSectionReplaceRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sectionId,
            preferenceSectionReplaceRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PreferenceSectionReplaceParams{sectionId=$sectionId, preferenceSectionReplaceRequest=$preferenceSectionReplaceRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
