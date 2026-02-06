// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ElementalContent
import com.courier.models.MessageRouting
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Template configuration for creating or updating a tenant notification template */
class TenantTemplateInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<ElementalContent>,
    private val channels: JsonField<Channels>,
    private val providers: JsonField<Providers>,
    private val routing: JsonField<MessageRouting>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<ElementalContent> = JsonMissing.of(),
        @JsonProperty("channels") @ExcludeMissing channels: JsonField<Channels> = JsonMissing.of(),
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<Providers> = JsonMissing.of(),
        @JsonProperty("routing")
        @ExcludeMissing
        routing: JsonField<MessageRouting> = JsonMissing.of(),
    ) : this(content, channels, providers, routing, mutableMapOf())

    /**
     * Template content configuration including blocks, elements, and message structure
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): ElementalContent = content.getRequired("content")

    /**
     * Channel-specific delivery configuration (email, SMS, push, etc.)
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<Channels> = channels.getOptional("channels")

    /**
     * Provider-specific delivery configuration for routing to specific email/SMS providers
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providers(): Optional<Providers> = providers.getOptional("providers")

    /**
     * Message routing configuration for multi-channel delivery strategies
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routing(): Optional<MessageRouting> = routing.getOptional("routing")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<ElementalContent> = content

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Channels> = channels

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonField<Providers> = providers

    /**
     * Returns the raw JSON value of [routing].
     *
     * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing") @ExcludeMissing fun _routing(): JsonField<MessageRouting> = routing

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
         * Returns a mutable builder for constructing an instance of [TenantTemplateInput].
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TenantTemplateInput]. */
    class Builder internal constructor() {

        private var content: JsonField<ElementalContent>? = null
        private var channels: JsonField<Channels> = JsonMissing.of()
        private var providers: JsonField<Providers> = JsonMissing.of()
        private var routing: JsonField<MessageRouting> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenantTemplateInput: TenantTemplateInput) = apply {
            content = tenantTemplateInput.content
            channels = tenantTemplateInput.channels
            providers = tenantTemplateInput.providers
            routing = tenantTemplateInput.routing
            additionalProperties = tenantTemplateInput.additionalProperties.toMutableMap()
        }

        /** Template content configuration including blocks, elements, and message structure */
        fun content(content: ElementalContent) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [ElementalContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<ElementalContent>) = apply { this.content = content }

        /** Channel-specific delivery configuration (email, SMS, push, etc.) */
        fun channels(channels: Channels) = channels(JsonField.of(channels))

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed [Channels] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

        /** Provider-specific delivery configuration for routing to specific email/SMS providers */
        fun providers(providers: Providers) = providers(JsonField.of(providers))

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed [Providers] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providers(providers: JsonField<Providers>) = apply { this.providers = providers }

        /** Message routing configuration for multi-channel delivery strategies */
        fun routing(routing: MessageRouting) = routing(JsonField.of(routing))

        /**
         * Sets [Builder.routing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routing] with a well-typed [MessageRouting] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routing(routing: JsonField<MessageRouting>) = apply { this.routing = routing }

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
         * Returns an immutable instance of [TenantTemplateInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TenantTemplateInput =
            TenantTemplateInput(
                checkRequired("content", content),
                channels,
                providers,
                routing,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TenantTemplateInput = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        channels().ifPresent { it.validate() }
        providers().ifPresent { it.validate() }
        routing().ifPresent { it.validate() }
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
        (content.asKnown().getOrNull()?.validity() ?: 0) +
            (channels.asKnown().getOrNull()?.validity() ?: 0) +
            (providers.asKnown().getOrNull()?.validity() ?: 0) +
            (routing.asKnown().getOrNull()?.validity() ?: 0)

    /** Channel-specific delivery configuration (email, SMS, push, etc.) */
    class Channels
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

            /** Returns a mutable builder for constructing an instance of [Channels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Channels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(channels: Channels) = apply {
                additionalProperties = channels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Channels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Channels = Channels(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Channels = apply {
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

            return other is Channels && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Channels{additionalProperties=$additionalProperties}"
    }

    /** Provider-specific delivery configuration for routing to specific email/SMS providers */
    class Providers
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

            /** Returns a mutable builder for constructing an instance of [Providers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Providers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(providers: Providers) = apply {
                additionalProperties = providers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Providers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Providers = Providers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Providers = apply {
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

            return other is Providers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Providers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantTemplateInput &&
            content == other.content &&
            channels == other.channels &&
            providers == other.providers &&
            routing == other.routing &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(content, channels, providers, routing, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TenantTemplateInput{content=$content, channels=$channels, providers=$providers, routing=$routing, additionalProperties=$additionalProperties}"
}
