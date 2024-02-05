/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.bulk.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BulkIngestError.Builder.class)
public final class BulkIngestError {
    private final Object user;

    private final Object error;

    private final Map<String, Object> additionalProperties;

    private BulkIngestError(Object user, Object error, Map<String, Object> additionalProperties) {
        this.user = user;
        this.error = error;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user")
    public Object getUser() {
        return user;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BulkIngestError && equalTo((BulkIngestError) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BulkIngestError other) {
        return user.equals(other.user) && error.equals(other.error);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.user, this.error);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserStage builder() {
        return new Builder();
    }

    public interface UserStage {
        ErrorStage user(Object user);

        Builder from(BulkIngestError other);
    }

    public interface ErrorStage {
        _FinalStage error(Object error);
    }

    public interface _FinalStage {
        BulkIngestError build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserStage, ErrorStage, _FinalStage {
        private Object user;

        private Object error;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BulkIngestError other) {
            user(other.getUser());
            error(other.getError());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user")
        public ErrorStage user(Object user) {
            this.user = user;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error")
        public _FinalStage error(Object error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public BulkIngestError build() {
            return new BulkIngestError(user, error, additionalProperties);
        }
    }
}
