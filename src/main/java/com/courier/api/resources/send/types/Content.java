/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = Content.Deserializer.class)
public final class Content {
    private final Object value;

    private final int type;

    private Content(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((ElementalContent) this.value);
        } else if (this.type == 1) {
            return visitor.visit((ElementalContentSugar) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Content && equalTo((Content) other);
    }

    private boolean equalTo(Content other) {
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

    public static Content of(ElementalContent value) {
        return new Content(value, 0);
    }

    public static Content of(ElementalContentSugar value) {
        return new Content(value, 1);
    }

    public interface Visitor<T> {
        T visit(ElementalContent value);

        T visit(ElementalContentSugar value);
    }

    static final class Deserializer extends StdDeserializer<Content> {
        Deserializer() {
            super(Content.class);
        }

        @java.lang.Override
        public Content deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ElementalContent.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ElementalContentSugar.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
