// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.models.journeys.JourneyTemplateCreateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a notification template scoped to this journey. Defaults to `DRAFT` state; pass `state:
 * "PUBLISHED"` to publish on create.
 *
 * The content tree must contain exactly one channel block whose `channel` matches the `channel` on
 * the request — a journey-scoped template carries a single channel. Top-level elements, or a block
 * for a different channel, return `400`. The template designer renders only the channel block
 * matching the tab it draws, so content stored without one cannot be opened. An empty `elements`
 * array is accepted.
 */
class TemplateCreateParams
private constructor(
    private val templateId: String?,
    private val idempotencyKey: String?,
    private val xIdempotencyExpiration: String?,
    private val journeyTemplateCreateRequest: JourneyTemplateCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun templateId(): Optional<String> = Optional.ofNullable(templateId)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun xIdempotencyExpiration(): Optional<String> = Optional.ofNullable(xIdempotencyExpiration)

    /** Request body for creating a notification template scoped to a journey. */
    fun journeyTemplateCreateRequest(): JourneyTemplateCreateRequest = journeyTemplateCreateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        journeyTemplateCreateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplateCreateParams].
         *
         * The following fields are required:
         * ```java
         * .journeyTemplateCreateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateCreateParams]. */
    class Builder internal constructor() {

        private var templateId: String? = null
        private var idempotencyKey: String? = null
        private var xIdempotencyExpiration: String? = null
        private var journeyTemplateCreateRequest: JourneyTemplateCreateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templateCreateParams: TemplateCreateParams) = apply {
            templateId = templateCreateParams.templateId
            idempotencyKey = templateCreateParams.idempotencyKey
            xIdempotencyExpiration = templateCreateParams.xIdempotencyExpiration
            journeyTemplateCreateRequest = templateCreateParams.journeyTemplateCreateRequest
            additionalHeaders = templateCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = templateCreateParams.additionalQueryParams.toBuilder()
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

        /** Request body for creating a notification template scoped to a journey. */
        fun journeyTemplateCreateRequest(
            journeyTemplateCreateRequest: JourneyTemplateCreateRequest
        ) = apply { this.journeyTemplateCreateRequest = journeyTemplateCreateRequest }

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
         * Returns an immutable instance of [TemplateCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .journeyTemplateCreateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplateCreateParams =
            TemplateCreateParams(
                templateId,
                idempotencyKey,
                xIdempotencyExpiration,
                checkRequired("journeyTemplateCreateRequest", journeyTemplateCreateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): JourneyTemplateCreateRequest = journeyTemplateCreateRequest

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

        return other is TemplateCreateParams &&
            templateId == other.templateId &&
            idempotencyKey == other.idempotencyKey &&
            xIdempotencyExpiration == other.xIdempotencyExpiration &&
            journeyTemplateCreateRequest == other.journeyTemplateCreateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            templateId,
            idempotencyKey,
            xIdempotencyExpiration,
            journeyTemplateCreateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TemplateCreateParams{templateId=$templateId, idempotencyKey=$idempotencyKey, xIdempotencyExpiration=$xIdempotencyExpiration, journeyTemplateCreateRequest=$journeyTemplateCreateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
