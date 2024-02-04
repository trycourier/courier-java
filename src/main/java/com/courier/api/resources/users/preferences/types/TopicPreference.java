/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.preferences.types;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.commons.types.ChannelClassification;
import com.courier.api.resources.commons.types.PreferenceStatus;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TopicPreference.Builder.class)
public final class TopicPreference {
    private final Optional<List<ChannelClassification>> customRouting;

    private final PreferenceStatus defaultStatus;

    private final Optional<Boolean> hasCustomRouting;

    private final PreferenceStatus status;

    private final String topicId;

    private final String topicName;

    private final Map<String, Object> additionalProperties;

    private TopicPreference(
            Optional<List<ChannelClassification>> customRouting,
            PreferenceStatus defaultStatus,
            Optional<Boolean> hasCustomRouting,
            PreferenceStatus status,
            String topicId,
            String topicName,
            Map<String, Object> additionalProperties) {
        this.customRouting = customRouting;
        this.defaultStatus = defaultStatus;
        this.hasCustomRouting = hasCustomRouting;
        this.status = status;
        this.topicId = topicId;
        this.topicName = topicName;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The Channels a user has chosen to receive notifications through for this topic
     */
    @JsonProperty("custom_routing")
    public Optional<List<ChannelClassification>> getCustomRouting() {
        return customRouting;
    }

    @JsonProperty("default_status")
    public PreferenceStatus getDefaultStatus() {
        return defaultStatus;
    }

    @JsonProperty("has_custom_routing")
    public Optional<Boolean> getHasCustomRouting() {
        return hasCustomRouting;
    }

    @JsonProperty("status")
    public PreferenceStatus getStatus() {
        return status;
    }

    @JsonProperty("topic_id")
    public String getTopicId() {
        return topicId;
    }

    @JsonProperty("topic_name")
    public String getTopicName() {
        return topicName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TopicPreference && equalTo((TopicPreference) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TopicPreference other) {
        return customRouting.equals(other.customRouting)
                && defaultStatus.equals(other.defaultStatus)
                && hasCustomRouting.equals(other.hasCustomRouting)
                && status.equals(other.status)
                && topicId.equals(other.topicId)
                && topicName.equals(other.topicName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.customRouting,
                this.defaultStatus,
                this.hasCustomRouting,
                this.status,
                this.topicId,
                this.topicName);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DefaultStatusStage builder() {
        return new Builder();
    }

    public interface DefaultStatusStage {
        StatusStage defaultStatus(PreferenceStatus defaultStatus);

        Builder from(TopicPreference other);
    }

    public interface StatusStage {
        TopicIdStage status(PreferenceStatus status);
    }

    public interface TopicIdStage {
        TopicNameStage topicId(String topicId);
    }

    public interface TopicNameStage {
        _FinalStage topicName(String topicName);
    }

    public interface _FinalStage {
        TopicPreference build();

        _FinalStage customRouting(Optional<List<ChannelClassification>> customRouting);

        _FinalStage customRouting(List<ChannelClassification> customRouting);

        _FinalStage hasCustomRouting(Optional<Boolean> hasCustomRouting);

        _FinalStage hasCustomRouting(Boolean hasCustomRouting);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DefaultStatusStage, StatusStage, TopicIdStage, TopicNameStage, _FinalStage {
        private PreferenceStatus defaultStatus;

        private PreferenceStatus status;

        private String topicId;

        private String topicName;

        private Optional<Boolean> hasCustomRouting = Optional.empty();

        private Optional<List<ChannelClassification>> customRouting = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TopicPreference other) {
            customRouting(other.getCustomRouting());
            defaultStatus(other.getDefaultStatus());
            hasCustomRouting(other.getHasCustomRouting());
            status(other.getStatus());
            topicId(other.getTopicId());
            topicName(other.getTopicName());
            return this;
        }

        @java.lang.Override
        @JsonSetter("default_status")
        public StatusStage defaultStatus(PreferenceStatus defaultStatus) {
            this.defaultStatus = defaultStatus;
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public TopicIdStage status(PreferenceStatus status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        @JsonSetter("topic_id")
        public TopicNameStage topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("topic_name")
        public _FinalStage topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        @java.lang.Override
        public _FinalStage hasCustomRouting(Boolean hasCustomRouting) {
            this.hasCustomRouting = Optional.of(hasCustomRouting);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "has_custom_routing", nulls = Nulls.SKIP)
        public _FinalStage hasCustomRouting(Optional<Boolean> hasCustomRouting) {
            this.hasCustomRouting = hasCustomRouting;
            return this;
        }

        /**
         * <p>The Channels a user has chosen to receive notifications through for this topic</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage customRouting(List<ChannelClassification> customRouting) {
            this.customRouting = Optional.of(customRouting);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "custom_routing", nulls = Nulls.SKIP)
        public _FinalStage customRouting(Optional<List<ChannelClassification>> customRouting) {
            this.customRouting = customRouting;
            return this;
        }

        @java.lang.Override
        public TopicPreference build() {
            return new TopicPreference(
                    customRouting, defaultStatus, hasCustomRouting, status, topicId, topicName, additionalProperties);
        }
    }
}
