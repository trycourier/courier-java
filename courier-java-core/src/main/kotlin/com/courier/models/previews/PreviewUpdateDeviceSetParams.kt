// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Replace a device set. This is a full replace, not a patch — both the name and the device list are
 * always written. The Courier-provided default set cannot be changed and returns 409.
 */
class PreviewUpdateDeviceSetParams
private constructor(
    private val deviceSetId: String?,
    private val createDeviceSetRequest: CreateDeviceSetRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun deviceSetId(): Optional<String> = Optional.ofNullable(deviceSetId)

    /**
     * Request body for creating or replacing a device set. A full replace, not a patch — both
     * fields are always written.
     */
    fun createDeviceSetRequest(): CreateDeviceSetRequest = createDeviceSetRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        createDeviceSetRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PreviewUpdateDeviceSetParams].
         *
         * The following fields are required:
         * ```java
         * .createDeviceSetRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreviewUpdateDeviceSetParams]. */
    class Builder internal constructor() {

        private var deviceSetId: String? = null
        private var createDeviceSetRequest: CreateDeviceSetRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(previewUpdateDeviceSetParams: PreviewUpdateDeviceSetParams) = apply {
            deviceSetId = previewUpdateDeviceSetParams.deviceSetId
            createDeviceSetRequest = previewUpdateDeviceSetParams.createDeviceSetRequest
            additionalHeaders = previewUpdateDeviceSetParams.additionalHeaders.toBuilder()
            additionalQueryParams = previewUpdateDeviceSetParams.additionalQueryParams.toBuilder()
        }

        fun deviceSetId(deviceSetId: String?) = apply { this.deviceSetId = deviceSetId }

        /** Alias for calling [Builder.deviceSetId] with `deviceSetId.orElse(null)`. */
        fun deviceSetId(deviceSetId: Optional<String>) = deviceSetId(deviceSetId.getOrNull())

        /**
         * Request body for creating or replacing a device set. A full replace, not a patch — both
         * fields are always written.
         */
        fun createDeviceSetRequest(createDeviceSetRequest: CreateDeviceSetRequest) = apply {
            this.createDeviceSetRequest = createDeviceSetRequest
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
         * Returns an immutable instance of [PreviewUpdateDeviceSetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createDeviceSetRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreviewUpdateDeviceSetParams =
            PreviewUpdateDeviceSetParams(
                deviceSetId,
                checkRequired("createDeviceSetRequest", createDeviceSetRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateDeviceSetRequest = createDeviceSetRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> deviceSetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreviewUpdateDeviceSetParams &&
            deviceSetId == other.deviceSetId &&
            createDeviceSetRequest == other.createDeviceSetRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(deviceSetId, createDeviceSetRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PreviewUpdateDeviceSetParams{deviceSetId=$deviceSetId, createDeviceSetRequest=$createDeviceSetRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
