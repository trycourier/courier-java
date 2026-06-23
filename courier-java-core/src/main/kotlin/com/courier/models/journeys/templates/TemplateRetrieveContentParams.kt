// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve the elemental content of a journey-scoped notification template. The response contains
 * the versioned elements along with their content checksums, which can be used to detect changes
 * between versions. Pass `?version=draft` (default `published`) to retrieve the working draft, or
 * `?version=vN` for a historical version.
 */
class TemplateRetrieveContentParams
private constructor(
    private val templateId: String,
    private val notificationId: String?,
    private val version: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun templateId(): String = templateId

    fun notificationId(): Optional<String> = Optional.ofNullable(notificationId)

    /**
     * Accepts `draft`, `published`, or a version string (e.g., `v001`). Defaults to `published`.
     */
    fun version(): Optional<String> = Optional.ofNullable(version)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TemplateRetrieveContentParams].
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateRetrieveContentParams]. */
    class Builder internal constructor() {

        private var templateId: String? = null
        private var notificationId: String? = null
        private var version: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templateRetrieveContentParams: TemplateRetrieveContentParams) = apply {
            templateId = templateRetrieveContentParams.templateId
            notificationId = templateRetrieveContentParams.notificationId
            version = templateRetrieveContentParams.version
            additionalHeaders = templateRetrieveContentParams.additionalHeaders.toBuilder()
            additionalQueryParams = templateRetrieveContentParams.additionalQueryParams.toBuilder()
        }

        fun templateId(templateId: String) = apply { this.templateId = templateId }

        fun notificationId(notificationId: String?) = apply { this.notificationId = notificationId }

        /** Alias for calling [Builder.notificationId] with `notificationId.orElse(null)`. */
        fun notificationId(notificationId: Optional<String>) =
            notificationId(notificationId.getOrNull())

        /**
         * Accepts `draft`, `published`, or a version string (e.g., `v001`). Defaults to
         * `published`.
         */
        fun version(version: String?) = apply { this.version = version }

        /** Alias for calling [Builder.version] with `version.orElse(null)`. */
        fun version(version: Optional<String>) = version(version.getOrNull())

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
         * Returns an immutable instance of [TemplateRetrieveContentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplateRetrieveContentParams =
            TemplateRetrieveContentParams(
                checkRequired("templateId", templateId),
                notificationId,
                version,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> templateId
            1 -> notificationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                version?.let { put("version", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateRetrieveContentParams &&
            templateId == other.templateId &&
            notificationId == other.notificationId &&
            version == other.version &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(templateId, notificationId, version, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TemplateRetrieveContentParams{templateId=$templateId, notificationId=$notificationId, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
