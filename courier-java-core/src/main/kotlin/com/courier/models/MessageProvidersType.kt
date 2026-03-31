// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
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

class MessageProvidersType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val if_: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val override: JsonField<Override>,
    private val timeouts: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("override") @ExcludeMissing override: JsonField<Override> = JsonMissing.of(),
        @JsonProperty("timeouts") @ExcludeMissing timeouts: JsonField<Long> = JsonMissing.of(),
    ) : this(if_, metadata, override, timeouts, mutableMapOf())

    /**
     * JS conditional with access to data/profile.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun if_(): Optional<String> = if_.getOptional("if")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Provider-specific overrides.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun override(): Optional<Override> = override.getOptional("override")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeouts(): Optional<Long> = timeouts.getOptional("timeouts")

    /**
     * Returns the raw JSON value of [if_].
     *
     * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [override].
     *
     * Unlike [override], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("override") @ExcludeMissing fun _override(): JsonField<Override> = override

    /**
     * Returns the raw JSON value of [timeouts].
     *
     * Unlike [timeouts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeouts") @ExcludeMissing fun _timeouts(): JsonField<Long> = timeouts

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

        /** Returns a mutable builder for constructing an instance of [MessageProvidersType]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageProvidersType]. */
    class Builder internal constructor() {

        private var if_: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var override: JsonField<Override> = JsonMissing.of()
        private var timeouts: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageProvidersType: MessageProvidersType) = apply {
            if_ = messageProvidersType.if_
            metadata = messageProvidersType.metadata
            override = messageProvidersType.override
            timeouts = messageProvidersType.timeouts
            additionalProperties = messageProvidersType.additionalProperties.toMutableMap()
        }

        /** JS conditional with access to data/profile. */
        fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

        /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
        fun if_(if_: Optional<String>) = if_(if_.getOrNull())

        /**
         * Sets [Builder.if_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.if_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Provider-specific overrides. */
        fun override(override: Override?) = override(JsonField.ofNullable(override))

        /** Alias for calling [Builder.override] with `override.orElse(null)`. */
        fun override(override: Optional<Override>) = override(override.getOrNull())

        /**
         * Sets [Builder.override] to an arbitrary JSON value.
         *
         * You should usually call [Builder.override] with a well-typed [Override] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun override(override: JsonField<Override>) = apply { this.override = override }

        fun timeouts(timeouts: Long?) = timeouts(JsonField.ofNullable(timeouts))

        /**
         * Alias for [Builder.timeouts].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeouts(timeouts: Long) = timeouts(timeouts as Long?)

        /** Alias for calling [Builder.timeouts] with `timeouts.orElse(null)`. */
        fun timeouts(timeouts: Optional<Long>) = timeouts(timeouts.getOrNull())

        /**
         * Sets [Builder.timeouts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeouts] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeouts(timeouts: JsonField<Long>) = apply { this.timeouts = timeouts }

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
         * Returns an immutable instance of [MessageProvidersType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageProvidersType =
            MessageProvidersType(
                if_,
                metadata,
                override,
                timeouts,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageProvidersType = apply {
        if (validated) {
            return@apply
        }

        if_()
        metadata().ifPresent { it.validate() }
        override().ifPresent { it.validate() }
        timeouts()
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
        (if (if_.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (override.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeouts.asKnown().isPresent) 1 else 0)

    /** Provider-specific overrides. */
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

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                additionalProperties = override.additionalProperties.toMutableMap()
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Override && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Override{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageProvidersType &&
            if_ == other.if_ &&
            metadata == other.metadata &&
            override == other.override &&
            timeouts == other.timeouts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(if_, metadata, override, timeouts, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageProvidersType{if_=$if_, metadata=$metadata, override=$override, timeouts=$timeouts, additionalProperties=$additionalProperties}"
}
