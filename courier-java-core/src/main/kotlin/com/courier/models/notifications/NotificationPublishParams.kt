// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.core.immutableEmptyMap
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Publish a notification template. Publishes the current draft by default. Pass a version in the
 * request body to publish a specific historical version.
 */
class NotificationPublishParams
private constructor(
    private val id: String?,
    private val idempotencyKey: String?,
    private val xIdempotencyExpiration: String?,
    private val notificationTemplatePublishRequest: NotificationTemplatePublishRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun xIdempotencyExpiration(): Optional<String> = Optional.ofNullable(xIdempotencyExpiration)

    /**
     * Optional request body for publishing a notification template. Omit or send an empty object to
     * publish the current draft.
     */
    fun notificationTemplatePublishRequest(): Optional<NotificationTemplatePublishRequest> =
        Optional.ofNullable(notificationTemplatePublishRequest)

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        notificationTemplatePublishRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NotificationPublishParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [NotificationPublishParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationPublishParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var idempotencyKey: String? = null
        private var xIdempotencyExpiration: String? = null
        private var notificationTemplatePublishRequest: NotificationTemplatePublishRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(notificationPublishParams: NotificationPublishParams) = apply {
            id = notificationPublishParams.id
            idempotencyKey = notificationPublishParams.idempotencyKey
            xIdempotencyExpiration = notificationPublishParams.xIdempotencyExpiration
            notificationTemplatePublishRequest =
                notificationPublishParams.notificationTemplatePublishRequest
            additionalHeaders = notificationPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams = notificationPublishParams.additionalQueryParams.toBuilder()
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
         * Optional request body for publishing a notification template. Omit or send an empty
         * object to publish the current draft.
         */
        fun notificationTemplatePublishRequest(
            notificationTemplatePublishRequest: NotificationTemplatePublishRequest?
        ) = apply { this.notificationTemplatePublishRequest = notificationTemplatePublishRequest }

        /**
         * Alias for calling [Builder.notificationTemplatePublishRequest] with
         * `notificationTemplatePublishRequest.orElse(null)`.
         */
        fun notificationTemplatePublishRequest(
            notificationTemplatePublishRequest: Optional<NotificationTemplatePublishRequest>
        ) = notificationTemplatePublishRequest(notificationTemplatePublishRequest.getOrNull())

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
         * Returns an immutable instance of [NotificationPublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationPublishParams =
            NotificationPublishParams(
                id,
                idempotencyKey,
                xIdempotencyExpiration,
                notificationTemplatePublishRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<NotificationTemplatePublishRequest> =
        Optional.ofNullable(notificationTemplatePublishRequest)

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

        return other is NotificationPublishParams &&
            id == other.id &&
            idempotencyKey == other.idempotencyKey &&
            xIdempotencyExpiration == other.xIdempotencyExpiration &&
            notificationTemplatePublishRequest == other.notificationTemplatePublishRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            idempotencyKey,
            xIdempotencyExpiration,
            notificationTemplatePublishRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NotificationPublishParams{id=$id, idempotencyKey=$idempotencyKey, xIdempotencyExpiration=$xIdempotencyExpiration, notificationTemplatePublishRequest=$notificationTemplatePublishRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
