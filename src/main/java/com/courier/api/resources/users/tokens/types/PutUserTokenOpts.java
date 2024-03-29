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
@JsonDeserialize(builder = PutUserTokenOpts.Builder.class)
public final class PutUserTokenOpts {
    private final String userId;

    private final UserToken token;

    private final Map<String, Object> additionalProperties;

    private PutUserTokenOpts(String userId, UserToken token, Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.token = token;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("token")
    public UserToken getToken() {
        return token;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PutUserTokenOpts && equalTo((PutUserTokenOpts) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PutUserTokenOpts other) {
        return userId.equals(other.userId) && token.equals(other.token);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userId, this.token);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        TokenStage userId(String userId);

        Builder from(PutUserTokenOpts other);
    }

    public interface TokenStage {
        _FinalStage token(UserToken token);
    }

    public interface _FinalStage {
        PutUserTokenOpts build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, TokenStage, _FinalStage {
        private String userId;

        private UserToken token;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PutUserTokenOpts other) {
            userId(other.getUserId());
            token(other.getToken());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public TokenStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("token")
        public _FinalStage token(UserToken token) {
            this.token = token;
            return this;
        }

        @java.lang.Override
        public PutUserTokenOpts build() {
            return new PutUserTokenOpts(userId, token, additionalProperties);
        }
    }
}
