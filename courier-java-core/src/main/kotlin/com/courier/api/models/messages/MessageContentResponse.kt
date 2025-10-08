// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MessageContentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of()
    ) : this(results, mutableMapOf())

    /**
     * An array of render output of a previously sent message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
         * Returns a mutable builder for constructing an instance of [MessageContentResponse].
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageContentResponse]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageContentResponse: MessageContentResponse) = apply {
            results = messageContentResponse.results.map { it.toMutableList() }
            additionalProperties = messageContentResponse.additionalProperties.toMutableMap()
        }

        /** An array of render output of a previously sent message. */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
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
         * Returns an immutable instance of [MessageContentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageContentResponse =
            MessageContentResponse(
                checkRequired("results", results).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageContentResponse = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
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
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channel: JsonField<String>,
        private val channelId: JsonField<String>,
        private val content: JsonField<Content>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channel_id")
            @ExcludeMissing
            channelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
        ) : this(channel, channelId, content, mutableMapOf())

        /**
         * The channel used for rendering the message.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channel(): String = channel.getRequired("channel")

        /**
         * The ID of channel used for rendering the message.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channelId(): String = channelId.getRequired("channel_id")

        /**
         * Content details of the rendered message.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): Content = content.getRequired("content")

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

        /**
         * Returns the raw JSON value of [channelId].
         *
         * Unlike [channelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel_id") @ExcludeMissing fun _channelId(): JsonField<String> = channelId

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .channel()
             * .channelId()
             * .content()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var channel: JsonField<String>? = null
            private var channelId: JsonField<String>? = null
            private var content: JsonField<Content>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                channel = result.channel
                channelId = result.channelId
                content = result.content
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** The channel used for rendering the message. */
            fun channel(channel: String) = channel(JsonField.of(channel))

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<String>) = apply { this.channel = channel }

            /** The ID of channel used for rendering the message. */
            fun channelId(channelId: String) = channelId(JsonField.of(channelId))

            /**
             * Sets [Builder.channelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelId(channelId: JsonField<String>) = apply { this.channelId = channelId }

            /** Content details of the rendered message. */
            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .channel()
             * .channelId()
             * .content()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("channel", channel),
                    checkRequired("channelId", channelId),
                    checkRequired("content", content),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            channel()
            channelId()
            content().validate()
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
            (if (channel.asKnown().isPresent) 1 else 0) +
                (if (channelId.asKnown().isPresent) 1 else 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0)

        /** Content details of the rendered message. */
        class Content
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val blocks: JsonField<List<Block>>,
            private val body: JsonField<String>,
            private val html: JsonField<String>,
            private val subject: JsonField<String>,
            private val text: JsonField<String>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("blocks")
                @ExcludeMissing
                blocks: JsonField<List<Block>> = JsonMissing.of(),
                @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
                @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subject")
                @ExcludeMissing
                subject: JsonField<String> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(blocks, body, html, subject, text, title, mutableMapOf())

            /**
             * The blocks of the rendered message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun blocks(): List<Block> = blocks.getRequired("blocks")

            /**
             * The body of the rendered message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun body(): String = body.getRequired("body")

            /**
             * The html content of the rendered message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun html(): String = html.getRequired("html")

            /**
             * The subject of the rendered message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subject(): String = subject.getRequired("subject")

            /**
             * The text of the rendered message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * The title of the rendered message.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun title(): String = title.getRequired("title")

            /**
             * Returns the raw JSON value of [blocks].
             *
             * Unlike [blocks], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blocks") @ExcludeMissing fun _blocks(): JsonField<List<Block>> = blocks

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

            /**
             * Returns the raw JSON value of [html].
             *
             * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

            /**
             * Returns the raw JSON value of [subject].
             *
             * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
                 * Returns a mutable builder for constructing an instance of [Content].
                 *
                 * The following fields are required:
                 * ```java
                 * .blocks()
                 * .body()
                 * .html()
                 * .subject()
                 * .text()
                 * .title()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Content]. */
            class Builder internal constructor() {

                private var blocks: JsonField<MutableList<Block>>? = null
                private var body: JsonField<String>? = null
                private var html: JsonField<String>? = null
                private var subject: JsonField<String>? = null
                private var text: JsonField<String>? = null
                private var title: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(content: Content) = apply {
                    blocks = content.blocks.map { it.toMutableList() }
                    body = content.body
                    html = content.html
                    subject = content.subject
                    text = content.text
                    title = content.title
                    additionalProperties = content.additionalProperties.toMutableMap()
                }

                /** The blocks of the rendered message. */
                fun blocks(blocks: List<Block>) = blocks(JsonField.of(blocks))

                /**
                 * Sets [Builder.blocks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocks] with a well-typed `List<Block>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocks(blocks: JsonField<List<Block>>) = apply {
                    this.blocks = blocks.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Block] to [blocks].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBlock(block: Block) = apply {
                    blocks =
                        (blocks ?: JsonField.of(mutableListOf())).also {
                            checkKnown("blocks", it).add(block)
                        }
                }

                /** The body of the rendered message. */
                fun body(body: String) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun body(body: JsonField<String>) = apply { this.body = body }

                /** The html content of the rendered message. */
                fun html(html: String) = html(JsonField.of(html))

                /**
                 * Sets [Builder.html] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.html] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun html(html: JsonField<String>) = apply { this.html = html }

                /** The subject of the rendered message. */
                fun subject(subject: String) = subject(JsonField.of(subject))

                /**
                 * Sets [Builder.subject] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subject] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subject(subject: JsonField<String>) = apply { this.subject = subject }

                /** The text of the rendered message. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** The title of the rendered message. */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

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
                 * Returns an immutable instance of [Content].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .blocks()
                 * .body()
                 * .html()
                 * .subject()
                 * .text()
                 * .title()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Content =
                    Content(
                        checkRequired("blocks", blocks).map { it.toImmutable() },
                        checkRequired("body", body),
                        checkRequired("html", html),
                        checkRequired("subject", subject),
                        checkRequired("text", text),
                        checkRequired("title", title),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                blocks().forEach { it.validate() }
                body()
                html()
                subject()
                text()
                title()
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
                (blocks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (body.asKnown().isPresent) 1 else 0) +
                    (if (html.asKnown().isPresent) 1 else 0) +
                    (if (subject.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            class Block
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(text, type, mutableMapOf())

                /**
                 * The block text of the rendered message block.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * The block type of the rendered message block.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                     * Returns a mutable builder for constructing an instance of [Block].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Block]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var type: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(block: Block) = apply {
                        text = block.text
                        type = block.type
                        additionalProperties = block.additionalProperties.toMutableMap()
                    }

                    /** The block text of the rendered message block. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /** The block type of the rendered message block. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [Block].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Block =
                        Block(
                            checkRequired("text", text),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Block = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    type()
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Block &&
                        text == other.text &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Block{text=$text, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    blocks == other.blocks &&
                    body == other.body &&
                    html == other.html &&
                    subject == other.subject &&
                    text == other.text &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(blocks, body, html, subject, text, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Content{blocks=$blocks, body=$body, html=$html, subject=$subject, text=$text, title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                channel == other.channel &&
                channelId == other.channelId &&
                content == other.content &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channel, channelId, content, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{channel=$channel, channelId=$channelId, content=$content, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageContentResponse &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageContentResponse{results=$results, additionalProperties=$additionalProperties}"
}
