/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.notifications.requests;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NotificationListParams.Builder.class)
public final class NotificationListParams {
    private final Optional<String> cursor;

    private final Optional<Boolean> notes;

    private final Map<String, Object> additionalProperties;

    private NotificationListParams(
            Optional<String> cursor, Optional<Boolean> notes, Map<String, Object> additionalProperties) {
        this.cursor = cursor;
        this.notes = notes;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return Retrieve the notes from the Notification template settings.
     */
    @JsonProperty("notes")
    public Optional<Boolean> getNotes() {
        return notes;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotificationListParams && equalTo((NotificationListParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NotificationListParams other) {
        return cursor.equals(other.cursor) && notes.equals(other.notes);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cursor, this.notes);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> cursor = Optional.empty();

        private Optional<Boolean> notes = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(NotificationListParams other) {
            cursor(other.getCursor());
            notes(other.getNotes());
            return this;
        }

        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public Builder cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @JsonSetter(value = "notes", nulls = Nulls.SKIP)
        public Builder notes(Optional<Boolean> notes) {
            this.notes = notes;
            return this;
        }

        public Builder notes(Boolean notes) {
            this.notes = Optional.of(notes);
            return this;
        }

        public NotificationListParams build() {
            return new NotificationListParams(cursor, notes, additionalProperties);
        }
    }
}
