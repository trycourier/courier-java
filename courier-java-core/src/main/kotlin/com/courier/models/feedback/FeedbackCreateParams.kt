// File generated from our OpenAPI spec by Stainless.

package com.courier.models.feedback

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Reports a suspected bug, confusing behavior or a missing feature in Courier. It is built for AI
 * agents and developer tools to call when Courier does something unexpected, and people can call it
 * too.
 *
 * A report is not a support ticket. A `201` means Courier stored the report; it does not promise a
 * reply or a fix. For help with your account, contact Courier support.
 *
 * Never include secrets, API keys or customer data such as recipient names, email addresses or
 * message content.
 *
 * Requires an API key with no scope restrictions; a JWT or a scoped API key is refused. Each
 * workspace can submit 200 reports per UTC day, and requests that fail validation count toward that
 * limit.
 */
class FeedbackCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * What kind of report this is: `possible_bug` for behavior that looks wrong,
     * `confusing_behavior` for behavior that works but was hard to understand, `feature_request`
     * for something Courier does not do yet, and `other`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = body.category()

    /**
     * What happened, in enough detail for someone at Courier to follow it.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * Where you met the problem: the REST `api`, an `sdk`, the Courier `mcp` server, the Courier
     * app `ui`, the `docs`, or `other`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun surface(): Surface = body.surface()

    /**
     * A one-line summary of the report.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = body.title()

    /**
     * What you expected to happen instead.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expectedBehavior(): Optional<String> = body.expectedBehavior()

    /**
     * The agent or tool that submitted the report, such as `Claude Code`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun harness(): Optional<String> = body.harness()

    /**
     * Where it happened, such as an endpoint (`POST /send`), an SDK method, an MCP tool name or a
     * docs URL.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = body.location()

    /**
     * The AI model that submitted the report, such as `claude-opus-5-5`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * The request ID of an API call that shows the problem, if there is one.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestId(): Optional<String> = body.requestId()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [surface].
     *
     * Unlike [surface], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _surface(): JsonField<Surface> = body._surface()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [expectedBehavior].
     *
     * Unlike [expectedBehavior], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expectedBehavior(): JsonField<String> = body._expectedBehavior()

    /**
     * Returns the raw JSON value of [harness].
     *
     * Unlike [harness], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _harness(): JsonField<String> = body._harness()

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _location(): JsonField<String> = body._location()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestId(): JsonField<String> = body._requestId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeedbackCreateParams].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .description()
         * .surface()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(feedbackCreateParams: FeedbackCreateParams) = apply {
            body = feedbackCreateParams.body.toBuilder()
            additionalHeaders = feedbackCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = feedbackCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [category]
         * - [description]
         * - [surface]
         * - [title]
         * - [expectedBehavior]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * What kind of report this is: `possible_bug` for behavior that looks wrong,
         * `confusing_behavior` for behavior that works but was hard to understand,
         * `feature_request` for something Courier does not do yet, and `other`.
         */
        fun category(category: Category) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { body.category(category) }

        /** What happened, in enough detail for someone at Courier to follow it. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Where you met the problem: the REST `api`, an `sdk`, the Courier `mcp` server, the
         * Courier app `ui`, the `docs`, or `other`.
         */
        fun surface(surface: Surface) = apply { body.surface(surface) }

        /**
         * Sets [Builder.surface] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surface] with a well-typed [Surface] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun surface(surface: JsonField<Surface>) = apply { body.surface(surface) }

        /** A one-line summary of the report. */
        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        /** What you expected to happen instead. */
        fun expectedBehavior(expectedBehavior: String) = apply {
            body.expectedBehavior(expectedBehavior)
        }

        /**
         * Sets [Builder.expectedBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedBehavior] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedBehavior(expectedBehavior: JsonField<String>) = apply {
            body.expectedBehavior(expectedBehavior)
        }

        /** The agent or tool that submitted the report, such as `Claude Code`. */
        fun harness(harness: String) = apply { body.harness(harness) }

        /**
         * Sets [Builder.harness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.harness] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun harness(harness: JsonField<String>) = apply { body.harness(harness) }

        /**
         * Where it happened, such as an endpoint (`POST /send`), an SDK method, an MCP tool name or
         * a docs URL.
         */
        fun location(location: String) = apply { body.location(location) }

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { body.location(location) }

        /** The AI model that submitted the report, such as `claude-opus-5-5`. */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** The request ID of an API call that shows the problem, if there is one. */
        fun requestId(requestId: String) = apply { body.requestId(requestId) }

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { body.requestId(requestId) }

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
         * Returns an immutable instance of [FeedbackCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .description()
         * .surface()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackCreateParams =
            FeedbackCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A report about Courier. Never include secrets, API keys or customer data. Unknown fields are
     * ignored. Lengths are counted in UTF-16 code units, and a blank optional field is treated as
     * omitted.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val description: JsonField<String>,
        private val surface: JsonField<Surface>,
        private val title: JsonField<String>,
        private val expectedBehavior: JsonField<String>,
        private val harness: JsonField<String>,
        private val location: JsonField<String>,
        private val model: JsonField<String>,
        private val requestId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("surface") @ExcludeMissing surface: JsonField<Surface> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expected_behavior")
            @ExcludeMissing
            expectedBehavior: JsonField<String> = JsonMissing.of(),
            @JsonProperty("harness") @ExcludeMissing harness: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
        ) : this(
            category,
            description,
            surface,
            title,
            expectedBehavior,
            harness,
            location,
            model,
            requestId,
            mutableMapOf(),
        )

        /**
         * What kind of report this is: `possible_bug` for behavior that looks wrong,
         * `confusing_behavior` for behavior that works but was hard to understand,
         * `feature_request` for something Courier does not do yet, and `other`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * What happened, in enough detail for someone at Courier to follow it.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * Where you met the problem: the REST `api`, an `sdk`, the Courier `mcp` server, the
         * Courier app `ui`, the `docs`, or `other`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun surface(): Surface = surface.getRequired("surface")

        /**
         * A one-line summary of the report.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * What you expected to happen instead.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expectedBehavior(): Optional<String> = expectedBehavior.getOptional("expected_behavior")

        /**
         * The agent or tool that submitted the report, such as `Claude Code`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun harness(): Optional<String> = harness.getOptional("harness")

        /**
         * Where it happened, such as an endpoint (`POST /send`), an SDK method, an MCP tool name or
         * a docs URL.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun location(): Optional<String> = location.getOptional("location")

        /**
         * The AI model that submitted the report, such as `claude-opus-5-5`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * The request ID of an API call that shows the problem, if there is one.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): Optional<String> = requestId.getOptional("request_id")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [surface].
         *
         * Unlike [surface], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("surface") @ExcludeMissing fun _surface(): JsonField<Surface> = surface

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [expectedBehavior].
         *
         * Unlike [expectedBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expected_behavior")
        @ExcludeMissing
        fun _expectedBehavior(): JsonField<String> = expectedBehavior

        /**
         * Returns the raw JSON value of [harness].
         *
         * Unlike [harness], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("harness") @ExcludeMissing fun _harness(): JsonField<String> = harness

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
             * .category()
             * .description()
             * .surface()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var description: JsonField<String>? = null
            private var surface: JsonField<Surface>? = null
            private var title: JsonField<String>? = null
            private var expectedBehavior: JsonField<String> = JsonMissing.of()
            private var harness: JsonField<String> = JsonMissing.of()
            private var location: JsonField<String> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                category = body.category
                description = body.description
                surface = body.surface
                title = body.title
                expectedBehavior = body.expectedBehavior
                harness = body.harness
                location = body.location
                model = body.model
                requestId = body.requestId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * What kind of report this is: `possible_bug` for behavior that looks wrong,
             * `confusing_behavior` for behavior that works but was hard to understand,
             * `feature_request` for something Courier does not do yet, and `other`.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** What happened, in enough detail for someone at Courier to follow it. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Where you met the problem: the REST `api`, an `sdk`, the Courier `mcp` server, the
             * Courier app `ui`, the `docs`, or `other`.
             */
            fun surface(surface: Surface) = surface(JsonField.of(surface))

            /**
             * Sets [Builder.surface] to an arbitrary JSON value.
             *
             * You should usually call [Builder.surface] with a well-typed [Surface] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun surface(surface: JsonField<Surface>) = apply { this.surface = surface }

            /** A one-line summary of the report. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** What you expected to happen instead. */
            fun expectedBehavior(expectedBehavior: String) =
                expectedBehavior(JsonField.of(expectedBehavior))

            /**
             * Sets [Builder.expectedBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedBehavior] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expectedBehavior(expectedBehavior: JsonField<String>) = apply {
                this.expectedBehavior = expectedBehavior
            }

            /** The agent or tool that submitted the report, such as `Claude Code`. */
            fun harness(harness: String) = harness(JsonField.of(harness))

            /**
             * Sets [Builder.harness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.harness] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun harness(harness: JsonField<String>) = apply { this.harness = harness }

            /**
             * Where it happened, such as an endpoint (`POST /send`), an SDK method, an MCP tool
             * name or a docs URL.
             */
            fun location(location: String) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<String>) = apply { this.location = location }

            /** The AI model that submitted the report, such as `claude-opus-5-5`. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** The request ID of an API call that shows the problem, if there is one. */
            fun requestId(requestId: String) = requestId(JsonField.of(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

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
             * .category()
             * .description()
             * .surface()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("category", category),
                    checkRequired("description", description),
                    checkRequired("surface", surface),
                    checkRequired("title", title),
                    expectedBehavior,
                    harness,
                    location,
                    model,
                    requestId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            description()
            surface().validate()
            title()
            expectedBehavior()
            harness()
            location()
            model()
            requestId()
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (surface.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (expectedBehavior.asKnown().isPresent) 1 else 0) +
                (if (harness.asKnown().isPresent) 1 else 0) +
                (if (location.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (requestId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                category == other.category &&
                description == other.description &&
                surface == other.surface &&
                title == other.title &&
                expectedBehavior == other.expectedBehavior &&
                harness == other.harness &&
                location == other.location &&
                model == other.model &&
                requestId == other.requestId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                category,
                description,
                surface,
                title,
                expectedBehavior,
                harness,
                location,
                model,
                requestId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{category=$category, description=$description, surface=$surface, title=$title, expectedBehavior=$expectedBehavior, harness=$harness, location=$location, model=$model, requestId=$requestId, additionalProperties=$additionalProperties}"
    }

    /**
     * What kind of report this is: `possible_bug` for behavior that looks wrong,
     * `confusing_behavior` for behavior that works but was hard to understand, `feature_request`
     * for something Courier does not do yet, and `other`.
     */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val POSSIBLE_BUG = of("possible_bug")

            @JvmField val CONFUSING_BEHAVIOR = of("confusing_behavior")

            @JvmField val FEATURE_REQUEST = of("feature_request")

            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            POSSIBLE_BUG,
            CONFUSING_BEHAVIOR,
            FEATURE_REQUEST,
            OTHER,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POSSIBLE_BUG,
            CONFUSING_BEHAVIOR,
            FEATURE_REQUEST,
            OTHER,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                POSSIBLE_BUG -> Value.POSSIBLE_BUG
                CONFUSING_BEHAVIOR -> Value.CONFUSING_BEHAVIOR
                FEATURE_REQUEST -> Value.FEATURE_REQUEST
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                POSSIBLE_BUG -> Known.POSSIBLE_BUG
                CONFUSING_BEHAVIOR -> Known.CONFUSING_BEHAVIOR
                FEATURE_REQUEST -> Known.FEATURE_REQUEST
                OTHER -> Known.OTHER
                else -> throw CourierInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Category = apply {
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Where you met the problem: the REST `api`, an `sdk`, the Courier `mcp` server, the Courier
     * app `ui`, the `docs`, or `other`.
     */
    class Surface @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val API = of("api")

            @JvmField val SDK = of("sdk")

            @JvmField val MCP = of("mcp")

            @JvmField val UI = of("ui")

            @JvmField val DOCS = of("docs")

            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = Surface(JsonField.of(value))
        }

        /** An enum containing [Surface]'s known values. */
        enum class Known {
            API,
            SDK,
            MCP,
            UI,
            DOCS,
            OTHER,
        }

        /**
         * An enum containing [Surface]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Surface] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            API,
            SDK,
            MCP,
            UI,
            DOCS,
            OTHER,
            /** An enum member indicating that [Surface] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                API -> Value.API
                SDK -> Value.SDK
                MCP -> Value.MCP
                UI -> Value.UI
                DOCS -> Value.DOCS
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                API -> Known.API
                SDK -> Known.SDK
                MCP -> Known.MCP
                UI -> Known.UI
                DOCS -> Known.DOCS
                OTHER -> Known.OTHER
                else -> throw CourierInvalidDataException("Unknown Surface: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Surface = apply {
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Surface && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeedbackCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
