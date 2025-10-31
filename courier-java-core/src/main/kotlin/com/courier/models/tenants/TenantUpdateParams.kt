// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create or Replace a Tenant */
class TenantUpdateParams
private constructor(
    private val tenantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    /**
     * Name of the tenant.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Brand to be used for the account when one is not specified by the send call.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<String> = body.brandId()

    /**
     * Defines the preferences used for the tenant when the user hasn't specified their own.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultPreferences(): Optional<DefaultPreferences> = body.defaultPreferences()

    /**
     * Tenant's parent id (if any).
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentTenantId(): Optional<String> = body.parentTenantId()

    /**
     * Arbitrary properties accessible to a template.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<Properties> = body.properties()

    /**
     * A user profile object merged with user profile on send.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userProfile(): Optional<UserProfile> = body.userProfile()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _brandId(): JsonField<String> = body._brandId()

    /**
     * Returns the raw JSON value of [defaultPreferences].
     *
     * Unlike [defaultPreferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultPreferences(): JsonField<DefaultPreferences> = body._defaultPreferences()

    /**
     * Returns the raw JSON value of [parentTenantId].
     *
     * Unlike [parentTenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentTenantId(): JsonField<String> = body._parentTenantId()

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _properties(): JsonField<Properties> = body._properties()

    /**
     * Returns the raw JSON value of [userProfile].
     *
     * Unlike [userProfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userProfile(): JsonField<UserProfile> = body._userProfile()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TenantUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TenantUpdateParams]. */
    class Builder internal constructor() {

        private var tenantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tenantUpdateParams: TenantUpdateParams) = apply {
            tenantId = tenantUpdateParams.tenantId
            body = tenantUpdateParams.body.toBuilder()
            additionalHeaders = tenantUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tenantUpdateParams.additionalQueryParams.toBuilder()
        }

        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [brandId]
         * - [defaultPreferences]
         * - [parentTenantId]
         * - [properties]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Name of the tenant. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Brand to be used for the account when one is not specified by the send call. */
        fun brandId(brandId: String?) = apply { body.brandId(brandId) }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { body.brandId(brandId) }

        /** Defines the preferences used for the tenant when the user hasn't specified their own. */
        fun defaultPreferences(defaultPreferences: DefaultPreferences?) = apply {
            body.defaultPreferences(defaultPreferences)
        }

        /**
         * Alias for calling [Builder.defaultPreferences] with `defaultPreferences.orElse(null)`.
         */
        fun defaultPreferences(defaultPreferences: Optional<DefaultPreferences>) =
            defaultPreferences(defaultPreferences.getOrNull())

        /**
         * Sets [Builder.defaultPreferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultPreferences] with a well-typed
         * [DefaultPreferences] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultPreferences(defaultPreferences: JsonField<DefaultPreferences>) = apply {
            body.defaultPreferences(defaultPreferences)
        }

        /** Tenant's parent id (if any). */
        fun parentTenantId(parentTenantId: String?) = apply { body.parentTenantId(parentTenantId) }

        /** Alias for calling [Builder.parentTenantId] with `parentTenantId.orElse(null)`. */
        fun parentTenantId(parentTenantId: Optional<String>) =
            parentTenantId(parentTenantId.getOrNull())

        /**
         * Sets [Builder.parentTenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentTenantId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentTenantId(parentTenantId: JsonField<String>) = apply {
            body.parentTenantId(parentTenantId)
        }

        /** Arbitrary properties accessible to a template. */
        fun properties(properties: Properties?) = apply { body.properties(properties) }

        /** Alias for calling [Builder.properties] with `properties.orElse(null)`. */
        fun properties(properties: Optional<Properties>) = properties(properties.getOrNull())

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { body.properties(properties) }

        /** A user profile object merged with user profile on send. */
        fun userProfile(userProfile: UserProfile?) = apply { body.userProfile(userProfile) }

        /** Alias for calling [Builder.userProfile] with `userProfile.orElse(null)`. */
        fun userProfile(userProfile: Optional<UserProfile>) = userProfile(userProfile.getOrNull())

        /**
         * Sets [Builder.userProfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userProfile] with a well-typed [UserProfile] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userProfile(userProfile: JsonField<UserProfile>) = apply {
            body.userProfile(userProfile)
        }

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
         * Returns an immutable instance of [TenantUpdateParams].
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
        fun build(): TenantUpdateParams =
            TenantUpdateParams(
                tenantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> tenantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val brandId: JsonField<String>,
        private val defaultPreferences: JsonField<DefaultPreferences>,
        private val parentTenantId: JsonField<String>,
        private val properties: JsonField<Properties>,
        private val userProfile: JsonField<UserProfile>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_preferences")
            @ExcludeMissing
            defaultPreferences: JsonField<DefaultPreferences> = JsonMissing.of(),
            @JsonProperty("parent_tenant_id")
            @ExcludeMissing
            parentTenantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("user_profile")
            @ExcludeMissing
            userProfile: JsonField<UserProfile> = JsonMissing.of(),
        ) : this(
            name,
            brandId,
            defaultPreferences,
            parentTenantId,
            properties,
            userProfile,
            mutableMapOf(),
        )

        /**
         * Name of the tenant.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Brand to be used for the account when one is not specified by the send call.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brand_id")

        /**
         * Defines the preferences used for the tenant when the user hasn't specified their own.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultPreferences(): Optional<DefaultPreferences> =
            defaultPreferences.getOptional("default_preferences")

        /**
         * Tenant's parent id (if any).
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parentTenantId(): Optional<String> = parentTenantId.getOptional("parent_tenant_id")

        /**
         * Arbitrary properties accessible to a template.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * A user profile object merged with user profile on send.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userProfile(): Optional<UserProfile> = userProfile.getOptional("user_profile")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [defaultPreferences].
         *
         * Unlike [defaultPreferences], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_preferences")
        @ExcludeMissing
        fun _defaultPreferences(): JsonField<DefaultPreferences> = defaultPreferences

        /**
         * Returns the raw JSON value of [parentTenantId].
         *
         * Unlike [parentTenantId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_tenant_id")
        @ExcludeMissing
        fun _parentTenantId(): JsonField<String> = parentTenantId

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [userProfile].
         *
         * Unlike [userProfile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_profile")
        @ExcludeMissing
        fun _userProfile(): JsonField<UserProfile> = userProfile

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
            private var brandId: JsonField<String> = JsonMissing.of()
            private var defaultPreferences: JsonField<DefaultPreferences> = JsonMissing.of()
            private var parentTenantId: JsonField<String> = JsonMissing.of()
            private var properties: JsonField<Properties> = JsonMissing.of()
            private var userProfile: JsonField<UserProfile> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                brandId = body.brandId
                defaultPreferences = body.defaultPreferences
                parentTenantId = body.parentTenantId
                properties = body.properties
                userProfile = body.userProfile
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the tenant. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Brand to be used for the account when one is not specified by the send call. */
            fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

            /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
            fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /**
             * Defines the preferences used for the tenant when the user hasn't specified their own.
             */
            fun defaultPreferences(defaultPreferences: DefaultPreferences?) =
                defaultPreferences(JsonField.ofNullable(defaultPreferences))

            /**
             * Alias for calling [Builder.defaultPreferences] with
             * `defaultPreferences.orElse(null)`.
             */
            fun defaultPreferences(defaultPreferences: Optional<DefaultPreferences>) =
                defaultPreferences(defaultPreferences.getOrNull())

            /**
             * Sets [Builder.defaultPreferences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultPreferences] with a well-typed
             * [DefaultPreferences] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun defaultPreferences(defaultPreferences: JsonField<DefaultPreferences>) = apply {
                this.defaultPreferences = defaultPreferences
            }

            /** Tenant's parent id (if any). */
            fun parentTenantId(parentTenantId: String?) =
                parentTenantId(JsonField.ofNullable(parentTenantId))

            /** Alias for calling [Builder.parentTenantId] with `parentTenantId.orElse(null)`. */
            fun parentTenantId(parentTenantId: Optional<String>) =
                parentTenantId(parentTenantId.getOrNull())

            /**
             * Sets [Builder.parentTenantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentTenantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentTenantId(parentTenantId: JsonField<String>) = apply {
                this.parentTenantId = parentTenantId
            }

            /** Arbitrary properties accessible to a template. */
            fun properties(properties: Properties?) = properties(JsonField.ofNullable(properties))

            /** Alias for calling [Builder.properties] with `properties.orElse(null)`. */
            fun properties(properties: Optional<Properties>) = properties(properties.getOrNull())

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** A user profile object merged with user profile on send. */
            fun userProfile(userProfile: UserProfile?) =
                userProfile(JsonField.ofNullable(userProfile))

            /** Alias for calling [Builder.userProfile] with `userProfile.orElse(null)`. */
            fun userProfile(userProfile: Optional<UserProfile>) =
                userProfile(userProfile.getOrNull())

            /**
             * Sets [Builder.userProfile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userProfile] with a well-typed [UserProfile] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userProfile(userProfile: JsonField<UserProfile>) = apply {
                this.userProfile = userProfile
            }

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
                    brandId,
                    defaultPreferences,
                    parentTenantId,
                    properties,
                    userProfile,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            brandId()
            defaultPreferences().ifPresent { it.validate() }
            parentTenantId()
            properties().ifPresent { it.validate() }
            userProfile().ifPresent { it.validate() }
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
                (if (brandId.asKnown().isPresent) 1 else 0) +
                (defaultPreferences.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parentTenantId.asKnown().isPresent) 1 else 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (userProfile.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                brandId == other.brandId &&
                defaultPreferences == other.defaultPreferences &&
                parentTenantId == other.parentTenantId &&
                properties == other.properties &&
                userProfile == other.userProfile &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                brandId,
                defaultPreferences,
                parentTenantId,
                properties,
                userProfile,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, brandId=$brandId, defaultPreferences=$defaultPreferences, parentTenantId=$parentTenantId, properties=$properties, userProfile=$userProfile, additionalProperties=$additionalProperties}"
    }

    /** Arbitrary properties accessible to a template. */
    class Properties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties = Properties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Properties{additionalProperties=$additionalProperties}"
    }

    /** A user profile object merged with user profile on send. */
    class UserProfile
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UserProfile]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UserProfile]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userProfile: UserProfile) = apply {
                additionalProperties = userProfile.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [UserProfile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UserProfile = UserProfile(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): UserProfile = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UserProfile && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UserProfile{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantUpdateParams &&
            tenantId == other.tenantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(tenantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TenantUpdateParams{tenantId=$tenantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
