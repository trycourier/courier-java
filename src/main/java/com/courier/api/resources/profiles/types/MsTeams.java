/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = MsTeams.Deserializer.class)
public final class MsTeams {
    private final Object value;

    private final int type;

    private MsTeams(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((SendToMsTeamsUserId) this.value);
        } else if (this.type == 1) {
            return visitor.visit((SendToMsTeamsEmail) this.value);
        } else if (this.type == 2) {
            return visitor.visit((SendToMsTeamsChannelId) this.value);
        } else if (this.type == 3) {
            return visitor.visit((SendToMsTeamsConversationId) this.value);
        } else if (this.type == 4) {
            return visitor.visit((SendToMsTeamsChannelName) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MsTeams && equalTo((MsTeams) other);
    }

    private boolean equalTo(MsTeams other) {
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

    public static MsTeams of(SendToMsTeamsUserId value) {
        return new MsTeams(value, 0);
    }

    public static MsTeams of(SendToMsTeamsEmail value) {
        return new MsTeams(value, 1);
    }

    public static MsTeams of(SendToMsTeamsChannelId value) {
        return new MsTeams(value, 2);
    }

    public static MsTeams of(SendToMsTeamsConversationId value) {
        return new MsTeams(value, 3);
    }

    public static MsTeams of(SendToMsTeamsChannelName value) {
        return new MsTeams(value, 4);
    }

    public interface Visitor<T> {
        T visit(SendToMsTeamsUserId value);

        T visit(SendToMsTeamsEmail value);

        T visit(SendToMsTeamsChannelId value);

        T visit(SendToMsTeamsConversationId value);

        T visit(SendToMsTeamsChannelName value);
    }

    static final class Deserializer extends StdDeserializer<MsTeams> {
        Deserializer() {
            super(MsTeams.class);
        }

        @java.lang.Override
        public MsTeams deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendToMsTeamsUserId.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendToMsTeamsEmail.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendToMsTeamsChannelId.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendToMsTeamsConversationId.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendToMsTeamsChannelName.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
