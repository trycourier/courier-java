// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Utm
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val campaign: JsonField<String>,
    private val content: JsonField<String>,
    private val medium: JsonField<String>,
    private val source: JsonField<String>,
    private val term: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("campaign") @ExcludeMissing campaign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("medium") @ExcludeMissing medium: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("term") @ExcludeMissing term: JsonField<String> = JsonMissing.of(),
    ) : this(campaign, content, medium, source, term, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun campaign(): Optional<String> = campaign.getOptional("campaign")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = content.getOptional("content")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun medium(): Optional<String> = medium.getOptional("medium")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = source.getOptional("source")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun term(): Optional<String> = term.getOptional("term")

    /**
     * Returns the raw JSON value of [campaign].
     *
     * Unlike [campaign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaign") @ExcludeMissing fun _campaign(): JsonField<String> = campaign

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [medium].
     *
     * Unlike [medium], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medium") @ExcludeMissing fun _medium(): JsonField<String> = medium

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [term].
     *
     * Unlike [term], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("term") @ExcludeMissing fun _term(): JsonField<String> = term

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

        /** Returns a mutable builder for constructing an instance of [Utm]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Utm]. */
    class Builder internal constructor() {

        private var campaign: JsonField<String> = JsonMissing.of()
        private var content: JsonField<String> = JsonMissing.of()
        private var medium: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var term: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(utm: Utm) = apply {
            campaign = utm.campaign
            content = utm.content
            medium = utm.medium
            source = utm.source
            term = utm.term
            additionalProperties = utm.additionalProperties.toMutableMap()
        }

        fun campaign(campaign: String?) = campaign(JsonField.ofNullable(campaign))

        /** Alias for calling [Builder.campaign] with `campaign.orElse(null)`. */
        fun campaign(campaign: Optional<String>) = campaign(campaign.getOrNull())

        /**
         * Sets [Builder.campaign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun campaign(campaign: JsonField<String>) = apply { this.campaign = campaign }

        fun content(content: String?) = content(JsonField.ofNullable(content))

        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
        fun content(content: Optional<String>) = content(content.getOrNull())

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        fun medium(medium: String?) = medium(JsonField.ofNullable(medium))

        /** Alias for calling [Builder.medium] with `medium.orElse(null)`. */
        fun medium(medium: Optional<String>) = medium(medium.getOrNull())

        /**
         * Sets [Builder.medium] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medium] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medium(medium: JsonField<String>) = apply { this.medium = medium }

        fun source(source: String?) = source(JsonField.ofNullable(source))

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<String>) = source(source.getOrNull())

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun term(term: String?) = term(JsonField.ofNullable(term))

        /** Alias for calling [Builder.term] with `term.orElse(null)`. */
        fun term(term: Optional<String>) = term(term.getOrNull())

        /**
         * Sets [Builder.term] to an arbitrary JSON value.
         *
         * You should usually call [Builder.term] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun term(term: JsonField<String>) = apply { this.term = term }

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
         * Returns an immutable instance of [Utm].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Utm =
            Utm(campaign, content, medium, source, term, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Utm = apply {
        if (validated) {
            return@apply
        }

        campaign()
        content()
        medium()
        source()
        term()
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
        (if (campaign.asKnown().isPresent) 1 else 0) +
            (if (content.asKnown().isPresent) 1 else 0) +
            (if (medium.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (term.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Utm &&
            campaign == other.campaign &&
            content == other.content &&
            medium == other.medium &&
            source == other.source &&
            term == other.term &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(campaign, content, medium, source, term, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Utm{campaign=$campaign, content=$content, medium=$medium, source=$source, term=$term, additionalProperties=$additionalProperties}"
}
