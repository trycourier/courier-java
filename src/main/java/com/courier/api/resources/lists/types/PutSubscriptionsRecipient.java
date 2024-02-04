/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.lists.types;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.commons.types.RecipientPreferences;
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
@JsonDeserialize(builder = PutSubscriptionsRecipient.Builder.class)
public final class PutSubscriptionsRecipient {
    private final String recipientId;

    private final Optional<RecipientPreferences> preferences;

    private final Map<String, Object> additionalProperties;

    private PutSubscriptionsRecipient(
            String recipientId, Optional<RecipientPreferences> preferences, Map<String, Object> additionalProperties) {
        this.recipientId = recipientId;
        this.preferences = preferences;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("recipientId")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("preferences")
    public Optional<RecipientPreferences> getPreferences() {
        return preferences;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PutSubscriptionsRecipient && equalTo((PutSubscriptionsRecipient) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PutSubscriptionsRecipient other) {
        return recipientId.equals(other.recipientId) && preferences.equals(other.preferences);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.recipientId, this.preferences);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RecipientIdStage builder() {
        return new Builder();
    }

    public interface RecipientIdStage {
        _FinalStage recipientId(String recipientId);

        Builder from(PutSubscriptionsRecipient other);
    }

    public interface _FinalStage {
        PutSubscriptionsRecipient build();

        _FinalStage preferences(Optional<RecipientPreferences> preferences);

        _FinalStage preferences(RecipientPreferences preferences);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RecipientIdStage, _FinalStage {
        private String recipientId;

        private Optional<RecipientPreferences> preferences = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PutSubscriptionsRecipient other) {
            recipientId(other.getRecipientId());
            preferences(other.getPreferences());
            return this;
        }

        @java.lang.Override
        @JsonSetter("recipientId")
        public _FinalStage recipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }

        @java.lang.Override
        public _FinalStage preferences(RecipientPreferences preferences) {
            this.preferences = Optional.of(preferences);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "preferences", nulls = Nulls.SKIP)
        public _FinalStage preferences(Optional<RecipientPreferences> preferences) {
            this.preferences = preferences;
            return this;
        }

        @java.lang.Override
        public PutSubscriptionsRecipient build() {
            return new PutSubscriptionsRecipient(recipientId, preferences, additionalProperties);
        }
    }
}