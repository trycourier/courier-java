/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

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
@JsonDeserialize(builder = SendToSlackEmail.Builder.class)
public final class SendToSlackEmail implements ISlackBaseProperties {
    private final String accessToken;

    private final String email;

    private final Map<String, Object> additionalProperties;

    private SendToSlackEmail(String accessToken, String email, Map<String, Object> additionalProperties) {
        this.accessToken = accessToken;
        this.email = email;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("access_token")
    @java.lang.Override
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendToSlackEmail && equalTo((SendToSlackEmail) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SendToSlackEmail other) {
        return accessToken.equals(other.accessToken) && email.equals(other.email);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.accessToken, this.email);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccessTokenStage builder() {
        return new Builder();
    }

    public interface AccessTokenStage {
        EmailStage accessToken(String accessToken);

        Builder from(SendToSlackEmail other);
    }

    public interface EmailStage {
        _FinalStage email(String email);
    }

    public interface _FinalStage {
        SendToSlackEmail build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessTokenStage, EmailStage, _FinalStage {
        private String accessToken;

        private String email;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SendToSlackEmail other) {
            accessToken(other.getAccessToken());
            email(other.getEmail());
            return this;
        }

        @java.lang.Override
        @JsonSetter("access_token")
        public EmailStage accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public _FinalStage email(String email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        public SendToSlackEmail build() {
            return new SendToSlackEmail(accessToken, email, additionalProperties);
        }
    }
}
