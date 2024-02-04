/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.audiences.requests;

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
@JsonDeserialize(builder = AudienceMembersListParams.Builder.class)
public final class AudienceMembersListParams {
    private final Optional<String> cursor;

    private final Map<String, Object> additionalProperties;

    private AudienceMembersListParams(Optional<String> cursor, Map<String, Object> additionalProperties) {
        this.cursor = cursor;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A unique identifier that allows for fetching the next set of members
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AudienceMembersListParams && equalTo((AudienceMembersListParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AudienceMembersListParams other) {
        return cursor.equals(other.cursor);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cursor);
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

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AudienceMembersListParams other) {
            cursor(other.getCursor());
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

        public AudienceMembersListParams build() {
            return new AudienceMembersListParams(cursor, additionalProperties);
        }
    }
}
