// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class AirshipProfileAudience
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val namedUser: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("named_user") @ExcludeMissing namedUser: JsonField<String> = JsonMissing.of()
    ) : this(namedUser, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun namedUser(): String = namedUser.getRequired("named_user")

    /**
     * Returns the raw JSON value of [namedUser].
     *
     * Unlike [namedUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("named_user") @ExcludeMissing fun _namedUser(): JsonField<String> = namedUser

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
         * Returns a mutable builder for constructing an instance of [AirshipProfileAudience].
         *
         * The following fields are required:
         * ```java
         * .namedUser()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirshipProfileAudience]. */
    class Builder internal constructor() {

        private var namedUser: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airshipProfileAudience: AirshipProfileAudience) = apply {
            namedUser = airshipProfileAudience.namedUser
            additionalProperties = airshipProfileAudience.additionalProperties.toMutableMap()
        }

        fun namedUser(namedUser: String) = namedUser(JsonField.of(namedUser))

        /**
         * Sets [Builder.namedUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.namedUser] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun namedUser(namedUser: JsonField<String>) = apply { this.namedUser = namedUser }

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
         * Returns an immutable instance of [AirshipProfileAudience].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .namedUser()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirshipProfileAudience =
            AirshipProfileAudience(
                checkRequired("namedUser", namedUser),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirshipProfileAudience = apply {
        if (validated) {
            return@apply
        }

        namedUser()
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
    @JvmSynthetic internal fun validity(): Int = (if (namedUser.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirshipProfileAudience &&
            namedUser == other.namedUser &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(namedUser, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirshipProfileAudience{namedUser=$namedUser, additionalProperties=$additionalProperties}"
}
