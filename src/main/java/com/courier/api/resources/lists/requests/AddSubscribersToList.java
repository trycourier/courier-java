/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.lists.requests;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.lists.types.PutSubscriptionsRecipient;
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
@JsonDeserialize(builder = AddSubscribersToList.Builder.class)
public final class AddSubscribersToList {
    private final List<PutSubscriptionsRecipient> recipients;

    private final Map<String, Object> additionalProperties;

    private AddSubscribersToList(List<PutSubscriptionsRecipient> recipients, Map<String, Object> additionalProperties) {
        this.recipients = recipients;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("recipients")
    public List<PutSubscriptionsRecipient> getRecipients() {
        return recipients;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AddSubscribersToList && equalTo((AddSubscribersToList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AddSubscribersToList other) {
        return recipients.equals(other.recipients);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.recipients);
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
        private List<PutSubscriptionsRecipient> recipients = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AddSubscribersToList other) {
            recipients(other.getRecipients());
            return this;
        }

        @JsonSetter(value = "recipients", nulls = Nulls.SKIP)
        public Builder recipients(List<PutSubscriptionsRecipient> recipients) {
            this.recipients.clear();
            this.recipients.addAll(recipients);
            return this;
        }

        public Builder addRecipients(PutSubscriptionsRecipient recipients) {
            this.recipients.add(recipients);
            return this;
        }

        public Builder addAllRecipients(List<PutSubscriptionsRecipient> recipients) {
            this.recipients.addAll(recipients);
            return this;
        }

        public AddSubscribersToList build() {
            return new AddSubscribersToList(recipients, additionalProperties);
        }
    }
}
