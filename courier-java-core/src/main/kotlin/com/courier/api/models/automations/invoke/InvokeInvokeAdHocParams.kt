// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations.invoke

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.getOrThrow
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of automation
 * steps. For information about what steps are available, checkout the ad hoc automation guide
 * [here](https://www.courier.com/docs/automations/steps/).
 */
class InvokeInvokeAdHocParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun automation(): Automation = body.automation()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<String> = body.brand()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = body.data()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profile(): Optional<Profile> = body.profile()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipient(): Optional<String> = body.recipient()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun template(): Optional<String> = body.template()

    /**
     * Returns the raw JSON value of [automation].
     *
     * Unlike [automation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _automation(): JsonField<Automation> = body._automation()

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _brand(): JsonField<String> = body._brand()

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _data(): JsonField<Data> = body._data()

    /**
     * Returns the raw JSON value of [profile].
     *
     * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _profile(): JsonField<Profile> = body._profile()

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipient(): JsonField<String> = body._recipient()

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _template(): JsonField<String> = body._template()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvokeInvokeAdHocParams].
         *
         * The following fields are required:
         * ```java
         * .automation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvokeInvokeAdHocParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invokeInvokeAdHocParams: InvokeInvokeAdHocParams) = apply {
            body = invokeInvokeAdHocParams.body.toBuilder()
            additionalHeaders = invokeInvokeAdHocParams.additionalHeaders.toBuilder()
            additionalQueryParams = invokeInvokeAdHocParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [automation]
         * - [brand]
         * - [data]
         * - [profile]
         * - [recipient]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun automation(automation: Automation) = apply { body.automation(automation) }

        /**
         * Sets [Builder.automation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automation] with a well-typed [Automation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun automation(automation: JsonField<Automation>) = apply { body.automation(automation) }

        fun brand(brand: String?) = apply { body.brand(brand) }

        /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
        fun brand(brand: Optional<String>) = brand(brand.getOrNull())

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<String>) = apply { body.brand(brand) }

        fun data(data: Data?) = apply { body.data(data) }

        /** Alias for calling [Builder.data] with `data.orElse(null)`. */
        fun data(data: Optional<Data>) = data(data.getOrNull())

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { body.data(data) }

        fun profile(profile: Profile?) = apply { body.profile(profile) }

        /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
        fun profile(profile: Optional<Profile>) = profile(profile.getOrNull())

        /**
         * Sets [Builder.profile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profile] with a well-typed [Profile] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun profile(profile: JsonField<Profile>) = apply { body.profile(profile) }

        fun recipient(recipient: String?) = apply { body.recipient(recipient) }

        /** Alias for calling [Builder.recipient] with `recipient.orElse(null)`. */
        fun recipient(recipient: Optional<String>) = recipient(recipient.getOrNull())

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { body.recipient(recipient) }

        fun template(template: String?) = apply { body.template(template) }

        /** Alias for calling [Builder.template] with `template.orElse(null)`. */
        fun template(template: Optional<String>) = template(template.getOrNull())

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun template(template: JsonField<String>) = apply { body.template(template) }

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
         * Returns an immutable instance of [InvokeInvokeAdHocParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .automation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvokeInvokeAdHocParams =
            InvokeInvokeAdHocParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val automation: JsonField<Automation>,
        private val brand: JsonField<String>,
        private val data: JsonField<Data>,
        private val profile: JsonField<Profile>,
        private val recipient: JsonField<String>,
        private val template: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("automation")
            @ExcludeMissing
            automation: JsonField<Automation> = JsonMissing.of(),
            @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("profile") @ExcludeMissing profile: JsonField<Profile> = JsonMissing.of(),
            @JsonProperty("recipient")
            @ExcludeMissing
            recipient: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template") @ExcludeMissing template: JsonField<String> = JsonMissing.of(),
        ) : this(automation, brand, data, profile, recipient, template, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun automation(): Automation = automation.getRequired("automation")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brand(): Optional<String> = brand.getOptional("brand")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profile(): Optional<Profile> = profile.getOptional("profile")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipient(): Optional<String> = recipient.getOptional("recipient")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun template(): Optional<String> = template.getOptional("template")

        /**
         * Returns the raw JSON value of [automation].
         *
         * Unlike [automation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("automation")
        @ExcludeMissing
        fun _automation(): JsonField<Automation> = automation

        /**
         * Returns the raw JSON value of [brand].
         *
         * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [profile].
         *
         * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<Profile> = profile

        /**
         * Returns the raw JSON value of [recipient].
         *
         * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

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
             * .automation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var automation: JsonField<Automation>? = null
            private var brand: JsonField<String> = JsonMissing.of()
            private var data: JsonField<Data> = JsonMissing.of()
            private var profile: JsonField<Profile> = JsonMissing.of()
            private var recipient: JsonField<String> = JsonMissing.of()
            private var template: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                automation = body.automation
                brand = body.brand
                data = body.data
                profile = body.profile
                recipient = body.recipient
                template = body.template
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun automation(automation: Automation) = automation(JsonField.of(automation))

            /**
             * Sets [Builder.automation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.automation] with a well-typed [Automation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun automation(automation: JsonField<Automation>) = apply {
                this.automation = automation
            }

            fun brand(brand: String?) = brand(JsonField.ofNullable(brand))

            /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
            fun brand(brand: Optional<String>) = brand(brand.getOrNull())

            /**
             * Sets [Builder.brand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brand] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brand(brand: JsonField<String>) = apply { this.brand = brand }

            fun data(data: Data?) = data(JsonField.ofNullable(data))

            /** Alias for calling [Builder.data] with `data.orElse(null)`. */
            fun data(data: Optional<Data>) = data(data.getOrNull())

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            fun profile(profile: Profile?) = profile(JsonField.ofNullable(profile))

            /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
            fun profile(profile: Optional<Profile>) = profile(profile.getOrNull())

            /**
             * Sets [Builder.profile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profile] with a well-typed [Profile] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

            fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

            /** Alias for calling [Builder.recipient] with `recipient.orElse(null)`. */
            fun recipient(recipient: Optional<String>) = recipient(recipient.getOrNull())

            /**
             * Sets [Builder.recipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipient] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

            fun template(template: String?) = template(JsonField.ofNullable(template))

            /** Alias for calling [Builder.template] with `template.orElse(null)`. */
            fun template(template: Optional<String>) = template(template.getOrNull())

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

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
             * .automation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("automation", automation),
                    brand,
                    data,
                    profile,
                    recipient,
                    template,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            automation().validate()
            brand()
            data().ifPresent { it.validate() }
            profile().ifPresent { it.validate() }
            recipient()
            template()
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
            (automation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (brand.asKnown().isPresent) 1 else 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (profile.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recipient.asKnown().isPresent) 1 else 0) +
                (if (template.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                automation == other.automation &&
                brand == other.brand &&
                data == other.data &&
                profile == other.profile &&
                recipient == other.recipient &&
                template == other.template &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                automation,
                brand,
                data,
                profile,
                recipient,
                template,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{automation=$automation, brand=$brand, data=$data, profile=$profile, recipient=$recipient, template=$template, additionalProperties=$additionalProperties}"
    }

    class Automation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val steps: JsonField<List<Step>>,
        private val cancelationToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("steps") @ExcludeMissing steps: JsonField<List<Step>> = JsonMissing.of(),
            @JsonProperty("cancelation_token")
            @ExcludeMissing
            cancelationToken: JsonField<String> = JsonMissing.of(),
        ) : this(steps, cancelationToken, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun steps(): List<Step> = steps.getRequired("steps")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelationToken(): Optional<String> = cancelationToken.getOptional("cancelation_token")

        /**
         * Returns the raw JSON value of [steps].
         *
         * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

        /**
         * Returns the raw JSON value of [cancelationToken].
         *
         * Unlike [cancelationToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancelation_token")
        @ExcludeMissing
        fun _cancelationToken(): JsonField<String> = cancelationToken

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
             * Returns a mutable builder for constructing an instance of [Automation].
             *
             * The following fields are required:
             * ```java
             * .steps()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Automation]. */
        class Builder internal constructor() {

            private var steps: JsonField<MutableList<Step>>? = null
            private var cancelationToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(automation: Automation) = apply {
                steps = automation.steps.map { it.toMutableList() }
                cancelationToken = automation.cancelationToken
                additionalProperties = automation.additionalProperties.toMutableMap()
            }

            fun steps(steps: List<Step>) = steps(JsonField.of(steps))

            /**
             * Sets [Builder.steps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.steps] with a well-typed `List<Step>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun steps(steps: JsonField<List<Step>>) = apply {
                this.steps = steps.map { it.toMutableList() }
            }

            /**
             * Adds a single [Step] to [steps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStep(step: Step) = apply {
                steps =
                    (steps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("steps", it).add(step)
                    }
            }

            /** Alias for calling [addStep] with `Step.ofAutomationDelay(automationDelay)`. */
            fun addStep(automationDelay: Step.AutomationDelayStep) =
                addStep(Step.ofAutomationDelay(automationDelay))

            /** Alias for calling [addStep] with `Step.ofAutomationSend(automationSend)`. */
            fun addStep(automationSend: Step.AutomationSendStep) =
                addStep(Step.ofAutomationSend(automationSend))

            /** Alias for calling [addStep] with `Step.ofAutomationSendList(automationSendList)`. */
            fun addStep(automationSendList: Step.AutomationSendListStep) =
                addStep(Step.ofAutomationSendList(automationSendList))

            /**
             * Alias for calling [addStep] with
             * `Step.ofAutomationUpdateProfile(automationUpdateProfile)`.
             */
            fun addStep(automationUpdateProfile: Step.AutomationUpdateProfileStep) =
                addStep(Step.ofAutomationUpdateProfile(automationUpdateProfile))

            /** Alias for calling [addStep] with `Step.ofAutomationCancel(automationCancel)`. */
            fun addStep(automationCancel: Step.AutomationCancelStep) =
                addStep(Step.ofAutomationCancel(automationCancel))

            /**
             * Alias for calling [addStep] with `Step.ofAutomationFetchData(automationFetchData)`.
             */
            fun addStep(automationFetchData: Step.AutomationFetchDataStep) =
                addStep(Step.ofAutomationFetchData(automationFetchData))

            /** Alias for calling [addStep] with `Step.ofAutomationInvoke(automationInvoke)`. */
            fun addStep(automationInvoke: Step.AutomationInvokeStep) =
                addStep(Step.ofAutomationInvoke(automationInvoke))

            fun cancelationToken(cancelationToken: String?) =
                cancelationToken(JsonField.ofNullable(cancelationToken))

            /**
             * Alias for calling [Builder.cancelationToken] with `cancelationToken.orElse(null)`.
             */
            fun cancelationToken(cancelationToken: Optional<String>) =
                cancelationToken(cancelationToken.getOrNull())

            /**
             * Sets [Builder.cancelationToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelationToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelationToken(cancelationToken: JsonField<String>) = apply {
                this.cancelationToken = cancelationToken
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
             * Returns an immutable instance of [Automation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .steps()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Automation =
                Automation(
                    checkRequired("steps", steps).map { it.toImmutable() },
                    cancelationToken,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Automation = apply {
            if (validated) {
                return@apply
            }

            steps().forEach { it.validate() }
            cancelationToken()
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
            (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (cancelationToken.asKnown().isPresent) 1 else 0)

        @JsonDeserialize(using = Step.Deserializer::class)
        @JsonSerialize(using = Step.Serializer::class)
        class Step
        private constructor(
            private val automationDelay: AutomationDelayStep? = null,
            private val automationSend: AutomationSendStep? = null,
            private val automationSendList: AutomationSendListStep? = null,
            private val automationUpdateProfile: AutomationUpdateProfileStep? = null,
            private val automationCancel: AutomationCancelStep? = null,
            private val automationFetchData: AutomationFetchDataStep? = null,
            private val automationInvoke: AutomationInvokeStep? = null,
            private val _json: JsonValue? = null,
        ) {

            fun automationDelay(): Optional<AutomationDelayStep> =
                Optional.ofNullable(automationDelay)

            fun automationSend(): Optional<AutomationSendStep> = Optional.ofNullable(automationSend)

            fun automationSendList(): Optional<AutomationSendListStep> =
                Optional.ofNullable(automationSendList)

            fun automationUpdateProfile(): Optional<AutomationUpdateProfileStep> =
                Optional.ofNullable(automationUpdateProfile)

            fun automationCancel(): Optional<AutomationCancelStep> =
                Optional.ofNullable(automationCancel)

            fun automationFetchData(): Optional<AutomationFetchDataStep> =
                Optional.ofNullable(automationFetchData)

            fun automationInvoke(): Optional<AutomationInvokeStep> =
                Optional.ofNullable(automationInvoke)

            fun isAutomationDelay(): Boolean = automationDelay != null

            fun isAutomationSend(): Boolean = automationSend != null

            fun isAutomationSendList(): Boolean = automationSendList != null

            fun isAutomationUpdateProfile(): Boolean = automationUpdateProfile != null

            fun isAutomationCancel(): Boolean = automationCancel != null

            fun isAutomationFetchData(): Boolean = automationFetchData != null

            fun isAutomationInvoke(): Boolean = automationInvoke != null

            fun asAutomationDelay(): AutomationDelayStep =
                automationDelay.getOrThrow("automationDelay")

            fun asAutomationSend(): AutomationSendStep = automationSend.getOrThrow("automationSend")

            fun asAutomationSendList(): AutomationSendListStep =
                automationSendList.getOrThrow("automationSendList")

            fun asAutomationUpdateProfile(): AutomationUpdateProfileStep =
                automationUpdateProfile.getOrThrow("automationUpdateProfile")

            fun asAutomationCancel(): AutomationCancelStep =
                automationCancel.getOrThrow("automationCancel")

            fun asAutomationFetchData(): AutomationFetchDataStep =
                automationFetchData.getOrThrow("automationFetchData")

            fun asAutomationInvoke(): AutomationInvokeStep =
                automationInvoke.getOrThrow("automationInvoke")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    automationDelay != null -> visitor.visitAutomationDelay(automationDelay)
                    automationSend != null -> visitor.visitAutomationSend(automationSend)
                    automationSendList != null ->
                        visitor.visitAutomationSendList(automationSendList)
                    automationUpdateProfile != null ->
                        visitor.visitAutomationUpdateProfile(automationUpdateProfile)
                    automationCancel != null -> visitor.visitAutomationCancel(automationCancel)
                    automationFetchData != null ->
                        visitor.visitAutomationFetchData(automationFetchData)
                    automationInvoke != null -> visitor.visitAutomationInvoke(automationInvoke)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Step = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAutomationDelay(automationDelay: AutomationDelayStep) {
                            automationDelay.validate()
                        }

                        override fun visitAutomationSend(automationSend: AutomationSendStep) {
                            automationSend.validate()
                        }

                        override fun visitAutomationSendList(
                            automationSendList: AutomationSendListStep
                        ) {
                            automationSendList.validate()
                        }

                        override fun visitAutomationUpdateProfile(
                            automationUpdateProfile: AutomationUpdateProfileStep
                        ) {
                            automationUpdateProfile.validate()
                        }

                        override fun visitAutomationCancel(automationCancel: AutomationCancelStep) {
                            automationCancel.validate()
                        }

                        override fun visitAutomationFetchData(
                            automationFetchData: AutomationFetchDataStep
                        ) {
                            automationFetchData.validate()
                        }

                        override fun visitAutomationInvoke(automationInvoke: AutomationInvokeStep) {
                            automationInvoke.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitAutomationDelay(automationDelay: AutomationDelayStep) =
                            automationDelay.validity()

                        override fun visitAutomationSend(automationSend: AutomationSendStep) =
                            automationSend.validity()

                        override fun visitAutomationSendList(
                            automationSendList: AutomationSendListStep
                        ) = automationSendList.validity()

                        override fun visitAutomationUpdateProfile(
                            automationUpdateProfile: AutomationUpdateProfileStep
                        ) = automationUpdateProfile.validity()

                        override fun visitAutomationCancel(automationCancel: AutomationCancelStep) =
                            automationCancel.validity()

                        override fun visitAutomationFetchData(
                            automationFetchData: AutomationFetchDataStep
                        ) = automationFetchData.validity()

                        override fun visitAutomationInvoke(automationInvoke: AutomationInvokeStep) =
                            automationInvoke.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Step &&
                    automationDelay == other.automationDelay &&
                    automationSend == other.automationSend &&
                    automationSendList == other.automationSendList &&
                    automationUpdateProfile == other.automationUpdateProfile &&
                    automationCancel == other.automationCancel &&
                    automationFetchData == other.automationFetchData &&
                    automationInvoke == other.automationInvoke
            }

            override fun hashCode(): Int =
                Objects.hash(
                    automationDelay,
                    automationSend,
                    automationSendList,
                    automationUpdateProfile,
                    automationCancel,
                    automationFetchData,
                    automationInvoke,
                )

            override fun toString(): String =
                when {
                    automationDelay != null -> "Step{automationDelay=$automationDelay}"
                    automationSend != null -> "Step{automationSend=$automationSend}"
                    automationSendList != null -> "Step{automationSendList=$automationSendList}"
                    automationUpdateProfile != null ->
                        "Step{automationUpdateProfile=$automationUpdateProfile}"
                    automationCancel != null -> "Step{automationCancel=$automationCancel}"
                    automationFetchData != null -> "Step{automationFetchData=$automationFetchData}"
                    automationInvoke != null -> "Step{automationInvoke=$automationInvoke}"
                    _json != null -> "Step{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Step")
                }

            companion object {

                @JvmStatic
                fun ofAutomationDelay(automationDelay: AutomationDelayStep) =
                    Step(automationDelay = automationDelay)

                @JvmStatic
                fun ofAutomationSend(automationSend: AutomationSendStep) =
                    Step(automationSend = automationSend)

                @JvmStatic
                fun ofAutomationSendList(automationSendList: AutomationSendListStep) =
                    Step(automationSendList = automationSendList)

                @JvmStatic
                fun ofAutomationUpdateProfile(
                    automationUpdateProfile: AutomationUpdateProfileStep
                ) = Step(automationUpdateProfile = automationUpdateProfile)

                @JvmStatic
                fun ofAutomationCancel(automationCancel: AutomationCancelStep) =
                    Step(automationCancel = automationCancel)

                @JvmStatic
                fun ofAutomationFetchData(automationFetchData: AutomationFetchDataStep) =
                    Step(automationFetchData = automationFetchData)

                @JvmStatic
                fun ofAutomationInvoke(automationInvoke: AutomationInvokeStep) =
                    Step(automationInvoke = automationInvoke)
            }

            /**
             * An interface that defines how to map each variant of [Step] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitAutomationDelay(automationDelay: AutomationDelayStep): T

                fun visitAutomationSend(automationSend: AutomationSendStep): T

                fun visitAutomationSendList(automationSendList: AutomationSendListStep): T

                fun visitAutomationUpdateProfile(
                    automationUpdateProfile: AutomationUpdateProfileStep
                ): T

                fun visitAutomationCancel(automationCancel: AutomationCancelStep): T

                fun visitAutomationFetchData(automationFetchData: AutomationFetchDataStep): T

                fun visitAutomationInvoke(automationInvoke: AutomationInvokeStep): T

                /**
                 * Maps an unknown variant of [Step] to a value of type [T].
                 *
                 * An instance of [Step] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws CourierInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw CourierInvalidDataException("Unknown Step: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Step>(Step::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Step {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<AutomationDelayStep>())?.let {
                                    Step(automationDelay = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationSendStep>())?.let {
                                    Step(automationSend = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationSendListStep>())
                                    ?.let { Step(automationSendList = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationUpdateProfileStep>())
                                    ?.let { Step(automationUpdateProfile = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationCancelStep>())?.let {
                                    Step(automationCancel = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationFetchDataStep>())
                                    ?.let { Step(automationFetchData = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationInvokeStep>())?.let {
                                    Step(automationInvoke = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Step(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Step>(Step::class) {

                override fun serialize(
                    value: Step,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.automationDelay != null ->
                            generator.writeObject(value.automationDelay)
                        value.automationSend != null -> generator.writeObject(value.automationSend)
                        value.automationSendList != null ->
                            generator.writeObject(value.automationSendList)
                        value.automationUpdateProfile != null ->
                            generator.writeObject(value.automationUpdateProfile)
                        value.automationCancel != null ->
                            generator.writeObject(value.automationCancel)
                        value.automationFetchData != null ->
                            generator.writeObject(value.automationFetchData)
                        value.automationInvoke != null ->
                            generator.writeObject(value.automationInvoke)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Step")
                    }
                }
            }

            class AutomationDelayStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val duration: JsonField<String>,
                private val until: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("until")
                    @ExcludeMissing
                    until: JsonField<String> = JsonMissing.of(),
                ) : this(action, duration, until, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<String> = duration.getOptional("duration")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun until(): Optional<String> = until.getOptional("until")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<String> = duration

                /**
                 * Returns the raw JSON value of [until].
                 *
                 * Unlike [until], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("until") @ExcludeMissing fun _until(): JsonField<String> = until

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationDelayStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationDelayStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var duration: JsonField<String> = JsonMissing.of()
                    private var until: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationDelayStep: AutomationDelayStep) = apply {
                        action = automationDelayStep.action
                        duration = automationDelayStep.duration
                        until = automationDelayStep.until
                        additionalProperties =
                            automationDelayStep.additionalProperties.toMutableMap()
                    }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

                    /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
                    fun duration(duration: Optional<String>) = duration(duration.getOrNull())

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<String>) = apply { this.duration = duration }

                    fun until(until: String?) = until(JsonField.ofNullable(until))

                    /** Alias for calling [Builder.until] with `until.orElse(null)`. */
                    fun until(until: Optional<String>) = until(until.getOrNull())

                    /**
                     * Sets [Builder.until] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.until] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun until(until: JsonField<String>) = apply { this.until = until }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationDelayStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationDelayStep =
                        AutomationDelayStep(
                            checkRequired("action", action),
                            duration,
                            until,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationDelayStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    duration()
                    until()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (duration.asKnown().isPresent) 1 else 0) +
                        (if (until.asKnown().isPresent) 1 else 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DELAY = of("delay")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        DELAY
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DELAY,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DELAY -> Value.DELAY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DELAY -> Known.DELAY
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationDelayStep &&
                        action == other.action &&
                        duration == other.duration &&
                        until == other.until &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, duration, until, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationDelayStep{action=$action, duration=$duration, until=$until, additionalProperties=$additionalProperties}"
            }

            class AutomationSendStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val brand: JsonField<String>,
                private val data: JsonField<Data>,
                private val profile: JsonField<Profile>,
                private val recipient: JsonField<String>,
                private val template: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("brand")
                    @ExcludeMissing
                    brand: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
                    @JsonProperty("profile")
                    @ExcludeMissing
                    profile: JsonField<Profile> = JsonMissing.of(),
                    @JsonProperty("recipient")
                    @ExcludeMissing
                    recipient: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("template")
                    @ExcludeMissing
                    template: JsonField<String> = JsonMissing.of(),
                ) : this(action, brand, data, profile, recipient, template, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun brand(): Optional<String> = brand.getOptional("brand")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun data(): Optional<Data> = data.getOptional("data")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun profile(): Optional<Profile> = profile.getOptional("profile")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun recipient(): Optional<String> = recipient.getOptional("recipient")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun template(): Optional<String> = template.getOptional("template")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [brand].
                 *
                 * Unlike [brand], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

                /**
                 * Returns the raw JSON value of [data].
                 *
                 * Unlike [data], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

                /**
                 * Returns the raw JSON value of [profile].
                 *
                 * Unlike [profile], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("profile")
                @ExcludeMissing
                fun _profile(): JsonField<Profile> = profile

                /**
                 * Returns the raw JSON value of [recipient].
                 *
                 * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("recipient")
                @ExcludeMissing
                fun _recipient(): JsonField<String> = recipient

                /**
                 * Returns the raw JSON value of [template].
                 *
                 * Unlike [template], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("template")
                @ExcludeMissing
                fun _template(): JsonField<String> = template

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationSendStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationSendStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var brand: JsonField<String> = JsonMissing.of()
                    private var data: JsonField<Data> = JsonMissing.of()
                    private var profile: JsonField<Profile> = JsonMissing.of()
                    private var recipient: JsonField<String> = JsonMissing.of()
                    private var template: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationSendStep: AutomationSendStep) = apply {
                        action = automationSendStep.action
                        brand = automationSendStep.brand
                        data = automationSendStep.data
                        profile = automationSendStep.profile
                        recipient = automationSendStep.recipient
                        template = automationSendStep.template
                        additionalProperties =
                            automationSendStep.additionalProperties.toMutableMap()
                    }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun brand(brand: String?) = brand(JsonField.ofNullable(brand))

                    /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
                    fun brand(brand: Optional<String>) = brand(brand.getOrNull())

                    /**
                     * Sets [Builder.brand] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.brand] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun brand(brand: JsonField<String>) = apply { this.brand = brand }

                    fun data(data: Data?) = data(JsonField.ofNullable(data))

                    /** Alias for calling [Builder.data] with `data.orElse(null)`. */
                    fun data(data: Optional<Data>) = data(data.getOrNull())

                    /**
                     * Sets [Builder.data] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.data] with a well-typed [Data] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun data(data: JsonField<Data>) = apply { this.data = data }

                    fun profile(profile: Profile?) = profile(JsonField.ofNullable(profile))

                    /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
                    fun profile(profile: Optional<Profile>) = profile(profile.getOrNull())

                    /**
                     * Sets [Builder.profile] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.profile] with a well-typed [Profile] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

                    fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

                    /** Alias for calling [Builder.recipient] with `recipient.orElse(null)`. */
                    fun recipient(recipient: Optional<String>) = recipient(recipient.getOrNull())

                    /**
                     * Sets [Builder.recipient] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recipient] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun recipient(recipient: JsonField<String>) = apply {
                        this.recipient = recipient
                    }

                    fun template(template: String?) = template(JsonField.ofNullable(template))

                    /** Alias for calling [Builder.template] with `template.orElse(null)`. */
                    fun template(template: Optional<String>) = template(template.getOrNull())

                    /**
                     * Sets [Builder.template] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.template] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun template(template: JsonField<String>) = apply { this.template = template }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationSendStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationSendStep =
                        AutomationSendStep(
                            checkRequired("action", action),
                            brand,
                            data,
                            profile,
                            recipient,
                            template,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationSendStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    brand()
                    data().ifPresent { it.validate() }
                    profile().ifPresent { it.validate() }
                    recipient()
                    template()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (brand.asKnown().isPresent) 1 else 0) +
                        (data.asKnown().getOrNull()?.validity() ?: 0) +
                        (profile.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (recipient.asKnown().isPresent) 1 else 0) +
                        (if (template.asKnown().isPresent) 1 else 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SEND = of("send")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        SEND
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SEND,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SEND -> Value.SEND
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SEND -> Known.SEND
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Data
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

                        /** Returns a mutable builder for constructing an instance of [Data]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Data]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(data: Data) = apply {
                            additionalProperties = data.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Data].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Data = Data(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Data = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Data && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Data{additionalProperties=$additionalProperties}"
                }

                class Profile
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

                        /** Returns a mutable builder for constructing an instance of [Profile]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Profile]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(profile: Profile) = apply {
                            additionalProperties = profile.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Profile].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Profile = Profile(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Profile = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Profile &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Profile{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationSendStep &&
                        action == other.action &&
                        brand == other.brand &&
                        data == other.data &&
                        profile == other.profile &&
                        recipient == other.recipient &&
                        template == other.template &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        action,
                        brand,
                        data,
                        profile,
                        recipient,
                        template,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationSendStep{action=$action, brand=$brand, data=$data, profile=$profile, recipient=$recipient, template=$template, additionalProperties=$additionalProperties}"
            }

            class AutomationSendListStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val list: JsonField<String>,
                private val brand: JsonField<String>,
                private val data: JsonField<Data>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("list")
                    @ExcludeMissing
                    list: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("brand")
                    @ExcludeMissing
                    brand: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
                ) : this(action, list, brand, data, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun list(): String = list.getRequired("list")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun brand(): Optional<String> = brand.getOptional("brand")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun data(): Optional<Data> = data.getOptional("data")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [list].
                 *
                 * Unlike [list], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<String> = list

                /**
                 * Returns the raw JSON value of [brand].
                 *
                 * Unlike [brand], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

                /**
                 * Returns the raw JSON value of [data].
                 *
                 * Unlike [data], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationSendListStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .list()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationSendListStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var list: JsonField<String>? = null
                    private var brand: JsonField<String> = JsonMissing.of()
                    private var data: JsonField<Data> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationSendListStep: AutomationSendListStep) = apply {
                        action = automationSendListStep.action
                        list = automationSendListStep.list
                        brand = automationSendListStep.brand
                        data = automationSendListStep.data
                        additionalProperties =
                            automationSendListStep.additionalProperties.toMutableMap()
                    }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun list(list: String) = list(JsonField.of(list))

                    /**
                     * Sets [Builder.list] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.list] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun list(list: JsonField<String>) = apply { this.list = list }

                    fun brand(brand: String?) = brand(JsonField.ofNullable(brand))

                    /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
                    fun brand(brand: Optional<String>) = brand(brand.getOrNull())

                    /**
                     * Sets [Builder.brand] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.brand] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun brand(brand: JsonField<String>) = apply { this.brand = brand }

                    fun data(data: Data?) = data(JsonField.ofNullable(data))

                    /** Alias for calling [Builder.data] with `data.orElse(null)`. */
                    fun data(data: Optional<Data>) = data(data.getOrNull())

                    /**
                     * Sets [Builder.data] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.data] with a well-typed [Data] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun data(data: JsonField<Data>) = apply { this.data = data }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationSendListStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .list()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationSendListStep =
                        AutomationSendListStep(
                            checkRequired("action", action),
                            checkRequired("list", list),
                            brand,
                            data,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationSendListStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    list()
                    brand()
                    data().ifPresent { it.validate() }
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (list.asKnown().isPresent) 1 else 0) +
                        (if (brand.asKnown().isPresent) 1 else 0) +
                        (data.asKnown().getOrNull()?.validity() ?: 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SEND_LIST = of("send-list")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        SEND_LIST
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SEND_LIST,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SEND_LIST -> Value.SEND_LIST
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SEND_LIST -> Known.SEND_LIST
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Data
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

                        /** Returns a mutable builder for constructing an instance of [Data]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Data]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(data: Data) = apply {
                            additionalProperties = data.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Data].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Data = Data(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Data = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Data && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Data{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationSendListStep &&
                        action == other.action &&
                        list == other.list &&
                        brand == other.brand &&
                        data == other.data &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, list, brand, data, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationSendListStep{action=$action, list=$list, brand=$brand, data=$data, additionalProperties=$additionalProperties}"
            }

            class AutomationUpdateProfileStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val profile: JsonField<Profile>,
                private val merge: JsonField<Merge>,
                private val recipientId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("profile")
                    @ExcludeMissing
                    profile: JsonField<Profile> = JsonMissing.of(),
                    @JsonProperty("merge")
                    @ExcludeMissing
                    merge: JsonField<Merge> = JsonMissing.of(),
                    @JsonProperty("recipient_id")
                    @ExcludeMissing
                    recipientId: JsonField<String> = JsonMissing.of(),
                ) : this(action, profile, merge, recipientId, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun profile(): Profile = profile.getRequired("profile")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun merge(): Optional<Merge> = merge.getOptional("merge")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun recipientId(): Optional<String> = recipientId.getOptional("recipient_id")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [profile].
                 *
                 * Unlike [profile], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("profile")
                @ExcludeMissing
                fun _profile(): JsonField<Profile> = profile

                /**
                 * Returns the raw JSON value of [merge].
                 *
                 * Unlike [merge], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("merge") @ExcludeMissing fun _merge(): JsonField<Merge> = merge

                /**
                 * Returns the raw JSON value of [recipientId].
                 *
                 * Unlike [recipientId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("recipient_id")
                @ExcludeMissing
                fun _recipientId(): JsonField<String> = recipientId

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationUpdateProfileStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .profile()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationUpdateProfileStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var profile: JsonField<Profile>? = null
                    private var merge: JsonField<Merge> = JsonMissing.of()
                    private var recipientId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationUpdateProfileStep: AutomationUpdateProfileStep) =
                        apply {
                            action = automationUpdateProfileStep.action
                            profile = automationUpdateProfileStep.profile
                            merge = automationUpdateProfileStep.merge
                            recipientId = automationUpdateProfileStep.recipientId
                            additionalProperties =
                                automationUpdateProfileStep.additionalProperties.toMutableMap()
                        }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun profile(profile: Profile) = profile(JsonField.of(profile))

                    /**
                     * Sets [Builder.profile] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.profile] with a well-typed [Profile] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

                    fun merge(merge: Merge?) = merge(JsonField.ofNullable(merge))

                    /** Alias for calling [Builder.merge] with `merge.orElse(null)`. */
                    fun merge(merge: Optional<Merge>) = merge(merge.getOrNull())

                    /**
                     * Sets [Builder.merge] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.merge] with a well-typed [Merge] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun merge(merge: JsonField<Merge>) = apply { this.merge = merge }

                    fun recipientId(recipientId: String?) =
                        recipientId(JsonField.ofNullable(recipientId))

                    /** Alias for calling [Builder.recipientId] with `recipientId.orElse(null)`. */
                    fun recipientId(recipientId: Optional<String>) =
                        recipientId(recipientId.getOrNull())

                    /**
                     * Sets [Builder.recipientId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recipientId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun recipientId(recipientId: JsonField<String>) = apply {
                        this.recipientId = recipientId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationUpdateProfileStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .profile()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationUpdateProfileStep =
                        AutomationUpdateProfileStep(
                            checkRequired("action", action),
                            checkRequired("profile", profile),
                            merge,
                            recipientId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationUpdateProfileStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    profile().validate()
                    merge().ifPresent { it.validate() }
                    recipientId()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (profile.asKnown().getOrNull()?.validity() ?: 0) +
                        (merge.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (recipientId.asKnown().isPresent) 1 else 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val UPDATE_PROFILE = of("update-profile")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        UPDATE_PROFILE
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        UPDATE_PROFILE,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            UPDATE_PROFILE -> Value.UPDATE_PROFILE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            UPDATE_PROFILE -> Known.UPDATE_PROFILE
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Profile
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

                        /** Returns a mutable builder for constructing an instance of [Profile]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Profile]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(profile: Profile) = apply {
                            additionalProperties = profile.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Profile].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Profile = Profile(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Profile = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Profile &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Profile{additionalProperties=$additionalProperties}"
                }

                class Merge @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val NONE = of("none")

                        @JvmField val OVERWRITE = of("overwrite")

                        @JvmField val SOFT_MERGE = of("soft-merge")

                        @JvmField val REPLACE = of("replace")

                        @JvmStatic fun of(value: String) = Merge(JsonField.of(value))
                    }

                    /** An enum containing [Merge]'s known values. */
                    enum class Known {
                        NONE,
                        OVERWRITE,
                        SOFT_MERGE,
                        REPLACE,
                    }

                    /**
                     * An enum containing [Merge]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Merge] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NONE,
                        OVERWRITE,
                        SOFT_MERGE,
                        REPLACE,
                        /**
                         * An enum member indicating that [Merge] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NONE -> Value.NONE
                            OVERWRITE -> Value.OVERWRITE
                            SOFT_MERGE -> Value.SOFT_MERGE
                            REPLACE -> Value.REPLACE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NONE -> Known.NONE
                            OVERWRITE -> Known.OVERWRITE
                            SOFT_MERGE -> Known.SOFT_MERGE
                            REPLACE -> Known.REPLACE
                            else -> throw CourierInvalidDataException("Unknown Merge: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Merge = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Merge && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationUpdateProfileStep &&
                        action == other.action &&
                        profile == other.profile &&
                        merge == other.merge &&
                        recipientId == other.recipientId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, profile, merge, recipientId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationUpdateProfileStep{action=$action, profile=$profile, merge=$merge, recipientId=$recipientId, additionalProperties=$additionalProperties}"
            }

            class AutomationCancelStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val cancelationToken: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("cancelation_token")
                    @ExcludeMissing
                    cancelationToken: JsonField<String> = JsonMissing.of(),
                ) : this(action, cancelationToken, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun cancelationToken(): String = cancelationToken.getRequired("cancelation_token")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [cancelationToken].
                 *
                 * Unlike [cancelationToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cancelation_token")
                @ExcludeMissing
                fun _cancelationToken(): JsonField<String> = cancelationToken

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationCancelStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .cancelationToken()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationCancelStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var cancelationToken: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationCancelStep: AutomationCancelStep) = apply {
                        action = automationCancelStep.action
                        cancelationToken = automationCancelStep.cancelationToken
                        additionalProperties =
                            automationCancelStep.additionalProperties.toMutableMap()
                    }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun cancelationToken(cancelationToken: String) =
                        cancelationToken(JsonField.of(cancelationToken))

                    /**
                     * Sets [Builder.cancelationToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cancelationToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cancelationToken(cancelationToken: JsonField<String>) = apply {
                        this.cancelationToken = cancelationToken
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationCancelStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .cancelationToken()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationCancelStep =
                        AutomationCancelStep(
                            checkRequired("action", action),
                            checkRequired("cancelationToken", cancelationToken),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationCancelStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    cancelationToken()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (cancelationToken.asKnown().isPresent) 1 else 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CANCEL = of("cancel")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        CANCEL
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CANCEL,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CANCEL -> Value.CANCEL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CANCEL -> Known.CANCEL
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationCancelStep &&
                        action == other.action &&
                        cancelationToken == other.cancelationToken &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, cancelationToken, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationCancelStep{action=$action, cancelationToken=$cancelationToken, additionalProperties=$additionalProperties}"
            }

            class AutomationFetchDataStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val webhook: JsonField<Webhook>,
                private val mergeStrategy: JsonField<MergeStrategy>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("webhook")
                    @ExcludeMissing
                    webhook: JsonField<Webhook> = JsonMissing.of(),
                    @JsonProperty("merge_strategy")
                    @ExcludeMissing
                    mergeStrategy: JsonField<MergeStrategy> = JsonMissing.of(),
                ) : this(action, webhook, mergeStrategy, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun webhook(): Webhook = webhook.getRequired("webhook")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun mergeStrategy(): Optional<MergeStrategy> =
                    mergeStrategy.getOptional("merge_strategy")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [webhook].
                 *
                 * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("webhook")
                @ExcludeMissing
                fun _webhook(): JsonField<Webhook> = webhook

                /**
                 * Returns the raw JSON value of [mergeStrategy].
                 *
                 * Unlike [mergeStrategy], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("merge_strategy")
                @ExcludeMissing
                fun _mergeStrategy(): JsonField<MergeStrategy> = mergeStrategy

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationFetchDataStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .webhook()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationFetchDataStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var webhook: JsonField<Webhook>? = null
                    private var mergeStrategy: JsonField<MergeStrategy> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationFetchDataStep: AutomationFetchDataStep) = apply {
                        action = automationFetchDataStep.action
                        webhook = automationFetchDataStep.webhook
                        mergeStrategy = automationFetchDataStep.mergeStrategy
                        additionalProperties =
                            automationFetchDataStep.additionalProperties.toMutableMap()
                    }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

                    /**
                     * Sets [Builder.webhook] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.webhook] with a well-typed [Webhook] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

                    fun mergeStrategy(mergeStrategy: MergeStrategy?) =
                        mergeStrategy(JsonField.ofNullable(mergeStrategy))

                    /**
                     * Alias for calling [Builder.mergeStrategy] with `mergeStrategy.orElse(null)`.
                     */
                    fun mergeStrategy(mergeStrategy: Optional<MergeStrategy>) =
                        mergeStrategy(mergeStrategy.getOrNull())

                    /**
                     * Sets [Builder.mergeStrategy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mergeStrategy] with a well-typed
                     * [MergeStrategy] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun mergeStrategy(mergeStrategy: JsonField<MergeStrategy>) = apply {
                        this.mergeStrategy = mergeStrategy
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationFetchDataStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .webhook()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationFetchDataStep =
                        AutomationFetchDataStep(
                            checkRequired("action", action),
                            checkRequired("webhook", webhook),
                            mergeStrategy,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationFetchDataStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    webhook().validate()
                    mergeStrategy().ifPresent { it.validate() }
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (webhook.asKnown().getOrNull()?.validity() ?: 0) +
                        (mergeStrategy.asKnown().getOrNull()?.validity() ?: 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val FETCH_DATA = of("fetch-data")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        FETCH_DATA
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FETCH_DATA,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FETCH_DATA -> Value.FETCH_DATA
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FETCH_DATA -> Known.FETCH_DATA
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Webhook
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val method: JsonField<Method>,
                    private val url: JsonField<String>,
                    private val body: JsonField<String>,
                    private val headers: JsonField<Headers>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("method")
                        @ExcludeMissing
                        method: JsonField<Method> = JsonMissing.of(),
                        @JsonProperty("url")
                        @ExcludeMissing
                        url: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("body")
                        @ExcludeMissing
                        body: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("headers")
                        @ExcludeMissing
                        headers: JsonField<Headers> = JsonMissing.of(),
                    ) : this(method, url, body, headers, mutableMapOf())

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun url(): String = url.getRequired("url")

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun body(): Optional<String> = body.getOptional("body")

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun headers(): Optional<Headers> = headers.getOptional("headers")

                    /**
                     * Returns the raw JSON value of [method].
                     *
                     * Unlike [method], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * Returns the raw JSON value of [url].
                     *
                     * Unlike [url], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                    /**
                     * Returns the raw JSON value of [body].
                     *
                     * Unlike [body], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

                    /**
                     * Returns the raw JSON value of [headers].
                     *
                     * Unlike [headers], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("headers")
                    @ExcludeMissing
                    fun _headers(): JsonField<Headers> = headers

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
                         * Returns a mutable builder for constructing an instance of [Webhook].
                         *
                         * The following fields are required:
                         * ```java
                         * .method()
                         * .url()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Webhook]. */
                    class Builder internal constructor() {

                        private var method: JsonField<Method>? = null
                        private var url: JsonField<String>? = null
                        private var body: JsonField<String> = JsonMissing.of()
                        private var headers: JsonField<Headers> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(webhook: Webhook) = apply {
                            method = webhook.method
                            url = webhook.url
                            body = webhook.body
                            headers = webhook.headers
                            additionalProperties = webhook.additionalProperties.toMutableMap()
                        }

                        fun method(method: Method) = method(JsonField.of(method))

                        /**
                         * Sets [Builder.method] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.method] with a well-typed [Method] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        fun url(url: String) = url(JsonField.of(url))

                        /**
                         * Sets [Builder.url] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.url] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun url(url: JsonField<String>) = apply { this.url = url }

                        fun body(body: String?) = body(JsonField.ofNullable(body))

                        /** Alias for calling [Builder.body] with `body.orElse(null)`. */
                        fun body(body: Optional<String>) = body(body.getOrNull())

                        /**
                         * Sets [Builder.body] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.body] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun body(body: JsonField<String>) = apply { this.body = body }

                        fun headers(headers: Headers?) = headers(JsonField.ofNullable(headers))

                        /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
                        fun headers(headers: Optional<Headers>) = headers(headers.getOrNull())

                        /**
                         * Sets [Builder.headers] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.headers] with a well-typed [Headers]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Webhook].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .method()
                         * .url()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Webhook =
                            Webhook(
                                checkRequired("method", method),
                                checkRequired("url", url),
                                body,
                                headers,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Webhook = apply {
                        if (validated) {
                            return@apply
                        }

                        method().validate()
                        url()
                        body()
                        headers().ifPresent { it.validate() }
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
                        (method.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (url.asKnown().isPresent) 1 else 0) +
                            (if (body.asKnown().isPresent) 1 else 0) +
                            (headers.asKnown().getOrNull()?.validity() ?: 0)

                    class Method
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val GET = of("GET")

                            @JvmField val POST = of("POST")

                            @JvmField val PUT = of("PUT")

                            @JvmField val PATCH = of("PATCH")

                            @JvmField val DELETE = of("DELETE")

                            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                        }

                        /** An enum containing [Method]'s known values. */
                        enum class Known {
                            GET,
                            POST,
                            PUT,
                            PATCH,
                            DELETE,
                        }

                        /**
                         * An enum containing [Method]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Method] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            GET,
                            POST,
                            PUT,
                            PATCH,
                            DELETE,
                            /**
                             * An enum member indicating that [Method] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                GET -> Value.GET
                                POST -> Value.POST
                                PUT -> Value.PUT
                                PATCH -> Value.PATCH
                                DELETE -> Value.DELETE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws CourierInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                GET -> Known.GET
                                POST -> Known.POST
                                PUT -> Known.PUT
                                PATCH -> Known.PATCH
                                DELETE -> Known.DELETE
                                else -> throw CourierInvalidDataException("Unknown Method: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws CourierInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                CourierInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Method = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Method && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Headers].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Headers]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(headers: Headers) = apply {
                                additionalProperties = headers.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Headers].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Headers &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Headers{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Webhook &&
                            method == other.method &&
                            url == other.url &&
                            body == other.body &&
                            headers == other.headers &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(method, url, body, headers, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Webhook{method=$method, url=$url, body=$body, headers=$headers, additionalProperties=$additionalProperties}"
                }

                class MergeStrategy
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val REPLACE = of("replace")

                        @JvmField val OVERWRITE = of("overwrite")

                        @JvmField val SOFT_MERGE = of("soft-merge")

                        @JvmStatic fun of(value: String) = MergeStrategy(JsonField.of(value))
                    }

                    /** An enum containing [MergeStrategy]'s known values. */
                    enum class Known {
                        REPLACE,
                        OVERWRITE,
                        SOFT_MERGE,
                    }

                    /**
                     * An enum containing [MergeStrategy]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [MergeStrategy] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        REPLACE,
                        OVERWRITE,
                        SOFT_MERGE,
                        /**
                         * An enum member indicating that [MergeStrategy] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            REPLACE -> Value.REPLACE
                            OVERWRITE -> Value.OVERWRITE
                            SOFT_MERGE -> Value.SOFT_MERGE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            REPLACE -> Known.REPLACE
                            OVERWRITE -> Known.OVERWRITE
                            SOFT_MERGE -> Known.SOFT_MERGE
                            else ->
                                throw CourierInvalidDataException("Unknown MergeStrategy: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): MergeStrategy = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MergeStrategy && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationFetchDataStep &&
                        action == other.action &&
                        webhook == other.webhook &&
                        mergeStrategy == other.mergeStrategy &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, webhook, mergeStrategy, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationFetchDataStep{action=$action, webhook=$webhook, mergeStrategy=$mergeStrategy, additionalProperties=$additionalProperties}"
            }

            class AutomationInvokeStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val template: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("template")
                    @ExcludeMissing
                    template: JsonField<String> = JsonMissing.of(),
                ) : this(action, template, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun template(): String = template.getRequired("template")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [template].
                 *
                 * Unlike [template], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("template")
                @ExcludeMissing
                fun _template(): JsonField<String> = template

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
                     * Returns a mutable builder for constructing an instance of
                     * [AutomationInvokeStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .template()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationInvokeStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var template: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationInvokeStep: AutomationInvokeStep) = apply {
                        action = automationInvokeStep.action
                        template = automationInvokeStep.template
                        additionalProperties =
                            automationInvokeStep.additionalProperties.toMutableMap()
                    }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun template(template: String) = template(JsonField.of(template))

                    /**
                     * Sets [Builder.template] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.template] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun template(template: JsonField<String>) = apply { this.template = template }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AutomationInvokeStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .template()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationInvokeStep =
                        AutomationInvokeStep(
                            checkRequired("action", action),
                            checkRequired("template", template),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationInvokeStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    template()
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
                    (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (template.asKnown().isPresent) 1 else 0)

                class Action
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val INVOKE = of("invoke")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        INVOKE
                    }

                    /**
                     * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Action] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INVOKE,
                        /**
                         * An enum member indicating that [Action] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INVOKE -> Value.INVOKE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws CourierInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INVOKE -> Known.INVOKE
                            else -> throw CourierInvalidDataException("Unknown Action: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws CourierInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            CourierInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Action = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Action && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationInvokeStep &&
                        action == other.action &&
                        template == other.template &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, template, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationInvokeStep{action=$action, template=$template, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Automation &&
                steps == other.steps &&
                cancelationToken == other.cancelationToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(steps, cancelationToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Automation{steps=$steps, cancelationToken=$cancelationToken, additionalProperties=$additionalProperties}"
    }

    class Data
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
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

            return other is Data && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    class Profile
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

            /** Returns a mutable builder for constructing an instance of [Profile]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Profile]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(profile: Profile) = apply {
                additionalProperties = profile.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Profile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Profile = Profile(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Profile = apply {
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

            return other is Profile && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Profile{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvokeInvokeAdHocParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvokeInvokeAdHocParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
