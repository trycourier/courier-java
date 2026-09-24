// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Render this template's email content on each of the requested devices.
 *
 * Returns as soon as the run exists and its render is queued — the screenshots are produced
 * asynchronously. Poll `GET /notifications/{id}/previews/runs/{previewRunId}` until every result
 * reaches a terminal status.
 *
 * Name the devices either with `device_set_id`, for a saved set, or with `device_ids`, for a
 * one-off list. Exactly one of the two is required. Inline `device_ids` must be ids listed by `GET
 * /previews/devices`; any other id is a 422, refused before the run exists or is billed.
 *
 * A template that does not exist is a 404. One that exists but cannot be previewed — not a Design
 * Studio template, no email channel, or no such `template_version` — is a 422, also refused before
 * the run exists or is billed.
 *
 * Preview runs are a metered add-on. A workspace without it, or with its billing suspended,
 * receives a 402.
 */
class RunCreateParams
private constructor(
    private val id: String?,
    private val idempotencyKey: String?,
    private val xIdempotencyExpiration: String?,
    private val createPreviewRunRequest: CreatePreviewRunRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun xIdempotencyExpiration(): Optional<String> = Optional.ofNullable(xIdempotencyExpiration)

    /**
     * Request body for creating a preview run of the template in the path. Provide exactly one of
     * `device_set_id` or `device_ids`. The template is the path's `{id}`; a `template_id` here is
     * an unknown key and a 400.
     */
    fun createPreviewRunRequest(): CreatePreviewRunRequest = createPreviewRunRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        createPreviewRunRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunCreateParams].
         *
         * The following fields are required:
         * ```java
         * .createPreviewRunRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var idempotencyKey: String? = null
        private var xIdempotencyExpiration: String? = null
        private var createPreviewRunRequest: CreatePreviewRunRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runCreateParams: RunCreateParams) = apply {
            id = runCreateParams.id
            idempotencyKey = runCreateParams.idempotencyKey
            xIdempotencyExpiration = runCreateParams.xIdempotencyExpiration
            createPreviewRunRequest = runCreateParams.createPreviewRunRequest
            additionalHeaders = runCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = runCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

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
         * Request body for creating a preview run of the template in the path. Provide exactly one
         * of `device_set_id` or `device_ids`. The template is the path's `{id}`; a `template_id`
         * here is an unknown key and a 400.
         */
        fun createPreviewRunRequest(createPreviewRunRequest: CreatePreviewRunRequest) = apply {
            this.createPreviewRunRequest = createPreviewRunRequest
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
         * Returns an immutable instance of [RunCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createPreviewRunRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunCreateParams =
            RunCreateParams(
                id,
                idempotencyKey,
                xIdempotencyExpiration,
                checkRequired("createPreviewRunRequest", createPreviewRunRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreatePreviewRunRequest = createPreviewRunRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
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

        return other is RunCreateParams &&
            id == other.id &&
            idempotencyKey == other.idempotencyKey &&
            xIdempotencyExpiration == other.xIdempotencyExpiration &&
            createPreviewRunRequest == other.createPreviewRunRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            idempotencyKey,
            xIdempotencyExpiration,
            createPreviewRunRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunCreateParams{id=$id, idempotencyKey=$idempotencyKey, xIdempotencyExpiration=$xIdempotencyExpiration, createPreviewRunRequest=$createPreviewRunRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
