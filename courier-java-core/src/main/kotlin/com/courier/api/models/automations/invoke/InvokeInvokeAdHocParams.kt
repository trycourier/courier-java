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
import com.courier.api.models.send.Message
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
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<String> = body.brand()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<AutomationInvokeParams.Data> = body.data()

    fun _profile(): JsonValue = body._profile()

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
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun automation(): Automation = body.automation()

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
    fun _data(): JsonField<AutomationInvokeParams.Data> = body._data()

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

    /**
     * Returns the raw JSON value of [automation].
     *
     * Unlike [automation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _automation(): JsonField<Automation> = body._automation()

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
         * - [brand]
         * - [data]
         * - [profile]
         * - [recipient]
         * - [template]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        fun data(data: AutomationInvokeParams.Data?) = apply { body.data(data) }

        /** Alias for calling [Builder.data] with `data.orElse(null)`. */
        fun data(data: Optional<AutomationInvokeParams.Data>) = data(data.getOrNull())

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [AutomationInvokeParams.Data]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<AutomationInvokeParams.Data>) = apply { body.data(data) }

        fun profile(profile: JsonValue) = apply { body.profile(profile) }

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

        fun automation(automation: Automation) = apply { body.automation(automation) }

        /**
         * Sets [Builder.automation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automation] with a well-typed [Automation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun automation(automation: JsonField<Automation>) = apply { body.automation(automation) }

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
        private val brand: JsonField<String>,
        private val data: JsonField<AutomationInvokeParams.Data>,
        private val profile: JsonValue,
        private val recipient: JsonField<String>,
        private val template: JsonField<String>,
        private val automation: JsonField<Automation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<AutomationInvokeParams.Data> = JsonMissing.of(),
            @JsonProperty("profile") @ExcludeMissing profile: JsonValue = JsonMissing.of(),
            @JsonProperty("recipient")
            @ExcludeMissing
            recipient: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("automation")
            @ExcludeMissing
            automation: JsonField<Automation> = JsonMissing.of(),
        ) : this(brand, data, profile, recipient, template, automation, mutableMapOf())

        fun toAutomationInvokeParams(): AutomationInvokeParams =
            AutomationInvokeParams.builder()
                .brand(brand)
                .data(data)
                .profile(profile)
                .recipient(recipient)
                .template(template)
                .build()

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brand(): Optional<String> = brand.getOptional("brand")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<AutomationInvokeParams.Data> = data.getOptional("data")

        @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonValue = profile

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun automation(): Automation = automation.getRequired("automation")

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
        @JsonProperty("data")
        @ExcludeMissing
        fun _data(): JsonField<AutomationInvokeParams.Data> = data

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

        /**
         * Returns the raw JSON value of [automation].
         *
         * Unlike [automation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("automation")
        @ExcludeMissing
        fun _automation(): JsonField<Automation> = automation

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

            private var brand: JsonField<String> = JsonMissing.of()
            private var data: JsonField<AutomationInvokeParams.Data> = JsonMissing.of()
            private var profile: JsonValue = JsonMissing.of()
            private var recipient: JsonField<String> = JsonMissing.of()
            private var template: JsonField<String> = JsonMissing.of()
            private var automation: JsonField<Automation>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                brand = body.brand
                data = body.data
                profile = body.profile
                recipient = body.recipient
                template = body.template
                automation = body.automation
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun data(data: AutomationInvokeParams.Data?) = data(JsonField.ofNullable(data))

            /** Alias for calling [Builder.data] with `data.orElse(null)`. */
            fun data(data: Optional<AutomationInvokeParams.Data>) = data(data.getOrNull())

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed
             * [AutomationInvokeParams.Data] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun data(data: JsonField<AutomationInvokeParams.Data>) = apply { this.data = data }

            fun profile(profile: JsonValue) = apply { this.profile = profile }

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
                    brand,
                    data,
                    profile,
                    recipient,
                    template,
                    checkRequired("automation", automation),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            brand()
            data().ifPresent { it.validate() }
            recipient()
            template()
            automation().validate()
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
            (if (brand.asKnown().isPresent) 1 else 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recipient.asKnown().isPresent) 1 else 0) +
                (if (template.asKnown().isPresent) 1 else 0) +
                (automation.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                brand == other.brand &&
                data == other.data &&
                profile == other.profile &&
                recipient == other.recipient &&
                template == other.template &&
                automation == other.automation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                brand,
                data,
                profile,
                recipient,
                template,
                automation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{brand=$brand, data=$data, profile=$profile, recipient=$recipient, template=$template, automation=$automation, additionalProperties=$additionalProperties}"
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

            /**
             * Alias for calling [addStep] with
             * `Step.ofAutomationAddToDigest(automationAddToDigest)`.
             */
            fun addStep(automationAddToDigest: Step.AutomationAddToDigestStep) =
                addStep(Step.ofAutomationAddToDigest(automationAddToDigest))

            /**
             * Alias for calling [addStep] with `Step.ofAutomationAddToBatch(automationAddToBatch)`.
             */
            fun addStep(automationAddToBatch: Step.AutomationAddToBatchStep) =
                addStep(Step.ofAutomationAddToBatch(automationAddToBatch))

            /** Alias for calling [addStep] with `Step.ofAutomationThrottle(automationThrottle)`. */
            fun addStep(automationThrottle: Step.AutomationThrottleStep) =
                addStep(Step.ofAutomationThrottle(automationThrottle))

            /** Alias for calling [addStep] with `Step.ofAutomationCancel(automationCancel)`. */
            fun addStep(automationCancel: Step.AutomationCancelStep) =
                addStep(Step.ofAutomationCancel(automationCancel))

            /** Alias for calling [addStep] with `Step.ofAutomationDelay(automationDelay)`. */
            fun addStep(automationDelay: Step.AutomationDelayStep) =
                addStep(Step.ofAutomationDelay(automationDelay))

            /**
             * Alias for calling [addStep] with `Step.ofAutomationFetchData(automationFetchData)`.
             */
            fun addStep(automationFetchData: Step.AutomationFetchDataStep) =
                addStep(Step.ofAutomationFetchData(automationFetchData))

            /** Alias for calling [addStep] with `Step.ofAutomationInvoke(automationInvoke)`. */
            fun addStep(automationInvoke: Step.AutomationInvokeStep) =
                addStep(Step.ofAutomationInvoke(automationInvoke))

            /** Alias for calling [addStep] with `Step.ofAutomationSend(automationSend)`. */
            fun addStep(automationSend: Step.AutomationSendStep) =
                addStep(Step.ofAutomationSend(automationSend))

            /** Alias for calling [addStep] with `Step.ofAutomationV2Send(automationV2Send)`. */
            fun addStep(automationV2Send: Step.AutomationV2SendStep) =
                addStep(Step.ofAutomationV2Send(automationV2Send))

            /** Alias for calling [addStep] with `Step.ofAutomationSendList(automationSendList)`. */
            fun addStep(automationSendList: Step.AutomationSendListStep) =
                addStep(Step.ofAutomationSendList(automationSendList))

            /**
             * Alias for calling [addStep] with
             * `Step.ofAutomationUpdateProfile(automationUpdateProfile)`.
             */
            fun addStep(automationUpdateProfile: Step.AutomationUpdateProfileStep) =
                addStep(Step.ofAutomationUpdateProfile(automationUpdateProfile))

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
            private val automationAddToDigest: AutomationAddToDigestStep? = null,
            private val automationAddToBatch: AutomationAddToBatchStep? = null,
            private val automationThrottle: AutomationThrottleStep? = null,
            private val automationCancel: AutomationCancelStep? = null,
            private val automationDelay: AutomationDelayStep? = null,
            private val automationFetchData: AutomationFetchDataStep? = null,
            private val automationInvoke: AutomationInvokeStep? = null,
            private val automationSend: AutomationSendStep? = null,
            private val automationV2Send: AutomationV2SendStep? = null,
            private val automationSendList: AutomationSendListStep? = null,
            private val automationUpdateProfile: AutomationUpdateProfileStep? = null,
            private val _json: JsonValue? = null,
        ) {

            fun automationAddToDigest(): Optional<AutomationAddToDigestStep> =
                Optional.ofNullable(automationAddToDigest)

            fun automationAddToBatch(): Optional<AutomationAddToBatchStep> =
                Optional.ofNullable(automationAddToBatch)

            fun automationThrottle(): Optional<AutomationThrottleStep> =
                Optional.ofNullable(automationThrottle)

            fun automationCancel(): Optional<AutomationCancelStep> =
                Optional.ofNullable(automationCancel)

            fun automationDelay(): Optional<AutomationDelayStep> =
                Optional.ofNullable(automationDelay)

            fun automationFetchData(): Optional<AutomationFetchDataStep> =
                Optional.ofNullable(automationFetchData)

            fun automationInvoke(): Optional<AutomationInvokeStep> =
                Optional.ofNullable(automationInvoke)

            fun automationSend(): Optional<AutomationSendStep> = Optional.ofNullable(automationSend)

            fun automationV2Send(): Optional<AutomationV2SendStep> =
                Optional.ofNullable(automationV2Send)

            fun automationSendList(): Optional<AutomationSendListStep> =
                Optional.ofNullable(automationSendList)

            fun automationUpdateProfile(): Optional<AutomationUpdateProfileStep> =
                Optional.ofNullable(automationUpdateProfile)

            fun isAutomationAddToDigest(): Boolean = automationAddToDigest != null

            fun isAutomationAddToBatch(): Boolean = automationAddToBatch != null

            fun isAutomationThrottle(): Boolean = automationThrottle != null

            fun isAutomationCancel(): Boolean = automationCancel != null

            fun isAutomationDelay(): Boolean = automationDelay != null

            fun isAutomationFetchData(): Boolean = automationFetchData != null

            fun isAutomationInvoke(): Boolean = automationInvoke != null

            fun isAutomationSend(): Boolean = automationSend != null

            fun isAutomationV2Send(): Boolean = automationV2Send != null

            fun isAutomationSendList(): Boolean = automationSendList != null

            fun isAutomationUpdateProfile(): Boolean = automationUpdateProfile != null

            fun asAutomationAddToDigest(): AutomationAddToDigestStep =
                automationAddToDigest.getOrThrow("automationAddToDigest")

            fun asAutomationAddToBatch(): AutomationAddToBatchStep =
                automationAddToBatch.getOrThrow("automationAddToBatch")

            fun asAutomationThrottle(): AutomationThrottleStep =
                automationThrottle.getOrThrow("automationThrottle")

            fun asAutomationCancel(): AutomationCancelStep =
                automationCancel.getOrThrow("automationCancel")

            fun asAutomationDelay(): AutomationDelayStep =
                automationDelay.getOrThrow("automationDelay")

            fun asAutomationFetchData(): AutomationFetchDataStep =
                automationFetchData.getOrThrow("automationFetchData")

            fun asAutomationInvoke(): AutomationInvokeStep =
                automationInvoke.getOrThrow("automationInvoke")

            fun asAutomationSend(): AutomationSendStep = automationSend.getOrThrow("automationSend")

            fun asAutomationV2Send(): AutomationV2SendStep =
                automationV2Send.getOrThrow("automationV2Send")

            fun asAutomationSendList(): AutomationSendListStep =
                automationSendList.getOrThrow("automationSendList")

            fun asAutomationUpdateProfile(): AutomationUpdateProfileStep =
                automationUpdateProfile.getOrThrow("automationUpdateProfile")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    automationAddToDigest != null ->
                        visitor.visitAutomationAddToDigest(automationAddToDigest)
                    automationAddToBatch != null ->
                        visitor.visitAutomationAddToBatch(automationAddToBatch)
                    automationThrottle != null ->
                        visitor.visitAutomationThrottle(automationThrottle)
                    automationCancel != null -> visitor.visitAutomationCancel(automationCancel)
                    automationDelay != null -> visitor.visitAutomationDelay(automationDelay)
                    automationFetchData != null ->
                        visitor.visitAutomationFetchData(automationFetchData)
                    automationInvoke != null -> visitor.visitAutomationInvoke(automationInvoke)
                    automationSend != null -> visitor.visitAutomationSend(automationSend)
                    automationV2Send != null -> visitor.visitAutomationV2Send(automationV2Send)
                    automationSendList != null ->
                        visitor.visitAutomationSendList(automationSendList)
                    automationUpdateProfile != null ->
                        visitor.visitAutomationUpdateProfile(automationUpdateProfile)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Step = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAutomationAddToDigest(
                            automationAddToDigest: AutomationAddToDigestStep
                        ) {
                            automationAddToDigest.validate()
                        }

                        override fun visitAutomationAddToBatch(
                            automationAddToBatch: AutomationAddToBatchStep
                        ) {
                            automationAddToBatch.validate()
                        }

                        override fun visitAutomationThrottle(
                            automationThrottle: AutomationThrottleStep
                        ) {
                            automationThrottle.validate()
                        }

                        override fun visitAutomationCancel(automationCancel: AutomationCancelStep) {
                            automationCancel.validate()
                        }

                        override fun visitAutomationDelay(automationDelay: AutomationDelayStep) {
                            automationDelay.validate()
                        }

                        override fun visitAutomationFetchData(
                            automationFetchData: AutomationFetchDataStep
                        ) {
                            automationFetchData.validate()
                        }

                        override fun visitAutomationInvoke(automationInvoke: AutomationInvokeStep) {
                            automationInvoke.validate()
                        }

                        override fun visitAutomationSend(automationSend: AutomationSendStep) {
                            automationSend.validate()
                        }

                        override fun visitAutomationV2Send(automationV2Send: AutomationV2SendStep) {
                            automationV2Send.validate()
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
                        override fun visitAutomationAddToDigest(
                            automationAddToDigest: AutomationAddToDigestStep
                        ) = automationAddToDigest.validity()

                        override fun visitAutomationAddToBatch(
                            automationAddToBatch: AutomationAddToBatchStep
                        ) = automationAddToBatch.validity()

                        override fun visitAutomationThrottle(
                            automationThrottle: AutomationThrottleStep
                        ) = automationThrottle.validity()

                        override fun visitAutomationCancel(automationCancel: AutomationCancelStep) =
                            automationCancel.validity()

                        override fun visitAutomationDelay(automationDelay: AutomationDelayStep) =
                            automationDelay.validity()

                        override fun visitAutomationFetchData(
                            automationFetchData: AutomationFetchDataStep
                        ) = automationFetchData.validity()

                        override fun visitAutomationInvoke(automationInvoke: AutomationInvokeStep) =
                            automationInvoke.validity()

                        override fun visitAutomationSend(automationSend: AutomationSendStep) =
                            automationSend.validity()

                        override fun visitAutomationV2Send(automationV2Send: AutomationV2SendStep) =
                            automationV2Send.validity()

                        override fun visitAutomationSendList(
                            automationSendList: AutomationSendListStep
                        ) = automationSendList.validity()

                        override fun visitAutomationUpdateProfile(
                            automationUpdateProfile: AutomationUpdateProfileStep
                        ) = automationUpdateProfile.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Step &&
                    automationAddToDigest == other.automationAddToDigest &&
                    automationAddToBatch == other.automationAddToBatch &&
                    automationThrottle == other.automationThrottle &&
                    automationCancel == other.automationCancel &&
                    automationDelay == other.automationDelay &&
                    automationFetchData == other.automationFetchData &&
                    automationInvoke == other.automationInvoke &&
                    automationSend == other.automationSend &&
                    automationV2Send == other.automationV2Send &&
                    automationSendList == other.automationSendList &&
                    automationUpdateProfile == other.automationUpdateProfile
            }

            override fun hashCode(): Int =
                Objects.hash(
                    automationAddToDigest,
                    automationAddToBatch,
                    automationThrottle,
                    automationCancel,
                    automationDelay,
                    automationFetchData,
                    automationInvoke,
                    automationSend,
                    automationV2Send,
                    automationSendList,
                    automationUpdateProfile,
                )

            override fun toString(): String =
                when {
                    automationAddToDigest != null ->
                        "Step{automationAddToDigest=$automationAddToDigest}"
                    automationAddToBatch != null ->
                        "Step{automationAddToBatch=$automationAddToBatch}"
                    automationThrottle != null -> "Step{automationThrottle=$automationThrottle}"
                    automationCancel != null -> "Step{automationCancel=$automationCancel}"
                    automationDelay != null -> "Step{automationDelay=$automationDelay}"
                    automationFetchData != null -> "Step{automationFetchData=$automationFetchData}"
                    automationInvoke != null -> "Step{automationInvoke=$automationInvoke}"
                    automationSend != null -> "Step{automationSend=$automationSend}"
                    automationV2Send != null -> "Step{automationV2Send=$automationV2Send}"
                    automationSendList != null -> "Step{automationSendList=$automationSendList}"
                    automationUpdateProfile != null ->
                        "Step{automationUpdateProfile=$automationUpdateProfile}"
                    _json != null -> "Step{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Step")
                }

            companion object {

                @JvmStatic
                fun ofAutomationAddToDigest(automationAddToDigest: AutomationAddToDigestStep) =
                    Step(automationAddToDigest = automationAddToDigest)

                @JvmStatic
                fun ofAutomationAddToBatch(automationAddToBatch: AutomationAddToBatchStep) =
                    Step(automationAddToBatch = automationAddToBatch)

                @JvmStatic
                fun ofAutomationThrottle(automationThrottle: AutomationThrottleStep) =
                    Step(automationThrottle = automationThrottle)

                @JvmStatic
                fun ofAutomationCancel(automationCancel: AutomationCancelStep) =
                    Step(automationCancel = automationCancel)

                @JvmStatic
                fun ofAutomationDelay(automationDelay: AutomationDelayStep) =
                    Step(automationDelay = automationDelay)

                @JvmStatic
                fun ofAutomationFetchData(automationFetchData: AutomationFetchDataStep) =
                    Step(automationFetchData = automationFetchData)

                @JvmStatic
                fun ofAutomationInvoke(automationInvoke: AutomationInvokeStep) =
                    Step(automationInvoke = automationInvoke)

                @JvmStatic
                fun ofAutomationSend(automationSend: AutomationSendStep) =
                    Step(automationSend = automationSend)

                @JvmStatic
                fun ofAutomationV2Send(automationV2Send: AutomationV2SendStep) =
                    Step(automationV2Send = automationV2Send)

                @JvmStatic
                fun ofAutomationSendList(automationSendList: AutomationSendListStep) =
                    Step(automationSendList = automationSendList)

                @JvmStatic
                fun ofAutomationUpdateProfile(
                    automationUpdateProfile: AutomationUpdateProfileStep
                ) = Step(automationUpdateProfile = automationUpdateProfile)
            }

            /**
             * An interface that defines how to map each variant of [Step] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitAutomationAddToDigest(automationAddToDigest: AutomationAddToDigestStep): T

                fun visitAutomationAddToBatch(automationAddToBatch: AutomationAddToBatchStep): T

                fun visitAutomationThrottle(automationThrottle: AutomationThrottleStep): T

                fun visitAutomationCancel(automationCancel: AutomationCancelStep): T

                fun visitAutomationDelay(automationDelay: AutomationDelayStep): T

                fun visitAutomationFetchData(automationFetchData: AutomationFetchDataStep): T

                fun visitAutomationInvoke(automationInvoke: AutomationInvokeStep): T

                fun visitAutomationSend(automationSend: AutomationSendStep): T

                fun visitAutomationV2Send(automationV2Send: AutomationV2SendStep): T

                fun visitAutomationSendList(automationSendList: AutomationSendListStep): T

                fun visitAutomationUpdateProfile(
                    automationUpdateProfile: AutomationUpdateProfileStep
                ): T

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
                                tryDeserialize(node, jacksonTypeRef<AutomationAddToDigestStep>())
                                    ?.let { Step(automationAddToDigest = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationAddToBatchStep>())
                                    ?.let { Step(automationAddToBatch = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationThrottleStep>())
                                    ?.let { Step(automationThrottle = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationCancelStep>())?.let {
                                    Step(automationCancel = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationDelayStep>())?.let {
                                    Step(automationDelay = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationFetchDataStep>())
                                    ?.let { Step(automationFetchData = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationInvokeStep>())?.let {
                                    Step(automationInvoke = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationSendStep>())?.let {
                                    Step(automationSend = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationV2SendStep>())?.let {
                                    Step(automationV2Send = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<AutomationSendListStep>())
                                    ?.let { Step(automationSendList = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<AutomationUpdateProfileStep>())
                                    ?.let { Step(automationUpdateProfile = it, _json = json) },
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
                        value.automationAddToDigest != null ->
                            generator.writeObject(value.automationAddToDigest)
                        value.automationAddToBatch != null ->
                            generator.writeObject(value.automationAddToBatch)
                        value.automationThrottle != null ->
                            generator.writeObject(value.automationThrottle)
                        value.automationCancel != null ->
                            generator.writeObject(value.automationCancel)
                        value.automationDelay != null ->
                            generator.writeObject(value.automationDelay)
                        value.automationFetchData != null ->
                            generator.writeObject(value.automationFetchData)
                        value.automationInvoke != null ->
                            generator.writeObject(value.automationInvoke)
                        value.automationSend != null -> generator.writeObject(value.automationSend)
                        value.automationV2Send != null ->
                            generator.writeObject(value.automationV2Send)
                        value.automationSendList != null ->
                            generator.writeObject(value.automationSendList)
                        value.automationUpdateProfile != null ->
                            generator.writeObject(value.automationUpdateProfile)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Step")
                    }
                }
            }

            class AutomationAddToDigestStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val subscriptionTopicId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("subscription_topic_id")
                    @ExcludeMissing
                    subscriptionTopicId: JsonField<String> = JsonMissing.of(),
                ) : this(if_, ref, action, subscriptionTopicId, mutableMapOf())

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * The subscription topic that has digests enabled
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun subscriptionTopicId(): String =
                    subscriptionTopicId.getRequired("subscription_topic_id")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [subscriptionTopicId].
                 *
                 * Unlike [subscriptionTopicId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subscription_topic_id")
                @ExcludeMissing
                fun _subscriptionTopicId(): JsonField<String> = subscriptionTopicId

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
                     * [AutomationAddToDigestStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .subscriptionTopicId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationAddToDigestStep]. */
                class Builder internal constructor() {

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var subscriptionTopicId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationAddToDigestStep: AutomationAddToDigestStep) =
                        apply {
                            if_ = automationAddToDigestStep.if_
                            ref = automationAddToDigestStep.ref
                            action = automationAddToDigestStep.action
                            subscriptionTopicId = automationAddToDigestStep.subscriptionTopicId
                            additionalProperties =
                                automationAddToDigestStep.additionalProperties.toMutableMap()
                        }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /** The subscription topic that has digests enabled */
                    fun subscriptionTopicId(subscriptionTopicId: String) =
                        subscriptionTopicId(JsonField.of(subscriptionTopicId))

                    /**
                     * Sets [Builder.subscriptionTopicId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subscriptionTopicId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subscriptionTopicId(subscriptionTopicId: JsonField<String>) = apply {
                        this.subscriptionTopicId = subscriptionTopicId
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
                     * Returns an immutable instance of [AutomationAddToDigestStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .subscriptionTopicId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationAddToDigestStep =
                        AutomationAddToDigestStep(
                            if_,
                            ref,
                            checkRequired("action", action),
                            checkRequired("subscriptionTopicId", subscriptionTopicId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationAddToDigestStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
                    action().validate()
                    subscriptionTopicId()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (subscriptionTopicId.asKnown().isPresent) 1 else 0)

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

                        @JvmField val ADD_TO_DIGEST = of("add-to-digest")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        ADD_TO_DIGEST
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
                        ADD_TO_DIGEST,
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
                            ADD_TO_DIGEST -> Value.ADD_TO_DIGEST
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
                            ADD_TO_DIGEST -> Known.ADD_TO_DIGEST
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

                    return other is AutomationAddToDigestStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        subscriptionTopicId == other.subscriptionTopicId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(if_, ref, action, subscriptionTopicId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationAddToDigestStep{if_=$if_, ref=$ref, action=$action, subscriptionTopicId=$subscriptionTopicId, additionalProperties=$additionalProperties}"
            }

            class AutomationAddToBatchStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val maxWaitPeriod: JsonField<String>,
                private val retain: JsonField<Retain>,
                private val waitPeriod: JsonField<String>,
                private val batchId: JsonField<String>,
                private val batchKey: JsonField<String>,
                private val categoryKey: JsonField<String>,
                private val maxItems: JsonField<MaxItems>,
                private val scope: JsonField<Scope>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("max_wait_period")
                    @ExcludeMissing
                    maxWaitPeriod: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("retain")
                    @ExcludeMissing
                    retain: JsonField<Retain> = JsonMissing.of(),
                    @JsonProperty("wait_period")
                    @ExcludeMissing
                    waitPeriod: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("batch_id")
                    @ExcludeMissing
                    batchId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("batch_key")
                    @ExcludeMissing
                    batchKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("category_key")
                    @ExcludeMissing
                    categoryKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("max_items")
                    @ExcludeMissing
                    maxItems: JsonField<MaxItems> = JsonMissing.of(),
                    @JsonProperty("scope")
                    @ExcludeMissing
                    scope: JsonField<Scope> = JsonMissing.of(),
                ) : this(
                    if_,
                    ref,
                    action,
                    maxWaitPeriod,
                    retain,
                    waitPeriod,
                    batchId,
                    batchKey,
                    categoryKey,
                    maxItems,
                    scope,
                    mutableMapOf(),
                )

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * Defines the maximum wait time before the batch should be released. Must be less
                 * than wait period. Maximum of 60 days. Specified as an
                 * [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations)
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun maxWaitPeriod(): String = maxWaitPeriod.getRequired("max_wait_period")

                /**
                 * Defines what items should be retained and passed along to the next steps when the
                 * batch is released
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun retain(): Retain = retain.getRequired("retain")

                /**
                 * Defines the period of inactivity before the batch is released. Specified as an
                 * [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations)
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun waitPeriod(): String = waitPeriod.getRequired("wait_period")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun batchId(): Optional<String> = batchId.getOptional("batch_id")

                /**
                 * If using scope=dynamic, provide the key or a reference (e.g.,
                 * refs.data.batch_key)
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun batchKey(): Optional<String> = batchKey.getOptional("batch_key")

                /**
                 * Defines the field of the data object the batch is set to when complete. Defaults
                 * to `batch`
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun categoryKey(): Optional<String> = categoryKey.getOptional("category_key")

                /**
                 * If specified, the batch will release as soon as this number is reached
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxItems(): Optional<MaxItems> = maxItems.getOptional("max_items")

                /**
                 * Determine the scope of the batching. If user, chosen in this order: recipient,
                 * profile.user_id, data.user_id, data.userId. If dynamic, then specify where the
                 * batch_key or a reference to the batch_key
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun scope(): Optional<Scope> = scope.getOptional("scope")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [maxWaitPeriod].
                 *
                 * Unlike [maxWaitPeriod], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_wait_period")
                @ExcludeMissing
                fun _maxWaitPeriod(): JsonField<String> = maxWaitPeriod

                /**
                 * Returns the raw JSON value of [retain].
                 *
                 * Unlike [retain], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("retain") @ExcludeMissing fun _retain(): JsonField<Retain> = retain

                /**
                 * Returns the raw JSON value of [waitPeriod].
                 *
                 * Unlike [waitPeriod], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("wait_period")
                @ExcludeMissing
                fun _waitPeriod(): JsonField<String> = waitPeriod

                /**
                 * Returns the raw JSON value of [batchId].
                 *
                 * Unlike [batchId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("batch_id")
                @ExcludeMissing
                fun _batchId(): JsonField<String> = batchId

                /**
                 * Returns the raw JSON value of [batchKey].
                 *
                 * Unlike [batchKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("batch_key")
                @ExcludeMissing
                fun _batchKey(): JsonField<String> = batchKey

                /**
                 * Returns the raw JSON value of [categoryKey].
                 *
                 * Unlike [categoryKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("category_key")
                @ExcludeMissing
                fun _categoryKey(): JsonField<String> = categoryKey

                /**
                 * Returns the raw JSON value of [maxItems].
                 *
                 * Unlike [maxItems], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("max_items")
                @ExcludeMissing
                fun _maxItems(): JsonField<MaxItems> = maxItems

                /**
                 * Returns the raw JSON value of [scope].
                 *
                 * Unlike [scope], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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
                     * [AutomationAddToBatchStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .maxWaitPeriod()
                     * .retain()
                     * .waitPeriod()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationAddToBatchStep]. */
                class Builder internal constructor() {

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var maxWaitPeriod: JsonField<String>? = null
                    private var retain: JsonField<Retain>? = null
                    private var waitPeriod: JsonField<String>? = null
                    private var batchId: JsonField<String> = JsonMissing.of()
                    private var batchKey: JsonField<String> = JsonMissing.of()
                    private var categoryKey: JsonField<String> = JsonMissing.of()
                    private var maxItems: JsonField<MaxItems> = JsonMissing.of()
                    private var scope: JsonField<Scope> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationAddToBatchStep: AutomationAddToBatchStep) = apply {
                        if_ = automationAddToBatchStep.if_
                        ref = automationAddToBatchStep.ref
                        action = automationAddToBatchStep.action
                        maxWaitPeriod = automationAddToBatchStep.maxWaitPeriod
                        retain = automationAddToBatchStep.retain
                        waitPeriod = automationAddToBatchStep.waitPeriod
                        batchId = automationAddToBatchStep.batchId
                        batchKey = automationAddToBatchStep.batchKey
                        categoryKey = automationAddToBatchStep.categoryKey
                        maxItems = automationAddToBatchStep.maxItems
                        scope = automationAddToBatchStep.scope
                        additionalProperties =
                            automationAddToBatchStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /**
                     * Defines the maximum wait time before the batch should be released. Must be
                     * less than wait period. Maximum of 60 days. Specified as an
                     * [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations)
                     */
                    fun maxWaitPeriod(maxWaitPeriod: String) =
                        maxWaitPeriod(JsonField.of(maxWaitPeriod))

                    /**
                     * Sets [Builder.maxWaitPeriod] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxWaitPeriod] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxWaitPeriod(maxWaitPeriod: JsonField<String>) = apply {
                        this.maxWaitPeriod = maxWaitPeriod
                    }

                    /**
                     * Defines what items should be retained and passed along to the next steps when
                     * the batch is released
                     */
                    fun retain(retain: Retain) = retain(JsonField.of(retain))

                    /**
                     * Sets [Builder.retain] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retain] with a well-typed [Retain] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun retain(retain: JsonField<Retain>) = apply { this.retain = retain }

                    /**
                     * Defines the period of inactivity before the batch is released. Specified as
                     * an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations)
                     */
                    fun waitPeriod(waitPeriod: String) = waitPeriod(JsonField.of(waitPeriod))

                    /**
                     * Sets [Builder.waitPeriod] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.waitPeriod] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun waitPeriod(waitPeriod: JsonField<String>) = apply {
                        this.waitPeriod = waitPeriod
                    }

                    fun batchId(batchId: String?) = batchId(JsonField.ofNullable(batchId))

                    /** Alias for calling [Builder.batchId] with `batchId.orElse(null)`. */
                    fun batchId(batchId: Optional<String>) = batchId(batchId.getOrNull())

                    /**
                     * Sets [Builder.batchId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.batchId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun batchId(batchId: JsonField<String>) = apply { this.batchId = batchId }

                    /**
                     * If using scope=dynamic, provide the key or a reference (e.g.,
                     * refs.data.batch_key)
                     */
                    fun batchKey(batchKey: String?) = batchKey(JsonField.ofNullable(batchKey))

                    /** Alias for calling [Builder.batchKey] with `batchKey.orElse(null)`. */
                    fun batchKey(batchKey: Optional<String>) = batchKey(batchKey.getOrNull())

                    /**
                     * Sets [Builder.batchKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.batchKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun batchKey(batchKey: JsonField<String>) = apply { this.batchKey = batchKey }

                    /**
                     * Defines the field of the data object the batch is set to when complete.
                     * Defaults to `batch`
                     */
                    fun categoryKey(categoryKey: String?) =
                        categoryKey(JsonField.ofNullable(categoryKey))

                    /** Alias for calling [Builder.categoryKey] with `categoryKey.orElse(null)`. */
                    fun categoryKey(categoryKey: Optional<String>) =
                        categoryKey(categoryKey.getOrNull())

                    /**
                     * Sets [Builder.categoryKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.categoryKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun categoryKey(categoryKey: JsonField<String>) = apply {
                        this.categoryKey = categoryKey
                    }

                    /** If specified, the batch will release as soon as this number is reached */
                    fun maxItems(maxItems: MaxItems?) = maxItems(JsonField.ofNullable(maxItems))

                    /** Alias for calling [Builder.maxItems] with `maxItems.orElse(null)`. */
                    fun maxItems(maxItems: Optional<MaxItems>) = maxItems(maxItems.getOrNull())

                    /**
                     * Sets [Builder.maxItems] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxItems] with a well-typed [MaxItems] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxItems(maxItems: JsonField<MaxItems>) = apply { this.maxItems = maxItems }

                    /** Alias for calling [maxItems] with `MaxItems.ofString(string)`. */
                    fun maxItems(string: String) = maxItems(MaxItems.ofString(string))

                    /** Alias for calling [maxItems] with `MaxItems.ofInteger(integer)`. */
                    fun maxItems(integer: Long) = maxItems(MaxItems.ofInteger(integer))

                    /**
                     * Determine the scope of the batching. If user, chosen in this order:
                     * recipient, profile.user_id, data.user_id, data.userId. If dynamic, then
                     * specify where the batch_key or a reference to the batch_key
                     */
                    fun scope(scope: Scope?) = scope(JsonField.ofNullable(scope))

                    /** Alias for calling [Builder.scope] with `scope.orElse(null)`. */
                    fun scope(scope: Optional<Scope>) = scope(scope.getOrNull())

                    /**
                     * Sets [Builder.scope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scope] with a well-typed [Scope] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

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
                     * Returns an immutable instance of [AutomationAddToBatchStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .maxWaitPeriod()
                     * .retain()
                     * .waitPeriod()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationAddToBatchStep =
                        AutomationAddToBatchStep(
                            if_,
                            ref,
                            checkRequired("action", action),
                            checkRequired("maxWaitPeriod", maxWaitPeriod),
                            checkRequired("retain", retain),
                            checkRequired("waitPeriod", waitPeriod),
                            batchId,
                            batchKey,
                            categoryKey,
                            maxItems,
                            scope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationAddToBatchStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
                    action().validate()
                    maxWaitPeriod()
                    retain().validate()
                    waitPeriod()
                    batchId()
                    batchKey()
                    categoryKey()
                    maxItems().ifPresent { it.validate() }
                    scope().ifPresent { it.validate() }
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (maxWaitPeriod.asKnown().isPresent) 1 else 0) +
                        (retain.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (waitPeriod.asKnown().isPresent) 1 else 0) +
                        (if (batchId.asKnown().isPresent) 1 else 0) +
                        (if (batchKey.asKnown().isPresent) 1 else 0) +
                        (if (categoryKey.asKnown().isPresent) 1 else 0) +
                        (maxItems.asKnown().getOrNull()?.validity() ?: 0) +
                        (scope.asKnown().getOrNull()?.validity() ?: 0)

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

                        @JvmField val ADD_TO_BATCH = of("add-to-batch")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        ADD_TO_BATCH
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
                        ADD_TO_BATCH,
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
                            ADD_TO_BATCH -> Value.ADD_TO_BATCH
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
                            ADD_TO_BATCH -> Known.ADD_TO_BATCH
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

                /**
                 * Defines what items should be retained and passed along to the next steps when the
                 * batch is released
                 */
                class Retain
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val count: JsonField<Long>,
                    private val type: JsonField<Type>,
                    private val sortKey: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("count")
                        @ExcludeMissing
                        count: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("sort_key")
                        @ExcludeMissing
                        sortKey: JsonField<String> = JsonMissing.of(),
                    ) : this(count, type, sortKey, mutableMapOf())

                    /**
                     * The number of records to keep in batch. Default is 10 and only configurable
                     * by requesting from support. When configurable minimum is 2 and maximum
                     * is 100.
                     *
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun count(): Long = count.getRequired("count")

                    /**
                     * Keep N number of notifications based on the type. First/Last N based on
                     * notification received. highest/lowest based on a scoring key providing in the
                     * data accessed by sort_key
                     *
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Defines the data value data[sort_key] that is used to sort the stored items.
                     * Required when type is set to highest or lowest.
                     *
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun sortKey(): Optional<String> = sortKey.getOptional("sort_key")

                    /**
                     * Returns the raw JSON value of [count].
                     *
                     * Unlike [count], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [sortKey].
                     *
                     * Unlike [sortKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("sort_key")
                    @ExcludeMissing
                    fun _sortKey(): JsonField<String> = sortKey

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
                         * Returns a mutable builder for constructing an instance of [Retain].
                         *
                         * The following fields are required:
                         * ```java
                         * .count()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Retain]. */
                    class Builder internal constructor() {

                        private var count: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var sortKey: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(retain: Retain) = apply {
                            count = retain.count
                            type = retain.type
                            sortKey = retain.sortKey
                            additionalProperties = retain.additionalProperties.toMutableMap()
                        }

                        /**
                         * The number of records to keep in batch. Default is 10 and only
                         * configurable by requesting from support. When configurable minimum is 2
                         * and maximum is 100.
                         */
                        fun count(count: Long) = count(JsonField.of(count))

                        /**
                         * Sets [Builder.count] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.count] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun count(count: JsonField<Long>) = apply { this.count = count }

                        /**
                         * Keep N number of notifications based on the type. First/Last N based on
                         * notification received. highest/lowest based on a scoring key providing in
                         * the data accessed by sort_key
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        /**
                         * Defines the data value data[sort_key] that is used to sort the stored
                         * items. Required when type is set to highest or lowest.
                         */
                        fun sortKey(sortKey: String?) = sortKey(JsonField.ofNullable(sortKey))

                        /** Alias for calling [Builder.sortKey] with `sortKey.orElse(null)`. */
                        fun sortKey(sortKey: Optional<String>) = sortKey(sortKey.getOrNull())

                        /**
                         * Sets [Builder.sortKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.sortKey] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun sortKey(sortKey: JsonField<String>) = apply { this.sortKey = sortKey }

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
                         * Returns an immutable instance of [Retain].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .count()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Retain =
                            Retain(
                                checkRequired("count", count),
                                checkRequired("type", type),
                                sortKey,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Retain = apply {
                        if (validated) {
                            return@apply
                        }

                        count()
                        type().validate()
                        sortKey()
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
                        (if (count.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (sortKey.asKnown().isPresent) 1 else 0)

                    /**
                     * Keep N number of notifications based on the type. First/Last N based on
                     * notification received. highest/lowest based on a scoring key providing in the
                     * data accessed by sort_key
                     */
                    class Type
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

                            @JvmField val FIRST = of("first")

                            @JvmField val LAST = of("last")

                            @JvmField val HIGHEST = of("highest")

                            @JvmField val LOWEST = of("lowest")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            FIRST,
                            LAST,
                            HIGHEST,
                            LOWEST,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FIRST,
                            LAST,
                            HIGHEST,
                            LOWEST,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
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
                                FIRST -> Value.FIRST
                                LAST -> Value.LAST
                                HIGHEST -> Value.HIGHEST
                                LOWEST -> Value.LOWEST
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
                                FIRST -> Known.FIRST
                                LAST -> Known.LAST
                                HIGHEST -> Known.HIGHEST
                                LOWEST -> Known.LOWEST
                                else -> throw CourierInvalidDataException("Unknown Type: $value")
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

                        fun validate(): Type = apply {
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

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Retain &&
                            count == other.count &&
                            type == other.type &&
                            sortKey == other.sortKey &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(count, type, sortKey, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Retain{count=$count, type=$type, sortKey=$sortKey, additionalProperties=$additionalProperties}"
                }

                /** If specified, the batch will release as soon as this number is reached */
                @JsonDeserialize(using = MaxItems.Deserializer::class)
                @JsonSerialize(using = MaxItems.Serializer::class)
                class MaxItems
                private constructor(
                    private val string: String? = null,
                    private val integer: Long? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun integer(): Optional<Long> = Optional.ofNullable(integer)

                    fun isString(): Boolean = string != null

                    fun isInteger(): Boolean = integer != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asInteger(): Long = integer.getOrThrow("integer")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            integer != null -> visitor.visitInteger(integer)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): MaxItems = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitInteger(integer: Long) {}
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
                                override fun visitString(string: String) = 1

                                override fun visitInteger(integer: Long) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MaxItems &&
                            string == other.string &&
                            integer == other.integer
                    }

                    override fun hashCode(): Int = Objects.hash(string, integer)

                    override fun toString(): String =
                        when {
                            string != null -> "MaxItems{string=$string}"
                            integer != null -> "MaxItems{integer=$integer}"
                            _json != null -> "MaxItems{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid MaxItems")
                        }

                    companion object {

                        @JvmStatic fun ofString(string: String) = MaxItems(string = string)

                        @JvmStatic fun ofInteger(integer: Long) = MaxItems(integer = integer)
                    }

                    /**
                     * An interface that defines how to map each variant of [MaxItems] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitInteger(integer: Long): T

                        /**
                         * Maps an unknown variant of [MaxItems] to a value of type [T].
                         *
                         * An instance of [MaxItems] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws CourierInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw CourierInvalidDataException("Unknown MaxItems: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<MaxItems>(MaxItems::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): MaxItems {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            MaxItems(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                            MaxItems(integer = it, _json = json)
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> MaxItems(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<MaxItems>(MaxItems::class) {

                        override fun serialize(
                            value: MaxItems,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.integer != null -> generator.writeObject(value.integer)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid MaxItems")
                            }
                        }
                    }
                }

                /**
                 * Determine the scope of the batching. If user, chosen in this order: recipient,
                 * profile.user_id, data.user_id, data.userId. If dynamic, then specify where the
                 * batch_key or a reference to the batch_key
                 */
                class Scope @JsonCreator private constructor(private val value: JsonField<String>) :
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

                        @JvmField val USER = of("user")

                        @JvmField val GLOBAL = of("global")

                        @JvmField val DYNAMIC = of("dynamic")

                        @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
                    }

                    /** An enum containing [Scope]'s known values. */
                    enum class Known {
                        USER,
                        GLOBAL,
                        DYNAMIC,
                    }

                    /**
                     * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Scope] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USER,
                        GLOBAL,
                        DYNAMIC,
                        /**
                         * An enum member indicating that [Scope] was instantiated with an unknown
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
                            USER -> Value.USER
                            GLOBAL -> Value.GLOBAL
                            DYNAMIC -> Value.DYNAMIC
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
                            USER -> Known.USER
                            GLOBAL -> Known.GLOBAL
                            DYNAMIC -> Known.DYNAMIC
                            else -> throw CourierInvalidDataException("Unknown Scope: $value")
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

                    fun validate(): Scope = apply {
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

                        return other is Scope && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationAddToBatchStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        maxWaitPeriod == other.maxWaitPeriod &&
                        retain == other.retain &&
                        waitPeriod == other.waitPeriod &&
                        batchId == other.batchId &&
                        batchKey == other.batchKey &&
                        categoryKey == other.categoryKey &&
                        maxItems == other.maxItems &&
                        scope == other.scope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        if_,
                        ref,
                        action,
                        maxWaitPeriod,
                        retain,
                        waitPeriod,
                        batchId,
                        batchKey,
                        categoryKey,
                        maxItems,
                        scope,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationAddToBatchStep{if_=$if_, ref=$ref, action=$action, maxWaitPeriod=$maxWaitPeriod, retain=$retain, waitPeriod=$waitPeriod, batchId=$batchId, batchKey=$batchKey, categoryKey=$categoryKey, maxItems=$maxItems, scope=$scope, additionalProperties=$additionalProperties}"
            }

            class AutomationThrottleStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val maxAllowed: JsonField<Long>,
                private val onThrottle: JsonField<OnThrottle>,
                private val period: JsonField<String>,
                private val scope: JsonField<Scope>,
                private val shouldAlert: JsonField<Boolean>,
                private val throttleKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("max_allowed")
                    @ExcludeMissing
                    maxAllowed: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("on_throttle")
                    @ExcludeMissing
                    onThrottle: JsonField<OnThrottle> = JsonMissing.of(),
                    @JsonProperty("period")
                    @ExcludeMissing
                    period: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("scope")
                    @ExcludeMissing
                    scope: JsonField<Scope> = JsonMissing.of(),
                    @JsonProperty("should_alert")
                    @ExcludeMissing
                    shouldAlert: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("throttle_key")
                    @ExcludeMissing
                    throttleKey: JsonField<String> = JsonMissing.of(),
                ) : this(
                    if_,
                    ref,
                    action,
                    maxAllowed,
                    onThrottle,
                    period,
                    scope,
                    shouldAlert,
                    throttleKey,
                    mutableMapOf(),
                )

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * Maximum number of allowed notifications in that timeframe
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun maxAllowed(): Long = maxAllowed.getRequired("max_allowed")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun onThrottle(): OnThrottle = onThrottle.getRequired("on_throttle")

                /**
                 * Defines the throttle period which corresponds to the max_allowed. Specified as an
                 * ISO 8601 duration, https://en.wikipedia.org/wiki/ISO_8601#Durations
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun period(): String = period.getRequired("period")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun scope(): Scope = scope.getRequired("scope")

                /**
                 * Value must be true
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun shouldAlert(): Boolean = shouldAlert.getRequired("should_alert")

                /**
                 * If using scope=dynamic, provide the reference (e.g., refs.data.throttle_key) to
                 * the how the throttle should be identified
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun throttleKey(): Optional<String> = throttleKey.getOptional("throttle_key")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [maxAllowed].
                 *
                 * Unlike [maxAllowed], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_allowed")
                @ExcludeMissing
                fun _maxAllowed(): JsonField<Long> = maxAllowed

                /**
                 * Returns the raw JSON value of [onThrottle].
                 *
                 * Unlike [onThrottle], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_throttle")
                @ExcludeMissing
                fun _onThrottle(): JsonField<OnThrottle> = onThrottle

                /**
                 * Returns the raw JSON value of [period].
                 *
                 * Unlike [period], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<String> = period

                /**
                 * Returns the raw JSON value of [scope].
                 *
                 * Unlike [scope], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

                /**
                 * Returns the raw JSON value of [shouldAlert].
                 *
                 * Unlike [shouldAlert], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("should_alert")
                @ExcludeMissing
                fun _shouldAlert(): JsonField<Boolean> = shouldAlert

                /**
                 * Returns the raw JSON value of [throttleKey].
                 *
                 * Unlike [throttleKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("throttle_key")
                @ExcludeMissing
                fun _throttleKey(): JsonField<String> = throttleKey

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
                     * [AutomationThrottleStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .maxAllowed()
                     * .onThrottle()
                     * .period()
                     * .scope()
                     * .shouldAlert()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationThrottleStep]. */
                class Builder internal constructor() {

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var maxAllowed: JsonField<Long>? = null
                    private var onThrottle: JsonField<OnThrottle>? = null
                    private var period: JsonField<String>? = null
                    private var scope: JsonField<Scope>? = null
                    private var shouldAlert: JsonField<Boolean>? = null
                    private var throttleKey: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationThrottleStep: AutomationThrottleStep) = apply {
                        if_ = automationThrottleStep.if_
                        ref = automationThrottleStep.ref
                        action = automationThrottleStep.action
                        maxAllowed = automationThrottleStep.maxAllowed
                        onThrottle = automationThrottleStep.onThrottle
                        period = automationThrottleStep.period
                        scope = automationThrottleStep.scope
                        shouldAlert = automationThrottleStep.shouldAlert
                        throttleKey = automationThrottleStep.throttleKey
                        additionalProperties =
                            automationThrottleStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /** Maximum number of allowed notifications in that timeframe */
                    fun maxAllowed(maxAllowed: Long) = maxAllowed(JsonField.of(maxAllowed))

                    /**
                     * Sets [Builder.maxAllowed] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxAllowed] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxAllowed(maxAllowed: JsonField<Long>) = apply {
                        this.maxAllowed = maxAllowed
                    }

                    fun onThrottle(onThrottle: OnThrottle) = onThrottle(JsonField.of(onThrottle))

                    /**
                     * Sets [Builder.onThrottle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onThrottle] with a well-typed [OnThrottle]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onThrottle(onThrottle: JsonField<OnThrottle>) = apply {
                        this.onThrottle = onThrottle
                    }

                    /**
                     * Defines the throttle period which corresponds to the max_allowed. Specified
                     * as an ISO 8601 duration, https://en.wikipedia.org/wiki/ISO_8601#Durations
                     */
                    fun period(period: String) = period(JsonField.of(period))

                    /**
                     * Sets [Builder.period] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.period] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun period(period: JsonField<String>) = apply { this.period = period }

                    fun scope(scope: Scope) = scope(JsonField.of(scope))

                    /**
                     * Sets [Builder.scope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scope] with a well-typed [Scope] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

                    /** Value must be true */
                    fun shouldAlert(shouldAlert: Boolean) = shouldAlert(JsonField.of(shouldAlert))

                    /**
                     * Sets [Builder.shouldAlert] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.shouldAlert] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun shouldAlert(shouldAlert: JsonField<Boolean>) = apply {
                        this.shouldAlert = shouldAlert
                    }

                    /**
                     * If using scope=dynamic, provide the reference (e.g., refs.data.throttle_key)
                     * to the how the throttle should be identified
                     */
                    fun throttleKey(throttleKey: String?) =
                        throttleKey(JsonField.ofNullable(throttleKey))

                    /** Alias for calling [Builder.throttleKey] with `throttleKey.orElse(null)`. */
                    fun throttleKey(throttleKey: Optional<String>) =
                        throttleKey(throttleKey.getOrNull())

                    /**
                     * Sets [Builder.throttleKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.throttleKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun throttleKey(throttleKey: JsonField<String>) = apply {
                        this.throttleKey = throttleKey
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
                     * Returns an immutable instance of [AutomationThrottleStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .maxAllowed()
                     * .onThrottle()
                     * .period()
                     * .scope()
                     * .shouldAlert()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationThrottleStep =
                        AutomationThrottleStep(
                            if_,
                            ref,
                            checkRequired("action", action),
                            checkRequired("maxAllowed", maxAllowed),
                            checkRequired("onThrottle", onThrottle),
                            checkRequired("period", period),
                            checkRequired("scope", scope),
                            checkRequired("shouldAlert", shouldAlert),
                            throttleKey,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationThrottleStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
                    action().validate()
                    maxAllowed()
                    onThrottle().validate()
                    period()
                    scope().validate()
                    shouldAlert()
                    throttleKey()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (maxAllowed.asKnown().isPresent) 1 else 0) +
                        (onThrottle.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (period.asKnown().isPresent) 1 else 0) +
                        (scope.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (shouldAlert.asKnown().isPresent) 1 else 0) +
                        (if (throttleKey.asKnown().isPresent) 1 else 0)

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

                        @JvmField val THROTTLE = of("throttle")

                        @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                    }

                    /** An enum containing [Action]'s known values. */
                    enum class Known {
                        THROTTLE
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
                        THROTTLE,
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
                            THROTTLE -> Value.THROTTLE
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
                            THROTTLE -> Known.THROTTLE
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

                class OnThrottle
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val nodeId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("\$node_id")
                        @ExcludeMissing
                        nodeId: JsonField<String> = JsonMissing.of()
                    ) : this(nodeId, mutableMapOf())

                    /**
                     * The node to go to if the request is throttled
                     *
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun nodeId(): String = nodeId.getRequired("\$node_id")

                    /**
                     * Returns the raw JSON value of [nodeId].
                     *
                     * Unlike [nodeId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("\$node_id")
                    @ExcludeMissing
                    fun _nodeId(): JsonField<String> = nodeId

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
                         * Returns a mutable builder for constructing an instance of [OnThrottle].
                         *
                         * The following fields are required:
                         * ```java
                         * .nodeId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [OnThrottle]. */
                    class Builder internal constructor() {

                        private var nodeId: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(onThrottle: OnThrottle) = apply {
                            nodeId = onThrottle.nodeId
                            additionalProperties = onThrottle.additionalProperties.toMutableMap()
                        }

                        /** The node to go to if the request is throttled */
                        fun nodeId(nodeId: String) = nodeId(JsonField.of(nodeId))

                        /**
                         * Sets [Builder.nodeId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.nodeId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun nodeId(nodeId: JsonField<String>) = apply { this.nodeId = nodeId }

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
                         * Returns an immutable instance of [OnThrottle].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .nodeId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): OnThrottle =
                            OnThrottle(
                                checkRequired("nodeId", nodeId),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): OnThrottle = apply {
                        if (validated) {
                            return@apply
                        }

                        nodeId()
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
                    internal fun validity(): Int = (if (nodeId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is OnThrottle &&
                            nodeId == other.nodeId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(nodeId, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "OnThrottle{nodeId=$nodeId, additionalProperties=$additionalProperties}"
                }

                class Scope @JsonCreator private constructor(private val value: JsonField<String>) :
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

                        @JvmField val USER = of("user")

                        @JvmField val GLOBAL = of("global")

                        @JvmField val DYNAMIC = of("dynamic")

                        @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
                    }

                    /** An enum containing [Scope]'s known values. */
                    enum class Known {
                        USER,
                        GLOBAL,
                        DYNAMIC,
                    }

                    /**
                     * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Scope] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USER,
                        GLOBAL,
                        DYNAMIC,
                        /**
                         * An enum member indicating that [Scope] was instantiated with an unknown
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
                            USER -> Value.USER
                            GLOBAL -> Value.GLOBAL
                            DYNAMIC -> Value.DYNAMIC
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
                            USER -> Known.USER
                            GLOBAL -> Known.GLOBAL
                            DYNAMIC -> Known.DYNAMIC
                            else -> throw CourierInvalidDataException("Unknown Scope: $value")
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

                    fun validate(): Scope = apply {
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

                        return other is Scope && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationThrottleStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        maxAllowed == other.maxAllowed &&
                        onThrottle == other.onThrottle &&
                        period == other.period &&
                        scope == other.scope &&
                        shouldAlert == other.shouldAlert &&
                        throttleKey == other.throttleKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        if_,
                        ref,
                        action,
                        maxAllowed,
                        onThrottle,
                        period,
                        scope,
                        shouldAlert,
                        throttleKey,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationThrottleStep{if_=$if_, ref=$ref, action=$action, maxAllowed=$maxAllowed, onThrottle=$onThrottle, period=$period, scope=$scope, shouldAlert=$shouldAlert, throttleKey=$throttleKey, additionalProperties=$additionalProperties}"
            }

            class AutomationCancelStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val cancelationToken: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("cancelation_token")
                    @ExcludeMissing
                    cancelationToken: JsonField<String> = JsonMissing.of(),
                ) : this(if_, ref, action, cancelationToken, mutableMapOf())

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

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
                fun cancelationToken(): Optional<String> =
                    cancelationToken.getOptional("cancelation_token")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationCancelStep]. */
                class Builder internal constructor() {

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var cancelationToken: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationCancelStep: AutomationCancelStep) = apply {
                        if_ = automationCancelStep.if_
                        ref = automationCancelStep.ref
                        action = automationCancelStep.action
                        cancelationToken = automationCancelStep.cancelationToken
                        additionalProperties =
                            automationCancelStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun cancelationToken(cancelationToken: String?) =
                        cancelationToken(JsonField.ofNullable(cancelationToken))

                    /**
                     * Alias for calling [Builder.cancelationToken] with
                     * `cancelationToken.orElse(null)`.
                     */
                    fun cancelationToken(cancelationToken: Optional<String>) =
                        cancelationToken(cancelationToken.getOrNull())

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
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationCancelStep =
                        AutomationCancelStep(
                            if_,
                            ref,
                            checkRequired("action", action),
                            cancelationToken,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationCancelStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
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
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        cancelationToken == other.cancelationToken &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(if_, ref, action, cancelationToken, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationCancelStep{if_=$if_, ref=$ref, action=$action, cancelationToken=$cancelationToken, additionalProperties=$additionalProperties}"
            }

            class AutomationDelayStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val duration: JsonField<String>,
                private val until: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("until")
                    @ExcludeMissing
                    until: JsonField<String> = JsonMissing.of(),
                ) : this(if_, ref, action, duration, until, mutableMapOf())

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * The [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations) string
                 * for how long to delay for
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<String> = duration.getOptional("duration")

                /**
                 * The ISO 8601 timestamp for when the delay should end
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun until(): Optional<String> = until.getOptional("until")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var duration: JsonField<String> = JsonMissing.of()
                    private var until: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationDelayStep: AutomationDelayStep) = apply {
                        if_ = automationDelayStep.if_
                        ref = automationDelayStep.ref
                        action = automationDelayStep.action
                        duration = automationDelayStep.duration
                        until = automationDelayStep.until
                        additionalProperties =
                            automationDelayStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /**
                     * The [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations)
                     * string for how long to delay for
                     */
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

                    /** The ISO 8601 timestamp for when the delay should end */
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
                            if_,
                            ref,
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

                    if_()
                    ref()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
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
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        duration == other.duration &&
                        until == other.until &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(if_, ref, action, duration, until, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationDelayStep{if_=$if_, ref=$ref, action=$action, duration=$duration, until=$until, additionalProperties=$additionalProperties}"
            }

            class AutomationFetchDataStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val mergeStrategy: JsonField<MergeAlgorithm>,
                private val webhook: JsonField<Webhook>,
                private val idempotencyExpiry: JsonField<String>,
                private val idempotencyKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("merge_strategy")
                    @ExcludeMissing
                    mergeStrategy: JsonField<MergeAlgorithm> = JsonMissing.of(),
                    @JsonProperty("webhook")
                    @ExcludeMissing
                    webhook: JsonField<Webhook> = JsonMissing.of(),
                    @JsonProperty("idempotency_expiry")
                    @ExcludeMissing
                    idempotencyExpiry: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("idempotency_key")
                    @ExcludeMissing
                    idempotencyKey: JsonField<String> = JsonMissing.of(),
                ) : this(
                    if_,
                    ref,
                    action,
                    mergeStrategy,
                    webhook,
                    idempotencyExpiry,
                    idempotencyKey,
                    mutableMapOf(),
                )

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

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
                fun mergeStrategy(): MergeAlgorithm = mergeStrategy.getRequired("merge_strategy")

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
                fun idempotencyExpiry(): Optional<String> =
                    idempotencyExpiry.getOptional("idempotency_expiry")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun idempotencyKey(): Optional<String> =
                    idempotencyKey.getOptional("idempotency_key")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [mergeStrategy].
                 *
                 * Unlike [mergeStrategy], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("merge_strategy")
                @ExcludeMissing
                fun _mergeStrategy(): JsonField<MergeAlgorithm> = mergeStrategy

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
                 * Returns the raw JSON value of [idempotencyExpiry].
                 *
                 * Unlike [idempotencyExpiry], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("idempotency_expiry")
                @ExcludeMissing
                fun _idempotencyExpiry(): JsonField<String> = idempotencyExpiry

                /**
                 * Returns the raw JSON value of [idempotencyKey].
                 *
                 * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("idempotency_key")
                @ExcludeMissing
                fun _idempotencyKey(): JsonField<String> = idempotencyKey

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
                     * .mergeStrategy()
                     * .webhook()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationFetchDataStep]. */
                class Builder internal constructor() {

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var mergeStrategy: JsonField<MergeAlgorithm>? = null
                    private var webhook: JsonField<Webhook>? = null
                    private var idempotencyExpiry: JsonField<String> = JsonMissing.of()
                    private var idempotencyKey: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationFetchDataStep: AutomationFetchDataStep) = apply {
                        if_ = automationFetchDataStep.if_
                        ref = automationFetchDataStep.ref
                        action = automationFetchDataStep.action
                        mergeStrategy = automationFetchDataStep.mergeStrategy
                        webhook = automationFetchDataStep.webhook
                        idempotencyExpiry = automationFetchDataStep.idempotencyExpiry
                        idempotencyKey = automationFetchDataStep.idempotencyKey
                        additionalProperties =
                            automationFetchDataStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    fun mergeStrategy(mergeStrategy: MergeAlgorithm) =
                        mergeStrategy(JsonField.of(mergeStrategy))

                    /**
                     * Sets [Builder.mergeStrategy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mergeStrategy] with a well-typed
                     * [MergeAlgorithm] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun mergeStrategy(mergeStrategy: JsonField<MergeAlgorithm>) = apply {
                        this.mergeStrategy = mergeStrategy
                    }

                    fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

                    /**
                     * Sets [Builder.webhook] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.webhook] with a well-typed [Webhook] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

                    fun idempotencyExpiry(idempotencyExpiry: String?) =
                        idempotencyExpiry(JsonField.ofNullable(idempotencyExpiry))

                    /**
                     * Alias for calling [Builder.idempotencyExpiry] with
                     * `idempotencyExpiry.orElse(null)`.
                     */
                    fun idempotencyExpiry(idempotencyExpiry: Optional<String>) =
                        idempotencyExpiry(idempotencyExpiry.getOrNull())

                    /**
                     * Sets [Builder.idempotencyExpiry] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.idempotencyExpiry] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun idempotencyExpiry(idempotencyExpiry: JsonField<String>) = apply {
                        this.idempotencyExpiry = idempotencyExpiry
                    }

                    fun idempotencyKey(idempotencyKey: String?) =
                        idempotencyKey(JsonField.ofNullable(idempotencyKey))

                    /**
                     * Alias for calling [Builder.idempotencyKey] with
                     * `idempotencyKey.orElse(null)`.
                     */
                    fun idempotencyKey(idempotencyKey: Optional<String>) =
                        idempotencyKey(idempotencyKey.getOrNull())

                    /**
                     * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.idempotencyKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                        this.idempotencyKey = idempotencyKey
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
                     * .mergeStrategy()
                     * .webhook()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationFetchDataStep =
                        AutomationFetchDataStep(
                            if_,
                            ref,
                            checkRequired("action", action),
                            checkRequired("mergeStrategy", mergeStrategy),
                            checkRequired("webhook", webhook),
                            idempotencyExpiry,
                            idempotencyKey,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationFetchDataStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
                    action().validate()
                    mergeStrategy().validate()
                    webhook().validate()
                    idempotencyExpiry()
                    idempotencyKey()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (mergeStrategy.asKnown().getOrNull()?.validity() ?: 0) +
                        (webhook.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (idempotencyExpiry.asKnown().isPresent) 1 else 0) +
                        (if (idempotencyKey.asKnown().isPresent) 1 else 0)

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
                    private val body: JsonField<Body>,
                    private val headers: JsonField<Headers>,
                    private val params: JsonField<Params>,
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
                        body: JsonField<Body> = JsonMissing.of(),
                        @JsonProperty("headers")
                        @ExcludeMissing
                        headers: JsonField<Headers> = JsonMissing.of(),
                        @JsonProperty("params")
                        @ExcludeMissing
                        params: JsonField<Params> = JsonMissing.of(),
                    ) : this(method, url, body, headers, params, mutableMapOf())

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
                    fun body(): Optional<Body> = body.getOptional("body")

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun headers(): Optional<Headers> = headers.getOptional("headers")

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun params(): Optional<Params> = params.getOptional("params")

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
                    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

                    /**
                     * Returns the raw JSON value of [headers].
                     *
                     * Unlike [headers], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("headers")
                    @ExcludeMissing
                    fun _headers(): JsonField<Headers> = headers

                    /**
                     * Returns the raw JSON value of [params].
                     *
                     * Unlike [params], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("params")
                    @ExcludeMissing
                    fun _params(): JsonField<Params> = params

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
                        private var body: JsonField<Body> = JsonMissing.of()
                        private var headers: JsonField<Headers> = JsonMissing.of()
                        private var params: JsonField<Params> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(webhook: Webhook) = apply {
                            method = webhook.method
                            url = webhook.url
                            body = webhook.body
                            headers = webhook.headers
                            params = webhook.params
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

                        fun body(body: Body?) = body(JsonField.ofNullable(body))

                        /** Alias for calling [Builder.body] with `body.orElse(null)`. */
                        fun body(body: Optional<Body>) = body(body.getOrNull())

                        /**
                         * Sets [Builder.body] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.body] with a well-typed [Body] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun body(body: JsonField<Body>) = apply { this.body = body }

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

                        fun params(params: Params?) = params(JsonField.ofNullable(params))

                        /** Alias for calling [Builder.params] with `params.orElse(null)`. */
                        fun params(params: Optional<Params>) = params(params.getOrNull())

                        /**
                         * Sets [Builder.params] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.params] with a well-typed [Params] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun params(params: JsonField<Params>) = apply { this.params = params }

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
                                params,
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
                        body().ifPresent { it.validate() }
                        headers().ifPresent { it.validate() }
                        params().ifPresent { it.validate() }
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
                            (body.asKnown().getOrNull()?.validity() ?: 0) +
                            (headers.asKnown().getOrNull()?.validity() ?: 0) +
                            (params.asKnown().getOrNull()?.validity() ?: 0)

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

                            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                        }

                        /** An enum containing [Method]'s known values. */
                        enum class Known {
                            GET,
                            POST,
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

                    class Body
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

                            /** Returns a mutable builder for constructing an instance of [Body]. */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Body]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(body: Body) = apply {
                                additionalProperties = body.additionalProperties.toMutableMap()
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
                             * Returns an immutable instance of [Body].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Body = Body(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): Body = apply {
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

                            return other is Body &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() = "Body{additionalProperties=$additionalProperties}"
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

                    class Params
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
                             * Returns a mutable builder for constructing an instance of [Params].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Params]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(params: Params) = apply {
                                additionalProperties = params.additionalProperties.toMutableMap()
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
                             * Returns an immutable instance of [Params].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Params = Params(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): Params = apply {
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

                            return other is Params &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Params{additionalProperties=$additionalProperties}"
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
                            params == other.params &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(method, url, body, headers, params, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Webhook{method=$method, url=$url, body=$body, headers=$headers, params=$params, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationFetchDataStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        mergeStrategy == other.mergeStrategy &&
                        webhook == other.webhook &&
                        idempotencyExpiry == other.idempotencyExpiry &&
                        idempotencyKey == other.idempotencyKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        if_,
                        ref,
                        action,
                        mergeStrategy,
                        webhook,
                        idempotencyExpiry,
                        idempotencyKey,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationFetchDataStep{if_=$if_, ref=$ref, action=$action, mergeStrategy=$mergeStrategy, webhook=$webhook, idempotencyExpiry=$idempotencyExpiry, idempotencyKey=$idempotencyKey, additionalProperties=$additionalProperties}"
            }

            class AutomationInvokeStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val template: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("template")
                    @ExcludeMissing
                    template: JsonField<String> = JsonMissing.of(),
                ) : this(if_, ref, action, template, mutableMapOf())

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

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
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var template: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationInvokeStep: AutomationInvokeStep) = apply {
                        if_ = automationInvokeStep.if_
                        ref = automationInvokeStep.ref
                        action = automationInvokeStep.action
                        template = automationInvokeStep.template
                        additionalProperties =
                            automationInvokeStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

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
                            if_,
                            ref,
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

                    if_()
                    ref()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
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
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        template == other.template &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(if_, ref, action, template, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationInvokeStep{if_=$if_, ref=$ref, action=$action, template=$template, additionalProperties=$additionalProperties}"
            }

            class AutomationSendStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val brand: JsonField<String>,
                private val data: JsonField<Data>,
                private val override: JsonField<Override>,
                private val profile: JsonValue,
                private val recipient: JsonField<String>,
                private val template: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("brand")
                    @ExcludeMissing
                    brand: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
                    @JsonProperty("override")
                    @ExcludeMissing
                    override: JsonField<Override> = JsonMissing.of(),
                    @JsonProperty("profile") @ExcludeMissing profile: JsonValue = JsonMissing.of(),
                    @JsonProperty("recipient")
                    @ExcludeMissing
                    recipient: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("template")
                    @ExcludeMissing
                    template: JsonField<String> = JsonMissing.of(),
                ) : this(
                    if_,
                    ref,
                    action,
                    brand,
                    data,
                    override,
                    profile,
                    recipient,
                    template,
                    mutableMapOf(),
                )

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

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
                fun override(): Optional<Override> = override.getOptional("override")

                @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonValue = profile

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
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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
                 * Returns the raw JSON value of [override].
                 *
                 * Unlike [override], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("override")
                @ExcludeMissing
                fun _override(): JsonField<Override> = override

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

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var brand: JsonField<String> = JsonMissing.of()
                    private var data: JsonField<Data> = JsonMissing.of()
                    private var override: JsonField<Override> = JsonMissing.of()
                    private var profile: JsonValue = JsonMissing.of()
                    private var recipient: JsonField<String> = JsonMissing.of()
                    private var template: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationSendStep: AutomationSendStep) = apply {
                        if_ = automationSendStep.if_
                        ref = automationSendStep.ref
                        action = automationSendStep.action
                        brand = automationSendStep.brand
                        data = automationSendStep.data
                        override = automationSendStep.override
                        profile = automationSendStep.profile
                        recipient = automationSendStep.recipient
                        template = automationSendStep.template
                        additionalProperties =
                            automationSendStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

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

                    fun override(override: Override?) = override(JsonField.ofNullable(override))

                    /** Alias for calling [Builder.override] with `override.orElse(null)`. */
                    fun override(override: Optional<Override>) = override(override.getOrNull())

                    /**
                     * Sets [Builder.override] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.override] with a well-typed [Override] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun override(override: JsonField<Override>) = apply { this.override = override }

                    fun profile(profile: JsonValue) = apply { this.profile = profile }

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
                            if_,
                            ref,
                            checkRequired("action", action),
                            brand,
                            data,
                            override,
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

                    if_()
                    ref()
                    action().validate()
                    brand()
                    data().ifPresent { it.validate() }
                    override().ifPresent { it.validate() }
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (brand.asKnown().isPresent) 1 else 0) +
                        (data.asKnown().getOrNull()?.validity() ?: 0) +
                        (override.asKnown().getOrNull()?.validity() ?: 0) +
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

                class Override
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

                        /** Returns a mutable builder for constructing an instance of [Override]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Override]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(override: Override) = apply {
                            additionalProperties = override.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Override].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Override = Override(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Override = apply {
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

                        return other is Override &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Override{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationSendStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        brand == other.brand &&
                        data == other.data &&
                        override == other.override &&
                        profile == other.profile &&
                        recipient == other.recipient &&
                        template == other.template &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        if_,
                        ref,
                        action,
                        brand,
                        data,
                        override,
                        profile,
                        recipient,
                        template,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationSendStep{if_=$if_, ref=$ref, action=$action, brand=$brand, data=$data, override=$override, profile=$profile, recipient=$recipient, template=$template, additionalProperties=$additionalProperties}"
            }

            class AutomationV2SendStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val message: JsonField<Message>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<Message> = JsonMissing.of(),
                ) : this(if_, ref, action, message, mutableMapOf())

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun action(): Action = action.getRequired("action")

                /**
                 * Describes the content of the message in a way that will work for email, push,
                 * chat, or any channel.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun message(): Message = message.getRequired("message")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [message].
                 *
                 * Unlike [message], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message")
                @ExcludeMissing
                fun _message(): JsonField<Message> = message

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
                     * [AutomationV2SendStep].
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .message()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationV2SendStep]. */
                class Builder internal constructor() {

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var message: JsonField<Message>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationV2SendStep: AutomationV2SendStep) = apply {
                        if_ = automationV2SendStep.if_
                        ref = automationV2SendStep.ref
                        action = automationV2SendStep.action
                        message = automationV2SendStep.message
                        additionalProperties =
                            automationV2SendStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                    fun action(action: Action) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [Action] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<Action>) = apply { this.action = action }

                    /**
                     * Describes the content of the message in a way that will work for email, push,
                     * chat, or any channel.
                     */
                    fun message(message: Message) = message(JsonField.of(message))

                    /**
                     * Sets [Builder.message] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.message] with a well-typed [Message] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<Message>) = apply { this.message = message }

                    /** Alias for calling [message] with `Message.ofContent(content)`. */
                    fun message(content: Message.ContentMessage) =
                        message(Message.ofContent(content))

                    /** Alias for calling [message] with `Message.ofTemplate(template)`. */
                    fun message(template: Message.TemplateMessage) =
                        message(Message.ofTemplate(template))

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
                     * Returns an immutable instance of [AutomationV2SendStep].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .action()
                     * .message()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationV2SendStep =
                        AutomationV2SendStep(
                            if_,
                            ref,
                            checkRequired("action", action),
                            checkRequired("message", message),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationV2SendStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
                    action().validate()
                    message().validate()
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (message.asKnown().getOrNull()?.validity() ?: 0)

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationV2SendStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        message == other.message &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(if_, ref, action, message, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationV2SendStep{if_=$if_, ref=$ref, action=$action, message=$message, additionalProperties=$additionalProperties}"
            }

            class AutomationSendListStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val if_: JsonField<String>,
                private val ref: JsonField<String>,
                private val action: JsonField<Action>,
                private val list: JsonField<String>,
                private val brand: JsonField<String>,
                private val data: JsonField<Data>,
                private val override: JsonField<Override>,
                private val template: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
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
                    @JsonProperty("override")
                    @ExcludeMissing
                    override: JsonField<Override> = JsonMissing.of(),
                    @JsonProperty("template")
                    @ExcludeMissing
                    template: JsonField<String> = JsonMissing.of(),
                ) : this(if_, ref, action, list, brand, data, override, template, mutableMapOf())

                fun toAutomationStep(): AutomationStep =
                    AutomationStep.builder().if_(if_).ref(ref).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun if_(): Optional<String> = if_.getOptional("if")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<String> = ref.getOptional("ref")

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
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun override(): Optional<Override> = override.getOptional("override")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun template(): Optional<String> = template.getOptional("template")

                /**
                 * Returns the raw JSON value of [if_].
                 *
                 * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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

                /**
                 * Returns the raw JSON value of [override].
                 *
                 * Unlike [override], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("override")
                @ExcludeMissing
                fun _override(): JsonField<Override> = override

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

                    private var if_: JsonField<String> = JsonMissing.of()
                    private var ref: JsonField<String> = JsonMissing.of()
                    private var action: JsonField<Action>? = null
                    private var list: JsonField<String>? = null
                    private var brand: JsonField<String> = JsonMissing.of()
                    private var data: JsonField<Data> = JsonMissing.of()
                    private var override: JsonField<Override> = JsonMissing.of()
                    private var template: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationSendListStep: AutomationSendListStep) = apply {
                        if_ = automationSendListStep.if_
                        ref = automationSendListStep.ref
                        action = automationSendListStep.action
                        list = automationSendListStep.list
                        brand = automationSendListStep.brand
                        data = automationSendListStep.data
                        override = automationSendListStep.override
                        template = automationSendListStep.template
                        additionalProperties =
                            automationSendListStep.additionalProperties.toMutableMap()
                    }

                    fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

                    /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
                    fun if_(if_: Optional<String>) = if_(if_.getOrNull())

                    /**
                     * Sets [Builder.if_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.if_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

                    fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

                    /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
                    fun ref(ref: Optional<String>) = ref(ref.getOrNull())

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ref(ref: JsonField<String>) = apply { this.ref = ref }

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

                    fun override(override: Override?) = override(JsonField.ofNullable(override))

                    /** Alias for calling [Builder.override] with `override.orElse(null)`. */
                    fun override(override: Optional<Override>) = override(override.getOrNull())

                    /**
                     * Sets [Builder.override] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.override] with a well-typed [Override] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun override(override: JsonField<Override>) = apply { this.override = override }

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
                            if_,
                            ref,
                            checkRequired("action", action),
                            checkRequired("list", list),
                            brand,
                            data,
                            override,
                            template,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationSendListStep = apply {
                    if (validated) {
                        return@apply
                    }

                    if_()
                    ref()
                    action().validate()
                    list()
                    brand()
                    data().ifPresent { it.validate() }
                    override().ifPresent { it.validate() }
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
                    (if (if_.asKnown().isPresent) 1 else 0) +
                        (if (ref.asKnown().isPresent) 1 else 0) +
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (list.asKnown().isPresent) 1 else 0) +
                        (if (brand.asKnown().isPresent) 1 else 0) +
                        (data.asKnown().getOrNull()?.validity() ?: 0) +
                        (override.asKnown().getOrNull()?.validity() ?: 0) +
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

                class Override
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

                        /** Returns a mutable builder for constructing an instance of [Override]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Override]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(override: Override) = apply {
                            additionalProperties = override.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Override].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Override = Override(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Override = apply {
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

                        return other is Override &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Override{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationSendListStep &&
                        if_ == other.if_ &&
                        ref == other.ref &&
                        action == other.action &&
                        list == other.list &&
                        brand == other.brand &&
                        data == other.data &&
                        override == other.override &&
                        template == other.template &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        if_,
                        ref,
                        action,
                        list,
                        brand,
                        data,
                        override,
                        template,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationSendListStep{if_=$if_, ref=$ref, action=$action, list=$list, brand=$brand, data=$data, override=$override, template=$template, additionalProperties=$additionalProperties}"
            }

            class AutomationUpdateProfileStep
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<Action>,
                private val merge: JsonField<MergeAlgorithm>,
                private val profile: JsonValue,
                private val recipientId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<Action> = JsonMissing.of(),
                    @JsonProperty("merge")
                    @ExcludeMissing
                    merge: JsonField<MergeAlgorithm> = JsonMissing.of(),
                    @JsonProperty("profile") @ExcludeMissing profile: JsonValue = JsonMissing.of(),
                    @JsonProperty("recipient_id")
                    @ExcludeMissing
                    recipientId: JsonField<String> = JsonMissing.of(),
                ) : this(action, merge, profile, recipientId, mutableMapOf())

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
                fun merge(): MergeAlgorithm = merge.getRequired("merge")

                @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonValue = profile

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun recipientId(): String = recipientId.getRequired("recipient_id")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

                /**
                 * Returns the raw JSON value of [merge].
                 *
                 * Unlike [merge], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("merge")
                @ExcludeMissing
                fun _merge(): JsonField<MergeAlgorithm> = merge

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
                     * .merge()
                     * .profile()
                     * .recipientId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AutomationUpdateProfileStep]. */
                class Builder internal constructor() {

                    private var action: JsonField<Action>? = null
                    private var merge: JsonField<MergeAlgorithm>? = null
                    private var profile: JsonValue? = null
                    private var recipientId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(automationUpdateProfileStep: AutomationUpdateProfileStep) =
                        apply {
                            action = automationUpdateProfileStep.action
                            merge = automationUpdateProfileStep.merge
                            profile = automationUpdateProfileStep.profile
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

                    fun merge(merge: MergeAlgorithm) = merge(JsonField.of(merge))

                    /**
                     * Sets [Builder.merge] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.merge] with a well-typed [MergeAlgorithm]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun merge(merge: JsonField<MergeAlgorithm>) = apply { this.merge = merge }

                    fun profile(profile: JsonValue) = apply { this.profile = profile }

                    fun recipientId(recipientId: String) = recipientId(JsonField.of(recipientId))

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
                     * .merge()
                     * .profile()
                     * .recipientId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AutomationUpdateProfileStep =
                        AutomationUpdateProfileStep(
                            checkRequired("action", action),
                            checkRequired("merge", merge),
                            checkRequired("profile", profile),
                            checkRequired("recipientId", recipientId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AutomationUpdateProfileStep = apply {
                    if (validated) {
                        return@apply
                    }

                    action().validate()
                    merge().validate()
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AutomationUpdateProfileStep &&
                        action == other.action &&
                        merge == other.merge &&
                        profile == other.profile &&
                        recipientId == other.recipientId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(action, merge, profile, recipientId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AutomationUpdateProfileStep{action=$action, merge=$merge, profile=$profile, recipientId=$recipientId, additionalProperties=$additionalProperties}"
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
