// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants.templates

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.models.tenants.PutTenantTemplateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates or updates a notification template scoped to one tenant, letting a tenant override the
 * content the workspace template would send.
 *
 * This is an upsert: it creates when the tenant has no template under `template_id`, and updates
 * when it does. On the create half, content must place its elements inside a channel block — `{
 * "type": "channel", "channel": "email", "elements": [...] }` — or the request returns `400`. The
 * template designer renders only the channel block matching the tab it draws, so content stored
 * without one cannot be opened. An empty `elements` array is accepted, as is the `{ title, body }`
 * shorthand, which has no elements to wrap. Updates are not checked, so tenant templates already
 * stored without a wrapper stay editable.
 */
class TemplateReplaceParams
private constructor(
    private val tenantId: String,
    private val templateId: String?,
    private val putTenantTemplateRequest: PutTenantTemplateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tenantId(): String = tenantId

    fun templateId(): Optional<String> = Optional.ofNullable(templateId)

    /** Request body for creating or updating a tenant notification template */
    fun putTenantTemplateRequest(): PutTenantTemplateRequest = putTenantTemplateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        putTenantTemplateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplateReplaceParams].
         *
         * The following fields are required:
         * ```java
         * .tenantId()
         * .putTenantTemplateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateReplaceParams]. */
    class Builder internal constructor() {

        private var tenantId: String? = null
        private var templateId: String? = null
        private var putTenantTemplateRequest: PutTenantTemplateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templateReplaceParams: TemplateReplaceParams) = apply {
            tenantId = templateReplaceParams.tenantId
            templateId = templateReplaceParams.templateId
            putTenantTemplateRequest = templateReplaceParams.putTenantTemplateRequest
            additionalHeaders = templateReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = templateReplaceParams.additionalQueryParams.toBuilder()
        }

        fun tenantId(tenantId: String) = apply { this.tenantId = tenantId }

        fun templateId(templateId: String?) = apply { this.templateId = templateId }

        /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
        fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

        /** Request body for creating or updating a tenant notification template */
        fun putTenantTemplateRequest(putTenantTemplateRequest: PutTenantTemplateRequest) = apply {
            this.putTenantTemplateRequest = putTenantTemplateRequest
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
         * Returns an immutable instance of [TemplateReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .tenantId()
         * .putTenantTemplateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplateReplaceParams =
            TemplateReplaceParams(
                checkRequired("tenantId", tenantId),
                templateId,
                checkRequired("putTenantTemplateRequest", putTenantTemplateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PutTenantTemplateRequest = putTenantTemplateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> tenantId
            1 -> templateId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateReplaceParams &&
            tenantId == other.tenantId &&
            templateId == other.templateId &&
            putTenantTemplateRequest == other.putTenantTemplateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            tenantId,
            templateId,
            putTenantTemplateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TemplateReplaceParams{tenantId=$tenantId, templateId=$templateId, putTenantTemplateRequest=$putTenantTemplateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
