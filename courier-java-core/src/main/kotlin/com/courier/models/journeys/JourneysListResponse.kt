// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
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

class JourneysListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cursor: JsonField<String>,
    private val templates: JsonField<List<Journey>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templates")
        @ExcludeMissing
        templates: JsonField<List<Journey>> = JsonMissing.of(),
    ) : this(cursor, templates, mutableMapOf())

    /**
     * A cursor token for pagination. Present when there are more results available.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = cursor.getOptional("cursor")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templates(): Optional<List<Journey>> = templates.getOptional("templates")

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

    /**
     * Returns the raw JSON value of [templates].
     *
     * Unlike [templates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templates")
    @ExcludeMissing
    fun _templates(): JsonField<List<Journey>> = templates

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

        /** Returns a mutable builder for constructing an instance of [JourneysListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneysListResponse]. */
    class Builder internal constructor() {

        private var cursor: JsonField<String> = JsonMissing.of()
        private var templates: JsonField<MutableList<Journey>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeysListResponse: JourneysListResponse) = apply {
            cursor = journeysListResponse.cursor
            templates = journeysListResponse.templates.map { it.toMutableList() }
            additionalProperties = journeysListResponse.additionalProperties.toMutableMap()
        }

        /** A cursor token for pagination. Present when there are more results available. */
        fun cursor(cursor: String) = cursor(JsonField.of(cursor))

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

        fun templates(templates: List<Journey>) = templates(JsonField.of(templates))

        /**
         * Sets [Builder.templates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templates] with a well-typed `List<Journey>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templates(templates: JsonField<List<Journey>>) = apply {
            this.templates = templates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Journey] to [templates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTemplate(template: Journey) = apply {
            templates =
                (templates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("templates", it).add(template)
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
         * Returns an immutable instance of [JourneysListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JourneysListResponse =
            JourneysListResponse(
                cursor,
                (templates ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): JourneysListResponse = apply {
        if (validated) {
            return@apply
        }

        cursor()
        templates().ifPresent { it.forEach { it.validate() } }
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
        (if (cursor.asKnown().isPresent) 1 else 0) +
            (templates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneysListResponse &&
            cursor == other.cursor &&
            templates == other.templates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(cursor, templates, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneysListResponse{cursor=$cursor, templates=$templates, additionalProperties=$additionalProperties}"
}
