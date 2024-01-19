/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RuleType {
    SNOOZE("snooze"),

    CHANNEL_PREFERENCES("channel_preferences"),

    STATUS("status");

    private final String value;

    RuleType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
