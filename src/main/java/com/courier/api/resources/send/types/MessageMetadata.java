/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MessageMetadata.Builder.class)
public final class MessageMetadata {
    private final Optional<String> event;

    private final Optional<List<String>> tags;

    private final Optional<Utm> utm;

    private final Optional<String> traceId;

    private final Map<String, Object> additionalProperties;

    private MessageMetadata(
            Optional<String> event,
            Optional<List<String>> tags,
            Optional<Utm> utm,
            Optional<String> traceId,
            Map<String, Object> additionalProperties) {
        this.event = event;
        this.tags = tags;
        this.utm = utm;
        this.traceId = traceId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return An arbitrary string to tracks the event that generated this request (e.g. 'signup').
     */
    @JsonProperty("event")
    public Optional<String> getEvent() {
        return event;
    }

    /**
     * @return An array of up to 9 tags you wish to associate with this request (and corresponding messages) for later analysis. Individual tags cannot be more than 30 characters in length.
     */
    @JsonProperty("tags")
    public Optional<List<String>> getTags() {
        return tags;
    }

    /**
     * @return Identify the campaign that refers traffic to a specific website, and attributes the browser's website session.
     */
    @JsonProperty("utm")
    public Optional<Utm> getUtm() {
        return utm;
    }

    /**
     * @return A unique ID used to correlate this request to processing on your servers. Note: Courier does not verify the uniqueness of this ID.
     */
    @JsonProperty("trace_id")
    public Optional<String> getTraceId() {
        return traceId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MessageMetadata && equalTo((MessageMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MessageMetadata other) {
        return event.equals(other.event)
                && tags.equals(other.tags)
                && utm.equals(other.utm)
                && traceId.equals(other.traceId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.event, this.tags, this.utm, this.traceId);
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
        private Optional<String> event = Optional.empty();

        private Optional<List<String>> tags = Optional.empty();

        private Optional<Utm> utm = Optional.empty();

        private Optional<String> traceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(MessageMetadata other) {
            event(other.getEvent());
            tags(other.getTags());
            utm(other.getUtm());
            traceId(other.getTraceId());
            return this;
        }

        @JsonSetter(value = "event", nulls = Nulls.SKIP)
        public Builder event(Optional<String> event) {
            this.event = event;
            return this;
        }

        public Builder event(String event) {
            this.event = Optional.of(event);
            return this;
        }

        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public Builder tags(Optional<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = Optional.of(tags);
            return this;
        }

        @JsonSetter(value = "utm", nulls = Nulls.SKIP)
        public Builder utm(Optional<Utm> utm) {
            this.utm = utm;
            return this;
        }

        public Builder utm(Utm utm) {
            this.utm = Optional.of(utm);
            return this;
        }

        @JsonSetter(value = "trace_id", nulls = Nulls.SKIP)
        public Builder traceId(Optional<String> traceId) {
            this.traceId = traceId;
            return this;
        }

        public Builder traceId(String traceId) {
            this.traceId = Optional.of(traceId);
            return this;
        }

        public MessageMetadata build() {
            return new MessageMetadata(event, tags, utm, traceId, additionalProperties);
        }
    }
}
