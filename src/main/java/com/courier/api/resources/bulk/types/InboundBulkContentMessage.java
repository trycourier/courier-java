/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.bulk.types;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.send.types.Channel;
import com.courier.api.resources.send.types.Content;
import com.courier.api.resources.send.types.Delay;
import com.courier.api.resources.send.types.Expiry;
import com.courier.api.resources.send.types.IBaseMessage;
import com.courier.api.resources.send.types.MessageContext;
import com.courier.api.resources.send.types.MessageMetadata;
import com.courier.api.resources.send.types.MessagePreferences;
import com.courier.api.resources.send.types.MessageProvidersType;
import com.courier.api.resources.send.types.Routing;
import com.courier.api.resources.send.types.Timeout;
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
@JsonDeserialize(builder = InboundBulkContentMessage.Builder.class)
public final class InboundBulkContentMessage implements IBaseMessage {
    private final Optional<Map<String, Object>> data;

    private final Optional<String> brandId;

    private final Optional<Map<String, Channel>> channels;

    private final Optional<MessageContext> context;

    private final Optional<MessageMetadata> metadata;

    private final Optional<MessagePreferences> preferences;

    private final Optional<Map<String, MessageProvidersType>> providers;

    private final Optional<Routing> routing;

    private final Optional<Timeout> timeout;

    private final Optional<Delay> delay;

    private final Optional<Expiry> expiry;

    private final Content content;

    private final Map<String, Object> additionalProperties;

