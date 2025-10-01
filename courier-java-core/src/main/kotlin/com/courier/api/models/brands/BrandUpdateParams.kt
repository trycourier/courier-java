// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.checkRequired
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Replace an existing brand with the supplied values. */
class BrandUpdateParams
private constructor(
    private val brandId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /**
     * The name of the brand.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<BrandSettings> = body.settings()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snippets(): Optional<BrandSnippets> = body.snippets()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _settings(): JsonField<BrandSettings> = body._settings()

    /**
     * Returns the raw JSON value of [snippets].
     *
     * Unlike [snippets], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _snippets(): JsonField<BrandSnippets> = body._snippets()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandUpdateParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandUpdateParams: BrandUpdateParams) = apply {
            brandId = brandUpdateParams.brandId
            body = brandUpdateParams.body.toBuilder()
            additionalHeaders = brandUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandUpdateParams.additionalQueryParams.toBuilder()
        }

        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [settings]
         * - [snippets]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The name of the brand. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun settings(settings: BrandSettings?) = apply { body.settings(settings) }

        /** Alias for calling [Builder.settings] with `settings.orElse(null)`. */
        fun settings(settings: Optional<BrandSettings>) = settings(settings.getOrNull())

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [BrandSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settings(settings: JsonField<BrandSettings>) = apply { body.settings(settings) }

        fun snippets(snippets: BrandSnippets?) = apply { body.snippets(snippets) }

        /** Alias for calling [Builder.snippets] with `snippets.orElse(null)`. */
        fun snippets(snippets: Optional<BrandSnippets>) = snippets(snippets.getOrNull())

        /**
         * Sets [Builder.snippets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snippets] with a well-typed [BrandSnippets] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun snippets(snippets: JsonField<BrandSnippets>) = apply { body.snippets(snippets) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [BrandUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandUpdateParams =
            BrandUpdateParams(
                brandId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> brandId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val settings: JsonField<BrandSettings>,
        private val snippets: JsonField<BrandSnippets>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("settings")
            @ExcludeMissing
            settings: JsonField<BrandSettings> = JsonMissing.of(),
            @JsonProperty("snippets")
            @ExcludeMissing
            snippets: JsonField<BrandSnippets> = JsonMissing.of(),
        ) : this(name, settings, snippets, mutableMapOf())

        /**
         * The name of the brand.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun settings(): Optional<BrandSettings> = settings.getOptional("settings")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun snippets(): Optional<BrandSnippets> = snippets.getOptional("snippets")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [settings].
         *
         * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settings")
        @ExcludeMissing
        fun _settings(): JsonField<BrandSettings> = settings

        /**
         * Returns the raw JSON value of [snippets].
         *
         * Unlike [snippets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snippets")
        @ExcludeMissing
        fun _snippets(): JsonField<BrandSnippets> = snippets

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var settings: JsonField<BrandSettings> = JsonMissing.of()
            private var snippets: JsonField<BrandSnippets> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                settings = body.settings
                snippets = body.snippets
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name of the brand. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun settings(settings: BrandSettings?) = settings(JsonField.ofNullable(settings))

            /** Alias for calling [Builder.settings] with `settings.orElse(null)`. */
            fun settings(settings: Optional<BrandSettings>) = settings(settings.getOrNull())

            /**
             * Sets [Builder.settings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settings] with a well-typed [BrandSettings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settings(settings: JsonField<BrandSettings>) = apply { this.settings = settings }

            fun snippets(snippets: BrandSnippets?) = snippets(JsonField.ofNullable(snippets))

            /** Alias for calling [Builder.snippets] with `snippets.orElse(null)`. */
            fun snippets(snippets: Optional<BrandSnippets>) = snippets(snippets.getOrNull())

            /**
             * Sets [Builder.snippets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snippets] with a well-typed [BrandSnippets] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snippets(snippets: JsonField<BrandSnippets>) = apply { this.snippets = snippets }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    settings,
                    snippets,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            settings().ifPresent { it.validate() }
            snippets().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CourierInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (settings.asKnown().getOrNull()?.validity() ?: 0) +
                (snippets.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                settings == other.settings &&
                snippets == other.snippets &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, settings, snippets, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, settings=$settings, snippets=$snippets, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandUpdateParams &&
            brandId == other.brandId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(brandId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandUpdateParams{brandId=$brandId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
