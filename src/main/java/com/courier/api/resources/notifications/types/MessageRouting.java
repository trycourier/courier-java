/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.notifications.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MessageRouting.Builder.class)
public final class MessageRouting {
    private final MessageRoutingMethod method;

    private final List<MessageRoutingChannel> channels;

    private final Map<String, Object> additionalProperties;

    private MessageRouting(
            MessageRoutingMethod method,
            List<MessageRoutingChannel> channels,
            Map<String, Object> additionalProperties) {
        this.method = method;
        this.channels = channels;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("method")
    public MessageRoutingMethod getMethod() {
        return method;
    }

    @JsonProperty("channels")
    public List<MessageRoutingChannel> getChannels() {
        return channels;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MessageRouting && equalTo((MessageRouting) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MessageRouting other) {
        return method.equals(other.method) && channels.equals(other.channels);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.method, this.channels);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MethodStage builder() {
        return new Builder();
    }

    public interface MethodStage {
        _FinalStage method(MessageRoutingMethod method);

        Builder from(MessageRouting other);
    }

    public interface _FinalStage {
        MessageRouting build();

        _FinalStage channels(List<MessageRoutingChannel> channels);

        _FinalStage addChannels(MessageRoutingChannel channels);

        _FinalStage addAllChannels(List<MessageRoutingChannel> channels);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MethodStage, _FinalStage {
        private MessageRoutingMethod method;

        private List<MessageRoutingChannel> channels = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(MessageRouting other) {
            method(other.getMethod());
            channels(other.getChannels());
            return this;
        }

        @java.lang.Override
        @JsonSetter("method")
        public _FinalStage method(MessageRoutingMethod method) {
            this.method = method;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllChannels(List<MessageRoutingChannel> channels) {
            this.channels.addAll(channels);
            return this;
        }

        @java.lang.Override
        public _FinalStage addChannels(MessageRoutingChannel channels) {
            this.channels.add(channels);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "channels", nulls = Nulls.SKIP)
        public _FinalStage channels(List<MessageRoutingChannel> channels) {
            this.channels.clear();
            this.channels.addAll(channels);
            return this;
        }

        @java.lang.Override
        public MessageRouting build() {
            return new MessageRouting(method, channels, additionalProperties);
        }
    }
}