// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.getOrThrow
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.bulk.UserRecipient
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

@JsonDeserialize(using = Recipient.Deserializer::class)
@JsonSerialize(using = Recipient.Serializer::class)
class Recipient
private constructor(
    private val user: UserRecipient? = null,
    private val list: ListRecipient? = null,
    private val _json: JsonValue? = null,
) {

    fun user(): Optional<UserRecipient> = Optional.ofNullable(user)

    fun list(): Optional<ListRecipient> = Optional.ofNullable(list)

    fun isUser(): Boolean = user != null

    fun isList(): Boolean = list != null

    fun asUser(): UserRecipient = user.getOrThrow("user")

    fun asList(): ListRecipient = list.getOrThrow("list")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            user != null -> visitor.visitUser(user)
            list != null -> visitor.visitList(list)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Recipient = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUser(user: UserRecipient) {
                    user.validate()
                }

                override fun visitList(list: ListRecipient) {
                    list.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitUser(user: UserRecipient) = user.validity()

                override fun visitList(list: ListRecipient) = list.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Recipient && user == other.user && list == other.list
    }

    override fun hashCode(): Int = Objects.hash(user, list)

    override fun toString(): String =
        when {
            user != null -> "Recipient{user=$user}"
            list != null -> "Recipient{list=$list}"
            _json != null -> "Recipient{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Recipient")
        }

    companion object {

        @JvmStatic fun ofUser(user: UserRecipient) = Recipient(user = user)

        @JvmStatic fun ofList(list: ListRecipient) = Recipient(list = list)
    }

    /** An interface that defines how to map each variant of [Recipient] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitUser(user: UserRecipient): T

        fun visitList(list: ListRecipient): T

        /**
         * Maps an unknown variant of [Recipient] to a value of type [T].
         *
         * An instance of [Recipient] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Recipient: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Recipient>(Recipient::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Recipient {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UserRecipient>())?.let {
                            Recipient(user = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ListRecipient>())?.let {
                            Recipient(list = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Recipient(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Recipient>(Recipient::class) {

        override fun serialize(
            value: Recipient,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.user != null -> generator.writeObject(value.user)
                value.list != null -> generator.writeObject(value.list)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Recipient")
            }
        }
    }

    class ListRecipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<Data>,
        private val listId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("list_id") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        ) : this(data, listId, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun listId(): Optional<String> = listId.getOptional("list_id")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [listId].
         *
         * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("list_id") @ExcludeMissing fun _listId(): JsonField<String> = listId

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

            /** Returns a mutable builder for constructing an instance of [ListRecipient]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ListRecipient]. */
        class Builder internal constructor() {

            private var data: JsonField<Data> = JsonMissing.of()
            private var listId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(listRecipient: ListRecipient) = apply {
                data = listRecipient.data
                listId = listRecipient.listId
                additionalProperties = listRecipient.additionalProperties.toMutableMap()
            }

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

            fun listId(listId: String?) = listId(JsonField.ofNullable(listId))

            /** Alias for calling [Builder.listId] with `listId.orElse(null)`. */
            fun listId(listId: Optional<String>) = listId(listId.getOrNull())

            /**
             * Sets [Builder.listId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.listId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun listId(listId: JsonField<String>) = apply { this.listId = listId }

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
             * Returns an immutable instance of [ListRecipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ListRecipient =
                ListRecipient(data, listId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ListRecipient = apply {
            if (validated) {
                return@apply
            }

            data().ifPresent { it.validate() }
            listId()
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
            (data.asKnown().getOrNull()?.validity() ?: 0) +
                (if (listId.asKnown().isPresent) 1 else 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ListRecipient &&
                data == other.data &&
                listId == other.listId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, listId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ListRecipient{data=$data, listId=$listId, additionalProperties=$additionalProperties}"
    }
}
