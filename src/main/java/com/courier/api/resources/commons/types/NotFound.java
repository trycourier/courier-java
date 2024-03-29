/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.commons.types;

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
@JsonDeserialize(builder = NotFound.Builder.class)
public final class NotFound implements IBaseError {
    private final String message;

    private final Map<String, Object> additionalProperties;

    private NotFound(String message, Map<String, Object> additionalProperties) {
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A message describing the error that occurred.
     */
    @JsonProperty("message")
    @java.lang.Override
    public String getMessage() {
        return message;
    }

    @JsonProperty("type")
    public String getType() {
        return "invalid_request_error";
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotFound && equalTo((NotFound) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NotFound other) {
        return message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.message);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MessageStage builder() {
        return new Builder();
    }

    public interface MessageStage {
        _FinalStage message(String message);

        Builder from(NotFound other);
    }

    public interface _FinalStage {
        NotFound build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MessageStage, _FinalStage {
        private String message;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NotFound other) {
            message(other.getMessage());
            return this;
        }

        /**
         * <p>A message describing the error that occurred.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public NotFound build() {
            return new NotFound(message, additionalProperties);
        }
    }
}
