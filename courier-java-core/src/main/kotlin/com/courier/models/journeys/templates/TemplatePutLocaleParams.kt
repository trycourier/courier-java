// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.models.notifications.NotificationLocalePutRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set locale-specific content overrides for a journey-scoped notification template. Each element
 * override must reference an existing element by ID.
 */
class TemplatePutLocaleParams
private constructor(
    private val templateId: String,
    private val notificationId: String,
    private val localeId: String?,
    private val notificationLocalePutRequest: NotificationLocalePutRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun templateId(): String = templateId

    fun notificationId(): String = notificationId

    fun localeId(): Optional<String> = Optional.ofNullable(localeId)

    /**
     * Request body for setting locale-specific content overrides. Each element override must
     * include the target element ID.
     */
    fun notificationLocalePutRequest(): NotificationLocalePutRequest = notificationLocalePutRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        notificationLocalePutRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplatePutLocaleParams].
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .notificationId()
         * .notificationLocalePutRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplatePutLocaleParams]. */
    class Builder internal constructor() {

        private var templateId: String? = null
        private var notificationId: String? = null
        private var localeId: String? = null
        private var notificationLocalePutRequest: NotificationLocalePutRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templatePutLocaleParams: TemplatePutLocaleParams) = apply {
            templateId = templatePutLocaleParams.templateId
            notificationId = templatePutLocaleParams.notificationId
            localeId = templatePutLocaleParams.localeId
            notificationLocalePutRequest = templatePutLocaleParams.notificationLocalePutRequest
            additionalHeaders = templatePutLocaleParams.additionalHeaders.toBuilder()
            additionalQueryParams = templatePutLocaleParams.additionalQueryParams.toBuilder()
        }

        fun templateId(templateId: String) = apply { this.templateId = templateId }

        fun notificationId(notificationId: String) = apply { this.notificationId = notificationId }

        fun localeId(localeId: String?) = apply { this.localeId = localeId }

        /** Alias for calling [Builder.localeId] with `localeId.orElse(null)`. */
        fun localeId(localeId: Optional<String>) = localeId(localeId.getOrNull())

        /**
         * Request body for setting locale-specific content overrides. Each element override must
         * include the target element ID.
         */
        fun notificationLocalePutRequest(
            notificationLocalePutRequest: NotificationLocalePutRequest
        ) = apply { this.notificationLocalePutRequest = notificationLocalePutRequest }

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
         * Returns an immutable instance of [TemplatePutLocaleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .notificationId()
         * .notificationLocalePutRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplatePutLocaleParams =
            TemplatePutLocaleParams(
                checkRequired("templateId", templateId),
                checkRequired("notificationId", notificationId),
                localeId,
                checkRequired("notificationLocalePutRequest", notificationLocalePutRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): NotificationLocalePutRequest = notificationLocalePutRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> templateId
            1 -> notificationId
            2 -> localeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplatePutLocaleParams &&
            templateId == other.templateId &&
            notificationId == other.notificationId &&
            localeId == other.localeId &&
            notificationLocalePutRequest == other.notificationLocalePutRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            templateId,
            notificationId,
            localeId,
            notificationLocalePutRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TemplatePutLocaleParams{templateId=$templateId, notificationId=$notificationId, localeId=$localeId, notificationLocalePutRequest=$notificationLocalePutRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
