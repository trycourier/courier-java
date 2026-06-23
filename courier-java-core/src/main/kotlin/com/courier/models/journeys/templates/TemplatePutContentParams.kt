// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.models.notifications.NotificationContentPutRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Replace the elemental content of a journey-scoped notification template. Overwrites all elements
 * in the template draft with the provided content.
 */
class TemplatePutContentParams
private constructor(
    private val templateId: String,
    private val notificationId: String?,
    private val notificationContentPutRequest: NotificationContentPutRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun templateId(): String = templateId

    fun notificationId(): Optional<String> = Optional.ofNullable(notificationId)

    /** Request body for replacing the elemental content of a notification template. */
    fun notificationContentPutRequest(): NotificationContentPutRequest =
        notificationContentPutRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        notificationContentPutRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplatePutContentParams].
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .notificationContentPutRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplatePutContentParams]. */
    class Builder internal constructor() {

        private var templateId: String? = null
        private var notificationId: String? = null
        private var notificationContentPutRequest: NotificationContentPutRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templatePutContentParams: TemplatePutContentParams) = apply {
            templateId = templatePutContentParams.templateId
            notificationId = templatePutContentParams.notificationId
            notificationContentPutRequest = templatePutContentParams.notificationContentPutRequest
            additionalHeaders = templatePutContentParams.additionalHeaders.toBuilder()
            additionalQueryParams = templatePutContentParams.additionalQueryParams.toBuilder()
        }

        fun templateId(templateId: String) = apply { this.templateId = templateId }

        fun notificationId(notificationId: String?) = apply { this.notificationId = notificationId }

        /** Alias for calling [Builder.notificationId] with `notificationId.orElse(null)`. */
        fun notificationId(notificationId: Optional<String>) =
            notificationId(notificationId.getOrNull())

        /** Request body for replacing the elemental content of a notification template. */
        fun notificationContentPutRequest(
            notificationContentPutRequest: NotificationContentPutRequest
        ) = apply { this.notificationContentPutRequest = notificationContentPutRequest }

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
         * Returns an immutable instance of [TemplatePutContentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .notificationContentPutRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplatePutContentParams =
            TemplatePutContentParams(
                checkRequired("templateId", templateId),
                notificationId,
                checkRequired("notificationContentPutRequest", notificationContentPutRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): NotificationContentPutRequest = notificationContentPutRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> templateId
            1 -> notificationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplatePutContentParams &&
            templateId == other.templateId &&
            notificationId == other.notificationId &&
            notificationContentPutRequest == other.notificationContentPutRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            templateId,
            notificationId,
            notificationContentPutRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TemplatePutContentParams{templateId=$templateId, notificationId=$notificationId, notificationContentPutRequest=$notificationContentPutRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
