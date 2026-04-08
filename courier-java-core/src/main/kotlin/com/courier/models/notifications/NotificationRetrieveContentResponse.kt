// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.getOrThrow
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

/**
 * Elemental content response for V2 templates. Contains versioned elements with content checksums.
 */
@JsonDeserialize(using = NotificationRetrieveContentResponse.Deserializer::class)
@JsonSerialize(using = NotificationRetrieveContentResponse.Serializer::class)
class NotificationRetrieveContentResponse
private constructor(
    private val contentGet: NotificationContentGetResponse? = null,
    private val getContent: NotificationGetContent? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Elemental content response for V2 templates. Contains versioned elements with content
     * checksums.
     */
    fun contentGet(): Optional<NotificationContentGetResponse> = Optional.ofNullable(contentGet)

    fun getContent(): Optional<NotificationGetContent> = Optional.ofNullable(getContent)

    fun isContentGet(): Boolean = contentGet != null

    fun isGetContent(): Boolean = getContent != null

    /**
     * Elemental content response for V2 templates. Contains versioned elements with content
     * checksums.
     */
    fun asContentGet(): NotificationContentGetResponse = contentGet.getOrThrow("contentGet")

    fun asGetContent(): NotificationGetContent = getContent.getOrThrow("getContent")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            contentGet != null -> visitor.visitContentGet(contentGet)
            getContent != null -> visitor.visitGetContent(getContent)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): NotificationRetrieveContentResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitContentGet(contentGet: NotificationContentGetResponse) {
                    contentGet.validate()
                }

                override fun visitGetContent(getContent: NotificationGetContent) {
                    getContent.validate()
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
                override fun visitContentGet(contentGet: NotificationContentGetResponse) =
                    contentGet.validity()

                override fun visitGetContent(getContent: NotificationGetContent) =
                    getContent.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationRetrieveContentResponse &&
            contentGet == other.contentGet &&
            getContent == other.getContent
    }

    override fun hashCode(): Int = Objects.hash(contentGet, getContent)

    override fun toString(): String =
        when {
            contentGet != null -> "NotificationRetrieveContentResponse{contentGet=$contentGet}"
            getContent != null -> "NotificationRetrieveContentResponse{getContent=$getContent}"
            _json != null -> "NotificationRetrieveContentResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid NotificationRetrieveContentResponse")
        }

    companion object {

        /**
         * Elemental content response for V2 templates. Contains versioned elements with content
         * checksums.
         */
        @JvmStatic
        fun ofContentGet(contentGet: NotificationContentGetResponse) =
            NotificationRetrieveContentResponse(contentGet = contentGet)

        @JvmStatic
        fun ofGetContent(getContent: NotificationGetContent) =
            NotificationRetrieveContentResponse(getContent = getContent)
    }

    /**
     * An interface that defines how to map each variant of [NotificationRetrieveContentResponse] to
     * a value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Elemental content response for V2 templates. Contains versioned elements with content
         * checksums.
         */
        fun visitContentGet(contentGet: NotificationContentGetResponse): T

        fun visitGetContent(getContent: NotificationGetContent): T

        /**
         * Maps an unknown variant of [NotificationRetrieveContentResponse] to a value of type [T].
         *
         * An instance of [NotificationRetrieveContentResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown NotificationRetrieveContentResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<NotificationRetrieveContentResponse>(
            NotificationRetrieveContentResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): NotificationRetrieveContentResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<NotificationContentGetResponse>())
                            ?.let {
                                NotificationRetrieveContentResponse(contentGet = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<NotificationGetContent>())?.let {
                            NotificationRetrieveContentResponse(getContent = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> NotificationRetrieveContentResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<NotificationRetrieveContentResponse>(
            NotificationRetrieveContentResponse::class
        ) {

        override fun serialize(
            value: NotificationRetrieveContentResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.contentGet != null -> generator.writeObject(value.contentGet)
                value.getContent != null -> generator.writeObject(value.getContent)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid NotificationRetrieveContentResponse")
            }
        }
    }
}
