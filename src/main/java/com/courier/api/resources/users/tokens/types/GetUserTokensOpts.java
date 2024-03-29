/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tokens.types;

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
@JsonDeserialize(builder = GetUserTokensOpts.Builder.class)
public final class GetUserTokensOpts {
    private final String userId;

    private final Map<String, Object> additionalProperties;

    private GetUserTokensOpts(String userId, Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetUserTokensOpts && equalTo((GetUserTokensOpts) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetUserTokensOpts other) {
        return userId.equals(other.userId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        _FinalStage userId(String userId);

        Builder from(GetUserTokensOpts other);
    }

    public interface _FinalStage {
        GetUserTokensOpts build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, _FinalStage {
        private String userId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GetUserTokensOpts other) {
            userId(other.getUserId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public _FinalStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        public GetUserTokensOpts build() {
            return new GetUserTokensOpts(userId, additionalProperties);
        }
    }
}
