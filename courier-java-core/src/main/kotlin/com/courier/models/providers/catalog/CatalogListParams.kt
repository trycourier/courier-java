// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers.catalog

import com.courier.core.Params
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the catalog of available provider types with their display names, descriptions, and
 * configuration schema fields (snake_case, with `type` and `required`). Providers with no
 * configurable schema return only `provider`, `name`, and `description`.
 */
class CatalogListParams
private constructor(
    private val channel: String?,
    private val keys: String?,
    private val name: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Exact match (case-insensitive) against the provider channel taxonomy (e.g. `email`, `sms`,
     * `push`).
     */
    fun channel(): Optional<String> = Optional.ofNullable(channel)

    /** Comma-separated provider keys to filter by (e.g. `sendgrid,twilio`). */
    fun keys(): Optional<String> = Optional.ofNullable(keys)

    /** Case-insensitive substring match against the provider display name. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CatalogListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CatalogListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CatalogListParams]. */
    class Builder internal constructor() {

        private var channel: String? = null
        private var keys: String? = null
        private var name: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(catalogListParams: CatalogListParams) = apply {
            channel = catalogListParams.channel
            keys = catalogListParams.keys
            name = catalogListParams.name
            additionalHeaders = catalogListParams.additionalHeaders.toBuilder()
            additionalQueryParams = catalogListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Exact match (case-insensitive) against the provider channel taxonomy (e.g. `email`,
         * `sms`, `push`).
         */
        fun channel(channel: String?) = apply { this.channel = channel }

        /** Alias for calling [Builder.channel] with `channel.orElse(null)`. */
        fun channel(channel: Optional<String>) = channel(channel.getOrNull())

        /** Comma-separated provider keys to filter by (e.g. `sendgrid,twilio`). */
        fun keys(keys: String?) = apply { this.keys = keys }

        /** Alias for calling [Builder.keys] with `keys.orElse(null)`. */
        fun keys(keys: Optional<String>) = keys(keys.getOrNull())

        /** Case-insensitive substring match against the provider display name. */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

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
         * Returns an immutable instance of [CatalogListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CatalogListParams =
            CatalogListParams(
                channel,
                keys,
                name,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                channel?.let { put("channel", it) }
                keys?.let { put("keys", it) }
                name?.let { put("name", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CatalogListParams &&
            channel == other.channel &&
            keys == other.keys &&
            name == other.name &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(channel, keys, name, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CatalogListParams{channel=$channel, keys=$keys, name=$name, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
