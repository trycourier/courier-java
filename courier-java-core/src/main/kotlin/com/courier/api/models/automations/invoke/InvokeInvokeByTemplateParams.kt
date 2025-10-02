// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations.invoke

import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.checkRequired
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Invoke an automation run from an automation template. */
class InvokeInvokeByTemplateParams
private constructor(
    private val templateId: String?,
    private val automationInvokeParams: AutomationInvokeParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun templateId(): Optional<String> = Optional.ofNullable(templateId)

    fun automationInvokeParams(): AutomationInvokeParams = automationInvokeParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        automationInvokeParams._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvokeInvokeByTemplateParams].
         *
         * The following fields are required:
         * ```java
         * .automationInvokeParams()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvokeInvokeByTemplateParams]. */
    class Builder internal constructor() {

        private var templateId: String? = null
        private var automationInvokeParams: AutomationInvokeParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invokeInvokeByTemplateParams: InvokeInvokeByTemplateParams) = apply {
            templateId = invokeInvokeByTemplateParams.templateId
            automationInvokeParams = invokeInvokeByTemplateParams.automationInvokeParams
            additionalHeaders = invokeInvokeByTemplateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invokeInvokeByTemplateParams.additionalQueryParams.toBuilder()
        }

        fun templateId(templateId: String?) = apply { this.templateId = templateId }

        /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
        fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

        fun automationInvokeParams(automationInvokeParams: AutomationInvokeParams) = apply {
            this.automationInvokeParams = automationInvokeParams
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
         * Returns an immutable instance of [InvokeInvokeByTemplateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .automationInvokeParams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvokeInvokeByTemplateParams =
            InvokeInvokeByTemplateParams(
                templateId,
                checkRequired("automationInvokeParams", automationInvokeParams),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AutomationInvokeParams = automationInvokeParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> templateId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvokeInvokeByTemplateParams &&
            templateId == other.templateId &&
            automationInvokeParams == other.automationInvokeParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(templateId, automationInvokeParams, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvokeInvokeByTemplateParams{templateId=$templateId, automationInvokeParams=$automationInvokeParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
