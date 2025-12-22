// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
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

class WebhookProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val url: JsonField<String>,
    private val authentication: JsonField<WebhookAuthentication>,
    private val headers: JsonField<Headers>,
    private val method: JsonField<WebhookMethod>,
    private val profile: JsonField<WebhookProfileType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication")
        @ExcludeMissing
        authentication: JsonField<WebhookAuthentication> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<WebhookMethod> = JsonMissing.of(),
        @JsonProperty("profile")
        @ExcludeMissing
        profile: JsonField<WebhookProfileType> = JsonMissing.of(),
    ) : this(url, authentication, headers, method, profile, mutableMapOf())

    /**
     * The URL to send the webhook request to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Authentication configuration for the webhook request.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authentication(): Optional<WebhookAuthentication> =
        authentication.getOptional("authentication")

    /**
     * Custom headers to include in the webhook request.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = headers.getOptional("headers")

    /**
     * The HTTP method to use for the webhook request. Defaults to POST if not specified.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun method(): Optional<WebhookMethod> = method.getOptional("method")

    /**
     * Specifies what profile information is included in the request payload. Defaults to 'limited'
     * if not specified.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profile(): Optional<WebhookProfileType> = profile.getOptional("profile")

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [authentication].
     *
     * Unlike [authentication], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authentication")
    @ExcludeMissing
    fun _authentication(): JsonField<WebhookAuthentication> = authentication

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<WebhookMethod> = method

    /**
     * Returns the raw JSON value of [profile].
     *
     * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<WebhookProfileType> = profile

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
         * Returns a mutable builder for constructing an instance of [WebhookProfile].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookProfile]. */
    class Builder internal constructor() {

        private var url: JsonField<String>? = null
        private var authentication: JsonField<WebhookAuthentication> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var method: JsonField<WebhookMethod> = JsonMissing.of()
        private var profile: JsonField<WebhookProfileType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookProfile: WebhookProfile) = apply {
            url = webhookProfile.url
            authentication = webhookProfile.authentication
            headers = webhookProfile.headers
            method = webhookProfile.method
            profile = webhookProfile.profile
            additionalProperties = webhookProfile.additionalProperties.toMutableMap()
        }

        /** The URL to send the webhook request to. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Authentication configuration for the webhook request. */
        fun authentication(authentication: WebhookAuthentication?) =
            authentication(JsonField.ofNullable(authentication))

        /** Alias for calling [Builder.authentication] with `authentication.orElse(null)`. */
        fun authentication(authentication: Optional<WebhookAuthentication>) =
            authentication(authentication.getOrNull())

        /**
         * Sets [Builder.authentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authentication] with a well-typed
         * [WebhookAuthentication] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authentication(authentication: JsonField<WebhookAuthentication>) = apply {
            this.authentication = authentication
        }

        /** Custom headers to include in the webhook request. */
        fun headers(headers: Headers?) = headers(JsonField.ofNullable(headers))

        /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
        fun headers(headers: Optional<Headers>) = headers(headers.getOrNull())

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** The HTTP method to use for the webhook request. Defaults to POST if not specified. */
        fun method(method: WebhookMethod?) = method(JsonField.ofNullable(method))

        /** Alias for calling [Builder.method] with `method.orElse(null)`. */
        fun method(method: Optional<WebhookMethod>) = method(method.getOrNull())

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [WebhookMethod] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun method(method: JsonField<WebhookMethod>) = apply { this.method = method }

        /**
         * Specifies what profile information is included in the request payload. Defaults to
         * 'limited' if not specified.
         */
        fun profile(profile: WebhookProfileType?) = profile(JsonField.ofNullable(profile))

        /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
        fun profile(profile: Optional<WebhookProfileType>) = profile(profile.getOrNull())

        /**
         * Sets [Builder.profile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profile] with a well-typed [WebhookProfileType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profile(profile: JsonField<WebhookProfileType>) = apply { this.profile = profile }

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
         * Returns an immutable instance of [WebhookProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookProfile =
            WebhookProfile(
                checkRequired("url", url),
                authentication,
                headers,
                method,
                profile,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WebhookProfile = apply {
        if (validated) {
            return@apply
        }

        url()
        authentication().ifPresent { it.validate() }
        headers().ifPresent { it.validate() }
        method().ifPresent { it.validate() }
        profile().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (url.asKnown().isPresent) 1 else 0) +
            (authentication.asKnown().getOrNull()?.validity() ?: 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (method.asKnown().getOrNull()?.validity() ?: 0) +
            (profile.asKnown().getOrNull()?.validity() ?: 0)

    /** Custom headers to include in the webhook request. */
    class Headers
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

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Headers = apply {
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

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookProfile &&
            url == other.url &&
            authentication == other.authentication &&
            headers == other.headers &&
            method == other.method &&
            profile == other.profile &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(url, authentication, headers, method, profile, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookProfile{url=$url, authentication=$authentication, headers=$headers, method=$method, profile=$profile, additionalProperties=$additionalProperties}"
}
