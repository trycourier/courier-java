// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
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
    private val audience: AudienceRecipient? = null,
    private val unionMember1: UnionMember1? = null,
    private val unionMember2: UnionMember2? = null,
    private val user: UserRecipient? = null,
    private val slack: SlackRecipient? = null,
    private val msTeams: MsTeamsRecipient? = null,
    private val data: RecipientData? = null,
    private val pagerduty: PagerdutyRecipient? = null,
    private val webhook: WebhookRecipient? = null,
    private val _json: JsonValue? = null,
) {

    fun audience(): Optional<AudienceRecipient> = Optional.ofNullable(audience)

    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

    fun user(): Optional<UserRecipient> = Optional.ofNullable(user)

    fun slack(): Optional<SlackRecipient> = Optional.ofNullable(slack)

    fun msTeams(): Optional<MsTeamsRecipient> = Optional.ofNullable(msTeams)

    fun data(): Optional<RecipientData> = Optional.ofNullable(data)

    fun pagerduty(): Optional<PagerdutyRecipient> = Optional.ofNullable(pagerduty)

    fun webhook(): Optional<WebhookRecipient> = Optional.ofNullable(webhook)

    fun isAudience(): Boolean = audience != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun isUnionMember2(): Boolean = unionMember2 != null

    fun isUser(): Boolean = user != null

    fun isSlack(): Boolean = slack != null

    fun isMsTeams(): Boolean = msTeams != null

    fun isData(): Boolean = data != null

    fun isPagerduty(): Boolean = pagerduty != null

    fun isWebhook(): Boolean = webhook != null

    fun asAudience(): AudienceRecipient = audience.getOrThrow("audience")

    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

    fun asUser(): UserRecipient = user.getOrThrow("user")

    fun asSlack(): SlackRecipient = slack.getOrThrow("slack")

    fun asMsTeams(): MsTeamsRecipient = msTeams.getOrThrow("msTeams")

    fun asData(): RecipientData = data.getOrThrow("data")

    fun asPagerduty(): PagerdutyRecipient = pagerduty.getOrThrow("pagerduty")

    fun asWebhook(): WebhookRecipient = webhook.getOrThrow("webhook")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            audience != null -> visitor.visitAudience(audience)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
            user != null -> visitor.visitUser(user)
            slack != null -> visitor.visitSlack(slack)
            msTeams != null -> visitor.visitMsTeams(msTeams)
            data != null -> visitor.visitData(data)
            pagerduty != null -> visitor.visitPagerduty(pagerduty)
            webhook != null -> visitor.visitWebhook(webhook)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Recipient = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAudience(audience: AudienceRecipient) {
                    audience.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }

                override fun visitUnionMember2(unionMember2: UnionMember2) {
                    unionMember2.validate()
                }

                override fun visitUser(user: UserRecipient) {
                    user.validate()
                }

                override fun visitSlack(slack: SlackRecipient) {
                    slack.validate()
                }

                override fun visitMsTeams(msTeams: MsTeamsRecipient) {
                    msTeams.validate()
                }

                override fun visitData(data: RecipientData) {
                    data.validate()
                }

                override fun visitPagerduty(pagerduty: PagerdutyRecipient) {
                    pagerduty.validate()
                }

                override fun visitWebhook(webhook: WebhookRecipient) {
                    webhook.validate()
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
                override fun visitAudience(audience: AudienceRecipient) = audience.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun visitUnionMember2(unionMember2: UnionMember2) = unionMember2.validity()

                override fun visitUser(user: UserRecipient) = user.validity()

                override fun visitSlack(slack: SlackRecipient) = slack.validity()

                override fun visitMsTeams(msTeams: MsTeamsRecipient) = msTeams.validity()

                override fun visitData(data: RecipientData) = data.validity()

                override fun visitPagerduty(pagerduty: PagerdutyRecipient) = pagerduty.validity()

                override fun visitWebhook(webhook: WebhookRecipient) = webhook.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Recipient &&
            audience == other.audience &&
            unionMember1 == other.unionMember1 &&
            unionMember2 == other.unionMember2 &&
            user == other.user &&
            slack == other.slack &&
            msTeams == other.msTeams &&
            data == other.data &&
            pagerduty == other.pagerduty &&
            webhook == other.webhook
    }

    override fun hashCode(): Int =
        Objects.hash(
            audience,
            unionMember1,
            unionMember2,
            user,
            slack,
            msTeams,
            data,
            pagerduty,
            webhook,
        )

    override fun toString(): String =
        when {
            audience != null -> "Recipient{audience=$audience}"
            unionMember1 != null -> "Recipient{unionMember1=$unionMember1}"
            unionMember2 != null -> "Recipient{unionMember2=$unionMember2}"
            user != null -> "Recipient{user=$user}"
            slack != null -> "Recipient{slack=$slack}"
            msTeams != null -> "Recipient{msTeams=$msTeams}"
            data != null -> "Recipient{data=$data}"
            pagerduty != null -> "Recipient{pagerduty=$pagerduty}"
            webhook != null -> "Recipient{webhook=$webhook}"
            _json != null -> "Recipient{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Recipient")
        }

    companion object {

        @JvmStatic fun ofAudience(audience: AudienceRecipient) = Recipient(audience = audience)

        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) = Recipient(unionMember1 = unionMember1)

        @JvmStatic
        fun ofUnionMember2(unionMember2: UnionMember2) = Recipient(unionMember2 = unionMember2)

        @JvmStatic fun ofUser(user: UserRecipient) = Recipient(user = user)

        @JvmStatic fun ofSlack(slack: SlackRecipient) = Recipient(slack = slack)

        @JvmStatic fun ofMsTeams(msTeams: MsTeamsRecipient) = Recipient(msTeams = msTeams)

        @JvmStatic fun ofData(data: RecipientData) = Recipient(data = data)

        @JvmStatic fun ofPagerduty(pagerduty: PagerdutyRecipient) = Recipient(pagerduty = pagerduty)

        @JvmStatic fun ofWebhook(webhook: WebhookRecipient) = Recipient(webhook = webhook)
    }

    /** An interface that defines how to map each variant of [Recipient] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitAudience(audience: AudienceRecipient): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        fun visitUnionMember2(unionMember2: UnionMember2): T

        fun visitUser(user: UserRecipient): T

        fun visitSlack(slack: SlackRecipient): T

        fun visitMsTeams(msTeams: MsTeamsRecipient): T

        fun visitData(data: RecipientData): T

        fun visitPagerduty(pagerduty: PagerdutyRecipient): T

        fun visitWebhook(webhook: WebhookRecipient): T

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
                        tryDeserialize(node, jacksonTypeRef<AudienceRecipient>())?.let {
                            Recipient(audience = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            Recipient(unionMember1 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                            Recipient(unionMember2 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UserRecipient>())?.let {
                            Recipient(user = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SlackRecipient>())?.let {
                            Recipient(slack = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MsTeamsRecipient>())?.let {
                            Recipient(msTeams = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RecipientData>())?.let {
                            Recipient(data = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PagerdutyRecipient>())?.let {
                            Recipient(pagerduty = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<WebhookRecipient>())?.let {
                            Recipient(webhook = it, _json = json)
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
                value.audience != null -> generator.writeObject(value.audience)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                value.user != null -> generator.writeObject(value.user)
                value.slack != null -> generator.writeObject(value.slack)
                value.msTeams != null -> generator.writeObject(value.msTeams)
                value.data != null -> generator.writeObject(value.data)
                value.pagerduty != null -> generator.writeObject(value.pagerduty)
                value.webhook != null -> generator.writeObject(value.webhook)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Recipient")
            }
        }
    }

    class AudienceRecipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audienceId: JsonField<String>,
        private val data: JsonField<Data>,
        private val filters: JsonField<List<Filter>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audience_id")
            @ExcludeMissing
            audienceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
        ) : this(audienceId, data, filters, mutableMapOf())

        /**
         * A unique identifier associated with an Audience. A message will be sent to each user in
         * the audience.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun audienceId(): String = audienceId.getRequired("audience_id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

        /**
         * Returns the raw JSON value of [audienceId].
         *
         * Unlike [audienceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audience_id")
        @ExcludeMissing
        fun _audienceId(): JsonField<String> = audienceId

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

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
             * Returns a mutable builder for constructing an instance of [AudienceRecipient].
             *
             * The following fields are required:
             * ```java
             * .audienceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AudienceRecipient]. */
        class Builder internal constructor() {

            private var audienceId: JsonField<String>? = null
            private var data: JsonField<Data> = JsonMissing.of()
            private var filters: JsonField<MutableList<Filter>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(audienceRecipient: AudienceRecipient) = apply {
                audienceId = audienceRecipient.audienceId
                data = audienceRecipient.data
                filters = audienceRecipient.filters.map { it.toMutableList() }
                additionalProperties = audienceRecipient.additionalProperties.toMutableMap()
            }

            /**
             * A unique identifier associated with an Audience. A message will be sent to each user
             * in the audience.
             */
            fun audienceId(audienceId: String) = audienceId(JsonField.of(audienceId))

            /**
             * Sets [Builder.audienceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audienceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audienceId(audienceId: JsonField<String>) = apply { this.audienceId = audienceId }

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

            fun filters(filters: List<Filter>?) = filters(JsonField.ofNullable(filters))

            /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
            fun filters(filters: Optional<List<Filter>>) = filters(filters.getOrNull())

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
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
             * Returns an immutable instance of [AudienceRecipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .audienceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AudienceRecipient =
                AudienceRecipient(
                    checkRequired("audienceId", audienceId),
                    data,
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AudienceRecipient = apply {
            if (validated) {
                return@apply
            }

            audienceId()
            data().ifPresent { it.validate() }
            filters().ifPresent { it.forEach { it.validate() } }
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
            (if (audienceId.asKnown().isPresent) 1 else 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        class Filter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val operator: JsonField<Operator>,
            private val path: JsonField<Path>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("path") @ExcludeMissing path: JsonField<Path> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(operator, path, value, mutableMapOf())

            /**
             * Send to users only if they are member of the account
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun path(): Path = path.getRequired("path")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<Path> = path

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```java
                 * .operator()
                 * .path()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var operator: JsonField<Operator>? = null
                private var path: JsonField<Path>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(filter: Filter) = apply {
                    operator = filter.operator
                    path = filter.path
                    value = filter.value
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** Send to users only if they are member of the account */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun path(path: Path) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [Path] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<Path>) = apply { this.path = path }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .operator()
                 * .path()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("operator", operator),
                        checkRequired("path", path),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                operator().validate()
                path().validate()
                value()
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
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (path.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            /** Send to users only if they are member of the account */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MEMBER_OF = of("MEMBER_OF")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    MEMBER_OF
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MEMBER_OF,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MEMBER_OF -> Value.MEMBER_OF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MEMBER_OF -> Known.MEMBER_OF
                        else -> throw CourierInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Path @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT_ID = of("account_id")

                    @JvmStatic fun of(value: String) = Path(JsonField.of(value))
                }

                /** An enum containing [Path]'s known values. */
                enum class Known {
                    ACCOUNT_ID
                }

                /**
                 * An enum containing [Path]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Path] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT_ID,
                    /**
                     * An enum member indicating that [Path] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT_ID -> Value.ACCOUNT_ID
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACCOUNT_ID -> Known.ACCOUNT_ID
                        else -> throw CourierInvalidDataException("Unknown Path: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Path = apply {
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

                    return other is Path && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filter &&
                    operator == other.operator &&
                    path == other.path &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(operator, path, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{operator=$operator, path=$path, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AudienceRecipient &&
                audienceId == other.audienceId &&
                data == other.data &&
                filters == other.filters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(audienceId, data, filters, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AudienceRecipient{audienceId=$audienceId, data=$data, filters=$filters, additionalProperties=$additionalProperties}"
    }

    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<Data>,
        private val filters: JsonField<List<Filter>>,
        private val listId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("list_id") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        ) : this(data, filters, listId, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

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
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

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

            /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var data: JsonField<Data> = JsonMissing.of()
            private var filters: JsonField<MutableList<Filter>>? = null
            private var listId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                data = unionMember1.data
                filters = unionMember1.filters.map { it.toMutableList() }
                listId = unionMember1.listId
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
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

            fun filters(filters: List<Filter>?) = filters(JsonField.ofNullable(filters))

            /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
            fun filters(filters: Optional<List<Filter>>) = filters(filters.getOrNull())

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember1 =
                UnionMember1(
                    data,
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    listId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            data().ifPresent { it.validate() }
            filters().ifPresent { it.forEach { it.validate() } }
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
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
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

        class Filter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val operator: JsonField<Operator>,
            private val path: JsonField<Path>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("path") @ExcludeMissing path: JsonField<Path> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(operator, path, value, mutableMapOf())

            /**
             * Send to users only if they are member of the account
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun path(): Path = path.getRequired("path")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<Path> = path

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```java
                 * .operator()
                 * .path()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var operator: JsonField<Operator>? = null
                private var path: JsonField<Path>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(filter: Filter) = apply {
                    operator = filter.operator
                    path = filter.path
                    value = filter.value
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** Send to users only if they are member of the account */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun path(path: Path) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [Path] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<Path>) = apply { this.path = path }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .operator()
                 * .path()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("operator", operator),
                        checkRequired("path", path),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                operator().validate()
                path().validate()
                value()
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
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (path.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            /** Send to users only if they are member of the account */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MEMBER_OF = of("MEMBER_OF")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    MEMBER_OF
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MEMBER_OF,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MEMBER_OF -> Value.MEMBER_OF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MEMBER_OF -> Known.MEMBER_OF
                        else -> throw CourierInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Path @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT_ID = of("account_id")

                    @JvmStatic fun of(value: String) = Path(JsonField.of(value))
                }

                /** An enum containing [Path]'s known values. */
                enum class Known {
                    ACCOUNT_ID
                }

                /**
                 * An enum containing [Path]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Path] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT_ID,
                    /**
                     * An enum member indicating that [Path] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT_ID -> Value.ACCOUNT_ID
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACCOUNT_ID -> Known.ACCOUNT_ID
                        else -> throw CourierInvalidDataException("Unknown Path: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Path = apply {
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

                    return other is Path && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filter &&
                    operator == other.operator &&
                    path == other.path &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(operator, path, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{operator=$operator, path=$path, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 &&
                data == other.data &&
                filters == other.filters &&
                listId == other.listId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(data, filters, listId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{data=$data, filters=$filters, listId=$listId, additionalProperties=$additionalProperties}"
    }

    class UnionMember2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<Data>,
        private val listPattern: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("list_pattern")
            @ExcludeMissing
            listPattern: JsonField<String> = JsonMissing.of(),
        ) : this(data, listPattern, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun listPattern(): Optional<String> = listPattern.getOptional("list_pattern")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [listPattern].
         *
         * Unlike [listPattern], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("list_pattern")
        @ExcludeMissing
        fun _listPattern(): JsonField<String> = listPattern

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

            /** Returns a mutable builder for constructing an instance of [UnionMember2]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember2]. */
        class Builder internal constructor() {

            private var data: JsonField<Data> = JsonMissing.of()
            private var listPattern: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember2: UnionMember2) = apply {
                data = unionMember2.data
                listPattern = unionMember2.listPattern
                additionalProperties = unionMember2.additionalProperties.toMutableMap()
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

            fun listPattern(listPattern: String?) = listPattern(JsonField.ofNullable(listPattern))

            /** Alias for calling [Builder.listPattern] with `listPattern.orElse(null)`. */
            fun listPattern(listPattern: Optional<String>) = listPattern(listPattern.getOrNull())

            /**
             * Sets [Builder.listPattern] to an arbitrary JSON value.
             *
             * You should usually call [Builder.listPattern] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun listPattern(listPattern: JsonField<String>) = apply {
                this.listPattern = listPattern
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
             * Returns an immutable instance of [UnionMember2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember2 =
                UnionMember2(data, listPattern, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): UnionMember2 = apply {
            if (validated) {
                return@apply
            }

            data().ifPresent { it.validate() }
            listPattern()
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
                (if (listPattern.asKnown().isPresent) 1 else 0)

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

            return other is UnionMember2 &&
                data == other.data &&
                listPattern == other.listPattern &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, listPattern, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember2{data=$data, listPattern=$listPattern, additionalProperties=$additionalProperties}"
    }

    class SlackRecipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val slack: JsonField<Slack>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("slack") @ExcludeMissing slack: JsonField<Slack> = JsonMissing.of()
        ) : this(slack, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slack(): Slack = slack.getRequired("slack")

        /**
         * Returns the raw JSON value of [slack].
         *
         * Unlike [slack], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slack") @ExcludeMissing fun _slack(): JsonField<Slack> = slack

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
             * Returns a mutable builder for constructing an instance of [SlackRecipient].
             *
             * The following fields are required:
             * ```java
             * .slack()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SlackRecipient]. */
        class Builder internal constructor() {

            private var slack: JsonField<Slack>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(slackRecipient: SlackRecipient) = apply {
                slack = slackRecipient.slack
                additionalProperties = slackRecipient.additionalProperties.toMutableMap()
            }

            fun slack(slack: Slack) = slack(JsonField.of(slack))

            /**
             * Sets [Builder.slack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slack] with a well-typed [Slack] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slack(slack: JsonField<Slack>) = apply { this.slack = slack }

            /** Alias for calling [slack] with `Slack.ofSendToSlackChannel(sendToSlackChannel)`. */
            fun slack(sendToSlackChannel: Slack.SendToSlackChannel) =
                slack(Slack.ofSendToSlackChannel(sendToSlackChannel))

            /** Alias for calling [slack] with `Slack.ofSendToSlackEmail(sendToSlackEmail)`. */
            fun slack(sendToSlackEmail: Slack.SendToSlackEmail) =
                slack(Slack.ofSendToSlackEmail(sendToSlackEmail))

            /** Alias for calling [slack] with `Slack.ofSendToSlackUserId(sendToSlackUserId)`. */
            fun slack(sendToSlackUserId: Slack.SendToSlackUserId) =
                slack(Slack.ofSendToSlackUserId(sendToSlackUserId))

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
             * Returns an immutable instance of [SlackRecipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .slack()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SlackRecipient =
                SlackRecipient(checkRequired("slack", slack), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SlackRecipient = apply {
            if (validated) {
                return@apply
            }

            slack().validate()
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
        @JvmSynthetic internal fun validity(): Int = (slack.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = Slack.Deserializer::class)
        @JsonSerialize(using = Slack.Serializer::class)
        class Slack
        private constructor(
            private val sendToSlackChannel: SendToSlackChannel? = null,
            private val sendToSlackEmail: SendToSlackEmail? = null,
            private val sendToSlackUserId: SendToSlackUserId? = null,
            private val _json: JsonValue? = null,
        ) {

            fun sendToSlackChannel(): Optional<SendToSlackChannel> =
                Optional.ofNullable(sendToSlackChannel)

            fun sendToSlackEmail(): Optional<SendToSlackEmail> =
                Optional.ofNullable(sendToSlackEmail)

            fun sendToSlackUserId(): Optional<SendToSlackUserId> =
                Optional.ofNullable(sendToSlackUserId)

            fun isSendToSlackChannel(): Boolean = sendToSlackChannel != null

            fun isSendToSlackEmail(): Boolean = sendToSlackEmail != null

            fun isSendToSlackUserId(): Boolean = sendToSlackUserId != null

            fun asSendToSlackChannel(): SendToSlackChannel =
                sendToSlackChannel.getOrThrow("sendToSlackChannel")

            fun asSendToSlackEmail(): SendToSlackEmail =
                sendToSlackEmail.getOrThrow("sendToSlackEmail")

            fun asSendToSlackUserId(): SendToSlackUserId =
                sendToSlackUserId.getOrThrow("sendToSlackUserId")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sendToSlackChannel != null ->
                        visitor.visitSendToSlackChannel(sendToSlackChannel)
                    sendToSlackEmail != null -> visitor.visitSendToSlackEmail(sendToSlackEmail)
                    sendToSlackUserId != null -> visitor.visitSendToSlackUserId(sendToSlackUserId)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Slack = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSendToSlackChannel(
                            sendToSlackChannel: SendToSlackChannel
                        ) {
                            sendToSlackChannel.validate()
                        }

                        override fun visitSendToSlackEmail(sendToSlackEmail: SendToSlackEmail) {
                            sendToSlackEmail.validate()
                        }

                        override fun visitSendToSlackUserId(sendToSlackUserId: SendToSlackUserId) {
                            sendToSlackUserId.validate()
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
                        override fun visitSendToSlackChannel(
                            sendToSlackChannel: SendToSlackChannel
                        ) = sendToSlackChannel.validity()

                        override fun visitSendToSlackEmail(sendToSlackEmail: SendToSlackEmail) =
                            sendToSlackEmail.validity()

                        override fun visitSendToSlackUserId(sendToSlackUserId: SendToSlackUserId) =
                            sendToSlackUserId.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Slack &&
                    sendToSlackChannel == other.sendToSlackChannel &&
                    sendToSlackEmail == other.sendToSlackEmail &&
                    sendToSlackUserId == other.sendToSlackUserId
            }

            override fun hashCode(): Int =
                Objects.hash(sendToSlackChannel, sendToSlackEmail, sendToSlackUserId)

            override fun toString(): String =
                when {
                    sendToSlackChannel != null -> "Slack{sendToSlackChannel=$sendToSlackChannel}"
                    sendToSlackEmail != null -> "Slack{sendToSlackEmail=$sendToSlackEmail}"
                    sendToSlackUserId != null -> "Slack{sendToSlackUserId=$sendToSlackUserId}"
                    _json != null -> "Slack{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Slack")
                }

            companion object {

                @JvmStatic
                fun ofSendToSlackChannel(sendToSlackChannel: SendToSlackChannel) =
                    Slack(sendToSlackChannel = sendToSlackChannel)

                @JvmStatic
                fun ofSendToSlackEmail(sendToSlackEmail: SendToSlackEmail) =
                    Slack(sendToSlackEmail = sendToSlackEmail)

                @JvmStatic
                fun ofSendToSlackUserId(sendToSlackUserId: SendToSlackUserId) =
                    Slack(sendToSlackUserId = sendToSlackUserId)
            }

            /**
             * An interface that defines how to map each variant of [Slack] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSendToSlackChannel(sendToSlackChannel: SendToSlackChannel): T

                fun visitSendToSlackEmail(sendToSlackEmail: SendToSlackEmail): T

                fun visitSendToSlackUserId(sendToSlackUserId: SendToSlackUserId): T

                /**
                 * Maps an unknown variant of [Slack] to a value of type [T].
                 *
                 * An instance of [Slack] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws CourierInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw CourierInvalidDataException("Unknown Slack: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Slack>(Slack::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Slack {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<SendToSlackChannel>())?.let {
                                    Slack(sendToSlackChannel = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<SendToSlackEmail>())?.let {
                                    Slack(sendToSlackEmail = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<SendToSlackUserId>())?.let {
                                    Slack(sendToSlackUserId = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Slack(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Slack>(Slack::class) {

                override fun serialize(
                    value: Slack,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sendToSlackChannel != null ->
                            generator.writeObject(value.sendToSlackChannel)
                        value.sendToSlackEmail != null ->
                            generator.writeObject(value.sendToSlackEmail)
                        value.sendToSlackUserId != null ->
                            generator.writeObject(value.sendToSlackUserId)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Slack")
                    }
                }
            }

            class SendToSlackChannel
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessToken: JsonField<String>,
                private val channel: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_token")
                    @ExcludeMissing
                    accessToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("channel")
                    @ExcludeMissing
                    channel: JsonField<String> = JsonMissing.of(),
                ) : this(accessToken, channel, mutableMapOf())

                fun toSlackBaseProperties(): SlackBaseProperties =
                    SlackBaseProperties.builder().accessToken(accessToken).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessToken(): String = accessToken.getRequired("access_token")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun channel(): String = channel.getRequired("channel")

                /**
                 * Returns the raw JSON value of [accessToken].
                 *
                 * Unlike [accessToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_token")
                @ExcludeMissing
                fun _accessToken(): JsonField<String> = accessToken

                /**
                 * Returns the raw JSON value of [channel].
                 *
                 * Unlike [channel], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

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
                     * [SendToSlackChannel].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessToken()
                     * .channel()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToSlackChannel]. */
                class Builder internal constructor() {

                    private var accessToken: JsonField<String>? = null
                    private var channel: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToSlackChannel: SendToSlackChannel) = apply {
                        accessToken = sendToSlackChannel.accessToken
                        channel = sendToSlackChannel.channel
                        additionalProperties =
                            sendToSlackChannel.additionalProperties.toMutableMap()
                    }

                    fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

                    /**
                     * Sets [Builder.accessToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessToken(accessToken: JsonField<String>) = apply {
                        this.accessToken = accessToken
                    }

                    fun channel(channel: String) = channel(JsonField.of(channel))

                    /**
                     * Sets [Builder.channel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channel] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channel(channel: JsonField<String>) = apply { this.channel = channel }

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
                     * Returns an immutable instance of [SendToSlackChannel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessToken()
                     * .channel()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToSlackChannel =
                        SendToSlackChannel(
                            checkRequired("accessToken", accessToken),
                            checkRequired("channel", channel),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToSlackChannel = apply {
                    if (validated) {
                        return@apply
                    }

                    accessToken()
                    channel()
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
                    (if (accessToken.asKnown().isPresent) 1 else 0) +
                        (if (channel.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToSlackChannel &&
                        accessToken == other.accessToken &&
                        channel == other.channel &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessToken, channel, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToSlackChannel{accessToken=$accessToken, channel=$channel, additionalProperties=$additionalProperties}"
            }

            class SendToSlackEmail
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessToken: JsonField<String>,
                private val email: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_token")
                    @ExcludeMissing
                    accessToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                ) : this(accessToken, email, mutableMapOf())

                fun toSlackBaseProperties(): SlackBaseProperties =
                    SlackBaseProperties.builder().accessToken(accessToken).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessToken(): String = accessToken.getRequired("access_token")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun email(): String = email.getRequired("email")

                /**
                 * Returns the raw JSON value of [accessToken].
                 *
                 * Unlike [accessToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_token")
                @ExcludeMissing
                fun _accessToken(): JsonField<String> = accessToken

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                     * Returns a mutable builder for constructing an instance of [SendToSlackEmail].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessToken()
                     * .email()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToSlackEmail]. */
                class Builder internal constructor() {

                    private var accessToken: JsonField<String>? = null
                    private var email: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToSlackEmail: SendToSlackEmail) = apply {
                        accessToken = sendToSlackEmail.accessToken
                        email = sendToSlackEmail.email
                        additionalProperties = sendToSlackEmail.additionalProperties.toMutableMap()
                    }

                    fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

                    /**
                     * Sets [Builder.accessToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessToken(accessToken: JsonField<String>) = apply {
                        this.accessToken = accessToken
                    }

                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

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
                     * Returns an immutable instance of [SendToSlackEmail].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessToken()
                     * .email()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToSlackEmail =
                        SendToSlackEmail(
                            checkRequired("accessToken", accessToken),
                            checkRequired("email", email),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToSlackEmail = apply {
                    if (validated) {
                        return@apply
                    }

                    accessToken()
                    email()
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
                    (if (accessToken.asKnown().isPresent) 1 else 0) +
                        (if (email.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToSlackEmail &&
                        accessToken == other.accessToken &&
                        email == other.email &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessToken, email, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToSlackEmail{accessToken=$accessToken, email=$email, additionalProperties=$additionalProperties}"
            }

            class SendToSlackUserId
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessToken: JsonField<String>,
                private val userId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_token")
                    @ExcludeMissing
                    accessToken: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("user_id")
                    @ExcludeMissing
                    userId: JsonField<String> = JsonMissing.of(),
                ) : this(accessToken, userId, mutableMapOf())

                fun toSlackBaseProperties(): SlackBaseProperties =
                    SlackBaseProperties.builder().accessToken(accessToken).build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessToken(): String = accessToken.getRequired("access_token")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun userId(): String = userId.getRequired("user_id")

                /**
                 * Returns the raw JSON value of [accessToken].
                 *
                 * Unlike [accessToken], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_token")
                @ExcludeMissing
                fun _accessToken(): JsonField<String> = accessToken

                /**
                 * Returns the raw JSON value of [userId].
                 *
                 * Unlike [userId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
                     * [SendToSlackUserId].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessToken()
                     * .userId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToSlackUserId]. */
                class Builder internal constructor() {

                    private var accessToken: JsonField<String>? = null
                    private var userId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToSlackUserId: SendToSlackUserId) = apply {
                        accessToken = sendToSlackUserId.accessToken
                        userId = sendToSlackUserId.userId
                        additionalProperties = sendToSlackUserId.additionalProperties.toMutableMap()
                    }

                    fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

                    /**
                     * Sets [Builder.accessToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessToken] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessToken(accessToken: JsonField<String>) = apply {
                        this.accessToken = accessToken
                    }

                    fun userId(userId: String) = userId(JsonField.of(userId))

                    /**
                     * Sets [Builder.userId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
                     * Returns an immutable instance of [SendToSlackUserId].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessToken()
                     * .userId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToSlackUserId =
                        SendToSlackUserId(
                            checkRequired("accessToken", accessToken),
                            checkRequired("userId", userId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToSlackUserId = apply {
                    if (validated) {
                        return@apply
                    }

                    accessToken()
                    userId()
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
                    (if (accessToken.asKnown().isPresent) 1 else 0) +
                        (if (userId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToSlackUserId &&
                        accessToken == other.accessToken &&
                        userId == other.userId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessToken, userId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToSlackUserId{accessToken=$accessToken, userId=$userId, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SlackRecipient &&
                slack == other.slack &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(slack, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SlackRecipient{slack=$slack, additionalProperties=$additionalProperties}"
    }

    class MsTeamsRecipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val msTeams: JsonField<MsTeams>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ms_teams") @ExcludeMissing msTeams: JsonField<MsTeams> = JsonMissing.of()
        ) : this(msTeams, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun msTeams(): MsTeams = msTeams.getRequired("ms_teams")

        /**
         * Returns the raw JSON value of [msTeams].
         *
         * Unlike [msTeams], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ms_teams") @ExcludeMissing fun _msTeams(): JsonField<MsTeams> = msTeams

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
             * Returns a mutable builder for constructing an instance of [MsTeamsRecipient].
             *
             * The following fields are required:
             * ```java
             * .msTeams()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MsTeamsRecipient]. */
        class Builder internal constructor() {

            private var msTeams: JsonField<MsTeams>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(msTeamsRecipient: MsTeamsRecipient) = apply {
                msTeams = msTeamsRecipient.msTeams
                additionalProperties = msTeamsRecipient.additionalProperties.toMutableMap()
            }

            fun msTeams(msTeams: MsTeams) = msTeams(JsonField.of(msTeams))

            /**
             * Sets [Builder.msTeams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msTeams] with a well-typed [MsTeams] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msTeams(msTeams: JsonField<MsTeams>) = apply { this.msTeams = msTeams }

            /**
             * Alias for calling [msTeams] with
             * `MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId)`.
             */
            fun msTeams(sendToMsTeamsUserId: MsTeams.SendToMsTeamsUserId) =
                msTeams(MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId))

            /**
             * Alias for calling [msTeams] with `MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail)`.
             */
            fun msTeams(sendToMsTeamsEmail: MsTeams.SendToMsTeamsEmail) =
                msTeams(MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail))

            /**
             * Alias for calling [msTeams] with
             * `MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId)`.
             */
            fun msTeams(sendToMsTeamsChannelId: MsTeams.SendToMsTeamsChannelId) =
                msTeams(MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId))

            /**
             * Alias for calling [msTeams] with
             * `MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId)`.
             */
            fun msTeams(sendToMsTeamsConversationId: MsTeams.SendToMsTeamsConversationId) =
                msTeams(MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId))

            /**
             * Alias for calling [msTeams] with
             * `MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName)`.
             */
            fun msTeams(sendToMsTeamsChannelName: MsTeams.SendToMsTeamsChannelName) =
                msTeams(MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName))

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
             * Returns an immutable instance of [MsTeamsRecipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .msTeams()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MsTeamsRecipient =
                MsTeamsRecipient(
                    checkRequired("msTeams", msTeams),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MsTeamsRecipient = apply {
            if (validated) {
                return@apply
            }

            msTeams().validate()
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
        internal fun validity(): Int = (msTeams.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = MsTeams.Deserializer::class)
        @JsonSerialize(using = MsTeams.Serializer::class)
        class MsTeams
        private constructor(
            private val sendToMsTeamsUserId: SendToMsTeamsUserId? = null,
            private val sendToMsTeamsEmail: SendToMsTeamsEmail? = null,
            private val sendToMsTeamsChannelId: SendToMsTeamsChannelId? = null,
            private val sendToMsTeamsConversationId: SendToMsTeamsConversationId? = null,
            private val sendToMsTeamsChannelName: SendToMsTeamsChannelName? = null,
            private val _json: JsonValue? = null,
        ) {

            fun sendToMsTeamsUserId(): Optional<SendToMsTeamsUserId> =
                Optional.ofNullable(sendToMsTeamsUserId)

            fun sendToMsTeamsEmail(): Optional<SendToMsTeamsEmail> =
                Optional.ofNullable(sendToMsTeamsEmail)

            fun sendToMsTeamsChannelId(): Optional<SendToMsTeamsChannelId> =
                Optional.ofNullable(sendToMsTeamsChannelId)

            fun sendToMsTeamsConversationId(): Optional<SendToMsTeamsConversationId> =
                Optional.ofNullable(sendToMsTeamsConversationId)

            fun sendToMsTeamsChannelName(): Optional<SendToMsTeamsChannelName> =
                Optional.ofNullable(sendToMsTeamsChannelName)

            fun isSendToMsTeamsUserId(): Boolean = sendToMsTeamsUserId != null

            fun isSendToMsTeamsEmail(): Boolean = sendToMsTeamsEmail != null

            fun isSendToMsTeamsChannelId(): Boolean = sendToMsTeamsChannelId != null

            fun isSendToMsTeamsConversationId(): Boolean = sendToMsTeamsConversationId != null

            fun isSendToMsTeamsChannelName(): Boolean = sendToMsTeamsChannelName != null

            fun asSendToMsTeamsUserId(): SendToMsTeamsUserId =
                sendToMsTeamsUserId.getOrThrow("sendToMsTeamsUserId")

            fun asSendToMsTeamsEmail(): SendToMsTeamsEmail =
                sendToMsTeamsEmail.getOrThrow("sendToMsTeamsEmail")

            fun asSendToMsTeamsChannelId(): SendToMsTeamsChannelId =
                sendToMsTeamsChannelId.getOrThrow("sendToMsTeamsChannelId")

            fun asSendToMsTeamsConversationId(): SendToMsTeamsConversationId =
                sendToMsTeamsConversationId.getOrThrow("sendToMsTeamsConversationId")

            fun asSendToMsTeamsChannelName(): SendToMsTeamsChannelName =
                sendToMsTeamsChannelName.getOrThrow("sendToMsTeamsChannelName")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sendToMsTeamsUserId != null ->
                        visitor.visitSendToMsTeamsUserId(sendToMsTeamsUserId)
                    sendToMsTeamsEmail != null ->
                        visitor.visitSendToMsTeamsEmail(sendToMsTeamsEmail)
                    sendToMsTeamsChannelId != null ->
                        visitor.visitSendToMsTeamsChannelId(sendToMsTeamsChannelId)
                    sendToMsTeamsConversationId != null ->
                        visitor.visitSendToMsTeamsConversationId(sendToMsTeamsConversationId)
                    sendToMsTeamsChannelName != null ->
                        visitor.visitSendToMsTeamsChannelName(sendToMsTeamsChannelName)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): MsTeams = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSendToMsTeamsUserId(
                            sendToMsTeamsUserId: SendToMsTeamsUserId
                        ) {
                            sendToMsTeamsUserId.validate()
                        }

                        override fun visitSendToMsTeamsEmail(
                            sendToMsTeamsEmail: SendToMsTeamsEmail
                        ) {
                            sendToMsTeamsEmail.validate()
                        }

                        override fun visitSendToMsTeamsChannelId(
                            sendToMsTeamsChannelId: SendToMsTeamsChannelId
                        ) {
                            sendToMsTeamsChannelId.validate()
                        }

                        override fun visitSendToMsTeamsConversationId(
                            sendToMsTeamsConversationId: SendToMsTeamsConversationId
                        ) {
                            sendToMsTeamsConversationId.validate()
                        }

                        override fun visitSendToMsTeamsChannelName(
                            sendToMsTeamsChannelName: SendToMsTeamsChannelName
                        ) {
                            sendToMsTeamsChannelName.validate()
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
                        override fun visitSendToMsTeamsUserId(
                            sendToMsTeamsUserId: SendToMsTeamsUserId
                        ) = sendToMsTeamsUserId.validity()

                        override fun visitSendToMsTeamsEmail(
                            sendToMsTeamsEmail: SendToMsTeamsEmail
                        ) = sendToMsTeamsEmail.validity()

                        override fun visitSendToMsTeamsChannelId(
                            sendToMsTeamsChannelId: SendToMsTeamsChannelId
                        ) = sendToMsTeamsChannelId.validity()

                        override fun visitSendToMsTeamsConversationId(
                            sendToMsTeamsConversationId: SendToMsTeamsConversationId
                        ) = sendToMsTeamsConversationId.validity()

                        override fun visitSendToMsTeamsChannelName(
                            sendToMsTeamsChannelName: SendToMsTeamsChannelName
                        ) = sendToMsTeamsChannelName.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MsTeams &&
                    sendToMsTeamsUserId == other.sendToMsTeamsUserId &&
                    sendToMsTeamsEmail == other.sendToMsTeamsEmail &&
                    sendToMsTeamsChannelId == other.sendToMsTeamsChannelId &&
                    sendToMsTeamsConversationId == other.sendToMsTeamsConversationId &&
                    sendToMsTeamsChannelName == other.sendToMsTeamsChannelName
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sendToMsTeamsUserId,
                    sendToMsTeamsEmail,
                    sendToMsTeamsChannelId,
                    sendToMsTeamsConversationId,
                    sendToMsTeamsChannelName,
                )

            override fun toString(): String =
                when {
                    sendToMsTeamsUserId != null ->
                        "MsTeams{sendToMsTeamsUserId=$sendToMsTeamsUserId}"
                    sendToMsTeamsEmail != null -> "MsTeams{sendToMsTeamsEmail=$sendToMsTeamsEmail}"
                    sendToMsTeamsChannelId != null ->
                        "MsTeams{sendToMsTeamsChannelId=$sendToMsTeamsChannelId}"
                    sendToMsTeamsConversationId != null ->
                        "MsTeams{sendToMsTeamsConversationId=$sendToMsTeamsConversationId}"
                    sendToMsTeamsChannelName != null ->
                        "MsTeams{sendToMsTeamsChannelName=$sendToMsTeamsChannelName}"
                    _json != null -> "MsTeams{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid MsTeams")
                }

            companion object {

                @JvmStatic
                fun ofSendToMsTeamsUserId(sendToMsTeamsUserId: SendToMsTeamsUserId) =
                    MsTeams(sendToMsTeamsUserId = sendToMsTeamsUserId)

                @JvmStatic
                fun ofSendToMsTeamsEmail(sendToMsTeamsEmail: SendToMsTeamsEmail) =
                    MsTeams(sendToMsTeamsEmail = sendToMsTeamsEmail)

                @JvmStatic
                fun ofSendToMsTeamsChannelId(sendToMsTeamsChannelId: SendToMsTeamsChannelId) =
                    MsTeams(sendToMsTeamsChannelId = sendToMsTeamsChannelId)

                @JvmStatic
                fun ofSendToMsTeamsConversationId(
                    sendToMsTeamsConversationId: SendToMsTeamsConversationId
                ) = MsTeams(sendToMsTeamsConversationId = sendToMsTeamsConversationId)

                @JvmStatic
                fun ofSendToMsTeamsChannelName(sendToMsTeamsChannelName: SendToMsTeamsChannelName) =
                    MsTeams(sendToMsTeamsChannelName = sendToMsTeamsChannelName)
            }

            /**
             * An interface that defines how to map each variant of [MsTeams] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitSendToMsTeamsUserId(sendToMsTeamsUserId: SendToMsTeamsUserId): T

                fun visitSendToMsTeamsEmail(sendToMsTeamsEmail: SendToMsTeamsEmail): T

                fun visitSendToMsTeamsChannelId(sendToMsTeamsChannelId: SendToMsTeamsChannelId): T

                fun visitSendToMsTeamsConversationId(
                    sendToMsTeamsConversationId: SendToMsTeamsConversationId
                ): T

                fun visitSendToMsTeamsChannelName(
                    sendToMsTeamsChannelName: SendToMsTeamsChannelName
                ): T

                /**
                 * Maps an unknown variant of [MsTeams] to a value of type [T].
                 *
                 * An instance of [MsTeams] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws CourierInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw CourierInvalidDataException("Unknown MsTeams: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<MsTeams>(MsTeams::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): MsTeams {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<SendToMsTeamsUserId>())?.let {
                                    MsTeams(sendToMsTeamsUserId = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<SendToMsTeamsEmail>())?.let {
                                    MsTeams(sendToMsTeamsEmail = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<SendToMsTeamsChannelId>())
                                    ?.let { MsTeams(sendToMsTeamsChannelId = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<SendToMsTeamsConversationId>())
                                    ?.let {
                                        MsTeams(sendToMsTeamsConversationId = it, _json = json)
                                    },
                                tryDeserialize(node, jacksonTypeRef<SendToMsTeamsChannelName>())
                                    ?.let { MsTeams(sendToMsTeamsChannelName = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> MsTeams(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<MsTeams>(MsTeams::class) {

                override fun serialize(
                    value: MsTeams,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sendToMsTeamsUserId != null ->
                            generator.writeObject(value.sendToMsTeamsUserId)
                        value.sendToMsTeamsEmail != null ->
                            generator.writeObject(value.sendToMsTeamsEmail)
                        value.sendToMsTeamsChannelId != null ->
                            generator.writeObject(value.sendToMsTeamsChannelId)
                        value.sendToMsTeamsConversationId != null ->
                            generator.writeObject(value.sendToMsTeamsConversationId)
                        value.sendToMsTeamsChannelName != null ->
                            generator.writeObject(value.sendToMsTeamsChannelName)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid MsTeams")
                    }
                }
            }

            class SendToMsTeamsUserId
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceUrl: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val userId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_url")
                    @ExcludeMissing
                    serviceUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("user_id")
                    @ExcludeMissing
                    userId: JsonField<String> = JsonMissing.of(),
                ) : this(serviceUrl, tenantId, userId, mutableMapOf())

                fun toMsTeamsBaseProperties(): MsTeamsBaseProperties =
                    MsTeamsBaseProperties.builder()
                        .serviceUrl(serviceUrl)
                        .tenantId(tenantId)
                        .build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceUrl(): String = serviceUrl.getRequired("service_url")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun userId(): String = userId.getRequired("user_id")

                /**
                 * Returns the raw JSON value of [serviceUrl].
                 *
                 * Unlike [serviceUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_url")
                @ExcludeMissing
                fun _serviceUrl(): JsonField<String> = serviceUrl

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [userId].
                 *
                 * Unlike [userId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
                     * [SendToMsTeamsUserId].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .userId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToMsTeamsUserId]. */
                class Builder internal constructor() {

                    private var serviceUrl: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var userId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToMsTeamsUserId: SendToMsTeamsUserId) = apply {
                        serviceUrl = sendToMsTeamsUserId.serviceUrl
                        tenantId = sendToMsTeamsUserId.tenantId
                        userId = sendToMsTeamsUserId.userId
                        additionalProperties =
                            sendToMsTeamsUserId.additionalProperties.toMutableMap()
                    }

                    fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

                    /**
                     * Sets [Builder.serviceUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceUrl(serviceUrl: JsonField<String>) = apply {
                        this.serviceUrl = serviceUrl
                    }

                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    fun userId(userId: String) = userId(JsonField.of(userId))

                    /**
                     * Sets [Builder.userId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
                     * Returns an immutable instance of [SendToMsTeamsUserId].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .userId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToMsTeamsUserId =
                        SendToMsTeamsUserId(
                            checkRequired("serviceUrl", serviceUrl),
                            checkRequired("tenantId", tenantId),
                            checkRequired("userId", userId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToMsTeamsUserId = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceUrl()
                    tenantId()
                    userId()
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
                    (if (serviceUrl.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (if (userId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToMsTeamsUserId &&
                        serviceUrl == other.serviceUrl &&
                        tenantId == other.tenantId &&
                        userId == other.userId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceUrl, tenantId, userId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToMsTeamsUserId{serviceUrl=$serviceUrl, tenantId=$tenantId, userId=$userId, additionalProperties=$additionalProperties}"
            }

            class SendToMsTeamsEmail
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceUrl: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val email: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_url")
                    @ExcludeMissing
                    serviceUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                ) : this(serviceUrl, tenantId, email, mutableMapOf())

                fun toMsTeamsBaseProperties(): MsTeamsBaseProperties =
                    MsTeamsBaseProperties.builder()
                        .serviceUrl(serviceUrl)
                        .tenantId(tenantId)
                        .build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceUrl(): String = serviceUrl.getRequired("service_url")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun email(): String = email.getRequired("email")

                /**
                 * Returns the raw JSON value of [serviceUrl].
                 *
                 * Unlike [serviceUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_url")
                @ExcludeMissing
                fun _serviceUrl(): JsonField<String> = serviceUrl

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                     * [SendToMsTeamsEmail].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .email()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToMsTeamsEmail]. */
                class Builder internal constructor() {

                    private var serviceUrl: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var email: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToMsTeamsEmail: SendToMsTeamsEmail) = apply {
                        serviceUrl = sendToMsTeamsEmail.serviceUrl
                        tenantId = sendToMsTeamsEmail.tenantId
                        email = sendToMsTeamsEmail.email
                        additionalProperties =
                            sendToMsTeamsEmail.additionalProperties.toMutableMap()
                    }

                    fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

                    /**
                     * Sets [Builder.serviceUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceUrl(serviceUrl: JsonField<String>) = apply {
                        this.serviceUrl = serviceUrl
                    }

                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

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
                     * Returns an immutable instance of [SendToMsTeamsEmail].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .email()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToMsTeamsEmail =
                        SendToMsTeamsEmail(
                            checkRequired("serviceUrl", serviceUrl),
                            checkRequired("tenantId", tenantId),
                            checkRequired("email", email),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToMsTeamsEmail = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceUrl()
                    tenantId()
                    email()
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
                    (if (serviceUrl.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (if (email.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToMsTeamsEmail &&
                        serviceUrl == other.serviceUrl &&
                        tenantId == other.tenantId &&
                        email == other.email &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceUrl, tenantId, email, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToMsTeamsEmail{serviceUrl=$serviceUrl, tenantId=$tenantId, email=$email, additionalProperties=$additionalProperties}"
            }

            class SendToMsTeamsChannelId
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceUrl: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val channelId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_url")
                    @ExcludeMissing
                    serviceUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("channel_id")
                    @ExcludeMissing
                    channelId: JsonField<String> = JsonMissing.of(),
                ) : this(serviceUrl, tenantId, channelId, mutableMapOf())

                fun toMsTeamsBaseProperties(): MsTeamsBaseProperties =
                    MsTeamsBaseProperties.builder()
                        .serviceUrl(serviceUrl)
                        .tenantId(tenantId)
                        .build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceUrl(): String = serviceUrl.getRequired("service_url")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun channelId(): String = channelId.getRequired("channel_id")

                /**
                 * Returns the raw JSON value of [serviceUrl].
                 *
                 * Unlike [serviceUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_url")
                @ExcludeMissing
                fun _serviceUrl(): JsonField<String> = serviceUrl

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [channelId].
                 *
                 * Unlike [channelId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("channel_id")
                @ExcludeMissing
                fun _channelId(): JsonField<String> = channelId

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
                     * [SendToMsTeamsChannelId].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .channelId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToMsTeamsChannelId]. */
                class Builder internal constructor() {

                    private var serviceUrl: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var channelId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToMsTeamsChannelId: SendToMsTeamsChannelId) = apply {
                        serviceUrl = sendToMsTeamsChannelId.serviceUrl
                        tenantId = sendToMsTeamsChannelId.tenantId
                        channelId = sendToMsTeamsChannelId.channelId
                        additionalProperties =
                            sendToMsTeamsChannelId.additionalProperties.toMutableMap()
                    }

                    fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

                    /**
                     * Sets [Builder.serviceUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceUrl(serviceUrl: JsonField<String>) = apply {
                        this.serviceUrl = serviceUrl
                    }

                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    fun channelId(channelId: String) = channelId(JsonField.of(channelId))

                    /**
                     * Sets [Builder.channelId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channelId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channelId(channelId: JsonField<String>) = apply {
                        this.channelId = channelId
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
                     * Returns an immutable instance of [SendToMsTeamsChannelId].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .channelId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToMsTeamsChannelId =
                        SendToMsTeamsChannelId(
                            checkRequired("serviceUrl", serviceUrl),
                            checkRequired("tenantId", tenantId),
                            checkRequired("channelId", channelId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToMsTeamsChannelId = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceUrl()
                    tenantId()
                    channelId()
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
                    (if (serviceUrl.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (if (channelId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToMsTeamsChannelId &&
                        serviceUrl == other.serviceUrl &&
                        tenantId == other.tenantId &&
                        channelId == other.channelId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceUrl, tenantId, channelId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToMsTeamsChannelId{serviceUrl=$serviceUrl, tenantId=$tenantId, channelId=$channelId, additionalProperties=$additionalProperties}"
            }

            class SendToMsTeamsConversationId
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceUrl: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val conversationId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_url")
                    @ExcludeMissing
                    serviceUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("conversation_id")
                    @ExcludeMissing
                    conversationId: JsonField<String> = JsonMissing.of(),
                ) : this(serviceUrl, tenantId, conversationId, mutableMapOf())

                fun toMsTeamsBaseProperties(): MsTeamsBaseProperties =
                    MsTeamsBaseProperties.builder()
                        .serviceUrl(serviceUrl)
                        .tenantId(tenantId)
                        .build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceUrl(): String = serviceUrl.getRequired("service_url")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun conversationId(): String = conversationId.getRequired("conversation_id")

                /**
                 * Returns the raw JSON value of [serviceUrl].
                 *
                 * Unlike [serviceUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_url")
                @ExcludeMissing
                fun _serviceUrl(): JsonField<String> = serviceUrl

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [conversationId].
                 *
                 * Unlike [conversationId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversation_id")
                @ExcludeMissing
                fun _conversationId(): JsonField<String> = conversationId

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
                     * [SendToMsTeamsConversationId].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .conversationId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToMsTeamsConversationId]. */
                class Builder internal constructor() {

                    private var serviceUrl: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var conversationId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToMsTeamsConversationId: SendToMsTeamsConversationId) =
                        apply {
                            serviceUrl = sendToMsTeamsConversationId.serviceUrl
                            tenantId = sendToMsTeamsConversationId.tenantId
                            conversationId = sendToMsTeamsConversationId.conversationId
                            additionalProperties =
                                sendToMsTeamsConversationId.additionalProperties.toMutableMap()
                        }

                    fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

                    /**
                     * Sets [Builder.serviceUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceUrl(serviceUrl: JsonField<String>) = apply {
                        this.serviceUrl = serviceUrl
                    }

                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    fun conversationId(conversationId: String) =
                        conversationId(JsonField.of(conversationId))

                    /**
                     * Sets [Builder.conversationId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversationId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversationId(conversationId: JsonField<String>) = apply {
                        this.conversationId = conversationId
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
                     * Returns an immutable instance of [SendToMsTeamsConversationId].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .conversationId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToMsTeamsConversationId =
                        SendToMsTeamsConversationId(
                            checkRequired("serviceUrl", serviceUrl),
                            checkRequired("tenantId", tenantId),
                            checkRequired("conversationId", conversationId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToMsTeamsConversationId = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceUrl()
                    tenantId()
                    conversationId()
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
                    (if (serviceUrl.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (if (conversationId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToMsTeamsConversationId &&
                        serviceUrl == other.serviceUrl &&
                        tenantId == other.tenantId &&
                        conversationId == other.conversationId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceUrl, tenantId, conversationId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToMsTeamsConversationId{serviceUrl=$serviceUrl, tenantId=$tenantId, conversationId=$conversationId, additionalProperties=$additionalProperties}"
            }

            class SendToMsTeamsChannelName
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceUrl: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val channelName: JsonField<String>,
                private val teamId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_url")
                    @ExcludeMissing
                    serviceUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("channel_name")
                    @ExcludeMissing
                    channelName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("team_id")
                    @ExcludeMissing
                    teamId: JsonField<String> = JsonMissing.of(),
                ) : this(serviceUrl, tenantId, channelName, teamId, mutableMapOf())

                fun toMsTeamsBaseProperties(): MsTeamsBaseProperties =
                    MsTeamsBaseProperties.builder()
                        .serviceUrl(serviceUrl)
                        .tenantId(tenantId)
                        .build()

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceUrl(): String = serviceUrl.getRequired("service_url")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun channelName(): String = channelName.getRequired("channel_name")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun teamId(): String = teamId.getRequired("team_id")

                /**
                 * Returns the raw JSON value of [serviceUrl].
                 *
                 * Unlike [serviceUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_url")
                @ExcludeMissing
                fun _serviceUrl(): JsonField<String> = serviceUrl

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [channelName].
                 *
                 * Unlike [channelName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("channel_name")
                @ExcludeMissing
                fun _channelName(): JsonField<String> = channelName

                /**
                 * Returns the raw JSON value of [teamId].
                 *
                 * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

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
                     * [SendToMsTeamsChannelName].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .channelName()
                     * .teamId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SendToMsTeamsChannelName]. */
                class Builder internal constructor() {

                    private var serviceUrl: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var channelName: JsonField<String>? = null
                    private var teamId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sendToMsTeamsChannelName: SendToMsTeamsChannelName) = apply {
                        serviceUrl = sendToMsTeamsChannelName.serviceUrl
                        tenantId = sendToMsTeamsChannelName.tenantId
                        channelName = sendToMsTeamsChannelName.channelName
                        teamId = sendToMsTeamsChannelName.teamId
                        additionalProperties =
                            sendToMsTeamsChannelName.additionalProperties.toMutableMap()
                    }

                    fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

                    /**
                     * Sets [Builder.serviceUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceUrl(serviceUrl: JsonField<String>) = apply {
                        this.serviceUrl = serviceUrl
                    }

                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    fun channelName(channelName: String) = channelName(JsonField.of(channelName))

                    /**
                     * Sets [Builder.channelName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channelName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun channelName(channelName: JsonField<String>) = apply {
                        this.channelName = channelName
                    }

                    fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                    /**
                     * Sets [Builder.teamId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.teamId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

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
                     * Returns an immutable instance of [SendToMsTeamsChannelName].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceUrl()
                     * .tenantId()
                     * .channelName()
                     * .teamId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendToMsTeamsChannelName =
                        SendToMsTeamsChannelName(
                            checkRequired("serviceUrl", serviceUrl),
                            checkRequired("tenantId", tenantId),
                            checkRequired("channelName", channelName),
                            checkRequired("teamId", teamId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SendToMsTeamsChannelName = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceUrl()
                    tenantId()
                    channelName()
                    teamId()
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
                    (if (serviceUrl.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (if (channelName.asKnown().isPresent) 1 else 0) +
                        (if (teamId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendToMsTeamsChannelName &&
                        serviceUrl == other.serviceUrl &&
                        tenantId == other.tenantId &&
                        channelName == other.channelName &&
                        teamId == other.teamId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceUrl, tenantId, channelName, teamId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendToMsTeamsChannelName{serviceUrl=$serviceUrl, tenantId=$tenantId, channelName=$channelName, teamId=$teamId, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MsTeamsRecipient &&
                msTeams == other.msTeams &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(msTeams, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MsTeamsRecipient{msTeams=$msTeams, additionalProperties=$additionalProperties}"
    }

    class RecipientData
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

            /** Returns a mutable builder for constructing an instance of [RecipientData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecipientData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recipientData: RecipientData) = apply {
                additionalProperties = recipientData.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RecipientData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RecipientData = RecipientData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): RecipientData = apply {
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

            return other is RecipientData && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RecipientData{additionalProperties=$additionalProperties}"
    }

    class PagerdutyRecipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pagerduty: JsonField<Pagerduty>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pagerduty")
            @ExcludeMissing
            pagerduty: JsonField<Pagerduty> = JsonMissing.of()
        ) : this(pagerduty, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pagerduty(): Pagerduty = pagerduty.getRequired("pagerduty")

        /**
         * Returns the raw JSON value of [pagerduty].
         *
         * Unlike [pagerduty], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pagerduty")
        @ExcludeMissing
        fun _pagerduty(): JsonField<Pagerduty> = pagerduty

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
             * Returns a mutable builder for constructing an instance of [PagerdutyRecipient].
             *
             * The following fields are required:
             * ```java
             * .pagerduty()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PagerdutyRecipient]. */
        class Builder internal constructor() {

            private var pagerduty: JsonField<Pagerduty>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pagerdutyRecipient: PagerdutyRecipient) = apply {
                pagerduty = pagerdutyRecipient.pagerduty
                additionalProperties = pagerdutyRecipient.additionalProperties.toMutableMap()
            }

            fun pagerduty(pagerduty: Pagerduty) = pagerduty(JsonField.of(pagerduty))

            /**
             * Sets [Builder.pagerduty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pagerduty] with a well-typed [Pagerduty] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pagerduty(pagerduty: JsonField<Pagerduty>) = apply { this.pagerduty = pagerduty }

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
             * Returns an immutable instance of [PagerdutyRecipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pagerduty()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PagerdutyRecipient =
                PagerdutyRecipient(
                    checkRequired("pagerduty", pagerduty),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PagerdutyRecipient = apply {
            if (validated) {
                return@apply
            }

            pagerduty().validate()
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
        internal fun validity(): Int = (pagerduty.asKnown().getOrNull()?.validity() ?: 0)

        class Pagerduty
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val eventAction: JsonField<String>,
            private val routingKey: JsonField<String>,
            private val severity: JsonField<String>,
            private val source: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("event_action")
                @ExcludeMissing
                eventAction: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routing_key")
                @ExcludeMissing
                routingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("severity")
                @ExcludeMissing
                severity: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            ) : this(eventAction, routingKey, severity, source, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventAction(): Optional<String> = eventAction.getOptional("event_action")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routingKey(): Optional<String> = routingKey.getOptional("routing_key")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun severity(): Optional<String> = severity.getOptional("severity")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun source(): Optional<String> = source.getOptional("source")

            /**
             * Returns the raw JSON value of [eventAction].
             *
             * Unlike [eventAction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_action")
            @ExcludeMissing
            fun _eventAction(): JsonField<String> = eventAction

            /**
             * Returns the raw JSON value of [routingKey].
             *
             * Unlike [routingKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routing_key")
            @ExcludeMissing
            fun _routingKey(): JsonField<String> = routingKey

            /**
             * Returns the raw JSON value of [severity].
             *
             * Unlike [severity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<String> = severity

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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

                /** Returns a mutable builder for constructing an instance of [Pagerduty]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pagerduty]. */
            class Builder internal constructor() {

                private var eventAction: JsonField<String> = JsonMissing.of()
                private var routingKey: JsonField<String> = JsonMissing.of()
                private var severity: JsonField<String> = JsonMissing.of()
                private var source: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pagerduty: Pagerduty) = apply {
                    eventAction = pagerduty.eventAction
                    routingKey = pagerduty.routingKey
                    severity = pagerduty.severity
                    source = pagerduty.source
                    additionalProperties = pagerduty.additionalProperties.toMutableMap()
                }

                fun eventAction(eventAction: String?) =
                    eventAction(JsonField.ofNullable(eventAction))

                /** Alias for calling [Builder.eventAction] with `eventAction.orElse(null)`. */
                fun eventAction(eventAction: Optional<String>) =
                    eventAction(eventAction.getOrNull())

                /**
                 * Sets [Builder.eventAction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventAction] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventAction(eventAction: JsonField<String>) = apply {
                    this.eventAction = eventAction
                }

                fun routingKey(routingKey: String?) = routingKey(JsonField.ofNullable(routingKey))

                /** Alias for calling [Builder.routingKey] with `routingKey.orElse(null)`. */
                fun routingKey(routingKey: Optional<String>) = routingKey(routingKey.getOrNull())

                /**
                 * Sets [Builder.routingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingKey(routingKey: JsonField<String>) = apply {
                    this.routingKey = routingKey
                }

                fun severity(severity: String?) = severity(JsonField.ofNullable(severity))

                /** Alias for calling [Builder.severity] with `severity.orElse(null)`. */
                fun severity(severity: Optional<String>) = severity(severity.getOrNull())

                /**
                 * Sets [Builder.severity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.severity] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun severity(severity: JsonField<String>) = apply { this.severity = severity }

                fun source(source: String?) = source(JsonField.ofNullable(source))

                /** Alias for calling [Builder.source] with `source.orElse(null)`. */
                fun source(source: Optional<String>) = source(source.getOrNull())

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

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
                 * Returns an immutable instance of [Pagerduty].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Pagerduty =
                    Pagerduty(
                        eventAction,
                        routingKey,
                        severity,
                        source,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Pagerduty = apply {
                if (validated) {
                    return@apply
                }

                eventAction()
                routingKey()
                severity()
                source()
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
                (if (eventAction.asKnown().isPresent) 1 else 0) +
                    (if (routingKey.asKnown().isPresent) 1 else 0) +
                    (if (severity.asKnown().isPresent) 1 else 0) +
                    (if (source.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pagerduty &&
                    eventAction == other.eventAction &&
                    routingKey == other.routingKey &&
                    severity == other.severity &&
                    source == other.source &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(eventAction, routingKey, severity, source, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pagerduty{eventAction=$eventAction, routingKey=$routingKey, severity=$severity, source=$source, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PagerdutyRecipient &&
                pagerduty == other.pagerduty &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pagerduty, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PagerdutyRecipient{pagerduty=$pagerduty, additionalProperties=$additionalProperties}"
    }

    class WebhookRecipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val webhook: JsonField<Webhook>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<Webhook> = JsonMissing.of()
        ) : this(webhook, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun webhook(): Webhook = webhook.getRequired("webhook")

        /**
         * Returns the raw JSON value of [webhook].
         *
         * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<Webhook> = webhook

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
             * Returns a mutable builder for constructing an instance of [WebhookRecipient].
             *
             * The following fields are required:
             * ```java
             * .webhook()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookRecipient]. */
        class Builder internal constructor() {

            private var webhook: JsonField<Webhook>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookRecipient: WebhookRecipient) = apply {
                webhook = webhookRecipient.webhook
                additionalProperties = webhookRecipient.additionalProperties.toMutableMap()
            }

            fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

            /**
             * Sets [Builder.webhook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

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
             * Returns an immutable instance of [WebhookRecipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .webhook()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): WebhookRecipient =
                WebhookRecipient(
                    checkRequired("webhook", webhook),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): WebhookRecipient = apply {
            if (validated) {
                return@apply
            }

            webhook().validate()
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
        internal fun validity(): Int = (webhook.asKnown().getOrNull()?.validity() ?: 0)

        class Webhook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val authentication: JsonField<Authentication>,
            private val headers: JsonField<Headers>,
            private val method: JsonField<Method>,
            private val profile: JsonField<Profile>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("authentication")
                @ExcludeMissing
                authentication: JsonField<Authentication> = JsonMissing.of(),
                @JsonProperty("headers")
                @ExcludeMissing
                headers: JsonField<Headers> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("profile")
                @ExcludeMissing
                profile: JsonField<Profile> = JsonMissing.of(),
            ) : this(url, authentication, headers, method, profile, mutableMapOf())

            /**
             * The URL to send the webhook request to.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Authentication configuration for the webhook request.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authentication(): Optional<Authentication> =
                authentication.getOptional("authentication")

            /**
             * Custom headers to include in the webhook request.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun headers(): Optional<Headers> = headers.getOptional("headers")

            /**
             * The HTTP method to use for the webhook request. Defaults to POST if not specified.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<Method> = method.getOptional("method")

            /**
             * Specifies what profile information is included in the request payload. Defaults to
             * 'limited' if not specified.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun profile(): Optional<Profile> = profile.getOptional("profile")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [authentication].
             *
             * Unlike [authentication], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authentication")
            @ExcludeMissing
            fun _authentication(): JsonField<Authentication> = authentication

            /**
             * Returns the raw JSON value of [headers].
             *
             * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

            /**
             * Returns the raw JSON value of [profile].
             *
             * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<Profile> = profile

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
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Webhook]. */
            class Builder internal constructor() {

                private var url: JsonField<String>? = null
                private var authentication: JsonField<Authentication> = JsonMissing.of()
                private var headers: JsonField<Headers> = JsonMissing.of()
                private var method: JsonField<Method> = JsonMissing.of()
                private var profile: JsonField<Profile> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(webhook: Webhook) = apply {
                    url = webhook.url
                    authentication = webhook.authentication
                    headers = webhook.headers
                    method = webhook.method
                    profile = webhook.profile
                    additionalProperties = webhook.additionalProperties.toMutableMap()
                }

                /** The URL to send the webhook request to. */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Authentication configuration for the webhook request. */
                fun authentication(authentication: Authentication?) =
                    authentication(JsonField.ofNullable(authentication))

                /**
                 * Alias for calling [Builder.authentication] with `authentication.orElse(null)`.
                 */
                fun authentication(authentication: Optional<Authentication>) =
                    authentication(authentication.getOrNull())

                /**
                 * Sets [Builder.authentication] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authentication] with a well-typed
                 * [Authentication] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun authentication(authentication: JsonField<Authentication>) = apply {
                    this.authentication = authentication
                }

                /** Custom headers to include in the webhook request. */
                fun headers(headers: Headers?) = headers(JsonField.ofNullable(headers))

                /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
                fun headers(headers: Optional<Headers>) = headers(headers.getOrNull())

                /**
                 * Sets [Builder.headers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headers] with a well-typed [Headers] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

                /**
                 * The HTTP method to use for the webhook request. Defaults to POST if not
                 * specified.
                 */
                fun method(method: Method?) = method(JsonField.ofNullable(method))

                /** Alias for calling [Builder.method] with `method.orElse(null)`. */
                fun method(method: Optional<Method>) = method(method.getOrNull())

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [Method] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<Method>) = apply { this.method = method }

                /**
                 * Specifies what profile information is included in the request payload. Defaults
                 * to 'limited' if not specified.
                 */
                fun profile(profile: Profile?) = profile(JsonField.ofNullable(profile))

                /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
                fun profile(profile: Optional<Profile>) = profile(profile.getOrNull())

                /**
                 * Sets [Builder.profile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profile] with a well-typed [Profile] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

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
                 * Returns an immutable instance of [Webhook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Webhook =
                    Webhook(
                        checkRequired("url", url),
                        authentication,
                        headers,
                        method,
                        profile,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Webhook = apply {
                if (validated) {
                    return@apply
                }

                url()
                authentication().ifPresent { it.validate() }
                headers().ifPresent { it.validate() }
                method().ifPresent { it.validate() }
                profile().ifPresent { it.validate() }
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
                (if (url.asKnown().isPresent) 1 else 0) +
                    (authentication.asKnown().getOrNull()?.validity() ?: 0) +
                    (headers.asKnown().getOrNull()?.validity() ?: 0) +
                    (method.asKnown().getOrNull()?.validity() ?: 0) +
                    (profile.asKnown().getOrNull()?.validity() ?: 0)

            /** Authentication configuration for the webhook request. */
            class Authentication
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val mode: JsonField<Mode>,
                private val token: JsonField<String>,
                private val password: JsonField<String>,
                private val username: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                    @JsonProperty("token")
                    @ExcludeMissing
                    token: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("password")
                    @ExcludeMissing
                    password: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("username")
                    @ExcludeMissing
                    username: JsonField<String> = JsonMissing.of(),
                ) : this(mode, token, password, username, mutableMapOf())

                /**
                 * The authentication mode to use. Defaults to 'none' if not specified.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun mode(): Mode = mode.getRequired("mode")

                /**
                 * Token for bearer authentication.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun token(): Optional<String> = token.getOptional("token")

                /**
                 * Password for basic authentication.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun password(): Optional<String> = password.getOptional("password")

                /**
                 * Username for basic authentication.
                 *
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun username(): Optional<String> = username.getOptional("username")

                /**
                 * Returns the raw JSON value of [mode].
                 *
                 * Unlike [mode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

                /**
                 * Returns the raw JSON value of [token].
                 *
                 * Unlike [token], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

                /**
                 * Returns the raw JSON value of [password].
                 *
                 * Unlike [password], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("password")
                @ExcludeMissing
                fun _password(): JsonField<String> = password

                /**
                 * Returns the raw JSON value of [username].
                 *
                 * Unlike [username], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("username")
                @ExcludeMissing
                fun _username(): JsonField<String> = username

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
                     * Returns a mutable builder for constructing an instance of [Authentication].
                     *
                     * The following fields are required:
                     * ```java
                     * .mode()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Authentication]. */
                class Builder internal constructor() {

                    private var mode: JsonField<Mode>? = null
                    private var token: JsonField<String> = JsonMissing.of()
                    private var password: JsonField<String> = JsonMissing.of()
                    private var username: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(authentication: Authentication) = apply {
                        mode = authentication.mode
                        token = authentication.token
                        password = authentication.password
                        username = authentication.username
                        additionalProperties = authentication.additionalProperties.toMutableMap()
                    }

                    /** The authentication mode to use. Defaults to 'none' if not specified. */
                    fun mode(mode: Mode) = mode(JsonField.of(mode))

                    /**
                     * Sets [Builder.mode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mode] with a well-typed [Mode] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                    /** Token for bearer authentication. */
                    fun token(token: String?) = token(JsonField.ofNullable(token))

                    /** Alias for calling [Builder.token] with `token.orElse(null)`. */
                    fun token(token: Optional<String>) = token(token.getOrNull())

                    /**
                     * Sets [Builder.token] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.token] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun token(token: JsonField<String>) = apply { this.token = token }

                    /** Password for basic authentication. */
                    fun password(password: String?) = password(JsonField.ofNullable(password))

                    /** Alias for calling [Builder.password] with `password.orElse(null)`. */
                    fun password(password: Optional<String>) = password(password.getOrNull())

                    /**
                     * Sets [Builder.password] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.password] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun password(password: JsonField<String>) = apply { this.password = password }

                    /** Username for basic authentication. */
                    fun username(username: String?) = username(JsonField.ofNullable(username))

                    /** Alias for calling [Builder.username] with `username.orElse(null)`. */
                    fun username(username: Optional<String>) = username(username.getOrNull())

                    /**
                     * Sets [Builder.username] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.username] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun username(username: JsonField<String>) = apply { this.username = username }

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
                     * Returns an immutable instance of [Authentication].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .mode()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Authentication =
                        Authentication(
                            checkRequired("mode", mode),
                            token,
                            password,
                            username,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Authentication = apply {
                    if (validated) {
                        return@apply
                    }

                    mode().validate()
                    token()
                    password()
                    username()
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
                    (mode.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (token.asKnown().isPresent) 1 else 0) +
                        (if (password.asKnown().isPresent) 1 else 0) +
                        (if (username.asKnown().isPresent) 1 else 0)

                /** The authentication mode to use. Defaults to 'none' if not specified. */
                class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                        @JvmField val NONE = of("none")

                        @JvmField val BASIC = of("basic")

                        @JvmField val BEARER = of("bearer")

                        @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                    }

                    /** An enum containing [Mode]'s known values. */
                    enum class Known {
                        NONE,
                        BASIC,
                        BEARER,
                    }

                    /**
                     * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Mode] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NONE,
                        BASIC,
                        BEARER,
                        /**
                         * An enum member indicating that [Mode] was instantiated with an unknown
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
                            NONE -> Value.NONE
                            BASIC -> Value.BASIC
                            BEARER -> Value.BEARER
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
                            NONE -> Known.NONE
                            BASIC -> Known.BASIC
                            BEARER -> Known.BEARER
                            else -> throw CourierInvalidDataException("Unknown Mode: $value")
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

                    fun validate(): Mode = apply {
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

                        return other is Mode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Authentication &&
                        mode == other.mode &&
                        token == other.token &&
                        password == other.password &&
                        username == other.username &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(mode, token, password, username, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Authentication{mode=$mode, token=$token, password=$password, username=$username, additionalProperties=$additionalProperties}"
            }

            /** Custom headers to include in the webhook request. */
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

                    /** Returns a mutable builder for constructing an instance of [Headers]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Headers]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(headers: Headers) = apply {
                        additionalProperties = headers.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Headers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
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

                    return other is Headers && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Headers{additionalProperties=$additionalProperties}"
            }

            /**
             * The HTTP method to use for the webhook request. Defaults to POST if not specified.
             */
            class Method @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POST = of("POST")

                    @JvmField val PUT = of("PUT")

                    @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                }

                /** An enum containing [Method]'s known values. */
                enum class Known {
                    POST,
                    PUT,
                }

                /**
                 * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Method] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POST,
                    PUT,
                    /**
                     * An enum member indicating that [Method] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        POST -> Value.POST
                        PUT -> Value.PUT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        POST -> Known.POST
                        PUT -> Known.PUT
                        else -> throw CourierInvalidDataException("Unknown Method: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                    return other is Method && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Specifies what profile information is included in the request payload. Defaults to
             * 'limited' if not specified.
             */
            class Profile @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LIMITED = of("limited")

                    @JvmField val EXPANDED = of("expanded")

                    @JvmStatic fun of(value: String) = Profile(JsonField.of(value))
                }

                /** An enum containing [Profile]'s known values. */
                enum class Known {
                    LIMITED,
                    EXPANDED,
                }

                /**
                 * An enum containing [Profile]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Profile] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LIMITED,
                    EXPANDED,
                    /**
                     * An enum member indicating that [Profile] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LIMITED -> Value.LIMITED
                        EXPANDED -> Value.EXPANDED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CourierInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LIMITED -> Known.LIMITED
                        EXPANDED -> Known.EXPANDED
                        else -> throw CourierInvalidDataException("Unknown Profile: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CourierInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CourierInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Profile = apply {
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

                    return other is Profile && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Webhook &&
                    url == other.url &&
                    authentication == other.authentication &&
                    headers == other.headers &&
                    method == other.method &&
                    profile == other.profile &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(url, authentication, headers, method, profile, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Webhook{url=$url, authentication=$authentication, headers=$headers, method=$method, profile=$profile, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookRecipient &&
                webhook == other.webhook &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(webhook, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookRecipient{webhook=$webhook, additionalProperties=$additionalProperties}"
    }
}
