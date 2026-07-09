// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.core.immutableEmptyMap
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Publish the workspace's preferences page. Takes a snapshot of every workspace preference with its
 * topics under a new published version, making the current state visible on the hosted preferences
 * page (non-draft).
 */
class WorkspacePreferencePublishParams
private constructor(
    private val publishPreferencesRequest: PublishPreferencesRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Optional page metadata to apply when publishing the workspace's preferences page. All fields
     * are optional; omitted fields fall back to the page defaults (and the workspace default
     * brand).
     */
    fun publishPreferencesRequest(): Optional<PublishPreferencesRequest> =
        Optional.ofNullable(publishPreferencesRequest)

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publishPreferencesRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WorkspacePreferencePublishParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [WorkspacePreferencePublishParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspacePreferencePublishParams]. */
    class Builder internal constructor() {

        private var publishPreferencesRequest: PublishPreferencesRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workspacePreferencePublishParams: WorkspacePreferencePublishParams) =
            apply {
                publishPreferencesRequest =
                    workspacePreferencePublishParams.publishPreferencesRequest
                additionalHeaders = workspacePreferencePublishParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    workspacePreferencePublishParams.additionalQueryParams.toBuilder()
            }

        /**
         * Optional page metadata to apply when publishing the workspace's preferences page. All
         * fields are optional; omitted fields fall back to the page defaults (and the workspace
         * default brand).
         */
        fun publishPreferencesRequest(publishPreferencesRequest: PublishPreferencesRequest?) =
            apply {
                this.publishPreferencesRequest = publishPreferencesRequest
            }

        /**
         * Alias for calling [Builder.publishPreferencesRequest] with
         * `publishPreferencesRequest.orElse(null)`.
         */
        fun publishPreferencesRequest(
            publishPreferencesRequest: Optional<PublishPreferencesRequest>
        ) = publishPreferencesRequest(publishPreferencesRequest.getOrNull())

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
         * Returns an immutable instance of [WorkspacePreferencePublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WorkspacePreferencePublishParams =
            WorkspacePreferencePublishParams(
                publishPreferencesRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<PublishPreferencesRequest> =
        Optional.ofNullable(publishPreferencesRequest)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspacePreferencePublishParams &&
            publishPreferencesRequest == other.publishPreferencesRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(publishPreferencesRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WorkspacePreferencePublishParams{publishPreferencesRequest=$publishPreferencesRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
