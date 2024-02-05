/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.notifications.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = MessageRoutingChannel.Deserializer.class)
public final class MessageRoutingChannel {
    private final Object value;

    private final int type;

    private MessageRoutingChannel(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((String) this.value);
        } else if (this.type == 1) {
            return visitor.visit((MessageRouting) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MessageRoutingChannel && equalTo((MessageRoutingChannel) other);
    }

    private boolean equalTo(MessageRoutingChannel other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static MessageRoutingChannel of(String value) {
        return new MessageRoutingChannel(value, 0);
    }

    public static MessageRoutingChannel of(MessageRouting value) {
        return new MessageRoutingChannel(value, 1);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(MessageRouting value);
    }

    static final class Deserializer extends StdDeserializer<MessageRoutingChannel> {
        Deserializer() {
            super(MessageRoutingChannel.class);
        }

        @java.lang.Override
        public MessageRoutingChannel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, MessageRouting.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