    private InboundBulkContentMessage(
            Optional<Map<String, Object>> data,
            Optional<String> brandId,
            Optional<Map<String, Channel>> channels,
            Optional<MessageContext> context,
            Optional<MessageMetadata> metadata,
            Optional<MessagePreferences> preferences,
            Optional<Map<String, MessageProvidersType>> providers,
            Optional<Routing> routing,
            Optional<Timeout> timeout,
            Optional<Delay> delay,
            Optional<Expiry> expiry,
            Content content,
            Map<String, Object> additionalProperties) {
        this.data = data;
        this.brandId = brandId;
        this.channels = channels;
        this.context = context;
        this.metadata = metadata;
        this.preferences = preferences;
        this.providers = providers;
        this.routing = routing;
        this.timeout = timeout;
        this.delay = delay;
        this.expiry = expiry;
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return An arbitrary object that includes any data you want to pass to the message.
     * The data will populate the corresponding template or elements variables.
     */
    @JsonProperty("data")
    @java.lang.Override
    public Optional<Map<String, Object>> getData() {
        return data;
    }

    @JsonProperty("brand_id")
    @java.lang.Override
    public Optional<String> getBrandId() {
        return brandId;
    }

    /**
     * @return &quot;Define run-time configuration for one or more channels. If you don't specify channels, the default configuration for each channel will be used. Valid ChannelId's are: email, sms, push, inbox, direct_message, banner, and webhook.&quot;
     */
    @JsonProperty("channels")
    @java.lang.Override
    public Optional<Map<String, Channel>> getChannels() {
        return channels;
    }

    /**
     * @return Context to load with this recipient. Will override any context set on message.context.
     */
    @JsonProperty("context")
    @java.lang.Override
    public Optional<MessageContext> getContext() {
        return context;
    }

    /**
     * @return Metadata such as utm tracking attached with the notification through this channel.
     */
    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<MessageMetadata> getMetadata() {
        return metadata;
    }

    @JsonProperty("preferences")
    @java.lang.Override
    public Optional<MessagePreferences> getPreferences() {
        return preferences;
    }

    /**
     * @return An object whose keys are valid provider identifiers which map to an object.
     */
    @JsonProperty("providers")
    @java.lang.Override
    public Optional<Map<String, MessageProvidersType>> getProviders() {
        return providers;
    }

    @JsonProperty("routing")
    @java.lang.Override
    public Optional<Routing> getRouting() {
        return routing;
    }

    /**
     * @return Time in ms to attempt the channel before failing over to the next available channel.
     */
    @JsonProperty("timeout")
    @java.lang.Override
    public Optional<Timeout> getTimeout() {
        return timeout;
    }

    /**
     * @return Defines the time to wait before delivering the message. You can specify one of the following options. Duration with the number of milliseconds to delay. Until with an ISO 8601 timestamp that specifies when it should be delivered. Until with an OpenStreetMap opening_hours-like format that specifies the <a href="https://www.courier.com/docs/platform/sending/failover/#delivery-window">Delivery Window</a> (e.g., 'Mo-Fr 08:00-18:00pm')
     */
    @JsonProperty("delay")
    @java.lang.Override
    public Optional<Delay> getDelay() {
        return delay;
    }

    /**
     * @return &quot;Expiry allows you to set an absolute or relative time in which a message expires.
     * Note: This is only valid for the Courier Inbox channel as of 12-08-2022.&quot;
     */
    @JsonProperty("expiry")
    @java.lang.Override
    public Optional<Expiry> getExpiry() {
        return expiry;
    }

    /**
     * @return Describes the content of the message in a way that will work for email, push,
     * chat, or any channel. Either this or template must be specified.
     */
    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InboundBulkContentMessage && equalTo((InboundBulkContentMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InboundBulkContentMessage other) {
        return data.equals(other.data)
                && brandId.equals(other.brandId)
                && channels.equals(other.channels)
                && context.equals(other.context)
                && metadata.equals(other.metadata)
                && preferences.equals(other.preferences)
                && providers.equals(other.providers)
                && routing.equals(other.routing)
                && timeout.equals(other.timeout)
                && delay.equals(other.delay)
                && expiry.equals(other.expiry)
                && content.equals(other.content);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.data,
                this.brandId,
                this.channels,
                this.context,
                this.metadata,
                this.preferences,
                this.providers,
                this.routing,
                this.timeout,
                this.delay,
                this.expiry,
                this.content);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContentStage builder() {
        return new Builder();
    }

    public interface ContentStage {
        _FinalStage content(Content content);

        Builder from(InboundBulkContentMessage other);
    }

    public interface _FinalStage {
        InboundBulkContentMessage build();

        _FinalStage data(Optional<Map<String, Object>> data);

        _FinalStage data(Map<String, Object> data);

        _FinalStage brandId(Optional<String> brandId);

        _FinalStage brandId(String brandId);

        _FinalStage channels(Optional<Map<String, Channel>> channels);

        _FinalStage channels(Map<String, Channel> channels);

        _FinalStage context(Optional<MessageContext> context);

        _FinalStage context(MessageContext context);

        _FinalStage metadata(Optional<MessageMetadata> metadata);

        _FinalStage metadata(MessageMetadata metadata);

        _FinalStage preferences(Optional<MessagePreferences> preferences);

        _FinalStage preferences(MessagePreferences preferences);

        _FinalStage providers(Optional<Map<String, MessageProvidersType>> providers);

        _FinalStage providers(Map<String, MessageProvidersType> providers);

        _FinalStage routing(Optional<Routing> routing);

        _FinalStage routing(Routing routing);

        _FinalStage timeout(Optional<Timeout> timeout);

        _FinalStage timeout(Timeout timeout);

        _FinalStage delay(Optional<Delay> delay);

        _FinalStage delay(Delay delay);

        _FinalStage expiry(Optional<Expiry> expiry);

        _FinalStage expiry(Expiry expiry);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContentStage, _FinalStage {
        private Content content;

        private Optional<Expiry> expiry = Optional.empty();

        private Optional<Delay> delay = Optional.empty();

        private Optional<Timeout> timeout = Optional.empty();

        private Optional<Routing> routing = Optional.empty();

        private Optional<Map<String, MessageProvidersType>> providers = Optional.empty();

        private Optional<MessagePreferences> preferences = Optional.empty();

        private Optional<MessageMetadata> metadata = Optional.empty();

        private Optional<MessageContext> context = Optional.empty();

        private Optional<Map<String, Channel>> channels = Optional.empty();

        private Optional<String> brandId = Optional.empty();

        private Optional<Map<String, Object>> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InboundBulkContentMessage other) {
            data(other.getData());
            brandId(other.getBrandId());
            channels(other.getChannels());
            context(other.getContext());
            metadata(other.getMetadata());
            preferences(other.getPreferences());
            providers(other.getProviders());
            routing(other.getRouting());
            timeout(other.getTimeout());
            delay(other.getDelay());
            expiry(other.getExpiry());
            content(other.getContent());
            return this;
        }

        /**
         * <p>Describes the content of the message in a way that will work for email, push,
         * chat, or any channel. Either this or template must be specified.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("content")
        public _FinalStage content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>&quot;Expiry allows you to set an absolute or relative time in which a message expires.
         * Note: This is only valid for the Courier Inbox channel as of 12-08-2022.&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage expiry(Expiry expiry) {
            this.expiry = Optional.of(expiry);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "expiry", nulls = Nulls.SKIP)
        public _FinalStage expiry(Optional<Expiry> expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * <p>Defines the time to wait before delivering the message. You can specify one of the following options. Duration with the number of milliseconds to delay. Until with an ISO 8601 timestamp that specifies when it should be delivered. Until with an OpenStreetMap opening_hours-like format that specifies the <a href="https://www.courier.com/docs/platform/sending/failover/#delivery-window">Delivery Window</a> (e.g., 'Mo-Fr 08:00-18:00pm')</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage delay(Delay delay) {
            this.delay = Optional.of(delay);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "delay", nulls = Nulls.SKIP)
        public _FinalStage delay(Optional<Delay> delay) {
            this.delay = delay;
            return this;
        }

        /**
         * <p>Time in ms to attempt the channel before failing over to the next available channel.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage timeout(Timeout timeout) {
            this.timeout = Optional.of(timeout);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "timeout", nulls = Nulls.SKIP)
        public _FinalStage timeout(Optional<Timeout> timeout) {
            this.timeout = timeout;
            return this;
        }

        @java.lang.Override
        public _FinalStage routing(Routing routing) {
            this.routing = Optional.of(routing);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "routing", nulls = Nulls.SKIP)
        public _FinalStage routing(Optional<Routing> routing) {
            this.routing = routing;
            return this;
        }

        /**
         * <p>An object whose keys are valid provider identifiers which map to an object.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage providers(Map<String, MessageProvidersType> providers) {
            this.providers = Optional.of(providers);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "providers", nulls = Nulls.SKIP)
        public _FinalStage providers(Optional<Map<String, MessageProvidersType>> providers) {
            this.providers = providers;
            return this;
        }

        @java.lang.Override
        public _FinalStage preferences(MessagePreferences preferences) {
            this.preferences = Optional.of(preferences);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "preferences", nulls = Nulls.SKIP)
        public _FinalStage preferences(Optional<MessagePreferences> preferences) {
            this.preferences = preferences;
            return this;
        }

        /**
         * <p>Metadata such as utm tracking attached with the notification through this channel.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage metadata(MessageMetadata metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<MessageMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>Context to load with this recipient. Will override any context set on message.context.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage context(MessageContext context) {
            this.context = Optional.of(context);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "context", nulls = Nulls.SKIP)
        public _FinalStage context(Optional<MessageContext> context) {
            this.context = context;
            return this;
        }

        /**
         * <p>&quot;Define run-time configuration for one or more channels. If you don't specify channels, the default configuration for each channel will be used. Valid ChannelId's are: email, sms, push, inbox, direct_message, banner, and webhook.&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage channels(Map<String, Channel> channels) {
            this.channels = Optional.of(channels);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "channels", nulls = Nulls.SKIP)
        public _FinalStage channels(Optional<Map<String, Channel>> channels) {
            this.channels = channels;
            return this;
        }

        @java.lang.Override
        public _FinalStage brandId(String brandId) {
            this.brandId = Optional.of(brandId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "brand_id", nulls = Nulls.SKIP)
        public _FinalStage brandId(Optional<String> brandId) {
            this.brandId = brandId;
            return this;
        }

        /**
         * <p>An arbitrary object that includes any data you want to pass to the message.
         * The data will populate the corresponding template or elements variables.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage data(Map<String, Object> data) {
            this.data = Optional.of(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Optional<Map<String, Object>> data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        public InboundBulkContentMessage build() {
            return new InboundBulkContentMessage(
                    data,
                    brandId,
                    channels,
                    context,
                    metadata,
                    preferences,
                    providers,
                    routing,
                    timeout,
                    delay,
                    expiry,
                    content,
                    additionalProperties);
        }
    }
}
