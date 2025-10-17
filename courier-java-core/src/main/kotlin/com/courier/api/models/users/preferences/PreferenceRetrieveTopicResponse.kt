// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PreferenceRetrieveTopicResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val topic: JsonField<TopicPreference>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("topic") @ExcludeMissing topic: JsonField<TopicPreference> = JsonMissing.of()
    ) : this(topic, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topic(): TopicPreference = topic.getRequired("topic")

    /**
     * Returns the raw JSON value of [topic].
     *
     * Unlike [topic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topic") @ExcludeMissing fun _topic(): JsonField<TopicPreference> = topic

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
         * [PreferenceRetrieveTopicResponse].
         *
         * The following fields are required:
         * ```java
         * .topic()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceRetrieveTopicResponse]. */
    class Builder internal constructor() {

        private var topic: JsonField<TopicPreference>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceRetrieveTopicResponse: PreferenceRetrieveTopicResponse) =
            apply {
                topic = preferenceRetrieveTopicResponse.topic
                additionalProperties =
                    preferenceRetrieveTopicResponse.additionalProperties.toMutableMap()
            }

        fun topic(topic: TopicPreference) = topic(JsonField.of(topic))

        /**
         * Sets [Builder.topic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topic] with a well-typed [TopicPreference] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun topic(topic: JsonField<TopicPreference>) = apply { this.topic = topic }

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
         * Returns an immutable instance of [PreferenceRetrieveTopicResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .topic()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceRetrieveTopicResponse =
            PreferenceRetrieveTopicResponse(
                checkRequired("topic", topic),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PreferenceRetrieveTopicResponse = apply {
        if (validated) {
            return@apply
        }

        topic().validate()
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
    @JvmSynthetic internal fun validity(): Int = (topic.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceRetrieveTopicResponse &&
            topic == other.topic &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(topic, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceRetrieveTopicResponse{topic=$topic, additionalProperties=$additionalProperties}"
}
