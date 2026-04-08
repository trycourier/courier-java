// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a single element within a notification template. Only supported for V2 (elemental)
 * templates.
 */
class NotificationPutElementParams
private constructor(
    private val id: String,
    private val elementId: String?,
    private val notificationElementPutRequest: NotificationElementPutRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun elementId(): Optional<String> = Optional.ofNullable(elementId)

    /** Request body for updating a single element. Additional type-specific fields are allowed. */
    fun notificationElementPutRequest(): NotificationElementPutRequest =
        notificationElementPutRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        notificationElementPutRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationPutElementParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .notificationElementPutRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationPutElementParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var elementId: String? = null
        private var notificationElementPutRequest: NotificationElementPutRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(notificationPutElementParams: NotificationPutElementParams) = apply {
            id = notificationPutElementParams.id
            elementId = notificationPutElementParams.elementId
            notificationElementPutRequest =
                notificationPutElementParams.notificationElementPutRequest
            additionalHeaders = notificationPutElementParams.additionalHeaders.toBuilder()
            additionalQueryParams = notificationPutElementParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun elementId(elementId: String?) = apply { this.elementId = elementId }

        /** Alias for calling [Builder.elementId] with `elementId.orElse(null)`. */
        fun elementId(elementId: Optional<String>) = elementId(elementId.getOrNull())

        /**
         * Request body for updating a single element. Additional type-specific fields are allowed.
         */
        fun notificationElementPutRequest(
            notificationElementPutRequest: NotificationElementPutRequest
        ) = apply { this.notificationElementPutRequest = notificationElementPutRequest }

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
         * Returns an immutable instance of [NotificationPutElementParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .notificationElementPutRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationPutElementParams =
            NotificationPutElementParams(
                checkRequired("id", id),
                elementId,
                checkRequired("notificationElementPutRequest", notificationElementPutRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): NotificationElementPutRequest = notificationElementPutRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> elementId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationPutElementParams &&
            id == other.id &&
            elementId == other.elementId &&
            notificationElementPutRequest == other.notificationElementPutRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            elementId,
            notificationElementPutRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NotificationPutElementParams{id=$id, elementId=$elementId, notificationElementPutRequest=$notificationElementPutRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
