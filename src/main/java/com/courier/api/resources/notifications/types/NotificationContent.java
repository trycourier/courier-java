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

@JsonDeserialize(using = NotificationContent.Deserializer.class)
public final class NotificationContent {
    private final Object value;

    private final int type;

    private NotificationContent(Object value, int type) {
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
            return visitor.visit((NotificationContentHierarchy) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotificationContent && equalTo((NotificationContent) other);
    }

    private boolean equalTo(NotificationContent other) {
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

    public static NotificationContent of(String value) {
        return new NotificationContent(value, 0);
    }

    public static NotificationContent of(NotificationContentHierarchy value) {
        return new NotificationContent(value, 1);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(NotificationContentHierarchy value);
    }

    static final class Deserializer extends StdDeserializer<NotificationContent> {
        Deserializer() {
            super(NotificationContent.class);
        }

        @java.lang.Override
        public NotificationContent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, NotificationContentHierarchy.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
